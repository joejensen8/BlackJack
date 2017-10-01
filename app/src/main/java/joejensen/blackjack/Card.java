package joejensen.blackjack;

/**
 * Created by joe on 9/30/17.
 */

public class Card {

    private CardName cardName;
    private Suit suit;

    public Card() {

    }

    public Card(CardName cardName, Suit suit) {

    }

    public Suit getSuit() {
        return this.suit;
    }

    public CardName getCardName() {
        return this.cardName;
    }

}
