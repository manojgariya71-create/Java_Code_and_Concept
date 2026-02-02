package hellowaorldcom.company;
class device{
    private String name;
    public void setname(String sname){
        this.name=sname;
    }
    public String show(){
        return this.name;
    }
        }
public class Hello_1 extends device {
    public static void main(String args[]){
        Hello_1 n= new Hello_1();
        n.setname("mouse");
        System.out.println("the device name is"+n.show());
    }
}
