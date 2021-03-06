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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * Product generated by hbm2java
 */
@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name="product"
    ,catalog="project_cuius"
)
public class Product  implements java.io.Serializable {


     private Integer proId;
     private Merchant merchant;
     private SubCategory subCategory;
     private String proName;
     private double proPrice;
     private int proQty;
     private String proDesc;
     private String proPic1;
     private String proPic2;
     private String proPic3;
     private String proPic4;
     private String proPic5;
     private Set productOrders = new HashSet(0);
     private Set productOrderDetailses = new HashSet(0);

    public Product() {
    }

	
    public Product(Merchant merchant, SubCategory subCategory, String proName, double proPrice, int proQty, String proDesc, String proPic1) {
        this.merchant = merchant;
        this.subCategory = subCategory;
        this.proName = proName;
        this.proPrice = proPrice;
        this.proQty = proQty;
        this.proDesc = proDesc;
        this.proPic1 = proPic1;
    }
    public Product(Merchant merchant, SubCategory subCategory, String proName, double proPrice, int proQty, String proDesc, String proPic1, String proPic2, String proPic3, String proPic4, String proPic5, Set productOrders, Set productOrderDetailses) {
       this.merchant = merchant;
       this.subCategory = subCategory;
       this.proName = proName;
       this.proPrice = proPrice;
       this.proQty = proQty;
       this.proDesc = proDesc;
       this.proPic1 = proPic1;
       this.proPic2 = proPic2;
       this.proPic3 = proPic3;
       this.proPic4 = proPic4;
       this.proPic5 = proPic5;
       this.productOrders = productOrders;
       this.productOrderDetailses = productOrderDetailses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="pro_id", unique=true, nullable=false)
    public Integer getProId() {
        return this.proId;
    }
    
    public void setProId(Integer proId) {
        this.proId = proId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="merchant_id", nullable=false)
    public Merchant getMerchant() {
        return this.merchant;
    }
    
    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="sub_cat_id", nullable=false)
    public SubCategory getSubCategory() {
        return this.subCategory;
    }
    
    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }

    
    @Column(name="pro_name", nullable=false, length=245)
    public String getProName() {
        return this.proName;
    }
    
    public void setProName(String proName) {
        this.proName = proName;
    }

    
    @Column(name="pro_price", nullable=false, precision=22, scale=0)
    public double getProPrice() {
        return this.proPrice;
    }
    
    public void setProPrice(double proPrice) {
        this.proPrice = proPrice;
    }

    
    @Column(name="pro_qty", nullable=false)
    public int getProQty() {
        return this.proQty;
    }
    
    public void setProQty(int proQty) {
        this.proQty = proQty;
    }

    
    @Column(name="pro_desc", nullable=false, length=2000)
    public String getProDesc() {
        return this.proDesc;
    }
    
    public void setProDesc(String proDesc) {
        this.proDesc = proDesc;
    }

    
    @Column(name="pro_pic1", nullable=false, length=100)
    public String getProPic1() {
        return this.proPic1;
    }
    
    public void setProPic1(String proPic1) {
        this.proPic1 = proPic1;
    }

    
    @Column(name="pro_pic2", length=100)
    public String getProPic2() {
        return this.proPic2;
    }
    
    public void setProPic2(String proPic2) {
        this.proPic2 = proPic2;
    }

    
    @Column(name="pro_pic3", length=100)
    public String getProPic3() {
        return this.proPic3;
    }
    
    public void setProPic3(String proPic3) {
        this.proPic3 = proPic3;
    }

    
    @Column(name="pro_pic4", length=100)
    public String getProPic4() {
        return this.proPic4;
    }
    
    public void setProPic4(String proPic4) {
        this.proPic4 = proPic4;
    }

    
    @Column(name="pro_pic5", length=100)
    public String getProPic5() {
        return this.proPic5;
    }
    
    public void setProPic5(String proPic5) {
        this.proPic5 = proPic5;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="product")
    public Set getProductOrders() {
        return this.productOrders;
    }
    
    public void setProductOrders(Set productOrders) {
        this.productOrders = productOrders;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="product")
    public Set getProductOrderDetailses() {
        return this.productOrderDetailses;
    }
    
    public void setProductOrderDetailses(Set productOrderDetailses) {
        this.productOrderDetailses = productOrderDetailses;
    }




}


