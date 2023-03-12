package Assignment11;

import java.util.Scanner;

public class Prob3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n-1];
        int sum=0;
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        int ans= ((n)*(n+1))/2;
        ans=ans-sum;
        System.out.println(ans);
    }
}
