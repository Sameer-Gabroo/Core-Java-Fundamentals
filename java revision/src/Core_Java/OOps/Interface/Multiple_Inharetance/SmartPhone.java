package Core_Java.OOps.Interface.Multiple_Inharetance;

import java.sql.SQLOutput;

public class SmartPhone implements Camera,Calls,VoiceRecorder,Clock{
    @Override
    public void makecall(int number) {
        System.out.println("your call is connected to " + number);
    }

    @Override
    public void EndCall() {
        System.out.println("your call is ended");
    }

    @Override
    public void TakePicture() {
        System.out.println("picture has been taken");
    }

    @Override
    public void recordVoice() {
        System.out.println("your voice is recorded ");
    }
}
