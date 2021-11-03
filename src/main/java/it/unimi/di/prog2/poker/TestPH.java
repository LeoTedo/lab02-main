package it.unimi.di.prog2.poker;

import ca.mcgill.cs.stg.solitaire.cards.Card;
import ca.mcgill.cs.stg.solitaire.cards.Deck;
import ca.mcgill.cs.stg.solitaire.cards.Rank;
import ca.mcgill.cs.stg.solitaire.cards.Suit;

public class TestPH {

	public static void main(String[] args) {
		Deck d = new Deck();
		PokerHand p = new PokerHand(d, 5);
		PokerTable t = new PokerTable(5,p,d);
		//p.mano[0] = Card.get(Rank.ACE, Suit.SPADES);
		//p.mano[1] = Card.get(Rank.TEN, Suit.SPADES);
		//p.mano[2] = Card.get(Rank.THREE, Suit.SPADES);
		//p.mano[3] = Card.get(Rank.FIVE, Suit.SPADES);
		//p.mano[4] = Card.get(Rank.FOUR, Suit.SPADES);
		//System.out.println(p+"\n"+p.GetRank());
		//System.out.println(p.GetRank());
		//System.out.println(d.draw());

		//p.GetRank();
		t.allRanks(t);
		System.out.println(t.getHand(0)+" "+t.getHand(0).GetRank());
		System.out.println(t.getHand(1)+" "+t.getHand(1).GetRank());
		System.out.println(t.getHand(2)+" "+t.getHand(2).GetRank());
		System.out.println(t.getHand(3)+" "+t.getHand(3).GetRank());
		System.out.println(t.getHand(4)+" "+t.getHand(4).GetRank());



	}

}
