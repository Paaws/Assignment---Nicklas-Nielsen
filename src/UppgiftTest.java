import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UppgiftTest {

    @Test
    public void testGetRows() {

        //Arrange


        Count myRowCount = new Count();


        //Act
        int actual = myRowCount.getRows();

        //Assert
        int expected = 1;

        assertEquals(expected, actual);

    }

    @Test
    public void testGetLetters() {

        //Arrange


        Count myLetterCount = new Count();

        //Act
        myLetterCount.increaseLetters("Hej");
        myLetterCount.increaseLetters("Hejsan");
        int actual = myLetterCount.getLetterAmount();

        //Assert
        int expected = 9;

        assertEquals(expected,actual);
    }

    @Test
    public void testIsStop() {

        //Arrange
        String letter = "stop";

        Count myStopLookOut = new Count();

        //Act

        boolean actual = myStopLookOut.isStop(letter);

        //Assert
        boolean expected = true;

        assertEquals(expected,actual);
    }
}
