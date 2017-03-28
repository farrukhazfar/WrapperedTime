//**********************************************
//JNI function to set data members Java class 
//that carries the time information 
// Author Farrukh Azfar
//***********************************************
#include <jni.h>
#include <stdio.h>
#include "TimeGet.h"
#include <time.h>

JNIEXPORT void JNICALL Java_TimeGet_timeaccess
(JNIEnv *env, jobject thisObj, jobject ts) {

  struct timespec gettime_utc; // utc
  struct timespec gettime_tai ; // tai
  struct timespec gettime_monot;//

  // fill in the structs ... 0, 11, 1 specify which time to fill the structs with - 
  clock_gettime(0, &gettime_utc);
  clock_gettime(11, &gettime_tai);
  clock_gettime(1, &gettime_monot);
  
  // Set the values of all the functions in the class - here 
  // pointer to class ValsVar -
  
jclass cl = env->GetObjectClass(ts);

// find the ID of the field that the set member functions set - 
 jfieldID fids_tai = env->GetFieldID(cl, "timeSecsTAI", "J");
 jfieldID fidns_tai = env->GetFieldID(cl, "timeNanoTAI", "J");

 jfieldID fids_utc = env->GetFieldID(cl, "timeSecsUTC", "J");
 jfieldID fidns_utc = env->GetFieldID(cl, "timeNanoUTC", "J");

 jfieldID fids_monot = env->GetFieldID(cl, "timeSecsMONOT", "J");
 jfieldID fidns_monot = env->GetFieldID(cl, "timeNanoMONOT", "J");
 
 // now set the field (equivalent to using the set member functions)...
  env->SetLongField(ts, fids_tai, gettime_tai.tv_sec);
  env->SetLongField(ts, fidns_tai, gettime_tai.tv_nsec);
  env->SetLongField(ts, fids_utc, gettime_utc.tv_sec);
  env->SetLongField(ts, fidns_utc, gettime_utc.tv_nsec);
  env->SetLongField(ts, fids_monot, gettime_monot.tv_sec);
  env->SetLongField(ts, fidns_monot, gettime_monot.tv_nsec);
 
}





  
