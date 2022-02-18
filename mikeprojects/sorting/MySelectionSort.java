package mikeprojects.sorting;

public class MySelectionSort {

    public static int[] doSelectionSort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++)
        {
            System.out.println(" i ="+ i);
            int index = i;

            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("    j= "+j);
                System.out.println(j+" "+arr[j]+"    "+"index = "+arr[index]);
                if (arr[j] < arr[index])
                    index = j;
            }
            int smallerNumber = arr[index];
            System.out.println("Smaller Number....."+smallerNumber);

            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }

    public static void main(String a[]){

        int[] arr1 = {10,34,2,56,7,67,88,42};
        int[] arr2 = doSelectionSort(arr1);
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
    }
}