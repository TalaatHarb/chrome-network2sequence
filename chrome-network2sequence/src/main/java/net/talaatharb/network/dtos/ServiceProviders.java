package net.talaatharb.network.dtos;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class  ServiceProviders{
	@JsonProperty("namespace_providers")
	private ArrayList<NamespaceProvider> namespaceProviders;
	@JsonProperty("service_providers")
	private ArrayList<ServiceProvider> serviceProvidersList;
}
