public class AndroidDeveloperFactory implements DeveloperAbstractFactory {
    @Override
    public Developer createDeveloper() {
        return new AndroidDeveloper();
    }
}
