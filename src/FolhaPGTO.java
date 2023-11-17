public class FolhaPGTO {
    public static void main (String args[]) {
        Mensalista men1, men2;
        Horista hora1, hora2;

        //empregados mensalistas
        men1 = new Mensalista ("Jose", "Rua abc", "Junior");
        men1.calcularSalario();
        men1.calcularInss();
        men1.print();

        men2 = new Mensalista("Ana", "Rua sem  fim", "Senior");
        men2.calcularSalario();
        men2.calcularInss();
        men2.print();

        //Empregados horistas

        hora1 = new Horista("Carlos", "Rua xyz", 20);
        hora1.calcularSalario();
        hora1.print();

        hora2 = new Horista("Cristina", "Rua  do centro", 100);
        hora2.calcularSalario();
        hora2.print();
    }
}