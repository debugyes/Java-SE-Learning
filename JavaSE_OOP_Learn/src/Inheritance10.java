/*
    方法重写的注意事项
        A:父类中的私有方法不能被重写
            因为父类私有方法子类根本就无法继承
        B:子类重写父类方法时，访问权限不能更低
            最好就一致
        C:父类中静态方法，子类也必须通过静态方法进行重写

    子类重写父类方法的时候，声明最好一模一样。
 */

public class Inheritance10 {
    public static void main(String[] args){
        SonG s = new SonG();

        s.show();
    }
}

class FatherG{
    //private void show(){}

    /*
    public void show(){
        System.out.println("show Father");
    }

     */
    void show(){
        System.out.println("show Father");
    }

    public static void method(){

    }
}

class SonG extends FatherG{
    /*
    public void show(){
        System.out.println("show Son");
    }

    void show(){

    }*/
    public static void method(){

    }
}

