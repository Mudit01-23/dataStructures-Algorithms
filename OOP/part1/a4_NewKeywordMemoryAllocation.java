public class a4_NewKeywordMemoryAllocation {
    public static void main(String[] args) {
        Student student1 = new Student("Micael",23,30);
        Student student2 = student1;  // here student2 is equal to student1, so student2 is pointing to the same object in heap memory that was 
        System.out.println("Printing for student2");
        System.out.println(student2.name);
        System.out.println(student2.rollNo);
        System.out.println(student2.marks);
        // changing the name of student2 will lead to change in name of student1 as well
        student2.name = "ShaqONeil";
       
        System.out.println("Printing for student1");
        System.out.println(student1.name);


        System.out.println();
        System.out.println("Printing for other student");
        Student student3 = new Student(student1);
        System.out.println(student3.name);
        System.out.println(student3.rollNo);
        System.out.println(student3.marks);
    }
}
class Student{
    String name;   // 
    int rollNo;   //  these 3 are called instance variables
    int marks;    //

    Student(String name,int rollNo,int marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // creating a constructor that takes value from other object
    Student(Student otherStudent){
        this.name = otherStudent.name;          // this is called copy constructor
        this.rollNo = otherStudent.rollNo;
        this.marks = otherStudent.marks;
    }
}
