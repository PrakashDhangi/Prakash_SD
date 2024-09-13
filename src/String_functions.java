public class String_functions {
    public static void main(String[] args) {

        String s="hello";
        String s1="welcome";
        String s2="  welcome  ";
        String s3="prakshdhangi6@gmail.com";
        System.out.println(s);   //helow
        System.out.println(s.length()); //5
        System.out.println(s.toLowerCase()); //hello
        System.out.println(s.toUpperCase()); //HELLO
        System.out.println(s.charAt(1)); //e
        System.out.println(s.contains("llo")); //true
        System.out.println(s.equals("hello"));
        System.out.println(s.equalsIgnoreCase("HELLO"));// true
        System.out.println(s.concat(s1)); //hellowelcom
        System.out.println(s2); // welcome
        System.out.println(s2.trim()); //welcome
        System.out.println(s.replace('e','x')); //hxllo
        System.out.println(s1.substring(0,3));    //wel
        String a[]=s3.split("@");
        System.out.println(a[0]); //prakashdhangi6
        System.out.println(a[1]); //gmail.com
    }
}
