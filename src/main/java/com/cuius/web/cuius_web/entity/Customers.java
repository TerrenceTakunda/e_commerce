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
 * Customers generated by hbm2java
 */
@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name="customers"
    ,catalog="project_cuius"
)
public class Customers  implements java.io.Serializable {


     private Integer customerId;
     private int userId;
     private String billingAddress;
     private String shippingAddress;
     private Set productOrders = new HashSet(0);

    public Customers() {
    }

	
    public Customers(int userId, String billingAddress, String shippingAddress) {
        this.userId = userId;
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
    }
    public Customers(int userId, String billingAddress, String shippingAddress, Set productOrders) {
       this.userId = userId;
       this.billingAddress = billingAddress;
       this.shippingAddress = shippingAddress;
       this.productOrders = productOrders;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="customer_id", unique=true, nullable=false)
    public Integer getCustomerId() {
        return this.customerId;
    }
    
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    
    @Column(name="user_id", nullable=false)
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }

    
    @Column(name="billing_address", nullable=false, length=1000)
    public String getBillingAddress() {
        return this.billingAddress;
    }
    
    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    
    @Column(name="shipping_address", nullable=false, length=1000)
    public String getShippingAddress() {
        return this.shippingAddress;
    }
    
    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="customers")
    public Set getProductOrders() {
        return this.productOrders;
    }
    
    public void setProductOrders(Set productOrders) {
        this.productOrders = productOrders;
    }




}


