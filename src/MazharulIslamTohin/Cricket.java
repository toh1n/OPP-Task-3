/*
Name    : Mazharul Islam Tohin
ID      : 2012020190
Section : 5(D)
Email   : cse_2012020190@lus.ac.bd
Date    : 11-09-2021
 */
package MazharulIslamTohin;

public class Cricket extends Sports {
    int over;
    String matchType;
    Player player1;
    Cricket(int over,String matchType,Player player1){
        this.matchType = matchType;
        this.over      = over;
        this.player1   = player1;
    }
    void display(){
        System.out.println("\nMatch type    : "+matchType+"\nOver          : "+over);
        System.out.println("Player Name   : "+player1.playerName +"\nJersey Number : " +player1.jerseyNumber);
    }

}
