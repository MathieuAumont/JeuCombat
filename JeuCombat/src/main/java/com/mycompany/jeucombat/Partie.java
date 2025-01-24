/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jeucombat;
import java.util.Random;
/**
 *
 * @author mathi
 */
public class Partie {
    
    Joueur[] personnage;
    Joueur joueurcourant;
    Tour tourEnCours;
    int numeroJoueur;
    int ennemie;
    Boolean findepartie;
    
    
    public Partie(int nbJoueur){
        personnage = new Joueur[nbJoueur];
        for(int i = 0; i < nbJoueur;i++)
        {
            personnage[i] = new Joueur();
            System.out.println("Joueur" + (i+1) + " = " + personnage[i].role.name);
        }
        joueurcourant = personnage[0];
        numeroJoueur = 0;
        
    }
    
    public void CommencerNouvellePartie(){
       
         
        
           
        do {
           ChangerEnnemie();
           joueurcourant.role.Attack(personnage[ennemie]);
           
           AfficherEtatJoueur();
           findepartie = FinPartie();
           
           ProchainJoueur();
           
        }while(!findepartie);
    }
    
    public void ProchainJoueur(){
        if(joueurcourant == personnage[personnage.length -1]){
               joueurcourant = personnage[0];
               numeroJoueur = 0;
           }else{
            joueurcourant = personnage[numeroJoueur + 1];
            numeroJoueur = numeroJoueur + 1;
        }
        
    }
    
    public void AfficherEtatJoueur(){
        System.out.println("Voici l'etat des personnages");
        for (Joueur personnage1 : personnage) {
            System.out.println(personnage1.role.name + " = " + personnage1.role.ptDeVie);
        }
        System.out.println("\n");
            
    }

    public boolean FinPartie(){
        if(personnage[ennemie].role.ptDeVie <= 0){
            System.out.println("Le gagnant est " + joueurcourant.role.name + "\n\n");
            //AfficherEtatJoueur();
               return true;
           }
        return false;
    }
    public void ChangerEnnemie(){
        do{
            Random rand = new Random();
            ennemie = rand.nextInt(personnage.length);  
        }while(ennemie == numeroJoueur); 
    }
}
