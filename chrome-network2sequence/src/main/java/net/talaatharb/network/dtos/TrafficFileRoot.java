package net.talaatharb.network.dtos;

import java.util.ArrayList;

import lombok.Data;

@Data
public class TrafficFileRoot {
	private Constants constants;
	private ArrayList<Event> events;
	private PolledData polledData;
}
