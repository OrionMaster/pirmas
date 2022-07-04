import javax.lang.model.element.Name;
import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private String surname;
    private int age;

    private String phone;

    private String email;
    private ArrayList<Integer> grades;

// vsio nize eto metody

    public ArrayList<Integer> getGrades(){
        return grades;

    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public String getName(){
        return this.name;

    }
    public String getSurname(){
        return this.surname;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setAge(int age){
            this.age = age;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public void setEmail(String email){
        this.email = email;
    }


    // 2 konstruktory
    public Student() {
        this.grades = new ArrayList<>();
    }

    public Student(String name, String surname, int age, String phone, String email) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phone = phone;
        this.email = email;

    }


    public void introduce(){
        System.out.println("Hi my name is " + this.name + ", surename - " + this.surname );

    }
    //

    public double gradesAverage(){
        double sum = 0;
        for (int i = 0; i < this.grades.size(); i++) {
            sum += (double)this.grades.get(i);
        }
        return sum / this.grades.size();
    }

    @Override
    public String toString() {
        return "Student tipo klases objektas{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", phone= " + phone +
                ", email= " + email;
    }

    public static void classInfo(){
        System.out.println("this class has it methods");
    }



}
