public class divide_and_conquer{
    public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void mergeSort(int arr[],int si,int ei) {
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
        
    }
    public static void merge(int arr[],int si,int mid,int ei) {
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++)
        arr[i]=temp[k];
    }

    // <---Quick Sort Alg. --->
    
    public static void quickSort(int arr[],int si,int ei) {
        if(si>=ei){
            return;
        }
        int pIdx=partitation(arr,si,ei);//pivot index
        quickSort(arr, si, pIdx-1);//element after pivot.
        quickSort(arr, pIdx+1, ei);//element before pivot.
    }
    public static int partitation(int arr[],int si,int ei) {
        int pivot=arr[ei];
        int i=si-1;
        for(int j=si;j<arr.length;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }

        }
        i++;
         int temp=pivot;
         arr[ei]=arr[i];
         arr[i]=temp;
        return i;
    }
    public static void main(String str[]) {
        int arr[]={6,3,9,5,2,8};
        //mergeSort(arr, 0, arr.length-1);
        quickSort(arr, 0, arr.length-1);
        printArr(arr);

    }
/*  public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[],int si,int ei) {
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);  
        merge(arr, si, mid, ei);      
    }
    public static void merge(int arr[],int si,int mid,int ei) {
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        for(k=0,i=si;k<temp.length;i++,k++){
            arr[i]=temp[k];
        }
    }

    // quick sort..
    public static void quicksort(int arr[],int si,int ei) {
        if(si>=ei){
            return;
        }
        int pIdx=partition(arr,si,ei);
        quicksort(arr, si, pIdx-1);
        quicksort(arr, pIdx+1, ei);
    }
    public static int partition(int arr[],int si,int ei) {
        int pivot=arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void main(String args[]){
        int arr[]={2,5,4,7,8,6,1};
        quicksort(arr, 0, arr.length-1);
        //mergeSort(arr, 0,arr.length-1);
        printArr(arr);
    } */
}  
    