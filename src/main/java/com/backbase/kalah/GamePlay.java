package com.backbase.kalah;

/**
 * Serves as transfer object for a game play.
 *
 * @author Bhupendra
 */
public class GamePlay {
  
  /**
   * Pit selected by the player.
   */
  private int pit;
  
  /**
   * Current game state.
   */
  private KalahGame game;

  public int getPit() {
    return pit;
  }

  public void setPit(int pit) {
    this.pit = pit;
  }

  public KalahGame getGame() {
    return game;
  }

  public void setGame(KalahGame game) {
    this.game = game;
  }

}
