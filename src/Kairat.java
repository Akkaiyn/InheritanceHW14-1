public class Kairat extends Adam {
    private int age;
    private String din;

    public String work(){
        return "Working on his mission";
    }
    public String happy(){
        return "is happy";
    }

   public Kairat(){}
    public String think(){
       return super.think();

    }

    public Kairat(String name, int age, String din) {
        super(name);
        this.age = age;
        this.din = din;
    }

    @Override
    public String toString() {
        return "Kairat{" +
                "age=" + age +
                ", din='" + din + '\'' +
                '}';
    }
}
