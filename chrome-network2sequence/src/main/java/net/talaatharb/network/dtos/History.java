package net.talaatharb.network.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class  History{
	@JsonProperty("end_time")
	private String endTime;
	@JsonProperty("final_status")
	private String finalStatus;
	private String origin;
	private String url;
}
