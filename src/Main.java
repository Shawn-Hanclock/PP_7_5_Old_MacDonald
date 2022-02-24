public class Main
{
    public static void main(String[] args)
    {
        Animal[] Farm = new Animal[4];
        Cow Cow = new Cow("Cow", "Moo", "Betsy");
        Pig Pig = new Pig("Pig", "Oink");
        Chick Chick1 = new Chick("Chick", 5);//young chick
        Chick Chick2 = new Chick("Chick", 3);//old chick
        Farm[0] = Cow;
        Farm[1] = Pig;
        Farm[2] = Chick1;
        Farm[3] = Chick2;
    }
}
