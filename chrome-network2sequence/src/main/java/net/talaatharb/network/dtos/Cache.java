package net.talaatharb.network.dtos;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class  Cache{
	private int capacity;
	private ArrayList<Entry> entries;
	@JsonProperty("network_changes")
	private int networkChanges;
}
