package stalls;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity, IReviewed {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }


    @Override
    public int getRating() {
        return 0;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge() >= 18) {
            return true;
        }
     else {
        return false;
        }
    }
}
