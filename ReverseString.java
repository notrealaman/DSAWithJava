public class ReverseString {
    public static void main(String[] args) {
        String str = "human";
        StringBuilder strnew = new StringBuilder();

        for(int i = str.length()-1; i >= 0; i--){
            strnew.append(str.charAt(i));
        }

        System.out.printf("Original String : %s\nReversed String : %s",str,strnew);

    }
}
