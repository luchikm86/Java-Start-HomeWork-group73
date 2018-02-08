public class StringPractise {
    public static void main(String[] args) {
        String s = "I love Java";

        char c = s.charAt(2);
        System.out.println(c);


        //1
        String registr = s.toUpperCase();
        System.out.println(registr);

        //2
        boolean startsWithJava = s.startsWith("Java");
        System.out.println(startsWithJava);

        //3
        int indexOfJava = s.indexOf("Java");
        System.out.println(indexOfJava);


        //недоделано
    }


}
