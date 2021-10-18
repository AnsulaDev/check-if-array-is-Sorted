class CheckArray {
    static boolean sorted(int arr[]){
        for(int i=1;i<arr.length;i++){
            if (arr[i] < arr[i-1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int arr[]={2,3,23,78,80,90};

        System.out.println(sorted(arr));
    }
}
