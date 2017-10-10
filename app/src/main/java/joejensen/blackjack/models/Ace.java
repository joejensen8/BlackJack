package joejensen.blackjack.models;

import joejensen.blackjack.enums.CardName;
import joejensen.blackjack.enums.Suit;

public class Ace extends Card {

    public Ace (Suit suit) {
        super(CardName.ACE, suit);
    }

    @Override
    public int getValue() {
        return 1;
    }

}
