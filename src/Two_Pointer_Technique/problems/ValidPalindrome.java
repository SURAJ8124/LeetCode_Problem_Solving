package Two_Pointer_Technique.problems;

public class ValidPalindrome {

    public static boolean isPalindrome(String s){
       s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start=0;
        int end=s.length()-1;
        while (start<(end+1)){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
       return true ;
    }
    public static void main(String[] args){
      String s = "A man, a plan, a canal: Panama";
        String s2 =  "race a car";
       System.out.println(isPalindrome(s));
     System.out.println(isPalindrome(s2));
    }
}
