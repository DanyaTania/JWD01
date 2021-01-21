//Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие значения функции.
import java.lang.Math.*;
public class Task110 {
    private double[] F=null;
    private double[] X=null;
    public double[] getF(){
    return this.F;
}
    public  double[] getX(){
    return this.X;
}

public Task110(double a,double b,double h){
        if (b-a==0) throw new IllegalArgumentException("Try smth else a-b=0!!!");
        double[] F=new double[(int) (Math.abs(b-a)/h)+1];
        double[] X=new double[(int) (Math.abs(b-a)/h)+1];
                int i=0;
                double x=a;
                while (x<=b) {
                F[i]=Math.tan(x);
                X[i]=x;
                x+=h;
            }
    this.F=F;
    this.X=X;
        }
    public void print(double[]X, double[]F){
        for (int i=0;i<X.length;i++){
            System.out.println(X[i]+"  "+ F[i]);
        }

    }
}

