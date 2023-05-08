package Locations;
import Travelers.Tourist;

public class Boracay implements Locations {
    public int airFare = 100;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}