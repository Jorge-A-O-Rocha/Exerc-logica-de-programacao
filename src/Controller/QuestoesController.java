package Controller;

import javax.swing.JOptionPane;

public class QuestoesController {
	public QuestoesController() {
		super();
	}

	public void questao1() {
		int indice = 13;
		int soma = 0;
		int k = 0;

		while (k < indice) {
			k += 1;
			soma += k;
		}
		JOptionPane.showMessageDialog(null, "Ao final do processamento, SOMA = " + soma);
	}

	// Verificar Fibonacci
	public boolean questao2(int numero) {
		if (numero < 0) {
			return false;
		}

		int anterior = 0;
		int atual = 1;

		while (atual < numero) {
			int proximo = anterior + atual;
			anterior = atual;
			atual = proximo;

			if (atual == numero) {
				return true;
			}
		}

		return false;
	}

	// series sequenciais
	public void questao3() {

		// a) serie de números ímpares
		int a = -1;
		while (a < 9) {
			a += 2;
		}

		// b) série de x = x * 2
		int b = 2;
		while (b < 128) {
			b *= 2;
		}

		// c) série x = x^2
		int c = 0;
		int i = 0;

		while (c < 49) {
			c = (int) Math.pow(i, 2);
			i += 1;
		}

		// d) série x = x^2 de números pares
		int d = 0;
		int j = 2;

		while (d < 100) {
			d = (int) Math.pow(j, 2);
			j += 2;
		}

		// e) série fibonacci
		int anterior = 0;
		int atualE = 1;

		while (atualE < 13) {
			int proximo = anterior + atualE;
			anterior = atualE;
			atualE = proximo;
		}
		


		// f) série de números que iniciam com a letra "D"
		int l = 0;
		int numD[] = { 2, 10, 12, 16, 17, 18, 19, 200, 201, 202, 203 };
		for (int k : numD) {
			if (k == 200) {
				l = k;
			}
		}
		
		JOptionPane.showMessageDialog(null, "A) " + a + "\nB) " + b + "\nC) " + c + "\nD) " + d + "\nE) " + atualE + "\nF) "+ l);

		
	}
	
	// inverter String
		public String questao5(String str) {
			char[] caracteres = str.toCharArray();
			int tamanho = caracteres.length;

			for (int i = 0; i < tamanho / 2; i++) {
				char aux = caracteres[i];
				caracteres[i] = caracteres[tamanho - i - 1];
				caracteres[tamanho - i - 1] = aux;
			}

			return new String(caracteres);
		}

	public void questao4() {
		// Simulando três interruptores e três lâmpadas
        boolean[] interruptores = new boolean[3];
        boolean[] lampadas = new boolean[3];

        // Primeira ida
        ligarInterruptor(interruptores, 0);
        desligarInterruptor(interruptores, 0);
        ligarInterruptor(interruptores, 1);

        // Segunda ida
        verificarLampadas(interruptores, lampadas);

        // Exibir resultado
        exibirResultado(interruptores, lampadas);

	}
	
	
	public void ligarInterruptor(boolean[] interruptores, int indice) {
        interruptores[indice] = true;
    }

    private void desligarInterruptor(boolean[] interruptores, int indice) {
        interruptores[indice] = false;
    }

    private void verificarLampadas(boolean[] interruptores, boolean[] lampadas) {
        for (int i = 0; i < interruptores.length; i++) {
            if (interruptores[i]) {
                // Se o interruptor está ligado, a lâmpada correspondente está acesa
                lampadas[i] = true;
            }
        }
    }
	
    private void exibirResultado(boolean[] interruptores, boolean[] lampadas) {
        System.out.println("Resultado:");
        for (int i = 0; i < interruptores.length; i++) {
            System.out.println("Interruptor " + (i + 1) + " está conectado à Lâmpada " + (i + 1) +
                    " - Estado: " + (lampadas[i] ? "Acesa" : "Apagada"));
        }
    }

	

}
