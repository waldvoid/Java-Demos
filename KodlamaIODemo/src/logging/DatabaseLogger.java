package logging;

public class DatabaseLogger implements Logger {
    @Override
    public void log(String logData) {
        System.out.println(logData + ": Log Mesajı Veritabanına Loglandı");
    }
}