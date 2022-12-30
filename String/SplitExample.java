package String;

public class SplitExample {
    public static void main(String[] args) {
        String s = "Java and Python";

        String sArr[] = s.split(" and ");

        for(int i = 0; i < sArr.length; i++) {
            System.out.println(sArr[i]);
        }
    }
}
