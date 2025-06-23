class Solution {
    static ArrayList<String> makeString(char[][] board){
        ArrayList<String> l=new ArrayList<>();
        for(int i=0;i<board.length;i++)
        {
            String row=new String(board[i]);
            l.add(row);
        }
        return l;
    }

    static boolean safe(char[][] board, int row, int col)
    {
        
        for(int i=0;i<row;i++)
        {
            if(board[i][col]=='Q') return false;
        }

        
        int minLeft=Math.min(row, col);
        for(int i=1;i<=minLeft;i++){
            if(board[row-i][col-i]=='Q') return false;
        }

       
        int maxRight=Math.min(row, board.length-1-col);
        for(int i=1;i<=maxRight;i++)
        {
            if(board[row-i][col+i]=='Q') return false;
            
        }
        return true;
    }


    static void queen(char[][] board, int row, List<List<String>> ans)
    {
        if(row==board.length)
        {
            ans.add(makeString(board));
            return;

        }

        for(int col=0;col<board.length;col++)
        {
            if(safe(board,row, col)){
                board[row][col]='Q';
                queen(board,row+1,ans);
                board[row][col]='.';
            }

        }
    }
    public List<List<String>> solveNQueens(int n) {
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]='.';
            }
        }

        List<List<String>> ans=new ArrayList<>();
        queen(board,0,ans);
        return ans;



        
    }
}