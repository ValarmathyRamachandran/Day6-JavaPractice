package StopWatch;
public class StopWatch 
	{

		private long startTime = 0;
		private long stopTime = 0;
		private boolean running = false;


		public void start() {
		    this.startTime = System.currentTimeMillis();
		    System.out.println("Start Time in MilliSeconds:"+startTime);
		    this.running = true;
		}


		public void stop() {
		    this.stopTime = System.currentTimeMillis();
		    System.out.println("End Time in MilliSeconds:" +stopTime);
		    this.running = false;
		}


		//elaspsed time in milliseconds
		public long getElapsedTime() {
		    long elapsed;
		    if (running) {
		         elapsed = (System.currentTimeMillis() - startTime);
		    }
		    else {
		        elapsed = (stopTime - startTime)/1000;
		    }
		    return elapsed;
		}


		//elaspsed time in seconds
		public long getElapsedTimeSecs() {
		    long elapsed;
		    if (running) {
		        elapsed = ((System.currentTimeMillis() - startTime) / 1000);
		    }
		    else {
		        elapsed = ((stopTime - startTime) / 1000);
		    }
		    return elapsed;
		}




		//sample usage
		public static void main(String[] args) {
		    StopWatch s = new StopWatch();
		    s.start();
		    //code you want to time goes here
		    try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    s.stop();
		    System.out.println("elapsed time in seconds: " + s.getElapsedTime());
		}
		}