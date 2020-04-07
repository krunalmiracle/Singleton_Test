package edu.upc.dsa;

import java.util.ResourceBundle;

public class I18NManager1 {
    //Static reference of the instance
    private static I18NManager1 instance;
    //Package location as in this case it's outside the main directory
    private static final String PACKAGE = "";
    //Resource bundle
    private ResourceBundle ca,es,en,pt;
    //Private Constructor
    private I18NManager1(){
        this.ca = ResourceBundle.getBundle(PACKAGE+"ca");
        this.es = ResourceBundle.getBundle(PACKAGE+"es");
        this.en = ResourceBundle.getBundle(PACKAGE+"en");
        this.pt = ResourceBundle.getBundle(PACKAGE+"pt");
    }
    //Singular static access function for the instance
    public static I18NManager1 getInstance(){
        if (instance==null) instance=new I18NManager1();
        return instance;
    }
    //Pattern function
    public String getText(String language, String key){
        ResourceBundle rs = null;
        if(language.equals("es")) rs=this.es;
        else if (language.equals("en")) rs = this.en;
        else if (language.equals("ca")) rs =this.ca;
        else rs = this.pt;
        return rs.getString(key);
    }
}
