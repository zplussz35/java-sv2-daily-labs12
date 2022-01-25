package day02;

import java.util.Scanner;

public class MathAlgorithms {

    public int lnko(int n1,int n2){
        try{
            int small= Math.min(n1, n2);
            int big=Math.max(n1,n2);

            if(small==0||big==0){
                throw new IllegalArgumentException("0 val nem osztunk!");
            }

            if(big%small==0){
                return small;
            }
            for (int i = small/2; i >=1 ; i--) {
                if(small%i==0&&big%i==0){
                    return i;
                }
            }
        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }

        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Adjon meg 2 számot: a= ");
        int n1=sc.nextInt();
        sc.nextLine();
        System.out.print("b= ");
        int n2=sc.nextInt();
        sc.nextLine();

        MathAlgorithms m = new MathAlgorithms();
        System.out.println(m.lnko(n1,n2));
    }
}
