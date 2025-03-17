public class SpringbootDeveloperFactory  implements DeveloperAbstractFactory{
    @Override
    public Developer createDeveloper() {
        return new SpringbootDeveloper();
    }
}
