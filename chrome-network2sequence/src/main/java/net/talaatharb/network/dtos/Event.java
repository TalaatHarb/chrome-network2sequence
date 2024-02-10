package net.talaatharb.network.dtos;

import java.util.Map;

import lombok.Data;

@Data
public class  Event{
	private Map<String, Object> params;
	private int phase;
	private Source source;
	private String time;
	private int type;
}
