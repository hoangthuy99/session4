import java.util.Scanner;

public class btTwoDemension {
    public static void main(String[] args) {
/*

1.Nhập vào số dòng và số cột của mảng 2 chiều (row * col)
2.Khai báo mảng 2 chiều (row*col)
3.In menu và thực hiện các chức năng theo menu
**MENU**
1.Nhập giá trị các phần tử mảng
2.In giá trị các phần tử mảng theo ma trận
3.In giá trị các phần tử trên đường biên và tính tổng
4.In giá trị các phần tử trên đường chéo chính và chéo phụ, tính tổng
5.Tìm giá trị lớn nhất và nhỏ nhất trong mảng
6.Sắp xếp mảng giảm dần theo cột
7.Thống kê các phần tử có giá trị lẻ chia hết cho 3
8.Thoát
*/
        Scanner scanner = new Scanner(System.in);
        int numcol, numrol;
        System.out.println("Nhap so dong: ");
        numcol = scanner.nextInt();
        System.out.println("Nhap so cot");
        numrol = scanner.nextInt();
        int [][] A = new int[numcol][numrol];

        do {
            System.out.println("1.Nhap gia tri cac phan tu mang");
            System.out.println("2.In gia tri cac phan tu theo ma tran");
            System.out.println("3.In gia tri cac phan tu tren duong bien va tinh tong");
            System.out.println("4.In cac phan tu tren duong cheo chinh va cheo phu, tinh tong");
            System.out.println("5.Tim gia tri lon nhat va gia tri nho nhat trong mang");
            System.out.println("6.Sap xep mang giam dan theo cot");
            System.out.println("7.Thong ke cac phan tu co gia tri le chia het cho 3");
            System.out.println("8.Thoat");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    for (int i = 0; i < numcol ; i++) {
                        for (int j = 0; j < numrol; j++) {
                            System.out.printf("Number %d[] %d[]",i,j);
                            A[i][j] = scanner.nextInt();
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < numcol ; i++) {
                        for (int j = 0; j < numrol; j++) {
                            System.out.print(A[i][j]+"\t");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    int sum = 0;
                    System.out.println("Cac phan tu tren duong bien");
                    for (int i = 0; i < A.length; i++) {
                        for (int j = 0; j < A.length; j++) {
                            if (i==0 || i== A.length-1 || j==0 || j== A[0].length-1){
                                System.out.print(A[i][j]+"\t");
                                sum +=A[i][j];
                            }
                        }
                    }
                    System.out.println("Tong cac duong bien la: "+sum);

                    break;
                case 4:
                    int sum1 = 0;
                    int sum2 = 0;
                    System.out.println("Các phần tử trên đường chéo chính là:");
                    for (int i = 0; i < A.length; i++) {
                        for (int j = 0; j < A[0].length; j++) {
                            if (i == j) {
                                System.out.print(A[i][j] + "\t");
                                sum1 += A[i][j];
                            } else {
                                System.out.print("\t");
                            }
                        }
                        System.out.println();
                    }

                    System.out.println("Các phần tử trên đường chéo phụ là:");
                    for (int i = 0; i < A.length; i++) {
                        for (int j = 0; j < A[0].length; j++) {
                            if (i + j == A.length - 1) {
                                System.out.print(A[i][j] + "\t");
                                sum2 += A[i][j];
                            } else {
                                System.out.print("\t");
                            }
                        }
                        System.out.println();
                    }

                    System.out.println("Tổng các phần tử trên đường chéo chính là: " + sum1);
                    System.out.println("Tổng các phần tử trên đường chéo phụ là: " + sum2);
            break;
                case 5:
                    int min = A[0][0];
                    int max = A[0][0];
                    for (int i = 0; i < A.length; i++) {
                        for (int j = 0; j < A[i].length; j++) {
                            if (A[i][j] < min) {
                                min = A[i][j];
                            }
                            if (A[i][j] > max) {
                                max = A[i][j];
                            }
                        }
                    }
                    System.out.println("Giá trị lớn nhất trong mảng: " + max);
                    System.out.println("Giá trị nhỏ nhất trong mảng: " + min);
                    break;
                case 6:
                    for (int j = 0; j < A[0].length; j++) {
                        for (int i = 0; i < A.length - 1; i++) {
                            for (int k = i + 1; k < A.length; k++) {
                                if (A[i][j] < A[k][j]) {
                                    // Hoán đổi giá trị
                                    int temp = A[i][j];
                                    A[i][j] = A[k][j];
                                    A[k][j] = temp;
                                }
                            }
                        }
                    }
                    System.out.println("Mảng sau khi sắp xếp giảm dần theo cột:");
                    for (int i = 0; i < numcol ; i++) {
                        for (int j = 0; j < numrol; j++) {
                            System.out.print(A[i][j]+"\t");
                        }
                        System.out.println();
                    }
                    break;
                case 7:
                    int count = 0;
                    System.out.println("Các phần tử có giá trị lẻ chia hết cho 3:");
                    for (int i = 0; i < A.length; i++) {
                        for (int j = 0; j < A[i].length; j++) {
                            if (A[i][j] % 2 != 0 && A[i][j] % 3 == 0) {
                                System.out.print(A[i][j] + "\t");
                                count++;
                            }
                        }
                    }
                    System.out.println("\nSố lượng phần tử lẻ chia hết cho 3: " + count);
                     break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhap sai, vui long nhap lai");
                    break;
            }
        }while (true);



    }
}
