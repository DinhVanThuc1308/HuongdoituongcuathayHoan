import java.util.Scanner;
import  java.util.Arrays;
public class Baitapvenha1 {
    public static void main(String[] args) {
        int[] dayso;
        int n;
        int temp ;
        dayso = new int[100];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua day : ");
        n = scanner.nextInt();
        System.out.println("Moi nhap day so :");
        for ( int i = 0 ; i<n ; i++)
            dayso[i] = scanner.nextInt();
        System.out.println("Day so vua nhap la : ");
        for ( int i = 0 ; i<n ; i++)
            System.out.print(dayso[i]);
        for (int i = 0 ; i < n;i++ ){
            for (int j = i+1 ; j < n ;j++) {
                if (dayso[i] > dayso[j]){
                    temp=dayso[i]  ;
                    dayso[i]=dayso[j]  ;
                    dayso[j]=temp  ;}
            }
        }
        System.out.println("Day so sau khi sap xep la : ");
        for ( int i = 0 ; i<n ; i++)
            System.out.print(dayso[i]);

    }
}
