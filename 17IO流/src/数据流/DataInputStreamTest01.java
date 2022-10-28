package 数据流;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @date 2022/10/3 - 19:32
 * DataInputStream:数据字节输入流
 * DataInputStream是用来读DataOutputStream写的文件的 并且读的时候需要提前知道数据的写入顺序
 * 读的数据需要和写的数据一致，才可以正常取出数据
 */
public class DataInputStreamTest01 {
    public static void main(String[] args) {
        DataInputStream dis = null;
        try {
            dis = new DataInputStream(new FileInputStream("dataTest"));
            byte b = dis.readByte();//读一个byte数据出来
            short s = dis.readShort();
            int i = dis.readInt();
            long l = dis.readLong();
            float f = dis.readFloat();
            double d = dis.readDouble();
            boolean sex = dis.readBoolean();
            char c = dis.readChar();
            System.out.println(b);
            System.out.println(s);
            System.out.println(i);
            System.out.println(l);
            System.out.println(f);
            System.out.println(d);
            System.out.println(sex);
            System.out.println(c);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dis != null) {
                try {
                    dis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
