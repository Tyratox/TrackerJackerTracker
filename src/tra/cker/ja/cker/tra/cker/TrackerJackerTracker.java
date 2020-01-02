package tra.cker.ja.cker.tra.cker;

public class TrackerJackerTracker {

	public static void main(String[] args) {
		new TrackerJackerTracker();
	}
	
	public TrackerJackerTracker(){
		ShouterThread shouter = new ShouterThread();
		shouter.run();
	}

}
