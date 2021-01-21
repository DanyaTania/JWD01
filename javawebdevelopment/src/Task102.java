public class Task102 {
//Составить программу, которая по заданным году и номеру месяца определяет количество дней в этом месяце и корректно определялись все високосные года
private int days;

int getDays(){


    return days;
}

    public  Task102(int y, int x) {

        if (x > 12) {System.out.println("Months<12");}
        else {
            if ((x < 1) || (y < 0)) {
                System.out.println("0<Months<12, year>0");
            } else {
                this.days = (int) (28 + ((x + Math.floor(x / 8)) % 2) + 2 % x + Math.floor((1 + (1 - (y % 4 + 2) % (y % 4 + 1)) * ((y % 100 + 2) % (y % 100 + 1)) +
                        (1 - (y % 400 + 2) % (y % 400 + 1))) / x) + Math.floor(1 / x) - Math.floor(((1 - (y % 4 + 2) % (y % 4 + 1)) * ((y % 100 + 2) % (y % 100 + 1)) +
                        (1 - (y % 400 + 2) % (y % 400 + 1))) / x));
            }
        }
    }





        }



