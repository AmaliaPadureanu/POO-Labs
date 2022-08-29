package lab13.task3;

import java.util.EnumSet;

public class EmailLogger extends LoggerBase {
    private EnumSet<LogLevel> logLevels;

    public EmailLogger(EnumSet<LogLevel> logLevels) {
        super(logLevels);
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("[Email] " + message);
    }
}
