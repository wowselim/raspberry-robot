package de.java_ee_e.roboterarm_final;

import java.util.ArrayList;
import java.util.List;

public class Macro {
	private List<String> commands = new ArrayList<>();
	private final static GPIOController gpio = new GPIOController();
	private String name;
	
	public Macro(String name) {
		this(name, gpio.getSleepTime());
	}
	
	public Macro(String name, int sleepTime) {
		setName(name);
		gpio.setSleepTime(sleepTime);
	}
	
	public void recordCommand(String cmd) {
		commands.add(cmd);
	}
	
	public void runCommands() {
		for(String cmd : commands) {
			switch(cmd) {
			case "m1r":
				gpio.motor1Rechts();
				break;
			case "m1l":
				gpio.motor1Links();
				break;
			case "m2h":
				gpio.motor2Hoch();
				break;
			case "m2r":
				gpio.motor2Runter();
				break;
			case "m3h":
				gpio.motor3Hoch();
				break;
			case "m3r":
				gpio.motor3Runter();
				break;
			case "m4h":
				gpio.motor4Hoch();
				break;
			case "m4r":
				gpio.motor4Runter();
				break;
			case "m5a":
				gpio.motor5Auf();
				break;
			case "m5z":
				gpio.motor5Zu();
				break;
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
