import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Welcome to the Zoo Simulator!\n");
        System.out.println("1. Add an animal to the zoo");
        System.out.println("2. Remove an animal from the zoo");
        System.out.println("3. Simulate a day at the zoo");
        System.out.println("4. Exit\n");
        System.out.print("Please enter your choice: ");
        String userInput = scanner.nextLine();

        Lion lion = null;
        Elephant elephant = null;
        Giraffe giraffe = null;

        int lionCount = 0;
        int elephantCount = 0;
        int giraffeCount = 0;

        if (userInput.equals("1")) {
            System.out.print("Enter the type of animal (Lion, Elephant or Giraffe): ");
            userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("lion")) {
               lion = addLion(scanner, "Lion" );
               lionCount++;
            }else if (userInput.equalsIgnoreCase("Elephant")) {
                elephant = addElephant(scanner, "Elephant");
                elephantCount++;
            } else if (userInput.equalsIgnoreCase("Giraffe")){
                giraffe = addGiraffe(scanner, "Giraffe");
                giraffeCount++;
            }
        }
//        System.out.println(elephantCount);
        if(userInput.equals("2")) {
            System.out.println("Enter the name of the animal you want to remove: ");
            String removeAnimal = scanner.nextLine();
            System.out.println(removeAnimal + " has been removed");
//                     decrement here but how to find out which animal it was???
        }
    }
        private static Lion addLion(Scanner scanner, String animalType){
            Lion lion = new Lion();
            System.out.print("Enter the " + animalType + "'s name: ");
            lion.setName(scanner.nextLine());
            System.out.print("Enter the " + animalType + "'s age: ");
            lion.setAge(scanner.nextInt());
            scanner.nextLine();
            System.out.print("Enter the " + animalType + "'s habitat: ");
            lion.setHabitat(scanner.nextLine());
            System.out.println(lion.getName() + " has been added to the zoo");
            return lion;
        }
        private static Elephant addElephant(Scanner scanner, String animalType){
            Elephant elephant = new Elephant();
            System.out.print("Enter the " + animalType + "'s name: ");
            elephant.setName(scanner.nextLine());
            System.out.print("Enter the " + animalType + "'s age: ");
            elephant.setAge(scanner.nextInt());
            scanner.nextLine();
            System.out.print("Enter the " + animalType + "'s habitat: ");
            elephant.setHabitat(scanner.nextLine());
            System.out.println(elephant.getName() + " has been added to the zoo");
            return elephant;
        }
        private static Giraffe addGiraffe(Scanner scanner, String animalType){
            Giraffe giraffe = new Giraffe();
            System.out.print("Enter the " + animalType + "'s name: ");
            giraffe.setName(scanner.nextLine());
            System.out.print("Enter the " + animalType + "'s age: ");
            giraffe.setAge(scanner.nextInt());
            scanner.nextLine();
            System.out.print("Enter the " + animalType + "'s habitat: ");
            giraffe.setHabitat(scanner.nextLine());
            System.out.println(giraffe.getName() + " has been added to the zoo");
            return giraffe;
        }
    }



