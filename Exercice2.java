import java.util.Scanner;


public class Exercice2 {

    public static int[] changerValeurs(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        return new int[]{a, b};
    }

    public static int maximum(int a, int b){
        if (a > b){
            return a ;
        }
        return b;
    }





    //saisie et opérations de base
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // demander un input à l'utilisateur
        System.out.print("entrez la valeur de a: ");
        int a = scanner.nextInt();
        System.out.print("entrez la valeur de b: ");
        int b = scanner.nextInt();

        // affichage des valeurs entrées  par l'utilisateur
        System.out.println("a : " + a + " b : " + b);

        // appel de la fonction permettant d'échanger les valeurs
        int[] echange = changerValeurs(a , b);
        System.out.println("nouvelle valeur de a : "+ echange[0] + " et de b : "+ echange[1]);

        //double de a
        int adouble = a * 2;
        System.out.println("la valeur double de " + a + " est: "+ adouble);

        //moitié de b
        double bmoitie = b / 2.0;
        System.out.println("la moitié de " + b + " est: "+ bmoitie);

        //quotient de a et b
        double quotient = (double)a/b;
        System.out.println(a +" / " + b + " donne: " + quotient);
        //reste de la division euclidienne entre a et b
        int resteDiv = a % b;
        System.out.println("le reste de la division de "+ a + " par " + b + " donne: "+ resteDiv);

        int plusGrand = maximum(a,b);
        System.out.println("le plus grand entre "+ a + " et " + b + " est: "+ plusGrand);

        scanner.close();




    }





}
