//https://leetcode.com/problems/defanging-an-ip-address/
class DefangIpAddress {
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}
