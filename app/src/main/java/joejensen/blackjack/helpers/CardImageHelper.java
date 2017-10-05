package joejensen.blackjack.helpers;

import android.content.Context;
import android.graphics.drawable.Drawable;

import joejensen.blackjack.R;
import joejensen.blackjack.models.Card;

public class CardImageHelper {

    public Drawable getCardImage(Card card, Context context) {
        switch (card.getSuit()) {
            case CLUBS:
                return getClubsCardImage(card, context);
            case SPADES:
                return getSpadesCardImage(card, context);
            case DIAMONDS:
                return getDiamondsCardImage(card, context);
            case HEARTS:
                return getHeartsCardImage(card, context);
        }
        return null;
    }

    private Drawable getDiamondsCardImage(Card card, Context context) {
        switch (card.getCardName()) {
            case ACE:
                return context.getDrawable(R.drawable.ace_of_diamonds);
            case TWO:
                return context.getDrawable(R.drawable.two_of_diamonds);
            case THREE:
                return context.getDrawable(R.drawable.three_of_diamonds);
            case FOUR:
                return context.getDrawable(R.drawable.four_of_diamonds);
            case FIVE:
                return context.getDrawable(R.drawable.five_of_diamonds);
            case SIX:
                return context.getDrawable(R.drawable.six_of_diamonds);
            case SEVEN:
                return context.getDrawable(R.drawable.seven_of_diamonds);
            case EIGHT:
                return context.getDrawable(R.drawable.eight_of_diamonds);
            case NINE:
                return context.getDrawable(R.drawable.nine_of_diamonds);
            case TEN:
                return context.getDrawable(R.drawable.ten_of_diamonds);
            case JACK:
                return context.getDrawable(R.drawable.jack_of_diamonds);
            case QUEEN:
                return context.getDrawable(R.drawable.queen_of_diamonds);
            case KING:
                return context.getDrawable(R.drawable.king_of_diamonds);
        }

        return null;
    }

    private Drawable getClubsCardImage(Card card, Context context) {
        switch (card.getCardName()) {
            case ACE:
                return context.getDrawable(R.drawable.ace_of_clubs);
            case TWO:
                return context.getDrawable(R.drawable.two_of_clubs);
            case THREE:
                return context.getDrawable(R.drawable.three_of_clubs);
            case FOUR:
                return context.getDrawable(R.drawable.four_of_clubs);
            case FIVE:
                return context.getDrawable(R.drawable.five_of_clubs);
            case SIX:
                return context.getDrawable(R.drawable.six_of_clubs);
            case SEVEN:
                return context.getDrawable(R.drawable.seven_of_clubs);
            case EIGHT:
                return context.getDrawable(R.drawable.eight_of_clubs);
            case NINE:
                return context.getDrawable(R.drawable.nine_of_clubs);
            case TEN:
                return context.getDrawable(R.drawable.ten_of_clubs);
            case JACK:
                return context.getDrawable(R.drawable.jack_of_clubs);
            case QUEEN:
                return context.getDrawable(R.drawable.queen_of_clubs);
            case KING:
                return context.getDrawable(R.drawable.king_of_clubs);
        }

        return null;
    }

    private Drawable getSpadesCardImage(Card card, Context context) {
        switch (card.getCardName()) {
            case ACE:
                return context.getDrawable(R.drawable.ace_of_spades);
            case TWO:
                return context.getDrawable(R.drawable.two_of_spades);
            case THREE:
                return context.getDrawable(R.drawable.three_of_spades);
            case FOUR:
                return context.getDrawable(R.drawable.four_of_spades);
            case FIVE:
                return context.getDrawable(R.drawable.five_of_spades);
            case SIX:
                return context.getDrawable(R.drawable.six_of_spades);
            case SEVEN:
                return context.getDrawable(R.drawable.seven_of_spades);
            case EIGHT:
                return context.getDrawable(R.drawable.eight_of_spades);
            case NINE:
                return context.getDrawable(R.drawable.nine_of_spades);
            case TEN:
                return context.getDrawable(R.drawable.ten_of_spades);
            case JACK:
                return context.getDrawable(R.drawable.jack_of_spades);
            case QUEEN:
                return context.getDrawable(R.drawable.queen_of_spades);
            case KING:
                return context.getDrawable(R.drawable.king_of_spades);
        }

        return null;
    }

    private Drawable getHeartsCardImage(Card card, Context context) {
        switch (card.getCardName()) {
            case ACE:
                return context.getDrawable(R.drawable.ace_of_hearts);
            case TWO:
                return context.getDrawable(R.drawable.two_of_hearts);
            case THREE:
                return context.getDrawable(R.drawable.three_of_hearts);
            case FOUR:
                return context.getDrawable(R.drawable.four_of_hearts);
            case FIVE:
                return context.getDrawable(R.drawable.five_of_hearts);
            case SIX:
                return context.getDrawable(R.drawable.six_of_hearts);
            case SEVEN:
                return context.getDrawable(R.drawable.seven_of_hearts);
            case EIGHT:
                return context.getDrawable(R.drawable.eight_of_hearts);
            case NINE:
                return context.getDrawable(R.drawable.nine_of_hearts);
            case TEN:
                return context.getDrawable(R.drawable.ten_of_hearts);
            case JACK:
                return context.getDrawable(R.drawable.jack_of_hearts);
            case QUEEN:
                return context.getDrawable(R.drawable.queen_of_hearts);
            case KING:
                return context.getDrawable(R.drawable.king_of_hearts);
        }

        return null;
    }

}
