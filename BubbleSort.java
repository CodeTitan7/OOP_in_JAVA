public class BubbleSort{
    static void bubbleSort(int[] arr){
        int temp;
        int n = arr.length; 
        for (int i =0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] array = {5,1,2,8,7,9,0};
        System.out.println("Array before sorting");
        for(int i:array){
            System.out.print(i+" ");
        }
        bubbleSort(array);
        System.out.println("\nArray before sorting");
        for(int i:array){
            System.out.print(i+" ");
        }
    }
}
