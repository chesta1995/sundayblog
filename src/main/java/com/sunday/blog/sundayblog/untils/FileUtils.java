package com.sunday.blog.sundayblog.untils;

import java.io.*;

/**
 * @ClassName FileUtils
 * @Description TODO
 * @Author Sunday
 * @Date 2020/4/21 15:15
 * @Version 1.0
 */
public class FileUtils {

    /**
     * 文件读写操作
     * @param inputStream
     * @param realFile
     */
    public static void copyInputStreamToFile(InputStream inputStream, File realFile) {
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(realFile);

            byte[] b = new byte[1024];
            int len;
            while ((len = inputStream.read(b)) != -1) {
                outputStream.write(b, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
