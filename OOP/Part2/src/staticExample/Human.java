package staticExample;


    public class Human{
        String name;
        int age;
        int salary;
        boolean maritalStatus;
       static long population;

        Human(String name,int age, int salary,boolean maritalStatus){
            this.name = name;
            this.age = age;
            this.salary = salary;
            this.maritalStatus = maritalStatus;
            Human.population +=1;
        }

    }


