class Recursion {
    public static void main(String[] args) {
        int grid[][]=
        {
            {1,1,1,0,1},
            {0,1,1,0,1},
            {0,1,1,0,0},
            {0,0,1,1,1}
        };
        int m = grid.length;
        int n = grid[0].length;
        recursion(0,0,grid,m,n);
    }
    static void recursion(int row, int col , int grid[][] , int m , int n)
    {
        //base case
        if(row == m-1 && col == n-1){
            System.out.println("reached");
            return;
        }
        //go to right
        if(row >= 0 && row < m && col >= 0 && col < n && grid[row][col] == 1){
            recursion(row,col+1,grid,m,n);
        }

        // go to down
        if(row >= 0 && row < m && col >= 0 && col < n && grid[row][col] == 1){
            recursion(row+1,col,grid,m,n);
        }
    }
}