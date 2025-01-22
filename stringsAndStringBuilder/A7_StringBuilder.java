public class A7_StringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
            // here the objects are not being made again and again, and being modified by adding new alphabet everytime, like 'a'->'ab'->'abc'........
            // this reduces the time complexity.
        for (int i = 0; i < 26; i++) {
            builder.append((char)+('a'+i));
        }

        System.out.println(builder);
        // reversing the string
        builder.reverse();
        System.out.println(builder);
        
        // deleting first element
        builder.deleteCharAt(0);
        System.out.println(builder);


    }
}
