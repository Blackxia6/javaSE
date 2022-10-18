package HomeWork1;

/**
 * @date 2022/9/5 - 20:52
 */
public class Computer1 {
    private InsertDrawable insertDrawable;
    private String name;
    public Computer1(){

    }
    public Computer1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Computer1(InsertDrawable insertDrawable, String name) {
        this.insertDrawable = insertDrawable;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InsertDrawable getInsertDrawable() {
        return insertDrawable;
    }

    public void setInsertDrawable(InsertDrawable insertDrawable) {
        this.insertDrawable = insertDrawable;
    }
    public void doSome(){
        this.getInsertDrawable().connect();
    }
}
