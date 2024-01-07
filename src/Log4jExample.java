import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jExample {

    private static final Logger LOGGER = LogManager.getLogger(Log4jExample.class);

    public static void main(String[] args) {

        System.out.println("Log4j");
        LOGGER.trace("This is a TRACE message.");
        LOGGER.debug("This is a DEBUG message.");
        LOGGER.info("This is an INFO message.");
        LOGGER.warn("This is a WARN message.");
        LOGGER.error("This is an ERROR message.");
        LOGGER.fatal("This is a FATAL message.");

    }
}
