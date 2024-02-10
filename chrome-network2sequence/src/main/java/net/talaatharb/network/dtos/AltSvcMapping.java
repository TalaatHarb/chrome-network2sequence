package net.talaatharb.network.dtos;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AltSvcMapping {
	@JsonProperty("alternative_service")
	private ArrayList<String> alternativeService;
	@JsonProperty("network_anonymization_key")
	private String networkAnonymizationKey;
	private String server;
}
