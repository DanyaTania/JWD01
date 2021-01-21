import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;

@RunWith(value= Parameterized.class)
public class Task105Test {
    private long number;
    private boolean expected;


    @Parameters
    public static Collection<Object[]>  isOddTableVales( ) {
        return Arrays.asList(new Object[][]{
                {33550336L,true},
                {28,true},
                {0,true},
                {3,false},
                {281,false},
               // {2305843009213693951L, true},
                {2322222L,false},
                {-1000000L,false},
               // {Math.pow(2,257)-1,true}



        });
    }

    public Task105Test(long v, boolean expected) {
        this.number = v;
        this.expected = expected;
    }

    @Test
    public void isPerfectNumberTest001() {
        boolean actual=false;
        actual = new Task105(number).getisFrandly();
        Assert.assertEquals(expected, actual);
    }
}