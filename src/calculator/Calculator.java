/*
BRUN VERCEIL FGE2 TDC
TP0 Exercice 3
27/09/21
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author Mathilde
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        int operateur=0;
        int operand1=0;
        int operand2=0;
        
        
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un opérateur compris entre 1 et 5 inclus :");
        operateur = sc.nextInt();
        System.out.println();
        if (operateur == 1 || operateur == 2 || operateur == 3 || operateur == 4 || operateur == 5){
            sc = new Scanner(System.in);
            System.out.println("Veuillez saisir une première valeur entière :");
            operand1 = sc.nextInt();
            System.out.println();

            sc = new Scanner(System.in);
            System.out.println("Veuillez saisir une deuxième valeur entière :");
            operand2 = sc.nextInt();
            System.out.println();
            System.out.println("Le résultat de la somme de vos 2 nombres est "+(operand1+operand2));

        }
        else {
            System.out.println("Vous n'avez pas rentrer un opérateur compris entre 1 et 5 inclus.");
            System.exit(0);
            
        }
    }
}

