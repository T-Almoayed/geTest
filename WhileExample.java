/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whileexample;

/**
 *
 * @author hassouna
 */
public class WhileExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        java.util.Scanner s = new java.util.Scanner(System.in);
        int num1;
        int num2;
        char ope;
        int result = 0;
        char confirm = 'y';

        while (confirm == 'y') {
            System.out.println("Enter Number 1:");
            num1 = s.nextInt();
            System.out.println("Enter Number 2:");
            num2 = s.nextInt();
            System.out.println("Enter Operation ( + , - , * , / ):");
            ope = s.next().charAt(0);
            switch (ope) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = num1 / num2; break;
            }
            System.out.println("Result Is : " + result + "\n------------");
            System.out.print("If you want other operation enter (y) ? : ");
            confirm = s.next().charAt(0);
        }
    }

}
