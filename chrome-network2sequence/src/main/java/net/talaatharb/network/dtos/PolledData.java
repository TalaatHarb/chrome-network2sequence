package net.talaatharb.network.dtos;

import java.util.ArrayList;

import lombok.Data;

@Data
public class  PolledData{
	private ArrayList<String> activeFieldTrialGroups;
	private ArrayList<AltSvcMapping> altSvcMappings;
	private ArrayList<Object> badProxies;
	private ArrayList<String> dohProvidersDisabledDueToFeature;
	private ArrayList<ExtensionInfo> extensionInfo;
	private HostResolverInfo hostResolverInfo;
	private HttpCacheInfo httpCacheInfo;
	private PrerenderInfo prerenderInfo;
	private ProxySettings proxySettings;
	private QuicInfo quicInfo;
	private ReportingInfo reportingInfo;
	private ServiceProviders serviceProviders;
	private ArrayList<SocketPoolInfo> socketPoolInfo;
	private ArrayList<SpdySessionInfo> spdySessionInfo;
	private SpdyStatus spdyStatus;
}
