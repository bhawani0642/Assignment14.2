
public class ThreadDemo extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("Welcome to AcadGild");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ThreadDemo t1= new ThreadDemo();
        t1.start();   
	 
 }
	}


