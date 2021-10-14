/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    
    int low=1, high=0, num;
    public int guessNumber(int n) {
        
        // if(high==-1) {
        //     num=n;
        //     high = n;
        // }
        
        //System.out.println("low= "+low);
        //System.out.println("high= "+high);
        //System.out.println("n= "+n);
        int res = guess(n);
       //System.out.println(res);
        
        if(res==-1) {
            high = n;
            return guessNumber((low/2)+(high/2));
        }
        else if(res==1) {
            low = n;
            return guessNumber((low/2)+(high/2)+1);
        }
        else
            return n;
    }
}