/**
 * A stack of more than one deck of cards used in a casino game
 *
 */
    
public class DeckShoe {

    //An array of decks of cards that comprise this multi-deck.
    private Deck[] decks;

    // you may need other instance variables here
    private int currentDeck = 0;

    //Constructor: instantiates the number of decks specified and
    //adds them to the list of decks
    public DeckShoe(int numDecks) {
         if (numDecks >= 1)
            decks = new Deck[numDecks];
         for (int i = 0; i < numDecks; i++) {
             decks[i] = new Deck();
         }
    }

    //Deals the top card from the stack of decks and returns that Card.
    //You can implement this several ways, as long as it correctly
    //deals a card from one of the decks.
    //Important: if you've dealt the last card in all the decks, you'll want
    //to reshuffle all the decks and start over again
    public Card dealTopCard() {

        if(decks[currentDeck].cardsLeft() > 0) {
            //if (decks[currentDeck].cardsLeft() == 52)
                //System.out.println("Deck " + currentDeck);
            return decks[currentDeck].dealTopCard();
        } else if (decks[currentDeck].cardsLeft() == 0 && currentDeck < decks.length - 1) {
            currentDeck++;
            //System.out.println("NEW DECK, " + currentDeck + " OF " + decks.length);
            return decks[currentDeck].dealTopCard();
        } else {
            restoreDecks();
            //System.out.println("RESTORING DECKS");
            currentDeck = 0;
            return decks[currentDeck].dealTopCard();
        }
    }


    //Reshuffles all of the decks.
    protected void restoreDecks() {
        for (Deck i : decks) {
            i.shuffle();
        }
    }


    //returns the number of cards left to be dealt in the entire stack of cards.
    public int cardsLeft() {
        int numCardsLeft = 0;
        for (int i = 0; i < decks.length; i++) {
            numCardsLeft += decks[i].cardsLeft();
        }
        return numCardsLeft;
    }

}
