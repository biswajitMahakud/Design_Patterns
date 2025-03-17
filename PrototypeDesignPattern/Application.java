public class Application {
    public static void main(String[] args) {
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIpAddress("198.23.21.01");
        networkConnection.loadNetworkConnection();
        System.out.println(networkConnection);

        //creating a clone of networkConnection
        NetworkConnection networkConnection2 = null;
        try {
            networkConnection2 = (NetworkConnection) networkConnection.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(networkConnection2);

    }
}
