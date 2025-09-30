class Spiral_Martrix {
    public static void main (String[]args){
       int [][] matrix = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
       };
       int row = matrix.length;
       int col = matrix[0].length;
       int [] result = new int[row*col];
       int index = 0;
       int top = 0,bottom = row-1;
       int left = 0,right = col-1;
       while(top<=bottom && left <= right){
          for(int i=top;i<=right;i++){
            result [index++] = matrix[top][i];                    
          }
          top++;
          for(int j=left;j<bottom;j++){
            result[index++] = matrix[left][j];
          }
          left--;
          
         }
      System.out.println("matrix : " + result);
       }
        }
    
