import java.util.HashSet;

public class NumberOccurrences {

    public int[][] numberOccurrences(int [] arr){
        HashSet<Integer> key=new HashSet <Integer>();
        for(Integer i:arr){
            key.add(i);}
        int [][] rezult=new int [key.size()][2];
        int k=0;
        for(Integer i: key){
            int count=0;
            for(int j:arr){
                if(i==j){count++;} }
            rezult[k]=new int[]{i, count};
            k++;
        }
        return rezult;
    }
}
