class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        
        for(int i=0; i<firstWord.length(); i++)
            sb1.append((int)firstWord.charAt(i)-97);
        
        for(int i=0;i<secondWord.length();i++)
            sb2.append((int)secondWord.charAt(i)-97);
        
        for(int i=0;i<targetWord.length();i++)
            sb3.append((int)targetWord.charAt(i)-97);
        
        int i=Integer.parseInt(sb1.toString());
        int j=Integer.parseInt(sb2.toString());
        int k=Integer.parseInt(sb3.toString());
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        
        return (i+j == k);
        
    }
}