package joejensen.blackjack.models;

import joejensen.blackjack.models.BasePlayer;

public class Dealer extends BasePlayer {

    public Dealer() {
        super();
    }

    public boolean shouldHit() {
        return (super.getHand().getScore() < 17 || super.getHand().isSoft17());
    }

}
