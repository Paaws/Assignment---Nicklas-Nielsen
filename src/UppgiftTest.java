import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UppgiftTest {

    @Test
    public void testGetRows() { //Test för att kolla om antalet rader ökas

        //Arrange
        Count myRowCount = new Count();


        //Act
        myRowCount.increaseRows();
        int actual = myRowCount.getRows();

        //Assert
        int expected = 1;

        assertEquals(expected, actual);

    }

    @Test
    public void testGetLetters() { //Test för att kolla om antalet inmatade tecken ökas

        //Arrange
        Count myLetterCount = new Count();

        //Act
        myLetterCount.increaseLetters("Hej");
        myLetterCount.increaseLetters("Hejsan");
        int actual = myLetterCount.getLetterAmount();

        //Assert
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void testIsStop() { //Test för att kolla om stop funktionen funkar

        //Arrange
        String stop = "stop";

        Count myStopLookOut = new Count();

        //Act

        boolean actual = myStopLookOut.isStop(stop);

        //Assert
        boolean expected = true;

        assertEquals(expected, actual);
    }

}
