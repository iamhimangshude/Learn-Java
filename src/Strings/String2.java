package Strings;

public class String2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("himangshu");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append(" de");
        System.out.println(sb);

        String str = sb.toString();

        sb.deleteCharAt(5);
        System.out.println(sb);

        sb.insert(0, "Java ");
        System.out.println(sb);

        System.out.println(sb.substring(7, 10));
    }
}
