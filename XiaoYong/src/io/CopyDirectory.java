package io;

import java.io.*;

/**
 * @author : XiaoYong
 * @date : 2018/3/7 16:15
 * Description    :
 */
public class CopyDirectory {

    public static void main(String[] args) throws IOException {
        CopyDirectory copyDirectory = new CopyDirectory();
        File file = new File("D:\\ddd");
        String sourcePath = file.getParent();
        String targetPath = "D:\\eee";
        copyDirectory.copy(file, sourcePath, targetPath);
    }

    public void createNewDirectory(File file, String newPath) throws IOException {
        System.out.println(newPath);
        File newFile = new File(newPath);
        newFile.mkdirs();
    }

    public void copy(File file, String sourcePath, String targetPath) throws IOException {
        File newFile = null;
        String newPath = "";
        String newFileName = null;
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files.length == 0) {
                newPath = targetPath + file.getPath().substring(sourcePath.length() - 1);
                createNewDirectory(file, newPath);
                return;
            }
            for (File f : files) {
                if (f.isDirectory()) {
                    copy(f, sourcePath, targetPath);
                }
                if (f.isFile()) {
                    newPath = targetPath + f.getParent().substring(sourcePath.length() - 1);
                    createNewDirectory(f, newPath);
                    newFileName = targetPath + f.getPath().substring(sourcePath.length() - 1);
                    createNewFile(f, newFileName);
                }
            }
        }
    }

    public void createNewFile(File file, String newPath) {
        String str = null;
        File newFile = new File(newPath);
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        byte[] b = new byte[4];
        int len = -1;
        try {
            fileInputStream = new FileInputStream(file);
            fileOutputStream = new FileOutputStream(newFile);
            if (!newFile.exists()) {
                newFile.createNewFile();
            }

            while ((len = fileInputStream.read(b)) != -1) {
                fileOutputStream.write(b);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
