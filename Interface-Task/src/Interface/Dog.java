package Interface;

class Dog implements Animal {
    public void eat() {
        System.out.println("Dogs can eat beef and chiken ");
    }

    public void sleep() {
        System.out.println("Dogs can sleep to 12 hour ");
    }

    public void makeSound() {
        System.out.println("Barks!");
    }
}
