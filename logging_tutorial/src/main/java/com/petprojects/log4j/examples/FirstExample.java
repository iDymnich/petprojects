package com.petprojects.log4j.examples;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

/**
 * Created by Gary on 11.06.2014.
 */
public class FirstExample {

    private static final Logger logger = Logger.getLogger(FirstExample.class);

    public static void main(String[] args) {
        if (logger.isInfoEnabled()) {
            logger.info("My first message");
        }
    }
}
