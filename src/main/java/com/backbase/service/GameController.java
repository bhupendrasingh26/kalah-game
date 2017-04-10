package com.backbase.service;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.backbase.kalah.GamePlay;
import com.backbase.kalah.KalahGame;

/**
 * This class exposes RESTFul end-points which are used to by client to
 * communicate with service.
 * 
 * 
 * @author Bhupendra
 *
 */
@RestController
@RequestMapping("/kalah")
public class GameController {

  /**
   * This service end-point initialize and starts a new Game.
   * 
   * @return KalahGame object with each pit populated with 6-Stones is returned.
   * 
   */
  @RequestMapping("/start")
  public KalahGame startKalah() {
    return KalahGame.init();

  }

  /**
   * This service end-point makes a play of the game and change the game state
   * according the selected pit by a player.
   * 
   * @return Updated KalahGame object from the move made a player.
   */
  @RequestMapping(value = "/play", method = RequestMethod.POST, consumes = "application/json")
  public KalahGame play(@RequestBody GamePlay aPlay) {
    KalahGame game = aPlay.getGame();
    int pit = aPlay.getPit();
    if (game.isValidMove(pit)) {
      aPlay.getGame().play(pit);
    } else {
      game.setMessage("Wrong move!!!");
    }
    return game;
  }

}
