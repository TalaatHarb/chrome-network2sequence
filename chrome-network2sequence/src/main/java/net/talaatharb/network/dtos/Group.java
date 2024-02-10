package net.talaatharb.network.dtos;

import java.util.ArrayList;

import lombok.Data;

@Data
public class  Group {
	private ArrayList<Endpoint> endpoints;
	private String expires;
	private boolean includeSubdomains;
	private String name;
}
