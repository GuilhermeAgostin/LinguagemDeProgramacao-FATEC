package vertebrados;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class TesteCachorro 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource") 
		
		Scanner lerTec = new Scanner(System.in); 
        
		int fim =0; 
		
		do 
		{
			System.out.println("\nDigite a raça e a cor do cachorro");
			String r = lerTec.next(); 

			Cachorro Dog1 = new Cachorro(r,lerTec.next(),'M');
			System.out.println("Qual a idade dele?");
			Dog1.SetIdade(lerTec.nextInt());
			Dog1.SetPelagem("Curta");
			Dog1.GetPelagem();
			Dog1.Separacao();
			
			Cachorro Dog2 = new Cachorro(JOptionPane.showInputDialog("Raça do Dog2?"),"Preto",'M');
 			Dog2.Latir("Dog2");
			Dog2.SetIdade(Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do Dog2?")));
			Dog2.SetPeso(Float.parseFloat(JOptionPane.showInputDialog("Qual o peso dele?") + "f")); 
			Dog2.GetPorte();
			Dog2.Separacao();
			Dog2.GetCor();
			
			Cachorro Dog3 = new Cachorro("Vira lata","Caramelo",'F');
			Dog3.Sentar(false, "Dog3");
			Dog3.SetIdade(3);
			Dog3.GetPeso();
			Dog3.SetPelagem("Longa");
			Dog3.GetPelagem();
			Dog3.Separacao();

			Cachorro Dog4 = new Cachorro("Poodle","Branco",'F');
			Dog4.Sentar(true, "Dog4");
			Dog4.Latir("Dog4");
			Dog4.AbanarRabo("Dog4");
			Dog4.Separacao();
			
			System.out.println("Idade do Dog1: " +Dog1.GetIdade());
			System.out.println("\nIdade do Dog2: " +Dog2.GetIdade());

			JOptionPane.showMessageDialog(null, Dog3.GetIdade(), "Idade do Cachorro",1);

			System.out.println("\nVocê quer continuarl? 1-não 0-sim ");
			fim = lerTec.nextInt();

	    } while (fim==0);

	}

}
