package it.unimi.di.prog2.poker;

import ca.mcgill.cs.stg.solitaire.cards.Suit;

import java.util.Arrays;

public class FlushValuator implements Valutatore {
    public FlushValuator(Valutatore nextEvaluator) {
    }

    @Override
    public PokerHand.HandRank evaluate(PokerHand p) {
       // Suit suit = p.mano[0].getSuit();
        for (int i = 0; i < p.mano.length; i++) {
            if (p.mano[i].getSuit() != p.mano[i+1].getSuit()){
                return nextEvaluator.evaluate(p);
            }
        }

        return PokerHand.HandRank.FLUSH;
    }
}
