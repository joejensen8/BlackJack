package joejensen.blackjack.models;

public class BasePlayer {

    private Hand hand;

    public BasePlayer() {
        hand = new Hand();
    }

    public Hand getHand() {
        return this.hand;
    }

}
