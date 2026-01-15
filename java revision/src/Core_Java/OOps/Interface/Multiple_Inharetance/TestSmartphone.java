package Core_Java.OOps.Interface.Multiple_Inharetance;

public class TestSmartphone {
    static void main(String[] args) {

        SmartPhone samrtphone = new SmartPhone();
        samrtphone.makecall(1231);
        samrtphone.EndCall();
        samrtphone.recordVoice();
        samrtphone.TakePicture();
        samrtphone.checkTime();
    }
}
