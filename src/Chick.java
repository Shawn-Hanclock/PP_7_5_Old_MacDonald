public class Chick extends Animal
{
    private int age;
    public Chick (String type, int age)
    {
        super (type);
        this.age = age;
        if (age > 4)
        {
            this.animalSound = "cheep";
        }
        else
        {
            this.animalSound = "peep";
        }
    }
}
