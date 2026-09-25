class Solution 
{
    public int maximumWealth(int[][] accounts) 
    {
        int richest = 0;
        for (int i = 0; i < accounts.length; i++) 
        {
            for (int j = 1; j < accounts[i].length; j++) 
            {
                accounts[i][j] = accounts[i][j] + accounts[i][j - 1];
            }
            int totalWealth = accounts[i][accounts[i].length - 1];
            if (totalWealth > richest) 
            {
                richest = totalWealth;
            }
        }
        return richest;
    }
}