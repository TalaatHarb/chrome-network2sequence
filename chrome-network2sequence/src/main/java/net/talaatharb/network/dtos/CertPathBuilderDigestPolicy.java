package net.talaatharb.network.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class  CertPathBuilderDigestPolicy{
	@JsonProperty("kStrong")
	private int kStrong;
	@JsonProperty("kWeakAllowSha1")
	private int kWeakAllowSha1;
}
