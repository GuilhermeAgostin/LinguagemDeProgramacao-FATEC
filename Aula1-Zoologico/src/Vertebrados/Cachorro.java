package Vertebrados;

public class Cachorro 
{
    private String pelagem;
    private char porte;
    private String raça;
    private char genero;
    private float peso;
    private String cor;
    private int idade;
    private boolean vacina;
    private boolean pedigree;
    
    public String getPelagem() 
    {
        return pelagem;
    }

    public void setPelagem(String pelagem) 
    {
        this.pelagem = pelagem;
    }

    public char getPorte() {
        return porte;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) 
    {
        this.peso = peso; 
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isVacina() {
        return vacina;
    }

    public void setVacina(boolean vacina) {
        this.vacina = vacina;
    }

    public boolean isPedigree() {
        return pedigree;
    }

    public void setPedigree(boolean pedigree) {
        this.pedigree = pedigree;
    }

    public Cachorro (String raça, String cor1, char gen) 
    {
        this.raça = raça;
        cor = cor1;
        this.genero = gen;
    }

    public void latir () 
    {
        System.out.println("Au, au, au");
    }

    public void abanarRabo()
    {
        System.out.println("Abanar, abanar, abanar...");
    }

    public boolean sentar (boolean obd)
    {
        if(obd)
        {
            System.out.println("Abanar");
        }
        else
        {
            System.out.println("Tudo menos sentado");
        }
        return obd;
    }
    
    public static void main(String[] args) 
    {
        Cachorro o1 = new Cachorro("Pitbull", "Branco", 'M'); 
        o1.setIdade(5);
        o1.setPedigree(true);
        System.out.println("O cachorro 1 tem " + o1.getIdade() + " anos e testou " + o1.isPedigree() + " para pedigree.") ;

        Cachorro o2 = new Cachorro("Pastor Alemão", "Bege", 'M');
        o2.latir();
        o2.abanarRabo();

        Cachorro o3 = new Cachorro("Vira lata", "Caramelo", 'F');
        o3.sentar(false); 

        Cachorro o4 = new Cachorro("Vira lata", "Preto", 'F');
        o4.sentar(true);
    }

}
