public class Chalet extends House {
    private String color;
    private int age;

    public Chalet(String address, String city, boolean isFinished, String color, int age) {
        super(address, city, isFinished);
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString() + ", Color: " + color + ", Age: " + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        if (obj == this) return true;

        Chalet other = (Chalet) obj;
        return super.getAddress().equals(other.getAddress()) &&
               super.isFinished() == other.isFinished() &&
               this.color.equals(other.color) &&
               this.age == other.age;
    }
}
