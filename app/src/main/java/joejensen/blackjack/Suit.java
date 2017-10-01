package joejensen.blackjack;

/**
 * Created by joe on 9/30/17.
 */

public enum Suit {

    SPADES,
    HEARTS,
    CLUBS,
    DIAMONDS,
    INVALID;

    public static Suit getSuitFromInt(int value) {
        switch (value) {
            case 1:
                return SPADES;
            case 2:
                return HEARTS;
            case 3:
                return CLUBS;
            case 4:
                return DIAMONDS;
        }

        return INVALID;
    }

}
