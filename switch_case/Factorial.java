import java.util.Scanner;

public class Factorial 
{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        int i,fact=1;
        int number;
        System.out.println("Enter Number");

        number = x.nextInt();
        x.close();
        for(i=1;i<=number;i++){
         fact=fact*i;
        }
        x.close();
        System.out.println(fact);
    }
}
