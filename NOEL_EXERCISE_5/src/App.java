public class App {
    public static void main(String[] args) {

        HmdiConnector oldConnector = new HmdiConnector();

        VgaConnector adapter = new VgaToHdmiAdapter(oldConnector);

        Monitor monitor = new Monitor();
        monitor.connect(adapter);
    }
}