public class VgaToHdmiAdapter implements VgaConnector{
    
    private HmdiConnector hmdiConnector;

    public VgaToHdmiAdapter(HmdiConnector hmdiConnector) {
        this.hmdiConnector = hmdiConnector;
    }

    @Override
    public void connectwithVGA() {
        System.out.println("\nAdapting VGA to HDMI...");
        hmdiConnector.connectWithHdmi();
    }
}
