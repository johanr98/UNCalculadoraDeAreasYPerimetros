/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.Scanner;

/**
 *
 * @author joseb
 */
public class Input {

    public static int leerInt() {
        return Integer.parseInt(leerString());
    }

    public static double leerDouble() {
        return Double.parseDouble(leerString());
    }

    public static String leerString() {
        Scanner dto = new Scanner(System.in);
        return dto.nextLine();
    }
}
