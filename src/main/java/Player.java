/**
 * Implements an abstract player class
 * Uses a monster as a means of playing
 * @author Gabriel Hoeher
 */

import java.util.Random;

public abstract class Player {
    /* default */ Monster monster;

    /**
     * Finds monster tied to player
     * @return the monster 
     */
    public Monster getMonster() {
        return monster;
    }

    /**
     * Determines if players monster is dead
     * @return either true or false
     */
    public boolean hasLost() {
        return monster.getHP() <= 0;

    }

    /**
     * Compares the player and opponents monsters speeds,
     * Determines who will attack first
     * If equal the player has the advantage
     * @param enemy is the opponent
     * @return either true or false
     */
    public boolean isFasterThan(Player enemy) {
        return this.monster.getSpeed() >= enemy.getMonster().getSpeed() ;

    }

    /**
     * Attack method that determines if an attack will hit
     * And the amount of damage that will be produced 
     * Super Effective modifier element has been added
     * Not very effective element has been added
     * @param player the opponent
     * @param mmmmmmmm int corresponding to monster move
     */
    @SuppressWarnings({"PMD.CognitiveComplexity", "PMD.CompareObjectsWithEquals", "PMD.UseEqualsToCompareStrings"})
    public void attack(Player player, int mmmmmmmm) {
        Random random = new Random();
        double roll = random.nextDouble();
        int isSuperEffective = 1;

        System.out.println(this.monster.getName() + " uses "+ this.monster.getMove(mmmmmmmm).getName());
        
        //attack has missed
        if (roll > this.monster.getMove(mmmmmmmm).getAccuracy()) {
            System.out.println("Attack missed");
        }

        //attack hits
        else {
            String[] weakness = player.monster.getWeakness(); //stores opponents weakness
            String[] strength = player.monster.getStrength(); //stores opponents strength

            //Determines if attack is super or not very effective and determines modifier
            //multiplyed by 2 b/c using int later divided by 2
            for(int i=0; i <= 2; i++) {
                if (this.monster.getMove(mmmmmmmm).getType() == weakness[i]) {
                    isSuperEffective = 4;
                    break;
                }
                if (this.monster.getMove(mmmmmmmm).getType() == strength[i]) {
                    isSuperEffective = 1;
                    break;
                }
                else {
                    isSuperEffective = 2; 
                }
            }

            //Damage calculator
            int damage = this.monster.getAttack() + this.monster.getMove(mmmmmmmm).getPower()
                           - player.monster.getDefense();
            damage = (damage *isSuperEffective) / 2; //adjusts for dealing with int
            player.monster.hp -= damage;
            int magicfour = 4;
            int magicone = 1;
            if (isSuperEffective == magicfour) {
                System.out.println("It's super effective");
            }
            if (isSuperEffective == magicone) {
                System.out.println("It's not very effective");
            }
            System.out.println(damage + " points of damage were done to " + player.monster.getName());
        }
    }
    /**
     * Will be implemented in CPUPlayer and HumanPlayer classes
     * @return move that is wanted
     */
    public abstract int chooseMove();
}