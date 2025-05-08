public class Monitor {

    public void connect(VgaConnector moni) {
        System.out.println("\nMonitor needs to be connected to a VGA port..");
        moni.connectwithVGA();
        System.out.println("\nAdapting..");
        System.out.println("\nConnecting to VGA port..");
        System.out.println("\nCONNECTED!");
    }
}
