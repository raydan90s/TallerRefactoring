/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espol.dds.grupo6.rpmgame;

/**
 *
 */
class Player {
    private int wins;

    public Player() {
        this.wins = 0;
    }

    public Choice makeChoice() {
        return Choice.createRandomChoice();
    }

    public void addWin() {
        this.wins++;
    }

    public int getWins() {
        return this.wins;
    }
}