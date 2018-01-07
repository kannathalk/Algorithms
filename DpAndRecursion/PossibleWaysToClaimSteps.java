import java.io.*;
import java.util.*;
public class PossibleWaysToClimbSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of steps to be climbed");
        int noOfSteps = sc.nextInt();
        PossibleWaysToClimbSteps pWaysObject = new PossibleWaysToClimbSteps();
        System.out.println("No of ways to climb"+ noOfSteps + "steps are:" + pWaysObject.findPossib\
leWays(noOfSteps));
    }

    public int findPossibleWays(int n) {
        /* Top down recursion works here.                                                           
            Thought Process:                                                                        
             What are all the ways to reach nth step?                                               
                  It can be from n-1 th step or n-2 step or n-3 step                                
                                                                                                    
                   How to reach n-1 th step?                                                        
                        It can be from (n-1)-1 step or (n-1)-2 step or (n-1)-3 step                 
                         And this continues.                                                        
        */
        int ways;
        if(n < 0) {
            return 0;
        }
        else if(n == 0) {
            return 1;
        }
        else {
            ways = findPossibleWays(n-1) + findPossibleWays(n-2) + findPossibleWays(n-3);
            return ways;
        }
    }
}
