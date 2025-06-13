class Animal {
    void walk() {
        System.out.println("Animal is walking");
    }
}

class classObject extends Animal  {

    public static void main(String[] args) {
        Animal obj = new Animal();
        obj.walk();
    }
}

