import java.util.Scanner;

public class Calculator {


        public static void main(String[] args) {

            Scanner sc =  new Scanner(System.in);

            System.out.println("nermutceq arajin tivy");
            double a =  sc.nextDouble();
            System.out.println(a);

            System.out.println("nermutceq erkrord tivy");
            double b =   sc.nextDouble();
            System.out.println(b);


            double y = a + b;
            double t =  a / b;
            long klorTiv = (long) (a / b);
            long patasxan = (long) (a - (klorTiv * b));
            double k = a * b;
            double v = a - b;





            String user =   a +" ev " + b   + " tvi gumary " + (y) ;
            String userInput =   a +" ev " + b   + " tvi qannordy " + (t) ;
            String input = a +" ev " + b + " tvi mnacordy " + (patasxan);
            String userinput =   a +" ev " + b   + " tvi artadryaly " + (k) ;
            String Input =   a +" ev " + b   + " tvi tarberutyuny " + (v) ;

            System.out.println(user);
            System.out.println(userInput);
            System.out.println(input);
            System.out.println(userinput);
            System.out.println(Input);



        }


    }


