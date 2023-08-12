package arrays;
import java.util.ArrayList;
import java.util.List;

/*
There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
Note that multiple kids can have the greatest number of candies.
 */
public class KidsWithGreatestCandies {
    public static void main(String[] args) {
        int [] candies = {12,1,12};
        int extraCandies = 10;
        List<Boolean> ans =  kidsWithCandies(candies,extraCandies);
        System.out.println(ans);
    }


//FOR kidsWithCandies RETURING BOOLEAN, METHOD.{BUT SLOW PROCESS, NOT OPTIMIZED} :(

  /*  static boolean[] kidsWithCandies(int[] candies, int extraCandies) {
        int[] tempArray = new int[candies.length];
        boolean [] outPutArray = new boolean [candies.length];
        for (int i = 0; i < candies.length; i++)
        {
            tempArray[i]=(candies[i]+extraCandies);
            outPutArray[i]=true;
            for (int j = 0 ; j < candies.length; j++)
            {
                if (tempArray[i] <candies[j])
                {
                    outPutArray[i]=false;
                    break;
                }
            }
        }
        return outPutArray;
    }*/


    //OPTIMIZED PROCESS==>> :-P
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> outPutArray = new ArrayList<Boolean>();
        int max =  candies[0];
        //FINDING MAX NUMBER!!
        for (int i=1 ;i<candies.length;i++){
            if(max<candies[i])
                max=candies[i];
        }

        //COMPARING THE TOTAL CANDIES ARE MAX OR NOT!!
        for (int candy : candies) {
            if (max <= candy + extraCandies) {
                outPutArray.add(true);
            } else outPutArray.add(false);
        }

        return outPutArray;
    }
}
