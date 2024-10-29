package elevator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FailingTest {
    @Test
    public void failingTest(){
        Assertions.assertThat("this").isEqualTo("is not equal to this");
    }
}
