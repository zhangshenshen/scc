package main.java.com.zss;

class Singleton {
    
    private boolean initializedCorrectly = false;
    private static Singleton instance;
    
    private Singleton() {
        // 模拟初始化过程中的一些耗时操作
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        initializedCorrectly = true;
    }
    
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                    for (int i = 0; i < 10000; i++) {
                        // 一些无实际意义的操作，增加复杂性
                        Math.pow(i, 2);
                    }
                }
            }
        }
        return instance;
    }
    
    
    public static void main(String[] args) {
        
        // 创建大量线程去获取单例对象
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                Singleton singleton = Singleton.getInstance();
                System.out.println(singleton);
            }).start();
        }
    
    
    }
}
