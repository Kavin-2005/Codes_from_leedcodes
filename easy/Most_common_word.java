class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        paragraph = paragraph.toLowerCase();

        // Replace punctuation with spaces
        paragraph = paragraph.replaceAll("[^a-z]", " ");

        String[] words = paragraph.split("\\s+");

        int[] freq = new int[words.length];

        for (int i = 0; i < words.length; i++) {

            if (words[i].equals(""))
                continue;

            boolean bannedWord = false;

            for (String b : banned) {
                if (words[i].equals(b)) {
                    bannedWord = true;
                    break;
                }
            }

            if (bannedWord)
                continue;

            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    freq[i]++;
                }
            }
        }

        int max = 0;
        String ans = "";

        for (int i = 0; i < words.length; i++) {
            if (freq[i] > max) {
                max = freq[i];
                ans = words[i];
            }
        }

        return ans;
    }
}
class Solution {
    public String mostCommonWord(String para, String[] banned) {
        para=para.toLowerCase();
        HashMap<String,Integer> hm=new HashMap<>();
        para=para.replaceAll("[^a-z]"," ");
        String words[]=para.split("\\s+");
        for(int i=0;i<words.length;i++){
            hm.put(words[i],hm.getOrDefault(words[i],0)+1);
        }
        List<Map.Entry<String,Integer>>list=new Arraylist<>(hm.entryset());
        list.sort((a,b)->b.getValue()-a.getValue());
          
    }
}
