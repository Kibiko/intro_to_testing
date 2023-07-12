import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MainTest {

    @Test     //ANNOTATIONS - put above a method to have some special behaviour to exhibit
    public void myFirstTest(){
        // BDD -behaviour driven development

        //Given... (Arrange)
        String input = "HElLo";
        //When... (Act)
        String actual = input.toLowerCase();
        //Then... (Assert)
        String expected = "hello";
        assertThat(actual).isEqualTo(expected);
    }

}
