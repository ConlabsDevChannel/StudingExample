package dev.conlabs.sample.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ConfigReader {

	private String path;
	private String configFileName;
	
	private Map<String, String> configMap;
	
	public ConfigReader(String path, String configFileName) {
		this.path = path;
		this.configFileName = configFileName;
		
		if(configMap == null) {
			configMap = new LinkedHashMap<String, String>();
		}
		
		setup();
	}
	
	private void setup() {
		try {
			List<String> lines = Files.readAllLines(Paths.get(path + "/" + configFileName), StandardCharsets.UTF_8);
			
			for(String line: lines) {
				if(line.charAt(0) == '#' || line.length() == 0) {
					continue;
				}
				
				String[] splitted = line.split("=", 2);
				
				String key = splitted[0].trim();
				String value = splitted[1].trim();
				
				if(value.length() == 0) {
					continue;
				}
				
				configMap.put(key, value);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getValue(String key) {
		return configMap.get(key);
	}
	
	public int getIntValue(String key) {
		return Integer.parseInt(configMap.get(key));
	}
	
	public boolean getBooleanValue(String key) {
		return Boolean.parseBoolean(configMap.get(key));
	}
	
}
