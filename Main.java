/*
 * La aplicacion te hace una preguant aleatoria de las que se tienen guardadas y cuando el usuario le da enter. Se muestra la respuesta
 */

import javax.swing.*; 
import java.util.ArrayList;
import java.util.Random;

public class Main {
	private static JFrame f = new JFrame();//creating instance of JFrame 
	private static JButton buttonShowResponse = new JButton("Show response");//creating instance of JButton  
	// private static JTextField tf = new JTextField();
	private static JLabel labelQuestion = new JLabel();
	private static JLabel labelResponse = new JLabel();

	private static final Random random = new Random();
	private static int indicePregunta;

	private static void setRandomIndex(int min, int max) {
		Main.indicePregunta = random.nextInt(max - min) + min;
	}

	private static int getRandomIndex() {
		return Main.indicePregunta;
	}
	
	public static void main(String[] args) {
		// Hashtable<String, String> hashtable = new Hashtable<>();
		// add content to textfield and add to frame
		
    ArrayList<String> preguntas = new ArrayList<String>();
    ArrayList<String> respuestas = new ArrayList<String>();

    preguntas.add("¿Que es una funcion matematica?");
    respuestas.add("una funcion matematica es una relacion entre dos conjuntos que asigna a cada elemento del primer conjunto exactamente un elemento del segundo conjunto");

		preguntas.add("¿Que es el domio y el rango de una funcion?");
		respuestas.add("El domio son las entradas de la funcion en el eje x sin repetir ni generar una indeterminacion y el rango es el conjunto de salidas de la funcion en el eje y");


		labelQuestion.setBounds(50, 50, 300, 100);
		Main.setRandomIndex(0, preguntas.size());
		labelQuestion.setText(preguntas.get(Main.getRandomIndex()));

		labelResponse.setBounds(50, 100, 300, 100);

		buttonShowResponse.setBounds(50, 200, 150, 30);//x axis, y axis, width, height
		buttonShowResponse.addActionListener(e -> {
			labelResponse.setText(respuestas.get(Main.getRandomIndex()));
		});

		
		f.add(labelQuestion);
		f.add(labelResponse);
		f.add(buttonShowResponse);
		f.setSize(400,500);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible 
	}
}
