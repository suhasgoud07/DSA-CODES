class Solution {

        public String longestPalindrome(String s) {
        String value = "";
        int size = 0;
        if(s != null && s.length() > 1 ) {
            char[] c = s.toCharArray();
            for (int i = 0; i < c.length; i++) {
                for (int j = c.length - 1; j >= i; j--) {
                    if (c[i] == c[j] && j - i + 1 > size) {
                        StringBuilder temp = new StringBuilder(s.substring(i, j + 1));
                        if (temp.toString().equals(temp.reverse().toString())) {
                            if (temp.toString().length() > size) {
                                value = temp.toString();
                                size = temp.toString().length();
                            }
                        }
                    }
                }
            }
        } else {
            value = s;
        }
        return value;
    }

}