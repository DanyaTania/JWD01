import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;

import static jdk.nashorn.internal.objects.Global.print;

@RunWith(value= Parameterized.class)
public class Task110Test {
    private double a;
    private double b;
    private double h;
    private double[] expectedX;
    private double[] expectedF;


    @Parameters
    public static Collection<Object[]>  multipleTableVales( ) {
        return Arrays.asList(new Object[][]{
                //{1,2,0.5,{1.0,1.5,2.0},{1.5574077246549023,14.101419947171719,-2.185039863261519}  },
                {1,2,0.5,null,null},
                {2,2,0,null,null}
                //{14,3000,0}

        });
    }

    public Task110Test(double v, double vv, double vvv, double[] expectedX, double[] expectedF) {
        this.a = v;
        this.b = vv;
        this.h=vvv;
        this.expectedX = expectedX;
        this.expectedF=expectedF;
    }

    @Test
    public void functionTest001() {
        double[]    actualX;
        double[] actualF;
        actualX = new Task110(a,b,h).getX();
        Assert.assertEquals(expectedX, actualX);
        actualF = new Task110(a,b,h).getF();
        Assert.assertEquals(expectedF, actualF);
    }
     @Test
        public void print(){
    }
    }
