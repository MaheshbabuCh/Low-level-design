package MachineCoding.Tictactoe.Strategies.BotPlayingStrategies;

import MachineCoding.Tictactoe.Models.Board;
import MachineCoding.Tictactoe.Models.Cell;

/**
 * BotPlayingStrategy defines the contract for implementing different strategies
 * that a bot can use to make a move in the Tic Tac Toe game.
 * Implementations of this interface should provide logic for selecting the next move
 * based on the current state of the board.
 */
public interface BotPlayingStrategy {
    /**
     * Determines the next move for the bot based on the current board state.
     *
     * @param board the current state of the game board
     * @return the Cell where the bot decides to make its move
     */
    Cell makeMove(Board board);
}
