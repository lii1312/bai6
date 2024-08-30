
package exercise.b5;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciseB5 {
        // câu 1
    public static float[] importData(float[] arrays){
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<arrays.length; i++){
            System.out.println("nhap phan tu thu "+ (i+1)+ ":");
            arrays[i] = sc.nextFloat();
        }
        return arrays;
    }
    // câu 2
    public static void printData(float[] arrays) {
        System.out.println("Cac phan tu trong mang: ");
        for(float value : arrays){  // Cấu trúc của vòng lặp for-each
            System.out.println(value+ " ");
        }
        System.out.println();
    }
    // câu 3
    public static float findMax2(float[] arrays){
        if(arrays.length<2){
            System.out.println("mang kho du phan tu den tim gia tri lon thu hai: ");
            return Float.NaN; // trả về giá trị không hợp lệ 
        }
        float max1 = Float.NEGATIVE_INFINITY; // khỏi tạo để tìm vị trí lớn thứ hai
        float max2 = Float.NEGATIVE_INFINITY;
        
        for(float value : arrays){ 
            if(value > max1){  // gán giá trị (swap)
                max2 = max1;
                max1 = value;
            }else if(value > max2 || value!= max1){
                max2 = value;
            }
        }
        return max2;
    }
    // câu 4 
    public static void deleteOddNumber(float[ ] arrays) {
        int cout=0;
        for(float value:arrays){
            if(value%2==0){
                cout++;
            }
        }
        float []pus=new float[cout];
        int index=0;
        for(float value:arrays){
            if(value%2==0){
                pus[index++]=value;
            }
        }
        System.out.println("xoa phan tu le trong mang:"+Arrays.toString(pus));
    }
       // gọi các phương tức main 
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập độ dài mảng
        System.out.print("nhap so phan tu cua mang: ");
        int size = scanner.nextInt();
        float[] arrays = new float[size];
        // câu 1
        arrays = importData(arrays);
           System.out.println();
        // câu 2
        printData(arrays);
        // câu 3
        float max2 = findMax2(arrays); // gọi phương thức 
        if(!Float.isNaN(max2)) // kiểm tra xem nếu là nan thì true , ngược lại thì flase
        System.out.println("gia tri lon thu hai trong mang: "+max2);
        // câu 4
           deleteOddNumber(arrays);
    }
    
}
