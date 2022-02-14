import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class test{
    public static void main(String[] args)
    {
        // Write your code here
      Scanner sc = new Scanner(System.in);
      int t  = sc.nextInt();
      while(t-->0){
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n ; ++i)a[i] = sc.nextInt();
        int len = 1 , max = 1 ,start = 0;
        for(int i = 1 ; i < n ; ++i){
          if(a[i] > a[i-1]){
            len++;
          }
          else{
            if(max < len){
              max = len;
              start = i - max;
            }
            len =  1;
          }
        }
        if(max < len ){max = len;
                      start = n-max;
                      }
        System.out.println(max);
        for(int i = start ; i < start + max ; ++i)
          System.out.print(a[i]+" ");
        System.out.println();
      }
      
    }
}