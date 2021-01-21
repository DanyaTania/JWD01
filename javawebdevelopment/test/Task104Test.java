import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;

@RunWith(value= Parameterized.class)
public class Task104Test {
    private long a;
    private long b;
    private long c;
    private long d;
    private boolean expected;


    @Parameters
    public static Collection<Object[]>  isOddTableVales( ) {
        return Arrays.asList(new Object[][]{
                {1,2,32,3,true},
                {2,2001,28,1,true},
                {14,3000,0,2,true},
                {1,21,32,3,false},
                {2,-2001,281,1,false},
                {14,3000452345L,0,1, true},
                {12,233222222222222222L,32,32,true},
                {2,2001,28,-1000000000000000L,true},
                {14,300021,0,2,true}



        });
    }

    public Task104Test(long v, long vv, long vvv, long vvvv, boolean expected) {
        this.a = v;
        this.b = vv;
        this.c = vvv;
        this.d=vvvv;
        this.expected = expected;
    }

    @Test
    public void ifOddTest001() {
        boolean actual=false;
        actual = new Task104(a,b,c,d).getisOdd();
        Assert.assertEquals(expected, actual);
    }
}