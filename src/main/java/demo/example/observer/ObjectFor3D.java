package demo.example.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 微信3D彩票服务号
 * Created by Administrator on 2017/5/24.
 */
public class ObjectFor3D implements Subject{

    List<Observer> observers = new ArrayList<Observer>();

    //3D彩票号
    String msg;

    public void setMsg(String msg) {
        this.msg = msg;
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0)
            observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer o:observers) {
            o.update(msg);
        }
    }
}
