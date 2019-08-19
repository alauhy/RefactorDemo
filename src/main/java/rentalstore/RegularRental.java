package rentalstore;

public class RegularRental extends RentalType {

    public RegularRental(Movie movie, int dayRented) {
        super(movie, dayRented);
    }

    @Override
    public double getAmount(RentalType each, double thisAmount) {
        thisAmount += 2;
        if (each.getDayRented() > 2) {
            thisAmount += (each.getDayRented() - 2) * 1.5;
        }
        return thisAmount;
    }
}
