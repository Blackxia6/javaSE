package 单向链表数据结构;

/**
 * @date 2022/9/25 - 13:28
 */
public class Test {
    public static void main(String[] args) {
        Link link = new Link();
        link.add(10);
        link.add(100);
        link.add(1000);
        link.add("sf");
        link.add(true);
        link.add(5);
        System.out.println(link.getSize());//获取元素个数
        System.out.println(link.find(100000) == Result.HAVE?"有此元素 " : "没有找到");
        System.out.println(link.find("sf") == Result.HAVE?"有此元素 " : "没有找到");
        System.out.println(link.find(1000000) == Result.HAVE?"有此元素 " : "没有找到");
    }
}
