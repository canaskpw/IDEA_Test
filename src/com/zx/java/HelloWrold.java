package com.zx.java;

import java.util.Scanner;

public class HelloWrold {
  public  static  void main(String[] args){
      System.out.print("请输入你的姓名");
      Scanner sc = new Scanner(System.in);
      String name = sc.nextLine();
     System.out.print("HeloWorld "+name);
   }
}
