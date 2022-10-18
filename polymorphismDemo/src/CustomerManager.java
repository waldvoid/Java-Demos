import javax.xml.crypto.Data;
import java.io.File;

public class CustomerManager {
    private BaseLogger logger;
    // lets create a constructor
    public CustomerManager(BaseLogger logger) {
        this.logger = logger;
    };

    public void add() {
        System.out.println("Email Log is added");
        this.logger.log("log message");
//        This is more dependent way to declare so lets do it like above
//        DatabaseLogger logger = new DatabaseLogger();
//        logger.log();
    }
}
