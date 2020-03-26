/*
    我们曾经说过，起名字要做到见名知意。
    this:是当前类的对象引用，简单的记，它就代表当前类的一个对象。
        注意：谁调用这个方法，在该方法内部的this就代表谁。

    this的场景：
        A：解决局部变量隐藏成员变量。

 */
class StudentC {
    //姓名
    private String name;
    //年龄
    private int age;

    //姓名赋值
    public void setName(String name) {
        //name = name;
        //两个name变量重名了，无法达到赋值目的
        //谁能代表当前类的对象呢？java提供了一个关键字name
        this.name = name;
    }
    //年龄赋值
    public void setAge(int age) {
        age = age;
        this.age = age;
    }

    //姓名获取值
    public String getName() {
        return name;
    }

    //年龄获取值
    public int getAge() {
        return age;
    }
}
public class Use_This {
    public static void main(String[] args) {
        StudentC st = new StudentC();

        //通过方法赋值
        st.setAge(27);
        st.setName("alex");
        System.out.println(st.getAge() + "-------------" + st.getName());

    }
}