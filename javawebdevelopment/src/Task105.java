//	Составить программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае: является ли целое число совершенным (сумма делителей равна самому числу).
public class Task105{
private boolean isFrandly=false;
public boolean getisFrandly(){
    return this.isFrandly;
}

public Task105(long number) {
    long sum_of_divisors = 0;
    long divisor = 1;
    for (divisor = 1; divisor < number; divisor++) {
        MathHelp.isDivisor(number, divisor);
        if (MathHelp.isDivisor(number, divisor) == true) {
            sum_of_divisors += divisor;
        }
    }
    if (sum_of_divisors == number) this.isFrandly=true;

}


    }