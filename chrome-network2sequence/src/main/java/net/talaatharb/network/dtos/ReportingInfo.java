package net.talaatharb.network.dtos;

import java.util.ArrayList;

import lombok.Data;

@Data
public class  ReportingInfo{
	private ArrayList<Client> clients;
	private NetworkErrorLogging networkErrorLogging;
	private boolean reportingEnabled;
	private ArrayList<Report> reports;
}
