package vertebrados;

public class Cachorro 
{
	private String Pelagem;
	private char Porte;
	private String Raca;
	private char Genero;
	public float Peso;
	private String Cor;
	private int Idade;
	
	public String GetPelagem() 
	{
		System.out.println("Seu tipo de pelagem é: " + Pelagem);
		return Pelagem;
	}

	public void SetPelagem(String Pelagem) 
	{
		this.Pelagem = Pelagem;
	}

	public void GetPorte() 
	{
		int Peso = Math.round(this.Peso);
		
		if(Peso < 10)
		{
			System.out.println("Peso de " + this.Peso + "Kg" + " portanto ele é de pequeno porte"); 
		}
		else if(Peso < 25)
		{
			System.out.println("Peso de " + this.Peso + "Kg" + " portanto ele é de médio porte"); 
		}
		else if(Peso > 45)
		{
			System.out.println("Peso de " + this.Peso + "Kg" + " portanto ele é de grande porte"); 
		}
	}

	public float GetPeso() 
	{
		return Peso;
	}

	public void SetPeso(float p) 
	{
		Peso = p;
	}

	public int GetIdade() 
	{
		return Idade;
	}

	public void SetIdade(int Idade) 
	{
		System.out.println("O cachorro tem " + (this.Idade = Idade) + " anos");
	}

	public String GetCor()
	{
		return this.Cor;
	}
	
	public Cachorro(String Raca, String Cor1, char gen)
	{
		this.Raca = Raca;
		Cor1 = Cor;
		this.Genero = gen;
	}
	
	public void Latir(String Dog)
	{
		System.out.println("Au, au, au " + " => " + Dog);
	}
	
	public void AbanarRabo(String Dog)
	{
		System.out.println("Abanar,abanar, abanar..." + " => " + Dog);
	}
	
	public boolean Sentar(boolean obd, String Dog)
	{
		if (obd) 
		{
			System.out.println("Sentado" + " => " + Dog);
		}
		else
		{
			System.out.println("Tudo menos sentado" + " => " + Dog);
		}
		return obd;
	}

	public void Separacao()
	{
		System.out.println("\n**************************************************************************************\n");
	}
 
}
