import java.lang.Math.*;
//	Окружность вписана в квадрат заданной площади. Найти площадь квадрата, вписанного в эту окружность. Во сколько раз площадь вписанного квадрата меньше площади заданного?
public class Task103 {
private int squareSquare=0;
public int getSquareSquare(){
    return this.squareSquare;
}
public Task103(double square){
            //float square=Float.parseFloat(args[0]);
//            System.out.println(square);
    double diameter_of_the_inscribed_circle=Math.sqrt(square);
    double square_of_a_square_inscribed_in_a_circle=(double)1/2*diameter_of_the_inscribed_circle*diameter_of_the_inscribed_circle;

    squareSquare=(int)Math.round(square/square_of_a_square_inscribed_in_a_circle);



        }
}

