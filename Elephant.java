public class Elephant extends Animal implements FeedingBehavior{
    public void makeSound() {
        System.out.println("The elephant trumpets with its trunk.");
    }

    @Override
    public void eat() {
        System.out.println("The elephant eats leaves and grass");
        System.out.println("the elephant drink water with it's trunk");
    }
}
