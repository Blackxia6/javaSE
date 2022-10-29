package 车站maipiao;

/**
 * @date 2022/10/9 - 16:12
 */
public class QCZ {
    private String name;
    private int sum ;//100张票

    public QCZ() {
    }

    public QCZ(String name, int sum) {
        this.name = name;
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
    //卖票方法
    public void Sell(int num){
        synchronized (this){
            int before = this.getSum();
            int after = before - num;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            this.setSum(after);
            if (this.getSum() == -1){
                System.out.println("购票失败，没票了");
                System.exit(0);

            }
            System.out.println("还剩"+after+"张票");
        }

    }
}
