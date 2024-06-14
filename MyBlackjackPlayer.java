
/*
 * Defines a blackjack player by inheriting from the superclass BlackjackPlayer
 *   and implementing the 3 abstract methods.
 */
public class MyBlackjackPlayer extends BlackjackPlayer{


	@Override
	public int getBet() {
		if (getChips() >= 500) {
			return 10;
		} else if (getChips() <= 10 && getChips() >= 1) {
			return 1;
		} else if (getChips() == 0) {
			return getChips();
		} else {
			return (int)(getChips()*.10);
		}
	}

	@Override
	public Move getMove() {
		/* Hits until we get a score of 16 or better */
		if (getChips() >= 500 && this.handScore() <= 16) {
			return Move.HIT;
		} else if ((getBet() <= getChips()*.10) && this.handScore() <= 15) {
			return Move.HIT;
		} else {
			return Move.STAY;
		}

	}

	@Override
	public void handOver(Card[] dealerHand) {

	}

	
}
