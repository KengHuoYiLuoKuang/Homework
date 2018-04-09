package io;

import java.io.File;
import java.io.IOException;

/**
 * @author : XiaoYong
 * @date : 2018/3/7 20:04
 * Description    :
 */
public class CopyDirectoryTest {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\ddd");
        String sourcePath = file.getParent();
        String targetPath = "D:\\eee";
        CopyDirectory.copy(file, sourcePath, targetPath);
    }
}
