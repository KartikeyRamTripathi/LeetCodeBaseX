class Solution {
    public boolean isPalindrome(int x) {
        int X = x;
        int rev = 0;
        while(x>0){
            int lastdigit = x%10;
            x = x/10;
            if(rev>Integer.MAX_VALUE || (rev==Integer.MAX_VALUE && lastdigit>7)){
                return false;
            }
            if(rev<Integer.MIN_VALUE || (rev==Integer.MIN_VALUE && lastdigit<-8)){
                return false;
            }
            rev = (rev*10)+lastdigit; 
        }
        if(X==rev){
            return true;
        }
        else{
            return false;
        }

        
    }
}