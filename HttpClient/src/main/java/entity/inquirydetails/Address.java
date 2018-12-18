package entity.inquirydetails;

public class Address {

    private String addressLine1;
    private String addressLine2;
    private String addressType;
    private String city;
    private String country;
    private String county;
    private Boolean isTransliterated;
    private String nationalRegion;
    private String postalCode;
    private String script;
    private String stateOrProvince;
    private String transliteratedFromScript;
    private String worldRegion;
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

    public void setAddressType(String addressType) {
         this.addressType = addressType;
     }
     public String getAddressType() {
         return addressType;
     }

    public void setCity(String city) {
         this.city = city;
     }
     public String getCity() {
         return city;
     }

    public void setCountry(String country) {
         this.country = country;
     }
     public String getCountry() {
         return country;
     }

    public void setCounty(String county) {
         this.county = county;
     }
     public String getCounty() {
         return county;
     }

    public void setIsTransliterated(Boolean isTransliterated) {
         this.isTransliterated = isTransliterated;
     }
     public Boolean getIsTransliterated() {
         return isTransliterated;
     }

    public void setNationalRegion(String nationalRegion) {
         this.nationalRegion = nationalRegion;
     }
     public String getNationalRegion() {
         return nationalRegion;
     }

    public void setPostalCode(String postalCode) {
         this.postalCode = postalCode;
     }
     public String getPostalCode() {
         return postalCode;
     }

    public void setScript(String script) {
         this.script = script;
     }
     public String getScript() {
         return script;
     }

    public void setStateOrProvince(String stateOrProvince) {
         this.stateOrProvince = stateOrProvince;
     }
     public String getStateOrProvince() {
         return stateOrProvince;
     }

    public void setTransliteratedFromScript(String transliteratedFromScript) {
         this.transliteratedFromScript = transliteratedFromScript;
     }
     public String getTransliteratedFromScript() {
         return transliteratedFromScript;
     }

    public void setWorldRegion(String worldRegion) {
         this.worldRegion = worldRegion;
     }
     public String getWorldRegion() {
         return worldRegion;
     }

}