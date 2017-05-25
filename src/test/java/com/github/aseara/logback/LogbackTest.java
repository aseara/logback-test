package com.github.aseara.logback;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by qiujingde on 2017/2/20.
 * logback简单示例
 */
public class LogbackTest {

    private static final Logger logger = LoggerFactory.getLogger(LogbackTest.class);

    @Test
    public void log() {
        logger.trace("trace");
        logger.debug("debug str");
        logger.info("info str");
        logger.warn("warn");
        logger.error("error");

        if(logger.isDebugEnabled()) {
            logger.debug("record a bug info: This is a bug");
        }

        logger.debug("record another bug info: {}", "This is a bug");

    }

}
