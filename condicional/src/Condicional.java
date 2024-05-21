public class Condicional {
    public static void main(String[] args) {
        int nota = 9;

        String resultado = nota >= 7 ? "APROVADO" : nota >= 5 && nota < 7 ? "RECUPERAÇÃO" : "REPROVADO";
        System.out.println(resultado);
    }
}
