package net.talaatharb.network.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class  Effective{
	@JsonProperty("pac_url")
	private String pacUrl;
}
