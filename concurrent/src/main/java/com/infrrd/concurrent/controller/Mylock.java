package com.infrrd.concurrent.controller;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Mylock {
	private final ReentrantLock lock = new ReentrantLock(); // or store it in context based on your needs
	   // ...
//	private final ReentrantLock lock2 = new ReentrantLock();

	   /** this method refuse to process if there is already ongoing processing */
	/** this method refuse to process if there is already ongoing processing */
	volatile boolean flag=false; 
	   public void heavyProcessing() {

		   ReentrantLock lock =  new ReentrantLock(true);

			Thread threadOne = new Thread(new Runnable() {
				@Override
				public void run() {
					//synchronized (lock) {
//					       if (lock.isLocked()) {
//					          // return busy status here
//					    	   System.out.println("Thread is busy in 2 through 1");
//					    	   lock.unlock();
//					    	   flag=true;
//					          //return;   
//					    	   Thread.interr;
//					       }

					       //lock.lock();  // acquire the lock - here we have the winner request that will be processed
					     //}
					     try {
					       // ... do the processing here
					    	 //Thread.sleep(10000);
					    	 for(int i =0; i<1000000; i++) {
					    		 System.out.println("In thread 1"+" "+i);
					    	 }
					     //} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							//e.printStackTrace();
						}  
					     finally {
					    	 System.out.println("Thread task is completed");
					     }
				}			
			});		
//			Thread threadTwo = new Thread(new Runnable() {
//				@Override
//				public void run() {
//					//synchronized (lock) {
//					       if (lock.isLocked()) {
//					          // return busy status here
//					    	   System.out.println("Thread is busy in 1 through 2");
//					    	   lock.unlock();
//					               
//					       }
//
//					       lock.lock();  // acquire the lock - here we have the winner request that will be processed
//					     //}
//					     try {
//					       // ... do the processing here
//					    	// Thread.sleep(5000);
//					    	 for(int i =0; i<10000; i++) {
//					    		 System.out.println("In thread 2"+" "+i);
//					    	 }
//					     } finally {
//					       lock.unlock();
//					     }
//				}			
//			});	
			
			//threadOne.setPriority(8);
			
			if(threadOne.isAlive()) {
//				lock.unlock();
				System.out.println("Inside thread is alive");
				threadOne.interrupt();
			}else {
				System.out.println("Inside thread is not alive");
			}
			threadOne.start();
//			if(flag) {
//				threadOne.interrupt();
//				System.out.println("threadOne is interrupted");
//			}else {
//				
//			}
			
			//threadTwo.start();
//	     synchronized (lock) {
//	       if (lock.isLocked()) {
//	          // return busy status here
//	    	   System.out.println("Thread is busy");
//	          return;     
//	       }
//
//	       lock.lock();  // acquire the lock - here we have the winner request that will be processed
//	     }
//	     try {
//	       // ... do the processing here
//	    	 for(int i =0; i<10000; i++) {
//	    		 System.out.println(i);
//	    	 }
//	     } finally {
//	       lock.unlock();
//	     }
	   }
}
