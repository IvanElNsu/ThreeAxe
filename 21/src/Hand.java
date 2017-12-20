import java.util.ArrayList;
import java.util.Scanner;

public class Hand {

    private static int nextId = 1;

    private int id;
    private ArrayList<Card> cards;
    private int value;

    Hand(Deck deck) {
        this.setId();
        cards = new ArrayList<Card>();
        for (int i = 0; i <= 1; i++) {
            cards.add(deck.drawFromDeck());
        }
    }

    void setId() {
        id = nextId;
        nextId++;
    }
    int getId() {
        return id;
    }

    void getAdditionalCards(Deck deck) {
        String userAnswer;
        Scanner scan = new Scanner(System.in);
        boolean takeCard = true;
        while (takeCard) {
            System.out.println("\nPlayer #" + this.getId()
                    + ". Сумма карт: " + this.getValueOfHand()
                    + ". Возьмешь еще карту? 'Y' or 'N'...");
            userAnswer = scan.next();
            switch (userAnswer.toUpperCase()) {
                case "Y": cards.add(deck.drawFromDeck());
                    this.showCardsInHand();
                    break;
                case "N": takeCard = false;
                    break;
                default:  System.out.print("не верный ввод.");
                    break;

            }
        }

    }

    void showCardsInHand() {
        System.out.print("\nCards of player #" + this.getId() + ": ");
        for (Card i : cards) {
            System.out.print(i.getNameOfCard() + "; ");
        }
    }

    int getValueOfHand() {
        value = 0;
        for (Card i : cards) {
            value += i.getRank() + 1;
        }
        return value;
    }

    void printValueOfHand() {
        System.out.print("сумма карт: " + this.getValueOfHand());
    }

    void compareHands(Hand another) {
        if (this.getValueOfHand() == another.getValueOfHand()) {
            System.out.print("-_-");
        } else if (this.getValueOfHand() == 21) {
            System.out.print("Player #" + this.getId() + " победил!");
        } else if (another.getValueOfHand() == 21) {
            System.out.print("Player #" + another.getId() + " победил!");
        } else if (this.getValueOfHand() > 21 && another.getValueOfHand() < 21) {
            System.out.print("Player #" + another.getId() + " победил!");
        } else if (this.getValueOfHand() < 21 && another.getValueOfHand() > 21) {
            System.out.print("Player #" + this.getId() + " победил!");
        } else if (this.getValueOfHand() < 21 && another.getValueOfHand() < 21) {
            if (this.getValueOfHand() > another.getValueOfHand()) {
                System.out.print("Player #" + this.getId() + " победил!");
            } else {
                System.out.print("Player #" + another.getId() + " победил!");
            }
        } else if (this.getValueOfHand() < another.getValueOfHand()) {
            System.out.print("Player #" + this.getId() + " победил!");
        } else {
            System.out.print("Player #" + another.getId() + " победил!");
        }
    }

}
