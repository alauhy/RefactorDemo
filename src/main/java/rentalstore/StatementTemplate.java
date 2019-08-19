package rentalstore;

public abstract class StatementTemplate {
    abstract String printHeader();
    abstract String printFooter(double totalAmount, int frequentRenterPoints, String result);
    abstract String statement();
}
