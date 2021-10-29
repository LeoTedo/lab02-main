package it.unimi.di.prog2.poker;

import ca.mcgill.cs.stg.solitaire.cards.Card;
import ca.mcgill.cs.stg.solitaire.cards.Deck;
import ca.mcgill.cs.stg.solitaire.cards.Rank;
import ca.mcgill.cs.stg.solitaire.cards.Suit;

public class TestPH {

	public static void main(String[] args) {
		Deck d = new Deck();
		PokerHand p = new PokerHand(d, 5);
		p.mano[0] = Card.get(Rank.ACE, Suit.SPADES);
		System.out.println(p+""+p.GetRank());
		//System.out.println(p.GetRank());
		//System.out.println(d.draw());

		//p.GetRank();


	}

}
