class Solution {
    public void reverseString(char[] s) {

        int first_pointer = 0;
        int last_pointer = s.length-1;

        while(first_pointer <= last_pointer){
            char temp = s[first_pointer];
            s[first_pointer] = s[last_pointer];
            s[last_pointer] = temp;
            first_pointer++;
            last_pointer--;
        }
    }
}