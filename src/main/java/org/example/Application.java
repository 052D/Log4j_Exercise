package org.example;

// https://mrcreamio.wordpress.com/2019/07/06/set-log4j-in-intellij-idea-2019-and-configuration-of-log4j-xml/
// https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.20.0
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class Application {
    private static final Logger logger = LogManager.getLogger();

    private static void logWithDifferentLevels() {
        logger.trace("Entering method doSomething with parameters (param1=5, param2=10)");
        logger.debug("Processing request for user ID 12345");
        logger.info("user with ID '1234' just signed in");
        logger.warn("Potential security vulnerability detected in user input: '...'");
        logger.error("Failed to connect to database: java.sql.SQLException: Connection refused");
    }

    private static void logWithExceptionHandling() {
        try
        {
            // do something here that might throw an exception
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        }
        catch (Exception e)
        {
            logger.error("An exception has been caught.", e);
        }
    }

    public static void main(String[] args) {
        logWithDifferentLevels();
        logWithExceptionHandling();
    }
}
