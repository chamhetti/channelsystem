package lk.ac.ucsc.webArc.assgnment.customer.api.beans.customer;

import lk.ac.ucsc.webArc.assgnment.customer.impl.beans.customer.LoginProfileBean;

/**
 * This is the service api which used to set and get the channelInfo related information
 *
 * User: Hetti
 * Date: 12/26/12
 * Time: 12:19 PM
 */
public interface Customer {


    LoginProfile getLoginProfile();

    void setLoginProfile(LoginProfile loginProfile);

    String getCustomerNumber();

    void setCustomerNumber(String customerNumber);

    long getCustomerId();

    void setCustomerId(long customerId);

    String getTitle();

    void setTitle(String title);

    String getFirstName();

    void setFirstName(String firstName);

    String getGender();

    void setGender(String gender);

    String getOfficeTele();

    void setOfficeTele(String officeTele);

    String getMobile();

    void setMobile(String mobile);

    String getEmail();

    void setEmail(String email);

    String getLastName();

    void setLastName(String lastName);

    String getIdCardNumber();

    void setIdCardNumber(String idCardNumber);

    String getAddress();

    void setAddress(String address);

    void setLoginProfile(LoginProfileBean loginProfile);
}
