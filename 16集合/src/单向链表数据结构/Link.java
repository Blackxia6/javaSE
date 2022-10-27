package 单向链表数据结构;

/**
 * @date 2022/9/25 - 12:54
 */
public class Link {
    //头结点
    Node header = null;
    int size;
    public int getSize(){
        return size;
    }

    public void add(Object obj){//向链表中添加元素的方法(向末尾添加)
        //创建一个新的节点对象
        //让之前单链表的末尾节点next指向新节点对象
        if (header == null){
            header = new Node(obj,null);
        }else {
            Node currentLastNode = findLast(header);
            currentLastNode.next = new Node(obj,null);
        }
        size++;
    }

    /**
     * 专门查找末尾节点的方法
     * @param
     * @return
     */
    private Node findLast(Node node) {
        if (node.next == null){
            return node;
        }

        return findLast(node.next);
    }

    public void remove(Object obj){//删除某个元素的方法

    }

    public void modify(Object newObj){//修改链表中的某个元素

    }

    public Result  find(Object obj) {//查找链表中的某个元素
        for (int i = 0; i < size; i++) {
            if (header == null){
                return Result.NONE;
            }
            if ( header.element == obj) {
                return Result.HAVE;
            }

            //能运行到这里，说明头结点不是
            header = header.next;
            if ( header !=null && header.element == obj){
                return Result.HAVE;
            }
        }
        return Result.NONE;
    }
}
enum Result{//枚举
    HAVE,NONE
}