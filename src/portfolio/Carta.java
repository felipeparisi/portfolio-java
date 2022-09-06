package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Carta extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblFace;
	private JLabel lblNipe;
	private JLabel lblNipeCentro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Carta dialog = new Carta();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Carta() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Carta.class.getResource("/img/CARTA64.png")));
		getContentPane().setForeground(SystemColor.inactiveCaption);
		getContentPane().setBackground(SystemColor.inactiveCaption);
		setTitle("CARTA");
		setBounds(100, 100, 293, 498);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(SystemColor.menuText));
		panel.setBackground(SystemColor.text);
		panel.setBounds(27, 11, 220, 323);
		getContentPane().add(panel);
		panel.setLayout(null);

		lblFace = new JLabel("");
		lblFace.setFont(new Font("Arial", Font.BOLD, 22));
		lblFace.setHorizontalAlignment(SwingConstants.CENTER);
		lblFace.setBounds(11, 11, 29, 20);
		panel.add(lblFace);

		lblNipe = new JLabel("");
		lblNipe.setHorizontalAlignment(SwingConstants.CENTER);
		lblNipe.setFont(new Font("Arial", Font.BOLD, 32));
		lblNipe.setBounds(7, 34, 33, 30);
		panel.add(lblNipe);

		lblNipeCentro = new JLabel("");
		lblNipeCentro.setFont(new Font("Arial", Font.BOLD, 90));
		lblNipeCentro.setBounds(39, 48, 160, 250);
		panel.add(lblNipeCentro);

		JButton btnNewButton = new JButton("Carta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sortearCarta();
			}
		});
		btnNewButton.setBounds(37, 344, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnNewButton_1.setBounds(147, 345, 85, 21);
		getContentPane().add(btnNewButton_1);

	}// Fim do construtor

	void sortearCarta() {
		//                  0    1    2    3
		String[] nipes = { "♥", "♦", "♣", "♠" };
		//                  0    1    2    3    4    5    6    7    8    9     10   11   12    13
		String[] faces = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "JK" };
		Random carta = new Random();
		int indiceFace = carta.nextInt(faces.length);
		int indiceNipes = carta.nextInt(nipes.length);
		//exibir cartas
		lblFace.setText(faces[indiceFace]);
		lblNipe.setText(nipes[indiceNipes]);
		
		//trocar a cor
		if (indiceNipes == 0 || indiceNipes == 1) {
			lblFace.setForeground(Color.RED);
			lblNipe.setForeground(Color.RED);
			lblNipeCentro.setForeground(Color.RED);
		} else {
			lblFace.setForeground(Color.BLACK);
			lblNipe.setForeground(Color.BLACK);
			lblNipeCentro.setForeground(Color.BLACK);
		}
		// EXIBIR IMAGENS VALETE DAMA E REI
		
		if(indiceFace == 10) {
			lblNipeCentro.setIcon(new ImageIcon(Carta.class.getResource("/img/valete.png")));
		}else {
			lblNipeCentro.setIcon(null);
			lblNipeCentro.setText("  " + nipes[indiceNipes]);
		}if (indiceFace == 11) {
			lblNipeCentro.setIcon(new ImageIcon(Carta.class.getResource("/img/dama.png")));
		}else if (indiceFace == 12){
			lblNipeCentro.setIcon(new ImageIcon(Carta.class.getResource("/img/rei.png")));
		}if (indiceFace == 13){
			lblNipeCentro.setIcon(new ImageIcon(Carta.class.getResource("/img/Joker.PNG")));
			lblFace.setText(null);
			lblNipe.setText(null);
		}
		
	}
	void limpar() {
		lblNipeCentro.setIcon(null);
		lblNipeCentro.setText(null);
		lblNipe.setText(null);
		lblFace.setText(null);
	}
	
}// Fim do código
