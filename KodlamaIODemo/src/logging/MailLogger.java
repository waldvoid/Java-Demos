package logging;

public class MailLogger implements Logger {
    @Override
    public void log(String logData) {
        System.out.println(logData + ": Log Mesajı Maille Loglandı");
    }
}
