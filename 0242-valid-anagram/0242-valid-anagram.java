class Solution {
    public boolean isAnagram(String s, String t) {
        s=s.replaceAll("\\s","").toLowerCase();
        t=t.replaceAll("\\s","").toLowerCase();
        Map<Character,Integer> map= new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
       
        for(int i=0;i<s.length();i++){
            char s1=s.charAt(i);
            char s2=t.charAt(i);
            map.put(s1,map.getOrDefault(s1,0)+1);
            map.put(s2,map.getOrDefault(s2,0)-1);
        }
        for(int i:map.values()){
            if(i!=0){
                return false;
            }
            
        }
        return true;
    }
}