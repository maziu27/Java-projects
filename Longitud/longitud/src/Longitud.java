public class Longitud {
    // variables privadas
    private double cantidad;
    private UnidadLongitud unidad;
    
    // constructor que toma cantidades integer
    public Longitud(int cantidad, UnidadLongitud unidad){
        this.cantidad = cantidad;
        this.unidad = unidad;
    }
    // constructor que toma cantidades dobles
    public Longitud(double cantidad, UnidadLongitud unidad){
        this.cantidad = cantidad;
        this.unidad = unidad;
    }

    // getter para acceder a la cantidad de la longitud
    public double getCantidad(){
        return cantidad;
    }
    // setter para modificar la cantidad de la longitud
    public void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }

    // getter para acceder a la unidad de la longitud
    public UnidadLongitud getUnidad(){
        return unidad;
    }

    // metodo para calcular el valor de una longitud a metros
    public double valorEnMetros(){
        return cantidad * unidad.getFactorConversion();
    }

    // toString para imprimir la cantidad más su abreviatura correspondiente
    @Override
    public String toString() {
        return cantidad + unidad.getAbreviatura();
    }

    // metodo para sumar 2 longitudes (l1 y l2)
    public Longitud add(Longitud l2){
        // declara una variable doble que suma el primer valor (l1) con l2
        // y luego retorna un objeto nuevo con el resultado mas la unidad equivalente
        double sumaMetros = this.valorEnMetros() + l2.valorEnMetros();
        return new Longitud(sumaMetros, UnidadLongitud.metros);
    }

    // metodo para restar 2 longitudes (l1 y l2)
    public Longitud substract(Longitud l2){
        double restaMetros = this.valorEnMetros() - l2.valorEnMetros();
        return new Longitud(restaMetros, UnidadLongitud.metros);
    }

    // metodo para multiplicar 2 longitudes (l1 y l2)
    public Longitud multiply(Longitud l2){
        double multiMetros = this.valorEnMetros() * l2.valorEnMetros();
        return new Longitud(multiMetros, UnidadLongitud.metros);
    }

    // metodo para dividir 2 longitudes (l1 y l2)
    public Longitud divide(Longitud l2){
        double divMetros = this.valorEnMetros() / l2.valorEnMetros();
        return new Longitud(divMetros, UnidadLongitud.metros);
    }

    // metodo para comparar si dos longitudes son iguales, no lo he utilizado al final porque el metodo compareTo ya hace lo mismo
    // public boolean equals(Longitud l2){
    //     return this.valorEnMetros() == l2.valorEnMetros();
    // }

    // metodo para comparar dos longitudes para que te diga si es mayor, menor o igual
    public int compareTo(Longitud l2){
        double thisMetros = this.valorEnMetros();
        double l2Metros = l2.valorEnMetros();
        return Double.compare(thisMetros, l2Metros);
    }
}