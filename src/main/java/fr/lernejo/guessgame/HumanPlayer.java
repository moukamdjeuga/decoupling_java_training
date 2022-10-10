package fr.lernejo.guessgame;

import fr.lernejo.logger.LoggerFactory;
import fr.lernejo.logger.Logger;
import java.util.Scanner;


public class HumanPlayer implements Player  {

    private Logger logger = LoggerFactory.getLogger("player");
    Scanner scanner =new Scanner( System.in );

    @Override
    public long askNextGuess() {
        System.out.print( "Inserer un nombre : " );
        long a = scanner.nextLong();
        return a;
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if (lowerOrGreater == true){
            System.out.print( "Moins grand " );
        } else {
            System.out.print( "Plus petit " );
        }



    }
}
