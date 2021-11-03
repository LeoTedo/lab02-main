package it.unimi.di.prog2.poker;

import ca.mcgill.cs.stg.solitaire.cards.Card;
import ca.mcgill.cs.stg.solitaire.cards.Deck;
import ca.mcgill.cs.stg.solitaire.cards.Rank;
import ca.mcgill.cs.stg.solitaire.cards.Suit;

import java.util.Arrays;
import java.util.Iterator;

public class PokerHand implements Iterable<Card>{
	@Override
	public Iterator iterator() {
		return Arrays.stream(mano).iterator();
	}


	enum HandRank {
		HIGH_CARD, ONE_PAIR, TWO_PAIR, TRIS, STRAIGHT, FLUSH, FULL_HOUSE, FOUR_OF_A_KIND, STRAIGHT_FLUSH
	};
	Deck deck = new Deck();
	public Card[] mano;
	//Valutatore v = new Valutatore()


	public PokerHand(Deck deck, int numCards) {
		mano = new Card[numCards];
		for (int i = 0; i < numCards && !deck.isEmpty(); i++) {
			mano[i] = deck.draw();
		}

	}

	/*public PokerHand(Deck deck, int numCards, String testo){
		mano = new Card[numCards];
		for (int i = 0; i < numCards && !deck.isEmpty(); i++) {
			mano[i] = new Card(Parserank(testo),ParseSuit(testo));
		}
	}

	private Suit ParseSuit(String s) {

	}

	private Rank Parserank(String s) {

	}*/

	@Override
	public String toString() {
		return "mano: " + Arrays.toString(mano);
	}

	public HandRank GetRank() {
		//PUOI CREARE INTERFACCIA CON IL CONTROLLO DI TUTTE I TIPI DI MANI, POI IMPORTARLA QUI
		Valutatore evaluator = new CoppiaEvaluator(new FlushValuator (new HighRankEvaluator()));
	return evaluator.evaluate(this);
	}
		
	}

