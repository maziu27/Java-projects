public enum UnidadLongitud {
   //establece las abreviaturas y las unidades para el factor de conversion
   metros("m",1.0),
   pulgadas("in", 0.0254),
   pies("ft", 0.3048),
   yardas("yd",0.9144);
   
   // declara las variables privadas para el enumerado
   private String abreviatura;
   private double factorConversion;

   // constructor para el enum
   UnidadLongitud(String abreviatura, double factorConversion){
    this.abreviatura = abreviatura;
    this.factorConversion = factorConversion;
   }
   
   // getters que retornan la abreviatura y el factor de conversion para cada valor del enum
   public String getAbreviatura(){
    return abreviatura;
   }

   public double getFactorConversion(){
    return factorConversion;
   }
}
