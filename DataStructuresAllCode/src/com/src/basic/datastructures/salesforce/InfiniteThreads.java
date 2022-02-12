package com.src.basic.datastructures.salesforce;

public class InfiniteThreads {

	public static void main(String[] args) throws InterruptedException {
		
			Thread t1= new Thread(new Runnable() {

				@Override
				public void run() {
					for(int i=0;i<5;i++) {
						System.out.println("Message from thread 1");
					}
					
				}
				
			});
			
			Thread t2= new Thread(new Runnable() {

				@Override
				public void run() {
					for(int i=0;i<10;i++) {
						System.out.println("Message from thread 2");
					}
					
				}
				
			});
			while(true) {
			t1.run();
			System.out.println();
			t2.run();
			}
			//t1.join();

	}

}
