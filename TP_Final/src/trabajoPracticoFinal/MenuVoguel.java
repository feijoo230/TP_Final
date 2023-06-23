package trabajoPracticoFinal;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import javax.swing.JTable;
import javax.swing.border.Border;

import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;

import contenedores.*;

public class MenuVoguel extends javax.swing.JFrame {
    
	//Almacenamiento de datos para enviar al otro Jframe

    ArrayList<String> ListProces = new ArrayList<String>();
    ArrayList<Integer> ListMultiplications = new ArrayList<Integer>();
    ArrayList<Integer> MatrixData = new ArrayList<Integer>();

    VentanaResultados Ventana2 = new VentanaResultados();

    public MenuVoguel() {
        initComponents();
        this.setTitle("Metodo Vogel");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtFilas = new javax.swing.JTextField();
        txtColumnas = new javax.swing.JTextField();
        BtnCrear = new javax.swing.JButton();
        BtnVer = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnGuardar = new javax.swing.JButton();
        BtnOpciones = new javax.swing.JButton();
        BtnAbrir = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaProceso = new javax.swing.JTable();
        BtnProceso = new javax.swing.JButton();
        TxtMensajes = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnResultados = new javax.swing.JButton();
        BtnReiniciarProcesos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jScrollPane1.setName("tableValues"); // NOI18N

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setCellSelectionEnabled(true);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setName("tableValues"); // NOI18N
        jTable1.setUpdateSelectionOnSort(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getAccessibleContext().setAccessibleName("");
        jTable1.getAccessibleContext().setAccessibleDescription("");

        BtnCrear.setBackground(new java.awt.Color(241, 196, 15));
        BtnCrear.setForeground(Color.BLACK);
        Border blackline = BorderFactory.createLineBorder(Color.black);
        BtnCrear.setBorder(blackline);
        BtnCrear.setText("Crear");
        BtnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        BtnVer.setBackground(new java.awt.Color(238, 14, 14  ));
        BtnVer.setText("Resolver");
        BtnVer.setBorder(blackline);
        BtnVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnVerMouseClicked(evt);
            }
        });
        BtnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVerActionPerformed(evt);
            }
        });

        jLabel2.setText("Filas: ");

        jLabel3.setText("Columnas: ");

        BtnGuardar.setBackground(new java.awt.Color(109, 177, 130));
        BtnGuardar.setText("Guardar");
        BtnGuardar.setBorder(blackline);
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        BtnOpciones.setBackground(new java.awt.Color(19, 210, 0));
        BtnOpciones.setText("Opciones");
        BtnVer.setBorder(blackline);
        BtnOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOpcionesActionPerformed(evt);
            }
        });

        BtnAbrir.setBackground(new java.awt.Color(204, 204, 204));
        BtnAbrir.setText("Abrir");
        BtnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAbrirActionPerformed(evt);
            }
        });

        BtnCancelar.setBackground(new java.awt.Color(255, 51, 51));
        BtnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        TablaProceso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TablaProceso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TablaProceso);

        BtnProceso.setBackground(new java.awt.Color(102, 153, 255));
        BtnProceso.setForeground(new java.awt.Color(255, 255, 255));
        BtnProceso.setText("Siguiente");
        BtnProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProcesoActionPerformed(evt);
            }
        });

        TxtMensajes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TxtMensajes.setForeground(new java.awt.Color(0, 51, 204));

        jPanel1.setBackground(new java.awt.Color(117, 0, 148));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("METODO DE VOGUEL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        BtnResultados.setBackground(new java.awt.Color(153, 255, 153));
        BtnResultados.setText("Resultado");
        BtnResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResultadosActionPerformed(evt);
            }
        });

        BtnReiniciarProcesos.setBackground(new java.awt.Color(255, 255, 102));
        BtnReiniciarProcesos.setText("Reiniciar");
        BtnReiniciarProcesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReiniciarProcesosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnProceso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(BtnReiniciarProcesos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TxtMensajes, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 405, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addComponent(BtnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFilas)
                            .addComponent(BtnVer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(txtColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(1, 1, 1)
                        .addComponent(txtFilas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(BtnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(BtnProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnResultados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnReiniciarProcesos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtMensajes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    public int[] MezclaDirecta(int[] arreglo) {
        int i, j, k;
        if (arreglo.length > 1) {

            int nElementosIzq = arreglo.length / 2;
            int nElementosDer = arreglo.length - nElementosIzq;
            int arregloIzq[] = new int[nElementosIzq];
            int arregloDer[] = new int[nElementosDer];

            //copiando los elementos de parte primera al areglo izquierdo
            for (i = 0; i < nElementosIzq; i++) {
                arregloIzq[i] = arreglo[i];
            }

            for (i = nElementosIzq; i < nElementosIzq + nElementosDer; i++) {
                arregloDer[i - nElementosIzq] = arreglo[i];
            }

            //Recursividad
            arregloIzq = MezclaDirecta(arregloIzq);
            arregloDer = MezclaDirecta(arregloDer);

            i = 0;
            j = 0;
            k = 0;

            while (arregloIzq.length != j && arregloDer.length != k) {
                if (arregloIzq[j] < arregloDer[k]) {
                    arreglo[i] = arregloIzq[j];
                    i++;
                    j++;
                } else {
                    arreglo[i] = arregloDer[k];
                    i++;
                    k++;
                }
            }

            //arreglo final
            while (arregloIzq.length != j) {
                arreglo[i] = arregloIzq[j];
                i++;
                j++;
            }
            while (arregloDer.length != k) {
                arreglo[i] = arregloDer[k];
                i++;
                k++;
            }
        }
        return arreglo;
    }

    /*
    == BUSCA EL INDICE DE UN DATO DENTRO CUALQUIER ARREGLO, SI NO ENCUENTRA EL
    DATO RETORNA -1.
     */
    public static int GetIndice(int vector[], int dato) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == dato) {
                return i;
            }
        }
        return -1;
    }

    /*
    == GUARDA LOS DATOS EN UNA MATRIZ PARA SU MANIPULACION.
     */
    public void GuardarDatosEnMatriz(int[][] matriz, JTable tabla) {
        for (int i = 0; i < tabla.getRowCount(); i++) {
            for (int x = 1; x < tabla.getColumnCount(); x++) {
                matriz[i][x - 1] = Integer.parseInt(tabla.getValueAt(i, x).toString());
            }
        }
    }

    public void DatosArrayList(JTable tabla) {
        int c = 0;
        for (int i = 0; i < tabla.getRowCount(); i++) {
            for (int x = 1; x < tabla.getColumnCount(); x++) {
                MatrixData.add(Integer.parseInt(tabla.getValueAt(i, x).toString()));
                System.out.print(MatrixData.get(c) + " ");
                c++;
            }
             System.out.println();
        }
    }

    public int[][] GuardarDatosEnMatrizConFila(int[][] matriz, JTable tabla, int valor) {
        int row = tabla.getRowCount() + 1; //
        int col = tabla.getColumnCount(); //
        int c = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (i == row - 2) {
                    matriz[i][j - 1] = 0;
                    //System.out.print(matriz[i][j - 1] + " ");

                } else {
                    matriz[i][j - 1] = MatrixData.get(c);
                    // System.out.print(matriz[i][j - 1] + " ");
                    c++;
                }
            }
            // System.out.println();
        }
        matriz[row - 2][col - 2] = valor;
        return matriz;
    }

    public int[][] GuardarDatosEnMatrizConColumna(int[][] matriz, JTable tabla, int valor) {
        int row = tabla.getRowCount(); //
        int col = tabla.getColumnCount() + 1; //
        int c = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (j == col - 2) {
                    matriz[i][j - 1] = 0;
                    //System.out.print(matriz[i][j - 1] + " ");

                } else {
                    matriz[i][j - 1] = MatrixData.get(c);
                    //System.out.print(matriz[i][j - 1] + " ");
                    c++;
                }
            }
            //System.out.println();
        }
        matriz[row - 1][col - 3] = valor;
        return matriz;
    }


    /*
    == GUARDA LOS DATOS DE LA TABLA EN UN TEXTO MEDIANTE SU ARREGLO CON SUS VALORES.
     */
    public static void GuardarDatosTxt(int[][] matriz, ColaArr cola) {
        try {
            JFileChooser file = new JFileChooser();
            file.showSaveDialog(null);
            File guarda = file.getSelectedFile();
            if (guarda != null) {
                File archivo = new File(guarda + ".txt");
                FileWriter escribir = new FileWriter(archivo, true);

                // Agregamos los elementos de la matriz a la cola
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        cola.meter(matriz[i][j]);
                    }
                }

                // Escribimos en el archivo con el m�todo write
                while (!cola.estaVacia()) {
                    Object elemento = cola.sacar();
                    escribir.write(elemento.toString() + " ");
                }

                escribir.close();
                JOptionPane.showMessageDialog(null, "Guardado correctamente");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar");
        }
    }
    /*
    ==ABRE EL ARCHIVO Y A LA VEZ PASA LA INFORMACION EN UN ARREGLO STRING.
     */
    public static String[] AbrirArchivo(PilaArr pila) {
        String[] parts = new String[0];
        try {
            JFileChooser file = new JFileChooser();
            file.showOpenDialog(null);
            File abre = file.getSelectedFile();
            FileReader ficha = new FileReader(abre);
            BufferedReader dato = new BufferedReader(ficha);

            String linea;

            while ((linea = dato.readLine()) != null) {
                parts = linea.split(" ");
                for (String part : parts) {
                    pila.meter(part);
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Archivo no encontrado");
        }
        return parts;
    }

    /*
    == LLENA LA TABLA PRINCIPAL CON LOS VALORES DE LA MATRIZ.
     */
    public void LlenarTabla(String[] Datos) {
        int c = 0;
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            for (int x = 1; x < jTable1.getColumnCount(); x++) {
                jTable1.setValueAt(Datos[c], i, x);
                c++;
            }
        }
    }

    /*
    == DEVUELVE UN ARREGLO DONDE ESTAN ALMACENADOS SOLO LA DISPONIBILIDAD
     */
    public int[] Disponibilidad(JTable tabla) {
        int fila = tabla.getRowCount() - 1;
        int col = tabla.getColumnCount() - 1;
        int[] Disp = new int[fila];

        for (int i = 0; i < fila; i++) {
            Disp[i] = Integer.parseInt(tabla.getValueAt(i, col).toString());
        }
        return Disp;
    }

    /*
    == DEVUELVE UN ARREGLO DONDE ESTAN ALMACENADOS SOLO LA DEMANDA
     */
    public int[] Demanda(JTable tabla) {
        int fila = tabla.getRowCount() - 1;
        int col = tabla.getColumnCount() - 1;
        int[] demanda = new int[col - 1];

        for (int i = 1; i < col; i++) {
            demanda[i - 1] = Integer.parseInt(tabla.getValueAt(fila, i).toString());
        }
        return demanda;
    }

    /*
    == RETORNA LA MULTA DE LAS FILAS TOMANDO LOS VALORES MAS PEQUEnOS.
     */
    public int getMulta(int sortRow[]) {
        MezclaDirecta(sortRow);
        int dato = 0;
        if (sortRow.length > 1) { //cuando existe mas de un dato en el arreglo
            dato = sortRow[1] - sortRow[0];
        } else if (sortRow.length == 1) { //Cuando solo una dato
            dato = sortRow[0];
        }
        return dato;
    }

    /*
     == DEVUELVE UNA MATRIZ CON LAS MULTAS DE LAS FILAS PARA LA DISPONIBILIDAD
     */
    public int[] MultaDisponibilidad(JTable tabla) {
        int row = tabla.getRowCount(); //numero de filas
        int col = tabla.getColumnCount() - 1; //numeros de columnas
        int[][] DatosMatriz = new int[row][col]; //crea una matriz dimensional

        int[] MultaDisp = new int[tabla.getRowCount() - 1];

        GuardarDatosEnMatriz(DatosMatriz, tabla); //Los guarda en un la matriz
        int[] Temp = new int[col - 1]; //crea un arreglo temporal para guardar los datos de cada fila
        for (int i = 0; i < row - 1; i++) {
            for (int j = 0; j < col - 1; j++) {
                Temp[j] = DatosMatriz[i][j]; //Guarda cada fila de la tabla en Temp
            }
            MultaDisp[i] = getMulta(Temp); //manda Temp para obtener la multa y lo almacena en MultaDisp
        }
        return MultaDisp;
    }

    /*
     == DEVUELVE UNA MATRIZ CON LAS MULTAS DE LAS COLUMNAS PARA LA DEMANDA
     */
    public int[] MultaDemanda(JTable tabla) {
        int row = tabla.getRowCount(); //numero de filas
        int col = tabla.getColumnCount() - 1; //numeros de columnas
        int[][] DatosMatriz = new int[row][col]; //crea una matriz dimensional

        int[] MultaDemanda = new int[col - 1];

        GuardarDatosEnMatriz(DatosMatriz, tabla); //Los guarda en un la matriz
        int[] Temp = new int[row - 1]; //crea un arreglo temporal para guardar los datos de cada columna
        for (int i = 1; i < col; i++) {
            for (int j = 0; j < row - 1; j++) {
                Temp[j] = DatosMatriz[j][i - 1]; //Almacena los datos de cada columna en Temp
            }
            MultaDemanda[i - 1] = getMulta(Temp); //Manda Temp para obtener la multa de cada columna
        }
        return MultaDemanda;
    }

    /*
     == DEVUELVE LA MULTA MAS GRANDE TOMANDO TANTO DE DEMANDA Y DISPONIBILIDAD
     */
    public int MayorMulta(int[] dispoMulta, int[] demanMultas) {

        int[] Union = new int[dispoMulta.length + demanMultas.length]; //Crea un arreglo para almacenar todas las multas.
        //Union de las dos arreglo a una sola.
        System.arraycopy(dispoMulta, 0, Union, 0, dispoMulta.length);
        System.arraycopy(demanMultas, 0, Union, dispoMulta.length, demanMultas.length);

        MezclaDirecta(Union); //Ordenada las Multas
        return Union[Union.length - 1]; //Devuelve el mas Grande
    }

    /*
     == DEVUELVE EL DATO MAS PEQUEnO DENTRO DE UN ARREGLO.
     */
    public int MenorDatos(int[] datos) {
        MezclaDirecta(datos);
        return datos[0];
    }

    /*
     == DEVUELVE EL INDICE O POSICION DE LA MULTA MAS GRANDE DETERMINANDO SI ESTA EN 
    DISPONIBILIDAD O DEMANDA, O EN AMBAS
     */
    public int[] BuscarMultaIndices(int[] dispoMultas, int[] demanMultas) {
        //Manda la mayor multa junto con el arreglo de MultaDisp y busca su posicion.
        int i = GetIndice(dispoMultas, MayorMulta(dispoMultas, demanMultas)); //disponibilidad
        int j = GetIndice(demanMultas, MayorMulta(dispoMultas, demanMultas)); //demanda
        return new int[]{i, j};
    }

    /*
     == DETERMINA SI LA MAYOR MULTA ESTA EN DISPONIBILIDAD, DEMANDA O SON EN AMBAS.
     */
    public void Comparacion(int[] demanMultas, int[] dispoMulta, JTable tabla) {
        //arreglo con toda la disponibilidad y demanda.
        int[] Arrdisponibilidad = Disponibilidad(tabla);
        int[] Arrdemanda = Demanda(tabla);

        int[] indices = BuscarMultaIndices(dispoMulta, demanMultas);

        int Indisp = indices[0]; //indice de multa disponibilidad mas grande
        int Indeman = indices[1]; //indice de multa demanda mas grande

        if (Indisp != -1 && Indeman == -1) { //si el mas grande esta en disponibilidad
            int Valor_Disp = Arrdisponibilidad[Indisp]; //valor de la disponibilidad
            int[] datos = Valor_indiceDeman(Indisp); //Retorna valor de la demanda y su indice
            int valor = datos[0]; //valor de la demanda mas pequeño
            int IndiceDemanda = datos[1]; //el indice de la demanda.
            ActualizacionDeDatos(Valor_Disp, Arrdemanda[IndiceDemanda], valor, Indisp, IndiceDemanda, tabla);

        } else if (Indeman != -1 && Indisp == -1) { //si el mas grande esta en demanda.
            int Valor_Deman = Arrdemanda[Indeman]; //valor de la demanda
            int[] datos = Valor_indiceDisp(Indeman); //Retorna valor de la disponibilidad y su indice
            int valor = datos[0]; //valor de la disponibilidad
            int IndiceDisponibilidad = datos[1]; //su indice.
            ActualizacionDeDatos(Arrdisponibilidad[IndiceDisponibilidad], Valor_Deman, valor, IndiceDisponibilidad, Indeman, TablaProceso);

            //En caso que sean iguales, debe saber que eliminar si una demanda o disponibilidad.
            //se realiza otra funcion aparte.
        } else if (Indisp != -1 && Indeman != -1) {
            DemandaDisponibilidadIguales(Indeman, Indisp, Arrdisponibilidad, Arrdemanda, tabla);
        }
    }

    /*
     == EVALUA LAS DOS MULTAS IGUALES, Y DETERMINAR SI ELIMINAR UNA FILA O COLUMNA.
    DETERMINA CUAL ELIMINAR A PARTIR DE SUS DATOS INTERNOS.
     */
    public void DemandaDisponibilidadIguales(int Indeman, int InDisp, int[] Disponibilidad, int[] Demanda, JTable tabla) {
        //Buscar el dato mas pequeño y su indice. 
        int DatosDeman[] = Valor_indiceDeman(InDisp); //Mas pequeño de la demanda y su indice
        int DatosDisp[] = Valor_indiceDisp(Indeman); //Mas pequeño de la disponibilidad y su indice

        int ValorMenorDeman = DatosDeman[0]; //Valor mas pequeño de Demanda(fila)
        int ValorMenorDisp = DatosDisp[0]; //Valor mas pequeño de Disponibilidad(columna)

        int IndiceDemanda = DatosDeman[1]; //Indice para ubicar la demanda.
        int IndiceDisponibilidad = DatosDisp[1]; //Indice para ubicar la disponibilidad

        if (ValorMenorDeman < ValorMenorDisp) { //evalua quien es mas pequeño
            //Si demanda es mas pequeño eliminara una columna
            int Valor_Disp = Disponibilidad[InDisp];
            ActualizacionDeDatos(Valor_Disp, Demanda[IndiceDemanda], ValorMenorDeman, InDisp, IndiceDemanda, TablaProceso);
        } else {
            //si disponibilidad es mas pequeño eliminara una fila
            int Valor_Deman = Demanda[Indeman];
            ActualizacionDeDatos(Disponibilidad[IndiceDisponibilidad], Valor_Deman, ValorMenorDisp, IndiceDisponibilidad, Indeman, TablaProceso);
        }
    }

    /*
     == EVALUA QUE ELIMINAR Y ACTUALIZA LOS DATOS DE LA TABLA (DISPONIBILIDAD Y DEMANDA)
     */
    public void ActualizacionDeDatos(int Valordisp, int ValorDeman, int MenorValor, int IndDisp, int IndDeman, JTable tabla) {
        if (Valordisp > ValorDeman) { //Si disponibilidad es mas grande, eliminara una columna
            TxtMensajes.setText("Operacion: " + MenorValor + " x " + ValorDeman + " = " + (MenorValor * ValorDeman));

            //Almacenamiento de datos en ArrayLista para la VentanaResultados
            ListProces.add(MenorValor + " x " + ValorDeman + " = " + (MenorValor * ValorDeman));
            ListMultiplications.add((MenorValor * ValorDeman));

            //ACtualizacion de datos
            tabla.setValueAt((Valordisp - ValorDeman), IndDisp, tabla.getColumnCount() - 1);
            tabla.setValueAt(0, tabla.getRowCount() - 1, IndDeman + 1);

            EliminacionDeColumnas(IndDeman);
        } else if (ValorDeman > Valordisp) { //si demanda es mas grande, elimina una fila.
            TxtMensajes.setText("Operacion: " + MenorValor + " x " + Valordisp + " = " + (MenorValor * Valordisp));

            //Almacenamiento de datos en ArrayLista para la VentanaResultados
            ListProces.add(MenorValor + " x " + Valordisp + " = " + (MenorValor * Valordisp));
            ListMultiplications.add((MenorValor * Valordisp));

            //ACtualizacion de datos
            tabla.setValueAt(0, IndDisp, tabla.getColumnCount() - 1);
            tabla.setValueAt((ValorDeman - Valordisp), tabla.getRowCount() - 1, IndDeman + 1);

            EliminacionDeFilas(IndDisp);
        } else if (ValorDeman == Valordisp) {
            TxtMensajes.setText("Operacion: " + MenorValor + " x " + Valordisp + " = " + (MenorValor * Valordisp));

            //Almacenamiento de datos en ArrayLista para la VentanaResultados
            ListProces.add(MenorValor + " x " + Valordisp + " = " + (MenorValor * Valordisp));
            ListMultiplications.add((MenorValor * Valordisp));

            //Elimina directamente la columna y fila porque la demanda y disponibilidad son iguales.
            EliminacionDeFilas(IndDisp);
            EliminacionDeColumnas(IndDeman);

        }
    }

    /*
     == RETORNA EL MAS PEQUEnO DE TODA UNA COLUMNA(DEMANDA) Y SU INDICE
     */
    public int[] Valor_indiceDeman(int Indisp) {
        int col = TablaProceso.getColumnCount(); //numeros de columnas
        int[] fila_ordenado = new int[col - 2]; //Para ordenar
        int[] fila_desor = new int[col - 2]; //para buscar indice
        for (int i = 1; i < col - 1; i++) {
            //copia los valores de la columna a los arreglos.
            fila_ordenado[i - 1] = Integer.parseInt(TablaProceso.getValueAt(Indisp, i).toString());
            fila_desor[i - 1] = Integer.parseInt(TablaProceso.getValueAt(Indisp, i).toString());
        }
        int dato = MenorDatos(fila_ordenado); //obtiene el mas pequeno de la columna
        int i = GetIndice(fila_desor, dato); //obtine su indice
        return new int[]{dato, i};
    }

    /*
     == RETORNA EL MAS PEQUEnO DE TODA UNA FILA(DISPONIBILIDAD) Y SU INDICE
     */
    public int[] Valor_indiceDisp(int IndDeman) {

        int row = TablaProceso.getRowCount(); //numero de filas

        int[] columna_ordenado = new int[row - 1];
        int[] columna_desor = new int[row - 1];
        for (int j = 0; j < row - 1; j++) {
            //copia los valores de la fila a los arreglos.
            columna_ordenado[j] = Integer.parseInt(TablaProceso.getValueAt(j, IndDeman + 1).toString());
            columna_desor[j] = Integer.parseInt(TablaProceso.getValueAt(j, IndDeman + 1).toString());
        }
        int dato = MenorDatos(columna_ordenado); //obtiene el mas pequeño de las filas
        int i = GetIndice(columna_desor, dato); //retorna su indice del mas pequeño

        return new int[]{dato, i};
    }

    /*
     == ELIMINA LA FILA(DISPONIBILIDAD)
     */
    public void EliminacionDeFilas(int indiceDisp) {
        DefaultTableModel tableModel = (DefaultTableModel) TablaProceso.getModel();
        tableModel.removeRow(indiceDisp);
    }

    /*
     == ELIMINA LA COLUMNA(DEMANDA)
     */
    public void EliminacionDeColumnas(int indiceDeman) {
        DefaultTableModel tableModel = (DefaultTableModel) TablaProceso.getModel();

        TablaProceso.removeColumn(TablaProceso.getColumnModel().getColumn(indiceDeman + 1));
        TablaProceso.setModel(tableModel);
    }

    /*
     == COPIA LOS DATOS DE LA TABLA ORIGINAL A LA TABLA PROCESO
     */
    public void Jtables(int[][] matriz, int fila, int columna) {
        DefaultTableModel copy = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (0 == column) {
                    return false;
                }
                if (row == fila - 1 && column == columna - 1) {
                    return false;
                }
                return super.isCellEditable(row, column);
            }
        };

        for (int i = 0; i < fila; i++) {
            copy.addRow(new Object[]{});
        }

        for (int i = 0; i < columna; i++) {
            if (i == columna - 1) {
                copy.addColumn("Oferta");
            } else if (i >= 1) {
                copy.addColumn("Costo " + (i));
            } else {
                copy.addColumn("");
            }
        }

        for (int i = 0; i < fila; i++) {
            if (i == fila - 1) {
                copy.setValueAt("Demanda", i, 0);
            } else {
                copy.setValueAt("Costo " + (i + 1), i, 0);
            }
        }
        for (int i = 0; i < fila; i++) {
            for (int x = 1; x < columna; x++) {
                copy.setValueAt(matriz[i][x - 1], i, x);
            }
        }
        TablaProceso.setModel(copy);
    }

    /*
     == ENVIA LOS RESULTADOS DE LOS PROCEDIMIENTOS Y EL RESULTADO DE LAS MUTIPLICACIONES
    A LA VENTANARESULTADOS.
     */
    public void EnvioDeDatos() {
        DefaultListModel<String> model = new DefaultListModel<>();
        int total = 0;
        for (int i = 0; i < ListProces.size(); i++) {
            model.addElement(ListProces.get(i));
            total = total + ListMultiplications.get(i);
        }
        VentanaResultados.ListaDatos.setModel(model);
        VentanaResultados.TextoCostoTotal.setText("Costo Total: " + total);
    }

    public void NuevaFila_Columna(int sumdeman, int sumdisp, int fila, int columna) {
        if (sumdeman > sumdisp) {
            int row = jTable1.getRowCount() + 1; //numero de filas
            int col = jTable1.getColumnCount() - 1; //numeros de columnas

            int[][] DatosMatriz = new int[row][col]; //crea una matriz dimensional
            GuardarDatosEnMatrizConFila(DatosMatriz, jTable1, sumdeman - sumdisp); //Los guarda en un la matriz
            Jtables(DatosMatriz, fila + 1, columna);
            MatrixData.clear();
        }
        if (sumdisp > sumdeman) {
            int row = jTable1.getRowCount(); //numero de filas
            int col = jTable1.getColumnCount(); //numeros de columnas

            int[][] DatosMatriz = new int[row][col]; //crea una matriz dimensional
            GuardarDatosEnMatrizConColumna(DatosMatriz, jTable1, sumdisp - sumdeman);
            Jtables(DatosMatriz, fila, columna + 1);
            MatrixData.clear();
        }

        if (sumdisp == sumdeman) {
            int row = jTable1.getRowCount(); //numero de filas
            int col = jTable1.getColumnCount() - 1; //numeros de columnas

            int[][] DatosMatriz = new int[row][col]; //crea una matriz dimensional
            GuardarDatosEnMatriz(DatosMatriz, jTable1);
            Jtables(DatosMatriz, fila, columna);
        }
    }

    public void CreacionTablaPrin(int fila, int columna) {
        try {
            DefaultTableModel tableModel = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    if (0 == column) {
                        return false;
                    }
                    if (row == fila - 1 && column == columna - 1) {
                        return false;
                    }
                    return super.isCellEditable(row, column);
                }
            };

            for (int i = 0; i < fila; i++) {
                tableModel.addRow(new Object[]{});
            }

            for (int i = 0; i < columna; i++) {
                if (i == columna - 1) {
                    tableModel.addColumn("Oferta");
                } else if (i >= 1) {
                    tableModel.addColumn("Destino " + (i));
                } else {
                    tableModel.addColumn("");
                }
            }

            for (int i = 0; i < fila; i++) {
                if (i == fila - 1) {
                    tableModel.setValueAt("Demanda", i, 0);
                } else {
                    tableModel.setValueAt("Fuente " + (i + 1), i, 0);
                }
            }

            tableModel.setValueAt(0, fila - 1, columna - 1);

            jTable1.setModel(tableModel);

            BtnVer.setEnabled(true);
            BtnOpciones.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Campos vacios");
        }
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        //Ocultar Botones de Guardar.
        BtnAbrir.setVisible(false);
        BtnGuardar.setVisible(false);
        BtnCancelar.setVisible(false);
        BtnResultados.setVisible(false);
        BtnReiniciarProcesos.setVisible(false);

        //Dehabilitar botones.
        BtnVer.setEnabled(false);
        BtnOpciones.setEnabled(false);
        BtnProceso.setEnabled(false);

        TxtMensajes.setText("Procedimiento");
    }                                 

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        int row = Integer.parseInt(txtFilas.getText()) + 1;
        int col = Integer.parseInt(txtColumnas.getText()) + 2;

        CreacionTablaPrin(row, col);

    }                                        

    private void BtnVerMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:

    }                                   

    private void BtnVerActionPerformed(java.awt.event.ActionEvent evt) {                                       

        try {

            DatosArrayList(jTable1);

            int fila = jTable1.getRowCount();
            int columna = jTable1.getColumnCount();

            int[] demanda = Demanda(jTable1);
            int[] disponibilidad = Disponibilidad(jTable1);

            int sumdisp = 0;
            int sumdeman = 0;

            for (int i = 0; i < demanda.length; i++) {
                sumdeman = sumdeman + demanda[i];
            }
            for (int i = 0; i < disponibilidad.length; i++) {
                sumdisp = sumdisp + disponibilidad[i];
            }
            
            NuevaFila_Columna( sumdeman,  sumdisp,  fila,  columna);

            BtnProceso.setEnabled(true); //Activar boton

            //Desabilitacion de elementos.
            BtnCrear.setEnabled(false);
            //BtnVer.setEnabled(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Llene todos Los campos para resolver");
        }
    }                                      

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        try {
            int row = jTable1.getRowCount(); //numero de filas
            int col = jTable1.getColumnCount() - 1; //numeros de columnas
            int[][] DatosMatriz = new int[row][col]; //crea una matriz dimensional

            GuardarDatosEnMatriz(DatosMatriz, jTable1); //Los guarda en un la matriz
            GuardarDatosTxt(DatosMatriz, new ColaArr((row * col)+1)); //los guarda en un txt desde escritorio

            BtnAbrir.setVisible(false);
            BtnGuardar.setVisible(false);
            BtnCancelar.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos para guardar");
        }

    }                                          

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code her
        //Mostrar Botones.

    }                                    

    private void BtnOpcionesActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        BtnAbrir.setVisible(true);
        BtnGuardar.setVisible(true);
        BtnCancelar.setVisible(true);
    }
    //Verifica si la matriz termina en 0
    private boolean VerificarMatrizTerminaEnCero(String[] parts) {
        if (parts.length > 0) {
            String ultimoElemento = parts[parts.length - 1];
            int valorUltimoElemento = Integer.parseInt(ultimoElemento.trim());
            return valorUltimoElemento == 0;
        }
        return false;
    }
    
    private void BtnAbrirActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try {
            PilaArr pila = new PilaArr(jTable1.getRowCount() * jTable1.getColumnCount() - 1);
            // Abre el archivo y pasa los datos a la pila.
            String[] parts = AbrirArchivo(pila);
            
            boolean matrizTerminaEnCero = VerificarMatrizTerminaEnCero(parts);

            if (!matrizTerminaEnCero) {
                JOptionPane.showMessageDialog(null, "La matriz debe terminar en cero");
               
            }else {
            	// Llena la tabla a partir de los datos de la pila.
            	 LlenarTabla(parts);}

            BtnAbrir.setVisible(false);
            BtnGuardar.setVisible(false);
            BtnCancelar.setVisible(false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al abrir el archivo");
        }
    }

                                        

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:

        BtnAbrir.setVisible(false);
        BtnGuardar.setVisible(false);
        BtnCancelar.setVisible(false);

    }                                           

    private void BtnProcesoActionPerformed(java.awt.event.ActionEvent evt) {                                           

        try {
            int[] dispMulta = MultaDisponibilidad(TablaProceso);
            int[] demanMulta = MultaDemanda(TablaProceso);

            Comparacion(demanMulta, dispMulta, TablaProceso);
        } catch (Exception e) {
            BtnResultados.setVisible(true);
            BtnReiniciarProcesos.setVisible(true);
            BtnProceso.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Proceso Finalizado");
        }
    }                                          

    private void BtnResultadosActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        EnvioDeDatos();
        Ventana2.setVisible(true);
    }                                             

    private void BtnReiniciarProcesosActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:

        DefaultTableModel ModelPrincipal = (DefaultTableModel) jTable1.getModel();
        DefaultTableModel ModelCopia = (DefaultTableModel) TablaProceso.getModel();

        //Limpia toda la tabla Original
        ModelPrincipal.setColumnCount(0);
        ModelPrincipal.setRowCount(0);

        //Limpia toda la tabla copia.
        ModelCopia.setColumnCount(0);
        ModelCopia.setRowCount(0);

        //ocultar botones
        BtnResultados.setVisible(false);
        BtnReiniciarProcesos.setVisible(false);

        //activar botones.
        BtnCrear.setEnabled(true);
        BtnVer.setEnabled(true);

        //Elimina los datos de los arraylist
        ListProces.clear();
        ListMultiplications.clear();

        //Casillas en blanco
        txtColumnas.setText("");
        txtFilas.setText("");

        TxtMensajes.setText("Procedimientos");
    }                                                    

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuVoguel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton BtnAbrir;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnOpciones;
    private javax.swing.JButton BtnProceso;
    private javax.swing.JButton BtnReiniciarProcesos;
    private javax.swing.JButton BtnResultados;
    private javax.swing.JButton BtnVer;
    private javax.swing.JTable TablaProceso;
    private javax.swing.JLabel TxtMensajes;
    private javax.swing.JButton BtnCrear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtColumnas;
    private javax.swing.JTextField txtFilas;
    // End of variables declaration                   
}
