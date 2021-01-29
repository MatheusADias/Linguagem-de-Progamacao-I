/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company;

/**
 *
 * @author mat_a
 */
public class Editor extends SkilledEmployee {
    private String editType;
    private String softwareUsed;
    
    public String getEditType(){
        return editType;
    }

    public void setEditType(String editType) {
        this.editType = editType;
    }

    public String getSoftwareUsed() {
        return softwareUsed;
    }

    public void setSoftwareUsed(String softwareUsed) {
        this.softwareUsed = softwareUsed;
    } 
}
