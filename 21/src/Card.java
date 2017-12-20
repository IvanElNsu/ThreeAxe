public class Card {

    private int rank, suit;

    private static String[] suits = { "hearts", "spades", "diamonds", "clubs" };
    private static String[] ranks = { "Ace" , "2", "3", "4", "5", "6", "7",
            "8", "9", "10", "Jack", "Queen", "King" };

    Card (int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    int getRank() {
        return rank;
    }

    int getSuit() {
        return suit;
    }

    String getNameOfCard() {
        return ranks[rank] + " of " + suits[suit];
    }

}