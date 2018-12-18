package entity.returndetails;

public class Address {

    private String addressLine1;
    private String addressLine2;
    private String city;
    private String stateOrProvince;
    private String postalCode;
    private String country;
    public void setAddressLine1(String addressLine1) {
         this.addressLine1 = addressLine1;
     }
     public String getAddressLine1() {
         return addressLine1;
     }

    public void setAddressLine2(String addressLine2) {
         this.addressLine2 = addressLine2;
     }
     public String getAddressLine2() {
         return addressLine2;
     }

    public void setCity(String city) {
         this.city = city;
     }
     public String getCity() {
         return city;
     }

    public void setStateOrProvince(String stateOrProvince) {
         this.stateOrProvince = stateOrProvince;
     }
     public String getStateOrProvince() {
         return stateOrProvince;
     }

    public void setPostalCode(String postalCode) {
         this.postalCode = postalCode;
     }
     public String getPostalCode() {
         return postalCode;
     }

    public void setCountry(String country) {
         this.country = country;
     }
     public String getCountry() {
         return country;
     }

}