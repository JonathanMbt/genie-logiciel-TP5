package myPackage;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;


public class GUI  implements ActionListener 
{

	private DossierBancaire m_dossier;
	private JTextField m_saisie_depot;
	private JTextField m_display_solde;
	private JButton m_remunerer;
	private JButton m_retrait;

	// Constructeur
    public GUI(DossierBancaire d)
    {
    	//Dossier
    	m_dossier 			= d;
    	
    	//Element saisie depot
        m_saisie_depot = new JTextField (20);
        m_saisie_depot.addActionListener(this);
        
        //Element declenchement remuneration
        m_remunerer = new JButton("OK");
        m_remunerer.addActionListener(this);
        
        //Element declenchement retrait
        m_retrait = new JButton("OK");
        m_retrait.addActionListener(this);

        
    	//Element affichage solde
        m_display_solde = new JTextField (20);
        m_display_solde.setEditable(false); //Pour eviter d'ecrire
        m_display_solde.setText(Double.toString(m_dossier.getSoldeTotal()));
        
        
        //Initialisation de la fenetre generale
        JFrame frame = new JFrame("Editeur dossier bancaire");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Geometrie de repartition des elements graphiques
        frame.setLayout(new GridLayout(4,2)); //3 lignes and 2 columns
        //First line
        frame.getContentPane().add(new JLabel("Depot"));
        frame.getContentPane().add(m_saisie_depot);
        frame.getContentPane().add(new JLabel("Remunerer"));
        frame.getContentPane().add(m_remunerer);          
        frame.getContentPane().add(new JLabel("Retrait"));
        frame.getContentPane().add(m_retrait);        
        frame.getContentPane().add(new JLabel("Solde"));
        frame.getContentPane().add(m_display_solde);
        frame.pack(); //Causes this Window to be sized to fit the preferred size and layouts of its subcomponents.
        frame.setVisible(true); //Shows this Window
        
    }
    // Callbacks for buttons: dispatch processings
    public void actionPerformed(ActionEvent e)
    {
    	if( e.getSource() == m_saisie_depot )
    	{
    		float depot_value=Float.parseFloat(m_saisie_depot.getText());
    		m_dossier.depot(depot_value);
    		m_saisie_depot.setText("");
    	}
    	if( e.getSource() == m_remunerer )
    	{
    		m_dossier.remunerer();
    	}
    	
    	if( e.getSource() == m_retrait )
    	{
    		float depot_value=Float.parseFloat(m_saisie_depot.getText());
    		m_dossier.retrait(depot_value);
    		m_saisie_depot.setText("");
    	}
    	m_display_solde.setText(Double.toString(m_dossier.getSoldeTotal()));  	
    }
}
