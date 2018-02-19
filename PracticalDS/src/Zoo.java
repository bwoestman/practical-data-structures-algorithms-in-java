public class Zoo
{
    public static void main(String[] args)
    {
        Animal bird = new Animal(2, "blue", 3);
        Animal cat = new Animal(16, "orange", 18);
        Animal dog = new Animal(15, "brown", 13);

        bird.revealIdentity();
        bird.move();
        bird.eat();
        bird.sleep();

        cat.revealIdentity();
        cat.move();
        cat.eat();
        cat.sleep();

        dog.revealIdentity();
        dog.move();
        dog.eat();
        dog.sleep();
    }
}
