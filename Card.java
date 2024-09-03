public class Card {
    int value;
    String suit;
    String rank;
    public Card(){

        value = -1;
        suit = "null";
        rank = "null";

    }

    public Card(int value, String rank, String suit){

        this.value = value;
        this.rank = rank;
        this.suit = suit;

    }

    public String getSuit(){
        return suit;
    }

    public String getRank(){
        return rank;
    }

    public int getValue(){
        return value;
    }

    public void setSuit(String suit){
        this.suit = suit;
    }

    public void setRank(String rank){
        this.rank = rank;
    }

    public void setValue(int value){
        this.value = value;
    }

    public String toString(){
        return "card value: " + value + ", card suit: " + suit + ", card rank: " + rank;
    }
}
