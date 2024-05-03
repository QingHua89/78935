using conver;
using System;
using System.Threading.Tasks;
using System.Xml.Linq;

namespace Server
{
    public class Servicio : conver
    {
        public int gradosC(int gC){
	  convertirAFaren=(gC+1.8)x32;
	  return convertirAFaren;
	}
		
