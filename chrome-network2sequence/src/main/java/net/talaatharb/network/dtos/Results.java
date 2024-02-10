package net.talaatharb.network.dtos;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class  Results{
	private ArrayList<Object> aliases;
	@JsonProperty("canonical_names")
	private ArrayList<Object> canonicalNames;
	@JsonProperty("endpoint_metadatas")
	private ArrayList<Object> endpointMetadatas;
	private String expiration;
	@JsonProperty("host_ports")
	private ArrayList<Object> hostPorts;
	@JsonProperty("hostname_results")
	private ArrayList<Object> hostnameResults;
	@JsonProperty("ip_endpoints")
	private ArrayList<IpEndpoint> ipEndpoints;
	@JsonProperty("text_records")
	private ArrayList<Object> textRecords;
}
