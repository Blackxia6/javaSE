package HomeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @date 2022/10/13 - 20:34
 * 111
 */
public class Test01 {
    public static void main(String[] args) {
        Book b1 = new Book("三体",100,30.0);
        Book b2 = new Book("钢铁侠",50,50.3);
        Book b3 = new Book("小邋遢",120,10.5);
        Book[] books = {b1,b2,b3};
        for (Book book : books){
            System.out.println(book);
        }
        //ddd
        P(books);
        System.out.println("=================");
        for (Book book : books){
            System.out.println(book);
        }
        List<Book> list = new ArrayList<>();

          //Collections.addAll(list, books);//添加数组的方法

        for (int i=0;i<books.length;i++){
            list.add(books[i]);
        }


        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
       }

        System.out.println("-------------------------");
        for (Book book : list){
            System.out.println(book);
        }
        System.out.println("-----------------------");
        //使用迭代器遍历
        Iterator<Book> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
    public static  void P(Book[] books){
        for (int i = books.length-1; i >0 ; i--) {
            for (int j = 0; j<i; j++){
                if (books[j].no > books[j+1].no){
                    int temp;
                    temp = books[j].no;
                    books[j].no = books[j+1].no;
                    books[j+1].no = temp;
                }
            }
        }
    }
}
class Book{
    String name;
    int no;
    double money;

    public Book() {
    }

    public Book(String name, int no,double money) {
        this.name = name;
        this.no = no;
        this.money = money;
    }

    @Override
    public String toString() {
        return "姓名："+name+"\t\t\t\t\t\t\t\t\t\t\t\t\t"+"价格："+money+"\t\t\t\t\t\t\t\t"+"数量："+no;
    }
}