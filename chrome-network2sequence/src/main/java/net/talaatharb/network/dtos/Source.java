package net.talaatharb.network.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class  Source{
	private int id;
	@JsonProperty("start_time")
	private String startTime;
	private int type;
}
