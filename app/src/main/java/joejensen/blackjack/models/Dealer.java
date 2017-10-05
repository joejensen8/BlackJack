package joejensen.blackjack.models;

import joejensen.blackjack.models.BasePlayer;

public class Dealer extends BasePlayer {

    public Dealer() {
        super();
    }

    public boolean shouldHit() {
        if (super.getHand().getScore() < 17) {
            return true;
        } else if (super.getHand().getScore() == 17 && super.getHand().isSoft17()) {
            return true;
        } else {
            return false;
        }
    }

}
