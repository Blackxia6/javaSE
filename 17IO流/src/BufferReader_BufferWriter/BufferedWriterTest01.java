package BufferReader_BufferWriter;

import java.io.*;

/**
 * @date 2022/10/3 - 0:03
 */
public class BufferedWriterTest01 {
    public static void main(String[] args) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("copy",true)));
            bw.write("你哈");
            bw.write("\n");
            bw.write("世界");
            bw.write("\n");

            bw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
