package shildt.lang;

// Продемонстраровать применение класса Package

public class PkgTest {
    public static void main(String[] args) {
        Package[] pkg;

        pkg = Package.getPackages();

        for (Package aPackage : pkg) {
            System.out.println(
                    aPackage.getName() + " " +
                            aPackage.getImplementationTitle() + " " +
                            aPackage.getImplementationVendor() + " " +
                            aPackage.getImplementationVersion()
            );
        }
    }
}
