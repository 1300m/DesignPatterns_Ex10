public class FileLogger extends Logger {
    public FileLogger(LogLevel level) {
        super(level);
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("File::Logger: " + message);
    }
}
