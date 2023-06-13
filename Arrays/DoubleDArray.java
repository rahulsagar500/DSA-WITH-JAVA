import java.util.Arrays;

class TwoDArray{
    int arr[][]=null;
    public void Initalizing(int rows , int cols ){
        this.arr=new int[rows][cols];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=Integer.MIN_VALUE;
            }
        }
    }
    
    public void InsertingArray(int row , int col,int value){
        try{
            if(arr[row][col]==Integer.MIN_VALUE){
                arr[row][col]=value;
                System.out.println("Inserted successfully ");
            }else{
                System.out.println("The indexes you entered are already filled!");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Please check your indexes entered!");
        }

    }
    public void ArrayTraversing(int rows,int cols){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
   public void ArrayDeletion(int row , int col){
        try{
            arr[row][col]=Integer.MIN_VALUE;
            System.out.println("The element in the index you entered is deleted!");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The index you entered is invalid!");
        }
    }
public class DoubleDArray {
    public static void main(String[] args) {
        TwoDArray obj=new TwoDArray();
        obj.Initalizing(2,2);
        obj.InsertingArray(0,0,10);
        obj.InsertingArray(0,1,20);
        obj.InsertingArray(1,0,30);
        obj.InsertingArray(1,1,40);
        obj.ArrayDeletion(1,1);
        obj.ArrayTraversing(2,2);
        
        

    }
}
