package de.java_ee_e.roboterarm_final;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.RaspiPin;

public class GPIOController {
	
	/**
	 * NON-BCM PINS:
	 * motor1:  4 +  3
	 * motor2:  0 +  2
	 * motor3:  1 + 16
	 * motor4:  7 + 15
	 * motor5:  8 +  9
	 */
	private int sleepTime = 350;
	
	public void setSleepTime(int newSleepTime) {
		this.sleepTime = newSleepTime;
	}
	
	public int getSleepTime() {
		return sleepTime;
	}
	
	public GPIOController() {
		gpio.shutdown();
	}
	
	
	final GpioController gpio = GpioFactory.getInstance();

	final GpioPinDigitalOutput m1_l = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_04);
	final GpioPinDigitalOutput m1_r = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_03);
	
	final GpioPinDigitalOutput m2_r = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_00);
	final GpioPinDigitalOutput m2_h = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_02);
	
	final GpioPinDigitalOutput m3_r = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01);
	final GpioPinDigitalOutput m3_h = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_16);
	
	final GpioPinDigitalOutput m4_r = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_07);
	final GpioPinDigitalOutput m4_h = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_15);
	
	final GpioPinDigitalOutput m5_a = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_08);
	final GpioPinDigitalOutput m5_z = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_09);
	
	public void motor1Rechts() {
		m1_r.pulse(sleepTime, true);
	}
	
	public void motor1Links() {
		m1_l.pulse(sleepTime, true);
	}
	
	public void motor2Hoch() {
		m2_h.pulse(sleepTime, true);
	}
	
	public void motor2Runter() {
		m2_r.pulse(sleepTime, true);
	}
	
	public void motor3Hoch() {
		m3_h.pulse(sleepTime, true);
	}
	
	public void motor3Runter() {
		m3_r.pulse(sleepTime, true);
	}
	
	public void motor4Hoch() {
		m4_h.pulse(sleepTime, true);
	}
	
	public void motor4Runter() {
		m4_r.pulse(sleepTime, true);
	}
	
	public void motor5Auf() {
		m5_a.pulse(sleepTime, true);
	}
	
	public void motor5Zu() {
		m5_z.pulse(sleepTime, true);
	}
}