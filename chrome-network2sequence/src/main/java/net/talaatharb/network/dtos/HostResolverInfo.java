package net.talaatharb.network.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class  HostResolverInfo{
	private Cache cache;
	@JsonProperty("dns_config")
	private DnsConfig dnsConfig;
}
