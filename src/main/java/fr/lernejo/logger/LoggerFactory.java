package fr.lernejo.logger;

public class LoggerFactory {

    public static logger  getLogger(String name){
        logger st =  new ConsoleLogger();
                return st;
    }
}
