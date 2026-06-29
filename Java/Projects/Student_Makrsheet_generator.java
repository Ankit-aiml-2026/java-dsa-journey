import java.util.*;

public class Student_Makrsheet_generator{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter your Full Name: ");
        String name = sc.nextLine();

        System.out.print("Enter your marks:-\nMaths: ");
        float math = sc.nextFloat();
        
        System.out.print("Science: ");
        float sci = sc.nextFloat();
        
        System.out.print("English: ");
        float eng = sc.nextFloat();

        String grade;
        float marks = (math + sci + eng)/300;
        float percent = (marks)*100;
        float cgpa = (percent)/10;
        if (percent >= 90 && percent <= 100){
            grade = "O";
        }
        else if(percent >= 80 && percent <90){
            grade = "A+";
        }
        else if(percent >= 70 && percent <80){
            grade = "A";
        }
        else if(percent >= 60 && percent < 70){
            grade = "B+";
        }
        else if(percent >= 50 && percent < 60){
            grade = "B";
        }
        else if(percent >= 40 && percent <50){
            grade = "C";
        }
        else if(percent >= 35 && percent <40){
            grade = "P";
        }
        else{
            grade = "F";
        }
        System.out.println();
        System.out.println("Student Marksheet:");
        System.out.println("-------------------");
        System.out.println("Name: " + name);
        System.out.println("Subject\tMarks");
        System.out.println("Maths:\t" + math + "\n" + "Science\t" + sci + "\n"+ "English\t" + eng);
        System.out.println("CGPA:\t" + cgpa);
        System.out.println("Grade:\t" + grade);
        sc.close();
    }
}