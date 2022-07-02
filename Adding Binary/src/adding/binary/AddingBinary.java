package adding.binary;

public class AddingBinary {


    public static void main(String[] args) {
        System.out.println(addBinary("100110","110101") + " -ans");
    }
    public static String addBinary(String a, String b) {
        String ans = "";
        String carry = "";
        int abs = Math.abs(a.length() - b.length());
        for(int i = 0; i < (Math.max(a.length(), b.length()) + 1); i++){
            carry += "0";
        }
        for(int i = 0; i < abs; i++){
                if(a.length() < b.length()){
                    a = "0" + a;
                }
                else{
                    b = "0" + b;
                }
            }
        
        for(int i = (a.length()- 1); i >= 0; i--){
            int addedVal = (Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(i)) + Character.getNumericValue(carry.charAt(i+1)));
            switch(addedVal) {
                case 0:
                    ans = "0" + ans;
                    break;
                case 1:
                    ans = "1" + ans;
                    break;
                case 2:
                    ans = "0" + ans;
                    carry = replaceStr(carry, (i));
                    break;
                case 3:
                    ans = "1" + ans;
                    carry = replaceStr(carry, (i));
                    break;
                default:
                    
            }
            System.out.println(addedVal);
        }
        if(carry.charAt(0) == '1'){
            ans = "1" + ans;
        
        }
        return ans;
        }
    
        public static String replaceStr(String str, int index){     
          if(str==null){
              return str;
          }else if(index<0 || index>=str.length()){
              return str;
          }
          char[] chars = str.toCharArray();
          chars[index] = '1';
          return String.valueOf(chars);       
      }
    }
   
//"10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101"
//"110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"
