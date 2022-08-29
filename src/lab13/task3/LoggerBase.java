package lab13.task3;

import java.util.EnumSet;

public abstract class LoggerBase {
    private EnumSet<LogLevel> logLevels;

    public LoggerBase(EnumSet<LogLevel> logLevels) {
        this.logLevels = logLevels;
    }

    public LoggerBase nextLoggerBase;

    public void setNext(LoggerBase loggerBase) {
        nextLoggerBase = loggerBase;
    }

    protected abstract void writeMessage(String message);

    public void message(String message, LogLevel logLevel) {
        if (this.logLevels.contains(logLevel)) {
            writeMessage(message);
        }
        if (nextLoggerBase != null) {
            nextLoggerBase.message(message, logLevel);
        }
    }
}
