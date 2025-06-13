public class getset {
    private String name;

    // Setter declared before getter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello, world!");
        System.out.println(sb.toString());
    }
}

