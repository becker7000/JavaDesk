import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaReciboCFE extends JFrame { // JFrame es como una mesa

    // Atributos de la clase:
    private String titulo; // Título de la ventana
    private JPanel panel; // Panel para acomodar elementos
    private JTextField textoEntrada; // Input de texto
    private JTextArea reporte; // Nos permite imprimir muchas líneas en una ventana
    private double consumo; // Consumo del usuario kWh

    // Métodos:

    // Constructor:
    public VentanaReciboCFE(String titulo, int ancho, int altura){

        this.titulo=titulo;

        // Ajustamos el título
        this.setTitle(titulo);

        // Ajustando el tamaño de la ventana:
        this.setSize(ancho,altura); // Será en píxeles.

        // Definiendo una dimensión
        Dimension dim1 = new Dimension(450,450);

        // Ajustando el tamaño mínimo de la ventana:
        this.setMinimumSize(dim1);

        // Podemos ajustar un lugar especifico de la panatalla donde
        // queremos que aparezca la ventana:
        // this.setLocation(100,100);

        // Ajustamos la ventana para que aparezca en el centro
        // de la pantalla sin importar el tamaño de la patalla
        this.setLocationRelativeTo(null);

        // Ajustamos el color:
        //this.getContentPane().setBackground(new Color(128, 217, 152));

        // Método principal para agregar todos los componentes de la ventana
        iniciarComponentes();

        // Controlamos que el programa termine al cerrar la ventana:
        // HIDE_ON_CLOSE (Oculta la ventana pero el progra sigue)
        // DO_NOTHING_ON_CLOSE (No hace nada al cerrar)
        // DISPOSE_ON_CLOSE (Sigue disponible)
        // EXIT_ON_CLOSE (Cierra el programa al cerrar la ventana)
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    private void iniciarComponentes() {
        colocarPaneles();
        colocarEtiquetas();
        colocarCajasDeTexto();
        colocarBotones();
    }

    public void colocarPaneles() {

        // Inicializamos el panel con el contructor
        panel = new JPanel(); // Es como un mantel

        // Existe un diseño por defecto que Java pone a la ventana.
        panel.setLayout(null); // Desactivamos el diseño que viene por defecto

        // Color de fondo al panel:
        panel.setBackground(new Color(216, 230, 209));

        // Agregando contenido a la ventana a través de un panel
        this.getContentPane().add(panel);

    }

    private void colocarEtiquetas() {

        // Creamos una etiqueta con un mensaje:
        JLabel etiqueta = new JLabel();

        // Ajustamos los permisos de diseño:
        etiqueta.setOpaque(true);

        // Ajustamos el texto que contendrá el JLabel:
        etiqueta.setText("Recibo CFE, consumo de electricidad.");

        // Ajustar el texto dentro del JLabel:
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);

        // Ajustamos el tamaño del componente JLabel etiqueta:
        etiqueta.setSize(350,20);

        // Ajustando el color de la letra:
        etiqueta.setForeground(new Color(34, 101, 143));

        // Creamos una instancia de Fuente:
        Font fuente = new Font("Arial",Font.BOLD,18);

        // Agregando la fuente a mi etiqueta JLabel:
        etiqueta.setFont(fuente);

        // Ajustamos transparencia en el JLabel
        etiqueta.setBackground(null);

        // Ajustando la posición:
        etiqueta.setLocation(50,20);

        // Agregamos el JLabel etiqueta al panel:
        panel.add(etiqueta);

        // --- Agregando una imagen a la deskapp
        ImageIcon imagen_cfe = new ImageIcon("C:\\Users\\Erick\\Documents\\JavaFundamentals\\JavaEscritorio\\Ses1\\cfe.png");
        JLabel imagen = new JLabel(); // Declaramos una etiqueta
        imagen.setBounds(50,40,200,72);
        imagen.setIcon(new ImageIcon(imagen_cfe.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(),Image.SCALE_SMOOTH))); // Agregamos la imagen a la etiqueta
        panel.add(imagen);

    }

    private void colocarCajasDeTexto(){
        textoEntrada = new JTextField();
        textoEntrada.setBounds(50,120,200,50);
        panel.add(textoEntrada);
    }

    private void colocarBotones(){

        // Creando y configurando el botón
        JButton boton = new JButton("Calcular");
        boton.setBounds(50,200,200,50);

        // Ajustamos el color del texto del botón
        boton.setForeground(Color.BLUE); // Puedes ponerle el color que tú quieras

        // Creamos una fuente para el botón
        Font fuenteBtn = new Font("Arial",Font.BOLD,14);

        // Ajustamos la fuente al botón
        boton.setFont(fuenteBtn);

        // Agregamos el botón al panel
        panel.add(boton);

        // --- Creamos un área de texto para visualizar el reporte.
        reporte = new JTextArea();
        reporte.setBounds(50,270,300,100);
        reporte.setForeground(Color.DARK_GRAY);

        // Creamos una fuente
        Font fuenteTxtA = new Font("Arial",Font.PLAIN,12);

        // Agregamos al área de texto
        reporte.setFont(fuenteTxtA);

        // Agregamos el área de texto al panel
        panel.add(reporte);

        // Agregando lógica(comportamiento) al botón por medio de un evento.
        ActionListener click = new ActionListener() {
            @Override // Sobreescribiendo el método actionPerformed
            public void actionPerformed(ActionEvent e) {

                // Obtenemos el consumo que el usuario introduce:
                consumo = Double.parseDouble(textoEntrada.getText());

                // Creamos una instacion de la clase ReciboCFE (nosotros la inventamos)
                ReciboCFE reciboCFE = new ReciboCFE(consumo);

                // Ajusatamos el texto del área de texto:
                reporte.setText(reciboCFE.generarReporte());
            }

        }; // Nota: cuando definimos la sobreescritura de un método usamos ; al final

        // El comportamiento (ActionListener click) se le agrega pero al boton
        boton.addActionListener(click);

    }





}
