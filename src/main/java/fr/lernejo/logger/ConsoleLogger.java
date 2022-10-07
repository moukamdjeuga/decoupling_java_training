package fr.lernejo.logger;

public class ConsoleLogger implements logger{


    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
