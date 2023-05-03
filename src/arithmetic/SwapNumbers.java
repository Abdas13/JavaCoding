package arithmetic;

import java.util.Arrays;

public class SwapNumbers {
    public static void main(String[] args) {
        int arr [] = {3,6,44,77,3,23,42,55};
        int i=0;
        int temp;
        int temp2;
        for (int j = 0; j < arr.length-1 ; j++) {
     //   while(i<arr.length-1) {
            if (arr[i] == 3) {
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
                 i++;
//            }else if(arr[i]==arr[i+1]){
//                temp2=arr[i+2];
//                arr[i+2]=arr[i];
//                arr[i]=temp2;
//                i++;

            }
        }
  //          }
        System.out.println(Arrays.toString(arr));
        }
        /*
          //3,6,44,77,3,23,42,55

        Integer arr[] = {3, 6, 44, 77, 3, 23, 42, 55};
        List<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, arr);
        int countThree=0;


        for (int i = 0; i < list1.size() - 1; i++) {
            if (list1.get(i) == 3) {
                countThree++;
                list1.remove(i);
            }


        }
        for (int i = 0; i< countThree;i++){
            list1.add(3);
        }

        for(int i = 0; i<list1.size();i++){
            arr[i]=list1.get(i);
        }

        System.out.println(Arrays.toString(arr));
    }
         */
    }

