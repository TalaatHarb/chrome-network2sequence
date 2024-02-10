package net.talaatharb.network.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class  ClientInfo{
	private String cl;
	@JsonProperty("command_line")
	private String commandLine;
	private String name;
	private String official;
	@JsonProperty("os_type")
	private String osType;
	private String version;
	@JsonProperty("version_mod")
	private String versionMod;
}
