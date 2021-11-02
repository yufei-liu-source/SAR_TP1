
public class DeuxThreads extends Thread {
	public void run(){
		for (int i=0; i<10; i++){
		System.out.println("nouveau thread"+ this.getName() );
		}
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		currentThread().setName("pere");
		DeuxThreads th = new DeuxThreads();
		th.setName("fils");
		th.start();
		for (int i=0; i<n; i++){
		System.out.println("Main thread"+ currentThread().getName());
		currentThread().yield();
		currentThread().sleep(1000);
		System.out.flush();			
		}
	}
}


