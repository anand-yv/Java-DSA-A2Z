package Step05_StringsBasicMedium.Prep01_Easy;

public class P01_RemoveOutermostParantheses {
    public String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        int open = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                open++;
                if(open != 1){
                    res.append('(');
                }
            }
            else{
                open--;
                if(open != 0){
                    res.append(')');
                }
            }
        }
        return res.toString();
    }
}
