package Encapsulation;

public class A {
   private int num;
     String name;    // these instance variables are also called as data members
    int[] arr;


    public A(int num,String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
// making getters and setters

    // getter for num
    public int getNum(){
        return num;
    }
    // setter for num
    public void setNum(int num){
        this.num = num;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
