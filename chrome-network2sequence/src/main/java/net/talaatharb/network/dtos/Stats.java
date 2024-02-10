package net.talaatharb.network.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class  Stats {
	@JsonProperty("Cache type")
	private String cacheType;
	@JsonProperty("Create error")
	private String createError;
	@JsonProperty("Create hit")
	private String createHit;
	@JsonProperty("Create miss")
	private String createMiss;
	@JsonProperty("Current size")
	private String currentSize;
	@JsonProperty("Doom cache")
	private String doomCache;
	@JsonProperty("Doom entry")
	private String doomEntry;
	@JsonProperty("Doom recent entries")
	private String doomRecentEntries;
	@JsonProperty("Entries")
	private String entries;
	@JsonProperty("Fatal error")
	private String fatalError;
	@JsonProperty("Get rankings")
	private String getRankings;
	@JsonProperty("Invalid entry")
	private String invalidEntry;
	@JsonProperty("Last report")
	private String lastReport;
	@JsonProperty("Last report timer")
	private String lastReportTimer;
	@JsonProperty("Max entries")
	private String maxEntries;
	@JsonProperty("Max size")
	private String maxSize;
	@JsonProperty("Open entries")
	private String openEntries;
	@JsonProperty("Open hit")
	private String openHit;
	@JsonProperty("Open miss")
	private String openMiss;
	@JsonProperty("Open rankings")
	private String openRankings;
	@JsonProperty("Pending IO")
	private String pendingIO;
	@JsonProperty("Read data")
	private String readData;
	@JsonProperty("Resurrect hit")
	private String resurrectHit;
	@JsonProperty("Size00")
	private String size00;
	@JsonProperty("Size01")
	private String size01;
	@JsonProperty("Size02")
	private String size02;
	@JsonProperty("Size03")
	private String size03;
	@JsonProperty("Size04")
	private String size04;
	@JsonProperty("Size05")
	private String size05;
	@JsonProperty("Size06")
	private String size06;
	@JsonProperty("Size07")
	private String size07;
	@JsonProperty("Size08")
	private String size08;
	@JsonProperty("Size09")
	private String size09;
	@JsonProperty("Size10")
	private String size10;
	@JsonProperty("Size11")
	private String size11;
	@JsonProperty("Size12")
	private String size12;
	@JsonProperty("Size13")
	private String size13;
	@JsonProperty("Size14")
	private String size14;
	@JsonProperty("Size15")
	private String size15;
	@JsonProperty("Size16")
	private String size16;
	@JsonProperty("Size17")
	private String size17;
	@JsonProperty("Size18")
	private String size18;
	@JsonProperty("Size19")
	private String size19;
	@JsonProperty("Size20")
	private String size20;
	@JsonProperty("Size21")
	private String size21;
	@JsonProperty("Size22")
	private String size22;
	@JsonProperty("Size23")
	private String size23;
	@JsonProperty("Size24")
	private String size24;
	@JsonProperty("Size25")
	private String size25;
	@JsonProperty("Size26")
	private String size26;
	@JsonProperty("Size27")
	private String size27;
	@JsonProperty("Timer")
	private String timer;
	@JsonProperty("Trim entry")
	private String trimEntry;
	@JsonProperty("Write data")
	private String writeData;
	private String unused;
}
