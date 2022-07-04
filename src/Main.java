import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String inputName = "";
            String inputSurname = "";
            int inputAge = 0;
            String inputPhone = ""; //user line phone number
            String inputEmail = "";


            boolean newstudent = true;

       while(newstudent) {   //New Student start
           boolean isNameBad = true;  //Name write and check
           while (isNameBad) {
               System.out.println("Please write your name: ");
               inputName = sc.nextLine();
               if (CheckInputs.isName(inputName)) {
                   String name = inputName;
                   System.out.println("Your name is: " + name);
                   isNameBad = false;
               } else {
                   System.out.println("There is wrong symbols in your name, please try again");
               }
           }
           boolean isSurnameBad = true;  //Surname write and check
           while (isSurnameBad) {
               System.out.println("Please write your surname: ");
               inputSurname = sc.nextLine();
               if (CheckInputs.isSurname(inputSurname)) {
                   String surname = inputSurname;
                   System.out.println("Your surname is: " + surname);
                   isSurnameBad = false;
               } else {
                   System.out.println("There is wrong symbols in your surname, please try again");
               }
           }
           boolean isAgeBad = true; // Age write and check
           while (isAgeBad) {
               System.out.println("Please write your age: ");
               inputAge = 0;
               try {
                   inputAge = sc.nextInt();
                   if ((18 <= inputAge) && (inputAge < 100)) {
                       int age = inputAge;
                       System.out.println("Your age is: " + age);
                       isAgeBad = false;
                   } else {
                       System.out.println("Age is wrong");
                   }
               }catch (Exception e){
                   System.out.println(e);

               }

           }
           boolean isPhoneBad = true;
           while (isPhoneBad) {
               inputPhone = "";
               System.out.println("Please write your phone number:");
               System.out.print("+(370) ");
               inputPhone = sc.nextLine();
               if (CheckInputs.isPhone(inputPhone)) {
                   String phone = inputPhone;
                   System.out.println("Your phone is: +(370)" + phone);
                   isPhoneBad = false;
               } else {
                   System.out.println("Phone number is wrong, please try again");
               }
           }
           // Phone number parameter not ready
           //  System.out.println("Please write your phone in format +370XXX or 86XXXX");
           //  inputPhone = sc.nextLine();

            boolean isEmailBad = true;  //Email write and check
            while (isEmailBad){
                System.out.println("Please write your email: ");
                inputEmail = sc.nextLine();
                if (CheckInputs.isValid(inputEmail)){
                    String email = inputEmail;
                    System.out.println("Your email is: " + email);
                    isEmailBad = false;
                } else {
                    System.out.println("Email address is wrong");
                }
            }


            new Student (inputName, inputSurname, inputAge, inputPhone, inputEmail);
            String inputNewStudent = sc.nextLine();
           System.out.println("Are you want to add next Student: yes/no");
           if (CheckInputs.isNewStudent(inputNewStudent)){
               inputNewStudent = "Yes";
               System.out.println("New student will be initiated");
               newstudent = false;
           } else {
               System.out.println("Current Student is added. End of registration");
           }
       } //New student end








        }

    Student studentas = new Student();


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







