package com.robert.test.sort;

import java.io.File;

public class Recursion {

    /**
     * 递归遍历文件夹，列出所有文件
     * @param path
     */
    private static void listFiles(String path) {
        File f = new File(path);
        File[] fs = f.listFiles();
        if (fs == null) {
            return;
        }
        for (File file : fs) {
            if (file.isFile()) {
                System.out.println(file.getPath());
            } else {
                listFiles(file.getPath());
            }
        }
    }

    public static void main(String[] args){
         String  path = "D:\\黑镜 第1季";
         listFiles(path);
    }
}
