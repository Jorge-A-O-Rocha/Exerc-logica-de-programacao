package Boundary;

import javax.swing.JOptionPane;

import Controller.QuestoesController;

public class Main {

	public static void main(String[] args) {
		QuestoesController qc = new QuestoesController();
		
		
int opc = 0 ;
        
        while (opc!=9){
            opc = Integer.parseInt(JOptionPane.showInputDialog(" 1º questão  \n 2º questão \n 3º questão \n 4º questão \n 5º questão \n 9 - Finaliza"));
            switch (opc){
                case 1: 
                	qc.questao1();
                    break;
                case 2:
                	int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para conferir se está na sequência de Fibonacci "));
            		JOptionPane.showMessageDialog(null,qc.questao2(x));
            		
                    break;
                case 3: 
            		qc.questao3();
                    break;
                case 4:
            		qc.questao4();
                    break;
                case 5:
                	String string = JOptionPane.showInputDialog("Digite o que deseja inverter ");
            		JOptionPane.showMessageDialog(null,qc.questao5(string));
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null,"Programa finalizado");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção Inválida");
            } 
            
        }  

		

		

		
	
		
		
		
	}

}
