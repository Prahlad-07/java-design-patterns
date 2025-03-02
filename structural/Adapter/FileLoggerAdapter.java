package com.codencode;

public class FileLoggerAdapter implements Logger {
    private final FileLogger fileLogger;

    public FileLoggerAdapter(FileLogger fileLogger) {
        this.fileLogger = fileLogger;
    }

    @Override
    public void log(String message) {
        fileLogger.writeToFile(message);
    }
}
