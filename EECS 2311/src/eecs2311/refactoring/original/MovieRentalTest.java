package eecs2311.refactoring.original;

import static org.junit.Assert.*;
import org.junit.Test;

public class MovieRentalTest {

    @Test
	public void test1() {
		Customer bil = new Customer("Bil");
		Movie lotr = new Movie("Lord of the Rings", 1);
		Movie ug = new Movie("UnderGround",0);
		Rental r1 = new Rental(lotr,2);
		Rental r2 = new Rental(ug,6);
		bil.addRental(r1);
		bil.addRental(r2);
        String expectedStatement = "Rental Record for Bil\n  Lord of the Rings 6.0\n  UnderGround 8.0\nAmount owed is 14.0\nYou earned 3 frequent renter points";
		System.out.println(bil.statement());
        assertEquals(expectedStatement, bil.statement());
	}
}