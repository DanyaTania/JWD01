//	Составить программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае: среди заданных целых чисел А, В, С, D есть хотя бы два четных.
public class Task104 {
    private  boolean isOdd=false;
    public boolean getisOdd()
    {
        return this.isOdd;
    }
    public Task104(long a, long b, long c, long d) {
        byte count=0;
        if (a%2==0) count++;
        if (b%2==0) count++;
        if (c%2==0) count++;
        if (d%2==0) count++;
        if (count>=2) this.isOdd=true;

    }

   }

