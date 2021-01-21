//	Идет n-я секунда суток, определить, сколько полных часов, полных минут и секунд прошло к этому моменту
public class Task106{
    private int hours=0;
    private int minutes=0;
    public int getHours(){
        return this.hours;
    }
    public int getMinutes(){
        return this.minutes;
    }
public  Task106(long seconds) {
        if (seconds>3600*24) throw new IllegalArgumentException("Enter value should be not greater then 3600*12");
        else {
            this.hours = (int) (seconds / 3600);
            this.minutes = (int) (seconds / 60 - 60 * hours);
            //System.out.println(" It is "+hours+" hours "+minutes+" minutes");
        }
    }

}