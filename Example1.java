package Exercise9;

//String Pool example
public class Example1 {

    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Java";
        System.out.println(s1 == s2);
        String s3 = new String("Java");
        System.out.println(s2 == s3);
        System.out.println(s1 == s3);
        String s4 = new String("Java").intern();
        System.out.println(s1 == s4);
    }
}
