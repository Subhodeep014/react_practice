import java.util.*;
public class prac3 {
    public static void main(String[] args) {
        String s = "abc";
        char[] sArr = s.toCharArray();
        System.out.println(Arrays.toString(sArr));  
        List<List<Character>> list = new ArrayList<>();
        backtrack(sArr, new ArrayList<>(), list, 0);
        System.out.println(list);

        List<String> ans = new ArrayList<>();
        combination("", "abc", ans);
        System.out.println(ans);
        ans.remove(ans.size()-1);
        System.out.println(ans);
    }
    public static void backtrack(char[] arr, List<Character> temp, List<List<Character>> list, int index){
        if(temp.size()==arr.length){
            list.add(new ArrayList<>(temp));
            return;   
        }
        for(int i=index;i<arr.length;i++){
            temp.add(arr[i]);
            backtrack(arr, temp, list, i);
            temp.remove(temp.size()-1);
        }
    }
    public static void combination(String p, String up, List<String> list){
        if(up.isEmpty()){
            list.add(p);
            return;
        }
        char ch = up.charAt(0);
        combination(p+ch, up.substring(1), list);
        combination(p, up.substring(1), list);
    }

}
