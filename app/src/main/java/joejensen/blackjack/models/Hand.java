package joejensen.blackjack.models;

import java.util.HashSet;
import java.util.Set;

public class Hand {

    private Set<Card> nonAces;
    private Set<Ace> aces;

    public Hand() {
        nonAces = new HashSet<>();
        aces = new HashSet<>();
    }

    public void giveCard(Card card) {
        if (card.isAce()) {
            aces.add((Ace) card);
        } else {
            nonAces.add(card);
        }
    }

    public int getScore() {
        return getTotalNonAceValue() + getTotalAceValue();
    }

    private int getTotalAceValue() {
        int score = aces.size();
        int counter = 0;
        while (counter < aces.size() && score + getTotalNonAceValue() < 22) {
            score += 10;
            counter++;
        }
        return score;
    }

    private int getTotalNonAceValue() {
        int score = 0;
        for (Card card : nonAces) {
            score += card.getValue();
        }
        return score;
    }

    public String getReadableScore() {
        int score = getScore();
        if (!didAceBecome11()) {
            return Integer.toString(score);
        } else {
            int smallerScore = score - 10;
            return Integer.toString(score) + " or " + Integer.toString(smallerScore);
        }
    }

    public boolean isBlackJack() {
        return (aces.size() == 1 && nonAces.size() == 1 && getScore() == 21);
    }

    public boolean isBust() {
        return (getScore() > 21);
    }

    public void clear() {
        nonAces.clear();
        aces.clear();
    }

    public boolean isSoft17() {
        return (getScore() == 17 && didAceBecome11());
    }

    private boolean didAceBecome11() {
        return (getTotalAceValue() != aces.size());
    }

}
