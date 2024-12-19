/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.espol.dds.grupo6.rpmgame;

import java.util.Random;


class ChoiceFactory {
    public Choice createRandom() {
        int randomChoice = new Random().nextInt(3);
        switch (randomChoice) {
            case 0: return new Rock();
            case 1: return new Paper();
            case 2: return new Scissors();
            default: throw new IllegalStateException("Unexpected value: " + randomChoice);
        }
    }
}