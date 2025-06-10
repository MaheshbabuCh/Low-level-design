package MachineCoding.Tictactoe.Strategies.WinningStrategies;

import MachineCoding.Tictactoe.Models.Board;
import MachineCoding.Tictactoe.Models.Move;

public interface WinningStrategy {
    /**
     * Checks if the current player has won the game.
     *
     * @return true if the current player has won, false otherwise
     */
    public boolean checkWinner(Board board, Move move);
}
