package hellowaorldcom.company;

public class metretu1 {
    public static int[][]methodreturn(){
        int s[][]={{1,2,3,4,5,6},{2,3,4,5,5,6,8}};
        return s;
    }
    public static void main(String args[]){
        int a[][]=methodreturn();
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
