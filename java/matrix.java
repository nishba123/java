import java.util.Scanner;
class Matrix{
    int rows,cols;
    int[][] mat;
    Matrix(){
        rows = cols = 0;
    }
    Matrix(int r, int c){
        rows=r;
        cols=c;
        mat=new int;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements (" + rows + "x" + cols + "):");
        for(int i = 0;i<rows;i++){
            for(int j =0;j<cols;j++){
                mat = sc.nextInt();
            }
        }
    }
    Matrix(Matrix m1,Matrix m2){
        rows = m1.rows;
        cols = m1.cols;
        mat=new int;
        for(int i=0;i<rows;i++){
            for(int j = 0;j < cols;j++){
                mat = m1.mat + m2.mat;
            }
        }
    }
    void display(){
        for(int i =0;i< rows;i++){
            for(int j =0;j< cols;j++){
                System.out.print(mat + " ");
            }
            System.out.println();
        }
    }
}
class MMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter rows and columns:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        Matrix m1 = new Matrix(r,c);
        Matrix m2 = new Matrix(r,c);
        Matrix sum = new Matrix(m1,m2);
        System.out.println("\nResultant Matrix:");
        sum.display();
    }
}