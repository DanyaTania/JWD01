public class Task101 {
private String number;
//Написать программу, позволяющую по последней цифре числа определить последнюю цифру его квадрата
public String getNumber() {
    return number;
}

    public Task101(String v) {




        //String        st=12354467896757;
        //   if (
        // try {
        //   st=
        //}
        String result="";
        if (MathHelp.isNumber(v)) {

            try
            {


                char lastDigit=v.charAt(v.length()-1);

                switch(lastDigit){

                    case '0':
                        System.out.println("last digit of square equal 0");
                        result="0";
                        break;
                    case '1':
                    case '9':
                        System.out.println("last digit of square equal 1");
                        result="1";
                        break;

                    case '2':
                    case '8':

                        System.out.println("last digit of square equal 4");
                        result="4";
                        break;

                    case '3':
                    case '7':
                        System.out.println("last digit of square equal 9");
                        result="9";
                        break;
                    case '5':
                        System.out.println("last digit of square equal 5");
                        result="5";
                        break;
                    case '6':
                        System.out.println("last digit of square equal 6");
                        result="6";
                        break;

                    default:
                        System.out.println("last digit of square equal "+(((int)lastDigit-48)*((int)lastDigit-48))%10);
                        int a=((((int)lastDigit-48)*((int)lastDigit-48))%10);
                        result=""+a;
                }

            }
            catch (NumberFormatException nfe)
            {
                System.out.println("NumberFormatException: " + nfe.getMessage());
            }
        }


        this.number=result;
    }

}

