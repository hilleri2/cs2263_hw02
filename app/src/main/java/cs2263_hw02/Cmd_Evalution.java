package cs2263_hw02;

import java.util.Scanner;

import static cs2263_hw02.App.EvaluateString;

public class Cmd_Evalution {
    /**
     * This method accepts a string from the command line and, assuming it is an
     * expression, returns the evaluation of that expression
     * @return the evaluation of the most recent string input from the command line
     */
    public static double CmdEvaluation(){
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        //System.out.println("The total of the expression is " + EvaluateString(sentence));
        return EvaluateString(sentence);
    }

}
