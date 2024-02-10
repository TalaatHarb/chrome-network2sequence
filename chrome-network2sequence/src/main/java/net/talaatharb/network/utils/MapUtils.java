package net.talaatharb.network.utils;

import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapUtils {
	private MapUtils() {
	}

	public static final <K, V> Map<V, K> invertedMap(Map<K, V> original) {
		return original.entrySet().stream().collect(Collectors.toMap(Entry::getValue, Entry::getKey));
	}

}
