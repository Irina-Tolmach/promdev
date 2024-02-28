/**
 * Implements CPUPlayer 
 * a subclass of Player
 * @author Gabriel Hoeher
 */

import java.util.Random;
public class CPUPlayer extends Player {
    
    /**
     * Constructor that instantiates a monster
     * @param monster a monster
     */
    public CPUPlayer(Monster monster) {
        this.monster = monster;
    }

    /**
     * Randomly chooses move for CPUAttack
     * @return int of wanted attack
     */
    public int chooseMove() {
        Random random = new Random();
        int CPUAttack = random.nextInt(4) +1;
        return CPUAttack;
    }
}