public class Zadanie4 {
    public static void main(String[] args) {
        int n = 20;

        int i = 0;
        int j = 0;
        int k = 0;
        int space = n/2;
        while (i < n) {
            while (k<space){
                System.out.print(" ");
                k++;
            }
            k=0;
            space--;
            while (j <= i) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            j = 0;
            i += 2;
        }
    }
}
