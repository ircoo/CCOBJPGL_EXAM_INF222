package Locations;
import Travelers.Tourist;

public class ChocolateHills implements Locations {
    int airFare = 150;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
