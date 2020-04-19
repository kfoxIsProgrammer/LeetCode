//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
class StepsReduceToZero {
    public int numberOfSteps (int num) {
        int counter =0;
        while(num != 0){
            if(num%2==0)
                num = num/2;
            else
                num -= 1;
            counter++;
        }
        return counter;
    }
}
