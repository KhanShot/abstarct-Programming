public abstract class Os {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void display(){
        System.out.println(getName()+"'s desktop created");
        System.out.println(getName()+"'s button created");
        System.out.println(getName()+"'s cmd created");
    }
}
