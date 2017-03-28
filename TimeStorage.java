//************************************
// stores TAI, UTC and MONOTONIC time in seconds and nano seconds -
// Author - Farrukh Azfar.
//********************************************

public class TimeStorage {

    // private data members storing seconds and nano-seconds -

     // TAI
    private long timeSecsTAI;
    private long timeNanoTAI;

     // UTC
    private long timeSecsUTC;
    private long timeNanoUTC;


     // Monotonic 
    private long timeSecsMONOT;
    private long timeNanoMONOT;

    // set functions
    
     // TAI
    
    public void setTimeSecsTAI(long jjt) {
	timeSecsTAI = jjt;
    }
    
    public void setTimeNanoTAI(long kkt) {
	timeNanoTAI = kkt;
    }

     // UTC
    
    public void setTimeSecsUTC(long jju) {
	timeSecsUTC = jju;
    }
    
    public void setTimeNanoUTC(long kku) {
	timeNanoUTC = kku;
    }

     // Monotonic
    
    public void setTimeSecsMONOT(long jjm) {
	timeSecsMONOT = jjm;
    }
    
    public void setTimeNanoMONOT(long kkm) {
	timeNanoMONOT = kkm;
    }


   // get methods 

    // TAI
    
    public long getTimeSecsTAI() {
	return timeSecsTAI;
    }
    
    public long getTimeNanoTAI() {
	return timeNanoTAI;
    }

    // UTC
    public long getTimeSecsUTC() {
	return timeSecsUTC;
    }
    
    public long getTimeNanoUTC() {
	return timeNanoUTC;
    }


    // Monotonic 
    public long getTimeSecsMONOT() {
	return timeSecsMONOT;
    }
    
    public long getTimeNanoMONOT() {
	return timeNanoMONOT;
    }
    
    
}

