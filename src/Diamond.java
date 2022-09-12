import java.util.Scanner;

public class Diamond {
    public static void main(String[] args){
        int n,i,j,g=1;
        System.out.print("Enter the number of rows:");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        g=n-1;
        for(j=1;j<=n;j++)
        {
            for(i=1;i<=g;i++)
            {
                System.out.print(" ");
            }
            g--;
            for(i=1;i<=2*j-1;i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        g=1;
        for(j=1;j<=n-1;j++)
        {
            for(i=1;i<=g;i++)
            {
                System.out.print(" ");
            }
            g++;
            for(i=1;i<=2*(n-j)-1;i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
