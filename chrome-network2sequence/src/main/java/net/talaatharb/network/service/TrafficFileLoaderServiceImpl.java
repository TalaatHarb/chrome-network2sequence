package net.talaatharb.network.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.RequiredArgsConstructor;
import net.talaatharb.network.dtos.TrafficFileRoot;

@RequiredArgsConstructor
public class TrafficFileLoaderServiceImpl implements TrafficFileLoaderService {

	private final ObjectMapper objectMapper;

	@Override
	public TrafficFileRoot loadTrafficeFile(File file) throws IOException {
		return parseFileData(Files.readAllBytes(Paths.get(file.getAbsolutePath())));
	}

	@Override
	public TrafficFileRoot parseFileData(byte[] data) throws IOException {
		TrafficFileRoot root = null;
		root = objectMapper.readValue(data, TrafficFileRoot.class);
		return root;
	}

}
