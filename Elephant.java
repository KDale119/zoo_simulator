public class Elephant extends Animal implements FeedingBehavior{
    public void makeSound() {
        System.out.println("The elephant trumpets with its trunk.\n");
    }

    @Override
    public void eat() {
        System.out.println("The elephant eats leaves and grass");
    }

    @Override
    public void drink() {
        System.out.println("the elephant drinks water with it's trunk");
    }
}
