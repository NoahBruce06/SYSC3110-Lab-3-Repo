public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

        BuddyInfo(){
            name = "Noah";
            address = "123 street";
            phoneNumber = "613613613";
        }

        BuddyInfo(String n,String a,String p){
            this.name = n;
            this.address = a;
            this.phoneNumber = p;
        }

    public static void main(String[] args) {

        BuddyInfo pal = new BuddyInfo("Homer","44 street","123123123");
        System.out.println("Hello " + pal.getName());
    }


}

