package staticExample;

public class LearningStaticBlock {
    static int a = 2;
    static int b;

    static{
        System.out.println("Hi, i'm static block");
        b = a*5;
    }

    public static void main(String[] args) {
        LearningStaticBlock obj = new LearningStaticBlock();
        System.out.println(LearningStaticBlock.a + " " + LearningStaticBlock.b);
        LearningStaticBlock.b += 3;

        // this time static block will not run, because it only run once when the first
        // object is created, if it ran twice then the value of b must change which is not
        // changing.
        LearningStaticBlock obj2 = new LearningStaticBlock();
        System.out.println(LearningStaticBlock.a + " " + LearningStaticBlock.b);
    }

}
