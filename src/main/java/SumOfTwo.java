public class SumOfTwo {

    public int[][] sumOfTwo(int [] arr, int n){
        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length-1-i; j++){
                if(arr[i]+arr[j]==n) { count++;}
            }}
        int [][] rezult=new int [count][2];
        int k=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length-1-i; j++){
                if(arr[i]+arr[j]==n) { rezult[k]=new int []{arr[i],arr[j]}; k++; }
            }}

        return rezult;
    }
}
