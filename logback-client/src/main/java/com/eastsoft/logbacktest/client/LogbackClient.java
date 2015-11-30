package com.eastsoft.logbacktest.client;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackClient {

	public static final Logger LOGGER = LoggerFactory
			.getLogger(LogbackClient.class);

	public static void main(String[] args) {
		LOGGER.trace("++++++++++start++++++++++");

		System.out.println("«Î ‰»Î£∫");
		Scanner scanner = new Scanner(System.in);
		String str="";
		while (!"n".equalsIgnoreCase(str=scanner.next())) {
			LOGGER.trace("----------------------------------------");
			LOGGER.trace("++++++++trace+++++++");
			LOGGER.debug("+++++++debug++++++++");
			LOGGER.info("++++++++++info++++++++++++");
			LOGGER.warn("+++++++++++warn+++++++++++++");
			LOGGER.error("+++++++++++error++++++++++++++++");
			LOGGER.trace("------------------{}----------------------",str);
			System.out.println("«Î ‰»Î£∫");

		}
		LOGGER.trace("++++++++++++end+++++++++++++++");

	}

}
