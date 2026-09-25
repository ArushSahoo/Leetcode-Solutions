class Solution 
{
    public void setZeroes(int[][] matrix) 
    {
        int row=0;
        int col=0;
        HashSet<Integer> zeroRows = new HashSet<>();
        HashSet<Integer> zeroCols = new HashSet<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j] == 0)
                {
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(zeroRows.contains(i) || zeroCols.contains(j))
                {
                    matrix[i][j]=0;
                }
            }
        }   
    }
}