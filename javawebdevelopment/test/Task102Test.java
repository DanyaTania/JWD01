import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;

@RunWith(value= Parameterized.class)
public class Task102Test {
    private int x;
    private int y;
    private int expected;


    @Parameters
    public static Collection<Object[]>  multipleTableVales( ) {
        return Arrays.asList(new Object[][]{
                {1,2,31},
                {2,2001,28},
                {14,3000,0}

        });
    }

    public Task102Test(int v, int vv, int expected) {
        this.x = v;
        this.y = vv;
        this.expected = expected;
    }

    @Test
    public void countDaysTest001() {
        int    actual=0;
        actual = new Task102(y,x).getDays();
        Assert.assertEquals(expected, actual);
    }
}