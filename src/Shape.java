public class Shape {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    @Override
    public String toString() {
        return "Shape [Name: " + name + "]";
    }
}
