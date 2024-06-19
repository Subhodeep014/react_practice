import java.util.*;
public class prac1 {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.print(fibonacci(i)+" ");
        }
        System.out.println();
        palindromeNum(5, 1);
        System.out.println();
        System.out.println("Longest length : " + lengthOfLongestSubstring("dvdf"));
        List<String> list = new ArrayList<>(); 
        permutation("", "abc", list);
        System.out.println(list);
    }
    public static void permutation(String p, String up, List<String> list){
        if(up.isEmpty()){
            list.add(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0,i);
            String e = p.substring(i, p.length());
            permutation(f+ch+e, up.substring(1), list);
        }
    }   
    public static int fibonacci(int n){
        double phi = (1 + Math.sqrt(5))/2;
        double psi = (1 - Math.sqrt(5))/2;
        return (int)((Math.pow(phi, n) - Math.pow(psi, n)) / Math.sqrt(5));
    }
    public static void palindromeNum(int n, int start){
        if(start==n){
            System.out.print(start+" ");
            return ;
        }
        System.out.print(start+" ");
        palindromeNum(n, start+1);
        System.out.print(start+ " ");
    }
    public static int lengthOfLongestSubstring(String s) {
        int max_length = 0;
        String st = "";
        for(int i=0; i<s.length(); i++){
            if(st.contains(s.charAt(i) + "")){
                st="";
            }
            st+=s.charAt(i);
            max_length = Math.max(max_length, st.length());
        }
        return max_length;
    }
}
