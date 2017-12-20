import java.util.ArrayList;
import java.util.Random;

public class Deck {

    private ArrayList<Card> cards;

    Deck() {
        cards = new ArrayList<Card>();
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 12; j++) {
                cards.add(new Card(i, j));
            }
        }
    }

    Card drawFromDeck() {
        Random rndGenerator = new Random();
        int index = rndGenerator.nextInt(cards.size());
        Card drawedCard = cards.get(index);
        cards.remove(index);
        return drawedCard;
    }

    int getSizeOfDeck() {
        return cards.size();
    }

}