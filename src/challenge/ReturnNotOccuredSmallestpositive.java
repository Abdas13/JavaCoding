package challenge;
/*
Write a java code to return the smallest positive number that not occur in given array
input A={1, 4, 3, 2, 6, 1, 0}
output = 5

input  A= {-2, -5, -3, -2}
output = 1
 */
public class ReturnNotOccuredSmallestpositive {
    public static void main(String[] args) {
        int A[]={1, 3, 6, 4, 1, 2};
        System.out.println(solution(A));

    }
    public static int solution(int[] A) {
        for(int i=0; i< A.length; i++){
            for(int j=i+1; j<A.length; j++){
                if(A[i]>A[j]){
                    int temp=A[j];
                    A[j]=A[i];
                    A[i]=temp;
                }

            }
            System.out.println(A[i]);
            for (int k = 0; k < A.length; k++) {
                if (A[k]<=A[k+1]){
                    continue;
                }else {
                    return A[k]+1;
                }

            }
        }
        return 0;
    }
}

