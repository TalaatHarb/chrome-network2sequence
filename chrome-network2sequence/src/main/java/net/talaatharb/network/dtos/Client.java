package net.talaatharb.network.dtos;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class  Client{
	private ArrayList<Group> groups;
	@JsonProperty("network_anonymization_key")
	private String networkAnonymizationKey;
	private String origin;
}
