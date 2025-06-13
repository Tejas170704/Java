public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("brand");
        sb.append("shreehari");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        sb.delete(0,10);
        System.out.println(sb);
    }
}
