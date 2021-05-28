package coe318.lab5;

import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

  @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

  @Override
    public void display() {
        System.out.println("House holds:");
        System.out.println(game.getHouseCards());
        System.out.println("You hold:");
        System.out.println(game.getYourCards());
    }

  @Override
    public boolean hitMe() {
        boolean hit=false;
        String answer ;
        System.out.println("Do you want another card (Y/N) ?");
        answer = user.nextLine();
        switch(answer){
            case("N"):
                hit = false;
                break;
            case("Y"):
                hit = true;
                break;
            default:
                System.out.println("You must enter either Y or N");
                hitMe();
                break;
            }
        return hit;   
        }
        
    
    

  @Override
    public void gameOver() {
        int houseScore, yourScore;
        houseScore = game.score(game.getHouseCards());
        yourScore = game.score(game.getYourCards());
        System.out.println("House Cards: " + game.getHouseCards().toString());
        System.out.println("House Score: " + houseScore);
        System.out.println("Your Cards: " + game.getYourCards().toString());
        System.out.println("Your Score: " + yourScore);
        boolean winner = false;
        if (yourScore>21 || yourScore==houseScore){
            winner = false;
            System.out.println("You lose.");
        }
        else if (yourScore< 21&& houseScore<21){
            if(yourScore>houseScore){
                winner = true;
                System.out.println("Congratulations, you win!");
            }
            else{ 
                winner = false;
                System.out.println("You lose.");
            }        
        }
        else {
            winner = true;
            System.out.println("Congratulations, you win!");
        }
            winner = true;
        

//        System.out.println(winner);
//        
//        if (winner = true){
//            System.out.println("Congratulations, you win!");
//        }   
//        else 
//            System.out.println("You lose.");
//            
//    }

}
}
        