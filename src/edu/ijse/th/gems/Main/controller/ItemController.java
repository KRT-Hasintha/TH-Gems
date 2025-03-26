/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.th.gems.Main.controller;

import edu.ijse.th.gems.Main.dto.ItemDto;
import edu.ijse.th.gems.Main.model.ItemModel;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author KASUN    

 */
public class ItemController {
    private  ItemModel itemModel;
    
    public ItemController(){
    itemModel = new ItemModel();
}
    
    public String saveItem(ItemDto dto)throws SQLException, ClassNotFoundException{
        String resp = itemModel.saveItem(dto);
        return resp;
    }
    
    public String updateItem(ItemDto dto)throws SQLException, ClassNotFoundException{
        String resp = itemModel.saveItem(dto);
        return resp;
    }
    
    public String deleteItem(ItemDto dto)throws SQLException, ClassNotFoundException{
        String resp = itemModel.saveItem(dto);
        return resp;
    }
    
    public String searchItem(ItemDto dto)throws SQLException, ClassNotFoundException{
        String resp = itemModel.saveItem(dto);
        return resp;
    }
    
    public ArrayList<ItemDto> getAllItem() throws SQLException, ClassNotFoundException{
        ArrayList<ItemDto> resp = itemModel.getAll();
        return resp;
    }
}
