public class Game {

    public static void main(String[] args) {

        // create deck of cards
        Deck deck = new Deck();

        // create 2 players
        Hand hand1 = new Hand(deck);
        Hand hand2 = new Hand(deck);

        // show cards of each player
        hand1.showCardsInHand();
        hand2.showCardsInHand();

        // offer to players take one more card
        hand1.getAdditionalCards(deck);
        hand2.getAdditionalCards(deck);

        // Compare hands of players. Print the number of winner
        hand1.compareHands(hand2);
    }

}