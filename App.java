public class App {
    public static void main(String[] args) {
        Logger errorLogger = new ErrorLogger(LogLevel.ERROR);
        Logger fileLogger = new FileLogger(LogLevel.DEBUG);
        Logger consoleLogger = new ConsoleLogger(LogLevel.INFO);

        errorLogger.setLogger(fileLogger);
        fileLogger.setLogger(consoleLogger);

        errorLogger.logMessage(LogLevel.INFO, "This is an information.");
        System.out.println("----------------------------");
        errorLogger.logMessage(LogLevel.DEBUG, "This is a debug information.");
        System.out.println("----------------------------");
        errorLogger.logMessage(LogLevel.ERROR, "This is an error information.");
    }
}
