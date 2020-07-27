public class QuickSort {
    private int partition(int[] array, int low, int high){
        int pivot = array[low];
        while(low < high){
            while(low < high && array[high]>=pivot){
                high--;
            }
            array[low] = array[high];
            while(low < high && array[low]<=pivot){
                low++;
            }
            array[high] = array[low];
        }
        array[low]=pivot;
        return low;
    }
    public void quickSort_recursion(int arr[], int low, int high){
        if(low >= high) return;
        int index = partition(arr, low, high);
        quickSort_recursion(arr, low, index - 1);
        quickSort_recursion(arr, index + 1, high);
    }

    public void showArray(int[] array){
        for (int i : array) {
            System.out.print(">"+i);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] array = {1,7,2,8,3,9,5,8,6,4};
        quickSort.showArray(array);
        quickSort.quickSort_recursion(array, 0, array.length - 1);
        quickSort.showArray(array);
    }
}
