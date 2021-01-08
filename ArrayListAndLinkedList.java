package com.upgrad.com.upgrad.alANDll;


import java.util.*;

public class ArrayListAndLinkedList {
    public static void main(String[] args) {
//        String studentList[] = {"Amar", "Akbar", "Anthony"};
//        printStudentList(studentList);
           		//2
        // ArrayList<dataTypes> variableName = new ArrayList<dataType>();
//        ArrayList<String> facultyNames = new ArrayList<String>();
//        LinkedList<String> facultyNames = new LinkedList<String>();
//        facultyNames.add("Kaleen Bhaia");
//        facultyNames.add("Guddu");
//        printStudent(facultyNames);

        List<Student> gangsOfwassepur = new ArrayList<Student>();
        List<Student> mirzapur = new LinkedList<Student>();

        gangsOfwassepur.add(new Student("faizal", 11));			//3
        gangsOfwassepur.add(new Student("Sardar", 22));
        mirzapur.add(new Student("munna", 0));
        mirzapur.add(new Student("guddu", 0));
        // runtime error generate

        // compileTime error

                printStudentList(gangsOfwassepur);
        printStudentList(mirzapur);
    }public static void printStudent(LinkedList students) {
        for(Object obj : students) {
            String name=(String) obj;
            System.out.println(name);					}
    }
        public static void printStudentList(List students) {
        for(Object o : students) {									//4
            Student s = (Student) o;
            System.out.println(s.getDetails());					}
    }
    // ArrayList<dataTypes> variableName = new ArrayList<dataType>();

// public static void printStudentList(String[] students) {
//        for(String s : students) {
//            System.out.println(s);	}
//    }
}
class Student {
    private final String name;
    private final int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    public String getDetails() {
        return
                "name = " + this.name + '\n' +
                        "roll number = " + this.rollNumber + '\n';
    }
}














//    ArrayList studentList = new ArrayList();			//2
//
//        studentList.add(new Student("Amar", 1));			//3
//                studentList.add(new Student("Akbar", 2));
//                studentList.add(new Student("Anthony", 3));
//
//                printStudentList(studentList);


//    public static void printStudentList(ArrayList students) {
//        for(Object o : students) {									//4
//            Student s = (Student) o;
//            System.out.println(s.getDetails());					}
//    }