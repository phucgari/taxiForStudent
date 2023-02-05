import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static int getTaxi(int[] arr) {
        int[]countArr=new int[10];
        for (int team:arr) {
            for (int i=0;i<countArr.length;i++) {
                if(team+countArr[i]<=4){
                    countArr[i]+=team;
                    break;
                }
            }
        }
        int i;
        for (i = 0; i <countArr.length ; i++) {
            if(countArr[i]==0)break;
        }
        return i;
    }
}