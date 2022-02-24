public class Animal
{
    String animalType;
    String animalSound;

    public Animal()
    {
        animalType = "animal";
        animalSound = "sound";
    }

    public Animal(String type)
    {
        this.animalType = type;
        this.animalSound = "sound";
    }

    public Animal(String type, String sound)
    {
        this.animalType = type;
        this.animalSound = sound;
    }
}
