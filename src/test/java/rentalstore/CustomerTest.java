package rentalstore;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {
    @Test
    public void should_return_amount_9_and_frequent_points_2_text_when_rental_given_movie_new_release_and_rent_3_days() {
        Customer customer = new Customer("murphy");
        Movie movie = new Movie("aaa", Movie.NEW_RELEASE);
        RentalType rental = new NewReleaseRental(movie, 3);
        customer.addRental(rental);

        String result = customer.statement();

        Assert.assertEquals("Rental Record for murphy\n\taaa\t9.0\nAmount owed is 9.0\nYou earned 2 frequent renter points",result);
    }
    @Test
    public void should_return_amount_3_and_frequent_points_1_text_when_rental_given_movie_childrens_and_rent_4_days() {
        Customer customer = new Customer("murphy");
        Movie movie = new Movie("aaa", Movie.CHILDRENS);
        RentalType rental = new ChildrenRental(movie, 4);
        customer.addRental(rental);

        String result = customer.statement();

        Assert.assertEquals("Rental Record for murphy\n\taaa\t3.0\nAmount owed is 3.0\nYou earned 1 frequent renter points",result);
    }
     @Test
    public void should_return_amount_1point5_and_frequent_points_1_text_when_rental_given_movie_childrens_and_rent_3_days() {
        Customer customer = new Customer("murphy");
        Movie movie = new Movie("aaa", Movie.CHILDRENS);
         RentalType rental = new ChildrenRental(movie, 3);
        customer.addRental(rental);

        String result = customer.statement();

        Assert.assertEquals("Rental Record for murphy\n\taaa\t1.5\nAmount owed is 1.5\nYou earned 1 frequent renter points",result);
    }
    @Test
    public void should_return_amount_2_and_frequent_points_1_text_when_rental_given_movie_regular_and_rent_2_days() {
        Customer customer = new Customer("murphy");
        Movie movie = new Movie("aaa", Movie.REGULAR);
        RentalType rental = new RegularRental(movie, 2);
        customer.addRental(rental);

        String result = customer.statement();

        Assert.assertEquals("Rental Record for murphy\n\taaa\t2.0\nAmount owed is 2.0\nYou earned 1 frequent renter points",result);
    }
    @Test
    public void should_return_amount_3point5_and_frequent_points_1_text_when_rental_given_movie_regular_and_rent_3_days() {
        Customer customer = new Customer("murphy");
        Movie movie = new Movie("aaa", Movie.REGULAR);
        RentalType rental = new RegularRental(movie, 3);
        customer.addRental(rental);

        String result = customer.statement();

        Assert.assertEquals("Rental Record for murphy\n\taaa\t3.5\nAmount owed is 3.5\nYou earned 1 frequent renter points",result);
    }
    @Test
    public void should_return_amount_0_and_frequent_points_0_text_when_rental_given_no_rental() {
        Customer customer = new Customer("murphy");

        String result = customer.statement();

        Assert.assertEquals("Rental Record for murphy\nAmount owed is 0.0\nYou earned 0 frequent renter points",result);
    }

    @Test
    public void should_return_amount_3point5_and_frequent_points_1_html_when_rental_given_movie_regular_and_rent_3_days() {
        Customer customer = new Customer("murphy");
        Movie movie = new Movie("aaa", Movie.REGULAR);
        RentalType rental = new RegularRental(movie, 3);
        customer.addRental(rental);

        String result = customer.htmlStatement();

        Assert.assertEquals("<H1>Rental Record for <EM>murphy</EM></H1><P>aaa: 3.5<BR><P>You owe<EM>3.5</EM><P>On this rental you earned <EM>1</EM> frequent renter points<P>",result);
    }
    @Test
    public void should_return_amount_0_and_frequent_points_0_html_when_rental_given_no_rental() {
        Customer customer = new Customer("murphy");

        String result = customer.htmlStatement();

        Assert.assertEquals("<H1>Rental Record for <EM>murphy</EM></H1><P><P>You owe<EM>0.0</EM><P>On this rental you earned <EM>0</EM> frequent renter points<P>",result);
    }

}
