package net.talaatharb.network.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class  Report{
	private int attempts;
	private Body body;
	private int depth;
	private String group;
	@JsonProperty("network_anonymization_key")
	private String networkAnonymizationKey;
	private String queued;
	private String status;
	private String type;
	private String url;
}
