/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armastrong;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author mohammedalessa
 */
public class Armastrong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here

        Scanner in = new Scanner(new FileReader("armstrong.in"));
        PrintWriter out = new PrintWriter("armstrong.out");

        int K = in.nextInt();

        int count = 0;
        for (int i = 0; i < K; i++) {
            // Reed Number
            String num = in.next();
            // Divid number Digits
            char dig[] = num.toCharArray();
            int p = dig.length;
            double res = 0;

            for (int c = 0; c < p; c++) {

                res = res + Math.pow(Integer.parseInt(dig[c] + ""), p);
            }
            if (res == Integer.parseInt(num)) {
                System.out.println((i + 1) + ". yes");
            } else {
                System.out.println((i + 1) + ". no");
            }
        }

    }

}
