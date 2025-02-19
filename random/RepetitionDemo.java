package random;

public class RepetitionDemo {

     public static void main(String[] args) {
        pyramid();
        halfInvertedTriangle();
        patternNumbers();
     }

     static void halfInvertedTriangle()
     {
        for(int i = 1 ; i <= 5; i++)
        {
            for(int j = 1; j <= 5 - i; j++)
            {
                System.err.print("* ");
            }
            System.err.println();
            
        }
     }

     static void pyramid()
     {
        for(int i = 1 ; i <= 5; i++)
        {
            for(int j = 1; j <=  5 - i ; j ++)
            {
                System.err.print(" ");
            }

            for(int k = 1; k <= i; k++)
            {
                System.err.print("*");
                if(k < i)
                {
                    System.err.print(" ");
                }
            }
            System.err.println();
        }
     }

     // 1 
     // 2 1
     // 3 2 1
     static void patternNumbers()
     {
        for(int i = 1; i < 5;i ++)
        {
            for(int j = i; j >= 1; j--)
            {
                System.out.printf("%d" ,j);
            }
            System.err.println();
        }
     }
}