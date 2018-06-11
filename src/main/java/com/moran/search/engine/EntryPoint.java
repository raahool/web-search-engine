/**
 * 
 */
package com.moran.search.engine;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author rahmohan
 *
 */
@SpringBootApplication
public class EntryPoint {
	private static final Logger logger = LoggerFactory.getLogger(EntryPoint.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			SpringApplication.run(EntryPoint.class, args);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
	}

}
