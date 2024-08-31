class Solution {
    public int myAtoi(String s) {
    s = s.trim();
    if(s.isEmpty()){
        return 0;
    }
    return atoi(s,0,1,0);
    }

    static int atoi(String up,int start,int sign,long res){
        if(start==up.length()){
            return (int) (sign * res);
        }
        char c = up.charAt(start);
        if(Character.isDigit(c)){
            res = res*10 + (c-'0');

            if(res*sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(res*sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            return atoi(up,start+1,sign,res);
        }
        else if(start == 0 && (c=='-' || c=='+') ){
            if(c=='-')
            sign = -1;
            return atoi(up, start + 1, sign, res);
        }

        return (int) (sign * res);
    }
}
