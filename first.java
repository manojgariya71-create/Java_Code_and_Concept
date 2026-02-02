package hellowaorldcom.company;

public class first {
    int x = 10;
    double y = 3.33;
    void add()
    {
        System.out.println("Inside a Function add");
    }
    public static void main(String[] args){
        System.out.println("Helloo!! Java class example");
        first f1= new first();
        f1.add();
        System.out.println("Calling the data members");
        System.out.println(f1.x);
        System.out.println(f1.y);
    }
}
