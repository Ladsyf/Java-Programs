
package self.dividing.number;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumber {

    public static void main(String[] args) {
        System.out.print(selfDividingNumbers(10,10));
    }
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List ans = new ArrayList<>();
        
        for(int i = left; i <= right; i++){
            
//            if(isSelfDividing(i)){
//                ans.add(i);
//            }
            System.out.print(i);
        }
         
        return ans;
    }
    public static boolean isSelfDividing(int number){
        int reserve = number, ld;
        while(number != 0){
            ld = number%10;
            if(reserve % ld != 0){
                return false;
            } 
            number = number/10;
        }
        return true;
    }
    
    
}
