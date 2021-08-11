
public class App {
  
    static int topeSup=0;
    static int topeInf=4;
    public static void main(String[] args) throws Exception {
        String [][] equis = new String[5][5];
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                if (equis[i][j]==null && j==topeSup || j==topeInf ) {
                    System.out.print("X");
                }
                else{
                    System.out.print("_");
                }
            }
            System.out.println();
            topeSup++;
            topeInf--;
        }
    }

   

}
