import java.util.Scanner;
public class Program04 {
    public static void main(String args[])
    {
        Scanner stdIn = new Scanner(System.in);
        String pN;

        System.out.print("Please enter a phone number +38(0xx)xxx-xxxx :");
        pN = stdIn.nextLine();
        char a = pN.charAt(1);
        char b = pN.charAt(2);
        char c = pN.charAt(3);
        char d = pN.charAt(5);
        char e = pN.charAt(6);
        char f = pN.charAt(7);
        char g = pN.charAt(9);
        char h = pN.charAt(10);
        char i = pN.charAt(11);
        char j = pN.charAt(12);



        if (pN.length() == 13 && pN.charAt(0)=='(' && pN.charAt(4)== ')' && pN.charAt(8)=='-')
        {




            if (a>=0 && a<=9)
            {
                if (b>=0 && b<=9)
                {
                    if (c>=0 && c<=9)
                    {
                        if (d>=0 && d<=9)
                        {
                            if (e>=0 && e<=9)
                            {
                                if (f>=0 && f<=9)
                                {
                                    if (g>=0 && g<=9)
                                    {
                                        if (h>=0 && h<=9)
                                        {
                                            if (i>=0 && i<=9)
                                            {
                                                if (j>=0 && j<=9)
                                                {

                                                    System.out.print("This is a valid phone number!");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }


        }


        else System.out.println("Not a vaid phone number.");
    }

}