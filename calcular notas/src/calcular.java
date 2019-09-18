import javax.swing.JOptionPane;

public class calcular {

	public static void main(String[] args) {

		double nac, ps, am, media, media1S, mediafinal, faltan;
		
		media1S = Double.parseDouble(JOptionPane.showInputDialog("Nota final do 1°sem:"));
		
		nac = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da maior NAC:"));
		nac = nac * 0.2;
		//JOptionPane.showMessageDialog(null, "nota nac: " + nac);
		faltan= media1S+nac;
		JOptionPane.showMessageDialog(null, "nota sem PS e AM: " + faltan );
	
		am = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do projeto AM:"));
		am = am * 0.3;
		//JOptionPane.showMessageDialog(null, "Projeto AM: " + am);
		
		ps = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da PS:"));
		ps = ps / 2;
		//JOptionPane.showMessageDialog(null, "nota PS: " + ps);
		
		media = am + ps + nac;
		JOptionPane.showMessageDialog(null, "media final: " + media );
		
		
		mediafinal = media + media1S;
		if (mediafinal <12) {
			JOptionPane.showMessageDialog(null, "REPROVADO: " + mediafinal );
		}else 
			JOptionPane.showMessageDialog(null, "APROVADO: " + mediafinal );
	}

}
