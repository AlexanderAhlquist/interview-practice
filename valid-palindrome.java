class Solution {
    public boolean isPalindrome(String s) {
        char[] checker = s.trim().replaceAll("[^a-zA-Z0-9]+", "").toLowerCase().toCharArray();
        for (int i =0; i < checker.length/2; i++){
            System.out.println(checker[i]);
            System.out.println(checker[checker.length-i-1]);
            if(checker[i] == checker[checker.length-1-i]){
                continue;
            }
            return false;
        }
        return true;
    }
}
