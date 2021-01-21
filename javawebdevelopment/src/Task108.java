//	Вычислить значение функции

public class Task108 {
    private float F=0;
    public float getF(){
        return this.F;
    }

   public Task108(float x) {


       if (x >= 3) {
           F = -x * x + 3 * x + 9;
       } else
       {F=(float) 1/(x*x*x-1);}


        }}

