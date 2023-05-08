package Locations;
import Travelers.Tourist;

public class Manila implements Locations {
    public int airFare = 50;
    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
