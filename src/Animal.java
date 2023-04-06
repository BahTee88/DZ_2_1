public class Animal {
    private int age;
    private Color color;

    public Animal(int age) {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public Animal(int age, Color color) {
        this.age = age;
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Animal() {
    }

    @Override
    public String getInfo() {
        return "Animal{" +
                "age=" + age +
                ", color=" + color +
                '}';
    }

    public void makeVoice() {
        System.out.println(" Animals make voice");

    }
}
