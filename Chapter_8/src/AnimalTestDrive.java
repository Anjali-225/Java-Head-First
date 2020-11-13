public class AnimalTestDrive {
    public static void main (String[] args) {
        MyAnimalList list = new MyAnimalList();
        Dog a = new Dog();
        Cat c = new Cat();
        list.add(a);
        list.add(c);

        if (a.equals(c)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println(c.hashCode());
        System.out.println(c.toString());
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
