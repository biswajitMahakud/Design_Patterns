
public class DeveloperFactory {
    public static DeveloperAbstractFactory getDeveloper(String developerType){
        if (developerType.equalsIgnoreCase("ANDROID")) {
            return new AndroidDeveloperFactory();
        } else if (developerType.equalsIgnoreCase("UI")) {
            return new UIDeveloperFactory();
        } else if (developerType.equalsIgnoreCase("SPRINGBOOT")) {
            return new SpringbootDeveloperFactory();
        }else{
            throw new RuntimeException("Developer Type is mismatched");
        }
        
    }
}
