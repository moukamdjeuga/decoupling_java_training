package fr.lernejo.guessgame;

import java.security.SecureRandom;

public class Laucher {

    public static void main(String[] arg){
        HumanPlayer players = new HumanPlayer();
        Simulation play =new Simulation(players);

        SecureRandom random = new SecureRandom();
        long randomNumber = random.nextLong(1, 500);

        play.initialize(randomNumber);
        play.loopUntilPlayerSucceed();
    }
}
