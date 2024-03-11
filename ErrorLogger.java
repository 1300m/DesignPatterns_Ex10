public class ErrorLogger extends Logger {
    public ErrorLogger(LogLevel level) {
        super(level);
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
