package com.backbase.kalah;

public class KalahPlayer {
  
  private int id ; 
  
  private int kalah ;
  
  public KalahPlayer() {
    
  }
  
  public KalahPlayer(int id, int kalah) {
    this.id = id;
    this.kalah = kalah;
  }
  
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getKalah() {
    return kalah;
  }
  public void setKalah(int kalah) {
    this.kalah = kalah;
  } 
  
  public boolean isMyKalah(int pit){
     return kalah == pit;
  }
  public boolean isMyPit(int pit){
    if(id == 1)
      return 0 <= pit && pit <= 5;
    else      
      return 7 <= pit && pit <= 12;
 }
  
}
