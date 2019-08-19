package rentalstore;

public class HtmlStatement extends StatementTemplate {
    private Customer customer;

    public HtmlStatement(Customer customer) {
        this.customer = customer;
    }

    @Override
    String printHeader() {
        return "<H1>Rental Record for <EM>" + customer.getName() + "</EM></H1><P>";

    }

    @Override
    String printFooter(double totalAmount, int frequentRenterPoints, String result) {
        result += "<P>You owe<EM>" + String.valueOf(totalAmount) + "</EM><P>";
        result += "On this rental you earned <EM>" + String.valueOf(frequentRenterPoints) + "</EM> frequent renter points<P>";
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
            result += each.getMovie().getTitle() + ": " + String.valueOf(totalAmount) + "<BR>";
        }
        result = printFooter(totalAmount, frequentRenterPoints, result);
        return result;
    }
}
