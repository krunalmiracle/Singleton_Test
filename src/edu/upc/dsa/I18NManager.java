package edu.upc.dsa;

import java.util.ResourceBundle;

public class I18NManager {
    //Static reference of the instance
    private static I18NManager instance;
    //Singular static access function for the instance
    public static I18NManager getInstance(){
        if (instance==null) instance=new I18NManager();
        return instance;
    }
    //Pattern function
    public String getText(String language, String key){
        ResourceBundle resourcebundle = ResourceBundle.getBundle(language);
        return resourcebundle.getString(key);
    }
}
