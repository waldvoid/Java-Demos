package logging;

public class FileLogger implements Logger{
    @Override
    public void log(String logData) {
        System.out.println(logData + ": Log Mesajı Dosyaya Loglandı");

    }
}
