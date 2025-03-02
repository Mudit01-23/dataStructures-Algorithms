package inheritance.TypesOfInheritance;
class printObject2{

    int num;
    printObject2(int num){
        this.num = num;
    }

    @Override
    public String toString() {
        return ""+ num;
    }

    public static void main(String[] args) {
        printObject2 obj = new printObject2(23);
        System.out.println(obj);
    }
}
