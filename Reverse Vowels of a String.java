class Solution {
    
                            
            public String reverseVowels(String s) {
     Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        int start_pointer = 0;
        int end_pointer = s.length() - 1;


        char[] char_array = s.toCharArray();

        while(start_pointer < end_pointer) {
            while(start_pointer < end_pointer && !set.contains(s.charAt(start_pointer))) start_pointer++;
            while(start_pointer < end_pointer && !set.contains(s.charAt(end_pointer))) end_pointer--;

            char temp = char_array[start_pointer];
            char_array[start_pointer++] = char_array[end_pointer];
            char_array[end_pointer--] = temp;
        }

       return new String(char_array);

    }
}