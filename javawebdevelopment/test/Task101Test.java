

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;

@RunWith(value= Parameterized.class)
public class Task101Test {
    private String v;
    private String expected;


    @Parameters
    public static Collection<Object[]>  multipleTableVales( ) {
        return Arrays.asList(new Object[][]{
                {"23231","1"},
                {"34532452","4"},
                {"4353453","9"},
                {"453454","6"},
                {"4534545","5"},
                {"4534546","6"},
                {"34543356756756756756453547","9"},
                {"4534548","4"},
                {"4534549","1"},
                {"34543345cFDF3547",""},
        });
    }

    public Task101Test(String v, String expected) {
        this.v = v;
        this.expected = expected;
    }

    @Test
    public void MultipleTest001() {
        String     actual="";
        actual = new Task101(v).getNumber();
        Assert.assertEquals(expected, actual);
    }

}