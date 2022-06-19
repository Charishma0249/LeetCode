class Solution {
    public int[][] indexPairs(String text, String[] words) {
        ArrayList<int[][]> foundWords = new ArrayList<>();  
        
        Comparator<int[]> customComparator = new Comparator<>() {
            
            @Override
            public int compare(int[] a, int[] b) {
                if(a[0]<b[0]) 
                    return -1;
                else if(a[0]==b[0]) {
                    if(a[1]<b[1])
                        return -1;
                    else 
                        return 1;
                }
                return 1;
            }
        };
        for(String word : words) {
            
            int start=0;
            int len = word.length();
            while(start+len <= text.length()) {
                start = text.indexOf(word, start);
                // System.out.println(start);
                if(start==-1) {
                    break;
                }
                
                foundWords.add(new int[][]{{start, start+len-1}});
                start++;
            }
        }
        
        // System.out.println(foundWords);
        int[][] results = new int[foundWords.size()][2];
        for(int i=0; i<foundWords.size(); i++) {
            int[][] arr = foundWords.get(i);
            results[i][0] = arr[0][0];
            results[i][1] = arr[0][1];
        }
        
        Arrays.sort(results, customComparator);
        
        return results;
    }
}