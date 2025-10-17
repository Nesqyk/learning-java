package random;

import java.util.Scanner;

public class Repetition {

    public static void main(String[] args) {
        rightTriangle();

        box();

        invertedRightTriangle();

        pyramidPattern();

        floydsTriangle();

        printPyramid(5);
        printLeftPyramid(5);
        printInvertedPyramid(5);
        printFloydsTriangle(5);
        countingNumbers(20);
    }

    // Example of Counter While Loop
    static void counterWhileLoop()
    {
        Scanner console = new Scanner(System.in);

        System.err.print("Enter the limited numbers: ");

        int limit = console.nextInt();
        int number, sum = 0, counter = 0;

        System.err.println();
        do 
        {
            System.err.printf("Enter number for %d : ", counter + 1);
            number = console.nextInt();
            sum += number;
            counter++;
        } while(counter < limit);
        
        System.err.printf("\nSum of the %d numbers is : %d\n", limit, sum);

        double average = (double) sum / limit;

        System.err.printf("The average of the %d numbers is : %.2f\n", limit, average);
        
        console.close();
    }

    // Sentinel Controlled While Loop.
    // Example
    static void readAgePeople()
    {
        Scanner s = new Scanner(System.in);

        int maxPeople = 15;
        int counterPeople = 0;
        int ageNumber;

        // less than 0-5          // 6 to 17    // 18 & over
        int babyAgeCounter = 0, schoolAgeCounter = 0, adultAgeCounter = 0;

        do {
            System.err.printf("Please enter age for Person #%d : ", counterPeople + 1);

            ageNumber = s.nextInt();

            if(ageNumber <= 5)
            {
                babyAgeCounter++;
            } else if(ageNumber >= 6 && ageNumber <= 17)
            {
                schoolAgeCounter++;
            } else {
                adultAgeCounter++;
            }
        
            counterPeople++;
        } while(counterPeople != maxPeople);

        System.out.printf("\nNo of Babies (0-5) : %d\n", babyAgeCounter);
        System.out.printf("Teenagers (6-17) : %d\n", schoolAgeCounter);
        System.out.printf("18 and over  : %d\n", adultAgeCounter);

        s.close();
    }

    // Flag While Loop : using boolean

    static void guessingGame()
    {
        Scanner s = new Scanner(System.in);

        int min = 0, max = 99;

        // 99 - 1 ??
        // + 1

        int range = (max-min) + 1;

        // Ma
        int randomNum = (int)(Math.random() * range) + min;

        System.err.println("Randomy Number : " + randomNum);
        // range man

        // alternate to this?
        // int min = 0, max = 99;

        // int range = (max-min) + 1;

        int input = -1;
        do {
            System.err.printf("\nPlease enter number: ");
            input = s.nextInt();

            if(input < randomNum)
            {
                System.err.println("\nYour guess is lower than the number");
            } else if(input > randomNum)
            {
                System.err.println("\nYour guess is higher than the number");
            }

        } while(input != randomNum);

        System.err.println("\nYour guess is correct!");

        s.close();
        // do {
        //     input = s.nextInt();
        // } while();
    }

    static void leftTriangle()
    {
        for(int row = 0 ; row < 5; row ++)
        {
            for(int column = 0; column < row; column++)
            {
                System.err.print("*");
            }
            System.err.println();
        }
    }

    static void rightTriangle()
    {
        //      *
        //     **
        for(int row = 0; row < 5; row++)
        {
            for(int column = 5; column > row; column--)
            {
                System.err.print(" ");
            }
            
            for(int k = 0 ; k  < row; k++)
            {
                System.err.print("*");
            }

            System.err.println();
            
        }
    }

    static void box()
    {
        System.err.println();
        /*
         * ***
         * ***
         * ***
         */

        for(int row = 0; row < 3; row++)
        {
            System.err.println("*****");
        }
    }

    /* CORRECT
        *****
        ****
        ***
        **
        *
    */
    static void invertedRightTriangle()
    {
        System.err.println();
        // we start with five?

        for(int row = 0 ; row < 5; row++)
        {
            for(int col = 5; col > row; col--)
            {
                System.err.print("*");
            }
            System.err.println();
          }
    }

    /* CORRECT
         *
        ***
       *****
      *******
     *********
    */

    // logic
    // spaces
    static void pyramidPattern()
    {
        // we to take care of the spaces?

        for(int i = 0; i < 5;i ++)
        {
            // right one
            // while loop for spaces here;

            for(int j = 5; j > i; j--)
            {
                // 5 spaces
                // 4 
                // 3
                // 2
                System.out.print(" ");
            }

            for(int k = 0; k < (2 * i - 1); k++)
            {
                System.out.print("* ");
            }

            System.err.println();
        }
    }
    /* partially CORRECT

        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
    */
    static void floydsTriangle()
    {
        System.err.println();
        int number = 1;
        for(int i = 0; i <= 5;i++)
        {
            for(int j = 0 ; j < i; j++)
            {
                System.out.printf("%d ", number);
                number++;
            }

            System.err.println();
        }
    }


    // Read User for Max Row
    // Pyramid 
    static void printPyramid(int max)
    {
        for(int i = 0 ; i <= max; i++)
        { 
            // prints spaces
            for(int j = 0; j < max-i; j++)
            {
                System.out.print(" ");
            }

            for(int k = 0 ; k < i; k++)
            {
                System.out.print("*");
                
                if(k < i)
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void printLeftPyramid(int max)
    {
        for(int i = 0 ; i <= max; i++)
        {
            for(int j = 0 ; j < i; j++)
            {
                System.err.print("*");
            }
            System.out.println();
        }
    }

    static void printInvertedPyramid(int max)
    {
        System.err.println();
        for(int i = 0 ; i <= max; i++)
        {
            for(int j = 0; j <= max-i; j++)
            {
                System.out.printf("*");
            }
            System.err.println();
        }
    }

    static void printFloydsTriangle(int max)
    {
        System.out.println();
        int number = 1;
        for(int i = 0; i <= max; i++)
        {
            for(int j = 0 ; j < i; j++)
            {
                System.out.printf("%d ", number);
                number++;
            }
            System.err.println();
        }
    }

    static void countingNumbers(int max)
    {

        if(max > 50 || max < 0)
        {
            System.out.println("Please input numbers from 0-50");
        }

        for(int i = 0 ; i < max; i++)
        {
            System.out.printf("%d ", i);

            if((i + 1) % 10 == 0)
            {
                System.out.println();
            }
        }
    }
}
