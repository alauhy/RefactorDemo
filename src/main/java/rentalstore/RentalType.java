package rentalstore;

public abstract class RentalType {
    private Movie movie;
    private int dayRented;
    private String result = "";
    private double totalAmount = 0;
    int frequentRenterPoints = 0;

    public abstract double getAmount(RentalType each, double thisAmount);


    public RentalType(Movie movie, int dayRented) {
        this.movie = movie;
        this.dayRented = dayRented;
        getBody();
    }

    public double getTotalAmount() {
        return totalAmount;
    }


    public int getFrequentRenterPoints() {
        return frequentRenterPoints;
    }


    public void getBody() {

        this.totalAmount = getAmount( this, totalAmount);

        this.frequentRenterPoints = getFrequentRenterPoints(this);

    }

    private int getFrequentRenterPoints(RentalType each) {
        int frequentRenterPoints = 1;
        if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDayRented() > 1) {
            frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }


    public Movie getMovie() {
        return movie;
    }

    public int getDayRented() {
        return dayRented;
    }

}
