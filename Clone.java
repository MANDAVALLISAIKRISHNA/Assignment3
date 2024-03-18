class Organization implements Cloneable {
    private int organizationCode;
    private String organizationName;
    private String organizationAddress;

    public Organization(int organizationCode, String organizationName, String organizationAddress) {
        this.organizationCode = organizationCode;
        this.organizationName = organizationName;
        this.organizationAddress = organizationAddress;
    }

    public void printOrganizationDetails() {
        System.out.println("Organization Code: " + organizationCode);
        System.out.println("Organization Name: " + organizationName);
        System.out.println("Organization Address: " + organizationAddress);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        Organization org1 = new Organization(1, "akshaya", "20 num street,hyd");

        try {
            Organization org2 = (Organization) org1.clone();

            System.out.println("Original Organization Details:");
            org1.printOrganizationDetails();

            System.out.println("\nCloned Organization Details:");
            org2.printOrganizationDetails();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}