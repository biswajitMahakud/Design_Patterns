public class UIDeveloperFactory implements DeveloperAbstractFactory {
    @Override
    public Developer createDeveloper() {
        return new UIDeveloper();
    }
}
