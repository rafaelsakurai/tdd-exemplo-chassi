package br.metodista.ead.ads1;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rafael Guimarães Sakurai
 */
public class ChassiUtilTest {
  private ChassiUtil util = null;

  @Before
  public void inicializar() {
    util = new ChassiUtil();
  }

  @Test
  public void testarAnoAChassi() {
    assertEquals(util.obterAno("9BP17164GA0000001", 10), 2010);
  }

  @Test
  public void testarAnoAMinusculoChassi() {
    assertEquals(util.obterAno("9bp17164ga0000001", 10), 2010);
  }

  @Test
  public void testarAnoBChassi() {
    assertEquals(util.obterAno("9BP17164GB0000001", 10), 2011);
  }

  @Test
  public void testarAnoCChassi() {
    assertEquals(util.obterAno("9BP17164GC0000001", 10), 2012);
  }

  @Test
  public void testarAnoDChassi() {
    assertEquals(util.obterAno("9BP17164GD0000001", 10), 2013);
  }

  @Test(expected=IllegalArgumentException.class)
  public void testarChassiInvalido() {
    assertEquals(util.obterAno("abc", 10), 0);
  }

  @Test(expected=IllegalArgumentException.class)
  public void testarPosicaoChassiInvalida() {
    assertEquals(util.obterAno("9BP17164GE0000001", -5), 2014);
  }
}
