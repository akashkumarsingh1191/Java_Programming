public class spiral_matrix {
    public static void Spiral_Matrix(int matrix[][]){
        int row_start=0;
        int col_start=0;
        int row_end=matrix.length-1;
        int col_end=matrix[0].length-1;
        while((row_start<=row_end) && (col_start<=col_end)){
            // top
            for(int j=col_start;j<=col_end;j++){
                System.out.print(matrix[row_start][j]+" ");
            }
            //Right
            for(int i=row_start+1;i<=row_end;i++){
                System.out.print(matrix[i][col_end]+" ");
            }
            //bottom
            for(int j=col_end-1;j>=col_start;j--){
                if(col_start==col_end){
                    break;
                }
                System.out.print(matrix[row_end][j]+" ");
            }
            //left
            for(int i=row_end-1;i>=row_start+1;i--){
                if(row_start==row_end){
                    break;
                }
                System.out.print(matrix[i][col_start]+" ");
            }
            row_start++;
            col_start++;
            row_end--;
            col_end--;
        }
    }
    public static int Diagonal_sum(int matrix[][]){
        int sum=0;
        /*for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                    sum+=matrix[i][j];
                }
                else if(i+j==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }*/
        //   OR 
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            if(i!=matrix.length-i-1){
                sum+=matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }
    public static boolean Stair_case(int matrix[][],int key){
        int row=0,col=matrix[0].length-1;
        while(row<=matrix.length-1 && col>=0 ){
            if(matrix[row][col]==key){
                System.out.print("Element is found at index :("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Element not found");
        return false;
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
        int matri[][]={{1,2,3},{4,5,6},{7,8,9}};
        int key=12;
        //System.out.println(Diagonal_sum(matrix));        
        //System.out.println(Diagonal_sum(matri));
        //Spiral_Matrix(matrix);
        Stair_case(matrix,key);
    }
}
