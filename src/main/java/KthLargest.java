public class KthLargest {

    public int kthLargest(int[] arr, int k){
        if(k>=0 && k<arr.length && arr.length>0){
            for(int j=0; j<arr.length-1; j++){
                int count=0;
                for(int i=1; i<arr.length; i++){
                    int val=0;
                    if(arr[i]>arr[i-1]){ val=arr[i]; arr[i]=arr[i-1]; arr[i-1]=val; count++; }
                }
                if(count==0){break;}
            }
            return arr[k-1];}
        else{System.out.println("Ошибка");
            return 0; }
    }
}
