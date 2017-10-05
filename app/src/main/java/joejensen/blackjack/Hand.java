package joejensen.blackjack;

import java.util.HashSet;
import java.util.Set;

public class Hand {

    private Set<Card> cards;
    private boolean containsAce = false;
    private boolean didAceBecomeOne = false;

    public Hand() {
        cards = new HashSet<>();
    }

    public void giveCard(Card card) {
        cards.add(card);
    }

    public int getScore() {
        int score = 0;
        for (Card card : cards) {
            score += card.getValue();
            if (card.isAce()) {
                containsAce = true;
            }
        }

        if (score > 21 && containsAce) {
            score -= 10;
            didAceBecomeOne = true;
        }

        return score;
    }

    public String getReadableScore() {
        String readableScore = "" + getScore();
        if (containsAce && !didAceBecomeOne) {
            readableScore += " or " + (getScore() - 10);
        }
        return readableScore;
    }

    public boolean isBlackJack() {
        return (getScore() == 21 && containsAce && cards.size() == 2);
    }

    public boolean isBust() {
        return (getScore() > 21);
    }

    public void clearHand() {
        cards.clear();
        containsAce = false;
        didAceBecomeOne = false;
    }

    public boolean isSoft17() {
        return (getScore() == 17 && containsAce && !didAceBecomeOne);
    }

}
