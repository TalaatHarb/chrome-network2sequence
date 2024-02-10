package net.talaatharb.network.dtos;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class  SocketPoolInfo{
	@JsonProperty("connecting_socket_count")
	private int connectingSocketCount;
	private Map<String, Object> groups;
	@JsonProperty("handed_out_socket_count")
	private int handedOutSocketCount;
	@JsonProperty("idle_socket_count")
	private int idleSocketCount;
	@JsonProperty("max_socket_count")
	private int maxSocketCount;
	@JsonProperty("max_sockets_per_group")
	private int maxSocketsPerGroup;
	private String name;
	private String type;
}
