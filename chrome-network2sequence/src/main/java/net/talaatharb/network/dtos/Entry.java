package net.talaatharb.network.dtos;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Entry {
	private ArrayList<Object> aliases;
	@JsonProperty("canonical_names")
	private ArrayList<Object> canonicalNames;
	@JsonProperty("dns_query_type")
	private int dnsQueryType;
	@JsonProperty("endpoint_metadatas")
	private ArrayList<Object> endpointMetadatas;
	private String expiration;
	private int flags;
	@JsonProperty("host_ports")
	private ArrayList<Object> hostPorts;
	@JsonProperty("host_resolver_source")
	private int hostResolverSource;
	private String hostname;
	@JsonProperty("hostname_results")
	private ArrayList<Results> hostnameResults;
	@JsonProperty("ip_endpoints")
	private ArrayList<IpEndpoint> ipEndpoints;
	@JsonProperty("network_anonymization_key")
	private String networkAnonymizationKey;
	@JsonProperty("network_changes")
	private int networkChanges;
	private boolean pinned;
	private int port;
	private String scheme;
	private boolean secure;
	@JsonProperty("text_records")
	private ArrayList<Object> textRecords;
	private int ttl;
}
