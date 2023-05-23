package logger;
import java.time.LocalDateTime;

public class SmartLogger implements Logger {

    private int logCounter = 1;

    @Override
    public void log(String msg) {

    }
    @Override
    public void log(String msg, boolean status) {
        String note = (status)? "INFO" : "ERROR";
        System.out.println(note + "#" + logCounter++ + " [" + LocalDateTime.now() + "] <" + msg + ">");
    }

}
