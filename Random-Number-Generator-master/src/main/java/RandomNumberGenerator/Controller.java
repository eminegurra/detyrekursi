package RandomNumberGenerator;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

@RestController
public class Controller {

    private static final Logger logger = Logger.getLogger(Controller.class.getName());

    public Controller() {
        try {
            // Configure logging to append to a file
            FileHandler fileHandler = new FileHandler("myapp.log", true);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
            logger.addHandler(fileHandler);
        } catch (Exception e) {
            logger.severe("Error configuring logging: " + e.getMessage());
        }
    }

    @GetMapping("/generate")
    public ResponseEntity<Integer> generateRandomNumber() {
        logger.info("Generating random number...");
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
        logger.info("Generated random number: " + randomNumber);
        return ResponseEntity.ok(randomNumber);
    }
}
