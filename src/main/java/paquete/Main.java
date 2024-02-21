package paquete;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main {

	private JFrame frame;
	private JTextField txtSeVendeOpel;
	private JTextField txtSeVendeCepillo;
	private JTextField txtSeVendePapel;
	private JTextField txtSeVendePelo;
	private JTextField txtSeVendeMesa;
	private JTextField txtSeVendeGafas;
	private JTextField txtSeVendeOvo;
	private JTextField txtSeRecomiendaDucharse;
	private JTextField txtOhUnaGaviota;
	private JTextField txtPuedesRepetirPor;
	private JTextField txtComoComoComo;
	private JTextField txtEtNoAtiende;
	private JTextField txtCopiarTrabajosEsta;
	private JTextField txtEtSeFunde;
	private JTextField txtEtDejaEl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 555, 418);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtSeVendeOpel = new JTextField();
		txtSeVendeOpel.setText("SE VENDE OPEL CORSA");
		txtSeVendeOpel.setBounds(10, 10, 144, 46);
		frame.getContentPane().add(txtSeVendeOpel);
		txtSeVendeOpel.setColumns(10);
		
		txtSeVendeCepillo = new JTextField();
		txtSeVendeCepillo.setText("SE VENDE CEPILLO DIENTES");
		txtSeVendeCepillo.setColumns(10);
		txtSeVendeCepillo.setBounds(178, 10, 144, 46);
		frame.getContentPane().add(txtSeVendeCepillo);
		
		txtSeVendePapel = new JTextField();
		txtSeVendePapel.setText("SE VENDE PAPEL USADO");
		txtSeVendePapel.setColumns(10);
		txtSeVendePapel.setBounds(345, 10, 144, 46);
		frame.getContentPane().add(txtSeVendePapel);
		
		txtSeVendePelo = new JTextField();
		txtSeVendePelo.setText("SE VENDE PELO");
		txtSeVendePelo.setColumns(10);
		txtSeVendePelo.setBounds(10, 87, 144, 46);
		frame.getContentPane().add(txtSeVendePelo);
		
		txtSeVendeMesa = new JTextField();
		txtSeVendeMesa.setText("SE VENDE MESA");
		txtSeVendeMesa.setColumns(10);
		txtSeVendeMesa.setBounds(178, 87, 144, 46);
		frame.getContentPane().add(txtSeVendeMesa);
		
		txtSeVendeGafas = new JTextField();
		txtSeVendeGafas.setText("SE VENDE GAFAS");
		txtSeVendeGafas.setColumns(10);
		txtSeVendeGafas.setBounds(345, 87, 144, 46);
		frame.getContentPane().add(txtSeVendeGafas);
		
		txtSeVendeOvo = new JTextField();
		txtSeVendeOvo.setText("SE VENDE OVO");
		txtSeVendeOvo.setColumns(10);
		txtSeVendeOvo.setBounds(10, 157, 144, 46);
		frame.getContentPane().add(txtSeVendeOvo);
		
		txtSeRecomiendaDucharse = new JTextField();
		txtSeRecomiendaDucharse.setText("SE RECOMIENDA DUCHARSE");
		txtSeRecomiendaDucharse.setColumns(10);
		txtSeRecomiendaDucharse.setBounds(178, 157, 144, 46);
		frame.getContentPane().add(txtSeRecomiendaDucharse);
		
		txtOhUnaGaviota = new JTextField();
		txtOhUnaGaviota.setText("OH UNA GAVIOTA");
		txtOhUnaGaviota.setColumns(10);
		txtOhUnaGaviota.setBounds(345, 157, 144, 46);
		frame.getContentPane().add(txtOhUnaGaviota);
		
		txtPuedesRepetirPor = new JTextField();
		txtPuedesRepetirPor.setText("PUEDES REPETIR POR 23 VEZ");
		txtPuedesRepetirPor.setColumns(10);
		txtPuedesRepetirPor.setBounds(10, 230, 144, 46);
		frame.getContentPane().add(txtPuedesRepetirPor);
		
		txtComoComoComo = new JTextField();
		txtComoComoComo.setText("COMO COMO COMO");
		txtComoComoComo.setColumns(10);
		txtComoComoComo.setBounds(178, 230, 144, 46);
		frame.getContentPane().add(txtComoComoComo);
		
		txtEtNoAtiende = new JTextField();
		txtEtNoAtiende.setText("ET NO ATIENDE");
		txtEtNoAtiende.setColumns(10);
		txtEtNoAtiende.setBounds(345, 230, 144, 46);
		frame.getContentPane().add(txtEtNoAtiende);
		
		txtCopiarTrabajosEsta = new JTextField();
		txtCopiarTrabajosEsta.setText("COPIAR TRABAJOS ESTA FEO");
		txtCopiarTrabajosEsta.setColumns(10);
		txtCopiarTrabajosEsta.setBounds(10, 300, 144, 46);
		frame.getContentPane().add(txtCopiarTrabajosEsta);
		
		txtEtSeFunde = new JTextField();
		txtEtSeFunde.setText("ET SE FUNDE EN EL ASIENTO");
		txtEtSeFunde.setColumns(10);
		txtEtSeFunde.setBounds(178, 300, 144, 46);
		frame.getContentPane().add(txtEtSeFunde);
		
		txtEtDejaEl = new JTextField();
		txtEtDejaEl.setText("ET DEJA EL MOVIL");
		txtEtDejaEl.setColumns(10);
		txtEtDejaEl.setBounds(345, 300, 144, 46);
		frame.getContentPane().add(txtEtDejaEl);
	}
}
