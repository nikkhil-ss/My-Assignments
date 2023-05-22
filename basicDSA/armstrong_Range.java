package basicDSA;

import java.util.ArrayList;
import java.util.List;

class range {
    public int[] armstrong(int min , int max) {
        List<Integer> armArray=new ArrayList<Integer>();
        for (int i = min; i <=max; i++) {
            int sum = 0;
            int temp=i;
            while (temp > 0) {
                int rem = temp % 10;
                sum += Math.pow(rem, 3);
                temp = temp / 10;
            }
            if (sum == i) {
                armArray.add(i);
            }
        }
        int[] resultArr=new int[armArray.size()];
        for(int i=0;i<armArray.size();i++){
            resultArr[i]=armArray.get(i);
        }
        return resultArr;
    }
}
public class armstrong_Range {
    public static void main(String[] args) {
        int min=100;
        int max=999;
        System.out.println("Armstrong numbers");
        System.out.println("From:"+min+" To:"+max);
        range armObj=new range();
        int[] resultArr=armObj.armstrong(min,max);
        for(int i=0;i<resultArr.length;i++){
            System.out.print(resultArr[i]+" ");
        }
    }
}
