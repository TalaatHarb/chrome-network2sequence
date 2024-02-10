package net.talaatharb.network.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class  SecureDnsMode{
	@JsonProperty("Automatic")
	private int automatic;
	@JsonProperty("Off")
	private int off;
	@JsonProperty("Secure")
	private int secure;
}
