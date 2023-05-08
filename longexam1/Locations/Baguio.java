package Locations;
import Travelers.Tourist;

public class Baguio implements Locations{
   public int airFare = 300;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
    
}
