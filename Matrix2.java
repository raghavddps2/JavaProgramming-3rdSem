import java.util.*;
public class Matrix{
    int array[][];
    int row;
    int column;
    Matrix(int row,int column){
        this.row = row;
        this.column = column;
        this.array = new int[row][column];
    }
    Scanner sc = new Scanner(System.in);
    public void get_input(){
            for(int i=0;i<row;i++){
                for(int j=0;j<column;j++){
                    array[i][j] = sc.nextInt();
                }
            }
    }

    public void matrix_mul(Matrix m1,Matrix m2){
        if(m1.column != m2.row){
            System.out.println("The two matrices cannot be Multiplied");    
        }
        else{
            for(int i=0;i<m1.row;i++){
                    for(int j=0;j<m2.column;j++){
                        for(int k=0;k<m1.column;k++){
                            array[i][j] += m1.array[i][k] * m2.array[k][j];
                        }
                    }
            }
        }
    }

    public void print_matrix(){
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row,column;
        System.out.println("For Mattrix 1");
        System.out.print("Enter the no of rows:   ");
        row = sc.nextInt();
        System.out.print("Enter the no of columns:   ");
        column = sc.nextInt();
        Matrix m1 = new Matrix(row,column);

        System.out.println("For Matrix 2");
        System.out.print("Enter the no of rows:   ");
        row = sc.nextInt();
        System.out.print("Enter the no of columns:   ");
        column = sc.nextInt();
        Matrix m2 = new Matrix(row,column);


        Matrix m3 = new Matrix(m1.row,m2.column);

        System.out.println("Enter the elements of matrix 1");
        m1.get_input();

        System.out.println("Enter the elemnets of matrix 2");
        m2.get_input();

        m3.matrix_mul(m1,m2);

        System.out.println("----------------------------------------------");
        System.out.println("The Matrix 1 is:");
        m1.print_matrix();

        System.out.println("----------------------------------------------");
        System.out.println("The Matrix 2 is:");
        m2.print_matrix();

        System.out.println("----------------------------------------------");
        System.out.println("The Multiplication of two matrices is:");
        m3.print_matrix();
    }
}
