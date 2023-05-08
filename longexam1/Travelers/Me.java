package Travelers;
import Locations.*;

public class Me implements Tourist {

    static int budget = 1000;
    int fare;

    public void visit() {
       
        if (budget >= fare){
            budget -= fare;
            System.out.print("Enjoying my stay");
            System.out.println("..................");
            checkBudget();
            System.out.println("Proceeding to the next location...");
            System.out.println();
        } else if (budget < fare){
            System.out.println("Sorry... Not enough funds"); 
        }else{
            System.out.println("Sorry... Out of Budget"); 
        }
}

    public void visit(Boracay boracay) {
        fare = 100;
        System.out.println("WELCOME TO BORACAY");
        visit();   
    }public void visit(Baguio baguio) {
        fare = 300;
        System.out.println("WELCOME TO BAGUIO");
        visit(); 
    }public void visit(BahayniMamiOni bahayniMamiOni) {
        fare = 20;
        System.out.println("WELCOME TO BAHAY ni MAMI TONI");
        visit();  
    }public void visit(ChocolateHills chocolateHills) {
        fare = 150;
        System.out.println("WELCOME TO CHOCOLATE HILLS");
        visit(); 
    }public void visit(Manila manila) {
        fare = 50;
        System.out.println("WELCOME TO MANILA");
        visit();
    }public void visit(Tagaytay tagaytay) {
        fare = 500;
        System.out.println("WELCOME TO TAGAYTAY");
        visit();
    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);
       
        
    }

}