package isp;

import java.time.LocalDateTime;

public interface IEmprestavel extends IItemBiblioteca{

	public void emprestar(String usuarioEmprestimo);
	public void devolver();
	public LocalDateTime getDataDevolver();
	 
	public int getDuracaoEmprestimoEmDias();
	public void setDuracaoEmprestimoEmDias(int duracaoEmprestimoEmDias);

	public String getUsuarioEmprestimo();
	public void setUsuarioEmprestimo(String usuarioEmprestimo);

	public LocalDateTime getDataEmprestimo();
	public void setDataEmprestimo(LocalDateTime dataEmprestimo);

}
