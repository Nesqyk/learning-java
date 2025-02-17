public class ControlStructure {
    

    public static void main(String[] args) {
        evaluateProblems();
    }

    // ? Relational Operators
    // - allows you to make comparison
    // - [==, >=, <=, !=, <, >]

    // ? Logical (Boolean) Operators
    // - [ ! (not), && (and), || (or) ]

    // remember ! is just negation
    // i.e      (!expression)
    // true         false
    // false        true


    // Precendence (Highest to Lowest)
    // !, +, - (unary operators) FIRST
    // *, /, % SECOND
    // + , - THIRD
    // <, <=, >=, > FOURTH
    // ==, != FIFTH
    // && SIXTH
    // || SEVEN
    // =(assignment operator) EIGHT

    // Practice
    static void evaluateProblems()
    {
        // Problem 1: Evaluate the following expression:
        // ((5 > 3) && (2 < 1)) || !(4 == 4)
        System.out.println("Problem 1: " + (((5 > 3) && (2 < 1)) || !(4 == 4)));
        
        // Problem 2: Evaluate the following expression:
        // (10 % 3 == 1) && ((7 * 2 > 10) || false)
        System.out.println("Problem 2: " + ((10 % 3 == 1) && ((7 * 2 > 10) || false)));
        
        // Problem 3: Evaluate the following expression:
        // !((8 / 2 == 4) && (3 + 2 != 5)) || (6 - 4 == 2)
        System.out.println("Problem 3: " + (!((8 / 2 == 4) && (3 + 2 != 5)) || (6 - 4 == 2)));
        
        // Problem 4: Evaluate the following expression:
        // ((5 >= 5) || (3 < 2)) && !((2 > 3) && (1 <= 1))
        System.out.println("Problem 4: " + (((5 >= 5) || (3 < 2)) && !((2 > 3) && (1 <= 1))));
        
        // Problem 5: Evaluate the following expression:
        // ((true && false) || (true && !false)) && (false || (3 == 3))
        System.out.println("Problem 5: " + ((((true && false) || (true && !false)) && (false || (3 == 3)))));
        
        // Problem 6: Evaluate the following expression:
        // (5 < 3) || ((7 >= 7) && !(2 != 2))
        System.out.println("Problem 6: " + ((5 < 3) || ((7 >= 7) && !(2 != 2))));
        
        // Problem 7: Evaluate the following expression:
        // (3 == 3) && ((5 > 10) || !(6 < 4))
        System.out.println("Problem 7: " + ((3 == 3) && ((5 > 10) || !(6 < 4))));
        
        // Problem 8: Evaluate the following expression:
        // (10 - 2 * 5 == 0) && (3 + 2 != 6)
        System.out.println("Problem 8: " + ((10 - 2 * 5 == 0) && (3 + 2 != 6)));
        
        // Problem 9: Evaluate the following expression:
        // !(false || true) && (4 * 2 > 7)
        System.out.println("Problem 9: " + (!(false || true) && (4 * 2 > 7)));
        
        // Problem 10: Evaluate the following expression:
        // (true && (false || (3 < 5))) || (10 % 2 != 0)
        System.out.println("Problem 10: " + ((true && (false || (3 < 5))) || (10 % 2 != 0)));
    }

    // Selection
    //  One-way Selection - if only
    //  Two-way Selection - if, else
    //  Compound (block of) statements 
    //  Multiple selections (nested if): nested if
    //  Conditional Operator:  Ternary Operator
    //  switch structures: 

    // compare strings :compareTo()
}
