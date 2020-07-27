public class ReverseSort {
    public void sort(int[] array){
        showArray(array);
        int temp;
        int len = array.length;
        for(int i = 0; i < len/2; i++){
            temp = array[i];
            array[i] = array[len - i - 1];
            array[len - i - 1] = temp;
        }
        showArray(array);
    }
    public void showArray(int[] array){
        for (int i : array) {
            System.out.print(">"+i);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {63, 4,24,1,3,15};
        ReverseSort reverseSort = new ReverseSort();
        reverseSort.sort(array);
    }
}
