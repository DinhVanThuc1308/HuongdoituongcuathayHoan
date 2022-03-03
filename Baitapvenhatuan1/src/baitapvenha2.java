import java.util.Scanner;

public class baitapvenha2 {
    int binarySearch(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x)
                return m;

            if (arr[m] < x)
                l = m + 1;

            else
                r = m - 1;
        }

        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        baitapvenha2 ob = new baitapvenha2();
        //int arr[] = { 2, 6, 8, 10, 12, 18, 19, 21, 28, 36, 39, 58 };
        //int n = arr.length;
        //int x = 10;
        System.out.print("Nhap so luong phan tu cua mang: \n");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap phan tu thu %d: ",i + 1);
            arr[i] = sc.nextInt();
        }
        System.out.println("Nhap phan tu muon tim: ");
        int x = sc.nextInt();
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Phan tu khong ton tai.");
        else
            System.out.println("Phan tu o vi tri: " + result);
    }
}
