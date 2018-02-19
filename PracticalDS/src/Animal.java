public class Animal
{
    int weight;
    String color;
    int age;

    public Animal(int weight, String color, int age)
    {
        this.weight = weight;
        this.color = color;
        this.age = age;
    }

    public void revealIdentity()
    {
        System.out.println("I weigh " + weight + " pounds.");
        System.out.println("I am " + color + ".");
        System.out.println("I am " + age + " years old.");
    }

    public void move()
    {
        System.out.println("Animal moving...");
    }

    public void eat()
    {
        System.out.println("Animal eating...");
    }

    public void sleep()
    {
        System.out.println("Animal sleeping...");
    }
}
