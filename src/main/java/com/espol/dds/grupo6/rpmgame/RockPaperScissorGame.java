package com.espol.dds.grupo6.rpmgame;

class RockPaperScissorsGame {
    private Player player1;
    private Player player2;
    private int draws;
    private int roundsPlayed;
    private static final int WIN_CONDITION = 3;

    public RockPaperScissorsGame() {
        this.player1 = new Player();
        this.player2 = new Player();
        this.draws = 0;
        this.roundsPlayed = 0;
    }

    public void playRound() {
        roundsPlayed++;
        Choice p1Choice = player1.makeChoice();
        Choice p2Choice = player2.makeChoice();

        System.out.println(getRoundSummary(p1Choice, p2Choice));

        if (p1Choice.beats(p2Choice)) {
            player1.addWin();
        } else if (p2Choice.beats(p1Choice)) {
            player2.addWin();
        } else {
            draws++;
        }

        printScores();
    }

    private String getRoundSummary(Choice p1Choice, Choice p2Choice) {
        return String.format("Round %d\nPlayer 1 chooses: %s\nPlayer 2 chooses: %s", 
                             roundsPlayed, p1Choice.getName(), p2Choice.getName());
    }

    private void printScores() {
        System.out.printf("Player 1 total wins: %d\nPlayer 2 total wins: %d\nTotal draws: %d\n", 
                          player1.getWins(), player2.getWins(), draws);
    }

    public boolean isGameOver() {
        boolean hasWinner = player1.getWins() >= WIN_CONDITION || player2.getWins() >= WIN_CONDITION;
        return hasWinner;
    }

    public void printWinner() {
        boolean isPlayer1Winner = player1.getWins() > player2.getWins();
        if (isPlayer1Winner) {
            System.out.println("Player 1 wins the game!");
        } else {
            System.out.println("Player 2 wins the game!");
        }
    }
}
