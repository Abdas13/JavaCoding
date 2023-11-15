package hackerrank.strings;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterMaturityDate {

    public static void main(String[] args) {
        String qualifier = "( <= ‘2023-01-01’ & >= ‘2020-12-31’ ) | ( <= ‘2028-01-01’ & >= ‘2025-12-31’ )";
        filterMaturityDate(qualifier);
    }
    public static void filterMaturityDate(String qualifier){
        TradeJson tjson = new TradeJson(5,"2029-02-05");
        List<String> maturityDates = new ArrayList<>();

        String[] qualified = qualifier.replaceAll("[()><=‘’ ]","").split("[&|]");
        System.out.println(Arrays.toString(qualified));
            LocalDate matDate = LocalDate.parse(tjson.getMaturityDate());
            if((matDate.isBefore(LocalDate.parse(qualified[0])) && matDate.isAfter(LocalDate.parse(qualified[1])))
            || (matDate.isBefore(LocalDate.parse(qualified[2])) && matDate.isBefore(LocalDate.parse(qualified[3])))){
                maturityDates.add(matDate.toString());
        }else {
                System.out.println("maturity date is not in the range of qualifier");
            }
        System.out.println(maturityDates);
    }
}

class TradeJson{
    private int secSID;
    private String maturityDate;

    public TradeJson() {
    }

    public TradeJson(int secSID, String maturityDate) {
        this.secSID = secSID;
        this.maturityDate = maturityDate;
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

    @Override
    public String toString() {
        return "TradeJson{" +
                "secSID=" + secSID +
                ", maturityDate='" + maturityDate + '\'' +
                '}';
    }
}
class ListOfTrade{

}
/*
    Please create a module (either function module or class module) that can take:

Input: json strings, qualifier string ie. ” ( <= ‘2023-01-01’ & >= ‘2020-12-31’ ) | ( <= ‘2028-01-01’ & >= ‘2025-12-31’ )“.
This qualifier string applies to maturityDate.
Output: qualified trade object (in collection), filtered by maturityDate, ordered by maturityDate desc
Other requirement: considering performance in the code design given that the input json string could be large.

Sample test input string:
[{
                               “cusip”: null,
                               “secSID”: 1,
                               “issueFactor”: 1.0,
                               “commonCode”: “1_commonCode”,
                               “blockedBy”: “1_blockedBy”,
                               “minorType”: “1_minorType”,
                               “shortcode”: “1_shortcode”,
                               “sedol”: “1_sedol”,
                               “ric”: “1_ric”,
                               “descr”: “1_descr”,
                               “valueFactor”: 0.0,
                               “quickcode”: “1_quickcode”,
                               “securityType”: “1_securityType”,
                               “maturityDate”: “2031-03-05",
                               “ccy”: “1_ccy”,
                               “reservedBy”: “1_reservedBy”,
                               “tradedIND”: “Y”,
                               “ctryId”: “1_ctryId”,
                               “wertpapierCode”: “1_wertpapierCode”,
                               “isin”: “1_ISIN”
               }, {
                               “cusip”: null,
                               “secSID”: 2,
                               “issueFactor”: 1.0,
                               “commonCode”: “2_commonCode”,
                               “blockedBy”: “2_blockedBy”,
                               “minorType”: “2_minorType”,
                               “shortcode”: “2_shortcode”,
                               “sedol”: “2_sedol”,
                               “ric”: “2_ric”,
                               “descr”: “2_descr”,
                               “valueFactor”: 0.0,
                               “quickcode”: “2_quickcode”,
                               “securityType”: “2_securityType”,
                               “maturityDate”: “2027-03-05",
                               “ccy”: “2_ccy”,
                               “reservedBy”: “2_reservedBy”,
                               “tradedIND”: “Y”,
                               “ctryId”: “2_ctryId”,
                               “wertpapierCode”: “2_wertpapierCode”,
                               “isin”: “2_ISIN”
               }, {
                               “cusip”: null,
                               “secSID”: 6,
                               “issueFactor”: 1.0,
                               “commonCode”: “6_commonCode”,
                               “blockedBy”: “6_blockedBy”,
                               “minorType”: “6_minorType”,
                               “shortcode”: “6_shortcode”,
                               “sedol”: “6_sedol”,
                               “ric”: “6_ric”,
                               “descr”: “6_descr”,
                               “valueFactor”: 0.0,
                               “quickcode”: “6_quickcode”,
                               “securityType”: “6_securityType”,
                               “maturityDate”: “2019-12-06",
                               “ccy”: “6_ccy”,
                               “reservedBy”: “6_reservedBy”,
                               “tradedIND”: “Y”,
                               “ctryId”: “6_ctryId”,
                               “wertpapierCode”: “6_wertpapierCode”,
                               “isin”: “6_ISIN”
               }, {
                               “cusip”: null,
                               “secSID”: 7,
                               “issueFactor”: 1.0,
                               “commonCode”: “7_commonCode”,
                               “blockedBy”: “7_blockedBy”,
                               “minorType”: “7_minorType”,
                               “shortcode”: “7_shortcode”,
                               “sedol”: “7_sedol”,
                               “ric”: “7_ric”,
                               “descr”: “7_descr”,
                               “valueFactor”: 0.0,
                               “quickcode”: “7_quickcode”,
                               “securityType”: “7_securityType”,
                               “maturityDate”: “2022-03-04",
                               “ccy”: “7_ccy”,
                               “reservedBy”: “7_reservedBy”,
                               “tradedIND”: “Y”,
                               “ctryId”: “7_ctryId”,
                               “wertpapierCode”: “7_wertpapierCode”,
                               “isin”: “7_ISIN”
               }
]
     */

