import java.util.Arrays;

public class App{
    public static void main(String[] args) throws Exception {
        int arr[]= {1,0,5,6};
        System.out.println("Arreglo desordenado");
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Arreglo ordenado");
                System.out.println(Arrays.toString(arr));


    }
/**
 * @param arr metodo burbuja recibe un arreglo
 */
    public static void bubbleSort(int[] arr) {
        for(int i=0; i<(arr.length-1);i++){
            for(int j=0; j<(arr.length-i-1); j++){
                if (arr[j]> arr [j+1]){
                int temp =arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        for(int i=0; i<(arr.length-1);i++){
            int minIndex =0;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp =arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }    

    }
}


   

