class Array1D{
    int arr[]=null;
    public void InitalizingArray(int size){
        arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=Integer.MIN_VALUE;
        }
    }
    public void InsertingArray(int index,int value){
        try{
            if(arr[index]==Integer.MIN_VALUE){
                arr[index]=value;
            }
            else{
                System.out.println("The array is already taken in the index you entered!");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The index you entered doesn't exist..");
        }
    }
    public void TraverseArray(){
        try{
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }catch (Exception e){
            System.out.println("Array doesn't exist anymore..");
        }
    }
    public void SearchArray(int value){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                System.out.println("Yes the value you entered is found in the index "+ i);
                return;
            }
        }
        System.out.println("The value you entered is not present in the array!");
    }
    public void DeleteElementArray(int index){
        try{
            arr[index]=Integer.MIN_VALUE;
            System.out.println("Value is deleted successfully!");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The index you entered is wrong!");
        }


    }
}

public class SingleDArray {
    public static void main(String[] args) {
        int marks[];
        Array1D obj=new Array1D();
        System.out.println("Initializing the size of the array: ");
        obj.InitalizingArray(4);
        System.out.println("Entering the values to the array: ");
        obj.InsertingArray(0,10);
        obj.InsertingArray(1,20);
        obj.InsertingArray(2,30);
        obj.InsertingArray(3,40);
        System.out.println("Traversing the array: ");
        obj.TraverseArray();
        System.out.println("Searching the element: ");
        obj.SearchArray(20);
        System.out.println("Deleting the element: ");
        obj.DeleteElementArray(2);
        System.out.println("Traversing the array after every action is done: ");
        obj.TraverseArray();
    }
}
