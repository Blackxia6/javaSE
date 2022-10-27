package 单向链表数据结构;

/**
 * @date 2022/9/25 - 12:54
 * Node单向链表的节点
 * 节点是单向链表的基本单元
 * 每一个Node都有两个属性:
 *    1.存储的数据
 *    2.下一个节点的内存地址
 */
public class Node {
    //存储的数据
    Object element;
    //下一个节点的内存地址
    Node next;

    public Node(){

    }
    public Node(Object element,Node next){
        this.element = element;
        this.next = next;
    }


}
