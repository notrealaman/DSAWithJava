package DSA;

class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        int max = arr[0];
        int i = 0;
        while( i < arr.length ){
            if(arr[i] > max){
                max = arr[i];
            }
            i++;
        }

        System.out.println("Max : "+max);
    }
    
}