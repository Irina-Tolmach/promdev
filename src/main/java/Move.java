/**
 * Implements a monsters move class
 * Records 4 main elements of each move;
 * name, type, power and accuracy
 * @author Gabriel Hoeher
 */

public class Move {
    public String name;
    public String type;
    public int power;
    public float accuracy;

    /**
     * Constructor of the 4 elements
     * @param name name of the move
     * @param type type of the move
     * @param power power of the move
     * @param accuracy accuracy of the move
     */
    public Move(String name, String type, int power, float accuracy) {
        this.name = name;
        this.type = type;
        this.power = power;
        this.accuracy = accuracy;
    }

    public int getPower() {return power;} //returns moves power
    public String getName() {return name;} //returns moves name
    public float getAccuracy() {return accuracy;} //returns moves accuracy
    public String getType() {return type;} //returns moves type

}