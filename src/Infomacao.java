public class Infomacao {

    // 8 bits (2 vezes)
    public byte codigoArea = 34;
    public byte codigoArea2 = 99;

    // 16 bits
    public short idadeCidade = 119;

    // 32 bits
    public int populacaoCidade = 105255;

    // 64 bits
    public long telefone = 992139865;

    // 32 bits
    public float salario = 3000.50f;

    // 64 bits
    public double pi = 3.14159265358979323846264338327950288419716939937510582097494459230781640628620899;

    // 16 bits (23 vezes, alfabeto antes de 2009 não continha 'K', 'W', 'Y')
    public char[] alfabetoDesatualizado = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'L', 'M', 'N', 'O', 'P',
            'Q', 'R', 'S', 'T', 'U', 'V', 'X', 'Z' };

    // 1 bit (8 vezes)
    public boolean cidadeHabitavel = true;
    public boolean temCampoFutebol = true;
    public boolean temHospital = true;
    public boolean temAcademia = true;
    public boolean temBaseNaval = false;
    public boolean temCovid = true;
    public boolean temVacina = false;
    public boolean codigoComplex = false;

    // Soma total = 600 bits
}
