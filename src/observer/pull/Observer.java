package observer.pull;

public interface Observer {
    /**
     * 更新接口
     * @param subject    拉模式，把主题对象给观察者
     */
        public void update(Subject subject);
}
