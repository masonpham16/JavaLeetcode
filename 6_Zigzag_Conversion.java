import java.util.List;
import java.util.ArrayList;

class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s; // Edge case: No zigzag needed
        }

        // Create a list of arraylists for rows
        List<ArrayList<Character>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(new ArrayList<>()); // Add an empty ArrayList for each row
        }

        // Fill the rows in a zigzag pattern
        int index = 0; // Current row
        boolean down = true; // Direction flag

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            list.get(index).add(letter); // Add character to the current row

            // Change direction if at the top or bottom row
            if (index == 0) {
                down = true;
            } else if (index == numRows - 1) {
                down = false;
            }

            // Move up or down
            index += down ? 1 : -1;
        }

        // Combine all rows into a single string
        StringBuilder result = new StringBuilder();
        for (ArrayList<Character> row : list) {
            for (char c : row) {
                result.append(c);
            }
        }

        return result.toString();
    }
}

