/**
 * Implements HumanPlayer class
 * Subclass of Player
 * @author Gabriel Hoeher
 */

import java.util.Scanner;

public class HumanPlayer extends Player {

    /**
     * Constructor that instantiates a monster
     * @param monster a monster instance
     */
    public HumanPlayer(Monster monster) {
        this.monster = monster;
    }

    /**
     * Uses player input to get monster move
     * @return int of players attack
     */
    public int chooseMove() {
        int playerAttack = 0;
        if (playerAttack >= 0 && playerAttack <= 4) {
            System.out.println("1." + monster.move1.getName() + "\t2." + monster.move2.getName() 
                             + "\t3." + monster.move3.getName() + "\t4." + monster.move4.getName() 
                             + "\nInput your attack");
            Scanner myObj = new Scanner(System.in);     //if closed it will not recreate scanner once called again
            playerAttack = myObj.nextInt();
        }
        return playerAttack;
    }
}