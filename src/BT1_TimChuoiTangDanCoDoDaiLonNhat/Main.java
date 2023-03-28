package BT1_TimChuoiTangDanCoDoDaiLonNhat;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi: ");
        String string = scanner.nextLine();

        String[] stringArr = string.split("");
        Map<String, String> stringMap = new TreeMap<>();
        for (int i = 0; i < stringArr.length; i++) {
            stringMap.put(stringArr[i],stringArr[i]);
        }
        String result = "";
        for (int i = 0; i < stringMap.size(); i++) {
            result += stringMap.keySet().toArray()[i];
        }
        System.out.println(result);
    }
}