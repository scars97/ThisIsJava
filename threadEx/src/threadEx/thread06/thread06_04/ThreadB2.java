package threadEx.thread06.thread06_04;

public class ThreadB2 extends Thread {

	private WorkObject workObject;

	public ThreadB2(WorkObject workObject) {
		this.workObject = workObject; //공유 객체 값 필드 저장
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			workObject.methodB(); // 공유 객체 methodB 10번 반복 호출.
		}
	}
}
