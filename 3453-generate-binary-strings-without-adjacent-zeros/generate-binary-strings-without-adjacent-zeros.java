class Solution {
    public List<String> validStrings(int n) {
    
    List<String> str=new ArrayList<>();
    answer(n,"",str);
    return str;
        
    }
    public void answer(int n, String s,List<String> str){
        if(s.length()==n){
            str.add(s);
            return;
        }
        answer(n,s+"1",str);
        if(s.isEmpty() || s.charAt(s.length()-1)!='0'){
            answer(n,s+"0",str);
        }
    }
}