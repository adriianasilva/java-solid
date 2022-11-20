package isp;

public interface IRevista extends IItemBiblioteca{
	public String getFrequencia();
	public void setFrequencia(String frequencia);
	
	public int getNumeroPaginas();
	public void setNumeroPaginas(int numeroPaginas);

}
