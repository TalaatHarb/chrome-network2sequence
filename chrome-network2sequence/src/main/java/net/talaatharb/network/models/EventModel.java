package net.talaatharb.network.models;

import lombok.Data;
import net.talaatharb.network.dtos.Event;

@Data
public class EventModel {

	private Event event;

	private Long time;
	private String type;
	private Integer sourceId;
	private String sourceUrl;
	private String phase;
	private String actorString;
}
