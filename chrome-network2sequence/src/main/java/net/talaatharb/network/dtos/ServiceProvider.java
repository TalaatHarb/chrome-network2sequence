package net.talaatharb.network.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class  ServiceProvider{
	@JsonProperty("chain_length")
	private int chainLength;
	private String name;
	private String path;
	@JsonProperty("socket_protocol")
	private int socketProtocol;
	@JsonProperty("socket_type")
	private int socketType;
	private int version;
}
