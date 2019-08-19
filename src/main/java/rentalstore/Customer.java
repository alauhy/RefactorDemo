package rentalstore;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<RentalType> rentals = new ArrayList<>();


    public Customer(String name) {
        this.name = name;
    }

    public void addRental(RentalType arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public List<RentalType> getRentals() {
        return rentals;
    }

    public String statement() {
        TextStatement textStatement = new TextStatement(this);
        return textStatement.statement();
    }

    public String htmlStatement() {
        HtmlStatement htmlStatement = new HtmlStatement(this);
        return htmlStatement.statement();

    }


}
