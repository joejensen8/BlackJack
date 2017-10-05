package joejensen.blackjack.enums;

import joejensen.blackjack.models.Dollars;

public enum Payout {

    THREE_TO_TWO,
    SIX_TO_FIVE,
    INVALID;

    public static Dollars getBlackJackExtraWinnings(Dollars dollars, Payout payout) {
        switch (payout) {
            case THREE_TO_TWO:
                return dollars.getHalf();
            case SIX_TO_FIVE:
                return dollars.getFifth();
            case INVALID:
                return new Dollars(0);
        }
        return new Dollars(0);
    }

}
