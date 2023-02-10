public class Adam {
    private String name;

    public String think(){
        return "Thinking about";
    }
    public Adam(){

    }

    public Adam(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Adam{" +
                "name='" + name + '\'' +
                '}';
    }
}
