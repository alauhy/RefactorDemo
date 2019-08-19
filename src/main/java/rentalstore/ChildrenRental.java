package rentalstore;

public class ChildrenRental extends RentalType {

    public ChildrenRental(Movie movie, int dayRented) {
        super(movie, dayRented);
    }

    @Override
    public double getAmount(RentalType each, double thisAmount) {
        thisAmount += 1.5;
        if (each.getDayRented() > 3) {
            thisAmount += (each.getDayRented() - 3) * 1.5;
        }
        return thisAmount;
    }
}
