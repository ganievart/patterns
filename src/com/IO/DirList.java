package com.IO;

import java.io.*;

/**
 * Created by sbt-ganiev-ar on 24.07.2017.
 */
public class DirList {

    public static void main(String[] args) throws IOException {

        File file = new File("test.txt");
        File file2 = new File("testOUT.txt");


//        System.out.println(file.getAbsolutePath());
//        BufferedReader br = new BufferedReader(new FileReader(file));
//        PrintWriter out = new PrintWriter(file2);

//        String s;
//        while ((s = br.readLine()) != null) {
//            System.out.println(s);
//            out.print(s + "lalal");
//        }
//        out.close();

//        DataOutputStream outdata = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Data.txt")));
//        outdata.writeDouble(13.0);
//        outdata.write(1);
//        outdata.writeUTF("asdkasl;dk;laskdl;");
//        outdata.close();

        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = stdin.readLine()) != null && s.length() != 0) {
            System.out.println(s);
        }










    }

}

