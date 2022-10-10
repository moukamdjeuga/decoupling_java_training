package fr.lernejo.guessgame;

import fr.lernejo.logger.LoggerFactory;
import fr.lernejo.logger.Logger;

public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;  //TODO add variable type
    private long numberToGuess; //TODO add variable type

    public Simulation(Player player) {
        this .player = player;
        //TODO implement me
    }

    public void initialize(long numberToGuess) {
        //TODO implement me
        this.numberToGuess = numberToGuess;
    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {
        //TODO implement me
        long numberPlayer = player.askNextGuess();
        System.out.println(numberToGuess);
        if(this.numberToGuess == numberPlayer){
            logger.log("nombre juste !");
            return  true;
        }
        player.respond(numberPlayer > this.numberToGuess);
        return false;
    }


    public void loopUntilPlayerSucceed() {
        while (!nextRound()){
            nextRound();
        //TODO implement me
    }
}


}
