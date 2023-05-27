package com.org;

public class IPL {

 public static void main(String[] args)
 {
  IPL ipl = new IPL();
  int mi =200 ,gt =290;
  ipl.play_qualifiers(mi,gt);
  ipl.play_qualifies2(mi,gt);
  
   
 }
 private void play_qualifies2(int mi, int gt) 
    {
 if(mi>gt)
 {
  int csk =210;
  mi = 205;
  if(csk>mi)
  {
   System.out.println("dhoni gets trophy");
  }
  else
  {
   System.out.println("rohit gets trophy");
  }
 }
 else
 {
  int csk =180;
  gt=165;
  if(csk>gt)
  {
   System.out.println("dhoni gets trophy1");
  }
 }
  
 }
 private void play_qualifiers(int team1,int team2)
 {
 if(team1>team2)
 {
  System.out.println("mi enters final");
 }
 else
 {
  System.out.println("gt enters final");
 }
}
}