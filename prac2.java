import java.util.ArrayList;
import java.util.List;

public class prac2 {
    public static void main(String[] args) {
        int[] nums = {2,3,5};
        List<List<String>> list = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        int target = 8;
        String s = "aab";
        backtrack(list, temp, s, 0);
        System.out.println(list);
    }
    public static void backtrack(List<List<String>> list, List<String> tempList, String s, int start){
        if(start == s.length())
           list.add(new ArrayList<>(tempList));
        else{
           for(int i = start; i < s.length(); i++){
              if(isPalindrome(s, start, i)){
                 tempList.add(s.substring(start, i + 1));
                 backtrack(list, tempList, s, i + 1);
                 tempList.remove(tempList.size() - 1);
              }
           }
        }
     }
     
     public static  boolean isPalindrome(String s, int low, int high){
        while(low < high)
           if(s.charAt(low++) != s.charAt(high--)) return false;
        return true;
     }

}
