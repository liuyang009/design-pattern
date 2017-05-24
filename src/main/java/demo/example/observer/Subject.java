package demo.example.observer;

/**
 * 主题接口，所有的主题必须实现此接口
 * Created by Administrator on 2017/5/24.
 */
public interface Subject {

    void registerObserver(Observer observer);//注册一个观察者
    void removeObserver(Observer observer);//移除一个观察者
    void notifyObservers();//通知所有的观察者

}
