package br.metodista.ead.ads1;

/**
 *
 * @author Rafael Guimarães Sakurai
 */
public class ChassiUtil {
  public int obterAno(String chassi, int posicao) {
    if(chassi == null || chassi.trim().length() != 17) {
      throw new IllegalArgumentException("Chassi invalido!");
    }
    if(posicao < 0 || posicao > 17) {
      throw new IllegalArgumentException("Posicao do ANO"
              + " no chassi eh incorreta.");
    }
    return (chassi.toUpperCase().charAt(posicao - 1) - 'A')
            + 2010;
  }
}
