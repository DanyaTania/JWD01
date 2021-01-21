//	Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится ближе к началу координат. x y
import java.lang.Math.*;
public class Task107 {
    private char answer='?';
    public char getAnswer(){
        return this.answer;
    }
        public Task107(double x1, double y1,double x2,double y2){

            double distance1=Math.sqrt(x1*x1+y1*y1);
            double distance2=Math.sqrt(x2*x2+y2*y2);

            if (distance1<=distance2) answer='A'; //System.out.println("A");
            else answer='B';//System.out.println("B");

        }}

