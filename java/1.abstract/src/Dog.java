/**
 * The type Dog.
 */
public class Dog extends Animal{

    public void sleep () {
        System.out.println("zzz");
    }
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.setName("poppy");

        System.out.println(dog.name);

//        dog.sleep();
    }
}
