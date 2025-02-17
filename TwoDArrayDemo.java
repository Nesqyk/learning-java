import java.util.Scanner;

public class TwoDArrayDemo {

    public static void main(String[] args)
    {

        // Accessing and filling a 2D Array.
        // int[][] array = {
        //     {5, 3, 7},
        //     {2, 6, 4},
        //     {8, 1, 9}
        // };
        
        // System.out.println(array[0][1]); // Output: 3 (row 0, column 1)

        int[][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };

        sumOfRows(matrix);


        int num = 10;

        if(num > 10)
        {
            System.err.println(num);
        } else {
            System.out.println(num + 5);
        }

        System.err.println(57 % 9);

        // int x = (1 <= 3 && 'K' >= 'F') ? 5 : 12;

        // System.err.println(x);

        int x = 3;
        int y = 3;
        int z = x++ * --y;

        System.err.println(z);

        int alpha = 7;
        int beta = 6;

        switch(beta)
        {
            case 5: alpha = alpha + 1; break;
            case 6: alpha = alpha + 2; break;
            case 7: alpha = alpha + 3; break;
            default: alpha = alpha + 5; break;
        }

        System.err.println(alpha);

        int xx = 9;

        int yy = 0;

        if(xx < 4) {
            yy = 2;
        } else if(xx > 4)
        {
            if(xx > 7) 
            {
                yy = 4;
            } else {
                yy = 6;
            }
        } else {
            yy = 8;
        }

        System.err.println(yy);

        // Scanner console = new Scanner(System.in);
        // int numl = console.nextInt();
        
        // if(numl > 0) {
        //     numl = numl + 13;
        // } else if (numl >= 3)
        // {
        //     numl = numl +15;
        // }

        // System.err.println(numl);

        int d = 10;
        int e = 2;
        e += d++;

        System.err.println(e);
        test();
        test2();
        guess();
        bonus();
        int numss = '-';
        System.err.println(numss);
        testtt();
    }

    static void testtt()
    {
        int a = 1;
        int b = 1;
        int sum = 0;
        for(int i = 0 ; i < 3;i ++)
        {
            sum += a++ + ++b;
        }
        System.err.println(sum);
    }

    static final double SERVICE_BONUS1 = 10.00;
    static final double SERVICE_BONUS2 = 20.00;
    static final double ADDITIONAL_BONUS_RATE1 = 0.03;
    static final double ADDITIONAL_BONUS_RATE2 = 0.06;
    static void bonus()
    {

        double baseSalary;
        double bonus;
        double additionalBonus;
        double totalSale;

        int noService;
        double payCheck;

        baseSalary = 8500;

        noService = 5;

        bonus = SERVICE_BONUS1 * noService;

        totalSale = 9800;

        additionalBonus = totalSale * ADDITIONAL_BONUS_RATE1;

        payCheck = baseSalary + bonus + additionalBonus;

        System.err.printf("%.2f \n", payCheck);
    }

    static void guess()
    {
        int sum = 0;
        for(int i = 0 ; i < 3;i ++)
        {
            sum += ++i;
        }

        System.err.println(sum);
    }
    static void test2()
    {
        int a = 5, b = 2;
        int result = ++a * b-- + a-- - --b;
        System.err.println(result);
        
    }

    static void test()
    {
        int sum = 0;
        for(int i = 0 ; i < 3; ++i)
        {
            for(int j = 0 ; j < 2; j++)
            {
                sum += i++ + ++j;
            }
        }

        System.err.println(sum);
    }
    static void loopingThrough2d()
    {
        int list[][] = {
            {5, 3, 7},
            {2, 6, 4},
            {8, 1, 9}
        };

        for(int i = 0 ; i < list.length; i++) // ROW
        {
            for(int j = 0;  j < list[i].length; j++) // COLUMN
            {
                System.out.print(list[i][j]);
            }
            System.err.println();
        }
    }

    static void printMatrix(int[][] matrix)
    {
        for(int row = 0; row < matrix.length; row++)
        {
            for(int col = 0; col < matrix[row].length; col++)
            {
                System.out.printf("%7d", matrix[row][col]);
            }
            System.err.println();
        }
    }

    static void sumOfRows(int[][] matrix)
    {
        int sum;
        for(int row = 0; row < matrix.length; row ++)
        {
            sum = 0;
            for(int col = 0 ; col < matrix[row].length; col++)
            {
                sum += matrix[row][col];
            }
            System.out.println("Sum of Elements of Row : " + (row + 1) + " = " +  sum);
        }
    }
}
