package View;
import java.util.concurrent.Semaphore;

import Controller.threadCalculos;
public class Main {

	public static void main(String[] args) {
         Semaphore semaforo = new Semaphore(1);
         for(int idThread = 1; idThread< 22; idThread++) {
        	 threadCalculos threadCalculos = new threadCalculos(idThread, semaforo);
        	 threadCalculos.start();
         }

	}

}
