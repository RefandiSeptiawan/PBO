/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import java.util.Scanner;
public class NewClass {
      public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input;
        while(true){
        System.out.println("1.input data");
        System.out.println("2. tampil data");
        System.out.println("3. keluar");
        System.out.print("pilih ");
        input = in.nextInt();
        switch(input){
            case 1 :
                break;
            case 2 :
                break;
            case 3 :
                System.exit(0);
            break;
        }
        }
    }
}

