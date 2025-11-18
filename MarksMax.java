
public class MarksMax {
    public static void main(String[] args) {
        student s1 = new student("Rahul", 1, 40);
        student s2 = new student("Sohan", 2, 100);
        student s3 = new student("Sahil", 3, 70);

        student max = s1;

        if(s2.marks > s1.marks){
            max = s2;
        } if(s3.marks > s2.marks){
            max = s3;
        }
        System.out.println("Topper is: " + max.name);
    }
}
