public class Fraccion {
    private int num = 0;
    private int den = 1;

    public Fraccion(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public Fraccion() {

    }

    public Fraccion(int num) {
        this.num = num;
    }

    public Fraccion suma(Fraccion fraccion){
        if(this.den == fraccion.den){
            int totalNum = this.num + fraccion.num;
            int totalDen = this.den + fraccion.den;
            Fraccion fracc1 = new Fraccion(totalNum, totalDen);

            return fracc1;

        }
        int regularDen = this.den * fraccion.den;
        int regularNum = (this.num * fraccion.den) + (this.den * fraccion.num);

        Fraccion fracc1 = new Fraccion(regularNum, regularDen);

        return fracc1;


    }

    public Fraccion restar(Fraccion fraccion){
        if(this.den == fraccion.den){
            int totalNum = this.num - fraccion.num;
            int totalDen = this.den - fraccion.den;

            Fraccion fracc1 = new Fraccion(totalNum, totalDen);

            return fracc1;

        }
        int regularDen = this.den * fraccion.den;
        int regularNum = (this.num * fraccion.den) + (this.den * fraccion.num);

        Fraccion fracc1 = new Fraccion(regularNum, regularDen);

        return fracc1;



    }

    public Fraccion multiplicar(Fraccion fraccion){
        int totalNum = this.num * fraccion.num;
        int totalDen = this.den * fraccion.den;


        Fraccion fracc1 = new Fraccion(totalNum, totalDen);

        return fracc1;
    }

    public Fraccion dividir(Fraccion fraccion){
        int totalNum = this.num * fraccion.den;
        int totalDen = this.den * fraccion.num;



        Fraccion fracc1 = new Fraccion(totalNum, totalDen);

        return fracc1;
    }

    @Override
    public String toString() {
        return num + "/" + den;
    }
}
