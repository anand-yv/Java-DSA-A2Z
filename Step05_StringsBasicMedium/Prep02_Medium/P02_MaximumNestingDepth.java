package Step05_StringsBasicMedium.Prep02_Medium;

public class P02_MaximumNestingDepth {
    public int maxDepth(String s) {
        int res = 0;
        int open = 0;
        for(Character ch: s.toCharArray()){
            if(ch == '('){
                open++;
                res = Math.max(res, open);
            }
            else if(ch == ')') open--;
        }
        return res;
    }
}
