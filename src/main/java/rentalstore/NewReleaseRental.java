package rentalstore;

public class NewReleaseRental extends RentalType {

    public NewReleaseRental(Movie movie, int dayRented) {
        super(movie, dayRented);
    }

    @Override
    public double getAmount(RentalType each, double thisAmount) {
        thisAmount += each.getDayRented() * 3;
        return thisAmount;
    }
}
