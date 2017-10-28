package joejensen.blackjack.models;

import java.util.EnumSet;

import joejensen.blackjack.enums.CardName;
import joejensen.blackjack.enums.Suit;

public class Deck {

    private int numDecks;
    private Card[] deck;
    private int spot;

    public Deck() {
        this(6);
    }

    public Deck(int numDecks) {
        this.numDecks = numDecks;
        initDeck();
    }

    private void initDeck() {
        deck = new Card[numDecks * 52];
        int index = 0;
        for (int deckNum = 0; deckNum < numDecks; deckNum++) {
            for (Suit suit : EnumSet.allOf(Suit.class)) {
                for (CardName cardName : EnumSet.allOf(CardName.class)) {
                    if (cardName == CardName.ACE) {
                        deck[index] = new Ace(suit);
                    } else {
                        deck[index] = new Card(cardName, suit);
                    }
                    index++;
                }
            }
        }
        shuffle();
    }

    // todo check for better algorithm
    public void shuffle() {
        for (int i = 0; i < deck.length; i++) {
            for (int j = 0; j < deck.length; j++) {
                int rand1 = (int)(Math.random() * deck.length);
                int rand2 = (int)(Math.random() * deck.length);
                if (rand1 != rand2) {
                    Card temp = deck[rand1];
                    deck[rand1] = deck[rand2];
                    deck[rand2] = temp;
                }
            }
        }
        spot = 0;
    }

    public Card getNext() {
        if (spot >= deck.length) {
            shuffle();
        }
        int temp = spot;
        spot++;
        return deck[temp];
    }

    public boolean needsReshuffle() {
        int remainingCardsThreshold = (int) (deck.length * 0.25);
        return (remainingCardsThreshold > (deck.length - spot));
    }

    public boolean isFreshDeck() {
        return (spot == 0);
    }

}
