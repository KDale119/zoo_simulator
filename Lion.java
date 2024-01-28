public class Lion extends Animal implements FeedingBehavior{

    public void makeSound() {
        System.out.println("The lion roars loudly.\n");
    }

    @Override
    public void eat() {
        System.out.println("The lion chews on a bone");
    }

    @Override
    public void drink() {

    }
}
