/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espol.dds.grupo6.rpmgame;

/**
 *
 */
abstract class Choice {
    public abstract boolean beats(Choice other);
    public abstract String getName();

    public static Choice createRandomChoice() {
        return new ChoiceFactory().createRandom();
    }
}
