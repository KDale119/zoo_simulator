import com.sun.security.jgss.GSSUtil;

public class Giraffe extends Animal implements FeedingBehavior{
    public void makeSound() {
        System.out.println("The giraffe bellows softly\n"); //empty
    }

    @Override
    public void eat() {
        System.out.println("The giraffe munches on alfalfa");
    }

    @Override
    public void drink() {

    }
}
