import java.util.Scanner;
public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]a= new int[3][3];
        int [][]b = new int[3][3];
        int [][]c = new int[3][3];
        System.out.println("Enter the elements of the matrix1");
        for(int i = 0;i<3;i++)
        {
            for(int j =0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the matrix2");
        for(int i = 0;i<3;i++)
        {
            for(int j =0;j<3;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        //logic for the multiplication of the matrix
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        //displaying the resultant matrix
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
