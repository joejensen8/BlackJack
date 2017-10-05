package joejensen.blackjack.models;

public class Card {

    private CardName cardName;
    private Suit suit;

    public Card(CardName cardName, Suit suit) {
        this.cardName = cardName;
        this.suit = suit;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public CardName getCardName() {
        return this.cardName;
    }

    public int getValue() {
        switch (cardName) {
            case ACE:
                return 11;
            case TWO:
                return 2;
            case THREE:
                return 3;
            case FOUR:
                return 4;
            case FIVE:
                return 5;
            case SIX:
                return 6;
            case SEVEN:
                return 7;
            case EIGHT:
                return 8;
            case NINE:
                return 9;
            default:
                return 10;
        }
    }

    public boolean isAce() {
        return (this.cardName == CardName.ACE);
    }

}
