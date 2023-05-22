package threadEx.thread06.thread06_04;

public class DataBox {
	private String data;
	
	public synchronized String getData() {
		if(this.data == null) { // 소비자 스레드를 일시 정지 상태로 만듦.
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		String returnValue = data;
		System.out.println("ConsummerThread가 읽은 데이터: " + returnValue);
		data = null; 
		notify(); // date를 null로 만들고 생산자 스레드를 실행 대기 상태로 만듦.
		return returnValue;
	}
	
	public synchronized void setData(String data) {
		if(this.data != null) { //생성자 스레드를 일시 정지 상태로 만듦
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		this.data = data;
		System.out.println("ProducerThread가 읽은 데이터: " + data);
		notify(); //data 값 저장하고 소비자 스레드 실행 대기 상태로 만듦.
	}
}
