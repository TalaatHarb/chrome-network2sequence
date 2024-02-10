package net.talaatharb.network.dtos;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class  PrerenderInfo{
	private ArrayList<Object> active;
	@JsonProperty("disabled_note")
	private String disabledNote;
	private boolean enabled;
	@JsonProperty("enabled_note")
	private String enabledNote;
	private ArrayList<History> history;
}
