import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;

@RunWith(value= Parameterized.class)
public class Task109Test {
    private float radius;
    private double expectedCircumference;
    private double expectedTheAreaOfACircle;


    @Parameters
    public static Collection<Object[]>  isOddTableVales( ) {
        return Arrays.asList(new Object[][]{

                {2001,12572.653799666352,1.2578940126566185E7},
                {3000,18849.55592153876,2.8274333882308137E7},
                {21,131.94689145077132,1385.442360233099},
                {281,1765.5750713174637,248063.29752010363}
                /*{14,3000452345L,0,1, true},
                {12,233222222222222222L,32,32,true},
                {2,2001,28,-1000000000000000L,true},
                {14,300021,0,2,true}*/



        });
    }

    public Task109Test(float v, double expectedCircumference, double expectedTheAreaOfACircle) {
        this.radius = v;
        this.expectedCircumference = expectedCircumference;
        this.expectedTheAreaOfACircle = expectedTheAreaOfACircle;

    }

    @Test
    public void CalculationsTest001() {
        double actualCircumference=0;
        double actualTheAreaOfACircle=0;
        actualCircumference = new Task109(radius).getCircumference();
        Assert.assertEquals(expectedCircumference, actualCircumference,0);
        actualTheAreaOfACircle=new Task109(radius).getTheAreaOfACircle();
        Assert.assertEquals(expectedTheAreaOfACircle, actualTheAreaOfACircle,0);

    }
}