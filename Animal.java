public class Animal {
    private String type;
    private String name;
    private int age;
    private String habitat;
    private String makeSound;

    public String getName() {
        return name;
    }

    public String getMakeSound() {
        return makeSound;
    }

    public void setMakeSound(String makeSound) {
        this.makeSound = makeSound;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
