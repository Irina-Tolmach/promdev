/**
 * Implements a monster class
 * 11 elements in this class are;
 * name, type, hp, speed, attack,
 * weaknesses and 4 moves
 * @author Gabriel Hoeher
 */
public class Monster {
    public String name;
    public String type;
    public int hp;
    public int speed;
    public int attack;
    public int defense;
    public Move move1;
    public Move move2;
    public Move move3;
    public Move move4;
    public String[] weaknesses = new String[2];
    public String[] strength = new String[2];

    /**
     * Constructor for all elements of the class
     * Weaknesses set up via WeaknessGen() method
     * @param name 
     * @param type
     * @param hp
     * @param speed
     * @param attack
     * @param defense
     * @param m1 move 1
     * @param m2 move 2
     * @param m3 move 3
     * @param m4 move 4
     * @param weaknesses 
     * @param strength
     */
    public Monster(String name, String type, int hp, int speed, int attack, int defense, Move m1, Move m2, Move m3, Move m4) {
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.speed = speed;
        this.attack = attack;
        this.defense = defense;
        this.move1 = m1;
        this.move2 = m2;
        this.move3 = m3;
        this.move4 = m4;
        typeGenerator(this.type);
    }

    /**
     * Returns corresponding move to n
     * @param n int of move
     * @return specified move 
     */
    public Move getMove(int n) {
        if (n == 1) {
            return this.move1;
        }
        else if(n == 2) {
            return this.move2;
        }
        else if(n == 3) {
            return this.move3;
        }
        else {
            return this.move4;
        }
    }

    /**
     * Generator of two monster weaknesses
     * Generator of two monster stengths
     * Only 3 main types included
     * @param type type of players monster
     */
    public void typeGenerator(String type) { 
        String[] temp = new String[3]; 
        String[] temp2 = new String[3];

        if (type == "Fire") {
            String[] weakness = {"Water", "Rock"}; 
            String[] str = {"Grass", "Ice"};
            for (int i = 0; i <= 1; i++) {
                temp[i] = weakness[i];
                temp2[i] = str[i];
            }
        }
        else if (type == "Grass") {
            String[] weakness = {"Fire", "Flying"};
            String[] str = {"Water", "Rock"};
            for (int i = 0; i <= 1; i++) {
                temp[i] = weakness[i];
                temp2[i] = str[i];
            }
        }   
        else if (type == "Water") {
            String[] weakness = {"Grass", "Thunder"}; 
            String[] str = {"Fire", "Rock"};
            for (int i = 0; i <= 1; i++) {
                temp[i] = weakness[i];
                temp2[i] = str[i];
            }
        }
        weaknesses = temp;
        strength = temp2;
    }

    public String getName() {return name;}              //returns monster name
    public int getHP() {return hp;}                     //returns monster current hp
    public int getSpeed() {return speed;}               //returns monster speed
    public int getAttack() {return attack;}             //returns monsters attack power
    public int getDefense() {return defense;}           //returns monster defense
    public String getType() {return type;}              //returns monsters type
    public String[] getWeakness() {return weaknesses;}  //returns list of monsters weaknesses
    public String[] getStrength() {return strength;}    //returns list of monsters strengths
}