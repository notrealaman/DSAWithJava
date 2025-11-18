public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "programming";
        StringBuilder result = new StringBuilder();

       
        boolean[] visited = new boolean[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!visited[ch]) {
                result.append(ch);
                visited[ch] = true;
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("Without Duplicates: " + result);
    }
}
