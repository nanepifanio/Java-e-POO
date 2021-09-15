
package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {

    public static void main(String[] args) {
        Toolkit tela = Toolkit.getDefaultToolkit();
        Dimension res = tela.getScreenSize();
        System.out.println("A resolução da sua tela é " + res.width + " X " + res.height);
    }
    
}
