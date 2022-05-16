/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myapp.gui;

import com.codename1.ui.Button;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.layouts.BoxLayout;
import com.mycompany.myapp.entities.Usedproduct;
import com.mycompany.myapp.entities.Category;

/**
 *
 * @author bhk
 */
public class HomeForm extends Form{
Form current;
    public HomeForm() {
        current=this; //Back 
        setTitle("Home");
        setLayout(BoxLayout.y());
        
        add(new Label("Choose an option"));
        Button btnAddLivreur = new Button("Add Usedproduct");
        Button btnListLivreurs = new Button("List Usedproduct");
        Button btnAddLivraison = new Button("Add Category");
        Button btnListLivraisons = new Button("List Category");
        Button btnListMap = new Button("Map");
        
        btnAddLivreur.addActionListener(e-> new AddUsedproductForm(current).show());
        
        btnListLivreurs.addActionListener(e-> new ListUsedproductForm(current).show());
        addAll(btnAddLivreur,btnListLivreurs);
       
        
        btnAddLivraison.addActionListener(e-> new AddCategoryForm(current).show());
        
        btnListLivraisons.addActionListener(e-> new ListCategoryForm(current).show());
          btnListMap.addActionListener(e-> new MapForm(current));
        addAll(btnAddLivraison,btnListLivraisons,btnListMap);
        
        
    }

    HomeForm(Usedproduct p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
