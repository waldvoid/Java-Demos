import javax.xml.crypto.Data;
import java.io.File;

public class Main {
    public static void main(String[] args) {

        // klasik basit yöntem
        EmailLogger emailLogger = new EmailLogger();
        emailLogger.log("Email Log Mesajı");

        DatabaseLogger databaseLogger = new DatabaseLogger();
        databaseLogger.log("This is a database log");

        // bu bir yöntem, hepsini teker teker bastırabilirsin
        BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
        for (BaseLogger logger: loggers) {
            logger.log("Log Mesajı");
        }

        // CustomerManager'dan bir Baselogger cinsinden variable yaratıp polimorfism ile içine girilen şeye göre bastırıyoruz
        CustomerManager customerManager = new CustomerManager(new EmailLogger());
        customerManager.add();
    }
}