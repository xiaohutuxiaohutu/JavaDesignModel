package ObserverPattern.latest;


/**
 * 所有被观察者，通用接口
 */
public interface Observable {
    //增加观察者
    void addObserver(Observer observer);

    //删除观察者
    void deleteObserver(Observer observer);

    //通知观察者
    void notifyObservers(String context);
}
