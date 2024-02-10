package net.talaatharb.network.service;

import java.util.List;

import net.talaatharb.network.dtos.TrafficFileRoot;
import net.talaatharb.network.models.EventModel;

public interface TrafficFileAnalyzerService {

	List<EventModel> analyze(TrafficFileRoot root);
}
