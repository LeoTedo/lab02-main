package it.unimi.di.prog2.poker;

public class HighRankEvaluator implements Valutatore {

    @Override
    public PokerHand.HandRank evaluate(PokerHand p) {
        return PokerHand.HandRank.HIGH_CARD;
    }
}
