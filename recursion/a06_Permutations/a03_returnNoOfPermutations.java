// public class a03_returnNoOfPermutations { // returnNoOfPermutations
//     // using static variable
//     public static void main(String[] args) {
//          count("", "abc");
//         System.out.println(counter);
//     }
// static int counter = 0;
//     static void count(String p, String u){
//        if(u.length()==0){
//         counter+=1;
//         return;

//        }
//        char c = u.charAt(0);
//        for(int i =0;i<=p.length();i++){
//         String f = p.substring(0,i);
//         String s = p.substring(i,p.length());
//         count(f+c+s,u.substring(1));
//        }
//        return;
        
//     }
// }
// Method 2- making a counter function inside the function


public class a03_returnNoOfPermutations {
    public static void main(String[] args) {
        String u = "ab";
        int ans = count("",u);
        System.out.println(ans);
    }
    static int count(String p,String u){
        int counter = 0;
        if(u.length()==0){
            counter+=1;
            return 1;
        }
        char c = u.charAt(0);
        for(int i =0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());

            counter = counter + count(f+c+s,u.substring(1));
        }

        return counter;
    }

 }