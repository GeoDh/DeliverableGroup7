/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project.model;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be
 * instantiated for any Card game. Students wishing to add to the code should remember to add
 * themselves as a modifier.
 *
 * @author dancye, 2018
 */
public class Card {
    //default modifier for child classes

    public enum Suit {
        HEART("Hearts"), SPADE("Spades"), CLUB("Clubs"), DIAMOND("Diamonds");
        
        String suit;
        Suit(String suit){
            this.suit = suit;
        }
        
        public String showSuit(){
            return suit;
        }
    };
    
    public enum Value {
        ACE("Ace"), TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"), 
        EIGHT("8"), NINE("9"), TEN("10"), JACK("Jack"), QUEEN("Queen"), KING("King");
        
        String value;
        Value(String value){
            this.value = value;
        }
        
        public String showValue(){
            return value;
        }
    };
    
    protected final Suit suit;
    protected final Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public Value getValue() {
        return this.value;
    }

    public Suit getSuit() {
        return this.suit;
    }
    
    @Override
    public String toString(){
        String format = "%s of %s";
        return String.format(format, value.showValue(), suit.showSuit());
    }
}
