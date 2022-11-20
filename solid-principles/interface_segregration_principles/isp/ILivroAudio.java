package isp;

public interface ILivroAudio extends IItemBiblioteca{
	public String getAutor();
	public void setAutor(String autor);
	
	public int getDuracaoEmMinutos();
	
	public void setDuracaoEmMinutos(int duracaoEmMinutos);

}
