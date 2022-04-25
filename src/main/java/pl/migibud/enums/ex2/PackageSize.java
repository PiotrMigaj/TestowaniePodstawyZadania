package pl.migibud.enums.ex2;

public enum PackageSize {

    SMALL(40,90),
    MEDIUM(90,140),
    LARGE(140,250),
    UNKNOWN(0,0);

    private int minPackageSize, maxPackageSize;

    private PackageSize(int minPackageSize,int maxPackageSize){
        this.minPackageSize=minPackageSize;
        this.maxPackageSize=maxPackageSize;
    }

    public static PackageSize getPackageSize(int minPackageSize,int maxPackageSize){

        for (PackageSize p:PackageSize.values()) {
            if (minPackageSize>=p.minPackageSize&&maxPackageSize<=p.maxPackageSize){
                return p;
            }
        }
        return UNKNOWN;
    }

}
