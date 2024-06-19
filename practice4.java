import java.util.*;
public class practice4 {
    public static void main(String[] args) {
        String digits = "234";
        if(digits.isEmpty() || digits==null){
            return;
        }
        Map<Character, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        backtrack(map, list, digits, new StringBuilder(), 0);
        System.out.println(list);

        char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };

        String word = "SEE";

        int m = board.length;
        int n = board[0].length;

        boolean isExists = false;
        // Iterate through each cell in the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Start the backtracking process from each cell
                if (backtrack2(board, word, i, j, 0)) {
                    isExists=true;
                }
            }
        }
        System.out.println(isExists);
        
    }
    public static void backtrack(Map<Character, String> map, List<String> list, String digits, StringBuilder curr, int index) {
        if (index == digits.length()) {
            list.add(curr.toString());
            return;
        }

        String s = map.get(digits.charAt(index));
        for (int i = 0; i < s.length(); i++) {
            curr.append(s.charAt(i));
            backtrack(map, list, digits, curr, index + 1);
            curr.deleteCharAt(curr.length() - 1); // Backtrack by removing the last         character
        }
    }
    private static boolean backtrack2(char[][] board, String word, int row, int col, int index) {
        // Check if we have completed the word
        if (index == word.length()) {
            return true;
        }

        // Check boundaries and current cell match
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] != word.charAt(index)) {
            return false;
        }

        // Mark the cell as visited
        char temp = board[row][col];
        board[row][col] = '#'; // Use a placeholder to mark the cell as visited

        // Explore all possible directions: up, down, left, right
        if (backtrack2(board, word, row, col + 1, index + 1) || // right
            backtrack2(board, word, row + 1, col, index + 1) || // down
            backtrack2(board, word, row, col - 1, index + 1) || // left
            backtrack2(board, word, row - 1, col, index + 1)) { // up
            return true;
        }

        // Restore the cell's value
        board[row][col] = temp;
        return false;
    }
}
