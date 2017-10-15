package joejensen.blackjack.enums;

import joejensen.blackjack.models.Dollars;

public enum Payout {

    THREE_TO_TWO,
    SIX_TO_FIVE,
    INVALID;

    public Dollars getBlackJackExtraWinnings(Dollars dollars) {
        switch (this) {
            case THREE_TO_TWO:
                return dollars.getPortion(2);
            case SIX_TO_FIVE:
                return dollars.getPortion(5);
            case INVALID:
                return new Dollars(0);
        }
        return new Dollars(0);
    }

}
