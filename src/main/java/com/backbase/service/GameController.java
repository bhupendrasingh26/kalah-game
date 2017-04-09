package com.backbase.service;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.backbase.kalah.GamePlay;
import com.backbase.kalah.KalahGame;

@RestController
@RequestMapping("/kalah")
public class GameController {

  @RequestMapping("/start")
  public KalahGame startKalah() {
    return KalahGame.init();

  }

  @RequestMapping(value = "/play" , method=RequestMethod.POST , consumes="application/json")
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


