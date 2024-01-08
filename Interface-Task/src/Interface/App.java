package Interface;

public class App {
    String eat;
    String sleep;
    String makeSound;

    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myCat.eat();
        myCat.sleep();
        myCat.makeSound();
        System.out.println("<------------------------------------>");
        myDog.eat();
        myDog.sleep();
        myDog.makeSound();
    }
}
