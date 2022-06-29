//import java.sql.PreparedStatement;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student studentas = new Student();
        studentas.age = 17;
        studentas.name = "Juozapas";
        studentas.surname = "Pavardenis";
        studentas.grades.add(9);
        studentas.grades.add(10);

        System.out.println(studentas.name + " " + studentas.surname);


        Student studentas2 = new Student();
        studentas2.name = "Jonas";
        studentas2.surname = "Jonaitis";
        studentas2.age = 18;
        System.out.println(studentas2.name + " " + studentas2.surname);


        ArrayList<Student> students = new ArrayList<>();
        students.add(studentas);
        students.add(studentas2);

        Student studentas3 = new Student( "Algis", "Raman", 54 );
        students.add(studentas3);

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println(student.name + " " + student.surname + " ");
            for (int a = 0; a < students.get(i).grades.size(); a++) {
                int grade = student.grades.get(a);
                System.out.println(students.get(i).grades.get(a) + ", ");
                System.out.print(grade + ", ");

            }
            System.out.println();
    }

    }
}



