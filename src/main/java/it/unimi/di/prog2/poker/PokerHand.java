package it.unimi.di.prog2.poker;

import ca.mcgill.cs.stg.solitaire.cards.Card;
import ca.mcgill.cs.stg.solitaire.cards.Deck;

import java.util.Arrays;
import java.util.Iterator;

public class PokerHand {
	enum HandRank {
		HIGH_CARD, ONE_PAIR, TWO_PAIR, TRIS, STRAIGHT, FLUSH, FULL_HOUSE, FOUR_OF_A_KIND, STRAIGHT_FLUSH
	};
	Deck deck = new Deck();
	private Card[] mano;


	public PokerHand(Deck deck, int numCards) {
		mano = new Card[numCards];
		for (int i = 0; i < numCards && !deck.isEmpty(); i++) {
			mano[i] = deck.draw();
		}
	}

	@Override
	public String toString() {
		return "PokerHand{" +
				"mano=" + Arrays.toString(mano) +
				'}';
	}

	public void GetRank() {

		deck.shuffle();
		Iterator<Deck> it = deck.iterator();
		it.next();
		/*for (int i = 0; i < 5; i++) {
			mano[i] = deck.draw();
			System.out.println(mano[i]);
		}
		for (int i = 0; i < mano.length; i++) {
if (mano[i].getSuit() == mano[i+1].getSuit()){

}*/
		}

		/**/
		
	}
}
