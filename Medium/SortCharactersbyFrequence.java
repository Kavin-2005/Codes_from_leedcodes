class Solution {
     public String frequencySort(String s) {
		HashMap<Character,Integer>hm=new HashMap<>();
        for(char ch:s.toCharArray()) {
			hm.put(ch,hm.getOrDefault(ch,0)+1);
		}
		PriorityQueue<Map.Entry<Character,Integer>>pq=new PriorityQueue<>(
				(a,b)->{
					if(!a.getValue().equals(b.getValue())) {
						return b.getValue()-a.getValue();
					}
					return a.getKey()-b.getKey();});
		pq.addAll(hm.entrySet());
		String str="";
		while(!pq.isEmpty()) {
			Map.Entry<Character, Integer>res=pq.poll();
			str=str.concat(String.valueOf(res.getKey()).repeat(res.getValue()));
		}
		return(str);
        
    }
}
