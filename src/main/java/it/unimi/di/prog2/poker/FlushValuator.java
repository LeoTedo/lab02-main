package it.unimi.di.prog2.poker;

import ca.mcgill.cs.stg.solitaire.cards.Card;
import ca.mcgill.cs.stg.solitaire.cards.Suit;

import java.util.Arrays;

public class FlushValuator implements Valutatore {
    private final Valutatore next;
    public FlushValuator(Valutatore nextEvaluator) {
        assert nextEvaluator != null;
        next = nextEvaluator;
    }

    @Override
    public PokerHand.HandRank evaluate(PokerHand p) {
       assert p != null;
       Suit suit = null;
       for (Card card : p){
           if (suit == null){
               suit = card.getSuit();
           } else if (suit != card.getSuit()){
               return next.evaluate(p);
           }
       }
        return PokerHand.HandRank.FLUSH;
    }
}
