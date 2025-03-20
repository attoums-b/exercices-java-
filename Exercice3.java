import java.util.Scanner;

public class Exercice3 {

    public static int[] changerValeurs(int x, int y){
        int temp = x;
        x = y;
        y = temp;
        return new int[]{x, y};
    }

    public static void afficherOrdreCroissant(int a, int b , int c){
        if (a > b){
            int[] changement = changerValeurs(a,b);
            a = changement[0];
            b = changement[1];
        }  if (a > c) {
            int[] changement = changerValeurs(a,c);
            a = changement[0];
            c = changement[1];

        } if (b > c){
            int[] changement = changerValeurs(b,c);
            b = changement[0];
            c = changement[1];

        }

        System.out.println("valeurs par ordre croissant: "+a + "<=" +b + "<=" + c);

    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("valeur de a: ");
        int a = scanner.nextInt();
        System.out.print("valeur de b: ");
        int b = scanner.nextInt();
        System.out.print("valeur de c: ");
        int c  = scanner.nextInt();

        afficherOrdreCroissant(a,b,c);
        scanner.close();

    }
}
