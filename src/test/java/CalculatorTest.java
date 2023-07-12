import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp(){     // Sets up before each test
        calculator = new Calculator();
    }

    @Test
    public void canAddNumbers(){
        //Given
        // This is set outside the tests under @BeforeEach
        //When
        int actual = calculator.add(4,9);
        //Then
        int expected = 13;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSubtractNumbers(){

        int actual = calculator.subtract(2,7);
        int expected = -5;
        assertThat(actual).isEqualTo(expected);
    }

}
