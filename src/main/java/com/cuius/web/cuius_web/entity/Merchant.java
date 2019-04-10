package com.cuius.web.cuius_web.entity;
// Generated Jan 20, 2019 7:12:23 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * Merchant generated by hbm2java
 */
@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name="merchant"
    ,catalog="project_cuius"
)
public class Merchant  implements java.io.Serializable {


     private Integer merchantId;
     private String companyName;
     private String contactName;
     private String companyAddress;
     private String companyPhone;
     private String companyEmail;
     private String companyLogo;
     private Set products = new HashSet(0);

    public Merchant() {
    }

	
    public Merchant(String companyName, String contactName, String companyAddress, String companyPhone, String companyEmail, String companyLogo) {
        this.companyName = companyName;
        this.contactName = contactName;
        this.companyAddress = companyAddress;
        this.companyPhone = companyPhone;
        this.companyEmail = companyEmail;
        this.companyLogo = companyLogo;
    }
    public Merchant(String companyName, String contactName, String companyAddress, String companyPhone, String companyEmail, String companyLogo, Set products) {
       this.companyName = companyName;
       this.contactName = contactName;
       this.companyAddress = companyAddress;
       this.companyPhone = companyPhone;
       this.companyEmail = companyEmail;
       this.companyLogo = companyLogo;
       this.products = products;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="merchant_id", unique=true, nullable=false)
    public Integer getMerchantId() {
        return this.merchantId;
    }
    
    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    
    @Column(name="company_name", nullable=false, length=1000)
    public String getCompanyName() {
        return this.companyName;
    }
    
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    
    @Column(name="contact_name", nullable=false, length=1000)
    public String getContactName() {
        return this.contactName;
    }
    
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    
    @Column(name="company_address", nullable=false, length=1000)
    public String getCompanyAddress() {
        return this.companyAddress;
    }
    
    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    
    @Column(name="company_phone", nullable=false, length=1000)
    public String getCompanyPhone() {
        return this.companyPhone;
    }
    
    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    
    @Column(name="company_email", nullable=false, length=1000)
    public String getCompanyEmail() {
        return this.companyEmail;
    }
    
    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    
    @Column(name="company_logo", nullable=false, length=100)
    public String getCompanyLogo() {
        return this.companyLogo;
    }
    
    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="merchant")
    public Set getProducts() {
        return this.products;
    }
    
    public void setProducts(Set products) {
        this.products = products;
    }




}

