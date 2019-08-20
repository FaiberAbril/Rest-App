
package com.mycompany.resp.api;

import java.util.ArrayList;
import java.util.List;


public class datosRepository {
    
    static List<datos> dt;
    
    public datosRepository() {
      dt = new ArrayList<>();
     
        datos a1 = new datos();
        a1.setName("faiber");
        a1.setPoints(1);
        
        datos a2 = new datos();
        a2.setName("adrian");
        a2.setPoints(2);
        
        dt.add(a1);
        dt.add(a2);
    }

  
    
    
    public List<datos> getdatoslista(){
          return dt;
    }
    
    
    
    
    public datos getdatounidoc(int da) {
        datos dr ;
 System.out.println("desde repository" + da);
        try {
            for (int i = 0; i < dt.size(); i++) {
                if (dt.get(i).getPoints() == da) {
                    dr = new datos();
                    dr.setName(dt.get(i).getName());
                    dr.setPoints(dt.get(i).getPoints());

                    return dr;
                }
            }

        } catch (Exception e) {
            System.out.println("dat" + e.getMessage());

        }
        return null;
    }

    
    
    
    public void crear(datos a) {
        dt.add(a);
    }
    
    
}
