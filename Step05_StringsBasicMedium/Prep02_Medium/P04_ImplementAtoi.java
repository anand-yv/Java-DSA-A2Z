package Step05_StringsBasicMedium.Prep02_Medium;

public class P04_ImplementAtoi {

    public int myAtoi(String s) {
        int len = s.length();
        int flag = 1;
        int i = 0;
        long ans = 0;
        while(i < len && s.charAt(i) == ' ') i++;
        if(i < len && (s.charAt(i) == '-' || s.charAt(i) == '+')){
            if(s.charAt(i) == '-') flag = -1;
            i++;
        }
        while(i < len && '0' <= s.charAt(i) && s.charAt(i) <= '9'){
            ans = (ans*10) + (s.charAt(i) - '0');
            if(ans > Integer.MAX_VALUE){
                if(flag == -1) return Integer.MIN_VALUE;
                else return Integer.MAX_VALUE;
            }
            i++;
        }
        // System.out.println(flag*ans);
        // System.out.println(Integer.MIN_VALUE);

        return (int)ans*flag;
    }

}
