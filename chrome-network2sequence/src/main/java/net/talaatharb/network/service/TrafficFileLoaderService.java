package net.talaatharb.network.service;

import java.io.File;
import java.io.IOException;

import net.talaatharb.network.dtos.TrafficFileRoot;

public interface TrafficFileLoaderService {
	TrafficFileRoot loadTrafficeFile(File file) throws IOException;

	TrafficFileRoot parseFileData(byte[] data) throws IOException;
}
