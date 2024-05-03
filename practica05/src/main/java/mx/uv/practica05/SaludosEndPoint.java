package mx.uv.practica05;

import mx.uv.t4is.saludos.SaludarRequest;
import mx.uv.t4is.saludos.SaludarResponse;


@EndPoint
public class SaludosEndPoint{
    @PayloadRoot (localPart = "SaludarRequest", namespace= "t4is.uv.mx/saludos")
    @Responsepayload
    public SaludarResponse saludos(@RequestPayload String peticion){
        System.out.printls("hola "+peticion.getNombre());
        SaludarResponse respuesta = new SaludarResponse();
        respuesta.setSaludo("hola"+peticion.getNombre());
        return respuesta;
    
    }
}