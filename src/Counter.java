public class Counter {
    /*
    두 번째 방법: 동시성 문제를 해결하기 위해 AtomicInteger 사용
    private AtomicInteger value = new AtomicInteger(0);
     */
    private int value = 0;

    /*
    첫 번째 방법: 동시성 문제를 해결하기 위해 synchronized 추가
     */
    public synchronized void increment() {
        value++;
    }

    public int getValue() {
        return value;
    }
}
