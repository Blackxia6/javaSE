package 车站maipiao;

/**
 * @date 2022/10/9 - 16:21
 */
public class Test01 {
    public static void main(String[] args) {
        QCZ qcz = new QCZ("xwj",10);

        //int a1 = qcz.getSum();
        while (true){
//            if (a1 == 0){
//                return;
//            }
            Thread t = new ThreadGet(1,qcz);
            t.start();
             //a1--;
            
        }
    }
}
