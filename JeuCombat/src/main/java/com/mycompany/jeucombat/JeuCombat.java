

package com.mycompany.jeucombat;
import java.util.Random;
/**
 *
 * @author mathi
 */
public class JeuCombat {

    public static void main(String[] args) {
        Random rand = new Random();
        int choix = rand.nextInt(2, 4);
        
        Partie partie = new Partie(choix);
        partie.CommencerNouvellePartie();
        
    }
}
