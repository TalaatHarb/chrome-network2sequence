package net.talaatharb.network;

import javafx.application.Application;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Chrome2NetworkSequenceApplication{
	public static void main(String[] args) {
		log.info("UI Application Starting");
		Application.launch(JavafxApplication.class, args);
	}
}