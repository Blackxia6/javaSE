package FileRead_FileWriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @date 2022/10/2 - 22:46
 * FileWriter
 *   文件字符输出流，写
 *   只能输出普通文本
 */
public class FileWriterTest01 {
    public static void main(String[] args) {
        FileWriter fiw = null;
        try {
            fiw = new FileWriter("file");
            //开始写
            char[] chars = {'我','是','你','爸','爸'};
            fiw.write(chars);
           // fiw.write(chars,3,2);//写入一部分
            fiw.write("我是一个java软件工程师");
            //输出流要刷新
            fiw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fiw != null) {
                try {
                    fiw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
