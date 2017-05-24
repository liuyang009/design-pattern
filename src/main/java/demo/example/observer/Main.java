package demo.example.observer;

/**
 * Created by Administrator on 2017/5/24.
 */
public class Main {
    public static void main(String[] args) {
        //模拟一个3D服务号
        ObjectFor3D for3D = new ObjectFor3D();
        //模拟2个订阅者
        Observer1 observer1 = new Observer1(for3D);
        Observer2 observer2 = new Observer2(for3D);

        for3D.setMsg("99999");
        for3D.removeObserver(observer1);
        for3D.setMsg("88888");
    }
}
