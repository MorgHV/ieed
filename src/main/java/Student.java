import javax.swing.*;

public class Student {
    String firstName ;
    String lastName ;
    String Group ;
    Double averageMark ;
    public Student(String firstName,String lastName, String group,double averageMark){
        this.averageMark = averageMark;
        this.firstName = firstName;
        this.Group = Group;
        this.lastName = lastName;
    }
    void getSholarship(){
        if (averageMark == 5){
            System.out.println("Сумма = 10.000 руб.");
        }
        else
        {
            System.out.println("Сумма = 8.000 руб.");
        }
    }


}