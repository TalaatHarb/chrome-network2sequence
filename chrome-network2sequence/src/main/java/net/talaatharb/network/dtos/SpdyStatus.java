package net.talaatharb.network.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class  SpdyStatus{
	@JsonProperty("alpn_protos")
	private String alpnProtos;
	@JsonProperty("application_settings")
	private ApplicationSettings applicationSettings;
	@JsonProperty("enable_http2")
	private boolean enableHttp2;
}
