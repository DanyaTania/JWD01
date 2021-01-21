import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;

@RunWith(value= Parameterized.class)
public class Task107Test {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private char expected;


    @Parameters
    public static Collection<Object[]>  isOddTableVales( ) {
        return Arrays.asList(new Object[][]{
                {1,2,-3,-3,'A'},
                {-2,2,3,-3,'A'},
                {3,0,2,0,'B'},
                {3.5,0,2.5,0,'B'},
        });
    }

    public Task107Test(double v, double vv, double vvv, double vvvv, char expected) {
        this.x1 = v;
        this.y1 = vv;
        this.x2 = vvv;
        this.y2=vvvv;
        this.expected = expected;
    }

    @Test
    public void isGreaterTest001() {
        char actual;
        actual = new Task107(x1,y1,x2,y2).getAnswer();
        Assert.assertEquals(expected, actual);
    }
}