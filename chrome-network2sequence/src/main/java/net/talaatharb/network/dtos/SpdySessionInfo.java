package net.talaatharb.network.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class  SpdySessionInfo{
	@JsonProperty("active_streams")
	private int activeStreams;
	private int error;
	@JsonProperty("frames_received")
	private int framesReceived;
	@JsonProperty("host_port_pair")
	private String hostPortPair;
	@JsonProperty("max_concurrent_streams")
	private int maxConcurrentStreams;
	@JsonProperty("negotiated_protocol")
	private String negotiatedProtocol;
	@JsonProperty("network_anonymization_key")
	private String networkAnonymizationKey;
	private String proxy;
	@JsonProperty("recv_window_size")
	private int recvWindowSize;
	@JsonProperty("send_window_size")
	private int sendWindowSize;
	@JsonProperty("source_id")
	private int sourceId;
	@JsonProperty("streams_abandoned_count")
	private int streamsAbandonedCount;
	@JsonProperty("streams_initiated_count")
	private int streamsInitiatedCount;
	@JsonProperty("unacked_recv_window_bytes")
	private int unackedRecvWindowBytes;
}
