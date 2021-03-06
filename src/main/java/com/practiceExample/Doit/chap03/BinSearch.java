package com.practiceExample.Doit.chap03;

import java.util.Scanner;

// 이진 검색
public class BinSearch {
  // 요솟수가 num인 배열 arr에서 key와 같은 요소를 이진 검색한다.
  static int binSearch(int[] arr, int num, int key) {
    int pl = 0; //검색 범위의 첫 인덱스
    int pr = num-1;

    do {
      int pc = (pl + pr) / 2; // 중앙 요소의 인덱스
      if(arr[pc] == key) {
        return pc;            // 검색에 성공했음!
      } else if (arr[pc] < key) {
        pl = pc + 1;          // 검색 범위를 뒤쪽 절반으로 좁힌다.
      } else {
        pr = pc - 1;          // 검색 범위를 앞쪽 절반으로 좁힘.
      }
    } while(pl <= pr);
    return -1;                // 검색 실패!
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("요솟수 : ");
    int num = scanner.nextInt();
    int[] x = new int[num];     //요솟수가 num인 배열

    System.out.println("오름차순으로 입력하세요.");

    System.out.print("x[0] : ");    // 첫 요소를 입력
    x[0] = scanner.nextInt();

    for(int i = 1; i < num; i++) {
      do {
        System.out.print("x[" + i + "] : ");
        x[i] = scanner.nextInt();
      } while(x[i] < x[i-1]);       // 바로 앞의 요소보다 작으면 다시 입력
    }

    System.out.print("검색할 값 : ");   // key값을 입력한다.
    int key = scanner.nextInt();

    int idx = binSearch(x, num, key);   //배열 x에서 키값이 key인 요소를 검색한다.

    if(idx == -1) {
      System.out.println("그 값의 요소가 없습니다.");
    } else {
      System.out.println(key + "은(는) x[" + idx + "]에 있습니다.`" );
    }
    scanner.close();
  }
}
