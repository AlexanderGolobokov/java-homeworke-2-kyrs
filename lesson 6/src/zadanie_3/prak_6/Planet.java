package zadanie_3.prak_6;

public class Planet implements Nameable{
    private String name;
    private float weight;
    private float radius;
    {
        name = "no name";
        weight = 0;
        radius = 0;
    }
    public Planet() {}

    public Planet(String name, float weight, float radius) {
        this.name = name;
        this.weight = weight;
        this.radius = radius;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return name;
    }
}
