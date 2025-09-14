package DSA;
class NQueens {
    final int N = 4;

    void printBoard(int board[][]) {
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++)
                System.out.print(board[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }

    boolean isSafe(int board[][], int row, int col) {
        for(int i=0;i<col;i++)
            if(board[row][i]==1) return false;
        for(int i=row,j=col; i>=0 && j>=0; i--,j--)
            if(board[i][j]==1) return false;
        for(int i=row,j=col; i<N && j>=0; i++,j--)
            if(board[i][j]==1) return false;
        return true;
    }

    boolean solveUtil(int board[][], int col) {
        if(col>=N) {
            printBoard(board);
            return true;
        }
        boolean res=false;
        for(int i=0;i<N;i++) {
            if(isSafe(board,i,col)) {
                board[i][col]=1;
                res = solveUtil(board,col+1) || res;
                board[i][col]=0;
            }
        }
        return res;
    }

    void solve() {
        int board[][] = new int[N][N];
        if(!solveUtil(board,0)) System.out.println("No Solution");
    }

    public static void main(String[] args) {
        NQueens q = new NQueens();
        q.solve();
    }
}
