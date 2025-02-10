# LAB-week2-thread
> 1. 공유 자원 클래스 만들기<br>
> Counter라는 클래스를 만들어 int value를 갖도록 한다.<br>
> increment() 메서드를 만들어, value를 1씩 증가시키도록 작성한다.<br>
> 2. 스레드 클래스 만들기<br>
> 예: IncrementThread라는 클래스를 만들고,<br>
> Thread를 상속받거나 Runnable을 구현하도록 한다.<br>
> 생성자에서 Counter 객체를 받아와서 저장한다.<br>
> run() 메서드 안에서는 일정 횟수(예: 1000번)만큼 increment()를 호출한다.<br>
> 3. 메인 메서드에서 테스트<br>
> Counter 인스턴스를 하나만 생성한다.<br>
> IncrementThread 스레드를 2개 이상 만들어서 동시에 실행(start)시킨다.<br>
> 모든 스레드가 끝난 후(필요하면 join() 활용) Counter의 value를 출력한다.<br>
> 예측한 값(예: 2개의 스레드가 각각 1000번씩 더하면 2000)과 실제 결과를 비교한다.<br>
> 4. 동시성 문제 확인<br>
> 처음엔 increment() 메서드에 어떤 동기화 처리를 하지 않고 돌려본다.<br>
> 실제로 여러 번 실행해보면, 때로는 2000이 안 되는 값을 찍을 수도 있다.<br>
> 동시성 문제(원자성 깨짐)를 직접 체험해본다.<br>
> 5. 동기화 적용 후 재실험<br>
> increment() 메서드에 synchronized 키워드를 붙이거나,<br>
> AtomicInteger를 사용해서 수정해본다.<br>
> 다시 실행해보고, 이제는 항상 2000(또는 예상값)이 정상적으로 나오는지 확인한다.<br>
