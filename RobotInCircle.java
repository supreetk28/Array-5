// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public boolean isRobotBounded(String instructions) {
                                    //N, W, S, E
        int[][] dirs = new int[][]{{0, 1}, {-1, 0}, { 0,-1}, {1, 0}};

        int x = 0, y = 0;
        int idx = 0;

        for(char c: instructions.toCharArray()){
            if(c == 'G'){
                x += dirs[idx][0];
                y += dirs[idx][1];
            }else if(c == 'L'){
                idx = (idx + 1 ) % 4;
            }else if( c == 'R'){
                idx = (idx + 3) % 4;
            }
        }

        if((x == 0 && y == 0) || idx != 0) return true;
    
        return false;
    }
}
