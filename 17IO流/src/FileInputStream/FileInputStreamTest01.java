package FileInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @date 2022/10/1 - 15:46
 * java.io.FileInputStream:
 *  1文件字节输入流，万能的，任何类型的文件都可以采用这个流来对
 *  2字节的方式，完成输入操作，完成读（read）的操作（硬盘---->内存)
 */
public class FileInputStreamTest01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        //创建文件字节输入流对象
        //文件路径D:\IDEA\javase\17IO流\IO流演示文件
      try {
           fis = new FileInputStream("D:\\IDEA\\javase\\17IO流\\IO流演示文件");
           //读文件
         int readData =  fis.read();
          System.out.println(readData);//97

          readData =  fis.read();
          System.out.println(readData);//98

          readData =  fis.read();
          System.out.println(readData);//99

          readData =  fis.read();
          System.out.println(readData);//100

          readData =  fis.read();
          System.out.println(readData);//101

          readData =  fis.read();
          System.out.println(readData);//102

          readData =  fis.read();
          System.out.println(readData);//-1 读到文件的末尾

      }catch (FileNotFoundException e){
          e.printStackTrace();
      }catch (IOException e){
          e.printStackTrace();
      }
      finally{
          //在finally语句块中确保流一定关闭
          if (fis != null) {//避免空指针异常
              try {
                  fis.close();//关闭流
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
      }

    }


}
