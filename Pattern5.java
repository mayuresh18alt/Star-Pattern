public class Pattern5
{
    public static void pattern5(int n)
    {
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int n=5; 
        pattern5(n);  
    }    
}
