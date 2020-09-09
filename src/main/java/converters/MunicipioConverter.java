
package converters;

import java.util.HashMap;
import java.util.Map;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import rh.modelo.Municipio;

/**
 *
 * @author Ary
 */
@FacesConverter("municipioConverter")
public class MunicipioConverter implements Converter{

    private static Map<String, Municipio> map = new HashMap<String, Municipio>();
    
    @Override
    public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {        
        return map.get(arg2);
    }

    @Override
    public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
    
        if(arg2 instanceof Municipio){
            Municipio mp=(Municipio)arg2;
            map.put(mp.getIdMunicipio()+"", mp);
            return mp.getIdMunicipio()+"";
        }else{
            return "";
        }
    }
    
}
