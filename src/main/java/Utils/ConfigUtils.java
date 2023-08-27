package Utils;

import java.util.Properties;

public class ConfigUtils {
   private Properties properties;

private static ConfigUtils configUtils;
private ConfigUtils(){
    String env = System.getProperty("env" , "production");
    switch (env){
        case "PRODUCTION":
            properties = PropertiesUtils.loadProperties("D:\\Mohannad\\Projects\\Go-Manager\\src\\test\\java\\Go_Manager_WebApplication\\config\\production.properties");
break;

        default:
            throw new RuntimeException("Enviroment not supported");
    }

}
public static ConfigUtils getInstance(){
    if (configUtils == null){
        configUtils=new ConfigUtils();
    }
    return configUtils;
}
public String getEmail(){
    String prop = properties.getProperty("email");
    if(prop!= null)return prop;
    throw new RuntimeException("Could not find email in prop");
}
    public String getPassword(){
        String prop = properties.getProperty("password");
        if(prop!= null)return prop;
        throw new RuntimeException("Could not find password in prop");
    }

}
