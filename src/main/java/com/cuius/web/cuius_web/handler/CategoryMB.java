/*
 *  Terrence Takunda Munyunguma [https://github.com/TerrenceTakunda]
 *  Copyright (C) 2019 ttmunyunguma@gmail.com
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as
 *  published by the Free Software Foundation, either version 3 of the
 *  License, or (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 * 
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */
package com.cuius.web.cuius_web.handler;

import com.cuius.web.cuius_web.dao.AddDao;
import com.cuius.web.cuius_web.dao.ListDao;
import com.cuius.web.cuius_web.entity.Category;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author terrence
 */
@Named(value = "categoryMB")
@RequestScoped
public class CategoryMB {

    // ======================================
    // =             Attributes             =
    // ======================================
    
    Category category = new Category();
    private int allCategoriesSize;
    
    /**
     * Creates a new instance of CategoryMB
     */
    public CategoryMB() {
    }

    // ======================================
    // =        Getters and Setters         =
    // ======================================
    
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getAllCategoriesSize() {
        return allCategoriesSize;
    }

    public void setAllCategoriesSize(int allCategoriesSize) {
        this.allCategoriesSize = allCategoriesSize;
    }
    
    // ======================================
    // =        Business Methods            =
    // ======================================
    
    public String addCategory(){
        
        category.setCatName(category.getCatName());
        category.setCatDesc(category.getCatDesc());
        boolean status = new AddDao().addCategory(category);
        if(status)
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Data Saved", ""));
        else
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Data Save Failed!", ""));
        
        return null;
    }
    
    public List<Category> getAllCategories(){
        List<Category> cList = new ListDao().categoryList();
        allCategoriesSize = cList.size();
        return cList;
    }
    
}
