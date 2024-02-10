package net.talaatharb.network.dtos;

import java.util.ArrayList;
import java.util.Map;

import lombok.Data;

@Data
public class Constants {
	private ArrayList<String> activeFieldTrialGroups;
	private Map<String, Integer> addressFamily;
	private CertPathBuilderDigestPolicy certPathBuilderDigestPolicy;
	private Map<String, Integer> certStatusFlag;
	private Map<String, Integer> certVerifierFlags;
	private Map<String, Integer> certVerifyFlags;
	private ClientInfo clientInfo;
	private Map<String, Integer> dnsQueryType;
	private Map<String, Integer> loadFlag;
	private Map<String, Integer> loadState;
	private String logCaptureMode;
	private Map<String, Integer> logEventPhase;
	private Map<String, Integer> logEventTypes;
	private int logFormatVersion;
	private Map<String, Integer> logSourceType;
	private Map<String, Integer> netError;
	private Map<String, Integer> quicError;
	private Map<String, Integer> quicRstStreamError;
	private SecureDnsMode secureDnsMode;
	private long timeTickOffset;
}
