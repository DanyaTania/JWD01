import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;

@RunWith(value= Parameterized.class)
public class Task106Test {
    private long seconds;
    private int expectedHours;
  private int expectedMinutes;


    @Parameters
    public static Collection<Object[]>  isOddTableVales( ) {
        return Arrays.asList(new Object[][]{
                {3600,1,0},
                {3209,0,53},
                {3600*24,24,0},
                {30003,8,20},
                {21352,5,55},
                {28153,7,49}
                /*{14,3000452345L,0,1, true},
                {12,233222222222222222L,32,32,true},
                {2,2001,28,-1000000000000000L,true},
                {14,300021,0,2,true}*/



        });
    }

    public Task106Test(long v, int expectedHours, int expectedMinutes){//, byte expectedMinutes) {
        this.seconds = v;
        this.expectedHours = expectedHours;
        this.expectedMinutes = expectedMinutes;

    }

    @Test
    public void HowMuchHoursTest001() {
        int actualHours=0;
        int actualMinutes=0;
        actualHours = new Task106(seconds).getHours();
        Assert.assertEquals(expectedHours, actualHours);
        actualMinutes=new Task106(seconds).getMinutes();
        Assert.assertEquals(expectedMinutes, actualMinutes);

    }
}