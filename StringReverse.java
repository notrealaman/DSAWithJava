package RecursionQuestions;

public class StringReverse {
    static String RevString(String str){
        if(str.isEmpty()) return str;
        return RevString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(RevString("hello"));
    }
}
