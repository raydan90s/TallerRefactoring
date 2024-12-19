package com.espol.dds.grupo6.rpmgame;

public class Main {
    public static void main(String[] args) {
        RockPaperScissorsGame game = new RockPaperScissorsGame();

        while (!game.isGameOver()) {
            game.playRound();
        }

        game.printWinner();
    }
}
