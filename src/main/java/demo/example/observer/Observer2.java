package demo.example.observer;

/**
 * Created by Administrator on 2017/5/24.
 */
public class Observer2 implements Observer {

    private Subject subject;

    public Observer2(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void update(String msg) {
        System.out.println("Observer2 get 3D Nomber :" + msg + ", i want to inform the roommate");
    }
}
