public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return this.getRingTone();
    }
    @Override
    public String unlock() {
        return "Unlocking via finger print";
    }
    @Override
    public void displayInfo() {
          System.out.println("Version number: " + this.getVersionNumber());
          System.out.println("Battery percentage: "+ this.getBatteryPercentage());  
          System.out.println("Carrier: "+ this.getCarrier());  
          System.out.println("Ringtone: "+this.getRingTone());  
    }
}

