package de.java_ee_e.roboterarm_final;

import javax.servlet.annotation.WebServlet;

import de.java_ee_e.roboterarm_final.GPIOController;

import com.vaadin.annotations.PreserveOnRefresh;
//import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
//@Theme("roboterarm_final")
@PreserveOnRefresh
public class WebUI extends UI {
	
	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = true, ui = WebUI.class)
	public static class Servlet extends VaadinServlet {
	}

	private final static GPIOController roboter = new GPIOController();
	

	@Override
	protected void init(VaadinRequest request) {
		setSizeFull();
		final VerticalLayout main = new VerticalLayout();
		main.setSizeFull();
		main.setMargin(true);
		
		final GridLayout buttons = new GridLayout(6, 3);
		buttons.setMargin(true);
		buttons.setSizeFull();
		main.addComponent(buttons);
		
		final TextArea status = new TextArea();
		status.setSizeFull();
		status.setReadOnly(true);
		main.addComponent(status);
		
		setContent(main);
		
		Button motor1Rechts = new Button("Rechts");
		Button motor2Hoch = new Button("Hoch");
		Button motor3Hoch = new Button("Hoch");
		Button motor4Hoch = new Button("Hoch");
		Button motor5Auf = new Button("Auf");
		
		Button motor1Links = new Button("Links");
		Button motor2Runter = new Button("Runter");
		Button motor3Runter = new Button("Runter");
		Button motor4Runter = new Button("Runter");
		Button motor5Zu = new Button("Zu");
		
		Label motor1Label = new Label("Motor 1");
		Label motor2Label = new Label("Motor 2");
		Label motor3Label = new Label("Motor 3");
		Label motor4Label = new Label("Motor 4");
		Label motor5Label = new Label("Motor 5");
		
		buttons.addComponent(motor1Rechts,0,0);
		//buttons.setComponentAlignment(motor1Rechts, Alignment.MIDDLE_CENTER);
		buttons.addComponent(motor2Hoch,1,0);
		//buttons.setComponentAlignment(motor2Hoch, Alignment.MIDDLE_CENTER);
		buttons.addComponent(motor3Hoch,2,0);
		//buttons.setComponentAlignment(motor3Hoch, Alignment.MIDDLE_CENTER);
		buttons.addComponent(motor4Hoch,3,0);
		//buttons.setComponentAlignment(motor4Hoch, Alignment.MIDDLE_CENTER);
		buttons.addComponent(motor5Auf,4,0);
		//buttons.setComponentAlignment(motor5Auf, Alignment.MIDDLE_CENTER);
		
		buttons.addComponent(motor1Label,0,1);
		//buttons.setComponentAlignment(motor1Label, Alignment.MIDDLE_CENTER);
		buttons.addComponent(motor2Label,1,1);
		//buttons.setComponentAlignment(motor2Label, Alignment.MIDDLE_CENTER);
		buttons.addComponent(motor3Label,2,1);
		//buttons.setComponentAlignment(motor3Label, Alignment.MIDDLE_CENTER);
		buttons.addComponent(motor4Label,3,1);
		//buttons.setComponentAlignment(motor4Label, Alignment.MIDDLE_CENTER);
		buttons.addComponent(motor5Label,4,1);
		//buttons.setComponentAlignment(motor5Label, Alignment.MIDDLE_CENTER);
		
		buttons.addComponent(motor1Links,0,2);
		//buttons.setComponentAlignment(motor1Links, Alignment.MIDDLE_CENTER);
		buttons.addComponent(motor2Runter,1,2);
		//buttons.setComponentAlignment(motor2Runter, Alignment.MIDDLE_CENTER);
		buttons.addComponent(motor3Runter,2,2);
		//buttons.setComponentAlignment(motor3Runter, Alignment.MIDDLE_CENTER);
		buttons.addComponent(motor4Runter,3,2);
		//buttons.setComponentAlignment(motor4Runter, Alignment.MIDDLE_CENTER);
		buttons.addComponent(motor5Zu,4,2);
		//buttons.setComponentAlignment(motor5Zu, Alignment.MIDDLE_CENTER);

		
		motor1Rechts.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				status.setReadOnly(false);
				roboter.motor1Rechts();
				status.setValue(status.getValue() + "Motor 1 rechts\n");
				status.setReadOnly(true);
			}
		});
		
		motor1Links.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				status.setReadOnly(false);
				roboter.motor1Links();
				status.setValue(status.getValue() + "Motor 1 links\n");
				status.setReadOnly(true);
			}
		});
		
		motor2Hoch.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				status.setReadOnly(false);
				roboter.motor2Hoch();
				status.setValue(status.getValue() + "Motor 2 hoch\n");
				status.setReadOnly(true);
			}
		});
		
		motor2Runter.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				status.setReadOnly(false);
				roboter.motor2Runter();
				status.setValue(status.getValue() + "Motor 2 runter\n");
				status.setReadOnly(true);
			}
		});
		
		motor3Hoch.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				status.setReadOnly(false);
				roboter.motor3Hoch();
				status.setValue(status.getValue() + "Motor 3 hoch\n");
				status.setReadOnly(true);
			}
		});
		
		motor3Runter.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				status.setReadOnly(false);
				roboter.motor3Runter();
				status.setValue(status.getValue() + "Motor 3 runter\n");
				status.setReadOnly(true);
			}
		});
		
		motor4Hoch.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				status.setReadOnly(false);
				roboter.motor4Hoch();
				status.setValue(status.getValue() + "Motor 4 hoch\n");
				status.setReadOnly(true);
			}
		});
		
		motor4Runter.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				status.setReadOnly(false);
				roboter.motor4Runter();
				status.setValue(status.getValue() + "Motor 4 runter\n");
				status.setReadOnly(true);
			}
		});
		
		motor5Auf.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				status.setReadOnly(false);
				roboter.motor5Auf();
				status.setValue(status.getValue() + "Motor 1 auf\n");
				status.setReadOnly(true);
			}
		});
		
		motor5Zu.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				status.setReadOnly(false);
				roboter.motor5Zu();
				status.setValue(status.getValue() + "Motor 1 zu\n");
				status.setReadOnly(true);
			}
		});
		
	}
}
