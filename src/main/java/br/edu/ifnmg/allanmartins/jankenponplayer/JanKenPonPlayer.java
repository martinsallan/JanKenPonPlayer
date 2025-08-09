package br.edu.ifnmg.allanmartins.jankenponplayer;
import io.github.guisso.jankenpon.AbstractPlayer;
import io.github.guisso.jankenpon.Move;
/**
 * Estratégia 100% reativa
 *
 * @author Allan Martins
 */
public class JanKenPonPlayer extends AbstractPlayer {

    @Override
    public String getDeveloperName(){
        return "Allan Martins";
    }

    @Override
    public Move makeMyMove(Move opponentPreviousMove){
        
        if(opponentPreviousMove == Move.NONE){
            return Move.ROCK;
        }

        switch(opponentPreviousMove){
            case ROCK:
                return Move.PAPER;
            
            case PAPER:
                return Move.SCISSORS;
            
            case SCISSORS:
                return Move.ROCK;
            
            default:
                return Move.ROCK;
        }
    }
}