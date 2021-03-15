package Controller;

import java.util.concurrent.Semaphore;

public class threadCalculos extends Thread{
	
	private int id;
	private Semaphore semaforo;
	
	public threadCalculos(int id, Semaphore semaforo) {
		this.id = id;
		this.semaforo = semaforo;
	}
	
	@Override
	public void run(){
		try {
			semaforo.acquire();
			comportamento(this.id);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			semaforo.release();
		}
		
	}
	
	public void comportamento(int id) {
		int tempo;
		if(id%3 == 1) {
			for(int i = 0; i<2; i++) {
			  tempo = (int)((Math.random()*801)+200);
			  try {
				 sleep(tempo);
			  } catch (InterruptedException e) {
				 e.printStackTrace();
			  }
			  System.out.println("A "+id+"ª therad realizou Cálculos em "+ (double)tempo/1000 +" segundo");
			  tempo = 1000;
			  try {
				 sleep(tempo);
			  } catch (InterruptedException e) {
				e.printStackTrace();
			  }
			  System.out.println("A "+id+"ª therad realizou Transação de BD em "+ (double)tempo/1000 +" segundo");
			}
		}else if(id%3 == 2){
			for(int i = 0; i<3; i++) {
				  tempo = (int)((Math.random()*1501)+500);
				  try {
					 sleep(tempo);
				  } catch (InterruptedException e) {
					 e.printStackTrace();
				  }
				  System.out.println("A "+id+"ª therad realizou Cálculos em "+ (double)tempo/1000 +" segundo");
				  tempo = 1500;
				  try {
					 sleep(tempo);
				  } catch (InterruptedException e) {
					e.printStackTrace();
				  }
				  System.out.println("A "+id+"ª therad realizou Transação de BD em "+ (double)tempo/1000 +" segundo");
				}
			
		}else if(id%3 == 0){
			
			for(int i = 0; i<3; i++) {
				  tempo = (int)((Math.random()*1001)+1000);
				  try {
					 sleep(tempo);
				  } catch (InterruptedException e) {
					 e.printStackTrace();
				  }
				  System.out.println("A "+id+"ª therad realizou Cálculos em "+ (double)tempo/1000 +" segundo");
				  tempo = 1500;
				  try {
					 sleep(tempo);
				  } catch (InterruptedException e) {
					e.printStackTrace();
				  }
				  System.out.println("A "+id+"ª therad realizou Transação de BD em "+ (double)tempo/1000 +" segundo");
				}
			
		}
		
	}


}
