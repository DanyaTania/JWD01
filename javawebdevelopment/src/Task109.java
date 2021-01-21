//Вычислить длину окружности и площадь круга одного и того же заданного радиуса R
import java.lang.Math.*;
public class Task109 {
    private double circumference;
    private  double theAreaOfACircle;
    public double getCircumference(){
        return this.circumference;
    }
    public double getTheAreaOfACircle(){
        return this.theAreaOfACircle;
    }
public Task109(float radius){

            circumference=2*Math.PI*radius;
            theAreaOfACircle=Math.PI*radius*radius;

        }}

