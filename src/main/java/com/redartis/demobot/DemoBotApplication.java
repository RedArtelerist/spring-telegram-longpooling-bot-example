package com.redartis.demobot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.telegram.telegrambots.longpolling.TelegramBotsLongPollingApplication;
import org.telegram.telegrambots.longpolling.starter.TelegramBotStarterConfiguration;

@SpringBootApplication
//@Import(TelegramBotStarterConfiguration.class)
public class DemoBotApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoBotApplication.class, args);
	}
}
