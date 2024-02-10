package net.talaatharb.network.dtos;

import lombok.Data;

@Data
public class  Endpoint{
	private Failed failed;
	private int priority;
	private Successful successful;
	private String url;
	private int weight;
}
