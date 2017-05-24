package demo.example.observer;

/**
 * 观察者一号
 * Created by Administrator on 2017/5/24.
 */
public class Observer1 implements Observer {

    private Subject subject;

    public Observer1(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void update(String msg) {
        System.out.println("Observer1 get 3D Nomber :" + msg + ", i will write down");
    }
}
