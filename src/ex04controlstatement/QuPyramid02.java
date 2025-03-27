package ex04controlstatement;

public class QuPyramid02 {

    public static void main(String[] args) {

        int i=5;
        do {
            int j=1;
            do {
                System.out.print("*");
                j++;
            } while(j<=i);
            System.out.println();
            i--;
        } while(i>=1);
    }
}
