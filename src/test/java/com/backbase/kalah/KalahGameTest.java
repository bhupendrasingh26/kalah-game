package com.backbase.kalah;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class KalahGameTest {

  @Before
  public void setUp() throws Exception {
  }

  @Test
  public void testInit() {
    KalahGame startGame = KalahGame.init();
    int[] initialBoard =  new int[]{6,6,6,6,6,6,0,6,6,6,6,6,6,0};
    assertArrayEquals(initialBoard,startGame.getBoard());
    assertEquals(1, startGame.getPlayer1().getId());
    assertEquals(6, startGame.getPlayer1().getKalah());
    assertEquals(2, startGame.getPlayer2().getId());
    assertEquals(13, startGame.getPlayer2().getKalah());
    assertEquals(Status.PLAYER1TURN, startGame.getStatus());
  }

  @Test
  public void testPlayFirstMovePlayerOnePit1Selected() {
    KalahGame aGame = KalahGame.init();
    int[] expectedBoard =  new int[]{0,7,7,7,7,7,1,6,6,6,6,6,6,0};
    aGame.play(0);
    int[] actualBoard = aGame.getBoard();
    assertArrayEquals(expectedBoard,actualBoard);
    assertEquals(Status.PLAYER1TURN, aGame.getStatus());
   
  }
  
  @Test
  public void testPlayFirstMovePlayerOnePit2Selected() {
    KalahGame aGame = KalahGame.init();
    int[] expectedBoard =  new int[]{6,0,7,7,7,7,1,7,6,6,6,6,6,0};
    aGame.play(1);
    int[] actualBoard = aGame.getBoard();
    assertArrayEquals(expectedBoard,actualBoard);
    assertEquals(Status.PLAYER2TURN, aGame.getStatus());
  }
  
  @Test
  public void testPlayFirstMovePlayerOnePit3Selected() {
    KalahGame aGame = KalahGame.init();
    int[] expectedBoard =  new int[]{6,6,0,7,7,7,1,7,7,6,6,6,6,0};
    aGame.play(2);
    int[] actualBoard = aGame.getBoard();
    assertArrayEquals(expectedBoard,actualBoard);
    assertEquals(Status.PLAYER2TURN, aGame.getStatus());
   
  }
  
   
  @Test
  public void testPlayFirstMovePlayerOnePit6Selected() {
    KalahGame aGame = KalahGame.init();
    int[] expectedBoard =  new int[]{6,6,6,6,6,0,1,7,7,7,7,7,6,0};
    aGame.play(5);
    int[] actualBoard = aGame.getBoard();
    assertArrayEquals(expectedBoard,actualBoard);
    assertEquals(Status.PLAYER2TURN, aGame.getStatus());
   
  }
    
  @Test
  public void testPlayerPlayerSeedFallOnKalah() {
    KalahGame aGame = KalahGame.init();
    int[] expectedBoard =  new int[]{0,7,7,7,7,7,1,6,6,6,6,6,6,0};
    aGame.play(0);
    int[] actualBoard = aGame.getBoard();
    assertArrayEquals(expectedBoard,actualBoard);
    assertEquals(Status.PLAYER1TURN, aGame.getStatus());
   
  }
  
  @Test
  public void testPlayerPlayerSeedSkipOppositePlayerKalah() {
    KalahGame aGame = KalahGame.init();
    int[] expectedBoard =  new int[]{0,7,7,7,7,7,1,6,6,6,6,6,6,0};
    aGame.play(0);
    int[] actualBoard = aGame.getBoard();
    assertArrayEquals(expectedBoard,actualBoard);
    assertEquals(Status.PLAYER1TURN, aGame.getStatus());
   
  }
  
  @Test
  public void testPlayerSeedFallsAtEmptyPit() {
    KalahGame aGame = KalahGame.init();
    int[] expectedBoard =  new int[]{0,0,8,8,8,8,10,0,8,7,7,0,7,1};
    aGame.play(0);
    aGame.play(1);
    aGame.play(7);
    aGame.play(0);
    int[] actualBoard = aGame.getBoard();
    assertArrayEquals(expectedBoard,actualBoard);
    assertEquals(Status.PLAYER2TURN, aGame.getStatus());
   
  }
  @Test
  public void testPlayer2Turn() {
    KalahGame aGame = KalahGame.init();
    int[] expectedBoard =  new int[]{6,0,7,7,7,7,1,7,6,6,6,6,6,0};
    aGame.play(1);
    int[] actualBoard = aGame.getBoard();
    assertArrayEquals(expectedBoard,actualBoard);
    assertEquals(Status.PLAYER2TURN, aGame.getStatus());
   
  }
   
}
