package net.talaatharb.network.dtos;

import lombok.Data;

@Data
public class  ExtensionInfo{
	private String description;
	private String detailsUrl;
	private boolean enabled;
	private String homepageUrl;
	private String id;
	private boolean kioskEnabled;
	private boolean kioskOnly;
	private String name;
	private boolean offlineEnabled;
	private String optionsUrl;
	private boolean packagedApp;
	private String version;
}
