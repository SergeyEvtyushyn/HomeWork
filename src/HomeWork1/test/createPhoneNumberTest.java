package HomeWork1.test;

import HomeWork1.createPhoneNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class createPhoneNumberTest {

    @Test
    public void phoneInsertion(){

        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

        Assertions.assertEquals("Phone number: (123) 456-7890", createPhoneNumber.createPhoneNumber_(array));

    }
}
