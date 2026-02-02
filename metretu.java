package hellowaorldcom.company;

public class metretu {
    public static int []methodreturn(){
  int s[]={1,2,3,4,5};
  return s;
    }
    public static void main(String args []){
        int a[]=methodreturn();
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);

        }
    }
}
