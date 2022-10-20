/**
 * @date 2022/9/2 - 17:20
 */
public class 简易计算器 {
    public static void main(String[] args) {
        Number n = new Number(10,3);
        n.addition();
        n.subtion();
        n.multiplication();
        n.division();
    }
}
    class Number{
        private int n1;
        private int n2;

        public Number() {
        }

        public Number(int n1, int n2) {
            this.n1 = n1;
            this.n2 = n2;
        }

        public int getN1() {
            return n1;
        }

        public void setN1(int n1) {
            this.n1 = n1;
        }

        public int getN2() {
            return n2;
        }

        public void setN2(int n2) {
            this.n2 = n2;
        }

        public void addition(){
            System.out.println(this.getN1()+"+"+this.getN2()+"="+(this.getN1()+this.getN2()));
        }
        public void multiplication(){
            int result = this.n1*this.n2;
            System.out.println(this.n1+"*"+this.n2+"="+result);
        }
        public void division(){
            if (n2==0){
                System.out.println("除数不能为零");
                return;
            }
            int result = this.n1/this.n2;
            System.out.println(this.n1+"/"+this.n2+"="+result);
        }
        public void subtion(){
            int result = this.n1-this.n2;
            System.out.println(this.n1+"-"+this.n2+"="+result);
        }
    }

