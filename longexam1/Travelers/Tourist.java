package Travelers;
import Locations.*;


public interface Tourist {

    int budget = 0;

    void visit();

    void visit(Boracay boracay);
    void visit(BahayniMamiOni bahayniMamiOni);
    void visit(Baguio baguio);
    void visit(ChocolateHills chocolateHills);
    void visit(Manila manila);
    void visit(Tagaytay tagaytay);
    
    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}