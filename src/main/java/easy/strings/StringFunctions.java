package easy.strings;

public class StringFunctions {
    public boolean isGivenIntegerAPalindrome(int x) {
        String inp = String.valueOf(x);
        char[] inpt = inp.toCharArray();
        int n = inpt.length;
        boolean f = true;
        for(int i=0;i<=n/2;i++){
            if(inpt[i]==inpt[n-i-1]);
            else {f= false;break;}
        }
        return f;
    }
}
