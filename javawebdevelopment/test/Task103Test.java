import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;

@RunWith(value= Parameterized.class)
public class Task103Test {
    private double square;
    private int expected;


    @Parameters
    public static Collection<Object[]>  countSquare( ) {
        return Arrays.asList(new Object[][]{
                {1,2},
                {200,2},
                {0,0},
                {-1,0},
                {14.4,2}

        });
    }

    public Task103Test(double square, int expected) {
        this.square=square;
        this.expected = expected;
    }

    @Test
    public void countSquareTest001() {
        int    actual=0;
        actual = new Task103(square).getSquareSquare();
        Assert.assertEquals(expected, actual);
    }
}
