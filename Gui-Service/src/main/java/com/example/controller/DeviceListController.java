package org.example.controller;

import org.example.model.Device;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DeviceListController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DeviceListController.class);
	
	@RequestMapping(value="/device/all", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Device> getDevices() {
		LOGGER.debug("Getting all devices");
		Device device1 = new Device("1", "DV1111", "");
		Device device2 = new Device("2", "DV2222", "");
		Device device3 = new Device("3", "DV3333", "");
		
		List<Device> devices = new ArrayList<>();
		devices.add(device1);
		devices.add(device2);
		devices.add(device3);
		LOGGER.info("The size of the devices is " + devices.size());
		return devices;
	}
	
	@RequestMapping(value="/device/reset",produces=MediaType.APPLICATION_JSON_VALUE)
	public String getResetAll() {
		LOGGER.debug("Reset all the devices");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "OK";
	}

}
