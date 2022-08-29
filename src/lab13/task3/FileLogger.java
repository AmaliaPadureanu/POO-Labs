package lab13.task3;

import java.util.EnumSet;

public class FileLogger extends LoggerBase {
    private EnumSet<LogLevel> logLevels;

    public FileLogger(EnumSet<LogLevel> logLevels) {
        super(logLevels);
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("[File] " + message);
    }
}
