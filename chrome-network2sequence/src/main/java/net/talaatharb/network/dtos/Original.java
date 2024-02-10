package net.talaatharb.network.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Original {
	@JsonProperty("auto_detect")
	private boolean autoDetect;

	@JsonProperty("from_system")
	private boolean fromSystem;

	@JsonProperty("pac_url")
	private String pacUrl;
}
