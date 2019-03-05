import java.util.Scanner;

public class TotalOccurences {
    public static int checkOccurence(String str1, String str2){
        int count  = 0;
        for (int  i=0; i<str1.length();i++){
            if(str1.charAt(i) == str2.charAt(0)){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        checkOccurence(str1, str2);
    }
}
