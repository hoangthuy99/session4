import java.util.Scanner;

public class TwoDemensions {
    public static void main(String[] args) {
        // khai bao mang 2 chieu so nguyen 3 dong va 4 cot
        //DataType[][] arrName = new DataType[row][col]
        int [][] numbers = new int [3][4];
        //Nhap gia tri cac phan tu cua mang 2 chieu
        Scanner scanner = new Scanner(System.in);
        //Duyet so dong
        for (int i = 0; i < 3; i++) {
            //Duyet theo so cot
            for (int j = 0; j < 4; j++) {
                System.out.printf("Number [%d][%d] = ",i,j);
                numbers[i][j] = Integer.parseInt(scanner.nextLine());

            }
          }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d\t ",i,j);
            }
            System.out.println("");
        }
    }
}
