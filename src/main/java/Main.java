public class Main {
    private static final double CONST_M_TO_KM = 1.60934;

    public static void main(String[] args) {
        System.out.println("Изменения в одной строке");
        System.out.println("Это приложение для конвертирования миль в километры и километры в мили");
        {double miles = 10;
        double km = Converter_M_to_KM(miles);
        System.out.println("Перевод " + miles + " миль в километры. Результат: " + km + " километров." );}
        double km = 16.0934;
        double miles = Converter_KM_to_M(km);
        System.out.println("Перевод " + km + " километров в мили. Результат: " + miles + " миль." );
    }

    private static double Converter_M_to_KM(double miles){
        return miles * CONST_M_TO_KM;
    }

    private static double Converter_KM_to_M(double kilometers){
        return kilometers/CONST_M_TO_KM;
    }

}
