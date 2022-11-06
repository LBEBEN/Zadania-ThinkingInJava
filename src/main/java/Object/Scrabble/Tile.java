package Object.Scrabble;

import java.util.Objects;

public class Tile {

    private char letter;
    private int value;

    public Tile(){}

    public Tile(char letter, int value){
        this.letter=letter;
        this.value=value;
    }

    public static void printTitle(Tile t){
        System.out.printf("Płytka %s ma wartość %02d punktów", t.letter, t.value);
    }

    public static void testTile(){
        Tile tile = new Tile('Z', 10);
        printTitle(tile);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tile tile = (Tile) o;
        return letter == tile.letter && value == tile.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(letter, value);
    }

    @Override
    public String toString() {
        return "Tile{" +
                "letter=" + letter +
                ", value=" + value +
                '}';
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public char getLetter() {
        return letter;
    }

    public int getValue() {
        return value;
    }
}
