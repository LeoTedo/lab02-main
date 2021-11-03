package it.unimi.di.prog2.poker;

import ca.mcgill.cs.stg.solitaire.cards.Deck;

import java.util.Arrays;
import java.util.Iterator;

public class PokerTable implements Iterable<PokerHand>{

    @Override
    public Iterator iterator() {
        return Arrays.stream(tavolo).iterator();
    }

    private int players;
    public PokerHand[] tavolo;
    public PokerHand p;

  public PokerTable(int players, PokerHand p, Deck d){
      tavolo = new PokerHand[players];
      for (int i = 0; i < players && !d.isEmpty(); i++) {
          tavolo[i] = new PokerHand(d, 5);
      }
    }

    @Override
    public String toString() {
        return "PokerTable{" +
                "players=" + players +
                ", tavolo=" + Arrays.toString(tavolo) +
                '}';
    }

    PokerHand getHand(int i){
      assert i>=0 && i < players;
      return tavolo[i];
    }

    PokerHand[] allRanks(PokerTable t){
        PokerHand[] tavoloOrd = new PokerHand[players];
        for (int i = 0; i < t.players; i++) {
            int k=0;
            if (tavolo[i].GetRank() == PokerHand.HandRank.FLUSH){
                tavoloOrd[k] = tavolo[i];
                k++;
            } if (tavolo[i].GetRank() == PokerHand.HandRank.TWO_PAIR){
                tavoloOrd[k] = tavolo[i];
                k++;
            } if (tavolo[i].GetRank() == PokerHand.HandRank.HIGH_CARD){
                tavoloOrd[k] = tavolo[i];
                k++;
            }
        }
        return tavoloOrd;
    }
}
