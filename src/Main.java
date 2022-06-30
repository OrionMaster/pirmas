import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {


        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Prasau pasakyk ka nors");
            int inputInt = 0;

            try {
                inputInt = sc.nextInt();
            }catch (Exception e){
                System.out.println("wrong input format");
            }

            System.out.println("Labai gerai, tu pasakei " + inputInt);



        }






    }
