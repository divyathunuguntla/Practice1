package Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jexample {
	public static Logger logger = LogManager.getLogger(Log4jexample.class);

	public static void main(String[] args) {
		
		System.out.println("Sample program for Log4j");
		logger.error("It's an error message");
		logger.info("It's an information message");
		logger.fatal("It's a fatal message");

	}

}


