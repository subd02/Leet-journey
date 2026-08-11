class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ranfreq= new int[26];
        int[] magfreq= new int[26];
        for(int i=0; i<ransomNote.length(); i++){
            char c= ransomNote.charAt(i);
            ranfreq[c- 'a']++;
        } 
        for(int i=0; i<magazine.length(); i++){
            char c= magazine.charAt(i);
            magfreq[c- 'a']++;
        }
        for(int i=0; i<ransomNote.length(); i++){
            char c= ransomNote.charAt(i);
            if(ranfreq[c- 'a']> magfreq[c- 'a']){
                return false;
            }
        } 
        return true;
    }
}