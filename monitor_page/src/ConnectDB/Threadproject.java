package ConnectDB;

public class Threadproject extends Thread {
	int number;
	C_DB connect_db;

	public Threadproject(int number, C_DB connect_db) {
		this.number = number;
		this.connect_db = connect_db;
		System.out.println("thread 생성자 ");
	}

	@Override
	public void run() {
		// 서브 스레드
		try {
			Thread.sleep(5000);// 5초
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		while (true) {
			switch (number) {
			case 1:
				// connect_db.Storage_list(1);
				System.out.println("1번째");
				break;
			case 2:
				// connect_db.Storage_list(2);
				System.out.println("2번째");
				break;

			case 3:
				Thread.interrupted();// 스레드 종료
				return;
			}
		}
	}

}
