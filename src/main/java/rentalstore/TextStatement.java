package rentalstore;

public class TextStatement extends StatementTemplate {
    private Customer customer;

    public TextStatement(Customer customer) {
        this.customer = customer;
    }

    @Override
    String printHeader() {
        return "Rental Record for " + customer.getName() + "\n";
    }

    @Override
    String printFooter(double totalAmount, int frequentRenterPoints, String result) {
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return result;
    }

    @Override
    String statement() {
        String result = "";
        double totalAmount = 0;
        int frequentRenterPoints = 0;

        result += printHeader();

        for (RentalType each : customer.getRentals()) {
            totalAmount += each.getTotalAmount();
            frequentRenterPoints += each.getFrequentRenterPoints();
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(totalAmount) + "\n";
        }
        result = printFooter(totalAmount, frequentRenterPoints, result);
        return result;
    }
}
