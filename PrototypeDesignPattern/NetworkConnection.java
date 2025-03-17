public class NetworkConnection implements Cloneable{
    private String ipAddress;
    private String importantData;
    
    

    public void loadNetworkConnection(){
        this.importantData = "very very important data";
        try {
            Thread.sleep(5000);
            System.out.println("Network connection loaded successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    

    @Override
    public String toString() {
        return "NetworkConnection [ipAddress=" + ipAddress + ", importantData=" + importantData + "]";
    }


    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
}