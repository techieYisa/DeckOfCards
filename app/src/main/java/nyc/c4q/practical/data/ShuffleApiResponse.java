package nyc.c4q.practical.data;

import java.util.List;

public class ShuffleApiResponse {
    private boolean success, shuffled;
    private String deck_id;
    private int remaining;
    private List<Cards> cards;

    public ShuffleApiResponse(boolean success, boolean shuffled, String deck_id, int remaining, List<Cards> cards) {
        this.success = success;
        this.shuffled = shuffled;
        this.deck_id = deck_id;
        this.remaining = remaining;
        this.cards = cards;
    }

    public void isSuccess(boolean success) {
        this.success = success;
    }

    public void setShuffled(boolean shuffled) {
        this.shuffled = shuffled;
    }

    public void setDeck_id(String deck_id) {
        this.deck_id = deck_id;
    }

    public void isRemaining(int remaining) {
        this.remaining = remaining;
    }

    public void setCards(List<Cards> cards) {
        this.cards = cards;
    }
}
