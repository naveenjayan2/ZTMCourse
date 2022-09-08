package Questions;

import java.util.HashMap;

public class ClimbingNStairs {

    int combinations=0;
    HashMap<Integer,Integer> lookup = new HashMap<>();
    public int climbStairs(int n) {

        climbRecursively(1,n);
        climbRecursively(2,n);

        return combinations;
    }

    public void climbRecursively(int steps, int remainingSteps){
            if(steps==remainingSteps){
                combinations++;
            }
            else if(steps<remainingSteps){
                if(lookup.get(steps-remainingSteps)!=null){
                    combinations=combinations+lookup.get(steps-remainingSteps);
                }else{
                    climbRecursively(1,remainingSteps-steps);
                    climbRecursively(2, remainingSteps-steps);
                }
            }
            lookup.put(steps-remainingSteps,combinations);
    }

    public static void main(String[] args) {
        int steps=45;//311903

        ClimbingNStairs climbingNStairs = new ClimbingNStairs();


        System.out.println(climbingNStairs.climbStairs(steps));
    }
}
