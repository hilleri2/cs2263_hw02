package cs2263_hw02;

import java.util.Scanner;

import static cs2263_hw02.App.EvaluateString;

public class Cmd_Evalution {
    public static double CmdEvaluation(){
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        //System.out.println("The total of the expression is " + EvaluateString(sentence));
        return EvaluateString(sentence);
    }

}
