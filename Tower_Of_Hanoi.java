import java.util.*;
public class Tower_Of_Hanoi {
    public static void HanoiPro(int n, String src, String helper, String Dest){
        if(n==1){
            System.out.println("Transfer " + n+" " + src + " to " + Dest);
            return;
        }
        HanoiPro(n-1, src, Dest, helper);
        System.out.println("Transfer "+ n + " "+ src + " to " + Dest);
    HanoiPro(n-1, helper, src, Dest);
    }
    public static void main(String[] args) {
    HanoiPro(3, "S", "H", "D");
    }
}
