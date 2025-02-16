
public class a2_CreatingClass {
    public static void main(String[] args) {
        // creating a class student that contains 3 items- name, rollNo, and marks
       
       //Student student1;
       Student student1 = new Student();
       
       student1.rollNo= 12;
       student1.name = "Michael";
       student1.marks = 23;
       
       System.out.println(student1.rollNo);
       System.out.println(student1.name);
       System.out.println(student1.marks);

        

    }

    static class Student{
        int rollNo ;
        String name;
        float marks;
    }

   

    }


