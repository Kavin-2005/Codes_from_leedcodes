
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int [] Evenarray=new int[nums.length/2];
        int [] Oddarray=new int[nums.length/2];
        int a=0,b=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                Evenarray[a++]=nums[i];
            }else
            Oddarray[b++]=nums[i];
        }
        int [] array=new int[nums.length];
        for(int i=0;i<nums.length/2;i++){
            array[2*i]=Evenarray[i];
            array[2*i+1]=Oddarray[i];
        }
        return array;   
    }
}
