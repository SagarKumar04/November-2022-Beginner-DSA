package String;

public class StringExample {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Python";
        String s3 = "Java";

        System.out.println("s1: " + s1.hashCode());
        System.out.println("s2: " + s2.hashCode());
        System.out.println("s3: " + s3.hashCode());

        boolean result12 = (s1 == s2);
        System.out.println(result12);

        boolean result13 = (s1 == s3);
        System.out.println(result13);
    }
}
