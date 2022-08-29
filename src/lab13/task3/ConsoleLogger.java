package lab13.task3;

import java.util.EnumSet;

public class ConsoleLogger extends LoggerBase {
    private EnumSet<LogLevel> logLevels;

    public ConsoleLogger(EnumSet<LogLevel> logLevels) {
        super(logLevels);
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("[Console] " + message);
    }
}
