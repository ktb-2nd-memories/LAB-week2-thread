public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(); // 공유 자원

        Thread thread1 = new Thread(new IncrementThread(counter));
        Thread thread2 = new Thread(new IncrementThread(counter));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("최종 Counter 값: " + counter.getValue());
    }
}
