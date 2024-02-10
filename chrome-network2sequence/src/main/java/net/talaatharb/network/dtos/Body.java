package net.talaatharb.network.dtos;

import lombok.Data;

@Data
public class  Body{
	private int columnNumber;
	private String id;
	private int lineNumber;
	private String message;
	private String sourceFile;
	private String disposition;
	private String policyId;
}
