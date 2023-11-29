import java.util.Scanner;

public class BTSighArr {
    /*

    Nhập số phần tử mảng (n)
    Khai báo mảng số nguyên 1 chiều gồm n phần tử
    In menu và thực hiện các chức năng theo menu:
            **MENU**
    1.Nhập giá trị các phần tử mảng
     2. In giá trị các phần tử mảng
    3.In giá trị các phần tử có giá trị chẵn và tính tổng
    4.In giá trị các phần tử có chỉ số lẻ và tính tổng
    5.In giá trị các phần tử là số nguyên tố
    6.Sắp xếp mảng tăng dần
    7.Nhập 1 số và thống kê số đó xuất hiện bao nhiêu lần trong mảng
    8.Thoát
*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );
        int n, sum = 0;
        int [] arrNum ;
        do {
            System.out.println("Nhap so phan tu cua mang: ");
            n = scanner.nextInt();
        }while (n < 0);
        int arrayN[]  = new int[n];
        do {
            System.out.println("\n**************MENU***************");
            System.out.println("1.Nhap gia tri cac phan tu mang");
            System.out.println("2.In gia tri cac phan tu mang");
            System.out.println("3.In giá trị các phần tử có giá trị chẵn và tính tổng");
            System.out.println("4.In gia tri cac phan tu co chi so le va tinh tong");
            System.out.println("5.In gia tri cac phan tu la so nguyen to");
            System.out.println("6.Sap sep mang tang dan");
            System.out.println("7. Nhap 1 so va thong ke so do xuat hien bao nhieu lan trong mang");
            System.out.println("8. Thoat");
            int chose = scanner.nextInt();
            switch (chose){
                case 1:
                    System.out.println("Nhap gia tri cac phan tu mang: ");
                    for (int i = 0; i < arrayN.length; i++) {
                        System.out.printf("Phan tu so %d la: ",i);
                        arrayN[i] = scanner.nextInt();
                    }

                    break;
                case 2:
                    System.out.println("\n In gia tri tu cac phan tu mang: ");
                    for (int i = 0; i < arrayN.length; i++) {
                        System.out.print(arrayN[i]+"\t");
                    }
                    break;
                case 3:
                    System.out.println("In gia tri cac phan tu co gia tri chan: ");
                    for (int i = 0; i < arrayN.length; i++) {
                        if(i%2==0){
                            System.out.printf("%d\t",i);
                            sum +=arrayN[i];
                        }
                    }
                    System.out.println("\nTong cac gia tri chan la: "+sum);
                    break;
                case 4:
                    System.out.println("In gia tri cac phan tu co gia tri le: ");
                    for (int i = 0; i < arrayN.length; i++) {
                        if(i%2!=0){
                            System.out.printf("%d\t",i);
                            sum +=arrayN[i];
                        }
                    }
                    System.out.println("\nTong cac gia tri le la: "+sum);
                    break;
                case 5:
                    System.out.println("In ra gia tri so nguyen to");
                    for (int i = 0; i <arrayN.length; i++) {

                    }
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ban chon sai, moi ban chon lai! ");
                    break;
            }
        }while (true);




    }

}
