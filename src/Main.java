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
                System.out.println(e);
            }

            System.out.println("Labai gerai, tu pasakei " + inputInt);

/*      Vilniaus studentu registracijos systema
        Tam reikes:
        Objectines klases "Student"
        Jos privat laukai: name, surname, age, phone, email
        konstruktorius - tuscias
        geters (public)
        main klase pasinaudoje scanner surinkite studentu duomenis po viena:
        vardas ? <- varda
        pavarde ? <- pavarde
        Studentus saugome

        lv1
        suvedus pilnai studenta - ji isspauzdinti su toString override metod

        lv2
        sudeti visas apsaugas. Jai ivedei bloga amziu, praso dar karta, kol neives teisingai()while ciclas)
        keleta studentu. Massivas(ArrayList)  (didelis while)

        lv3
        reikes pagalbiniu klase su statiniais metodais pavadinimu  (Validation)
        metodai validuoti: laukiu ivedima

        Validation.name(sc.input)

        Lv4
        Validacija lauku: phone ( +(370), 86, 6 ) ir mail ("@", "@ + ." , ". + dsgs")

        lv5


 */

        }






    }
