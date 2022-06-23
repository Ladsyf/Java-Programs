
package password.generator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the desired password length: ");
        String input = br.readLine(); 
        int charLength = Integer.parseInt(input);
        
        String password = "";
        Random rand = new Random();
        
        char[][] charSet = {{},{},{},{
                             '!','"','#','$','%','&','\'',',','(',')','*','+','\"',
            ',','-','.','/',':',';','<','=','>','?','@','[','\\',']',
            '^','_','`','{','|','}','~'}};
        
        charSet[0] = new char[26];
        charSet[1] = new char[26];
        charSet[2] = new char[10];
        
        //insert all uppercase letters in alphabet using ascii code
        for(int i = 0; i < charSet[0].length; i++){
            charSet[0][i] = (char) (65 + i);
        }
        //insert all lowercase letters
        for(int i = 0; i < charSet[1].length; i++){
            charSet[1][i] = (char) (97 + i);
        }
        //insert all numbers 0 - 9
        for(int i = 0; i < charSet[2].length; i++){
            charSet[2][i] = (char) (48 + i);
        }
        
        for(int i = 0; i < charLength; i++){
            int r = rand.nextInt(4);
            int c = rand.nextInt(charSet[r].length);
            password += charSet[r][c];
        }
        System.out.println("Your generated password: " + password);
    }
}
