import java.util.Scanner;

public class ReadingRoom {

    public static Scanner sc = new Scanner(System.in);

    public int getSingleInteger(){
        int n = Integer.MIN_VALUE;
        try{
            n = sc.nextInt();
        }
        catch (Exception ex){

        }
        return n;
    }

    public String getString(){
        String s = "";
        try{
            s = sc.next();
        }
        catch (Exception ex){

        }
        return s;
    }

    public int[] getIntArray(int n){
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
