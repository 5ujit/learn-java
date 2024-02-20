package loops.For;

public class NestedPattern {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++)// row
        {
            for(j=1;j<=5;j++ ) // colunm
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

