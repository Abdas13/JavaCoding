package practice.interv;

public class Temp {

    private int secSID;

    private String maturityDate;

    private String securityType;

    public Temp(int secSID, String maturityDate, String securityType) {
        this.secSID = secSID;
        this.maturityDate = maturityDate;
        this.securityType = securityType;
    }

    public int getSecSID() {
        return secSID;
    }

    public void setSecSID(int secSID) {
        this.secSID = secSID;
    }

    public String getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(String maturityDate) {
        this.maturityDate = maturityDate;
    }

    public String getSecurityType() {
        return securityType;
    }

    public void setSecurityType(String securityType) {
        this.securityType = securityType;
    }

    @Override
    public String toString() {
        return "Temp{" +
                "secSID=" + secSID +
                ", maturityDate='" + maturityDate + '\'' +
                ", securityType='" + securityType + '\'' +
                '}';
    }
}
