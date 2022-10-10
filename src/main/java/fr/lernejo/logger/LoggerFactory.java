package fr.lernejo.logger;

public class LoggerFactory {

    public static Logger getLogger(String name){
        Logger st =  new ConsoleLogger();
                return st;
    }
}
