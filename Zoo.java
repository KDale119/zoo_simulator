import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lion lion = null;
        Elephant elephant = null;
        Giraffe giraffe = null;
        int lionCount = 0;
        int elephantCount = 0;
        int giraffeCount = 0;

        System.out.println("Welcome to the Zoo Simulator!\n");
        while(true) {
        System.out.println("1. Add an animal to the zoo");
        System.out.println("2. Remove an animal from the zoo");
        System.out.println("3. Simulate a day at the zoo");
        System.out.println("4. Exit\n");
        System.out.print("Please enter your choice: ");
        String userInput = scanner.nextLine();


            if (userInput.equals("1")) {
                System.out.print("Enter the type of animal (Lion, Elephant or Giraffe): ");
                userInput = scanner.nextLine();
                if (userInput.equalsIgnoreCase("lion")) {
                    lion = addLion(scanner, "Lion");
                    lion.setType("Lion");
                    lionCount++;
                } else if (userInput.equalsIgnoreCase("Elephant")) {
                    elephant = addElephant(scanner, "Elephant");
                    elephant.setType("Elephant");
                    elephantCount++;
                } else if (userInput.equalsIgnoreCase("Giraffe")) {
                    giraffe = addGiraffe(scanner, "Giraffe");
                    giraffe.setType("Giraffe");
                    giraffeCount++;
                }
            }
            if (userInput.equals("2")) {
                remove(scanner, lion, giraffe, elephant);

            }
            if (userInput.equals("3")) {
                System.out.println("Simulating a day at the zoo ");
                simulate(lion, elephant, giraffe, scanner);

            }
            if (userInput.equals("4")) {
                System.out.println("Goodbye!");
                break;

            }
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
            System.out.println(lion.getName() + " has been added to the zoo\n");
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

            System.out.println(elephant.getName() + " has been added to the zoo\n");

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

            System.out.println(giraffe.getName() + " has been added to the zoo\n");
            return giraffe;
        }

        private static void simulate(Lion lion, Elephant elephant, Giraffe giraffe, Scanner scanner) {
            System.out.print("Select your animal (Lion, Elephant or Giraffe): ");
            String request = scanner.nextLine();
            if(request.equalsIgnoreCase(lion.getType())) {
                System.out.println(lion.getName() + " in habitat: " + lion.getHabitat());
                lion.eat();
                lion.makeSound();
            } else if (request.equalsIgnoreCase("elephant")){
                System.out.println(elephant.getName() + " in habitat: " + elephant.getHabitat());
                elephant.eat();
                elephant.drink();
                elephant.makeSound();
            } else if (request.equalsIgnoreCase("giraffe")) {
                System.out.println(giraffe.getName() + " in habitat: " + giraffe.getHabitat());
                giraffe.eat();
                giraffe.makeSound();
            }

        }

        public static void remove(Scanner scanner, Lion lion, Giraffe giraffe, Elephant elephant) {
            System.out.println("Enter the name of the animal you want to remove: ");
            String removeAnimal = scanner.nextLine();

            if (removeAnimal.equalsIgnoreCase(lion.getName())) {
                System.out.println(removeAnimal + " has been removed from the zoo.\n");

            } else if (removeAnimal.equalsIgnoreCase(elephant.getName())) {
                System.out.println(removeAnimal + " has been removed from the zoo.\n");


            } else if (removeAnimal.equalsIgnoreCase(giraffe.getName())) {
                System.out.println(removeAnimal + " has been removed from the zoo.\n");

            } else {
                System.out.println("We dont have an animal by that name\n");
            }
        }

    }



