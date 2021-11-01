class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        
        int m = nums.length, n = nums[0].length;
       if (m * n != r * c) return nums;
        
        int[][] result = new int[r][c];
        int row = 0, col = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[row][col] = nums[i][j];
                col++;
                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }
        
        return result;
    }
}
//         int b[][]=new int[r][c];
//         int row =0;
//         int col=0;
//         for(int i=0;i<mat.length;i++)
//         {
//             for(int j=0;j<mat[0].length;j++)
//             {
//                 b[row][col]=mat[i][j];
//                 col++;
//                 if(col==mat[0].length)
//                 { col=0;
//                     row++;
//                 }
//             }
//         }return b;
//     }
// }