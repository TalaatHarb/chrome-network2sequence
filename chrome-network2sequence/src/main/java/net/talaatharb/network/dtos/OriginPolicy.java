package net.talaatharb.network.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class  OriginPolicy{
	@JsonProperty("NetworkAnonymizationKey")
	private String networkAnonymizationKey;
	private String expires;
	private double failureFraction;
	private boolean includeSubdomains;
	private String origin;
	private String reportTo;
	private double successFraction;
}
