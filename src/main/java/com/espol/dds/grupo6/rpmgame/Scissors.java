/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espol.dds.grupo6.rpmgame;

/**
 *
 */
class Scissors extends Choice {
    public boolean beats(Choice other) {
        return other instanceof Paper;
    }

    public String getName() {
        return "scissors";
    }
}