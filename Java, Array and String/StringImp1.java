public class StringImp1 {
    public static void main(String[] args) {
        
        // declare string
        // String literal

        String msg = "Hello";

        // String Object 

        String msg2 = new String("Welcome");

        // There are two string object 
        // 1. heap object store 
        // 2.string constraint pool : it can't create new entry

        // Concatination in string
        msg.concat("world");

        // Msg is immutable string 

        System.out.println(msg);

        StringBuilder s1 = new StringBuilder("Hello");

        // s1 is muttable string
        // string bulider change the immutable to mutable string
        // also many operation perform in the string in stringBuilder
        // Not thread safe
        // faster performance

        s1.append("world");

        System.out.println(s1);

        // Thread Safety in used String Buffer
        // String Buffer has consume more time as compare to stringBuilder
        // slow performance

        StringBuffer s2 = new StringBuffer("Develop");

        s2.insert(4, "Java");

        System.out.println(s2);

    }
}
