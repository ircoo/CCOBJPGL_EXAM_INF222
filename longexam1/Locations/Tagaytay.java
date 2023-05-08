package Locations;
import Travelers.Tourist;

public class Tagaytay implements Locations {
    public int airFare = 160;
    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
