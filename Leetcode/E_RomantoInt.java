package Leetcode;

//https://leetcode.com/problems/roman-to-integer/
public class E_RomantoInt {
    public int romanToInt(String s) {
        int ans = 0, num = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
            }
            if (4 * num < ans)
                ans -= num;
            else
                ans += num;
        }
        return ans;
    }
}
// //"LVIII"
// ans =0 4*1<0 ans=1;
// ans =1 4*1<1 ans=2;
// ans =2 4*1 <2 ans =3
// ans =3 4*5 <3 ans=8
// ans=8 4*50<8 ans =58