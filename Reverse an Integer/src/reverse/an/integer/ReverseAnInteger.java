/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse.an.integer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Almar
 */
public class ReverseAnInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.print(reversedInt(Integer.parseInt(input)));
    }
    static int reversedInt(int x){           
        int r = 0;
        long ans = 0;
        while(x != 0){
            r = x%10; 
            ans = ans * 10 + r;
            if( ans >= Integer.MAX_VALUE || ans <= Integer.MIN_VALUE){
                return 0;
            }
            x = x/10;
        }
        return (int) ans;
        }
}
