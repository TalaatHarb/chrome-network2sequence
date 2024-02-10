package net.talaatharb.network.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class  IpEndpoint{
	@JsonProperty("endpoint_address")
	private String endpointAddress;
	@JsonProperty("endpoint_port")
	private int endpointPort;
}
