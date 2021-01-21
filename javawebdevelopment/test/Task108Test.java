import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;

@RunWith(value= Parameterized.class)
public class Task108Test {
    private float x;
    private float expected;


    @Parameters
    public static Collection<Object[]>  isOddTableVales( ) {
        return Arrays.asList(new Object[][]{
                {3,9},
                {33,-981}

        });
    }

    public Task108Test(float v, float expected) {
        this.x = v;
        this.expected = expected;
    }

    @Test
    public void FisEqualTest001() {
        float actual=0;
        actual = new Task108(x).getF();
        Assert.assertEquals(expected, actual,0);

    }
}