package net.talaatharb.network.config;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import net.talaatharb.network.service.TrafficFileAnalyzerService;
import net.talaatharb.network.service.TrafficFileAnalyzerServiceImpl;
import net.talaatharb.network.service.TrafficFileLoaderService;
import net.talaatharb.network.service.TrafficFileLoaderServiceImpl;

public class HelperBeans {

	private HelperBeans() {

	}

	public static final ObjectMapper buildJsonObjectMapper() {
		return JsonMapper.builder().enable(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS) // ignore case
				.enable(SerializationFeature.INDENT_OUTPUT) // pretty format for json
				.addModule(new JavaTimeModule()) // time module
				.build();
	}

	public static final TrafficFileLoaderService buildTrafficFileLoader(ObjectMapper objectMapper) {
		return new TrafficFileLoaderServiceImpl(objectMapper);
	}

	public static final TrafficFileAnalyzerService buildTrafficFileAnalizer() {
		return new TrafficFileAnalyzerServiceImpl();
	}

}
