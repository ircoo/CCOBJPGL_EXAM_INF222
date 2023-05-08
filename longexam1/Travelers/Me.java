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
            System.out.println("Proceeding to the next location...\n");
        } else if (budget < fare){
            checkBudget();
            System.out.println("Sorry... Not enough Budget"); 
        }else{
            checkBudget();
            System.out.println("Sorry... Out of Budget"); 
        }
}

    public void visit(Boracay boracay) {
        fare = boracay.airFare;
        System.out.println("WELCOME TO BORACAY");
        visit();   
    }public void visit(Baguio baguio) {
        fare = baguio.airFare;
        System.out.println("WELCOME TO BAGUIO");
        visit(); 
    }public void visit(BahayniMamiOni bahayniMamiOni) {
        fare = bahayniMamiOni.airFare;
        System.out.println("WELCOME TO BAHAY ni MAMI TONI");
        visit();  
    }public void visit(ChocolateHills chocolateHills) {
        fare = chocolateHills.airFare;
        System.out.println("WELCOME TO CHOCOLATE HILLS");
        visit(); 
    }public void visit(Manila manila) {
        fare = manila.airFare;
        System.out.println("WELCOME TO MANILA");
        visit();
    }public void visit(Tagaytay tagaytay) {
        fare = tagaytay.airFare;
        System.out.println("WELCOME TO TAGAYTAY");
        visit();
    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);
       
        
    }

}
