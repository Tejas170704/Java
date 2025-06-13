public class abstraction {
    interface Animal {
        void walk();
    }
    class dog implements Animal {
        public void walk() {
            System.out.println("dog walk");
        }
    }

    public static void main(String[] args) {
        Animal dog = new abstraction().new dog();
        dog.walk();
    }
}
