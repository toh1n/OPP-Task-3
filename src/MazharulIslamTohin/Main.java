/*
Name    : Mazharul Islam Tohin
ID      : 2012020190
Section : 5(D)
Email   : cse_2012020190@lus.ac.bd
Date    : 11-09-2021
 */
package MazharulIslamTohin;

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player(75,"Shakib");
        Cricket cricket = new Cricket(20,"International Match",player1);
        cricket.display();
        Football football = new Football();

    }
}
