import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int min = -1; //test
        int max = -1;
        int middle = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Vasya\'s age");
        int VasyaAge = sc.nextInt();
        System.out.println("Enter Misha\'s age");
        int MishaAge = sc.nextInt();
        System.out.println("Enter Katya\'s age");
        int KatyaAge = sc.nextInt();
        if (VasyaAge < MishaAge)
         {
             min = VasyaAge;
             max = MishaAge;
         }
        else {
            max = VasyaAge;
            min = MishaAge;
        }
        if (max < KatyaAge)
        {
            middle = max;
            max = KatyaAge;
        }
       else if (KatyaAge < min)
        {
            middle = min;
            min = KatyaAge;
        }
           else
        {
            middle = KatyaAge;
        }

        System.out.println(min);
        System.out.println(middle);
        System.out.println(max);

    }
}
