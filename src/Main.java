
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableCellRenderer;
import net.proteanit.sql.DbUtils;

public class Main extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public Main() {
        initComponents();

        showTable1Data();
        showTable2Data();
        catagoriesCombo();
        districtCombo();

        jTable1.setSelectionBackground(new Color(123, 255, 96));
        jTable1.setSelectionForeground(new Color(0, 0, 0));

        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new Color(85, 85, 224));
        headerRenderer.setFont(new Font("Arial", Font.BOLD, 36));
        headerRenderer.setForeground(new Color(255, 255, 255));
        headerRenderer.setPreferredSize(new Dimension(45, 45));

        for (int i = 0; i < jTable1.getModel().getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }

        for (int i = 0; i < jTable2.getModel().getColumnCount(); i++) {
            jTable2.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);

        }

        UIManager.put("OptionPane.minimumSize", new Dimension(400, 180));
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(
                "Cambria Math", Font.PLAIN, 25)));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        id2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        menu = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        clear = new javax.swing.JButton();
        view = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        category_id = new javax.swing.JTextField();
        category_name = new javax.swing.JTextField();
        description = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        publication_status = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        districtCombo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        catagoriesCombo = new javax.swing.JComboBox<>();
        viewButton = new javax.swing.JButton();
        blog_id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        category_id2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        blog_title = new javax.swing.JTextField();
        blog_short_description = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        blog_long_description = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        author_name = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        publication_status2 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        view1 = new javax.swing.JButton();
        save1 = new javax.swing.JButton();
        clear1 = new javax.swing.JButton();
        hit_count = new javax.swing.JTextField();
        date_time = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();

        jMenu3.setText("jMenu3");

        menu1.setLabel("File");
        menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu1ActionPerformed(evt);
            }
        });
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 93, 39));
        jPanel1.setLayout(null);

        menu.setBackground(new java.awt.Color(255, 204, 204));
        menu.setFont(menu.getFont().deriveFont(menu.getFont().getSize()+12f));

        jPanel2.setBackground(new java.awt.Color(255, 93, 39));
        jPanel2.setAutoscrolls(true);
        jPanel2.setLayout(null);

        clear.setBackground(new java.awt.Color(0, 204, 204));
        clear.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        clear.setText("clear");
        clear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(51, 153, 0), new java.awt.Color(231, 255, 255), new java.awt.Color(229, 255, 255)));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel2.add(clear);
        clear.setBounds(1150, 270, 100, 40);

        view.setBackground(new java.awt.Color(0, 204, 204));
        view.setFont(view.getFont().deriveFont(view.getFont().getSize()+12f));
        view.setText("Show Details");
        view.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(51, 153, 0), new java.awt.Color(231, 255, 255), new java.awt.Color(229, 255, 255)));
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        jPanel2.add(view);
        view.setBounds(460, 440, 160, 50);

        jTextField1.setFont(jTextField1.getFont().deriveFont(jTextField1.getFont().getSize()+14f));
        jTextField1.setForeground(new java.awt.Color(0, 51, 255));
        jTextField1.setText("Search Here");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(1000, 457, 320, 40);

        save.setBackground(new java.awt.Color(0, 204, 204));
        save.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        save.setText("save");
        save.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(51, 153, 0), new java.awt.Color(231, 255, 255), new java.awt.Color(229, 255, 255)));
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel2.add(save);
        save.setBounds(1030, 270, 100, 40);

        jLabel6.setBackground(new java.awt.Color(255, 204, 51));
        jLabel6.setFont(jLabel6.getFont().deriveFont(jLabel6.getFont().getStyle() | java.awt.Font.BOLD, jLabel6.getFont().getSize()+14));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Search");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(890, 460, 103, 30);

        jTable1.setBackground(new java.awt.Color(253, 231, 211));
        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jTable1ComponentResized(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(0, 500, 1330, 410);

        jButton3.setBackground(new java.awt.Color(0, 204, 204));
        jButton3.setFont(jButton3.getFont().deriveFont(jButton3.getFont().getSize()+12f));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Refresh.png"))); // NOI18N
        jButton3.setText("Edit");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(51, 153, 0), new java.awt.Color(231, 255, 255), new java.awt.Color(229, 255, 255)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(20, 440, 110, 50);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Doctors ID");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(470, 650, 160, 40);

        jButton4.setBackground(new java.awt.Color(0, 204, 204));
        jButton4.setFont(jButton4.getFont().deriveFont(jButton4.getFont().getSize()+12f));
        jButton4.setText("All View");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(51, 153, 0), new java.awt.Color(231, 255, 255), new java.awt.Color(229, 255, 255)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(310, 440, 110, 50);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("category_id");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(860, 30, 150, 40);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("category_name");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(830, 80, 190, 40);

        category_id.setFont(category_id.getFont().deriveFont(category_id.getFont().getSize()+14f));
        category_id.setForeground(new java.awt.Color(0, 51, 255));
        category_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                category_idActionPerformed(evt);
            }
        });
        jPanel2.add(category_id);
        category_id.setBounds(1020, 30, 270, 40);

        category_name.setFont(category_name.getFont().deriveFont(category_name.getFont().getSize()+14f));
        category_name.setForeground(new java.awt.Color(0, 51, 255));
        category_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                category_nameActionPerformed(evt);
            }
        });
        jPanel2.add(category_name);
        category_name.setBounds(1020, 80, 270, 40);

        description.setFont(description.getFont().deriveFont(description.getFont().getSize()+14f));
        description.setForeground(new java.awt.Color(0, 51, 255));
        description.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionActionPerformed(evt);
            }
        });
        jPanel2.add(description);
        description.setBounds(1020, 130, 270, 40);

        jLabel9.setBackground(new java.awt.Color(229, 229, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("category_description");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(750, 130, 260, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical-professionals-icon-group-doctors-nurse-over-white-background-colorful-design-vector-illustration-85791519.jpg"))); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 120, 440, 280);

        jLabel7.setFont(new java.awt.Font("Adobe Caslon Pro Bold", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("BD DOCTORS LIST");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 0, 480, 130);

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(jButton1.getFont().deriveFont(jButton1.getFont().getSize()+12f));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete-156119_1280.png"))); // NOI18N
        jButton1.setText("delete");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(51, 153, 0), new java.awt.Color(231, 255, 255), new java.awt.Color(229, 255, 255)));
        jPanel2.add(jButton1);
        jButton1.setBounds(160, 440, 120, 50);

        jLabel12.setBackground(new java.awt.Color(229, 229, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("publication_status ");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(780, 180, 230, 40);

        publication_status.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        publication_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "published", "unpublished" }));
        jPanel2.add(publication_status);
        publication_status.setBounds(1020, 186, 270, 40);

        menu.addTab("MainMenu", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 93, 39));
        jPanel3.setLayout(null);

        jTable2.setBackground(new java.awt.Color(222, 255, 222));
        jTable2.setFont(jTable2.getFont().deriveFont(jTable2.getFont().getSize()+14f));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable2.setDragEnabled(true);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(0, 520, 1320, 380);

        districtCombo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel3.add(districtCombo);
        districtCombo.setBounds(240, 280, 300, 40);

        jLabel11.setBackground(new java.awt.Color(255, 204, 51));
        jLabel11.setFont(jLabel11.getFont().deriveFont(jLabel11.getFont().getStyle() | java.awt.Font.BOLD, jLabel11.getFont().getSize()+14));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("District");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(70, 280, 130, 40);

        jLabel10.setBackground(new java.awt.Color(255, 204, 51));
        jLabel10.setFont(jLabel10.getFont().deriveFont(jLabel10.getFont().getStyle() | java.awt.Font.BOLD, jLabel10.getFont().getSize()+14));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Categories");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(60, 200, 180, 40);

        catagoriesCombo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        catagoriesCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catagoriesComboActionPerformed(evt);
            }
        });
        jPanel3.add(catagoriesCombo);
        catagoriesCombo.setBounds(240, 210, 300, 40);

        viewButton.setBackground(new java.awt.Color(255, 219, 219));
        viewButton.setFont(viewButton.getFont().deriveFont(viewButton.getFont().getSize()+15f));
        viewButton.setText("View");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });
        jPanel3.add(viewButton);
        viewButton.setBounds(420, 360, 110, 40);

        blog_id.setFont(blog_id.getFont().deriveFont(blog_id.getFont().getSize()+14f));
        blog_id.setForeground(new java.awt.Color(0, 51, 255));
        blog_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blog_idActionPerformed(evt);
            }
        });
        jPanel3.add(blog_id);
        blog_id.setBounds(990, 20, 310, 40);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("blog_id");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(890, 20, 90, 40);

        category_id2.setFont(category_id2.getFont().deriveFont(category_id2.getFont().getSize()+14f));
        category_id2.setForeground(new java.awt.Color(0, 51, 255));
        category_id2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                category_id2ActionPerformed(evt);
            }
        });
        jPanel3.add(category_id2);
        category_id2.setBounds(990, 70, 310, 40);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("category_id");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(840, 70, 142, 40);

        jLabel13.setBackground(new java.awt.Color(229, 229, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("blog_title");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(870, 120, 120, 40);

        blog_title.setFont(blog_title.getFont().deriveFont(blog_title.getFont().getSize()+14f));
        blog_title.setForeground(new java.awt.Color(0, 51, 255));
        blog_title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blog_titleActionPerformed(evt);
            }
        });
        jPanel3.add(blog_title);
        blog_title.setBounds(990, 120, 310, 40);

        blog_short_description.setFont(blog_short_description.getFont().deriveFont(blog_short_description.getFont().getSize()+14f));
        blog_short_description.setForeground(new java.awt.Color(0, 51, 255));
        blog_short_description.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blog_short_descriptionActionPerformed(evt);
            }
        });
        jPanel3.add(blog_short_description);
        blog_short_description.setBounds(990, 170, 310, 40);

        jLabel14.setBackground(new java.awt.Color(229, 229, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("blog_short_description");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(710, 170, 280, 40);

        blog_long_description.setFont(blog_long_description.getFont().deriveFont(blog_long_description.getFont().getSize()+14f));
        blog_long_description.setForeground(new java.awt.Color(0, 51, 255));
        blog_long_description.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blog_long_descriptionActionPerformed(evt);
            }
        });
        jPanel3.add(blog_long_description);
        blog_long_description.setBounds(990, 220, 310, 40);

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("blog_long_description");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(720, 220, 270, 40);

        author_name.setFont(author_name.getFont().deriveFont(author_name.getFont().getSize()+14f));
        author_name.setForeground(new java.awt.Color(0, 51, 255));
        author_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                author_nameActionPerformed(evt);
            }
        });
        jPanel3.add(author_name);
        author_name.setBounds(990, 270, 310, 40);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("author_name");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(820, 270, 160, 40);

        jLabel17.setBackground(new java.awt.Color(229, 229, 255));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("publication_status");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(760, 320, 221, 40);

        publication_status2.setFont(publication_status2.getFont().deriveFont(publication_status2.getFont().getSize()+14f));
        publication_status2.setForeground(new java.awt.Color(0, 51, 255));
        publication_status2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publication_status2ActionPerformed(evt);
            }
        });
        jPanel3.add(publication_status2);
        publication_status2.setBounds(990, 320, 310, 40);

        jButton5.setBackground(new java.awt.Color(0, 204, 204));
        jButton5.setFont(jButton5.getFont().deriveFont(jButton5.getFont().getSize()+12f));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Refresh.png"))); // NOI18N
        jButton5.setText("Edit");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(51, 153, 0), new java.awt.Color(231, 255, 255), new java.awt.Color(229, 255, 255)));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(50, 460, 110, 50);

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setFont(jButton2.getFont().deriveFont(jButton2.getFont().getSize()+12f));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete-156119_1280.png"))); // NOI18N
        jButton2.setText("delete");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(51, 153, 0), new java.awt.Color(231, 255, 255), new java.awt.Color(229, 255, 255)));
        jPanel3.add(jButton2);
        jButton2.setBounds(190, 460, 120, 50);

        jButton6.setBackground(new java.awt.Color(0, 204, 204));
        jButton6.setFont(jButton6.getFont().deriveFont(jButton6.getFont().getSize()+12f));
        jButton6.setText("All View");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(51, 153, 0), new java.awt.Color(231, 255, 255), new java.awt.Color(229, 255, 255)));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6);
        jButton6.setBounds(340, 460, 110, 50);

        view1.setBackground(new java.awt.Color(0, 204, 204));
        view1.setFont(view1.getFont().deriveFont(view1.getFont().getSize()+12f));
        view1.setText("Show Details");
        view1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(51, 153, 0), new java.awt.Color(231, 255, 255), new java.awt.Color(229, 255, 255)));
        view1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view1ActionPerformed(evt);
            }
        });
        jPanel3.add(view1);
        view1.setBounds(490, 460, 160, 50);

        save1.setBackground(new java.awt.Color(0, 204, 204));
        save1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        save1.setText("save");
        save1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(51, 153, 0), new java.awt.Color(231, 255, 255), new java.awt.Color(229, 255, 255)));
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });
        jPanel3.add(save1);
        save1.setBounds(990, 380, 100, 40);

        clear1.setBackground(new java.awt.Color(0, 204, 204));
        clear1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        clear1.setText("clear");
        clear1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(51, 153, 0), new java.awt.Color(231, 255, 255), new java.awt.Color(229, 255, 255)));
        clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear1ActionPerformed(evt);
            }
        });
        jPanel3.add(clear1);
        clear1.setBounds(1110, 380, 100, 40);

        hit_count.setFont(hit_count.getFont().deriveFont(hit_count.getFont().getSize()+14f));
        hit_count.setForeground(new java.awt.Color(0, 51, 255));
        hit_count.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hit_countActionPerformed(evt);
            }
        });
        jPanel3.add(hit_count);
        hit_count.setBounds(460, 30, 310, 40);

        date_time.setFont(date_time.getFont().deriveFont(date_time.getFont().getSize()+14f));
        date_time.setForeground(new java.awt.Color(0, 51, 255));
        date_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date_timeActionPerformed(evt);
            }
        });
        jPanel3.add(date_time);
        date_time.setBounds(460, 80, 310, 40);

        menu.addTab("Categories", jPanel3);

        jPanel4.setLayout(null);
        menu.addTab("Hospital", jPanel4);

        jPanel1.add(menu);
        menu.setBounds(0, 0, 1630, 980);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1630, 970);

        setSize(new java.awt.Dimension(1336, 990));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        save.setText("UpDate");

        if (category_id.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Select a Row to Edit !");
        } else {
            try {
                int column = 0;
                int row = jTable1.getSelectedRow();
                String value = jTable1.getModel().getValueAt(row, column).toString();

                con = DriverManager.getConnection("jdbc:mysql://localhost/db_blog_batch18", "root", "");

                String sql = "SELECT `category_id`, `category_name`, `category_description`, `publication_status` FROM `tbl_category` WHERE category_id='" + value + "'";
                pst = con.prepareStatement(sql);

                rs = pst.executeQuery();

                while (rs.next()) {

                    String c = rs.getString("category_id");
                    String d = rs.getString("category_name");
                    String e = rs.getString("category_description");
                    String f = rs.getString("publication_status");

                    category_id.setText(c);

                    category_name.setText(d);
                    description.setText(e);
                    publication_status.setSelectedItem(f);

                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);

            }

        }

    }//GEN-LAST:event_jButton3ActionPerformed


    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_blog_batch18", "root", "");
            String sql = "SELECT `category_id`, `category_name`, `category_description`, `publication_status` FROM `tbl_category` WHERE category_name LIKE '%" + jTextField1.getText() + "%'OR category_id LIKE '%" + jTextField1.getText() + "%'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

            DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
            headerRenderer.setBackground(new Color(255, 178, 181));
            jTable1.setSelectionBackground(new Color(123, 255, 96));
            jTable1.setSelectionForeground(new Color(0, 0, 0));
            headerRenderer.setBackground(new Color(39, 132, 0));
            headerRenderer.setForeground(new Color(255, 255, 255));
            headerRenderer.setPreferredSize(new Dimension(45, 45));
            headerRenderer.setFont(new Font("Arial", Font.BOLD, 45));

            for (int i = 0; i < jTable1.getModel().getColumnCount(); i++) {
                jTable1.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
            }

            jTable1.getTableHeader().setOpaque(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(400);
            jTable1.getTableHeader().setResizingAllowed(false);
            jTable1.setRowHeight(30);
            jTable1.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 25));
            jTable1.getTableHeader().setForeground(Color.blue);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jTextField1KeyReleased


    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int column = 0;
        int row = jTable1.getSelectedRow();
        String value = jTable1.getModel().getValueAt(row, column).toString();

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_blog_batch18", "root", "");

            String sql = "SELECT `category_id`, `category_name`, `category_description`, `publication_status` FROM `tbl_category` WHERE category_id='" + value + "'";
            pst = con.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next()) {

                String c = rs.getString("category_id");
                String d = rs.getString("category_name");
                String e = rs.getString("category_description");
                String f = rs.getString("publication_status");

                
                category_id.setText(c);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }

    }//GEN-LAST:event_jTable1MouseClicked


    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        
    }//GEN-LAST:event_jTextField1KeyPressed

    private void catagoriesComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catagoriesComboActionPerformed

    }//GEN-LAST:event_catagoriesComboActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        category_id.setText(null);
        table2category();
    }//GEN-LAST:event_viewButtonActionPerformed


    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        if (category_id.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Select a Row to view Details !");
        } else {
            String idd = category_id.getText();
            int iddd = Integer.parseInt(idd);
            details textarea = new details(iddd);
            textarea.setResizable(false);
            textarea.setVisible(true);
        }

    }//GEN-LAST:event_viewActionPerformed


    private void jTable1ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTable1ComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1ComponentResized

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed


    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

        int column = 0;
        int row = jTable2.getSelectedRow();
        String value = jTable2.getModel().getValueAt(row, column).toString();

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/bd doctors", "root", "");

            String sql = "SELECT `ID`, `Doctors_Name`, `Specialist`, `Hospital`, `Time_Telephone_no`, `Address`, `District` FROM `users` WHERE ID='" + value + "'";
            pst = con.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next()) {

                String c = rs.getString("ID");

                id2.setText(c);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
    }//GEN-LAST:event_jTable2MouseClicked


    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        category_id.setText(null);
        showTable1Data();
    }//GEN-LAST:event_jButton4ActionPerformed


    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {

            String sql = "DELETE FROM users WHERE ID =?";
            try {

                con = DriverManager.getConnection("jdbc:mysql://localhost/", "root", "");
                pst = con.prepareStatement(sql);

                pst.setString(1, category_id.getText());
                pst.executeUpdate();

            } catch (SQLException | HeadlessException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
            showTable1Data();
            JOptionPane.showMessageDialog(null, "deleted  successfully");

        }
        // category_id.setText(null);
    }//GEN-LAST:event_jTable1KeyPressed


    private void category_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_category_idActionPerformed

    private void category_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_category_nameActionPerformed

    private void descriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionActionPerformed


    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed

        if (save.getText().equals("UpDate")) {
            update();
        } else {

            add();

        }
    }//GEN-LAST:event_saveActionPerformed


    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        category_id.setText("");
        category_name.setText("");
        description.setText("");

    }//GEN-LAST:event_clearActionPerformed


    private void menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu1ActionPerformed

    private void blog_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blog_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_blog_idActionPerformed

    private void category_id2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category_id2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_category_id2ActionPerformed

    private void blog_titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blog_titleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_blog_titleActionPerformed

    private void blog_short_descriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blog_short_descriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_blog_short_descriptionActionPerformed

    private void blog_long_descriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blog_long_descriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_blog_long_descriptionActionPerformed

    private void author_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_author_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_author_nameActionPerformed

    private void publication_status2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publication_status2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_publication_status2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void view1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_view1ActionPerformed

    private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed

    }//GEN-LAST:event_save1ActionPerformed

    private void clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clear1ActionPerformed

    private void hit_countActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hit_countActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hit_countActionPerformed

    private void date_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_date_timeActionPerformed

    private void update() {

        if (category_id.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Type ' ID ' to update !");
        } else {

            try {

                con = DriverManager.getConnection("jdbc:mysql://localhost/db_blog_batch18", "root", "");
                String sql = "UPDATE `tbl_category` SET `category_name`=?,`category_description`=?,`publication_status`=? WHERE category_id=?";
                pst = con.prepareStatement(sql);
                pst.setString(1, category_id.getText());
                pst.setString(2, category_name.getText());
                pst.setString(3, description.getText());
                pst.setString(4, publication_status.getSelectedItem().toString());

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "updated successfully");

            } catch (SQLException | HeadlessException ex) {
                JOptionPane.showMessageDialog(null, ex);

            }
        }
        showTable1Data();
        save.setText("save");
    }

    private void update2() {

        if (category_id.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Type ' ID ' to update !");
        } else {

            try {

                con = DriverManager.getConnection("jdbc:mysql://localhost/bd doctors", "root", "");
                String sql = "UPDATE users SET Doctors_Name=?,Specialist=?,Hospital=?,Time_Telephone_no=?,Address=?,District=? WHERE ID=?";
                pst = con.prepareStatement(sql);
                pst.setString(3, category_id.getText());
                pst.setString(1, category_name.getText());
                pst.setString(2, description.getText());

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "updated successfully");

            } catch (SQLException | HeadlessException ex) {
                JOptionPane.showMessageDialog(null, ex);

            }
        }
        showTable2Data();
    }

    private void add() {

        if (category_id.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Type ' ID ' Field !");
        } else {

            try {

                con = DriverManager.getConnection("jdbc:mysql://localhost/db_blog_batch18", "root", "");
                String sql = "Select category_id from tbl_category where category_id like '%" + category_id.getText() + "%'";
                PreparedStatement pst = con.prepareStatement(sql);

                ResultSet rs = pst.executeQuery();
                if (rs.next()) {

                    JOptionPane.showMessageDialog(null, "' ID ' You have Entered Already Exists !");

                } else {
                    String i = "INSERT INTO `tbl_category`(`category_id`, `category_name`, `category_description`, `publication_status`) VALUES (?,?,?,?)";
                    pst = con.prepareStatement(i);
                    pst.setString(1, category_id.getText());
                    pst.setString(2, category_name.getText());
                    pst.setString(3, description.getText());
                    pst.setString(4, publication_status.getSelectedItem().toString());

                    pst.executeUpdate();

                    JOptionPane.showMessageDialog(null, "inserted successfully");

                }

            } catch (SQLException | HeadlessException ex) {
                JOptionPane.showMessageDialog(null, ex);

            }
        }
        showTable1Data();
    }

    private void add2() {

        if (blog_id.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Type ' ID ' Field !");
        } else {

            try {

                con = DriverManager.getConnection("jdbc:mysql://localhost/db_blog_batch18", "root", "");
                String sql = "Select blog_id from tbl_blog where blog_id like '%" + blog_id.getText() + "%'";
                PreparedStatement pst = con.prepareStatement(sql);

                ResultSet rs = pst.executeQuery();
                if (rs.next()) {

                    JOptionPane.showMessageDialog(null, "' ID ' You have Entered Already Exists !");

                } else {
                    String i = "INSERT INTO `tbl_blog`(`blog_id`, `category_id`, `blog_title`, `blog_short_description`, `blog_long_description`, `author_name`, `publication_status`) VALUES (?,?,?,?,?,?,?)";
                    pst = con.prepareStatement(i);
                    pst.setString(1, blog_id.getText());
                    pst.setString(2, category_id2.getText());
                    pst.setString(3, blog_title.getText());
                    pst.setString(4, blog_short_description.getText());
                    pst.setString(5, blog_long_description.getText());
                    pst.setString(6, author_name.getText());
                    pst.setString(7, publication_status2.getText());

                    pst.executeUpdate();

                    JOptionPane.showMessageDialog(null, "inserted successfully");

                }

            } catch (SQLException | HeadlessException ex) {
                JOptionPane.showMessageDialog(null, ex);

            }
        }
        showTable2Data();
    }

    private void districtCombo() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/bd doctors", "root", "");
            String sql = "select District from users group by District ";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String name = rs.getString("District");
                districtCombo.addItem(name);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void catagoriesCombo() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/bd doctors", "root", "");
            String sql = "select Specialist from users group by Specialist ";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String name = rs.getString("Specialist");
                catagoriesCombo.addItem(name);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void table2category() {
        if (districtCombo.equals("Select a Category")) {
            JOptionPane.showMessageDialog(null, "drrgd");
        } else {
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost/bd doctors", "root", "");

                String Catagory = catagoriesCombo.getSelectedItem().toString();
                String dis = districtCombo.getSelectedItem().toString();

                String sql = "SELECT `ID`, `Doctors_Name` FROM `users` WHERE  District= '" + dis + "' and Specialist='" + Catagory + "' group by ID ";
                pst = con.prepareStatement(sql);

                rs = pst.executeQuery();

                jTable1.setModel(DbUtils.resultSetToTableModel(rs));

                jTable1.setSelectionBackground(new Color(123, 255, 96));
                jTable1.setSelectionForeground(new Color(0, 0, 0));
                DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
                headerRenderer.setBackground(new Color(39, 132, 0));
                headerRenderer.setForeground(new Color(255, 255, 255));
                headerRenderer.setPreferredSize(new Dimension(45, 45));
                headerRenderer.setFont(new Font("Arial", Font.BOLD, 45));

                jTable1.getTableHeader().setOpaque(false);
                jTable1.getColumnModel().getColumn(1).setPreferredWidth(400);
                jTable1.getTableHeader().setResizingAllowed(false);

                jTable1.setRowHeight(35);
                jTable1.setShowGrid(false);
                for (int i = 0; i < jTable1.getModel().getColumnCount(); i++) {
                    jTable1.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);

            }
        }

    }

    private void showTable1Data() {

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_blog_batch18", "root", "");
            String sql = "SELECT * FROM `tbl_category` group by category_id ";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

            DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
            headerRenderer.setBackground(new Color(255, 178, 181));
            jTable1.setSelectionBackground(new Color(123, 255, 96));
            jTable1.setSelectionForeground(new Color(0, 0, 0));
            headerRenderer.setBackground(new Color(39, 132, 0));
            headerRenderer.setForeground(new Color(255, 255, 255));
            headerRenderer.setPreferredSize(new Dimension(45, 45));
            headerRenderer.setFont(new Font("Arial", Font.BOLD, 45));

            for (int i = 0; i < jTable1.getModel().getColumnCount(); i++) {
                jTable1.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
            }

            jTable1.getTableHeader().setOpaque(false);

            jTable1.getTableHeader().setResizingAllowed(false);
            jTable1.setRowHeight(30);
            jTable1.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 25));
            jTable1.getTableHeader().setForeground(Color.blue);
            jTable1.setShowGrid(false);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
    }

    private void showTable2Data() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_blog_batch18", "root", "");
            String sql = "SELECT `blog_id`, `category_id`, `blog_title`, `blog_short_description`, `blog_long_description`, `author_name`, `publication_status` FROM `tbl_blog` group by blog_id ";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));

            jTable2.getTableHeader().setOpaque(false);

            jTable2.getTableHeader().setResizingAllowed(false);

            jTable2.setRowHeight(35);
            jTable2.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 30));
            jTable2.getTableHeader().setForeground(Color.blue);

            jTable2.setShowGrid(false);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);

            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField author_name;
    public javax.swing.JTextField blog_id;
    public javax.swing.JTextField blog_long_description;
    private javax.swing.JTextField blog_short_description;
    private javax.swing.JTextField blog_title;
    private javax.swing.JComboBox<String> catagoriesCombo;
    public javax.swing.JTextField category_id;
    private javax.swing.JTextField category_id2;
    private javax.swing.JTextField category_name;
    private javax.swing.JButton clear;
    private javax.swing.JButton clear1;
    private javax.swing.JTextField date_time;
    private javax.swing.JTextField description;
    private javax.swing.JComboBox<String> districtCombo;
    private javax.swing.JTextField hit_count;
    private javax.swing.JTextField id2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTabbedPane menu;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JComboBox<String> publication_status;
    private javax.swing.JTextField publication_status2;
    private javax.swing.JButton save;
    private javax.swing.JButton save1;
    private javax.swing.JButton view;
    private javax.swing.JButton view1;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
