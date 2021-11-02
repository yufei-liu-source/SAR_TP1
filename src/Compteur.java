import java.util.Random;

public class Compteur extends Thread{
	public void run() {
		for (int i=0; i<10;i++) {
			System.out.println(this.getName() + i+1);
			Random rand = new Random(0);		
			try {
				Thread.sleep(rand.nextInt(5000));
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(this.getName() +i+1+ "a fini de compter jusqua 10");
		}
	}
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		for (int i=0; i<n; i++){
			Compteur c= new Compteur();			
			c.start();	
		}
	}
}
