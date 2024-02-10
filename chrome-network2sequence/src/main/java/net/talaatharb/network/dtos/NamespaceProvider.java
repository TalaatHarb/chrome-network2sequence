package net.talaatharb.network.dtos;

import lombok.Data;

@Data
public class  NamespaceProvider{
	private boolean active;
	private String name;
	private int type;
	private int version;
}
