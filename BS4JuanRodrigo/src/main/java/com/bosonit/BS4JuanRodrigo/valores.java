package com.bosonit.BS4JuanRodrigo;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties (prefix = "valor")
@Component
public class valores {

    private String var1;
    private String Myvar2;
    private String var3;

  /*  public valores(String var1, String myvar2, String var3) {
        this.var1 = var1;
        Myvar2 = myvar2;
        this.var3 = var3;*/


//    }

    /*public String getVar1() {
        return var1;
    }

    public void setVar1(String var1) {
        this.var1 = var1;
    }

    public String getMyvar2() {
        return Myvar2;
    }

    public void setMyvar2(String myvar2) {
        Myvar2 = myvar2;
    }

    public String getVar3() {
        return var3;
    }

    public void setVar3(String var3) {
        this.var3 = var3;
    }

    @Override
    public String toString(){
        return "Valor de var1 es " + var1 + ", Valor de MyVAR2 es " + Myvar2 + ", Valor de VAR3 es " + var3;
    }
*/
}
