package pkg;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        final Level VIOLATION = Level.forName("VIOLATION", 150); // szint a Húsvéti szabályok megsértésének naplózásához
        final Level REQUEST = Level.forName("REQUEST", 350); // szint kérelmek naplózásához

        int n=1;
        if(args.length!=0){n=Integer.parseInt(args[0]);}

        for (int i = 0; i < n; i++) {
            logger.log(VIOLATION,"Védőmaszkban jár a nyuszi,");
            logger.log(VIOLATION,"locsolásért nem jár puszi!");
            logger.info("Itt maradok a szobámban,");
            logger.log(REQUEST, "meglocsollak távmunkában!");

            try {
                Thread.sleep(10); // egy kis késleltetés
            } catch (InterruptedException e) {}

        }
    }
}
