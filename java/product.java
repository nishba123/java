import java.util.Scanner;
class Product{
    int pcode;
    String pname;
    double price;
    void getData(Scanner sc){
        System.out.print("enter product code:");
        pcode = sc.nextInt();
        System.out.print("enter product name:");
        pname = sc.next();
        System.out.print("enter price:");
        price = sc.nextDouble();
    }
    void display(){
        System.out.println("code:" + pcode);
        System.out.println("name:" + pname);
        System.out.println("price: " + price);}
}
class PMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
        System.out.println("enter details of Product 1:");
        p1.getData(sc);
        System.out.println("enter details of Product 2:");
        p2.getData(sc);
        System.out.println("enter details of Product 3:");
        p3.getData(sc);
        Product min = p1;
        if (p2.price < min.price)
            min = p2;
        if (p3.price < min.price)
            min = p3;
        System.out.println("\nProduct with lowest price:");
        min.display();
    }
}