

public class LargestElemArray {
    public static void main(String[] args) {
        int[] arr = {5,7,3,12,8,9,10};
        int lar = arr[0];
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > lar){
                lar = arr[i];
            }
        }

        System.out.println(lar);

    }
}
