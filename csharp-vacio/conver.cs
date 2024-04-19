using System.ServiceModel;
using System.Threading.Tasks;

namespace Models{
    [ServiceContract]
    public interface Celcius{

        [OperationContract]
        int celF;

        [OperationContract]
        int fareC;
    {
