public class test {
    public static void main(String[] args) {
        fxn("abcappledef"); 
        
        
    }
    static void fxn(String up){
        if(up.isEmpty()){
           
            return;
        }
        
        
        if(up.startsWith("apple")){
             fxn(up.substring(5));
        }
           else{
            char c = up.charAt(0);
            System.out.print(c);        
            fxn(up.substring(1));
           }
    }
}
