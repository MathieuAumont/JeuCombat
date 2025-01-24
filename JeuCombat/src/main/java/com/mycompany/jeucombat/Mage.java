/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jeucombat;

/**
 *
 * @author mathi
 */
public class Mage extends Personnage {
    public Mage() {
        name = "Mage";
        ptDeVie = 40;
        type = "Mage";
        arme = "Spell";
        dégat = 15;
    }
    @Override
    public void Attack(Joueur ennemi){
        ennemi.role.ptDeVie -= dégat;
        System.out.println(name + " a afflige " + dégat + " a " + ennemi.role.name + "\n");
    }
}
