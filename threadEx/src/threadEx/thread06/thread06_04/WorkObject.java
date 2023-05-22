package threadEx.thread06.thread06_04;

public class WorkObject {
	
	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA() 작업 실행");
		notify(); //일시 정지 상태에 있는 ThreadB를 실행 대기 상태로 만듦.
		try {
			wait(); //ThreadA를 일시 정지 상태로 만듦.
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB의 methodB() 작업 실행");
		notify(); //일시 정지 상태에 있는 ThreadA를 실행 대기 상태로 만듦.
		try {
			wait(); //ThreadB를 일시 정지 상태로 만듦.
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
}
