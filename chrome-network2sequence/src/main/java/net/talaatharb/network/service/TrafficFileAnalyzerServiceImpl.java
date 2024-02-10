package net.talaatharb.network.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.RequiredArgsConstructor;
import net.talaatharb.network.dtos.Constants;
import net.talaatharb.network.dtos.Event;
import net.talaatharb.network.dtos.PolledData;
import net.talaatharb.network.dtos.TrafficFileRoot;
import net.talaatharb.network.models.EventModel;
import net.talaatharb.network.utils.MapUtils;

@RequiredArgsConstructor
public class TrafficFileAnalyzerServiceImpl implements TrafficFileAnalyzerService {

	private TrafficFileRoot root;
	private Map<Integer, String> logEventTypesLookup;
	private Map<Integer, String> logSourceTypeLookup;
	private Map<Integer, String> netErrorLookup;
	private Constants constants;
	private List<Event> events;

	private List<EventModel> eventModels;
	private PolledData polledData;
	private Map<Integer, String> quicErrorLookup;
	private Map<Integer, String> quicRstStreamErrorLookup;
	private Map<Integer, String> loadStateLookup;
	private Map<Integer, String> loadFlagLookup;
	private Map<Integer, String> dnsQueryTypeLookup;
	private Map<Integer, String> sourceUrlLookup = new HashMap<>();
	private Map<Integer, String> logEventPhaseLookup;

	@Override
	public List<EventModel> analyze(TrafficFileRoot root) {
		this.root = root;
		constants = root.getConstants();
		events = root.getEvents();
		polledData = root.getPolledData();

		// Create lookups
		logEventTypesLookup = MapUtils.invertedMap(constants.getLogEventTypes());
		logSourceTypeLookup = MapUtils.invertedMap(constants.getLogSourceType());
		netErrorLookup = MapUtils.invertedMap(constants.getNetError());
		quicErrorLookup = MapUtils.invertedMap(constants.getQuicError());
		quicRstStreamErrorLookup = MapUtils.invertedMap(constants.getQuicRstStreamError());
		loadStateLookup = MapUtils.invertedMap(constants.getLoadState());
		loadFlagLookup = MapUtils.invertedMap(constants.getLoadFlag());
		dnsQueryTypeLookup = MapUtils.invertedMap(constants.getDnsQueryType());
		logEventPhaseLookup = MapUtils.invertedMap(constants.getLogEventPhase());

		eventModels = events.stream().map(this::mapEvent).toList();

		return eventModels;
	}

	private EventModel mapEvent(Event event) {
		final EventModel model = new EventModel();

		model.setEvent(event);
		model.setSourceId(event.getSource().getId());
		model.setType(logEventTypesLookup.get(event.getType()));
		model.setTime(Long.parseLong(event.getTime()));
		model.setPhase(logEventPhaseLookup.get(event.getPhase()));

		String sourceUrl = sourceUrlLookup.get(model.getSourceId());
		if (sourceUrl == null && event.getParams() != null) {
			sourceUrl = (String) event.getParams().get("url");
			sourceUrlLookup.put(model.getSourceId(), sourceUrl);
		}
		model.setSourceUrl(sourceUrl);
		model.setActorString(sourceUrl);

		return model;
	}

}
