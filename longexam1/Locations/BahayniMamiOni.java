package Locations;
import Travelers.Tourist;

public class BahayniMamiOni implements Locations {
    public int airFare = 400;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}