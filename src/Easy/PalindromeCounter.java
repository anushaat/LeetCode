package Easy;

public class PalindromeCounter {
	
	public static int countPalindromes(String s){
		int n = s.length();
		int dp[][]=new int[n][n];
    	for(int i=0;i<n;i++)
    	{
    		dp[i][i]=1;
    	}
    	for(int i=1;i<n;i++)
    	{
    		for(int j=0;j<n-i;j++)
    		{
    			if(i==1)
    			{
    				if(s.charAt(j)==s.charAt(j+i))
        			{
        					dp[j][j+i]=1;
        			}
    			}
    			else if(s.charAt(j)==s.charAt(j+i))
    			{
    				if(dp[j+1][j+i-1]==1)
    				{
    					dp[j][j+i]=1;
    				}
    			}
    		}
    	}
    	int sum=0;
    	for(int i=0;i<n;i++)
    	{
    		for(int j=0;j<n;j++)
    		{
    			sum+=dp[i][j];
    		}
    	}
    	return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countPalindromes("daata"));

	}

}
