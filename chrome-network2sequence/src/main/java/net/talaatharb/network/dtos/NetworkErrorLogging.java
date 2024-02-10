package net.talaatharb.network.dtos;

import java.util.ArrayList;

import lombok.Data;

@Data
public class  NetworkErrorLogging{
	private ArrayList<OriginPolicy> originPolicies;
}
