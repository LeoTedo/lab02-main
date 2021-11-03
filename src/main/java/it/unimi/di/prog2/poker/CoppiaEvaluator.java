package it.unimi.di.prog2.poker;

import ca.mcgill.cs.stg.solitaire.cards.Card;
import ca.mcgill.cs.stg.solitaire.cards.Rank;

import java.util.EnumMap;

public class CoppiaEvaluator implements Valutatore{
    private final Valutatore next;

    public CoppiaEvaluator(Valutatore nextEvaluator){
        assert nextEvaluator!= null;
        next = nextEvaluator;    }
    @Override
    public PokerHand.HandRank evaluate(PokerHand hand) {
        EnumMap<Rank, Boolean> present = new EnumMap<>(Rank.class);
        for (Card card : hand) {
            if (present.getOrDefault(card.getRank(), false))
                return PokerHand.HandRank.ONE_PAIR;
            else
                present.put(card.getRank(), true);
        }
        return next.evaluate(hand);
    }

}
