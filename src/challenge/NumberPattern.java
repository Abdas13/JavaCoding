package challenge;

public class NumberPattern {
    /*Output:
1
232
34543
4567654
567898765
     */
    public static void main(String[] args)
    {
        int i, j, k, m;
        for(i=1; i<=5; i++) {
            m = i;
            for(j=1; j<=i; j++)
                System.out.print(m++);
            m = m - 2;
            for(k=1; k<i; k++)
                System.out.print(m--);
            System.out.println();
        }
//        {
//            int i,j;
//            for(i=1;i<=5;i++)
//            {
//                for(j=i;j<=i+i-1;j++)
//                    System.out.print(j);
//                for(j=j-2;j>=i;j--)
//                    System.out.print(j);
//                System.out.println();
//            }
//        }
    }

}
