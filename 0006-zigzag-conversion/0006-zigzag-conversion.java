class Solution {
    public String convert(String s, int numRows) {
        // Edge case
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }
        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i = 0; i < numRows; i++){
            rows[i]=new StringBuilder();
        }

        int currentRow = 0;
        boolean goDown = true;

        for(char c : s.toCharArray()){
            rows[currentRow].append(c);
            if(currentRow == 0)
            goDown = true;
            else if(currentRow == numRows-1)
            goDown = false;

            if(goDown)
                currentRow++;
            else
                currentRow--;

        }

        StringBuilder result = new StringBuilder();
        for(StringBuilder row : rows)
            result.append(row);
        return result.toString();
        
    }
}

