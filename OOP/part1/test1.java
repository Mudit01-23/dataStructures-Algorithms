public class test1 {
    public static void main(String[] args) {
        //Student student1= new Student();

        // System.out.println("For student1");
        // System.out.println(student1.rollNo);
        // System.out.println(student1.name);
        // System.out.println(student1.marks);
        

        System.out.println("For student1 using other constructor");

        Student student2 = new Student(24,"Kunal",50);
        System.out.println("Printing for student2");
        System.out.println(student2.rollNo);
        System.out.println(student2.name);
        System.out.println(student2.marks);


        Student student3 = new Student(6,"Shaq",43);
        System.out.println("Printing for student3");
       System.out.println(student3.rollNo);
        System.out.println(student3.name);
        System.out.println(student3.marks);
        student3.changeName("Michael Jordan");
        System.out.println(student3.name);
        

    }
}

class Student{
    int rollNo;
    String name;
    int marks;

    void greet(){
        System.out.println("Hello my name is "+this.name);
    }

    void changeName(String name){
        this.name = name; 
    }
    Student(){
        this.rollNo = 23;
        this.name = "Rahul";
        this.marks = 46;

    }

    // Student(int EnrollNo,String StudentName, int StudentMarks){
    //     rollNo = EnrollNo;
    //     name = StudentName;
    //     marks = StudentMarks;

    // }

    Student(int rollNo,String name, int marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;

    }
    
} 