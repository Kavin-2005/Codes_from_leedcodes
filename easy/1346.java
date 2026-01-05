//Brutforce methode
class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j&&arr[j]==arr[i]*2){
                    return true;
                }
            }
        }
        return false; 
    }
}
//hashmap
HashMap<Integer, Integer> hs = new HashMap<>();

for (int i = 0; i < arr.length; i++) {
    hs.put(arr[i], i);
}

for (int i = 0; i < arr.length; i++) {
    if (hs.containsKey(arr[i] * 2) && i != hs.get(arr[i] * 2)) {
        return true;
    }
}

return false;
