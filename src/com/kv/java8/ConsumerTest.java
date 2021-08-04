package com.kv.java8;

import com.kv.java8.data.Student;
import com.kv.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {

    public static void consumerPrintName(){
        List<Student> allStudents = StudentDataBase.getAllStudents();
        Consumer<Student> c1 = (student)-> System.out.println(student.getName());
        allStudents.forEach(c1);
    }

    public static void consumerPrintNameAndActivity(){
        System.out.println("consumerPrintNameAndActivity : ");
        List<Student> allStudents = StudentDataBase.getAllStudents();
        Consumer<Student> c1 = (student)-> System.out.print(student.getName());
        Consumer<Student> c2 = (student)-> System.out.println(student.getActivities());
        allStudents.forEach(c1.andThen(c2));
    }

    public static void consumerPrintNameAndActivityWithCondition(){
        System.out.println("consumerPrintNameAndActivityWithCondition : ");
        List<Student> allStudents = StudentDataBase.getAllStudents();
        Consumer<Student> c1 = (student)-> System.out.print(student.getName());
        Consumer<Student> c2 = (student)-> System.out.println(student.getActivities());
        allStudents.forEach((student)->{
            if(student.getGradeLevel()>3 && student.getGpa()>=3.9){
                c1.andThen(c2).accept(student);
            }
        }

        );
    }

    public static void main(String[] args) {
        consumerPrintName();
        consumerPrintNameAndActivity();
        consumerPrintNameAndActivityWithCondition();

    }
}
