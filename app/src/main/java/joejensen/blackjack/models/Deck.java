package joejensen.blackjack.models;

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
            for (int suit = 1; suit <= 4; suit++) {
                for (int cardName = 1; cardName <= 13; cardName++) {
                    Suit currSuit = Suit.getSuitFromInt(suit);
                    CardName currCardName = CardName.getCardNameFromInt(cardName);
                    deck[index] = new Card(currCardName, currSuit);
                    index++;
                }
            }
        }
        shuffle();
    }

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
    }

    public Card getNext() {
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
