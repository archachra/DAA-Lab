package Java2;
class A1Q4{
    static int maxSubArraySum(int arr[]){
        int max=arr[0];
        int currMax=arr[0];
        for(int i=1;i<arr.length;i++){
            currMax=Math.max(arr[i],currMax+arr[i]);
            max=Math.max(max,currMax);
        }
        return max;
    }

    public static void main(String args[]){
        int arr[]={-2,-5,6,-2,-3,1,5,-6};
        System.out.println(maxSubArraySum(arr));
    }
}
