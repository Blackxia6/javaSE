package 数据流;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @date 2022/10/3 - 19:19
 * java.io.DataOutputStream  是数据专属的流
 * 这个流可以将数据连同数据的类型一并写入文件
 * 注意：这个文件不是普通文本文件（这个文件使用记事本打不开）
 */
public class DataOutputStreamTest01 {
    public static void main(String[] args) {
        DataOutputStream dos = null;
        try {
             dos = new DataOutputStream(new FileOutputStream("dataTest"));
             //写数据
            byte b = 100;
            short s = 200;
            int i = 300;
            long l = 400L;
            float f = 3.0F;
            double d = 3.14;
            boolean sex = false;
            char c = 'a';
            //写
            dos.writeByte(b);//把数据和数据的类型一起带过去
            dos.writeShort(s);
            dos.writeInt(i);
            dos.writeLong(l);
            dos.writeFloat(f);
            dos.writeDouble(d);
            dos.writeBoolean(sex);
            dos.writeChar(c);


             //输出流要刷新
            dos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dos == null) {
                try {
                    dos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
