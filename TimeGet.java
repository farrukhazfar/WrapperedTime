public class TimeGet {
    
    static {
	System.loadLibrary("timeaccess"); // Load native library at runtime
	// hello.dll (Windows) or libtimeaccess.so (Unixes)
    }
    
    // Declare a native method timeaccess that receives the java storage class TimeStorage and returns void
    private native void timeaccess(TimeStorage tstore);
    
    // Test Driver
    public static void main(String[] args) {
	TimeStorage ts = new TimeStorage();
	
	new TimeGet().timeaccess(ts);  // invoke the native method


	// print stuff out -
	System.out.println("TAI time (seconds): " + ts.getTimeSecsTAI());
	System.out.println("TAI time (nano-seconds): " + ts.getTimeNanoTAI());
	System.out.println("UTC time (seconds) : " + ts.getTimeSecsUTC());
	System.out.println("UTC time (nano-seconds) : " + ts.getTimeNanoUTC());
	System.out.println("MONOT time (seconds) : " + ts.getTimeSecsMONOT());
	System.out.println("MONOT (nano-seconds) : " + ts.getTimeNanoMONOT());

    }
}
