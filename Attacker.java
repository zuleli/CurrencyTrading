package TestJavaClient;

/*
*Currency Trading project is currently under redesign. This java file is not part of new design, but part of current runing project.
*
*Current running project( "Currency Trading") actually consists of several smaller projects put together. This one is just one of 
* those smaller projects. I put this file here just to show you the codes I have written. These codes are working in my machine,
* but they are not well organized and designed because it was impossible to foresee needed behaviours of the program 
* in the beginning. This file is a result of constant trials and experiments,not a result of well-design program

*/


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;


//import java.security.Timestamp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Time;


import java.sql.Timestamp;

import java.util.List;

import java.util.Vector;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import javax.swing.SwingConstants;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.util.PDFTextStripper;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import singlejartest.JumpMonitor;


public class Attacker extends JFrame implements Runnable {
    JComboBox jComboBox1 = new JComboBox();
    public JTextArea jTextArea1 = new JTextArea();
    private JScrollPane jScrollPane1 = new JScrollPane();
    public JButton jButton1 = new JButton();
    private JTextField jTextField1 = new JTextField();
    Connection con;
    Statement ste;
    ResultSet rs;
    String temstr;
    String source = "jdbc:derby:" + System.getProperty("user.home") + "\\DukaDatabase\\forextool;create=false";
    String secondSource = "jdbc:derby:" + System.getProperty("user.home") + "\\DukaDatabase\\indexs;create=false";
    JTextField jTextField2 = new JTextField();
    public int temint = 0;
    private JButton jButton2 = new JButton();
    long t1, t5;
    private JScrollPane jScrollPane7 = new JScrollPane();
    boolean opstart = false;
    public JTextField jTextField3 = new JTextField();
    public JTextField jTextField4 = new JTextField();
    private JButton jButton3 = new JButton();
    private int Skip;
    private int Length;
    private String Keyword = null;
    public JTextField jTextField5 = new JTextField();
    public JLabel jLabel2 = new JLabel();
    private JTextField jTextField6 = new JTextField();
    private JCheckBox jCheckBox1 = new JCheckBox();
    JComboBox jComboBox2 = new JComboBox();
    JTextField value1 = new JTextField();
    JTextField value2 = new JTextField();
    JTextField value3 = new JTextField();
    JTextField value4 = new JTextField();
    JTextField value5 = new JTextField();
    JTextField value1L = new JTextField();
    JTextField value1R = new JTextField();
    public JComboBox wsname = new JComboBox();
    JCheckBox jCheckBox4 = new JCheckBox();
    JTextField orderquantityF = new JTextField();
    JTextField timespanF = new JTextField();
    JButton jButton5 = new JButton();
    JCheckBox secondtd = new JCheckBox();
    JTextField onepreviousF = new JTextField();
    JTextField twopreviousF = new JTextField();
    double ptemp, ftemp, emchg, Uemrate, Oneprevious2, Twoprevious2;
    public String currentip, currentfile;
    int ipstatus = 1;
    int rpc = 0, Verifylength, Betterlength, sleeptime = 60000;
    String Verifyword = "", Betterword;
    JCheckBox jCheckBox2 = new JCheckBox();
    JTextField interval = new JTextField();
    public long t2, t3, t4, t6, t7, t8;
    boolean s01, s11, s02, s12, s03, s13, s31, s32, s33, trd2, trd3, noverify = false;
    static boolean tstart1 = false;
    HttpURLConnection huc = null;

    URL u = null;
    BufferedReader br = null;
    InputStream in = null;
    BufferedReader br2 = null;
    InputStream in2 = null;
    private JCheckBox jCheckBox3 = new JCheckBox();
    IBDuka sf = null;
    Thread rd = null, rd2 = null, rd3, rd4, rd5, rd6, rd7, rd8, rd9, rd10, rd11;

    JPanel viewer;
    
    int finish = 0;
    final int PDF = 1;
    final int TEXT = 0;
    final int EXCEL = 2;
    int Filetype = 0;
    final int BUYLMT = 0, SELLLMT = 1, BUYMKT = 2, SELLMKT = 3;
    final int USDJPY = 0;
    final int EURUSD = 1;
    final int USDCAD = 2;
    final int EURCHF = 3;
    final int AUDUSD = 4;
    final int NZDUSD = 5;
    final int GBPUSD = 6;
    final int EURGBP = 7;
    final int GBPJPY = 8;
    final int EURCAD = 9;
    final int CADJPY = 10;
    final int EURJPY = 11;
    final int EURAUD = 12;
    final int AUDJPY = 13;
    final int EURNZD = 14;
    final int NZDJPY = 15;
    final int USDCHF = 16;
    final int CHFJPY = 17;
    final int AUDCAD = 18;
    final int NZDCAD = 19;
    final int GBPCAD = 20;
    final int CADCHF = 21;
    final int GBPAUD = 22;
    final int GBPNZD = 23;
    final int GBPCHF = 24;
    final int AUDNZD = 25;
    String test = "", hand = "", workstr = "";
    String ip2 = "", file2 = "", td2url = "";

    final int SAMEFILE = 0, NEWCOME = 1, ADDITEM = 2;

    double Oneprevious, Twoprevious, onepreviousbase1, twopreviousbase1;
    String Filename, Filename2, Filename3, Filename4, Filename5, Filename6;
    int timeoffset = 0, Updatetype = 0;
    boolean onetimeop = true;
    SecondThread std = null, td7 = null, td8 = null, td9 = null, td10 = null;
    public SecondThread td11 = null;
    SecondThread trd = null;
    SecondThread f4rd = null;
    SecondThread f5rd = null;
    SecondThread s6rd = null;
    static double tdata1 = 0, tdata2 = 0;
    static boolean bdata1 = true, bdata = true, ordersubmit = true;
    JCheckBox trdthread = new JCheckBox();
    JLabel td3info = new JLabel();
    JLabel td2info = new JLabel();
    JCheckBox fourththread = new JCheckBox();
    JCheckBox fifththread = new JCheckBox();
    JLabel td4info = new JLabel();
    JLabel td5info = new JLabel();
    JLabel td6info = new JLabel();
    JCheckBox sixththread = new JCheckBox();
    private JScrollPane jScrollPane2 = new JScrollPane();
    public JTextArea jTextField7 = new JTextArea();
    private JLabel show = new JLabel();
    private JTextField indicatornoF = new JTextField();
    private JTextField betterwordF = new JTextField();
    int indicatorno1 = -1;
    private JTextField onepreviousBaseF = new JTextField();
    private JTextField twopreviousBaseF = new JTextField();
    int[] stages = new int[12];
    String[] links = new String[12];
    private JRadioButton orderpermit = new JRadioButton();
    double[] prices = new double[26];
    private JComboBox botypeC = new JComboBox();
    private JComboBox bctypeC = new JComboBox();
    private JComboBox wotypeC = new JComboBox();
    private JComboBox wctypeC = new JComboBox();
    private JTextField boffsetF = new JTextField();
    private JTextField woffsetF = new JTextField();
    private int botype1 = 0, bctype1 = 2, wotype1 = 1, wctype1 = 2, submit1 = 0;
    private double boffset1 = 10, woffset1 = 10, fbt1, fwt1, sbt1, swt1;
    private JTextField fbtF = new JTextField();
    private JTextField fwtF = new JTextField();
    private JTextField sbtF = new JTextField();
    private JTextField swtF = new JTextField();
    private JSeparator jSeparator1 = new JSeparator();
    private JComboBox submitC = new JComboBox();
    private JCheckBox bpermit = new JCheckBox();
    private JCheckBox wpermit = new JCheckBox();
    private JCheckBox bpermit_cad = new JCheckBox();
    private JCheckBox wpermit_cad = new JCheckBox();
    private JTextField pricesurgeF = new JTextField();
    private JTextField pricesurge_cadF = new JTextField();
    public double[] f5sprice = new double[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    public int[] f5sc = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    int activetdno = 0;
    int quantity1 = 0;
    double[] gdata = new double[6];
    int[] gassign1 = new int[6];
    boolean[] g_a_status = new boolean[6];
    private JComboBox para6 = new JComboBox();
    private JComboBox para1 = new JComboBox();
    private JComboBox para2 = new JComboBox();
    private JComboBox para3 = new JComboBox();
    private JComboBox para4 = new JComboBox();
    private JComboBox para5 = new JComboBox();
    private JPanel jPanel1 = new JPanel();
    public JLabel td7info = new JLabel();
    public JLabel td8info = new JLabel();
    public JLabel td9info = new JLabel();
    public JLabel td10info = new JLabel();
    public JLabel td11info = new JLabel();
    private JPanel jPanel2 = new JPanel();
    private JSplitPane jSplitPane1 = new JSplitPane();
    private JSplitPane jSplitPane2 = new JSplitPane();
    public JCheckBox s7thread = new JCheckBox();
    public JCheckBox e8thread = new JCheckBox();
    public JCheckBox n9thread = new JCheckBox();
    public JCheckBox t10thread = new JCheckBox();
    public JCheckBox t11thread = new JCheckBox();
    public JButton trdreset = new JButton();
    private JLabel data3show = new JLabel();
    private JLabel data39show = new JLabel();
    private JLabel data4show = new JLabel();
    private JLabel data49show = new JLabel();
    private JSplitPane jSplitPane3 = new JSplitPane();
    final int GENERAL = 0, CADSUBMIT = 1, GPSUBMIT = 3;
    private Vector schedule = new Vector();
    // public double F1result=0,F1result2=0,F1result3=0,F1result4=0,F1result5=0,F1result6=0,F1result7=0,F1result8=0,F1result9=0,F1result10=0,F1result11=0;
    // public boolean fxalarmclock=false,fxalarmclock2=false,fxalarmclock3=false,fxalarmclock4=false,fxalarmclock5=false,fxalarmclock6=false,fxalarmclock7=false,fxalarmclock8=false,fxalarmclock9=false,fxalarmclock10=false,fxalarmclock11=false;
    public byte[] actualStatus = new byte[12];
    public double[] FResult = new double[12];
    public boolean[] fxalarmclocks = new boolean[12];
    public JumpMonitor mp = null;

    private static final int EXTERNAL_BUFFER_SIZE = 128000;

    public void tem() {


    }

    public String getotype(int otype) {
        switch (otype) {
        case 0:
            return "BUYLMT";
        case 1:
            return "SELLLMT";
        case 2:
            return "BUYMKT";
        case 3:
            return "SELLMKT";

        }
        return "UNKNOWN";
    }

    private void reset() {
        for (int i = 0; i < stages.length; i++) {
            stages[i] = -1;
            links[i] = "-1";

        }
        if (sf != null) {
            sf.attackerorder = false;
            sf.attackerpair = "";
        }
        prices = new double[26];
        bdata1 = true;
        show.setText("");
        jLabel2.setText("-0");
    }

    public static void main(String[] args) {
        Attacker ac = new Attacker(null);
        ac.setVisible(true);
    }

    void setSleepTime(int sleeptime) {
        this.sleeptime = sleeptime; //jTextField2.setText("Sleep Time="+sleeptime);
    }

    public void setGO() {
        tstart1 = true;
    }

    public void run() {
        jTextField7.insert("thread1 start\n", 0);
        log(Filename, "First Thread starts at " + (new Time(System.currentTimeMillis() + timeoffset)).toString());
        while (tstart1 && jCheckBox2.isSelected()) {
            //System.out.println("Inside check box2="+jCheckBox2.isSelected());
            try {
                // System.out.println("fxclock started,sleeptime="+sleeptime);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ie) {
                    jTextField7.insert("WakeUp" + "   " +
                                       (new Time(System.currentTimeMillis() + timeoffset)).toString() + "\n", 0);
                    log(Filename, "WakeUp" + "   " + (new Time(System.currentTimeMillis() + timeoffset)).toString());
                }
                t2 = System.currentTimeMillis() + timeoffset;
                //   System.out.println("stages[0]="+stages[0]);
                if (jCheckBox1.isSelected())
                    u = new URL(jTextField6.getText().trim());
                else if (stages[0] == 1) // && ipstatus==0)
                {
                    u = new URL(links[0]);
                } else if (ipstatus == 0)
                    u = new URL("Http", currentip.trim(), "/" + currentfile.trim());
                else if (ipstatus == 1) {
                    String st = ((String) jComboBox1.getSelectedItem()).trim();
                    if (st.startsWith("www.", 0))
                        st = "http://" + st;
                    u = new URL(st);
                }
                // jTextField7.set

                huc = (HttpURLConnection) u.openConnection();
                huc.setUseCaches(false);
                huc.setDefaultUseCaches(false);
                //huc.setRequestMethod("Post");
                huc.setRequestProperty("Connection", "Keep-Alive");
                t3 = System.currentTimeMillis() + timeoffset;

                in = huc.getInputStream();

                t4 = System.currentTimeMillis() + timeoffset;
                if (in == null) {
                    log(Filename, "In or Br is null" + (new Time(System.currentTimeMillis() + timeoffset)).toString());
                    continue;
                }

                if (!htmlParser(in, Skip, Length, Filetype)) {

                    in.close();
                    t6 = System.currentTimeMillis() + timeoffset;

                    log(Filename,
                        "(t6-t2)" + (t6 - t2) + "\n(t3-t2)" + (t3 - t2) + "\n(t4-t3)" + (t4 - t3) + "\n(t5-t4)" +
                        (t5 - t4) + "\n(t6-t5)" + (t6 - t5) + "\nContinue at " +
                        (new Time(System.currentTimeMillis() + timeoffset)).toString());
                    continue;
                }

                t6 = System.currentTimeMillis() + timeoffset;
                log(Filename,
                    "(t6-t2)" + (t6 - t2) + "\n(t3-t2)" + (t3 - t2) + "\n(t4-t3)" + (t4 - t3) + "\n(t5-t4)" +
                    (t5 - t4) + "\n(t6-t5)" + (t6 - t5) + "\nContinue at " +
                    (new Time(System.currentTimeMillis() + timeoffset)).toString());

                jTextField7.insert("1st Search Time=" + (t6 - t2) + "\n", 0);
                log(Filename, "1st thread Search Time=" + (t6 - t2));
                // tdstatus=0;
            } catch (IOException e) {


                try {
                    //System.out.println(huc.getResponseMessage()+" "+(new Time(System.currentTimeMillis()+timeoffset)).toString());
                    if (huc.getResponseCode() == 403 || huc.getResponseCode() == 503 || huc.getResponseCode() == 404) {
                        t4 = System.currentTimeMillis() + timeoffset;
                        show.setText("0_NO File_" + (int) (Math.random() * 10));
                        log(Filename,
                            "NO File=" + huc.getResponseCode() + ",(t4-t3)=" + (t4 - t3) + ", at " +
                            (new Time(System.currentTimeMillis() + timeoffset)).toString());
                        continue;
                    }
                    log(Filename,
                        e.getMessage() + "\nException at " +
                        (new Time(System.currentTimeMillis() + timeoffset)).toString());
                    continue;
                } catch (IOException ee) {
                    log(Filename,
                        e.getMessage() + "\nat " + (new Time(System.currentTimeMillis() + timeoffset)).toString());
                }

                log(Filename,
                    e.getMessage() + "\nException at " +
                    (new Time(System.currentTimeMillis() + timeoffset)).toString());
                continue;

            } finally {
                try {

                    in.close();
                    in = null;
                    if (huc != null)
                        huc.disconnect();
                } catch (Exception ee) {
                    log(Filename,
                        ee.getMessage() + "\nat " + (new Time(System.currentTimeMillis() + timeoffset)).toString());
                }
                log(Filename, "In Finally Block at " + (new Time(System.currentTimeMillis() + timeoffset)).toString());
                //tdstatus=-1;
            }

            in = null;
            tstart1 = false;
            break;
        }
        jTextField7.insert("First Thread Ended" + "\n", 0);
        log(Filename, "First Thread Ended at" + (new Time(System.currentTimeMillis() + timeoffset)).toString());
        activetdno--;
        jCheckBox2.setEnabled(true);
        jCheckBox2.setSelected(false);
        if (sf != null && activetdno <= 0) {
            log("Prices_" +
                (new Time(System.currentTimeMillis() + timeoffset) + ".txt").toString().replace(":", "_").replace(" ",
                                                                                                                  ""),
                sf.attackerrecord);
        }

    }


    public Attacker(IBDuka sf) throws HeadlessException {
        super();
        this.sf = sf;


        try {
            this.setTitle("Eagle");
            initiate();

            if (System.getProperty("os.name").equalsIgnoreCase("Linux")) {

                source = "jdbc:derby:/media/benton/home/me/Dropbox/forextool;create=false";
                secondSource = "jdbc:derby:/media/windows/Documents and Settings/Zule/DukaDatabase/indexs;create=false";

            }


            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");


            con = DriverManager.getConnection(source);
            ste = con.createStatement();


            temstr = "Select * from WebSites order by name";


            rs = ste.executeQuery(temstr);


            while (rs.next()) {
                jComboBox1.addItem(rs.getString("IPADD"));
                temstr = rs.getString("NAME");
                wsname.addItem(temstr);
                if (temstr.equalsIgnoreCase("AAAAAAAAAA")) {
                    Skip = rs.getInt("SKIP");
                    Length = rs.getInt("Length");
                    Keyword = rs.getString("keyword");
                    if (Keyword != null)
                        Keyword = Keyword.trim().toLowerCase();
                    jTextField3.setText("" + Skip);
                    jTextField4.setText("" + Length);
                    jTextField5.setText(Keyword);
                    emchg = rs.getDouble("emchg");
                    value1.setText("" + emchg);
                    Uemrate = rs.getDouble("uemrate");
                    value2.setText("" + Uemrate);
                    currentip = rs.getString("IP").trim();
                    currentfile = rs.getString("file").trim();
                    ipstatus = rs.getInt("ipstatus");
                    //ipstatus=1;
                    Verifyword = rs.getString("verifyword");
                    if (Verifyword != null)
                        Verifyword = Verifyword.trim().toLowerCase();
                    // if(verifyword!=null)
                    //    verifyword=verifyword.replace(" ", "");
                    jTextField6.setText(Verifyword);
                    Verifylength = rs.getInt("verifylength");
                    value1L.setText("" + Verifylength);
                    indicatorno1 = rs.getInt("contentlength");
                    indicatornoF.setText("" + indicatorno1);
                    Betterword = rs.getString("betterword");
                    if (Betterword != null)
                        Betterword = Betterword.trim().toLowerCase();
                    betterwordF.setText(Betterword);
                    Betterlength = rs.getInt("betterlength");
                    value1R.setText("" + Betterlength);
                    Filetype = rs.getInt("hascode");
                    value3.setText("" + Filetype);
                    jCheckBox3.setSelected(rs.getInt("verifyplace") == 1 ? true : false);
                    stages[0] = rs.getInt("stage");
                    Updatetype = rs.getInt("updatetype");
                    value1L.setText("" + Updatetype);
                    long t = rs.getLong("CreateDT");
                    jTextField7.setText(rs.getString("oldcode"));
                    Oneprevious = rs.getDouble("oneprevious");
                    onepreviousF.setText("" + Oneprevious);
                    Twoprevious = rs.getDouble("twoprevious");
                    twopreviousF.setText("" + Twoprevious);
                    Oneprevious2 = rs.getDouble("threeprevious");
                    // orderquantityF.setText(""+Oneprevious2);
                    Twoprevious2 = rs.getDouble("fourprevious");
                    //timespanF.setText(""+Twoprevious2);
                    onepreviousbase1 = rs.getDouble("onepreviousbase");
                    twopreviousbase1 = rs.getDouble("twopreviousbase");
                    onepreviousBaseF.setText("" + onepreviousbase1);
                    twopreviousBaseF.setText("" + twopreviousbase1);

                    jTextArea1.setText("Keyword:" + Keyword + "\nVerify Word:" + Verifyword + "\nCurrent IP:" +
                                       currentip + "\nCurrent File:" + currentfile + "\nIP Status:" + ipstatus +
                                       "\nSkip:" + Skip + "\nSkip Length:" + Length + "\nFirst Estimate:" + emchg +
                                       "\nSecond Estimate:" + Uemrate + "\nBackward Length:" + Betterlength +
                                       "\nStage:" + stages[0] + "\nModified Date Time:" + (new Date(t)) + " " +
                                       (new Time(t)));

                }

                // System.out.println(currentip+","+jLabel1.getText()+","+ipstatus+","+currentfile);
            }
            jTextField3.setText("" + Skip);
            jTextField4.setText("" + Length);
            jTextField5.setText(Keyword);
            jComboBox1.setSelectedIndex(jComboBox1.getItemCount() - 1);

            rs.close();


            ste.close();
            con.close();
            opstart = true;

            jbInit();
            jSplitPane1.setOneTouchExpandable(true);
            jSplitPane1.setDividerLocation(20);

            wsname.setSelectedItem("FactoryCalendar");


        } catch (Exception e) {
            e.printStackTrace();

        }

        if (sf == null)
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setup(JumpMonitor mp) {
        this.mp = mp;
    }

    public void setDisposeOnClose() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void jbInit5() throws Exception {
        this.setSize(new Dimension(532, 472));
        this.getContentPane().setLayout(null);

        jSplitPane3.setOrientation(JSplitPane.VERTICAL_SPLIT);

        jComboBox1.setBounds(new Rectangle(645, 5, 235, 35));
        jComboBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jComboBox1_actionPerformed(e);
            }
        });
        jComboBox1.setBounds(new Rectangle(235, 245, 30, 25));
        jComboBox1.setEnabled(false);
        jComboBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jComboBox1_actionPerformed(e);
            }
        });
        jTextArea1.setFont(new Font("WenQuanYi Zen Hei Sharp", 0, 11));
        jTextArea1.setLineWrap(true);
        jTextArea1.setEditable(false);
        jButton1.setText("*");
        jButton1.setBounds(new Rectangle(360, 30, 55, 25));
        jButton1.setFont(new Font("Dialog", 1, 18));
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton1_actionPerformed(e);
            }
        });
        jTextField1.setBounds(new Rectangle(5, 90, 350, 25));
        jTextField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jTextField1_actionPerformed(e);
            }
        });
        jTextField2.setBounds(new Rectangle(5, 60, 195, 25));
        jButton2.setText("X");
        jButton2.setBounds(new Rectangle(190, 120, 35, 25));
        jButton2.setFont(new Font("Dialog", 0, 7));
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton2_actionPerformed(e);
            }
        });
        jTextField3.setBounds(new Rectangle(5, 150, 35, 25));
        jTextField3.setText("500");
        jTextField3.setToolTipText("Skip to position");
        jTextField4.setBounds(new Rectangle(45, 150, 40, 25));
        jTextField4.setText("500");
        jTextField4.setToolTipText("skip length");
        jButton3.setText("U");
        jButton3.setBounds(new Rectangle(260, 120, 45, 25));
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton3_actionPerformed(e);
            }
        });
        jTextField5.setBounds(new Rectangle(190, 150, 145, 25));
        jTextField5.setToolTipText("Key word");
        jLabel2.setText("F.Pos");
        jLabel2.setBounds(new Rectangle(90, 150, 50, 25));
        jLabel2.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        jTextField6.setBounds(new Rectangle(190, 180, 145, 25));
        jTextField6.setToolTipText("verifyword");
        jCheckBox1.setBounds(new Rectangle(305, 120, 25, 25));
        jCheckBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jCheckBox1_actionPerformed(e);
            }
        });
        jComboBox2.setBounds(new Rectangle(155, 210, 80, 25));
        value1.setBounds(new Rectangle(5, 5, 250, 25));
        value1.setFont(new Font("Dialog", 0, 14));
        value1.setToolTipText("Estimate1");
        value2.setBounds(new Rectangle(5, 30, 250, 25));
        value2.setFont(new Font("Dialog", 0, 14));
        value2.setToolTipText("Estimate2");
        value3.setBounds(new Rectangle(5, 120, 35, 25));
        value3.setFont(new Font("����", 1, 16));
        value3.setToolTipText("Filetype,TEXT=0,PDF=1,EXCEL=2");
        value3.setText("0");
        value4.setBounds(new Rectangle(5, 210, 50, 25));
        value4.setFont(new Font("����", 1, 16));
        value4.setText("5000");
        value5.setBounds(new Rectangle(125, 210, 30, 25));
        value5.setFont(new Font("����", 1, 16));
        value5.setToolTipText("IPorDSN,Updated When IP Add not available,");
        value5.setText("0");
        value5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                value5_actionPerformed(e);
            }
        });
        value1L.setBounds(new Rectangle(5, 180, 35, 25));
        value1L.setFont(new Font("����", 1, 16));
        value1L.setToolTipText("update type 1=NEWCOME 2=ADDITEM");
        value1L.setText("0");
        value1R.setBounds(new Rectangle(140, 150, 50, 25));
        value1R.setFont(new Font("����", 1, 16));
        value1R.setToolTipText("Backward length");
        value1R.setText("0");
        jCheckBox2.setText("T1");
        jCheckBox2.setBounds(new Rectangle(205, 60, 40, 25));
        jCheckBox2.setToolTipText("Main thread run as First Thread ");
        jCheckBox2.setSelected(false);
        jCheckBox2.setFont(new Font("Dialog", 0, 7));
        jCheckBox2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jCheckBox2_actionPerformed(e);
            }
        });
        interval.setBounds(new Rectangle(100, 210, 25, 25));
        interval.setText("-1");
        interval.setToolTipText("Stage");
        jCheckBox3.setText("X");
        jCheckBox3.setBounds(new Rectangle(225, 120, 35, 25));
        jCheckBox3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jCheckBox3_actionPerformed(e);
            }
        });
        trdthread.setText("3");
        trdthread.setBounds(new Rectangle(40, 125, 35, 15));
        trdthread.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        trdthread.setFont(new Font("Dialog", 0, 9));
        trdthread.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                trdthread_actionPerformed(e);
            }
        });
        td3info.setText("trd3info");
        td3info.setBounds(new Rectangle(5, 50, 250, 15));
        td3info.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        td2info.setText("trd2info");
        td2info.setBounds(new Rectangle(5, 30, 250, 15));
        td2info.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        fourththread.setBounds(new Rectangle(75, 125, 35, 15));
        fourththread.setText("4");
        fourththread.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        fourththread.setFont(new Font("Dialog", 0, 9));
        fourththread.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fourththread_actionPerformed(e);
            }
        });
        fifththread.setBounds(new Rectangle(110, 125, 35, 15));
        fifththread.setText("5");
        fifththread.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        fifththread.setFont(new Font("Dialog", 0, 9));
        fifththread.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fifththread_actionPerformed(e);
            }
        });
        td4info.setBounds(new Rectangle(5, 70, 250, 15));
        td4info.setText("trd4info");
        td4info.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        td5info.setBounds(new Rectangle(5, 90, 250, 15));
        td5info.setText("trd5info");
        td5info.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        td6info.setText("trd6info");
        td6info.setBounds(new Rectangle(5, 110, 250, 15));
        td6info.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        sixththread.setBounds(new Rectangle(145, 125, 35, 15));
        sixththread.setText("6");
        sixththread.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        sixththread.setFont(new Font("Dialog", 0, 9));
        sixththread.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sixththread_actionPerformed(e);
            }
        });
        jTextField7.setLineWrap(true);
        show.setBounds(new Rectangle(5, 0, 500, 25));
        show.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        indicatornoF.setBounds(new Rectangle(45, 180, 40, 25));
        indicatornoF.setToolTipText("Indicator Number");
        betterwordF.setBounds(new Rectangle(90, 180, 100, 25));
        betterwordF.setToolTipText("Betterword");
        onepreviousBaseF.setBounds(new Rectangle(360, 65, 55, 25));
        onepreviousBaseF.setText("0");
        onepreviousBaseF.setToolTipText("Previous Base");
        twopreviousBaseF.setBounds(new Rectangle(360, 90, 55, 25));
        twopreviousBaseF.setText("0");
        twopreviousBaseF.setToolTipText("Previous Base");
        orderpermit.setText("Stop");
        orderpermit.setBounds(new Rectangle(360, 5, 55, 25));
        orderpermit.setForeground(Color.red);
        orderpermit.setToolTipText("Selected to enable order submit");
        orderpermit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                orderpermit_actionPerformed(e);
            }
        });
        botypeC.setBounds(new Rectangle(420, 65, 85, 25));
        botypeC.setToolTipText("In better situation");
        botypeC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                botypeC_actionPerformed(e);
            }
        });
        bctypeC.setBounds(new Rectangle(420, 90, 85, 25));
        bctypeC.setToolTipText("In better situation");
        wotypeC.setBounds(new Rectangle(420, 120, 85, 25));
        wotypeC.setToolTipText("In worse situation");
        wotypeC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                wotypeC_actionPerformed(e);
            }
        });
        wctypeC.setBounds(new Rectangle(420, 150, 85, 25));
        wctypeC.setToolTipText("In worse situation");
        boffsetF.setBounds(new Rectangle(340, 180, 40, 25));
        boffsetF.setText("10");
        boffsetF.setToolTipText(" offset In better situation");
        woffsetF.setBounds(new Rectangle(380, 180, 40, 25));
        woffsetF.setText("10");
        woffsetF.setToolTipText(" offset In worse situation");
        fbtF.setBounds(new Rectangle(340, 120, 40, 25));
        fbtF.setToolTipText("target in better situation");
        fbtF.setText("0");
        fwtF.setBounds(new Rectangle(380, 120, 40, 25));
        fwtF.setToolTipText("target in worse situation");
        fwtF.setText("0");
        sbtF.setBounds(new Rectangle(340, 150, 40, 25));
        sbtF.setToolTipText("target in better situation");
        sbtF.setText("0");
        swtF.setBounds(new Rectangle(380, 150, 40, 25));
        swtF.setToolTipText("target in worse situation");
        swtF.setText("0");
        jSeparator1.setBounds(new Rectangle(0, 0, 0, 2));
        submitC.setBounds(new Rectangle(420, 20, 85, 25));
        submitC.setToolTipText("Submit path selection");
        submitC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                submitC_actionPerformed(e);
            }
        });
        bpermit.setBounds(new Rectangle(420, 5, 25, 15));
        bpermit.setSelected(true);
        bpermit.setToolTipText("General submit better situation");
        wpermit.setBounds(new Rectangle(420, 45, 25, 15));
        wpermit.setSelected(true);
        wpermit.setToolTipText("General submit worse situation");
        bpermit_cad.setBounds(new Rectangle(480, 5, 25, 15));
        bpermit_cad.setFont(new Font("Arial", 0, 12));
        bpermit_cad.setHorizontalAlignment(SwingConstants.TRAILING);
        bpermit_cad.setSelected(true);
        bpermit_cad.setToolTipText("CAD_Submit better situation");
        wpermit_cad.setBounds(new Rectangle(480, 45, 25, 15));
        wpermit_cad.setFont(new Font("Arial", 0, 12));
        wpermit_cad.setHorizontalAlignment(SwingConstants.TRAILING);
        wpermit_cad.setSelected(true);
        wpermit_cad.setToolTipText("CAD_Submit worse situation");
        pricesurgeF.setBounds(new Rectangle(445, 5, 30, 15));
        pricesurgeF.setText("5");
        pricesurgeF.setToolTipText("submit price surge limit");
        pricesurge_cadF.setBounds(new Rectangle(445, 45, 30, 15));
        pricesurge_cadF.setText("5");
        pricesurge_cadF.setToolTipText("submit_cad price surge limit");
        para6.setBounds(new Rectangle(465, 210, 40, 25));
        para1.setBounds(new Rectangle(240, 210, 40, 25));
        para2.setBounds(new Rectangle(285, 210, 40, 25));
        para3.setBounds(new Rectangle(330, 210, 40, 25));
        para4.setBounds(new Rectangle(375, 210, 40, 25));
        para5.setBounds(new Rectangle(420, 210, 40, 25));
        para5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                para5_actionPerformed(e);
            }
        });
        jPanel1.setLayout(null);
        td7info.setBounds(new Rectangle(255, 30, 250, 15));
        td7info.setBorder(BorderFactory.createLineBorder(SystemColor.windowText, 1));
        td7info.setText("trd7info");
        td8info.setBounds(new Rectangle(255, 50, 250, 15));
        td8info.setBorder(BorderFactory.createLineBorder(SystemColor.windowText, 1));
        td8info.setText("trd8info");
        td9info.setBounds(new Rectangle(255, 70, 250, 15));
        td9info.setBorder(BorderFactory.createLineBorder(SystemColor.windowText, 1));
        td9info.setText("trd9info");
        td10info.setBounds(new Rectangle(255, 90, 250, 15));
        td10info.setBorder(BorderFactory.createLineBorder(SystemColor.windowText, 1));
        td10info.setText("trd10info");
        jPanel2.setLayout(null);
        jSplitPane1.setBounds(new Rectangle(5, 5, 510, 430));
        s7thread.setBounds(new Rectangle(180, 125, 35, 15));
        s7thread.setText("7");
        s7thread.setFont(new Font("Dialog", 0, 9));
        s7thread.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                s7thread_actionPerformed(e);
            }
        });
        e8thread.setBounds(new Rectangle(215, 125, 35, 15));
        e8thread.setText("8");
        e8thread.setFont(new Font("Dialog", 0, 9));
        e8thread.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                e8thread_actionPerformed(e);
            }
        });
        n9thread.setBounds(new Rectangle(250, 125, 40, 15));
        n9thread.setText("9 ");
        n9thread.setFont(new Font("Dialog", 0, 9));
        n9thread.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                n9thread_actionPerformed(e);
            }
        });
        t10thread.setBounds(new Rectangle(290, 125, 45, 15));
        t10thread.setText("10");
        t10thread.setFont(new Font("Dialog", 0, 9));
        t10thread.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t10thread_actionPerformed(e);
            }
        });
        td11info.setBounds(new Rectangle(255, 110, 250, 15));
        td11info.setBorder(BorderFactory.createLineBorder(SystemColor.windowText, 1));
        td11info.setText("trd11info");
        t11thread.setBounds(new Rectangle(335, 125, 45, 15));
        t11thread.setText("11");
        t11thread.setFont(new Font("Dialog", 0, 9));
        t11thread.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t11thread_actionPerformed(e);
            }
        });
        trdreset.setBounds(new Rectangle(490, 125, 15, 15));
        trdreset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                trdreset_actionPerformed(e);
            }
        });
        data3show.setBounds(new Rectangle(5, 140, 335, 25));
        data3show.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        data39show.setBounds(new Rectangle(345, 140, 160, 25));
        data39show.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        data4show.setBounds(new Rectangle(5, 170, 335, 25));
        data4show.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        data49show.setBounds(new Rectangle(345, 170, 160, 25));
        data49show.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        wsname.setBounds(new Rectangle(45, 120, 145, 25));
        wsname.setToolTipText("First item is for reset");
        wsname.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                wsname_actionPerformed(e);
            }
        });
        jCheckBox4.setText("u");
        jCheckBox4.setBounds(new Rectangle(245, 60, 35, 25));
        jCheckBox4.setToolTipText("For update,webaddress shown");
        jCheckBox4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jCheckBox4_actionPerformed(e);
            }
        });
        orderquantityF.setBounds(new Rectangle(280, 60, 75, 25));
        orderquantityF.setText("30000");
        orderquantityF.setToolTipText("Quantity");
        timespanF.setBounds(new Rectangle(420, 180, 85, 25));
        timespanF.setText("60000");
        timespanF.setToolTipText("Timespan limit");
        timespanF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pricelimit_actionPerformed(e);
            }
        });
        jButton5.setText("<");
        jButton5.setBounds(new Rectangle(55, 210, 40, 25));
        jButton5.setFont(new Font("Dialog", 0, 6));
        jButton5.setToolTipText("to change sleeptime");
        jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton5_actionPerformed(e);
            }
        });
        secondtd.setText("2");
        secondtd.setBounds(new Rectangle(5, 125, 35, 15));
        secondtd.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        secondtd.setFont(new Font("Dialog", 0, 9));
        secondtd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                secondtd_actionPerformed(e);
            }
        });
        onepreviousF.setBounds(new Rectangle(255, 5, 100, 25));
        onepreviousF.setToolTipText("Previous");
        onepreviousF.setFont(new Font("Dialog", 0, 9));
        twopreviousF.setBounds(new Rectangle(255, 30, 100, 25));
        twopreviousF.setToolTipText("Previous");
        twopreviousF.setFont(new Font("Dialog", 0, 9));
        jPanel1.add(data49show, null);
        jPanel1.add(data4show, null);
        jPanel1.add(data39show, null);
        jPanel1.add(data3show, null);
        jPanel1.add(trdreset, null);
        jPanel1.add(td11info, null);
        jPanel1.add(td10info, null);
        jPanel1.add(td9info, null);
        jPanel1.add(td8info, null);
        jPanel1.add(td7info, null);
        jPanel1.add(show, null);
        jPanel1.add(td6info, null);
        jPanel1.add(td5info, null);
        jPanel1.add(td4info, null);
        jPanel1.add(td2info, null);
        jPanel1.add(td3info, null);
        jPanel1.add(secondtd, null);
        jPanel1.add(trdthread, null);
        jPanel1.add(fourththread, null);
        jPanel1.add(fifththread, null);
        jPanel1.add(sixththread, null);
        jPanel1.add(s7thread, null);
        jPanel1.add(e8thread, null);
        jPanel1.add(n9thread, null);
        jPanel1.add(t10thread, null);
        jPanel1.add(t11thread, null);
        jPanel2.add(woffsetF, null);
        jPanel2.add(boffsetF, null);
        jPanel2.add(wctypeC, null);
        jPanel2.add(wotypeC, null);
        jPanel2.add(bctypeC, null);
        jPanel2.add(botypeC, null);
        jPanel2.add(twopreviousBaseF, null);
        jPanel2.add(onepreviousBaseF, null);
        jPanel2.add(betterwordF, null);
        jPanel2.add(indicatornoF, null);
        jPanel2.add(twopreviousF, null);
        jPanel2.add(onepreviousF, null);
        jPanel2.add(wsname, null);
        jPanel2.add(jCheckBox3, null);
        jPanel2.add(value1R, null);
        jPanel2.add(value1L, null);
        jPanel2.add(value3, null);
        jPanel2.add(value2, null);
        jPanel2.add(value1, null);
        jPanel2.add(jCheckBox1, null);
        jPanel2.add(jTextField6, null);
        jPanel2.add(jLabel2, null);
        jPanel2.add(jTextField5, null);
        jPanel2.add(jButton3, null);
        jPanel2.add(jTextField4, null);
        jPanel2.add(jTextField3, null);
        jPanel2.add(jButton2, null);
        jPanel2.add(jComboBox2, null);
        jPanel2.add(jButton5, null);
        jPanel2.add(value5, null);
        jPanel2.add(value4, null);
        jPanel2.add(para3, null);
        jPanel2.add(para1, null);
        jPanel2.add(para2, null);
        jPanel2.add(para4, null);
        jPanel2.add(para5, null);
        jPanel2.add(para6, null);
        jPanel2.add(interval, null);
        jPanel2.add(jComboBox1, null);
        jPanel2.add(orderquantityF, null);
        jPanel2.add(jCheckBox4, null);
        jPanel2.add(jCheckBox2, null);
        jPanel2.add(jTextField2, null);
        jPanel2.add(jTextField1, null);
        jPanel2.add(timespanF, null);
        jPanel2.add(wpermit_cad, null);
        jPanel2.add(pricesurge_cadF, null);
        jPanel2.add(wpermit, null);
        jPanel2.add(submitC, null);
        jPanel2.add(bpermit_cad, null);
        jPanel2.add(pricesurgeF, null);
        jPanel2.add(bpermit, null);
        jPanel2.add(jButton1, null);
        jPanel2.add(orderpermit, null);
        jPanel2.add(swtF, null);
        jPanel2.add(fwtF, null);
        jPanel2.add(sbtF, null);
        jPanel2.add(fbtF, null);
        jScrollPane2.getViewport().add(jTextField7, null);
        jSplitPane2.add(jScrollPane2, JSplitPane.RIGHT);
        jScrollPane1.getViewport().add(jTextArea1, null);
        jSplitPane2.add(jScrollPane1, JSplitPane.LEFT);
        jSplitPane3.add(jPanel2, JSplitPane.LEFT);
        jSplitPane3.add(jSplitPane2, JSplitPane.RIGHT);
        jSplitPane1.add(jPanel1, JSplitPane.LEFT);
        jSplitPane1.add(jSplitPane3, JSplitPane.RIGHT);
        this.getContentPane().add(jSplitPane1, null);
        this.getContentPane().add(jSeparator1, null);

    }

    private void jbInit() throws Exception {
        this.setSize(new Dimension(564, 431));
        this.getContentPane().setLayout(null);
        jComboBox1.setBounds(new Rectangle(645, 5, 235, 35));
        jComboBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jComboBox1_actionPerformed(e);
            }
        });
        jComboBox1.setBounds(new Rectangle(235, 245, 30, 25));
        jComboBox1.setEnabled(false);
        jComboBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jComboBox1_actionPerformed(e);
            }
        });
        jTextArea1.setFont(new Font("WenQuanYi Zen Hei Sharp", 0, 10));
        jTextArea1.setLineWrap(true);
        jTextArea1.setEditable(false);
        jButton1.setText("*");
        jButton1.setBounds(new Rectangle(360, 30, 55, 25));
        jButton1.setFont(new Font("Dialog", 1, 18));
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton1_actionPerformed(e);
            }
        });
        jTextField1.setBounds(new Rectangle(5, 90, 350, 25));
        jTextField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jTextField1_actionPerformed(e);
            }
        });
        jTextField2.setBounds(new Rectangle(5, 60, 185, 25));
        jButton2.setText("X");
        jButton2.setBounds(new Rectangle(195, 125, 15, 15));
        jButton2.setFont(new Font("Dialog", 0, 7));
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton2_actionPerformed(e);
            }
        });
        jTextField3.setBounds(new Rectangle(5, 150, 35, 25));
        jTextField3.setText("500");
        jTextField3.setToolTipText("Skip to position");
        jTextField4.setBounds(new Rectangle(45, 150, 40, 25));
        jTextField4.setText("500");
        jTextField4.setToolTipText("skip length");
        jButton3.setText("U");
        jButton3.setBounds(new Rectangle(260, 120, 45, 25));
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton3_actionPerformed(e);
            }
        });
        jTextField5.setBounds(new Rectangle(190, 150, 145, 25));
        jTextField5.setToolTipText("Key word");
        jLabel2.setText("F.Pos");
        jLabel2.setBounds(new Rectangle(90, 150, 50, 25));
        jLabel2.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        jTextField6.setBounds(new Rectangle(190, 180, 145, 25));
        jTextField6.setToolTipText("verifyword");
        jCheckBox1.setBounds(new Rectangle(305, 120, 25, 25));
        jCheckBox1.setToolTipText("When this is selected,verified word will be used as website");
        jCheckBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jCheckBox1_actionPerformed(e);
            }
        });
        jComboBox2.setBounds(new Rectangle(155, 210, 80, 25));
        value1.setBounds(new Rectangle(5, 5, 250, 25));
        value1.setToolTipText("Estimate1");
        value2.setBounds(new Rectangle(5, 30, 250, 25));
        value2.setToolTipText("Estimate2");
        value3.setBounds(new Rectangle(5, 120, 35, 25));
        value3.setFont(new Font("����", 1, 16));
        value3.setToolTipText("Filetype,TEXT=0,PDF=1,EXCEL=2");
        value3.setText("0");
        value4.setBounds(new Rectangle(5, 210, 50, 25));
        value4.setFont(new Font("����", 1, 16));
        value4.setText("5000");
        value5.setBounds(new Rectangle(125, 210, 30, 25));
        value5.setFont(new Font("����", 1, 16));
        value5.setToolTipText("IPorDSN,Updated When IP Add not available");
        value5.setText("0");
        value5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                value5_actionPerformed(e);
            }
        });
        value1L.setBounds(new Rectangle(5, 180, 35, 25));
        value1L.setFont(new Font("����", 1, 16));
        value1L.setToolTipText("update type 1=NEWCOME 2=ADDITEM");
        value1L.setText("0");
        value1R.setBounds(new Rectangle(140, 150, 50, 25));
        value1R.setFont(new Font("����", 1, 16));
        value1R.setToolTipText("Backward length");
        value1R.setText("0");
        jCheckBox2.setText("T1");
        jCheckBox2.setBounds(new Rectangle(195, 60, 45, 25));
        jCheckBox2.setToolTipText("Main thread run as First Thread ");
        jCheckBox2.setSelected(false);
        jCheckBox2.setFont(new Font("Dialog", 0, 7));
        jCheckBox2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jCheckBox2_actionPerformed(e);
            }
        });
        interval.setBounds(new Rectangle(100, 210, 25, 25));
        interval.setText("-1");
        interval.setToolTipText("Stage");
        jCheckBox3.setText("X");
        jCheckBox3.setBounds(new Rectangle(220, 120, 35, 25));
        jCheckBox3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jCheckBox3_actionPerformed(e);
            }
        });
        trdthread.setText("3");
        trdthread.setBounds(new Rectangle(40, 125, 35, 15));
        trdthread.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        trdthread.setFont(new Font("Dialog", 0, 9));
        trdthread.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                trdthread_actionPerformed(e);
            }
        });
        td3info.setText("trd3info");
        td3info.setBounds(new Rectangle(5, 50, 250, 15));
        td3info.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        td2info.setText("trd2info");
        td2info.setBounds(new Rectangle(5, 30, 250, 15));
        td2info.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        fourththread.setBounds(new Rectangle(75, 125, 35, 15));
        fourththread.setText("4");
        fourththread.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        fourththread.setFont(new Font("Dialog", 0, 9));
        fourththread.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fourththread_actionPerformed(e);
            }
        });
        fifththread.setBounds(new Rectangle(110, 125, 35, 15));
        fifththread.setText("5");
        fifththread.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        fifththread.setFont(new Font("Dialog", 0, 9));
        fifththread.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fifththread_actionPerformed(e);
            }
        });
        td4info.setBounds(new Rectangle(5, 70, 250, 15));
        td4info.setText("trd4info");
        td4info.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        td5info.setBounds(new Rectangle(5, 90, 250, 15));
        td5info.setText("trd5info");
        td5info.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        td6info.setText("trd6info");
        td6info.setBounds(new Rectangle(5, 110, 250, 15));
        td6info.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        sixththread.setBounds(new Rectangle(145, 125, 35, 15));
        sixththread.setText("6");
        sixththread.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        sixththread.setFont(new Font("Dialog", 0, 9));
        sixththread.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sixththread_actionPerformed(e);
            }
        });
        jTextField7.setLineWrap(true);
        show.setBounds(new Rectangle(5, 0, 500, 25));
        show.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        indicatornoF.setBounds(new Rectangle(45, 180, 40, 25));
        indicatornoF.setToolTipText("Indicator Number");
        betterwordF.setBounds(new Rectangle(90, 180, 100, 25));
        betterwordF.setToolTipText("Betterword");
        onepreviousBaseF.setBounds(new Rectangle(360, 65, 55, 25));
        onepreviousBaseF.setText("0");
        onepreviousBaseF.setToolTipText("Previous Base");
        twopreviousBaseF.setBounds(new Rectangle(360, 90, 55, 25));
        twopreviousBaseF.setText("0");
        twopreviousBaseF.setToolTipText("Previous Base");
        orderpermit.setText("Stop");
        orderpermit.setBounds(new Rectangle(360, 5, 55, 25));
        orderpermit.setForeground(Color.red);
        orderpermit.setToolTipText("Selected to enable order submit");
        orderpermit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                orderpermit_actionPerformed(e);
            }
        });
        botypeC.setBounds(new Rectangle(420, 65, 85, 25));
        botypeC.setToolTipText("In higher situation");
        botypeC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                botypeC_actionPerformed(e);
            }
        });
        bctypeC.setBounds(new Rectangle(420, 90, 85, 25));
        bctypeC.setToolTipText("In higher situation");
        wotypeC.setBounds(new Rectangle(420, 120, 85, 25));
        wotypeC.setToolTipText("In lower situation");
        wotypeC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                wotypeC_actionPerformed(e);
            }
        });
        wctypeC.setBounds(new Rectangle(420, 150, 85, 25));
        wctypeC.setToolTipText("In lower situation");
        boffsetF.setBounds(new Rectangle(340, 180, 40, 25));
        boffsetF.setText("10");
        boffsetF.setToolTipText(" offset In higher situation");
        woffsetF.setBounds(new Rectangle(380, 180, 40, 25));
        woffsetF.setText("10");
        woffsetF.setToolTipText(" offset In lower situation");
        fbtF.setBounds(new Rectangle(340, 120, 40, 25));
        fbtF.setToolTipText("target in higher situation");
        fbtF.setText("0");
        fwtF.setBounds(new Rectangle(380, 120, 40, 25));
        fwtF.setToolTipText("target in lower situation");
        fwtF.setText("0");
        sbtF.setBounds(new Rectangle(340, 150, 40, 25));
        sbtF.setToolTipText("target in higher situation");
        sbtF.setText("0");
        swtF.setBounds(new Rectangle(380, 150, 40, 25));
        swtF.setToolTipText("target in lower situation");
        swtF.setText("0");
        jSeparator1.setBounds(new Rectangle(0, 0, 0, 2));
        submitC.setBounds(new Rectangle(420, 20, 85, 25));
        submitC.setToolTipText("Submit path selection");
        submitC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                submitC_actionPerformed(e);
            }
        });
        bpermit.setBounds(new Rectangle(420, 5, 25, 15));
        bpermit.setSelected(true);
        bpermit.setToolTipText("General submit better situation");
        wpermit.setBounds(new Rectangle(420, 45, 25, 15));
        wpermit.setSelected(true);
        wpermit.setToolTipText("General submit worse situation");
        bpermit_cad.setBounds(new Rectangle(480, 5, 25, 15));
        bpermit_cad.setFont(new Font("Arial", 0, 12));
        bpermit_cad.setHorizontalAlignment(SwingConstants.TRAILING);
        bpermit_cad.setSelected(true);
        bpermit_cad.setToolTipText("CAD_Submit better situation");
        wpermit_cad.setBounds(new Rectangle(480, 45, 25, 15));
        wpermit_cad.setFont(new Font("Arial", 0, 12));
        wpermit_cad.setHorizontalAlignment(SwingConstants.TRAILING);
        wpermit_cad.setSelected(true);
        wpermit_cad.setToolTipText("CAD_Submit worse situation");
        pricesurgeF.setBounds(new Rectangle(445, 5, 30, 15));
        pricesurgeF.setText("5");
        pricesurgeF.setToolTipText("submit price surge limit");
        pricesurge_cadF.setBounds(new Rectangle(445, 45, 30, 15));
        pricesurge_cadF.setText("5");
        pricesurge_cadF.setToolTipText("submit_cad price surge limit");
        para6.setBounds(new Rectangle(465, 210, 40, 25));
        para1.setBounds(new Rectangle(240, 210, 40, 25));
        para2.setBounds(new Rectangle(285, 210, 40, 25));
        para3.setBounds(new Rectangle(330, 210, 40, 25));
        para4.setBounds(new Rectangle(375, 210, 40, 25));
        para5.setBounds(new Rectangle(420, 210, 40, 25));
        para5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                para5_actionPerformed(e);
            }
        });
        jPanel1.setLayout(null);
        td7info.setBounds(new Rectangle(255, 30, 250, 15));
        td7info.setBorder(BorderFactory.createLineBorder(SystemColor.windowText, 1));
        td7info.setText("trd7info");
        td8info.setBounds(new Rectangle(255, 50, 250, 15));
        td8info.setBorder(BorderFactory.createLineBorder(SystemColor.windowText, 1));
        td8info.setText("trd8info");
        td9info.setBounds(new Rectangle(255, 70, 250, 15));
        td9info.setBorder(BorderFactory.createLineBorder(SystemColor.windowText, 1));
        td9info.setText("trd9info");
        td10info.setBounds(new Rectangle(255, 90, 250, 15));
        td10info.setBorder(BorderFactory.createLineBorder(SystemColor.windowText, 1));
        td10info.setText("trd10info");
        jPanel2.setLayout(null);
        jSplitPane1.setBounds(new Rectangle(10, 5, 535, 385));
        jSplitPane1.setOrientation(JSplitPane.VERTICAL_SPLIT);
        s7thread.setBounds(new Rectangle(180, 125, 35, 15));
        s7thread.setText("7");
        s7thread.setFont(new Font("Dialog", 0, 9));
        s7thread.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                s7thread_actionPerformed(e);
            }
        });
        e8thread.setBounds(new Rectangle(215, 125, 35, 15));
        e8thread.setText("8");
        e8thread.setFont(new Font("Dialog", 0, 9));
        e8thread.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                e8thread_actionPerformed(e);
            }
        });
        n9thread.setBounds(new Rectangle(250, 125, 40, 15));
        n9thread.setText("9 ");
        n9thread.setFont(new Font("Dialog", 0, 9));
        n9thread.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                n9thread_actionPerformed(e);
            }
        });
        t10thread.setBounds(new Rectangle(290, 125, 45, 15));
        t10thread.setText("10");
        t10thread.setFont(new Font("Dialog", 0, 9));
        t10thread.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t10thread_actionPerformed(e);
            }
        });
        td11info.setBounds(new Rectangle(255, 110, 250, 15));
        td11info.setBorder(BorderFactory.createLineBorder(SystemColor.windowText, 1));
        td11info.setText("trd11info");
        t11thread.setBounds(new Rectangle(335, 125, 45, 15));
        t11thread.setText("11");
        t11thread.setFont(new Font("Dialog", 0, 9));
        t11thread.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t11thread_actionPerformed(e);
            }
        });
        trdreset.setBounds(new Rectangle(490, 125, 15, 15));
        trdreset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                trdreset_actionPerformed(e);
            }
        });
        data3show.setBounds(new Rectangle(5, 140, 335, 25));
        data3show.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        data39show.setBounds(new Rectangle(345, 140, 160, 25));
        data39show.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        data4show.setBounds(new Rectangle(5, 170, 335, 25));
        data4show.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        data49show.setBounds(new Rectangle(345, 170, 160, 25));
        data49show.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        jSplitPane3.setOrientation(JSplitPane.VERTICAL_SPLIT);
        wsname.setBounds(new Rectangle(45, 120, 145, 25));
        wsname.setToolTipText("First item is for reset");
        wsname.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                wsname_actionPerformed(e);
            }
        });
        jCheckBox4.setText("u");
        jCheckBox4.setBounds(new Rectangle(245, 60, 35, 25));
        jCheckBox4.setToolTipText("For update,webaddress shown");
        jCheckBox4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jCheckBox4_actionPerformed(e);
            }
        });
        orderquantityF.setBounds(new Rectangle(280, 60, 75, 25));
        orderquantityF.setText("30000");
        orderquantityF.setToolTipText("Quantity");
        timespanF.setBounds(new Rectangle(420, 180, 85, 25));
        timespanF.setText("60000");
        timespanF.setToolTipText("Timespan limit");
        timespanF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pricelimit_actionPerformed(e);
            }
        });
        jButton5.setText("<");
        jButton5.setBounds(new Rectangle(55, 210, 40, 25));
        jButton5.setFont(new Font("Dialog", 0, 6));
        jButton5.setToolTipText("to change sleeptime");
        jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton5_actionPerformed(e);
            }
        });
        secondtd.setText("2");
        secondtd.setBounds(new Rectangle(5, 125, 35, 15));
        secondtd.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        secondtd.setFont(new Font("Dialog", 0, 9));
        secondtd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                secondtd_actionPerformed(e);
            }
        });
        onepreviousF.setBounds(new Rectangle(255, 5, 100, 25));
        onepreviousF.setToolTipText("Previous");
        onepreviousF.setFont(new Font("Dialog", 0, 9));
        twopreviousF.setBounds(new Rectangle(255, 30, 100, 25));
        twopreviousF.setToolTipText("Previous");
        twopreviousF.setFont(new Font("Dialog", 0, 9));
        jPanel1.add(data49show, null);
        jPanel1.add(data4show, null);
        jPanel1.add(data39show, null);
        jPanel1.add(data3show, null);
        jPanel1.add(trdreset, null);
        jPanel1.add(td11info, null);
        jPanel1.add(td10info, null);
        jPanel1.add(td9info, null);
        jPanel1.add(td8info, null);
        jPanel1.add(td7info, null);
        jPanel1.add(show, null);
        jPanel1.add(td6info, null);
        jPanel1.add(td5info, null);
        jPanel1.add(td4info, null);
        jPanel1.add(td2info, null);
        jPanel1.add(td3info, null);
        jPanel1.add(secondtd, null);
        jPanel1.add(trdthread, null);
        jPanel1.add(fourththread, null);
        jPanel1.add(fifththread, null);
        jPanel1.add(sixththread, null);
        jPanel1.add(s7thread, null);
        jPanel1.add(e8thread, null);
        jPanel1.add(n9thread, null);
        jPanel1.add(t10thread, null);
        jPanel1.add(t11thread, null);
        jPanel2.add(woffsetF, null);
        jPanel2.add(boffsetF, null);
        jPanel2.add(wctypeC, null);
        jPanel2.add(wotypeC, null);
        jPanel2.add(bctypeC, null);
        jPanel2.add(botypeC, null);
        jPanel2.add(twopreviousBaseF, null);
        jPanel2.add(onepreviousBaseF, null);
        jPanel2.add(betterwordF, null);
        jPanel2.add(indicatornoF, null);
        jPanel2.add(twopreviousF, null);
        jPanel2.add(onepreviousF, null);
        jPanel2.add(wsname, null);
        jPanel2.add(jCheckBox3, null);
        jPanel2.add(value1R, null);
        jPanel2.add(value1L, null);
        jPanel2.add(value3, null);
        jPanel2.add(value2, null);
        jPanel2.add(value1, null);
        jPanel2.add(jCheckBox1, null);
        jPanel2.add(jTextField6, null);
        jPanel2.add(jLabel2, null);
        jPanel2.add(jTextField5, null);
        jPanel2.add(jButton3, null);
        jPanel2.add(jTextField4, null);
        jPanel2.add(jTextField3, null);
        jPanel2.add(jButton2, null);
        jPanel2.add(jComboBox2, null);
        jPanel2.add(jButton5, null);
        jPanel2.add(value5, null);
        jPanel2.add(value4, null);
        jPanel2.add(para3, null);
        jPanel2.add(para1, null);
        jPanel2.add(para2, null);
        jPanel2.add(para4, null);
        jPanel2.add(para5, null);
        jPanel2.add(para6, null);
        jPanel2.add(interval, null);
        jPanel2.add(jComboBox1, null);
        jPanel2.add(orderquantityF, null);
        jPanel2.add(jCheckBox4, null);
        jPanel2.add(jTextField2, null);
        jPanel2.add(jTextField1, null);
        jPanel2.add(timespanF, null);
        jPanel2.add(wpermit_cad, null);
        jPanel2.add(pricesurge_cadF, null);
        jPanel2.add(wpermit, null);
        jPanel2.add(submitC, null);
        jPanel2.add(bpermit_cad, null);
        jPanel2.add(pricesurgeF, null);
        jPanel2.add(bpermit, null);
        jPanel2.add(jButton1, null);
        jPanel2.add(orderpermit, null);
        jPanel2.add(swtF, null);
        jPanel2.add(fwtF, null);
        jPanel2.add(sbtF, null);
        jPanel2.add(fbtF, null);
        jPanel2.add(jCheckBox2, null);
        jScrollPane2.getViewport().add(jTextField7, null);
        jSplitPane2.add(jScrollPane2, JSplitPane.RIGHT);
        jScrollPane1.getViewport().add(jTextArea1, null);
        jSplitPane2.add(jScrollPane1, JSplitPane.LEFT);
        jSplitPane3.add(jSplitPane2, JSplitPane.BOTTOM);
        jSplitPane3.add(jPanel2, JSplitPane.TOP);
        jSplitPane1.add(jSplitPane3, JSplitPane.BOTTOM);
        jSplitPane1.add(jPanel1, JSplitPane.TOP);
        this.getContentPane().add(jSplitPane1, null);
        this.getContentPane().add(jSeparator1, null);
    }

    private void jbInit2() throws Exception {
        jComboBox1.setBounds(new Rectangle(645, 5, 235, 35));
        jComboBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jComboBox1_actionPerformed(e);
            }
        });
        jComboBox1.setBounds(new Rectangle(85, 390, 30, 25));
        jComboBox1.setEnabled(false);
        jComboBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jComboBox1_actionPerformed(e);
            }
        });
        jTextArea1.setFont(new Font("WenQuanYi Zen Hei Sharp", 0, 12));
        jTextArea1.setLineWrap(true);
        jTextArea1.setEditable(false);
        jScrollPane1.setBounds(new Rectangle(510, 5, 245, 145));
        jButton1.setText("*");
        jButton1.setBounds(new Rectangle(450, 315, 55, 25));
        jButton1.setFont(new Font("Dialog", 1, 18));
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton1_actionPerformed(e);
            }
        });
        jTextField1.setBounds(new Rectangle(5, 315, 350, 25));
        jTextField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jTextField1_actionPerformed(e);
            }
        });
        jTextField2.setBounds(new Rectangle(5, 285, 195, 25));
        jButton2.setText("X");
        jButton2.setBounds(new Rectangle(205, 255, 40, 25));
        jButton2.setFont(new Font("Dialog", 0, 7));
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton2_actionPerformed(e);
            }
        });
        jScrollPane7.setBounds(new Rectangle(360, 35, 145, 100));
        jScrollPane7.setToolTipText("Unused");
        jTextField3.setBounds(new Rectangle(5, 195, 35, 25));
        jTextField3.setText("500");
        jTextField3.setToolTipText("Skip to position");
        jTextField4.setBounds(new Rectangle(45, 195, 40, 25));
        jTextField4.setText("500");
        jTextField4.setToolTipText("skip length");
        jButton3.setText("U");
        jButton3.setBounds(new Rectangle(280, 255, 45, 25));
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton3_actionPerformed(e);
            }
        });
        jTextField5.setBounds(new Rectangle(205, 195, 150, 25));
        jTextField5.setToolTipText("Key word");
        jLabel2.setText("F.Pos");
        jLabel2.setBounds(new Rectangle(90, 195, 50, 25));
        jLabel2.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        jTextField6.setBounds(new Rectangle(205, 225, 150, 25));
        jTextField6.setToolTipText("verifyword");
        jCheckBox1.setBounds(new Rectangle(330, 255, 25, 25));
        jCheckBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jCheckBox1_actionPerformed(e);
            }
        });
        jComboBox2.setBounds(new Rectangle(165, 360, 75, 25));
        value1.setBounds(new Rectangle(5, 135, 195, 25));
        value1.setFont(new Font("����", 1, 16));
        value1.setToolTipText("Estimate1");
        value2.setBounds(new Rectangle(5, 165, 195, 25));
        value2.setFont(new Font("����", 1, 16));
        value2.setToolTipText("Estimate2");
        value3.setBounds(new Rectangle(5, 255, 35, 25));
        value3.setFont(new Font("����", 1, 16));
        value3.setToolTipText("Filetype,TEXT=0,PDF=1,EXCEL=2");
        value3.setText("0");
        value4.setBounds(new Rectangle(5, 360, 70, 25));
        value4.setFont(new Font("����", 1, 16));
        value4.setText("5000");
        value5.setBounds(new Rectangle(130, 360, 30, 25));
        value5.setFont(new Font("����", 1, 16));
        value5.setToolTipText("IPorDSN,Updated When IP Add not available");
        value5.setText("0");
        value5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                value5_actionPerformed(e);
            }
        });
        value1L.setBounds(new Rectangle(5, 225, 35, 25));
        value1L.setFont(new Font("����", 1, 16));
        value1L.setToolTipText("update type 1=NEWCOME 2=ADDITEM");
        value1L.setText("0");
        value1R.setBounds(new Rectangle(145, 195, 50, 25));
        value1R.setFont(new Font("����", 1, 16));
        value1R.setToolTipText("Backward length");
        value1R.setText("0");
        jCheckBox2.setText("T1");
        jCheckBox2.setBounds(new Rectangle(205, 285, 40, 25));
        jCheckBox2.setToolTipText("Main thread run as First Thread ");
        jCheckBox2.setSelected(false);
        jCheckBox2.setFont(new Font("Dialog", 0, 7));
        jCheckBox2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jCheckBox2_actionPerformed(e);
            }
        });
        interval.setBounds(new Rectangle(5, 390, 45, 20));
        interval.setText("-1");
        interval.setToolTipText("Stage");
        jCheckBox3.setText("X");
        jCheckBox3.setBounds(new Rectangle(245, 255, 35, 25));
        jCheckBox3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jCheckBox3_actionPerformed(e);
            }
        });
        trdthread.setText("Third Tread");
        trdthread.setBounds(new Rectangle(205, 55, 150, 15));
        trdthread.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        trdthread.setFont(new Font("Dialog", 0, 9));
        trdthread.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                trdthread_actionPerformed(e);
            }
        });
        td3info.setText("trd3info");
        td3info.setBounds(new Rectangle(5, 55, 195, 15));
        td3info.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        td2info.setText("trd2info");
        td2info.setBounds(new Rectangle(5, 35, 195, 15));
        td2info.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        fourththread.setBounds(new Rectangle(205, 75, 150, 15));
        fourththread.setText("FourthThread");
        fourththread.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        fourththread.setFont(new Font("Dialog", 0, 9));
        fourththread.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fourththread_actionPerformed(e);
            }
        });
        fifththread.setBounds(new Rectangle(205, 95, 150, 15));
        fifththread.setText("Fifth Thread");
        fifththread.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        fifththread.setFont(new Font("Dialog", 0, 9));
        fifththread.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fifththread_actionPerformed(e);
            }
        });
        td4info.setBounds(new Rectangle(5, 75, 195, 15));
        td4info.setText("trd4info");
        td4info.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        td5info.setBounds(new Rectangle(5, 95, 195, 15));
        td5info.setText("trd5info");
        td5info.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        td6info.setText("trd6info");
        td6info.setBounds(new Rectangle(5, 115, 195, 15));
        td6info.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        sixththread.setBounds(new Rectangle(205, 115, 150, 15));
        sixththread.setText("Sixth Thread");
        sixththread.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        sixththread.setFont(new Font("Dialog", 0, 9));
        sixththread.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sixththread_actionPerformed(e);
            }
        });
        jScrollPane2.setBounds(new Rectangle(510, 155, 245, 185));
        jTextField7.setLineWrap(true);
        show.setBounds(new Rectangle(5, 5, 500, 25));
        show.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        indicatornoF.setBounds(new Rectangle(45, 225, 40, 25));
        indicatornoF.setToolTipText("Indicator Number");
        betterwordF.setBounds(new Rectangle(90, 225, 110, 25));
        betterwordF.setToolTipText("Betterword");
        onepreviousBaseF.setBounds(new Rectangle(360, 135, 55, 25));
        onepreviousBaseF.setText("0");
        onepreviousBaseF.setToolTipText("Previous Base");
        twopreviousBaseF.setBounds(new Rectangle(360, 165, 55, 25));
        twopreviousBaseF.setText("0");
        twopreviousBaseF.setToolTipText("Previous Base");
        orderpermit.setText("Stop");
        orderpermit.setBounds(new Rectangle(450, 285, 55, 25));
        orderpermit.setForeground(Color.red);
        orderpermit.setToolTipText("Selected to enable order submit");
        orderpermit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                orderpermit_actionPerformed(e);
            }
        });
        botypeC.setBounds(new Rectangle(360, 195, 85, 25));
        botypeC.setToolTipText("In better situation");
        botypeC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                botypeC_actionPerformed(e);
            }
        });
        bctypeC.setBounds(new Rectangle(360, 225, 85, 25));
        bctypeC.setToolTipText("In better situation");
        wotypeC.setBounds(new Rectangle(360, 255, 85, 25));
        wotypeC.setToolTipText("In worse situation");
        wotypeC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                wotypeC_actionPerformed(e);
            }
        });
        wctypeC.setBounds(new Rectangle(360, 285, 85, 25));
        wctypeC.setToolTipText("In worse situation");
        boffsetF.setBounds(new Rectangle(360, 315, 40, 25));
        boffsetF.setText("10");
        boffsetF.setToolTipText(" offset In better situation");
        woffsetF.setBounds(new Rectangle(405, 315, 40, 25));
        woffsetF.setText("10");
        woffsetF.setToolTipText(" offset In worse situation");
        fbtF.setBounds(new Rectangle(420, 135, 40, 25));
        fbtF.setToolTipText("target in better situation");
        fbtF.setText("0");
        fwtF.setBounds(new Rectangle(465, 135, 40, 25));
        fwtF.setToolTipText("target in worse situation");
        fwtF.setText("0");
        sbtF.setBounds(new Rectangle(420, 165, 40, 25));
        sbtF.setToolTipText("target in better situation");
        sbtF.setText("0");
        swtF.setBounds(new Rectangle(465, 165, 40, 25));
        swtF.setToolTipText("target in worse situation");
        swtF.setText("0");
        jSeparator1.setBounds(new Rectangle(0, 0, 0, 2));
        submitC.setBounds(new Rectangle(450, 210, 55, 25));
        submitC.setToolTipText("Submit path selection");
        submitC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                submitC_actionPerformed(e);
            }
        });
        bpermit.setBounds(new Rectangle(450, 195, 15, 15));
        bpermit.setSelected(true);
        bpermit.setToolTipText("General submit better situation");
        wpermit.setBounds(new Rectangle(450, 235, 15, 15));
        wpermit.setSelected(true);
        wpermit.setToolTipText("General submit worse situation");
        bpermit_cad.setBounds(new Rectangle(490, 195, 15, 15));
        bpermit_cad.setFont(new Font("Arial", 0, 12));
        bpermit_cad.setHorizontalAlignment(SwingConstants.TRAILING);
        bpermit_cad.setSelected(true);
        bpermit_cad.setToolTipText("CAD_Submit better situation");
        wpermit_cad.setBounds(new Rectangle(490, 235, 15, 15));
        wpermit_cad.setFont(new Font("Arial", 0, 12));
        wpermit_cad.setHorizontalAlignment(SwingConstants.TRAILING);
        wpermit_cad.setSelected(true);
        wpermit_cad.setToolTipText("CAD_Submit worse situation");
        pricesurgeF.setBounds(new Rectangle(465, 195, 25, 15));
        pricesurgeF.setText("5");
        pricesurgeF.setToolTipText("submit price surge limit");
        pricesurge_cadF.setBounds(new Rectangle(465, 235, 25, 15));
        pricesurge_cadF.setText("5");
        pricesurge_cadF.setToolTipText("submit_cad price surge limit");
        para6.setBounds(new Rectangle(595, 365, 50, 20));
        para1.setBounds(new Rectangle(320, 365, 50, 20));
        para2.setBounds(new Rectangle(375, 365, 50, 20));
        para3.setBounds(new Rectangle(430, 365, 50, 20));
        para4.setBounds(new Rectangle(485, 365, 50, 20));
        para5.setBounds(new Rectangle(540, 365, 50, 20));
        wsname.setBounds(new Rectangle(45, 255, 155, 25));
        wsname.setToolTipText("First item is for reset");
        wsname.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                wsname_actionPerformed(e);
            }
        });
        jCheckBox4.setText("u");
        jCheckBox4.setBounds(new Rectangle(245, 285, 35, 25));
        jCheckBox4.setToolTipText("For update,webaddress shown");
        jCheckBox4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jCheckBox4_actionPerformed(e);
            }
        });
        orderquantityF.setBounds(new Rectangle(280, 285, 75, 25));
        orderquantityF.setText("30000");
        orderquantityF.setToolTipText("Quantity");
        timespanF.setBounds(new Rectangle(450, 255, 55, 25));
        timespanF.setText("60000");
        timespanF.setToolTipText("Timespan limit");
        timespanF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pricelimit_actionPerformed(e);
            }
        });
        jButton5.setText("<");
        jButton5.setBounds(new Rectangle(80, 360, 45, 25));
        jButton5.setFont(new Font("Dialog", 0, 6));
        jButton5.setToolTipText("to change sleeptime");
        jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton5_actionPerformed(e);
            }
        });
        secondtd.setText("Second Tread");
        secondtd.setBounds(new Rectangle(205, 35, 150, 15));
        secondtd.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        secondtd.setFont(new Font("Dialog", 0, 9));
        secondtd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                secondtd_actionPerformed(e);
            }
        });
        onepreviousF.setBounds(new Rectangle(205, 135, 150, 25));
        onepreviousF.setToolTipText("Previous");
        twopreviousF.setBounds(new Rectangle(205, 165, 150, 25));
        twopreviousF.setToolTipText("Previous");
        jScrollPane2.getViewport().add(jTextField7, null);
        viewer.add(para5, null);
        viewer.add(para4, null);
        viewer.add(para3, null);
        viewer.add(para2, null);
        viewer.add(para1, null);
        viewer.add(para6, null);
        viewer.add(pricesurge_cadF, null);
        viewer.add(pricesurgeF, null);
        viewer.add(wpermit_cad, null);
        viewer.add(bpermit_cad, null);
        viewer.add(wpermit, null);
        viewer.add(bpermit, null);
        viewer.add(submitC, null);
        viewer.add(swtF, null);
        viewer.add(sbtF, null);
        viewer.add(fwtF, null);
        viewer.add(jSeparator1, null);
        viewer.add(fbtF, null);
        viewer.add(woffsetF, null);
        viewer.add(boffsetF, null);
        viewer.add(wctypeC, null);
        viewer.add(wotypeC, null);
        viewer.add(bctypeC, null);
        viewer.add(botypeC, null);
        viewer.add(orderpermit, null);
        viewer.add(twopreviousBaseF, null);
        viewer.add(onepreviousBaseF, null);
        viewer.add(betterwordF, null);
        viewer.add(indicatornoF, null);
        viewer.add(show, null);
        viewer.add(jScrollPane2, null);
        viewer.add(sixththread, null);
        viewer.add(td6info, null);
        viewer.add(td5info, null);
        viewer.add(td4info, null);
        viewer.add(fifththread, null);
        viewer.add(fourththread, null);
        viewer.add(td2info, null);
        viewer.add(td3info, null);
        viewer.add(trdthread, null);
        viewer.add(twopreviousF, null);
        viewer.add(onepreviousF, null);
        viewer.add(secondtd, null);
        viewer.add(jButton5, null);
        viewer.add(timespanF, null);
        viewer.add(orderquantityF, null);
        viewer.add(jCheckBox4, null);
        viewer.add(wsname, null);
        viewer.add(jCheckBox3, null);
        viewer.add(interval, null);
        viewer.add(jCheckBox2, null);
        viewer.add(value1R, null);
        viewer.add(value1L, null);
        viewer.add(value5, null);
        viewer.add(value4, null);
        viewer.add(value3, null);
        viewer.add(value2, null);
        viewer.add(value1, null);
        viewer.add(jComboBox2, null);
        viewer.add(jCheckBox1, null);
        viewer.add(jTextField6, null);
        viewer.add(jLabel2, null);
        viewer.add(jTextField5, null);
        viewer.add(jButton3, null);
        viewer.add(jTextField4, null);
        viewer.add(jTextField3, null);
        //        jScrollPane7.getViewport().add(jList6, null);
        viewer.add(jScrollPane7, null);
        viewer.add(jButton2, null);
        viewer.add(jTextField2, null);
        viewer.add(jTextField1, null);
        viewer.add(jButton1, null);
        jScrollPane1.getViewport().add(jTextArea1, null);
        viewer.add(jScrollPane1, null);
        viewer.add(jComboBox1, null);

    }


    private void jTextField1_actionPerformed(ActionEvent e) {
        if (jTextField1.getText() == null || jTextField1.getText().trim().length() == 0 ||
            jTextField2.getText() == null || jTextField2.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "2 fields must be filled");
            return;
        }
        try {

            con = DriverManager.getConnection(source);
            PreparedStatement pst = null;
            String str = "";
            int n = 0;
            int m = 0;

            if (jCheckBox4.isSelected()) {
                if (JOptionPane.showConfirmDialog(null, "Really update it:", "Please Select",
                                                  JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION)
                    return;
                String[] strs = this.getHostFile(jTextField1.getText().trim());
                currentip = strs[0];
                currentfile = strs[1];

                str =
                    "update Websites set IPADD=?,createdt=?,ip=?,file=? where NAME='" +
                    ((String) wsname.getSelectedItem()).trim() + "'";
                pst = con.prepareStatement(str);
                pst.setString(1, jTextField1.getText());
                pst.setLong(2, System.currentTimeMillis() + timeoffset);
                pst.setString(3, currentip);
                pst.setString(4, currentfile);
                temint = pst.executeUpdate();
                if (temint > 0) {
                    n = jComboBox1.getSelectedIndex();
                    jComboBox1.removeItemAt(n);
                    jComboBox1.setSelectedIndex(jComboBox1.getItemCount() - 1);
                    jComboBox1.addItem(jTextField1.getText().trim());


                    Object o = wsname.getItemAt(n);
                    wsname.removeItemAt(n);
                    wsname.addItem(o);
                    wsname.setSelectedIndex(wsname.getItemCount() - 1);


                }

            } else {
                str = "Insert into Websites(createdt,name,ipadd,ip,file) Values(?,?,?,?,?)";

                pst = con.prepareStatement(str);

                pst.setLong(1, System.currentTimeMillis() + timeoffset);
                pst.setString(2, jTextField2.getText());
                pst.setString(3, jTextField1.getText());

                String tem = "";
                InetAddress address = null;

                tem = jTextField1.getText();
                tem = tem.toLowerCase();
                if (tem.startsWith("http://", 0)) {
                    m = 7;

                } else if (tem.startsWith("www.", 0)) {
                    m = 0;
                }
                n = tem.indexOf("/", m);
                currentfile = tem.substring(n + 1);
                pst.setString(5, currentfile);
                tem = tem.substring(m, n);
                address = InetAddress.getByName(tem);
                currentip = address.getHostAddress();
                // System.out.println(currentfile+" "+currentip);

                pst.setString(4, currentip);

                temint = pst.executeUpdate();
                if (temint > 0) {
                    jComboBox1.addItem(jTextField1.getText());
                    wsname.addItem(jTextField2.getText());
                    wsname.setSelectedIndex(wsname.getItemCount() - 1);
                }
            }


            pst.close();
            con.close();
        } catch (Exception sqle) {
            sqle.printStackTrace();
            //  targetModel.addElement("Option Update Error");
        }
    }

    public void threadOP() {
        jTextField7.insert("start\n", 0);
        if (sf != null)
            sf.attackerrecord = "";

        value1.setText("");
        value2.setText("");
        value1R.setText("");
        value1L.setText("");
        value1R.setText("");
        value1L.setText("");
        value3.setText("");
        value4.setText("");
        value5.setText("");
        //value2.setText("");

        value1L.setForeground(Color.black);
        value1R.setForeground(Color.black);
        value1.setForeground(Color.black);
        value2.setForeground(Color.black);
        value3.setForeground(Color.black);
        value4.setForeground(Color.black);
        value5.setForeground(Color.black);
        onepreviousF.setForeground(Color.black);
        twopreviousF.setForeground(Color.black);
        orderquantityF.setForeground(Color.black);
        timespanF.setForeground(Color.black);

        g_a_status[0] = false;
        g_a_status[1] = false;
        g_a_status[2] = false;
        g_a_status[3] = false;
        g_a_status[4] = false;
        g_a_status[5] = false;


        //       LMode7.clear();

        bdata1 = true;
        ordersubmit = true; //for test purpose;
        bdata = true;
        if (sf != null) {
            sf.timespan = 10000;
            sleeptime = 16000;
        } //else
        //      sleeptime=(interval.getText().trim()).equalsIgnoreCase("-1")? 60000 : (1000*Integer.parseInt(interval.getText().trim()));


        t1 = System.currentTimeMillis() + timeoffset;
        temstr = "";
        Filename =
            (String) wsname.getSelectedItem() + "_" + (new Date(System.currentTimeMillis() + timeoffset)).toString() +
            "_" + (new Time(System.currentTimeMillis() + timeoffset)).toString() + ".txt";
        Filename = Filename.replace(":", "_");
        Filename = Filename.replace(" ", "");
        log(Filename,
            Filename + "\nKeyword:" + Keyword + "\nVerify Word:" + Verifyword + "\nCurrent IP:" + currentip +
            "\nCurrent File:" + currentfile + "\nIP Status:" + ipstatus + "\nSkip:" + Skip + "\nSkip Length:" + Length +
            "\nFirst Estimate:" + emchg + "\nSecond Estimate:" + Uemrate + "\nBackward Length:" + Betterlength +
            "\nStage:" + stages[0] + "\nUpdatetype:" + Updatetype + "\nFiletye:" + Filetype);

        if (jCheckBox1.isSelected())
            setUrl((jTextField6.getText()).trim(), 1); //("http://www.plink-search.com/headline.xml",2);
        else
            setUrl(((String) (jComboBox1.getSelectedItem())).trim(), 0);

        if (secondtd.isSelected()) {
            rd2 = new Thread(std);
            rd2.start();

        }
        if (trdthread.isSelected()) {
            rd3 = new Thread(trd);
            rd3.start();

        }
        if (fourththread.isSelected()) {
            rd4 = new Thread(f4rd);
            rd4.start();

        }
        if (fifththread.isSelected()) {
            rd5 = new Thread(f5rd);
            rd5.start();

        }

        if (sixththread.isSelected()) {
            rd6 = new Thread(s6rd);
            rd6.start();

        }

        if (s7thread.isSelected()) {
            rd7 = new Thread(td7);
            rd7.start();

        }

        if (e8thread.isSelected()) {
            rd8 = new Thread(td8);
            rd8.start();

        }

        if (n9thread.isSelected()) {
            rd9 = new Thread(td9);
            rd9.start();

        }

        if (t10thread.isSelected()) {
            rd10 = new Thread(td10);
            rd10.start();

        }

        if (t11thread.isSelected()) {
            rd11 = new Thread(td11);
            rd11.start();

        }


        t7 = System.currentTimeMillis() + timeoffset;


        log(Filename,
            "(7-1)" + (t7 - t1) + "\n(t2-t1)" + (t2 - t1) + "\n(t3-t2)" + (t3 - t2) + "\n(t4-t3)" + (t4 - t5) +
            "\n(t6-65)" + (t6 - t5) + "\nContinue at " +
            (new Time(System.currentTimeMillis() + timeoffset)).toString());

        log(Filename, "Main thread ended at " + (new Time(System.currentTimeMillis() + timeoffset)).toString());


    }

    private void jButton1_actionPerformed(ActionEvent e) {

        threadOP();
    }

    private void setUrl(String currentip, String currentfile) {


        t2 = System.currentTimeMillis() + timeoffset;
        try {


            if (jCheckBox2.isSelected()) {

                tstart1 = true;
                rd = new Thread(this);
                rd.start();
                // jButton3.setEnabled(true);
            } else {
                log(Filename, "Start at " + (new Time(System.currentTimeMillis() + timeoffset)).toString());
                if (ipstatus == 0) {
                    u = new URL("Http", currentip.trim(), "/" + currentfile.trim());
                    //System.out.println("ipstatuse=0");
                } else if (ipstatus == 1 && jCheckBox1.isSelected())
                    u = new URL((jTextField6.getText()).trim());
                else if (ipstatus == 1) {
                    String st = ((String) jComboBox1.getSelectedItem()).trim();
                    if (st.startsWith("www.", 0))
                        st = "http://" + st;
                    u = new URL(st);
                }
                // u=new URL("http://www.investing.com");///rates-bonds/government-bond-spreads");
                huc = (HttpURLConnection) u.openConnection();
                huc.setDefaultUseCaches(false);
                huc.setUseCaches(false);

                //huc.setRequestMethod("Post");

                int te = huc.getResponseCode();
                if (te == 403) {
                    System.out.println("RspCode=" + te);
                    huc.disconnect();
                    return;
                }
                t3 = System.currentTimeMillis() + timeoffset;

                in = huc.getInputStream();

                t4 = System.currentTimeMillis() + timeoffset;

                htmlParser(in, Integer.parseInt(jTextField3.getText()), Integer.parseInt(jTextField4.getText()),
                           Filetype);

                in.close();
                in = null;

                huc.disconnect();
                huc = null;
                u = null;
                t5 = System.currentTimeMillis() + timeoffset;


            }

        } catch (Exception e) {
            e.printStackTrace();
            try {

                in.close();
                in = null;
                huc.disconnect();
            } catch (Exception ee) {
            }

        }
        t6 = System.currentTimeMillis() + timeoffset;

        jTextField7.insert("Main thread Ended\n", 0);


        //  System.out.println(log);

    }

    private boolean TEST_DES(String str, String filename, String verifyword, int threadid) {
        int n0 = str.indexOf("<title></title>");
        if (n0 > 0)
            n0 = str.indexOf("<item>");

        n0 = str.indexOf("<item>", n0 + 1);
        n0 = str.indexOf("<description", n0 + 1);
        int n1 = str.indexOf("</description", n0 + 1);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "description retrieving");
            return false;
        }
        String tem1 = str.substring(n0, n1);
        //  System.out.println(tem1+"\n\n"+verifyword+" n0"+","+n1);
        if (tem1.contains(verifyword)) {
            //System.out.println(filename+","+threadid);
            displayvfmsg(filename, "No Update", threadid);
            return false;
        } else {
            displayokmsg(filename, threadid, "has a new Rss update");
            return true;
        }


    }

    private boolean USD_DOL_RSS(String str, String filename, String verifyword, int threadid) {
        int n0 = str.indexOf("<item>");
        int n1 = str.indexOf("<pubdate></pubdate>");

        if (n1 > 0)
            n0 = str.indexOf("<item>", n0 + 1);

        n0 = str.indexOf("<pubdate>", n0 + 1);
        n1 = str.indexOf("</pubdate>", n0 + 1);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "   verifyword retrieving");
            return false;
        }

        String tem1 = str.substring(n0 - 1, n1 + 2);
        if (tem1.length() < 0) {
            displayerrmsg(filename, threadid, n0, n1, " no verifyword retrieved");
            return false;

        }

        if (tem1.contains(verifyword)) {
            displayvfmsg(filename, "No update-", threadid);
            return false;
        }
        // System.out.println(tem1+"\n"+verifyword);
        n0 = str.indexOf("<item>", n0 + 1);
        n0 = str.indexOf("<description", n0 + 1);
        n1 = str.indexOf("</description", n0 + 1);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "description retrieving");
            return false;
        }
        tem1 = str.substring(n0, n1);
        tem1 =
            "In the week ending August 11, the advance figure for seasonally adjusted initial claims was 366,000, an increase of 2,000 from the previous week's revised figure of 364,000. The 4-week moving average was 363,750, a decrease of 5,500 from the previous week's revised average of 369,250.";
        tem1 = tem1.toLowerCase();
        //  System.out.println(tem1+"\n\n"+verifyword+" n0"+","+n1);

        n0 = tem1.indexOf(",000");
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "data retrieving");
            return false;
        }
        String tem2 = getDigit(tem1.substring(n0 - 5, n0 + 4));
        if (tem2.length() < 0) {
            displayerrmsg(filename, threadid, n0, n1, "emplty data");
            return false;
        }

        double unclaim = Integer.parseInt(tem2);

        n0 = tem1.indexOf(",000", n0 + 2);
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "data retrieving");
            return false;
        }
        tem2 = getDigit(tem1.substring(n0 - 5, n0 + 4));
        if (tem2.length() < 0) {
            displayerrmsg(filename, threadid, n0, n1, "emplty data");
            return false;
        }

        double unclaim2 = Integer.parseInt(tem2);

        if ((unclaim - unclaim2) > 150000) {
            n0 = tem1.indexOf(",000", n0 + 2);
            if (n0 < 0) {
                displayerrmsg(filename, threadid, n0, n1, "data retrieving");
                return false;
            }
            tem2 = getDigit(tem1.substring(n0 - 5, n0 + 4));
            if (tem2.length() < 0) {
                displayerrmsg(filename, threadid, n0, n1, "emplty data");
                return false;
            }

            double unclaim3 = Integer.parseInt(tem2);

            displayokmsg(filename, threadid, unclaim, unclaim3, " 3");


        } else {

            displayokmsg(filename, threadid, unclaim, unclaim2, " 2");


        }

        return true;


    }

    private boolean TEST_TITLE(String str, String filename, String verifyword, int threadid) {
        int n0 = str.indexOf("<item>");
        n0 = str.indexOf("<title", n0 + 1);
        int n1 = str.indexOf("</title", n0 + 1);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "title retrieving");

            return false;
        }
        String tem1 = str.substring(n0, n1);
        if (tem1.contains(verifyword)) {
            displayvfmsg(filename, threadid);
            return false;
        } else {
            displayokmsg(filename, threadid, "has a new Rss update");
            return true;
        }


    }

    private boolean TEST2(String str, String filename, String verifyword, int threadid) {
        if (str != null && str.contains(verifyword)) {
            displayvfmsg(filename, "No update test2", threadid);
            return false;
        } else {
            displayokmsg(filename, threadid, " Has a new update\n" + str);

            return true;
        }


    }

    private boolean TEST3(String str, String filename, String verifyword, int threadid) {
        // test for NZD food price
        if (str != null && str.contains(verifyword)) {
            displayokmsg(filename, threadid, " Has a new update\n" + str);

            return true;
        } else if (str != null && !str.contains(verifyword)) {

            displayvfmsg(filename, "No update test3", threadid);
            return false;
        }
        if (true)
            return false;
        if (str != null && str.contains(verifyword)) {
            displayvfmsg(filename, "No update test3", threadid);
            return false;
        } else {
            displayokmsg(filename, threadid, " Has a new update\n" + str);

            return true;
        }

    }

    private boolean USD_BLS_HOME(String str, String filename, String verifyword, int threadid) {
        // keyword=<!-- BEGIN 1 NEWS RELEASE ABSTRACT-->
        int n0 = str.indexOf("nr-date-day");
        int n1 = str.indexOf("</", n0 + 1);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "BLS_HOME");
            return false;
        }
        String tem1 = str.substring(n0, n1);
        if (tem1.contains(verifyword)) {
            displayvfmsg(filename, "No update bls-home", threadid);
            return false;
        }
        //---------retrieve data----------

        n0 = str.indexOf("</a>", n1);
        n1 = str.lastIndexOf(">", n0);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "Data string not found");
            return false;
        }
        tem1 = str.substring(n1, n0);
        n0 = tem1.indexOf("%");
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "Data1 retrieving");
            return false;
        }
        String tem2 = tem1.substring(0, n0);
        if (tem2.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Data1 string empty");
            return false;
        }

        double data1 = Double.parseDouble(getDigit(tem2));
        int sign = getSign(tem2);
        if (sign < 0)
            data1 = 0 - data1;

        //-----retriving data2------------

        tem2 = tem1.substring(n0 + 2);
        n0 = tem2.indexOf("%");
        if (n0 < 0) {
            displayokmsg(filename, threadid, data1, "Data1 found,no data2-BLS-Home");
            return true;
        }

        double data2 = Double.parseDouble(getDigit(tem2));
        sign = getSign(tem2);
        if (sign < 0)
            data2 = 0 - data2;


        displayokmsg(filename, threadid, data1, data2, " BLS-home");

        return true;


    }

    private boolean htmlParser(InputStream in, int sks, int lens, int filetype) throws IOException {
        //  System.out.println("htm");


        String temstr = "";
        int temint = 0;

        if (filetype == TEXT && ((String) (jComboBox2.getSelectedItem())).equalsIgnoreCase("Keyword"))
            temstr = keywordprocessing(in, sks, lens);
        else if (filetype == TEXT && ((String) (jComboBox2.getSelectedItem())).equalsIgnoreCase("Series")) {
            temstr = seriesprocessing(in, sks, lens);
            temint = temstr.indexOf(jTextField5.getText().trim());
            jTextField1.setText(jTextField5.getText() + ", index=" + temint + ",lens=" + temstr.length() + ",skip=" +
                                sks);
            jLabel2.setText("" + temint);
            jTextArea1.setText(temstr);
            return true;
        } else if (filetype == PDF) {
            PDFParser pdfin = new PDFParser(in);
            try {
                pdfin.parse();
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (!assign(new PDDocument(pdfin.getDocument()), Filename, Betterword, Verifyword,
                        getIndicatorID(wsname.getSelectedItem()), emchg, Uemrate, Oneprevious, Twoprevious, 0))
                return false;
        } else if (filetype == EXCEL) {
            return assign(new HSSFWorkbook(in), Filename, Keyword, Betterword, Verifyword,
                          getIndicatorID(wsname.getSelectedItem()), emchg, Uemrate, Oneprevious, Twoprevious,
                          indicatorno1, 0);
            // if(!assign(new HSSFWorkbook(in),Filename,Betterword,Verifyword,getIndicatorID(wsname.getSelectedItem()),emchg,Uemrate,Oneprevious,Twoprevious,0))
            //    return false;
        }
        //System.out.println(temstr);

        t5 = System.currentTimeMillis() + timeoffset;
        if (temstr.endsWith("[[[QUITQUITQUIT]]]"))
            return true;
        else if (temstr.endsWith("[[[END]]]NOTFOUND") || temstr.endsWith("[[[END]]]"))
            return false;


        if (!assign(temstr.toLowerCase(), Filename, Betterword, Verifyword, Keyword,
                    getIndicatorID(wsname.getSelectedItem()), indicatorno1, emchg, Uemrate, Oneprevious, Twoprevious,
                    onepreviousbase1, twopreviousbase1, botype1, bctype1, boffset1, wotype1, wctype1, woffset1, fbt1,
                    fwt1, sbt1, swt1, submit1, quantity1, gassign1, 0))
            return false;


        temint = temstr.indexOf(jTextField5.getText().trim());
        // jTextField1.setText(jTextField5.getText()+", index="+temint+",lens="+temstr.length()+",skip="+sks);
        jLabel2.setText("" + temint);
        jTextArea1.setText(temstr);

        return true;
    }

    synchronized boolean assign(String temstr2, String filename, String betterword, String verifyword, String keyword,
                                int s, int indicatorno, double emchg, double uemrate, double oneprevious,
                                double twoprevious, double onepreviousbase, double twopreviousbase, int botype,
                                int bctype, double boffset, int wotype, int wctype, double woffset, double fbt,
                                double fwt, double sbt, double swt, int submit, int quantity, int[] gassign,
                                int threadid) {

        switch (s) //s=indicator ID
        {
        case 1:

            return USDInitialClaim(temstr2, filename, verifyword, emchg, oneprevious, botype, bctype, boffset, wotype,
                                   wctype, woffset, fbt, fwt, sbt, swt, submit, quantity, threadid);

        case 2:
            if (!USDLabor(temstr2, filename, verifyword, betterword, emchg, uemrate, oneprevious, twoprevious,
                          threadid))
                return false;
            else
                break;
        case 0:
            return AUDLabor2(temstr2, filename, verifyword, emchg, uemrate, oneprevious, twoprevious, onepreviousbase,
                             botype, bctype, boffset, wotype, wctype, woffset, fbt, fwt, sbt, swt, submit, quantity,
                             threadid);

        case 4:
            return CADRetail(temstr2, filename, keyword, emchg, oneprevious, uemrate, twoprevious, onepreviousbase,
                             twopreviousbase, botype, bctype, boffset, wotype, wctype, woffset, fbt, fwt, sbt, swt,
                             quantity, threadid);
        case 6:

            return USDGDP(temstr2, filename, emchg, oneprevious, threadid);


        case 7:
            return CADGDP(temstr2, filename, keyword, emchg, oneprevious, botype, bctype, boffset, wotype, wctype,
                          woffset, fbt, fwt, sbt, swt, submit, quantity, threadid);
        case 10:
            return AUDRetail(temstr2, filename, emchg, oneprevious, threadid);

        case 11:
            if (!USDPHomeSales(temstr2, filename, emchg, oneprevious, threadid)) {

                return false;
            } else
                break;
        case 13:
            CHFCPI(temstr2, emchg);
            break;
        case 14:
            if (!AUDRate(temstr2, filename, emchg, verifyword, threadid))
                return false;
            else
                break;
        case 15:
            if (!AUDGDP(temstr2, filename, emchg, verifyword, threadid))
                return false;
            else
                break;
        case 17:
            return NZDRate(temstr2, filename, verifyword, emchg, oneprevious, botype, bctype, boffset, wotype, wctype,
                           woffset, fbt, fwt, sbt, swt, submit, quantity, threadid);
        case 18:
            return GBPRate(temstr2, filename, emchg, uemrate, threadid);
        case 20:
            return CADRate(temstr2, filename, emchg, oneprevious, botype, bctype, boffset, wotype, wctype, woffset, fbt,
                           fwt, sbt, swt, quantity, threadid);
        case 21:
            return CADLabor(temstr2, filename, verifyword, emchg, oneprevious, uemrate, twoprevious, botype, bctype,
                            boffset, wotype, wctype, woffset, fbt, fwt, sbt, swt, submit, quantity, threadid);

        case 22:
            USDEchange(temstr2, emchg);
            break;
        case 23:
            USDUErate(temstr2, emchg);
            break;
        case 24:
            USDADPEmp(temstr2, filename, emchg, oneprevious, threadid);
            break;
        case 25:
            if (!TEST_DES(temstr2, filename, verifyword, threadid))
                return false;
            break;
        case 26:
            if (!PDFTest(temstr2))
                return false;
            break;
        case 27:
            return USDISMMPMI(temstr2, filename, verifyword, emchg, threadid);

        case 28:
            return TEST2(temstr2, filename, verifyword, threadid);
        case 29:
            return USDISNMMPMI(temstr2, filename, verifyword, emchg, threadid);
        case 30:
            return TEST3(temstr2, filename, verifyword, threadid);
        case 31:
            if (!TESTAU(temstr2)) {
                value1R.setText("OLD-" + ((int) (Math.random() * 10)));
                return false;
            }
            break;

        case 32:
            if (!USDTradBalance(temstr2, emchg))
                return false;
            else
                break;
        case 33:
            if (!EURRate(temstr2, filename, emchg, oneprevious, threadid))
                return false;
            else
                break;
        case 34:
            if (!CADIveyPMI(temstr2, filename, emchg, verifyword, botype, bctype, boffset, wotype, wctype, woffset,
                            threadid))
                return false;
            else
                break;
        case 35:
            if (!AUDTradBalance(temstr2, filename, verifyword, emchg, oneprevious, threadid))
                return false;
            else
                break;
        case 36:
            return CADTradBalance(temstr2, filename, keyword, emchg, oneprevious, botype, bctype, boffset, wotype,
                                  wctype, woffset, fbt, fwt, sbt, swt, submit, quantity, threadid);
        case 37:
            if (!CADBDPermit(temstr2, emchg, oneprevious))
                return false;
            else
                break;
        case 38:
            return AUDRate2(temstr2, filename, emchg, threadid);

        case 39:
            if (!AUDGDP2(temstr2, emchg, oneprevious, threadid))
                return false;
            else
                break;
        case 40:
            if ((!AUDRss(temstr2, filename, betterword, verifyword, indicatorno, emchg, threadid)))
                return false;
            else
                break;
        case 41:
            return CADRss(temstr2, filename, verifyword, botype, bctype, boffset, wotype, wctype, woffset, threadid);

        case 42:
            if ((!CADGen(temstr2, filename, betterword, indicatorno, emchg, oneprevious, verifyword, botype, bctype,
                         boffset, wotype, wctype, woffset, fbt, fwt, sbt, swt, quantity, threadid)))
                return false;
            else
                break;
        case 43:
            if ((!USDRss(temstr2, filename, verifyword, indicatorno, threadid)))
                return false;
            else
                break;
        case 44:
            if ((!USDCensusHome(temstr2, filename, verifyword, threadid)))
                return false;
            else
                break;
        case 45:
            return AUDHomeLoan(temstr2, filename, verifyword, emchg, oneprevious, botype, bctype, boffset, wotype,
                               wctype, woffset, fbt, fwt, sbt, swt, submit, quantity, threadid);

        case 46:
            if ((!AUDHomeLoanR(temstr2, emchg, verifyword, threadid)))
                return false;
            else
                break;
        case 47:
            return USDRetail(temstr2, filename, emchg, uemrate, oneprevious, twoprevious, verifyword, threadid);

        case 48:
            if ((!USDCPI(temstr2, filename, emchg, uemrate, oneprevious, twoprevious, verifyword, threadid)))
                return false;
            else
                break;
        case 49:
            return NZDGDP(temstr2, filename, emchg, oneprevious, botype, bctype, boffset, wotype, wctype, woffset, fbt,
                          fwt, sbt, swt, submit, quantity, threadid);

        case 50:
            if ((!USDEHomeSales(temstr2, emchg, oneprevious, verifyword, threadid)))
                return false;
            else
                break;
        case 52:
            return CADCPI(temstr2, filename, keyword, emchg, oneprevious, uemrate, twoprevious, botype, bctype, boffset,
                          wotype, wctype, woffset, fbt, fwt, sbt, swt, quantity, threadid);

        case 54:
            if ((!NZDTradeBalance(temstr2, filename, emchg, verifyword, threadid)))
                return false;
            else
                break;
        case 55:
            return NZDE_IndicatorRSS(temstr2, filename, verifyword, indicatorno, emchg, oneprevious, botype, bctype,
                                     boffset, wotype, wctype, woffset, fbt, fwt, sbt, swt, submit, quantity, threadid);

        case 56:
            if ((!NZDP_IndicatorRSS(temstr2, filename, verifyword, threadid)))
                return false;
            else
                break;
        case 57:
            if ((!USD_CB_C_Confidence(temstr2, filename, verifyword, threadid)))
                return false;
            else
                break;
        case 60:
            if ((!USD_Census_CGIBrief(temstr2, filename, verifyword, threadid)))
                return false;
            else
                break;
        case 61:
            if ((!USD_DOL_Home(temstr2, filename, verifyword, threadid)))
                return false;
            else
                break;
        case 62:
            if ((!USD_BEA_Home(temstr2, filename, verifyword, threadid)))
                return false;
            else
                break;
        case 63:
            if ((!NZD_STS_Home(temstr2, filename, betterword, verifyword, threadid)))
                return false;
            else
                break;
        case 64:
            return CAD_EC_RSS(temstr2, filename, betterword, indicatorno, emchg, oneprevious, uemrate, twoprevious,
                              verifyword, botype, bctype, boffset, wotype, wctype, woffset, fbt, fwt, sbt, swt,
                              quantity, threadid);

        case 65:
            return CAD_GDP_ORG(temstr2, filename, betterword, emchg, oneprevious, botype, bctype, boffset, wotype,
                               wctype, woffset, fbt, fwt, sbt, swt, quantity, threadid);
        case 66:
            return AUD_STS_Headline(temstr2, filename, betterword, indicatorno, emchg, oneprevious, verifyword,
                                    threadid);
        case 67:
            return AUD_STS_Home(temstr2, filename, betterword, indicatorno, emchg, oneprevious, verifyword, threadid);
        case 68:
            return AUD_BDApproval(temstr2, filename, emchg, oneprevious, verifyword, threadid);
        case 69:
            return AUD_Retail_Media(temstr2, filename, emchg, oneprevious, threadid);
        case 70:
            return AUD_RATE_RSS(temstr2, filename, verifyword, threadid);
        case 71:
            return USD_ADP_Press(temstr2, filename, verifyword, threadid);
        case 72:
            return USD_ISM_Home(temstr2, filename, verifyword, threadid);
        case 73:
            return GBP_RATE_Home(temstr2, filename, emchg, uemrate, verifyword, threadid);
        case 74:
            return NZD_STS_Home_L(temstr2, filename, verifyword, threadid);
        case 75:
            return USD_DOL_RSS(temstr2, filename, verifyword, threadid);
        case 76:
            return USD_Census_RSS(temstr2, filename, verifyword, indicatorno, emchg, oneprevious, threadid);
        case 77:
            return GBP_GDP_P1_2(temstr2, filename, betterword, verifyword, emchg, oneprevious, threadid);
        case 78:
            return GBP_GDP_P3(temstr2, filename, betterword, verifyword, emchg, oneprevious, threadid);
        case 79:
            return USD_HOMESALES_RSS(temstr2, filename, verifyword, indicatorno, emchg, oneprevious, threadid);
        case 80:
            return USD_BEA_RSS(temstr2, filename, verifyword, indicatorno, emchg, oneprevious, threadid);
        case 81:
            return USD_BLS_NEWSRLS(temstr2, filename, betterword, verifyword, keyword, indicatorno, threadid);
        case 82:
            return USDGDP_TXT(temstr2, filename, emchg, oneprevious, threadid);
        case 83:
            return CAD_RATE_RSS(temstr2, filename, verifyword, emchg, oneprevious, botype, bctype, boffset, wotype,
                                wctype, woffset, fbt, fwt, sbt, swt, quantity, threadid);
        case 84:
            return AUD_Bapproval_Media(temstr2, filename, verifyword, threadid);
        case 85:
            return GBP_RATE_NEWS(temstr2, filename, verifyword, emchg, uemrate, threadid);
        case 86:
            return GBP_RATE_RSS(temstr2, filename, verifyword, threadid);
        case 87:
            return NZD_RATE_NEWS(temstr2, filename, verifyword, emchg, threadid);
        case 88:
            return NZD_RATE_RSS(temstr2, filename, verifyword, emchg, threadid);
        case 91:
            return AUD_LABOR_MEDIA(temstr2, filename, verifyword, emchg, uemrate, oneprevious, twoprevious, threadid);
        case 92:
            return AUD_CPI_MEDIA(temstr2, filename, betterword, emchg, threadid);
        case 93:
            return AUD_RETAIL_MEDIA(temstr2, filename, betterword, emchg, threadid);
        case 94:
            return CAD_LABOR_ORG(temstr2, filename, betterword, indicatorno, emchg, oneprevious, uemrate, twoprevious,
                                 botype, bctype, boffset, wotype, wctype, woffset, fbt, fwt, sbt, swt, quantity,
                                 threadid);
        case 95:
            return CAD_RATE_TOKEN(temstr2, filename, verifyword, emchg, oneprevious, botype, bctype, boffset, wotype,
                                  wctype, woffset, fbt, fwt, sbt, swt, quantity, threadid);
        case 96:
            return CAD$UERate(temstr2, filename, verifyword, emchg, oneprevious, botype, bctype, boffset, wotype,
                              wctype, woffset, threadid);
        case 97:
            return CAD_TRADEBAL_ORG(temstr2, filename, betterword, emchg, oneprevious, botype, bctype, boffset, wotype,
                                    wctype, woffset, fbt, fwt, sbt, swt, submit, quantity, threadid);
        case 98:
            return CAD_RETAIL_ORG(temstr2, filename, betterword, emchg, oneprevious, uemrate, twoprevious, botype,
                                  bctype, boffset, wotype, wctype, woffset, fbt, fwt, sbt, swt, submit, quantity,
                                  threadid);
        case 99:
            return CAD_CPI_ORG(temstr2, filename, betterword, emchg, oneprevious, uemrate, twoprevious, botype, bctype,
                               boffset, wotype, wctype, woffset, fbt, fwt, sbt, swt, submit, quantity, threadid);
        case 100:
            return USD_CPI_DAT(temstr2, filename, betterword, emchg, oneprevious, uemrate, twoprevious, botype, bctype,
                               boffset, wotype, wctype, woffset, fbt, fwt, sbt, swt, submit, quantity, threadid);
        case 101:
            return USD_BLS_HOME(temstr2, filename, verifyword, threadid);
        case 102:
            return Factory(temstr2, filename, verifyword, indicatorno, emchg, oneprevious, botype, bctype, boffset,
                           wotype, wctype, woffset, fbt, fwt, sbt, swt, submit, quantity, gassign, threadid);
        case 103:
            return FactoryCalendar(temstr2, indicatorno);
        case 104:
            return F1(temstr2, filename, threadid);
            // return F1(temstr2,filename,verifyword,emchg,oneprevious,uemrate,twoprevious,botype,bctype,boffset,wotype,wctype,woffset,fbt, fwt, sbt, swt,submit,quantity,gassign,threadid);
        case 105:
            return F19(temstr2, filename, verifyword, emchg, oneprevious, uemrate, twoprevious, botype, bctype, boffset,
                       wotype, wctype, woffset, fbt, fwt, sbt, swt, submit, quantity, gassign, threadid);
        case 106:
            return F2(temstr2, filename, threadid);
            // return F2(temstr2,filename,verifyword,emchg,oneprevious,uemrate,twoprevious,botype,bctype,boffset,wotype,wctype,woffset,fbt, fwt, sbt, swt,submit,quantity,threadid);
        case 107:
            return F29(temstr2, filename, verifyword, emchg, oneprevious, uemrate, twoprevious, botype, bctype, boffset,
                       wotype, wctype, woffset, fbt, fwt, sbt, swt, submit, quantity, threadid);
        case 108:
            return NZD_GDP_Media(temstr2, filename, emchg, oneprevious, botype, bctype, boffset, wotype, wctype,
                                 woffset, fbt, fwt, sbt, swt, submit, quantity, threadid);
        case 109:
            return CAD$CPI(temstr2, filename, verifyword, emchg, oneprevious, botype, bctype, boffset, wotype, wctype,
                           woffset, threadid);
        case 110:
            return CAD$GDP(temstr2, filename, verifyword, emchg, oneprevious, botype, bctype, boffset, wotype, wctype,
                           woffset, threadid);
        case 113:
            return F3(temstr2, filename, threadid);
        case 114:
            return F4(temstr2, filename, threadid);
        case 115:
            return F5(temstr2, filename, threadid);
        case 116:
            return F6(temstr2, filename, threadid);


        case 117:
            return F7(temstr2, filename, threadid);

        case 118:
            return F8(temstr2, filename, threadid);
        case 119:
            return F9(temstr2, filename, threadid);
        case 120:
            return F10(temstr2, filename, threadid);
        case 121:
            return F11(temstr2, filename, threadid);
        case 122:
            return US10YBOND(temstr2, filename, threadid);
        case 123:
            return ALL10YBOND(temstr2, filename, threadid);
        case 124:
            return JP10YBOND(temstr2, filename, threadid);
        case 125:
            return CA10YBOND(temstr2, filename, threadid);
        case 126:
            return AUDLABOR_XLSADD(temstr2, filename, verifyword, threadid);
        case 127:
            return Aleart(temstr2, filename, verifyword, betterword, threadid);

        }

        return true;

    }

    boolean assign(HSSFWorkbook workbook, String filename, String keyword, String betterword, String verifyword, int s,
                   double emchg, double uemrate, double oneprevious, double twoprevious, int indicatorno,
                   int threadid) {
        // System.out.println("AUD labor detai-assign");



        switch (s) {
        case 53:

            return NZDGDP_xls(workbook, emchg, oneprevious, threadid);

        case 59:
            return USDD_Goods_xls(workbook, filename, betterword, verifyword, emchg, oneprevious, threadid);
        case 111:
            return AUD_LABOR_D(workbook, filename, keyword, betterword, verifyword, emchg, uemrate, oneprevious,
                               twoprevious, indicatorno, threadid);


        }

        return true;

    }

    boolean assign(PDDocument pdDoc, String filename, String betterword, String verifyword, int s, double emchg,
                   double uemrate, double oneprevious, double twoprevious, int threadid) {
        //  System.out.println(filename+" :"+s);
        switch (s) {
        case 51:
            // System.out.println("Got it");
            if (!USDNHomeSales_PDF(pdDoc, filename, betterword, verifyword, emchg, oneprevious, threadid))
                return false;
            else
                break;
        case 58:
            if (!USDD_Goods_PDF(pdDoc, filename, betterword, verifyword, threadid))
                return false;
            else
                break;
        case 89:
            return NZD_RATE_ASS(pdDoc, filename, betterword, verifyword, emchg, threadid);
        case 90:
            return NZD_RATE_STATE(pdDoc, filename, betterword, verifyword, emchg, threadid);

        }

        return true;

    }

    private boolean USDNHomeSales_PDF(PDDocument pdDoc, String filename, String betterword, String verifyword,
                                      double emchg, double oneprevious, int threadid) {
        String tem1 = "";
        try {
            PDFTextStripper pdfStripper = new PDFTextStripper();
            List<PDPage> list = pdDoc.getDocumentCatalog().getAllPages();
            pdfStripper.setStartPage(1);
            pdfStripper.setEndPage(list.size());
            tem1 = pdfStripper.getText(pdDoc).toLowerCase();
            pdDoc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println(tem1);

        if (tem1.contains(verifyword)) {
            displayvfmsg(filename, "No update-N.H.S", threadid);
            return false;
        }

        if (!tem1.contains(betterword)) {
            displayvfmsg(filename, "No betterword found-N.H.S", threadid);
            return false;
        }

        if (!bdata1 && orderpermit.isSelected()) {

            displayvfmsg(filename, "Yield", threadid);
            log(filename, threadid + " is late at " + (new Time(System.currentTimeMillis() + timeoffset)).toString());
            return true;
        }
        bdata1 = false;

        int n0 = tem1.indexOf(",000");
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, -999, "data retrieving");
            return false;
        }
        String tem2 = getDigit(tem1.substring(n0 - 5, n0 + 4));
        if (tem2.length() < 0) {
            displayerrmsg(filename, threadid, -999, -999, "emplty data");
            return false;
        }

        double data = Integer.parseInt(tem2) / 1000;

        n0 = tem1.indexOf(",000", n0 + 2);
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, -999, " second data retrieving");
            return false;
        }
        tem2 = getDigit(tem1.substring(n0 - 5, n0 + 4));
        if (tem2.length() < 0) {
            displayerrmsg(filename, threadid, n0, -999, " second emplty data");
            return false;
        }

        double datap = Integer.parseInt(tem2) / 1000;
        double dif = getSSWR2((data - emchg) + (datap - oneprevious) * 0.3);

        dif = getSSWR2((data - emchg) + (datap - oneprevious) * 0.3);
        if (dif >= 70) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(25000, getSSWR(sf.eurusd - 0.0010), SELLLMT, EURUSD); //sell EURUSD
            System.out.println("EURUSD Sell Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.eurusd));
            displayokmsg(filename, threadid,
                         "EURUSD Sell Order Issuring Time=" +
                         (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                         (sf == null ? "" : sf.eurusd));
            value1.setText("+" + dif + "(" + data + "__" + emchg + ")");
            value1.setForeground(new Color(0, 153, 0));
        } else if (((dif) <= -70)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(25000, getSSWR(sf.eurusd + 0.0010), BUYLMT, EURUSD); //buy EURUSD
            displayokmsg(filename, threadid,
                         "EURUSD Buy Order Issuring Time=" +
                         (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                         (sf == null ? "" : sf.eurusd));
            System.out.println("EURUSD Buy Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.eurusd));
            value1.setText(dif + "(" + data + "__" + emchg + ")");
            value1.setForeground(Color.red);
        } else if (dif < 70 && dif > -70) {
            value1.setText((dif > 0 ? "+" : "") + dif + "(" + data + "__" + emchg + ")");
            value1.setForeground(Color.blue);
            System.out.println("N.Home Sales is here:" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString());
            displayokmsg(filename, threadid,
                         "E. Home Sales is here:" + (new Time(System.currentTimeMillis() + timeoffset)).toString());
        }


        onepreviousF.setText(getSSWR2(datap - oneprevious) + "(" + datap + "__" + oneprevious + ")");
        onepreviousF.setForeground(datap >= oneprevious ? new Color(0, 153, 0) : Color.red);
        displayokmsg(filename, threadid, data, datap, "NHS");


        return true;


    }

    private boolean USDD_Goods_PDF(PDDocument pdDoc, String filename, String betterword, String verifyword,
                                   int threadid) {
        try {
            PDFTextStripper pdfStripper = new PDFTextStripper();
            List<PDPage> list = pdDoc.getDocumentCatalog().getAllPages();
            pdfStripper.setStartPage(1);
            pdfStripper.setEndPage(list.size());
            String str = pdfStripper.getText(pdDoc).toLowerCase();
            // System.out.println(str);

            int n0 = 0, n1 = 0;
            n0 = str.indexOf("New Orders4");
            String tem1 = str.substring(n0 + 20);
            if (str.contains(verifyword)) {
                displayvfmsg(filename, "No update-g.pdf", threadid);
                pdDoc.close();
                pdDoc = null;
                pdfStripper = null;
                return false;
            }
            if (!str.contains(betterword)) {
                displayvfmsg(filename, "No betterword found g.pdf", threadid);
                pdDoc.close();
                pdDoc = null;
                pdfStripper = null;
                return false;
            }
            //    n1=str.indexOf("percent",n0);
            displayokmsg(filename, threadid, "g.pdf got data");
            pdDoc.close();
            pdDoc = null;
            pdfStripper = null;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;

    }

    private boolean AUD_LABOR_D(HSSFWorkbook workbook, String filename, String keyword, String betterword,
                                String verifyword, double emchg, double uemrate, double oneprevious, double twoprevious,
                                int indicatorno, int threadid) {

        HSSFSheet sheet = workbook.getSheetAt(1);
        HSSFRow row = sheet.getRow(indicatorno); // Sept=27
        if (row == null) {
            displayvfmsg(filename, "No update-xls", threadid);
            return false;
        }
        HSSFCell cell = row.getCell(3);
        double dataf = getSSWR1(cell.getNumericCellValue()); //current month full time
        cell = row.getCell(6);
        double datap = getSSWR1(cell.getNumericCellValue()); //current month part time
        cell = row.getCell(9);
        double data11 = getSSWR1(cell.getNumericCellValue()); //current month total employed

        cell = row.getCell(27); //current month umemployment rate
        double data21 = getSSWR1(cell.getNumericCellValue());
        cell = row.getCell(30);
        double data31 = getSSWR1(cell.getNumericCellValue()); // current month participtation rate

        row = sheet.getRow(indicatorno - 1);
        cell = row.getCell(9);
        double data12 = getSSWR1(cell.getNumericCellValue()); // previous month total employed

        cell = row.getCell(3);
        double dataf_p = getSSWR1(cell.getNumericCellValue()); //previous month full time
        cell = row.getCell(6);
        double datap_p = getSSWR1(cell.getNumericCellValue()); //previous month part time

        cell = row.getCell(27);
        double data22 = getSSWR1(cell.getNumericCellValue()); // previous month unemployment rate
        cell = row.getCell(30);
        double data32 = getSSWR1(cell.getNumericCellValue()); //previous month participation rate

        row = sheet.getRow(indicatorno - 2);
        cell = row.getCell(9);
        double data13 = getSSWR1(cell.getNumericCellValue()); // 2 months ago total employed
        cell = row.getCell(3);
        double dataf_2p = getSSWR1(cell.getNumericCellValue()); //2 months ago full time
        cell = row.getCell(6);
        double datap_2p = getSSWR1(cell.getNumericCellValue()); //2 months ago part time

        row = sheet.getRow(indicatorno - 3);

        cell = row.getCell(3);
        double dataf_3p = getSSWR1(cell.getNumericCellValue()); //3 months ago full time
        cell = row.getCell(6);
        double datap_3p = getSSWR1(cell.getNumericCellValue()); //3 months ago part time


        if (mp != null && mp.alarmclock != null) {

            int columncount = mp.alarmclock.optable.getColumnCount();
            double ftdif = getSSWR2(dataf - dataf_p); //current month full time dif
            mp.alarmclock.optable.setValueAt("" + ftdif, 0, 1);
            double ptdif = getSSWR2(datap - datap_p); //current month part dif
            mp.alarmclock.optable.setValueAt("" + ptdif, 0, 4);
            double ft = ftdif, pt = ptdif;
            if (ftdif > 0) {
                ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[1 + columncount] = "1";

            } else if (ftdif < 0) {
                ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[1 + columncount] = "-1";

            } else {
                ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[1 + columncount] = "0";

            }

            if (ptdif > 0) {
                ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[4 + columncount] = "1";

            } else if (ptdif < 0) {
                ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[4 + columncount] = "-1";

            } else {
                ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[4 + columncount] = "0";

            }

            double ftdif_p = dataf_p - dataf_2p;
            double td = getSSWR2(ftdif_p - Double.parseDouble(betterword));
            mp.alarmclock.optable.setValueAt("" + getSSWR2(ftdif_p), 1, 2);
            mp.alarmclock.optable.setValueAt("" + betterword + "(p)", 2, 2);
            mp.alarmclock.optable.setValueAt("" + td, 0, 2);
            ft = ft + td;
            if (td > 0) {
                ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[2 + columncount] = "1";
                ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[2 + columncount] = "1";
            } else if (td < 0) {
                ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[2 + columncount] = "-1";
                ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[2 + columncount] = "-1";
            } else {
                ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[2 + columncount] = "0";
                ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[2 + columncount] = "0";
            }

            double ptdif_p = datap_p - datap_2p;
            td = getSSWR2(ptdif_p - Double.parseDouble(verifyword));
            mp.alarmclock.optable.setValueAt("" + getSSWR2(ptdif_p), 1, 5);
            mp.alarmclock.optable.setValueAt("" + verifyword + "(p)", 2, 5);
            mp.alarmclock.optable.setValueAt("" + td, 0, 5);
            pt = pt + td;
            if (td > 0) {
                ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[5 + columncount] = "1";
                ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[5 + columncount] = "1";
            } else if (td < 0) {
                ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[5 + columncount] = "-1";
                ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[5 + columncount] = "-1";
            } else {
                ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[5 + columncount] = "0";
                ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[5 + columncount] = "0";
            }

            int n = keyword.indexOf("><");
            double ft_2p = Double.parseDouble(getDigit(keyword.substring(0, n)));
            double pt_2p = Double.parseDouble(getDigit(keyword.substring(n + 1)));
            double ftdif_2p = getSSWR2(dataf_2p - dataf_3p);
            mp.alarmclock.optable.setValueAt("" + ftdif_2p, 1, 3);
            mp.alarmclock.optable.setValueAt("" + ft_2p + "(p)", 2, 3);
            td = getSSWR2(ftdif_2p - ft_2p);
            mp.alarmclock.optable.setValueAt("" + td, 0, 3);

            if (td > 0) {
                ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[3 + columncount] = "1";
                ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[3 + columncount] = "1";
            } else if (td < 0) {
                ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[3 + columncount] = "-1";
                ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[3 + columncount] = "-1";
            } else {
                ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[3 + columncount] = "0";
                ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[3 + columncount] = "0";
            }

            ft = ft + td;


            double ptdif_2p = getSSWR2(datap_2p - datap_3p);
            td = getSSWR2(ptdif_2p - pt_2p);
            mp.alarmclock.optable.setValueAt("" + ptdif_2p, 1, 6);
            mp.alarmclock.optable.setValueAt("" + pt_2p + "(p)", 2, 6);
            mp.alarmclock.optable.setValueAt("" + td, 0, 6);
            if (td > 0) {
                ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[6 + columncount] = "1";
                ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[6 + columncount] = "1";
            } else if (td < 0) {
                ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[6 + columncount] = "-1";
                ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[6 + columncount] = "-1";
            } else {
                ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[6 + columncount] = "0";
                ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[6 + columncount] = "0";
            }

            pt = pt + td;


            double tc = ft + pt;
            mp.alarmclock.optable.setValueAt("" + getSSWR2(tc) + "(ra)", 1, 0);
            if (tc > 0) {
                ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[0 + columncount] = "1";

            } else if (tc < 0) {
                ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[0 + columncount] = "-1";

            } else {
                ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[0 + columncount] = "0";

            }

            mp.alarmclock.optable.setValueAt("" + emchg + "(f)", 2, 0);
            td = (tc - emchg);
            mp.alarmclock.optable.setValueAt("" + getSSWR2(td) + "(ra-f)", 0, 0);
            if (td > 0) {
                ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[0 + columncount] = "1";

            } else if (td < 0) {
                ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[0 + columncount] = "-1";

            } else {
                ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[0 + columncount] = "0";

            }


            mp.alarmclock.optable.setValueAt("" + data21, 0, 7);
            mp.alarmclock.optable.setValueAt("" + data22 + "(r.p)", 1, 7);
            td = getSSWR2(data21 - data22);
            mp.alarmclock.optable.setValueAt("" + twoprevious, 2, 7);
            if (td < 0) {
                ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[7 + columncount] = "1";

            } else if (td > 0) {
                ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[7 + columncount] = "-1";

            } else {
                ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[7 + columncount] = "0";

            }

            td = getSSWR2(data22 - twoprevious);
            mp.alarmclock.optable.setValueAt("" + twoprevious + "(p)", 2, 7);
            if (td < 0) {
                ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[7 + columncount] = "1";

            } else if (td > 0) {
                ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[7 + columncount] = "-1";

            } else {
                ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[7 + columncount] = "0";

            }


            mp.alarmclock.optable.setValueAt("" + data31, 1, 8);
            mp.alarmclock.optable.setValueAt("" + data32 + "(r.p)", 2, 8);
            td = getSSWR2(data31 - data32);
            mp.alarmclock.optable.setValueAt("" + td, 0, 8);
            if (td > 0) {
                ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[8 + columncount] = "1";
                ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[8 + columncount] = "1";
            } else if (td < 0) {
                ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[8 + columncount] = "-1";
                ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[8 + columncount] = "-1";
            } else {
                ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[8 + columncount] = "0";
                ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[8 + columncount] = "0";
            }

        }
        displaymvalue(getSSWR1(data11 - data12 - emchg) + "(" + getSSWR1(data11 - data12) + "," + emchg + ")(f:" +
                      getSSWR1(dataf - dataf_p) + "  p:" + getSSWR1(datap - datap_p) + ")",
                      (data11 - data12 - emchg) >= 0 ? new Color(0, 153, 0) : Color.red, threadid);
        displaycvalue(getSSWR1(data12 - data13 - oneprevious) + "(" + getSSWR1(data12 - data13) + "  " + oneprevious +
                      ")", (data12 - data13 - oneprevious) > 0 ? new Color(0, 153, 0) : Color.red, threadid);
        cell = row.getCell(0);
        //System.out.println(dataf+","+datap+",     "+data11+","+data12+","+data13+",      "+cell.getNumericCellValue());
        return true;
    }

    private boolean USDD_Goods_xls(HSSFWorkbook workbook, String filename, String betterword, String verifyword,
                                   double emchg, double oneprevious, int threadid) {
        //copy from nzd

        HSSFSheet sheet = workbook.getSheetAt(0);
        int rowno = 7; //need to change 3 location loc1
        HSSFRow row = sheet.getRow(rowno); // Sept=27
        HSSFCell cell = row.getCell(3);

        String vf = cell.getStringCellValue().toLowerCase();

        // System.out.print("vf,v,b="+vf+" "+verifyword+" "+betterword);

        if (vf.contains(verifyword)) {

            displayvfmsg(filename, "No update-g.xls", threadid);
            cell = null;
            row = null;
            sheet = null;
            workbook = null;
            return false;
        }

        if (!vf.contains(betterword)) {

            displayvfmsg(filename, "No betterword found-g.xls", threadid);
            cell = null;
            row = null;
            sheet = null;
            workbook = null;
            return false;
        }

        //      double tem1=cell.getNumericCellValue();
        rowno = 15;
        row = sheet.getRow(rowno + 4); // Sept=27
        cell = row.getCell(5);
        double data1 = cell.getNumericCellValue();
        //      String str=data1+","+tem1;


        row = sheet.getRow(rowno);
        cell = row.getCell(5);
        double data19 = cell.getNumericCellValue();


        double data = getSSWR(data1 - emchg + (data19 - oneprevious) * 0.39);

        if (true) {
            displayokmsg(filename, threadid, ":" + data1 + "," + data19 + " " + vf);

            cell = null;
            row = null;
            sheet = null;
            workbook = null;
            return true;
        }


        if (((data) >= 0.3)) {

            System.out.println(threadid + " NZDUSD Buy Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.nzdusd));
            value1.setText("+" + data + "(" + data1 + "..." + emchg + ")" + getSSWR(data1 - emchg));
            value1.setForeground(new Color(0, 153, 0));

        } else if (((data) <= -0.3)) {

            System.out.println(threadid + " NZDUSD Sell Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.nzdusd));
            value1.setText(data + "(" + data1 + "..." + emchg + ")" + getSSWR(data1 - emchg));
            value1.setForeground(Color.red);

        } else if (data < 0.3 && data > -0.3) {
            value1.setText((data > 0 ? "+" : "") + data + "(" + data1 + "..." + emchg + ")" + getSSWR(data1 - emchg));
            value1.setForeground(Color.blue);
            System.out.println(threadid + " NZDGDP Finish Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString());

        }

        onepreviousF.setText(getSSWR(data19 - oneprevious) + "(" + data19 + "  " + oneprevious + ")");
        onepreviousF.setForeground(data19 >= oneprevious ? new Color(0, 153, 0) : Color.red);

        return true;

    }

    private boolean EXCELProcessing(InputStream in) throws IOException {
        System.out.println("It is");


        HSSFWorkbook workbook = new HSSFWorkbook(in);
        HSSFSheet sheet = workbook.getSheetAt(1);


        HSSFRow row = sheet.getRow(0);
        HSSFCell cell = row.getCell(19);
        double str01 = 0; //cell.getNumericCellValue();

        row = sheet.getRow(443);
        cell = row.getCell(19);
        str01 = cell.getNumericCellValue();

        System.out.println("value=" + str01);

        row = sheet.getRow(444);
        cell = row.getCell(19);
        str01 = cell.getNumericCellValue();

        System.out.println("value=" + str01);


        return true;

    }

    private boolean PDFProcessing(InputStream in) throws IOException {
        PDFParser pdfin = new PDFParser(in);
        PDDocument pdDoc = null;
        COSDocument cosDoc = null;
        String parsedText = null;
        try {
            PDFTextStripper pdfStripper = new PDFTextStripper();
            pdfin.parse();
            cosDoc = pdfin.getDocument();
            pdDoc = new PDDocument(cosDoc);
            List<PDPage> list = pdDoc.getDocumentCatalog().getAllPages();
            pdfStripper.setStartPage(1);
            pdfStripper.setEndPage(list.size());
            parsedText = pdfStripper.getText(pdDoc);
            cosDoc.close();
            pdDoc.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(parsedText);
        parsedText = (parsedText.toLowerCase()).replace(" ", "");
        if (!(parsedText.contains("injanuary2012"))) {
            System.out.println("New Data has arrived at " +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString());
            return true;
        } else {
            value1R.setText("PDF No Data");
            return false;
        }


    }

    private String GBPGDPsite(String str, double emchg, String betterword, int state) {
        String tem1 = "", tem2 = "http://www.ons.gov.uk";
        str = str.toLowerCase();
        int n0 = 0, n1 = 0, n2 = 0, n3 = 0;
        boolean result = true;

        while (result) {
            n0 = str.indexOf("<tr", n1);
            if (n0 == -1)
                break;
            n1 = str.indexOf("</tr", n0);
            if (n1 == -1)
                break;

            tem1 = str.substring(n0, n1);
            // System.out.println("S:"+n0+","+n1+"\n"+tem1);
            if (tem1.contains("statistical bulletin")) {

                if (tem1.contains(betterword) && tem1.contains(".htm")) {
                    n2 = tem1.lastIndexOf("<a href=");
                    n2 = tem1.indexOf("/", n2);
                    n3 = tem1.indexOf(">", n2);
                    //  System.out.println("inside"+n2+","+n3);
                    System.out.println("first:" + tem2 + tem1.substring(n2, n3 - 1));
                    jComboBox2.setSelectedIndex(1);
                    return tem2 + tem1.substring(n2, n3 - 1);
                }


            }
        }


        return "";
    }

    private boolean USD_DOL_Home(String str, String filename, String verifyword, int threadid) {

        int n0 = str.indexOf("latest numbers");
        //  n0=str.indexOf("</a",n0+1);
        n0 = str.indexOf("</p", n0 + 1);
        int n1 = str.lastIndexOf(">", n0 + 1);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "data retrieving");
            return false;
        }
        String tem1 = str.substring(n1, n0);
        if (tem1.contains(verifyword)) {
            displayvfmsg(filename, threadid);
            return false;
        } else {
            displayokmsg(filename, threadid, "has a new RSS update");
            return true;
        }


    }

    private boolean USD_BEA_Home(String str, String filename, String verifyword, int threadid) {

        int n0 = str.indexOf("date");
        //  n0=str.indexOf("</a",n0+1);
        //  n0=str.indexOf("</p",n0+1);
        int n1 = str.indexOf("</li", n0 + 1);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "date retrieving");
            return false;
        }
        String tem1 = str.substring(n0, n1);
        if (tem1.contains(verifyword)) {
            displayvfmsg(filename, threadid);
            return false;
        } else {
            displayokmsg(filename, threadid, "has a new RSS update");
            return true;
        }


    }

    //not in use
    private boolean USDInitialClaimx(String str, String filename, double emchg, double oneprevious, int threadid) {
        String tem = "", tem2 = "";
        double data1, data = 0, data2 = 0;
        int n0, n1;

        n0 = str.indexOf("<tbody");


        n0 = str.indexOf("<tbody" + n0 + 1);
        n0 = str.indexOf("<td", n0 + 1);
        n0 = str.indexOf(">", n0);
        n1 = str.indexOf("</td", n0);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "n0,n1" + "IClaim1");
            return false;
        }
        data1 = Double.parseDouble(getDigit(str.substring(n0, n1)));


        n0 = str.indexOf("<td", n0);
        n0 = str.indexOf(">", n0);
        n1 = str.indexOf("</td", n0);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "n0,n1" + "IClaim2");
            return false;
        }
        data2 = Double.parseDouble(getDigit(str.substring(n0, n1)));

        return false;


    }

    private boolean USDInitialClaim(String str, String filename, String verifyword, double emchg, double oneprevious,
                                    int botype, int bctype, double boffset, int wotype, int wctype, double woffset,
                                    double fbt, double fwt, double sbt, double swt, int submit, int quantity,
                                    int threadid) {
        if (str.contains(verifyword)) {
            displayvfmsg(filename, "ueclaim", threadid);
            return false;
        }

        String tem = "", tem2 = "";
        double data1, data = 0, data19 = 0;
        int n0, n1;

        n0 = str.indexOf("<tbody");


        n0 = str.indexOf("<tbody" + n0 + 1);
        n0 = str.indexOf("<td", n0 + 1);
        n0 = str.indexOf(">", n0);
        n1 = str.indexOf("</td", n0);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "First Error");
            return false;
        }
        data1 = Double.parseDouble(getDigit(str.substring(n0, n1))) / 1000;


        n0 = str.indexOf("<td", n0);
        n0 = str.indexOf(">", n0);
        n1 = str.indexOf("</td", n0);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "Second Eoror");
            return false;
        }
        data19 = Double.parseDouble(getDigit(str.substring(n0, n1))) / 1000;

        return submitOneSP("USD_InitClaim", filename, 1, data1, data19, emchg, oneprevious, botype, bctype, boffset,
                           wotype, wctype, woffset, fbt, fwt, sbt, swt, quantity, threadid);


    }

    private String seriesprocessing(InputStream in, int sks, int lens) throws IOException {
        br = new BufferedReader(new InputStreamReader(in));
        String temstr = "", inputLine = "";
        System.out.println("Series");
        long tt = System.currentTimeMillis() + timeoffset;
        int n = 0, m = 0;
        while ((inputLine = br.readLine()) != null) {
            // System.out.println(inputLine);
            temstr += inputLine + "\n";
            n = temstr.lastIndexOf(jTextField5.getText().trim());
            if (n != m) {
                System.out.println(n);
                m = n; //write down very index number which are newly changed
            }


        }
        n = temstr.lastIndexOf(jTextField5.getText().trim());

        System.out.println("Total Len=" + temstr.length() + "," + (System.currentTimeMillis() + timeoffset - tt) +
                           ",foundWord:" + n + "  " + (new Time(System.currentTimeMillis() + timeoffset)).toString());

        jTextArea1.setText(temstr);
        return temstr;
    }

    private boolean checkword(BufferedReader r, char[] test, int testlength, char[] bad) throws IOException {
        int temint = 0;

        int m = 0, n = 1, mb = 0;
        char ch1 = 'i';
        boolean tlock = true, block = true;

        while ((temint = r.read()) != -1) {
            if (n > testlength)
                break;

            ch1 = (char) temint;
            n++;
            if (tlock & test != null && test.length > 0 && ch1 == test[m]) {
                m++;
            } else if (tlock && test != null) {
                m = 0;
                tlock = false; //not right, restart

            }

            if (test != null && m > test.length - 1) //target found
            {
                return true;
            }


            if (block && bad != null && bad.length > 0 && ch1 == bad[mb]) {
                mb++;
            } else if (block && bad != null) {
                mb = 0;
                block = false; //not right, restart

            }

            if (bad != null && mb > bad.length - 1) //target found
            {
                return false;
            }


        }


        return true;

    }

    private String keywordprocessing(InputStream in, int sks, int lens) throws IOException {
        br = new BufferedReader(new InputStreamReader(in));
        workstr = "";
        hand = "";

        if (Verifyword == null)
            Verifyword = "*&^%$#*&@!^&#$*^*t4dcb,.<>";

        test = (stages[0] == 1 ? Keyword : jTextField5.getText().trim().toLowerCase()); // look for key word

        // long tt=System.currentTimeMillis()+timeoffset;

        if (Updatetype != NEWCOME || (Updatetype == NEWCOME && Betterword.equalsIgnoreCase("na")))
            br.skip(sks);

        int ind = -1, m = 0;
        boolean f = true, addlen = false;
        while (true) {

            hand = br.readLine();


            if (hand == null) {
                if ((ind = workstr.indexOf(test)) >= 0) {
                    show.setText("A_" + workstr.length() + "-" + (int) (Math.random() * 10));
                    return workstr.substring((ind - Betterlength) < 0 ? 0 : (ind - Betterlength));
                }
                break;

            }

            if (Updatetype == NEWCOME && m == 0 && sf != null && sf.timespan < 3000) //clean up workstr
            {

                if (workstr.length() >= 1)
                    workstr = "";
                log(Filename, "Clean up workstr");
            }

            workstr += hand.toLowerCase(); //+"\n";
            m += hand.length();

            if (f && Updatetype == NEWCOME && !Betterword.equalsIgnoreCase("na")) {
                int n0 = workstr.indexOf("<title>");
                int n1 = workstr.indexOf("</title>");
                if (n0 > 0 && n1 > 0) {
                    String tem = workstr.substring(n0, n1);
                    if (tem.contains(Betterword)) {
                        displayvfmsg(Filename, "no file", 0);
                        return "[[[END]]]NOTFOUND";
                    } else {
                        br.skip((sks - m) <= 0 ? 0 : (sks - m));
                        m = 0;
                        workstr = "";
                    }

                }
            }

            if (Updatetype == SAMEFILE && workstr.contains(Verifyword)) // return content containing verifyword
            {

                show.setText("SAMEFILE_" + workstr.length() + "-" + (int) (Math.random() * 10));
                return "[[[END]]]";
            }

            if (f)
                ind =
                    workstr.indexOf(test); // detect keyword's existence,if keyword found,no detection again, ind will remain the same


            if (ind >= 0) // ind remain the same
            {

                f = false;
                if ((m - ind) > lens) // enough length of data collected and terminate the fetching operation and return
                {
                    br.close();
                    show.setText("FOUND");
                    return workstr.substring(ind < Betterlength ? 0 : (ind - Betterlength),
                                             ((m - ind) > lens ? (ind + lens) : (m - 1)));
                } else
                    addlen = true;

                if ((ind - Betterlength) > 0) {
                    workstr = workstr.substring(ind - Betterlength); // to cut off unwanted part of workstr
                }

                m = workstr.length();
                // System.out.println(ind+","+Betterlength+","+m);
                ind =
                    -1; //this block of code run one time only, after that,workstr will grow until(m-Betterlength)>lens is reached
            }

            if (addlen && (m - Betterlength) > lens) {
                br.close();
                show.setText("Found");
                return workstr.substring(0, (Betterlength + lens));
            }

        }
        show.setText("0_NotFound" + "_" + (int) (Math.random() * 10));
        br.close();
        //    System.out.println("\n\n"+workstr);
        if (Updatetype == NEWCOME && m > 1000)
            log(Filename, workstr.substring(0, 1000));
        else if (Updatetype == NEWCOME && m <= 1000)
            log(Filename, workstr);

        return "[[[END]]]NOTFOUND";
    }

    private void jComboBox1_actionPerformed(ActionEvent e) {

    }

    private void jButton2_actionPerformed(ActionEvent e) {

        try {

            if (JOptionPane.showConfirmDialog(null, "Really Delete it:", "Please Select", JOptionPane.YES_NO_OPTION) ==
                JOptionPane.NO_OPTION)
                return;

            con = DriverManager.getConnection(source);
            String str = "delete from Websites where IPADD='" + ((String) (jComboBox1.getSelectedItem())).trim() + "'";

            PreparedStatement pst = con.prepareStatement(str);


            temint = pst.executeUpdate();
            if (temint > 0) {
                wsname.removeItemAt(jComboBox1.getSelectedIndex());
                jComboBox1.removeItemAt(jComboBox1.getSelectedIndex());
            }
            pst.close();
            con.close();
        } catch (Exception sqle) {
            sqle.printStackTrace();
            //  targetModel.addElement("Option Update Error");

        }


    }

    private void jButton3_actionPerformed(ActionEvent e) {
        try {

            Skip = Integer.parseInt(jTextField3.getText());
            Length = Integer.parseInt(jTextField4.getText());
            emchg = Double.parseDouble(value1.getText().trim());
            Uemrate = Double.parseDouble(value2.getText().trim());
            Verifyword = (jTextField6.getText()).toLowerCase(); //.replace(" ", "");
            Verifylength = Integer.parseInt(value1L.getText());
            Filetype = Integer.parseInt(value3.getText());
            Betterword = betterwordF.getText().trim();
            if (Betterword != null)
                Betterword = Betterword.trim().toLowerCase();
            Betterlength = Integer.parseInt(value1R.getText());
            Oneprevious = Double.parseDouble(onepreviousF.getText().trim());
            Twoprevious = Double.parseDouble(twopreviousF.getText().trim());
            // Oneprevious2=Double.parseDouble(orderquantityF.getText().trim());
            // Twoprevious2=Double.parseDouble(timespanF.getText().trim());
            Updatetype = Integer.parseInt(value1L.getText().trim());
            Keyword = jTextField5.getText();
            if (Keyword != null)
                Keyword = Keyword.toLowerCase();
            indicatorno1 = Integer.parseInt(indicatornoF.getText());
            onepreviousbase1 = Double.parseDouble(onepreviousBaseF.getText());
            twopreviousbase1 = Double.parseDouble(twopreviousBaseF.getText());


            con = DriverManager.getConnection(source);
            String str =
                "update Websites set skip=?, length=?,keyword=?,emchg=?,uemrate=?,verifyword=?,verifylength=?,contentlength=?,hascode=?,betterword=?,betterlength=?,oldcode=?,verifyplace=?,stage=?,updatetype=?,oneprevious=?,twoprevious=?,threeprevious=?,fourprevious=?,onepreviousbase=?,twopreviousbase=?,botype=?,bctype=?,boffset=?,wotype=?,wctype=?,woffset=?,fbt=?,fwt=?,sbt=?,swt=?,submit=?,quantity=?,para1=?,para2=?,para3=?,para4=?,para5=?,para6=? where IPADD='" +
                ((String) (jComboBox1.getSelectedItem())).trim() + "'";
            //  String str="update Websites set ip=?, file=? where IPADD='"+((String)(jComboBox1.getSelectedItem())).trim()+"'";

            PreparedStatement pst = con.prepareStatement(str);


            pst.setInt(1, Skip);
            pst.setInt(2, Length); //length taken
            pst.setString(3, Keyword); //Key word
            pst.setDouble(4, emchg); //emchg
            pst.setDouble(5, Uemrate); //esitmate2
            pst.setString(6, Verifyword);
            pst.setInt(7, Verifylength);
            pst.setInt(8, indicatorno1);
            pst.setInt(9, Filetype); //filetype
            pst.setString(10, Betterword);
            pst.setInt(11, Betterlength);
            pst.setString(12, jTextField7.getText().trim());
            pst.setInt(13, jCheckBox3.isSelected() ? 1 : 0);
            pst.setInt(14, Integer.parseInt(interval.getText().trim()));
            pst.setInt(15, Updatetype);
            pst.setDouble(16, Oneprevious);
            pst.setDouble(17, Twoprevious);
            pst.setDouble(18, Oneprevious2);
            pst.setDouble(19, Twoprevious2);
            pst.setDouble(20, onepreviousbase1);
            pst.setDouble(21, twopreviousbase1);
            pst.setInt(22, botype1 = botypeC.getSelectedIndex());
            pst.setInt(23, bctype1 = bctypeC.getSelectedIndex());
            pst.setDouble(24, boffset1 = Double.parseDouble(boffsetF.getText()));
            pst.setInt(25, wotype1 = wotypeC.getSelectedIndex());
            pst.setInt(26, wctype1 = wctypeC.getSelectedIndex());
            pst.setDouble(27, woffset1 = Double.parseDouble(woffsetF.getText()));
            pst.setDouble(28, fbt1 = Double.parseDouble(fbtF.getText()));
            pst.setDouble(29, fwt1 = Double.parseDouble(fwtF.getText()));
            pst.setDouble(30, sbt1 = Double.parseDouble(sbtF.getText()));
            pst.setDouble(31, swt1 = Double.parseDouble(swtF.getText()));
            pst.setInt(32, submit1 = submitC.getSelectedIndex());
            pst.setDouble(33, quantity1 = Integer.parseInt(orderquantityF.getText()));
            pst.setInt(34, gassign1[0] = para1.getSelectedIndex());
            pst.setInt(35, gassign1[1] = para2.getSelectedIndex());
            pst.setInt(36, gassign1[2] = para3.getSelectedIndex());
            pst.setInt(37, gassign1[3] = para4.getSelectedIndex());
            pst.setInt(38, gassign1[4] = para5.getSelectedIndex());
            pst.setInt(39, gassign1[5] = para6.getSelectedIndex());
            //  pst.setString(20,jCheckBox3.isSelected()?(jTextField7.getText().trim()).substring(0, 249):jTextField7.getText().trim());


            //  System.out.println("Not updated???"+jTextField7.getText().trim());

            temint = pst.executeUpdate();
            if (temint <= 0)
                System.out.println("Not updated");

            //        }
            pst.close();
            con.close();
        } catch (Exception sqle) {
            sqle.printStackTrace();
            //  targetModel.addElement("Option Update Error");
        }
        jButton3.setEnabled(false);
    }

    private void jButton4_actionPerformed(ActionEvent e) {
        try {
            con = DriverManager.getConnection(source);
            String str =
                "update Websites set ipstatus=? where IPADD='" + ((String) (jComboBox1.getSelectedItem())).trim() + "'";
            //  String str="update Websites set ip=?, file=? where IPADD='"+((String)(jComboBox1.getSelectedItem())).trim()+"'";

            PreparedStatement pst = con.prepareStatement(str);


            pst.setInt(1, 1);
            ipstatus = 1;

            temint = pst.executeUpdate();
            if (temint <= 0)
                System.out.println("Not updated");

            //        }
            pst.close();
            con.close();
        } catch (Exception sqle) {
            sqle.printStackTrace();
            //  targetModel.addElement("Option Update Error");
        }
    }

    private void jCheckBox1_actionPerformed(ActionEvent e) {
        jButton3.setEnabled(true);
    }

    private void initiate() {


        jComboBox2.addItem("Keyword");
        jComboBox2.addItem("Series");
        jComboBox2.setSelectedItem("Keyword");
        jComboBox2.setToolTipText("Choose which way to select text");
        jCheckBox1.setToolTipText("When selected, the web address above will be displayed");
        jButton3.setEnabled(false);
        jComboBox1.setVisible(false);


        for (int i = 0; i < stages.length; i++) {
            stages[i] = -1;
            links[i] = "-1";
        }
        botypeC.addItem("BUYLMT");
        botypeC.addItem("SELLLMT");
        botypeC.addItem("BUYMKT");
        botypeC.addItem("SELLMKT");
        wotypeC.addItem("BUYLMT");
        wotypeC.addItem("SELLLMT");
        wotypeC.addItem("BUYMKT");
        wotypeC.addItem("SELLMKT");

        fillPairs(bctypeC);
        fillPairs(wctypeC);
        submitC.addItem("submit");
        submitC.addItem("C.Submit");
        submitC.addItem("OneSP");
        submitC.addItem("SndSP");
        submitC.addItem("C.OneSP");
        submitC.addItem("C.SndSP");
        submitC.addItem("NoSubmit");
        for (int i = 0; i < 6; i++) {
            para1.addItem(i);
            para2.addItem(i);

            para3.addItem(i);
            para4.addItem(i);
            para5.addItem(i);
            para6.addItem(i);

        }
        para6.setSelectedIndex(2);

    }

    private boolean AUDTradBalance(String str, String filename, String verifyword, double emchg, double oneprevious,
                                   int threadid) {
        int n0 = 0, n1 = 0, n2 = 0;
        String tem1 = "";
        //    System.out.println("?");
        if (str.contains(verifyword)) {
            displayvfmsg(filename, "No Update_ Aud bal", threadid);
            return false;
        } else if (!str.contains(verifyword)) {
            displayokmsg(filename, threadid, " Has new update");
            return true;
        }

        double data1 = 0, data2 = 0, data3;
        n0 = str.indexOf("<table");
        n0 = str.indexOf("</tr", n0);
        n0 = str.indexOf("</tr", n0 + 1);
        n0 = str.indexOf("</tr", n0 + 1);
        n0 = str.indexOf("</tr", n0 + 1);
        n0 = str.indexOf("</tr", n0 + 1);

        n0 = str.indexOf("</td", n0 + 1);
        n0 = str.indexOf("</td", n0 + 1);
        n1 = str.indexOf("</td", n0 + 1);
        /*
        if(n1<0 || n0<0)
        {
            System.out.println(n0+" n0, n1"+n1+"    AUDLabor data retrieving");
            return false;
            }
        //data1=getSSWR(Double.parseDouble(getDigit(str.substring(n0, n1))));
      //*/

        n0 = str.indexOf("</td", n1 + 1);
        if (n1 < 0 || n0 < 0) {
            System.out.println(n0 + " n0, n1" + n1 + "    AUDTradBalance data2 retrieving");
            return false;
        }
        String tem2 = getDigit(str.substring(n1, n0));
        data2 = Double.parseDouble(tem2);
        data2 = getSSWR1(data2);


        n1 = str.indexOf("</td", n0 + 1);
        if (n1 < 0 || n0 < 0) {
            System.out.println(n0 + " n0, n1" + n1 + "    AUD TradBalance data1 retrieving");
            return false;
        }
        data1 = getSSWR1(Double.parseDouble(getDigit(str.substring(n0, n1))) / 1000);

        double data = getSSWR1((data1 - emchg + (data2 - oneprevious) * 0.5));


        if (data >= 1.5) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(30000, getSSWR(sf.audusd + 0.0010), BUYLMT, AUDUSD); //sell EURUSD
            System.out.println("AUDUSD Buy Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.audusd));
            value1.setText("+" + data + "(" + data1 + "..." + emchg + ")" + getSSWR1(data1 - emchg));
            value1.setForeground(new Color(0, 153, 0));

        } else if (data <= -1.5) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(30000, getSSWR(sf.audusd - 0.0010), SELLLMT, AUDUSD); //buy EURUSD
            System.out.println("AUDUSD Sell Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.audusd));
            value1.setText(data + "(" + data1 + "..." + emchg + ")" + getSSWR1(data1 - emchg));
            value1.setForeground(Color.red);

        } else // if(data<0.25 && data>-0.25)
        {
            value1.setText((data > 0 ? "+" : "") + data + "(" + data1 + "..." + emchg + ")" + getSSWR1(data1 - emchg));
            value1.setForeground(Color.blue);
            System.out.println("AUD Trade Balance is here.Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString());
        }


        onepreviousF.setText(getSSWR(data2 - oneprevious) + "(" + data2 + ".." + oneprevious + ")");
        onepreviousF.setForeground(data2 >= oneprevious ? new Color(0, 153, 0) : Color.red);
        return true;

    }

    private boolean AUDLabor2(String str, String filename, String verifyword, double emchg, double uemrate,
                              double oneprevious, double twoprevious, double onepreviousbase, int botype, int bctype,
                              double boffset, int wotype, int wctype, double woffset, double fbt, double fwt,
                              double sbt, double swt, int submit, int quantity, int threadid) {

        // System.out.println(verifyword+"\n"+str.substring(0, 1000));
        if (str.contains(verifyword)) {
            displayvfmsg(filename, "verifywd match", threadid);
            return false;
        }
        int n0 = 0, n1 = 0, n2 = 0;
        String tem1 = "";
        double data1 = 0, data2 = 0;
        n0 = str.indexOf("<table");
        n0 = str.indexOf("<tr", n0);
        n0 = str.indexOf("</td", n0 + 1);
        n0 = str.indexOf("</td", n0 + 1);
        n0 = str.indexOf("</td", n0 + 1);
        n1 = str.indexOf("</td", n0 + 1);

        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "verifyword");
            return false;
        }
        tem1 = str.substring(n0, n1);
        if (tem1.contains(verifyword)) {
            displayvfmsg(filename, "No update", threadid);
            return false;
        }

        n0 = str.indexOf("</tr", n0 + 1);
        n0 = str.indexOf("</tr", n0 + 1);
        n0 = str.indexOf("</tr", n0 + 1);
        n0 = str.indexOf("</tr", n0 + 1);
        n0 = str.indexOf("</tr", n0 + 1);
        n0 = str.indexOf("</tr", n0 + 1);
        n0 = str.indexOf("</tr", n0 + 1);
        n0 = str.indexOf("</tr", n0 + 1);


        n0 = str.indexOf("</td", n0 + 1);
        n0 = str.indexOf("</td", n0 + 1);
        n0 = str.indexOf("</td", n0 + 1);
        //-----data13
        int n3 = n0;
        int n4 = str.lastIndexOf("</", n3 - 1);
        while ((n3 - n4) < 12) //travel to most left "</"
        {
            n3 = n4;
            n4 = str.lastIndexOf("</", n3 - 1);

        }
        n4 = str.lastIndexOf(">", n3 - 1);


        if (n4 < 0 || n3 < 0) {
            displayerrmsg(filename, threadid, n3, n4, "data");
            return false;
        }

        double data13 = getSSWR(Double.parseDouble(getDigit(str.substring(n4, n3))));
        double data19 = getSSWR1(data13 - onepreviousbase);
        //------

        n0 = str.indexOf("</td", n0 + 1);

        //-----data12
        n3 = n0;
        n4 = str.lastIndexOf("</", n3 - 1);
        while ((n3 - n4) < 12) //travel to most left "</"
        {
            n3 = n4;
            n4 = str.lastIndexOf("</", n3 - 1);

        }
        n4 = str.lastIndexOf(">", n3 - 1);


        if (n4 < 0 || n3 < 0) {
            displayerrmsg(filename, threadid, n3, n4, "data");
            return false;
        }

        double data12 = getSSWR(Double.parseDouble(getDigit(str.substring(n4, n3))));
        //------


        n0 = str.indexOf("</td", n0 + 1);
        n1 = str.lastIndexOf("</", n0 - 1);

        while ((n0 - n1) < 12) //travel to most left "</"
        {
            n0 = n1;
            n1 = str.lastIndexOf("</", n0 - 1);

        }
        n1 = str.lastIndexOf(">", n0 - 1);


        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "data");
            return false;
        }

        data1 = getSSWR1(Double.parseDouble(getDigit(str.substring(n1, n0))));


        double data11 = getSSWR(data1 - emchg);
        //-======================================= umemploy rate------

        n0 = str.indexOf("</tr", n0 + 1);
        n0 = str.indexOf("</tr", n0 + 1);

        n0 = str.indexOf("</td", n0 + 1);
        n0 = str.indexOf("</td", n0 + 1);

        n0 = str.indexOf("</td", n0 + 1);
        n1 = str.lastIndexOf("</", n0 - 1);

        while ((n0 - n1) < 12) //travel to most left "</"
        {
            n0 = n1;
            n1 = str.lastIndexOf("</", n0 - 1);

        }
        n1 = str.lastIndexOf(">", n0 - 1);


        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "data2");
            return false;
        }
        double data29 = getSSWR1(Double.parseDouble(getDigit(str.substring(n1, n0))));


        n0 = str.indexOf("</td", n0 + 1);
        n0 = str.indexOf("</td", n0 + 1);
        n1 = str.lastIndexOf("</", n0 - 1);

        while ((n0 - n1) < 12) //travel to most left "</"
        {
            n0 = n1;
            n1 = str.lastIndexOf("</", n0 - 1);

        }
        n1 = str.lastIndexOf(">", n0 - 1);


        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "data2");
            return false;
        }
        data2 = getSSWR1(Double.parseDouble(getDigit(str.substring(n1, n0))));

        submitSndSP("AUD_LABOR_D", filename, 1, data1, data19, data2, data29, emchg, oneprevious, uemrate, twoprevious,
                    botype, bctype, boffset, wotype, wctype, woffset, fbt, fwt, sbt, swt, quantity, threadid);
        //  System.out.println(data19+" "+data29+" "+data2);


        return true;

    }

    private boolean AUDLABOR_XLSADD(String str, String filename, String verifyword, int threadid) {

        // System.out.println(verifyword+"\n"+str.substring(0, 1000));

        int n0 = 0, n1 = 0, n2 = 0;
        String tem1 = "";
        n0 = str.indexOf("</title>");


        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "verifyword");
            return false;
        }
        tem1 = str.substring(0, n0);
        if (tem1.contains(verifyword)) {
            displayvfmsg(filename, "No update", threadid);
            return false;
        }

        n0 = str.indexOf("table 02", n0);

        n0 = str.indexOf("><a", n0 + 1);

        n1 = str.indexOf("><", n0 + 2);


        if (n0 < 0 || n1 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "address fetch");
            return false;
        }
        tem1 = str.substring(n0 + 10, n1 - 1).trim();
        tem1 = tem1.replace(" ", "%20");
        tem1 = "http://www.abs.gov.au" + tem1;
        // td11.setID(this.getIndicatorID("AUD_LABOR_D"));
        td11.setURL(tem1);
        if (mp != null && mp.alarmclock != null) {

            mp.alarmclock.detail.setSelectedIndex(2);
        }
        System.out.println("10 finished");
        return true;

    }

    private boolean AUDLaborX(String str, double emchg, double uemrate, double oneprevous, double twoprevious,
                              String verifyword) {

        int n0 = 0, n1 = 0, n2 = 0;
        String tem1 = "";
        double data1 = 0, data2 = 0;
        n0 = str.indexOf("<table");
        n0 = str.indexOf("<tr", n0);
        n0 = str.indexOf("</td", n0 + 1);
        n0 = str.indexOf("</td", n0 + 1);
        n0 = str.indexOf("</td", n0 + 1);
        n1 = str.indexOf("</td", n0 + 1);

        if (n1 < 0 || n0 < 0) {
            System.out.println(n0 + " n0, n1" + n1 + "    AUDLabor verifyword");
            return false;
        }
        tem1 = str.substring(n0, n1);
        if (tem1.contains(verifyword)) {
            value1R.setText("V-Word Match-" + ((int) (Math.random() * 10)));
            return false;
        }

        n0 = str.indexOf("</tr", n0 + 1);
        n0 = str.indexOf("</tr", n0 + 1);
        n0 = str.indexOf("</tr", n0 + 1);
        n0 = str.indexOf("</tr", n0 + 1);
        n0 = str.indexOf("</tr", n0 + 1);
        n0 = str.indexOf("</tr", n0 + 1);
        n0 = str.indexOf("</tr", n0 + 1);
        n0 = str.indexOf("</tr", n0 + 1);


        n0 = str.indexOf("</td", n0 + 1);
        n0 = str.indexOf("</td", n0 + 1);
        n0 = str.indexOf("</td", n0 + 1);
        n0 = str.indexOf("</td", n0 + 1);
        n0 = str.indexOf("</td", n0 + 1);
        n1 = str.lastIndexOf("</", n0 - 1);

        while ((n0 - n1) < 12) //travel to most left "</"
        {
            n0 = n1;
            n1 = str.lastIndexOf("</", n0 - 1);

        }
        n1 = str.lastIndexOf(">", n0 - 1);


        if (n1 < 0 || n0 < 0) {
            System.out.println(n0 + " n0, n1" + n1 + "    AUDLabor data retrieving");
            return false;
        }
        data1 = getSSWR(Double.parseDouble(getDigit(str.substring(n1, n0))));
        double data11 = getSSWR(data1 - emchg);

        n0 = str.indexOf("</tr", n0 + 1);
        n0 = str.indexOf("</tr", n0 + 1);

        n0 = str.indexOf("</td", n0 + 1);
        n0 = str.indexOf("</td", n0 + 1);
        n0 = str.indexOf("</td", n0 + 1);
        n1 = str.lastIndexOf("</", n0 - 1);

        while ((n0 - n1) < 12) //travel to most left "</"
        {
            n0 = n1;
            n1 = str.lastIndexOf("</", n0 - 1);

        }
        n1 = str.lastIndexOf(">", n0 - 1);


        if (n1 < 0 || n0 < 0) {
            System.out.println(n0 + " n0, n1" + n1 + "    AUDLabor previous data2 retrieving");
            return false;
        }
        double data29 = getSSWR(Double.parseDouble(getDigit(str.substring(n1, n0))));


        n0 = str.indexOf("</td", n0 + 1);
        n1 = str.lastIndexOf("</", n0 - 1);

        while ((n0 - n1) < 12) //travel to most left "</"
        {
            n0 = n1;
            n1 = str.lastIndexOf("</", n0 - 1);

        }
        n1 = str.lastIndexOf(">", n0 - 1);


        if (n1 < 0 || n0 < 0) {
            System.out.println(n0 + " n0, n1" + n1 + "    AUDLabor data2 retrieving");
            return false;
        }
        data2 = getSSWR(Double.parseDouble(getDigit(str.substring(n1, n0))));
        double data22 = getSSWR(data2 - uemrate + (data29 - twoprevious) * 0.5);

        if ((data11 >= 39) && data22 <= 0.1) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(80000, getSSWR(sf.audusd + 0.0010), BUYLMT, AUDUSD); //sell EURUSD
            System.out.println("AUDUSD Buy Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.audusd));
            value1.setText("+" + data11 + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(new Color(0, 153, 0));

        } else if ((data11 <= -39) && (data22 >= -0.1)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(80000, getSSWR(sf.audusd - 0.0010), SELLLMT, AUDUSD); //buy EURUSD
            System.out.println("AUDUSD Sell Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.audusd));
            value1.setText(data11 + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(Color.red);

        } else if ((data11 >= 25) && data22 <= 0) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(30000, getSSWR(sf.audusd + 0.0010), BUYLMT, AUDUSD); //sell EURUSD
            System.out.println("AUDUSD Buy Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.audusd));
            value1.setText("+" + data11 + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(new Color(0, 153, 0));

        } else if ((data11 <= -25) && (data22 >= 0)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(30000, getSSWR(sf.audusd - 0.0010), SELLLMT, AUDUSD); //buy EURUSD
            System.out.println("AUDUSD Sell Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.audusd));
            value1.setText(data11 + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(Color.red);

        } else // if(data<0.25 && data>-0.25)
        {
            value1.setText((data11 > 0 ? "+" : "") + data11 + "(" + data1 + "..." + emchg +
                           ")"); //+getSSWR(data1-emchg));
            value1.setForeground(Color.blue);
            System.out.println("AUDLabor is here.Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString());

        }


        value2.setText(data22 + "(" + data2 + "..." + uemrate + ")" + getSSWR(data2 - uemrate));
        value2.setForeground(data22 < 0 ? new Color(0, 153, 0) : Color.red);
        twopreviousF.setText(getSSWR(data29 - twoprevious) + "(" + data29 + ".." + twoprevious + ")");
        twopreviousF.setForeground(data29 <= twoprevious ? new Color(0, 153, 0) : Color.red);
        return true;

    }

    private double getSSWR(double value) {

        double v = Math.round(10000 * value) / 10000.0;


        return v;
    }

    private double getSSWR1(double value) {


        double v = Math.round(10 * value) / 10.0;


        return v;
    }

    private double getSSWR2(double value) {
        // System.out.println(value);
        double v = Math.round(100 * value) / 100.0;


        return v;
    }

    private double getSSWR3(double value) {
        // System.out.println(value);
        double v = Math.round(1000 * value) / 1000.0;


        return v;
    }


    public void setUrl(String tem, int select) {
        //System.out.println(tem+","+select);
        s01 = false;
        s02 = false;
        s03 = false;
        s11 = false;
        s12 = false;
        s13 = false;
        s31 = false;
        s32 = false;
        s33 = false;
        //    System.out.println("Filtering="+rss.currentip+","+rss.currentfile);
        if (select == 0)
            setUrl(currentip, currentfile);
        else if (select == 1) {
            String[] strs = getHostFile(tem);
            setUrl(strs[0], strs[1]);

        }


    }

    public String[] getHostFile(String tem) {
        String[] newstr = new String[2];
        //    System.out.println("URL:="+tem);
        int n = 0;
        int m = 0;

        InetAddress address = null;
        //    for(int i=0;i<jComboBox1.getItemCount();i++)
        //       {

        try {
            tem = tem.toLowerCase();
            m = tem.indexOf("http://");
            n = tem.indexOf("/", m + 7);
            newstr[1] = tem.substring(n + 1);
            tem = tem.substring(m + 7, n);
            address = InetAddress.getByName(tem);
            newstr[0] = address.getHostAddress();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return newstr;
    }

    private String removetag(String str) {
        int n0 = 0, n1 = 0;
        String s1 = "", s2 = "";
        str = str.replace(" ", "");
        str = str.replace("&nbsp;", "");
        str = str.replace("&amp;", "");
        while (n0 >= 0) {
            n0 = str.indexOf("<", n1);
            if (n0 == -1)
                return str;
            n1 = str.indexOf(">", n0);
            if (n1 == -1)
                return str;
            s1 = str.substring(0, n0);
            // System.out.println("1_"+s1);
            if (n1 < str.length())
                s2 = str.substring(n1 + 1);
            else
                s2 = "";
            //    System.out.println("2_"+s2);
            str = s1 + s2;
            n0 = n1 = 0;
        }
        return "";
    }

    public String getDigit(String str) { //System.out.println(str);
        int n0 = str.indexOf("<font");
        if (n0 > 0) {
            int n1 = str.indexOf(">", n0);
            String s1 = str.substring(0, n0);
            String s2 = str.substring(n1);
            str = s1 + s2;
        }
        n0 = str.indexOf("class=");
        if (n0 > 0) {
            int n1 = str.indexOf(">", n0);
            int n2 = str.lastIndexOf("<", n0);
            String s1 = str.substring(0, n2 < 0 ? 0 : n2);
            String s2 = str.substring(n1);
            str = s1 + s2;
        }

        n0 = str.indexOf("width=");
        if (n0 > 0) {
            int n1 = str.indexOf(">", n0);
            int n2 = str.lastIndexOf("<", n0);
            String s1 = str.substring(0, n2 < 0 ? 0 : n2);
            String s2 = str.substring(n1);
            str = s1 + s2;
        }
        // System.out.println(str);
        char[] ch = str.trim().toCharArray();
        String tem = "";
        for (int i = 0; i < ch.length; i++) {
            if (Character.isDigit(ch[i]) || ch[i] == '.' || ch[i] == '-')
                tem += ch[i];

        }

        return tem;
    }

    public boolean CADRetail(String str, String filename, String keyword, double core, double corep, double retail,
                             double retailp, double onepreviousbase, double twopreviousbase, int botype, int bctype,
                             double boffset, int wotype, int wctype, double woffset, double fbt, double fwt, double sbt,
                             double swt, int quantity, int threadid) {

        int n0 = str.indexOf(keyword);
        int n1 = str.indexOf("</th>", n0 + 1);
        String no = str.substring(n0 - 1, n0);


        double data21 = twopreviousbase;

        // n0=str.indexOf("t002stub3 hdt002r1c3 uomt002r2c2", n1+1);
        n0 = str.indexOf("t00" + no + "stub3 hdt00" + no + "r1c3 uomt00" + no + "r2c2", n1 + 1);
        n1 = str.indexOf("</td>", n0 + 1);
        if (n0 < 0 || n1 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "retail data retrive");
            return false;
        }

        String tem1 = getDigit(str.substring(n0, n1));
        double data22 = Double.parseDouble(tem1);

        // n0=str.indexOf("t002stub3 hdt002r1c4 uomt002r2c2", n1+1);
        n0 = str.indexOf("t00" + no + "stub3 hdt00" + no + "r1c4 uomt00" + no + "r2c2", n1 + 1);
        n1 = str.indexOf("</td>", n0 + 1);
        if (n0 < 0 || n1 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "retail data retrive");
            return false;
        }

        tem1 = getDigit(str.substring(n0, n1));
        double data23 = Double.parseDouble(tem1);

        double data29 = getSSWR2((data22 - data21) / data21 * 100);
        double data2 = getSSWR2((data23 - data22) / data22 * 100);
        //    double data2=getSSWR2((data20-retail)+(data29-retailp)*0.3);
        /*/
        n0=str.indexOf("t002stub3 hdt002r1c5 uomt002r2c5", n1+1);
        n1=str.indexOf("</td>", n0+1);
        if(n0<0 || n1<0){
            displayerrmsg(filename,threadid,n0,n1,"retail data retrive");
            return false;
        }

         tem1=getDigit(str.substring(n0,n1));
        double data2=Double.parseDouble(tem1);

    //*/
        // core retail retrive

        double data11 = onepreviousbase;

        // n0=str.indexOf("t002stub4 hdt002r1c3 uomt002r2c2", n1+1);
        n0 = str.indexOf("t00" + no + "stub4 hdt00" + no + "r1c3 uomt00" + no + "r2c2", n1 + 1);
        n1 = str.indexOf("</td>", n0 + 1);
        if (n0 < 0 || n1 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "core retail data retrive");
            return false;
        }

        tem1 = getDigit(str.substring(n0, n1));
        double data12 = Double.parseDouble(tem1);

        //  n0=str.indexOf("t002stub4 hdt002r1c4 uomt002r2c2", n1+1);
        n0 = str.indexOf("t00" + no + "stub4 hdt00" + no + "r1c4 uomt00" + no + "r2c2", n1 + 1);
        n1 = str.indexOf("</td>", n0 + 1);
        if (n0 < 0 || n1 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "core retail data retrive");
            return false;
        }

        tem1 = getDigit(str.substring(n0, n1));
        double data13 = Double.parseDouble(tem1);

        double data19 = getSSWR2((data12 - data11) / data11 * 100);
        double data1 = getSSWR2((data13 - data12) / data12 * 100);
        //    double data1=getSSWR2(data10-core+(data19-corep)*0.3);


        return CAD_Submit("CAD_Retail", filename, 1, data1, data19, data2, data29, core, corep, retail, retailp, botype,
                          bctype, boffset, wotype, wctype, woffset, fbt, fwt, sbt, swt, quantity, threadid);
    }

    private void jCheckBox4_actionPerformed(ActionEvent e) {

    }

    private void addc(int c) {
        for (int i = 0; i < f5sc.length; i++) {
            if (f5sc[i] == c)
                return;
            else if (f5sc[i] == -1) {
                f5sc[i] = c;
                return;
            }
        }
    }

    private void wsname_actionPerformed(ActionEvent e) {

        if (!opstart)
            return;
        reset();

        jComboBox1.setSelectedIndex(wsname.getSelectedIndex());

        try {

            con = DriverManager.getConnection(source);
            ste = con.createStatement();

            temstr = "Select * from Websites where IPADD='" + ((String) (jComboBox1.getSelectedItem())).trim() + "'";
            // temstr="Select * from orders";// where country='USD'";

            rs = ste.executeQuery(temstr);
            //    int c=rs.getMetaData().getColumnCount();
            //    for(int i=0;i<c;i++){
            //        System.out.println(rs.getMetaData().getColumnName(i+1)+"  "+rs.getMetaData().getColumnTypeName(i+1)+"  "+rs.getMetaData().getSchemaName(i+1)+"  "+rs.getMetaData().getCatalogName(i+1)+"  "+rs.getMetaData().getTableName(i+1));
            //    }

            if (rs.next()) // && false)
            {


                Skip = rs.getInt("SKIP");
                Length = rs.getInt("Length");
                Keyword = rs.getString("keyword");
                if (Keyword != null)
                    Keyword = Keyword.trim().toLowerCase();
                jTextField3.setText("" + Skip);
                jTextField4.setText("" + Length);
                jTextField5.setText(Keyword);
                emchg = rs.getDouble("emchg");
                value1.setText("" + emchg);
                Uemrate = rs.getDouble("uemrate");
                value2.setText("" + Uemrate);
                currentip = rs.getString("IP").trim();
                currentfile = rs.getString("file").trim();
                ipstatus = rs.getInt("ipstatus");
                //ipstatus=1;
                Verifyword = rs.getString("verifyword");
                if (Verifyword != null)
                    Verifyword = Verifyword.trim().toLowerCase();
                // if(verifyword!=null)
                //    verifyword=verifyword.replace(" ", "");
                jTextField6.setText(Verifyword);
                Verifylength = rs.getInt("verifylength");
                value1L.setText("" + Verifylength);
                indicatorno1 = rs.getInt("contentlength");
                indicatornoF.setText("" + indicatorno1);
                Betterword = rs.getString("betterword");
                if (Betterword != null)
                    Betterword = Betterword.trim().toLowerCase();
                betterwordF.setText(Betterword);
                Betterlength = rs.getInt("betterlength");
                value1R.setText("" + Betterlength);
                Filetype = rs.getInt("hascode");
                value3.setText("" + Filetype);
                jCheckBox3.setSelected(rs.getInt("verifyplace") == 1 ? true : false);
                stages[0] = rs.getInt("stage");
                Updatetype = rs.getInt("updatetype");
                value1L.setText("" + Updatetype);
                long t = rs.getLong("CreateDT");
                jTextField7.setText(rs.getString("oldcode"));

                Oneprevious = rs.getDouble("oneprevious");
                onepreviousF.setText("" + Oneprevious);
                Twoprevious = rs.getDouble("twoprevious");
                twopreviousF.setText("" + Twoprevious);
                Oneprevious2 = rs.getDouble("threeprevious");
                // orderquantityF.setText(""+Oneprevious2);
                Twoprevious2 = rs.getDouble("fourprevious");
                // timespanF.setText(""+Twoprevious2);
                onepreviousbase1 = rs.getDouble("onepreviousbase");
                twopreviousbase1 = rs.getDouble("twopreviousbase");
                onepreviousBaseF.setText("" + onepreviousbase1);
                twopreviousBaseF.setText("" + twopreviousbase1);
                botype1 = rs.getInt("botype");
                botypeC.setSelectedIndex(botype1);
                bctype1 = rs.getInt("bctype");
                addc(bctype1);
                bctypeC.setSelectedIndex(bctype1);
                boffset1 = rs.getDouble("boffset");
                boffsetF.setText("" + boffset1);

                wotype1 = rs.getInt("wotype");
                wotypeC.setSelectedIndex(wotype1);
                wctype1 = rs.getInt("wctype");
                addc(wctype1);
                wctypeC.setSelectedIndex(wctype1);
                woffset1 = rs.getDouble("woffset");
                woffsetF.setText("" + woffset1);

                fbt1 = rs.getDouble("fbt");
                fbtF.setText("" + fbt1);
                fwt1 = rs.getDouble("fwt");
                fwtF.setText("" + fwt1);
                sbt1 = rs.getDouble("sbt");
                sbtF.setText("" + sbt1);
                swt1 = rs.getDouble("swt");
                swtF.setText("" + swt1);

                submit1 = rs.getInt("submit");
                submitC.setSelectedIndex(submit1);

                quantity1 = (int) rs.getDouble("quantity");
                orderquantityF.setText("" + quantity1);
                gassign1[0] = rs.getInt("para1");
                gassign1[1] = rs.getInt("para2");
                gassign1[2] = rs.getInt("para3");
                gassign1[3] = rs.getInt("para4");
                gassign1[4] = rs.getInt("para5");
                gassign1[5] = rs.getInt("para6");

                para1.setSelectedIndex(gassign1[0]);
                para2.setSelectedIndex(gassign1[1]);
                para3.setSelectedIndex(gassign1[2]);
                para4.setSelectedIndex(gassign1[3]);
                para6.setSelectedIndex(gassign1[5]);
                // para5.setSelectedIndex(gassign1[4]);


                jTextArea1.setText("Keyword:" + Keyword + "\nVerify Word:" + Verifyword + "\nCurrent IP:" + currentip +
                                   "\nCurrent File:" + currentfile + "\nIP Status:" + ipstatus + "\nSkip:" + Skip +
                                   "\nSkip Length:" + Length + "\nFirst Estimate:" + emchg + "\nSecond Estimate:" +
                                   Uemrate + "\nBackward Length:" + Betterlength + "\nStage:" + stages[0] +
                                   "\nModified Date Time:" + (new Date(t)) + " " + (new Time(t)));

            }

            rs.close();
            ste.close();
            con.close();
            if (jCheckBox4.isSelected())
                jTextField1.setText((String) jComboBox1.getSelectedItem());


        } catch (Exception ee) {
            System.out.println(ee.getMessage() + "\n" + ee.getStackTrace().toString());
            ee.printStackTrace();
        }
    }

    private void jButton5_actionPerformed(ActionEvent e) {
        String tem = value4.getText();
        if (tem == null || tem.length() == 0)
            tem = "5000";
        int st = Integer.parseInt(tem);

        sleeptime = st;
        if (std != null)
            std.sleeptime2 = st;

        if (trd != null)
            trd.sleeptime2 = st;

        if (f4rd != null)
            f4rd.sleeptime2 = st;

        if (f5rd != null)
            f5rd.sleeptime2 = st;

        if (s6rd != null)
            s6rd.sleeptime2 = st;

        if (rd7 != null)
            td7.sleeptime2 = st;
        if (rd8 != null)
            td8.sleeptime2 = st;

        if (rd9 != null)
            td9.sleeptime2 = st;

        if (rd10 != null)
            td10.sleeptime2 = st;

        if (rd11 != null)
            td11.sleeptime2 = st;


        jButton5.setToolTipText("Sleeptime=" + st);

    }

    private boolean USDGDP(String str, String filename, double emchg, double oneprevious, int threadid) //SAFE
        {
        int n0 = 0, n1 = 0;
        double data1 = 0, data = 0;
        String tem1 = "", tem2 = "";
        str = str.replace(" ", "");
        str = str.replace("\n", "");
        n0 = str.indexOf("percentinthesecondquarter");
        if (n0 < 0)
            n0 = str.indexOf("%");
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, n0, "'Percent' not found");
            return false;
        }

        tem2 = getDigit(str.substring(n0 - 5, n0));
        if (tem2.length() <= 0) {
            displayerrmsg(filename, threadid, -100, -100, "Empty str");
            return false;
        }

        data1 = Double.parseDouble(tem2);

        n1 = str.lastIndexOf("unitedstates", n0);
        if (n1 < 0) {
            displayerrmsg(filename, threadid, n0, n0, "sign retrieving failed");
            return false;
        }

        if (n1 > n0)
            n1 = 0;
        tem1 = str.substring(n1, n0);

        n1 = getSign(tem1);
        if (n1 == -1)
            data1 = 0 - data1;
        else if (n1 == 0 && Math.abs(data1) < 0.001)
            data1 = 0;

        //*look for previous data

        n0 = str.indexOf("percent", n0 + 1);
        if (n0 < 0)
            n0 = str.indexOf("%", n0 + 1);
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, n0, "'Percent' not found");
            return USD_Submit("GDP", filename, data1, oneprevious, 0, emchg, oneprevious, 0.2, threadid);

        }

        tem2 = getDigit(str.substring(n0 - 5, n0));
        if (tem2.length() <= 0) {
            displayerrmsg(filename, threadid, -100, -100, "Empty str");
            return USD_Submit("GDP", filename, data1, oneprevious, 0, emchg, oneprevious, 0.2, threadid);
        }

        double data2 = Double.parseDouble(tem2);

        n1 = str.lastIndexOf("inthefirstquarter", n0);
        if (n1 < 0) {
            displayerrmsg(filename, threadid, n0, n0, "sign retrieving failed");
            return USD_Submit("GDP", filename, data1, oneprevious, 0, emchg, oneprevious, 0.2, threadid);
        }

        if (n1 > n0)
            n1 = 0;
        tem1 = str.substring(n1, n0);

        n1 = getSign(tem1);
        if (n1 == -1)
            data2 = 0 - data2;
        else if (n1 == 0 && Math.abs(data2) < 0.001)
            data2 = 0;


        return USD_Submit("GDP", filename, data1, data2, 1, emchg, oneprevious, 0.2, threadid);


    }

    private boolean USDGDP_TXT(String str, String filename, double emchg, double oneprevious, int threadid) //SAFE
        {
        int n0 = 0, n1 = 0;
        double data1 = 0, data = 0;
        String tem1 = "", tem2 = "";
        str = str.replace(" ", "");
        str = str.replace("\n", "");
        n0 = str.indexOf("percentinthesecondquarter");
        if (n0 < 0)
            n0 = str.indexOf("%");
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, n0, "'Percent' not found");
            return false;
        }

        tem2 = getDigit(str.substring(n0 - 5, n0));
        if (tem2.length() <= 0) {
            displayerrmsg(filename, threadid, -100, -100, "Empty str");
            return false;
        }

        data1 = Double.parseDouble(tem2);

        n1 = str.lastIndexOf("unitedstates", n0);
        if (n1 < 0) {
            displayerrmsg(filename, threadid, n0, n0, "sign retrieving failed");
            return false;
        }

        if (n1 > n0)
            n1 = 0;
        tem1 = str.substring(n1, n0);

        n1 = getSign(tem1);
        if (n1 == -1)
            data1 = 0 - data1;
        else if (n1 == 0 && Math.abs(data1) < 0.001)
            data1 = 0;

        //*look for previous data

        n0 = str.indexOf("percent", n0 + 1);
        if (n0 < 0)
            n0 = str.indexOf("%", n0 + 1);
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, n0, "'Percent' not found");
            return USD_Submit("TXT", filename, data1, oneprevious, 0, emchg, oneprevious, 0.2, threadid);

        }

        tem2 = getDigit(str.substring(n0 - 5, n0));
        if (tem2.length() <= 0) {
            displayerrmsg(filename, threadid, -100, -100, "Empty str");
            return USD_Submit("TXT", filename, data1, oneprevious, 0, emchg, oneprevious, 0.2, threadid);
        }

        double data2 = Double.parseDouble(tem2);

        n1 = str.lastIndexOf("inthefirstquarter", n0);
        if (n1 < 0) {
            displayerrmsg(filename, threadid, n0, n0, "sign retrieving failed");
            return USD_Submit("TXT", filename, data1, oneprevious, 0, emchg, oneprevious, 0.2, threadid);
        }

        if (n1 > n0)
            n1 = 0;
        tem1 = str.substring(n1, n0);

        n1 = getSign(tem1);
        if (n1 == -1)
            data2 = 0 - data2;
        else if (n1 == 0 && Math.abs(data2) < 0.001)
            data2 = 0;

        //  System.out.println(data1+" "+data2);
        //*/
        return USD_Submit("TXT", filename, data1, data2, 1, emchg, oneprevious, 0.2, threadid);


    }

    private boolean USD_Submit(String name, String filename, double data1, double data19, int power, double emchg,
                               double oneprevious, double target, int threadid) {
        //  double target=0.3;
        // System.out.println(data1+" "+data19+" "+emchg+" "+oneprevious);

        if (power == 0)
            data19 = oneprevious; //????? power==0 means uncertain about the data got
        double data =
            getSSWR2(data1 - emchg +
                     (data19 - oneprevious) * 0.2); //has previous data,more reliable,can make reliable decision
        if (Math.abs(data) < target && power == 0) {
            System.out.println(threadid + "_" + name + " yield is here value=" + data1 + "  at " +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString());
            displayokmsg(filename, threadid, name + "  yield is here value=" + data1);
            return true;
        }

        if (!bdata1 && orderpermit.isSelected()) {
            displayokmsg(filename, threadid, " is late, data1=" + data1 + ",data19=" + (power == 1 ? data19 : "None "));
            if (power == 1 && data < target) {

                jTextField7.append(data1 + "   p=" + data19 + "  -------!!!!!");
                jTextField7.append(data1 + "   p=" + data19 + "  -------!!!!!");
                jTextField7.append(data1 + "   p=" + data19 + "  -------!!!!!");
            }
            return true;
        }
        bdata1 = false;


        if (((data) >= target)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(25000, getSSWR(sf.eurusd - 0.0010), SELLLMT, EURUSD); //sell EURUSD
            System.out.println(threadid + "_" + name + "_EURUSD Sell Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.eurusd));
            if (power == 0)
                displayokmsg(filename, threadid, data1, name + "_EURUSD Sell ," + (sf == null ? "" : sf.eurusd));
            else
                displayokmsg(filename, threadid, data1, data19,
                             name + "_EURUSD Sell ," + (sf == null ? "" : sf.eurusd));

            value1.setText("+" + data + "(" + getSSWR1(data1) + "..." + emchg + ")" + getSSWR1(data1 - emchg));
            value1.setForeground(new Color(0, 153, 0));


        } else if (((data) <= (0 - target - 0.1))) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(25000, getSSWR(sf.eurusd + 0.0010), BUYLMT, EURUSD); //buy EURUSD
            System.out.println(threadid + "_" + name + "_EURUSD Buy Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.eurusd));
            if (power == 0)
                displayokmsg(filename, threadid, data1, name + "_EURUSD Buy ," + (sf == null ? "" : sf.eurusd));
            else
                displayokmsg(filename, threadid, data1, data19, name + "_EURUSD Buy ," + (sf == null ? "" : sf.eurusd));
            value1.setText(data + "(" + getSSWR1(data1) + "..." + emchg + ")" + getSSWR1(data1 - emchg));
            value1.setForeground(Color.red);


        } else // if(data<0.3 && data>-0.3)
        {
            value1.setText((data > 0 ? "+" : "") + data + "(" + getSSWR1(data1) + "..." + emchg + ")" +
                           getSSWR1(data1 - emchg));
            value1.setForeground(Color.blue);

            System.out.println(threadid + "_" + name + "_EURUSD is here Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString());
            if (power == 0)
                displayokmsg(filename, threadid, data1, name + "_EURUSD is here Time=");
            else
                displayokmsg(filename, threadid, data1, data19, name + "_EURUSD is here Time=");

        }

        onepreviousF.setText(getSSWR1(data19 - oneprevious) + "(" + data19 + "  " + oneprevious + ")");
        onepreviousF.setForeground(data19 >= oneprevious ? new Color(0, 153, 0) : Color.red);


        return true;

    }

    private boolean CADBDPermit(String str, double emchg, double oneprevious) {
        int n1 = 0, n2 = 0;
        //  str=str.replace(" ", "");

        n1 = str.indexOf("<tbody", n1 + 1);
        n1 = str.indexOf("</tr", n1 + 1);


        n1 = str.indexOf("</td", n1 + 1);
        n1 = str.indexOf("</td", n1 + 1);
        n2 = str.indexOf("</td", n1 + 1);
        if (n1 < 0 || n2 < 0) {
            System.out.println(n2 + " n2, n1" + n1 + "    CADBDPermit previous  data 1retrieving");
            // return false;
        }
        String tem1 = getDigit(str.substring(n1, n2));
        if (tem1.length() <= 0) {
            System.out.println("Empty CADBDPermit previous  data1 retrieving");
            // return false;
        }

        double data_11 = Double.parseDouble(tem1);

        n1 = str.indexOf("</td", n2 + 1);
        if (n1 < 0 || n2 < 0) {
            System.out.println(n2 + " n2, n1" + n1 + "    CADBDPermit previous data2 retrieving");
            // return false;
        }
        tem1 = getDigit(str.substring(n2, n1));
        if (tem1.length() <= 0) {
            System.out.println("Empty CADBDPermit previous data2 retrieving");
            // return false;
        }

        double data_12 = Double.parseDouble(tem1);
        double data19 = getSSWR1(((data_12 - data_11) / data_11) * 100);

        n1 = str.indexOf("</td", n1 + 1);

        n2 = str.indexOf("</td", n1 + 1);
        if (n1 < 0 || n2 < 0) {
            System.out.println(n2 + " n2, n1" + n1 + "   CADBDPermit data retrieving");
            // return false;
        }
        tem1 = getDigit(str.substring(n1, n2));
        if (tem1.length() <= 0) {
            System.out.println("Empty CADBDPermit data retrieving");
            // return false;
        }

        double data1 = Double.parseDouble(tem1);

        double data = getSSWR1(data1 - emchg + (data19 - oneprevious) * 0.5);


        if (((data) >= 19)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(30000, getSSWR(sf.usdcad - 0.0010), SELLLMT, USDCAD); //sell EURUSD
            System.out.println("USDCAD Sell Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.usdcad));
            value1.setText("+" + data + "(" + data1 + "..." + emchg + ")" + getSSWR1(data1 - emchg));
            value1.setForeground(new Color(0, 153, 0));


        } else if (((data) <= -19)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(30000, getSSWR(sf.usdcad + 0.0010), BUYLMT, USDCAD); //buy EURUSD
            System.out.println("USDCAD Buy Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.usdcad));
            value1.setText(data + "(" + data1 + "..." + emchg + ")" + getSSWR1(data1 - emchg));
            value1.setForeground(Color.red);


        } else {
            value1.setText((data > 0 ? "+" : "") + data + "(" + data1 + "..." + emchg + ")" + getSSWR(data1 - emchg));
            value1.setForeground(Color.blue);

            System.out.println("CAD Building Permit is here Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString());

        }

        onepreviousF.setText(getSSWR1(data19 - oneprevious) + "(" + data19 + ".." + oneprevious + ")");
        onepreviousF.setForeground(data19 >= oneprevious ? new Color(0, 153, 0) : Color.red);


        return true;

    }

    private boolean CADTradBalance(String str, String filename, String keyword, double emchg, double oneprevious,
                                   int botype, int bctype, double boffset, int wotype, int wctype, double woffset,
                                   double fbt, double fwt, double sbt, double swt, int submit, int quantity,
                                   int threadid) {


        int n1 = str.indexOf(keyword);
        if (n1 < 0) {
            displayerrmsg(filename, threadid, n1, -99, "CADTrad balance1");
            return false;
        }
        String no = str.substring(n1 - 1, n1);
        System.out.println(no);
        // n1=str.indexOf("t001stub3 hdt001r1c6 uomt001r2c2",n1+1);
        n1 = str.indexOf("t00" + no + "stub15 hdt00" + no + "r1c3 uomt00" + no + "r2c", n1 + 1);
        n1 = str.indexOf(">", n1 + 1);

        int n2 = str.indexOf("</td", n1 + 1);
        if (n1 < 0 || n2 < 0) {
            displayerrmsg(filename, threadid, n1, n2, "CADTrad balance2");
            return false;
        }
        String tem1 = (str.substring(n1, n2));
        // System.out.println(str+",\n"+tem1);
        tem1 = getDigit(tem1);
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, -100, -100, "Emplty data1");
            return false;
        }

        double data19 = getSSWR2(Double.parseDouble(tem1) / 1000.0);


        n1 = str.indexOf("t00" + no + "stub15 hdt00" + no + "r1c4 uomt00" + no + "r2c", n1 + 1);
        n1 = str.indexOf(">", n1 + 1); //Good!
        n2 = str.indexOf("</td", n1 + 1);

        if (n1 < 0 || n2 < 0) {
            displayerrmsg(filename, threadid, n1, n2, "CAD Trade Balance2");
            return false;
        }
        tem1 = getDigit(str.substring(n1, n2));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, -100, -100, "Emplty data2");
            return false;
        }

        double data1 = getSSWR2(Double.parseDouble(tem1) / 1000.0);


        return CAD_Submit("CADTradeBalance", filename, 1, data1, data19, emchg, oneprevious, botype, bctype, boffset,
                          wotype, wctype, woffset, fbt, fwt, sbt, swt, quantity, threadid);


    }

    private boolean CAD_EC_RSS(String str, String filename, String betterword, int indicatorno, double emchg,
                               double oneprevious, double uemrate, double twoprevious, String verifyword, int botype,
                               int bctype, double boffset, int wotype, int wctype, double woffset, double fbt,
                               double fwt, double sbt, double swt, int quantity, int threadid) {

        //System.out.println(prices[2]);
        int n0 = 0, n1 = 0, n3 = 0, n4 = 0;
        String tem2 = "", tem3 = "";
        n0 = str.indexOf("<item>");
        n3 = str.indexOf("<pubdate>", n0 + 1);
        n4 = str.indexOf("</pubdate>", n3 + 1);
        if (n3 < 0 || n4 < 0) {
            displayerrmsg(filename, threadid, n3, n4, "CAD_EC_RSS1");
            return false;
        }

        tem3 = (str.substring(n3, n4)); //.replace(" ", "");
        if (tem3.contains(verifyword)) {
            displayvfmsg(filename, indicatorno == 100 ? "No update-All" : "No update-EC", threadid);
            return false;
        }

        n1 = 0;
        int m = 0;

        while (true) {
            m++;
            n0 = str.indexOf("<item>", n1 + 1);
            n1 = str.indexOf("</item>", n0 + 1);
            if (n0 < 0 || n1 < 0) {

                if (indicatorno == 100) {
                    displayokmsg(filename, threadid, " Has a new update(" + m + " tries)");
                    return true;
                }
                displayvfmsg(filename, m + " tries No update Found", threadid);
                return false;
            }
            tem2 = str.substring(n0, n1);
            n3 = 0;
            n3 = tem2.indexOf("<pubdate>");
            n4 = tem2.indexOf("</pubdate>", n3 + 1);
            tem3 = (tem2.substring(n3, n4)); //.replace(" ", "");

            // System.out.println(tem2+"\n"+tem3+"  "+betterword);
            if (!tem3.contains(betterword)) {
                continue;
            }


            n3 = tem2.indexOf("<description>");
            n4 = tem2.indexOf("</description>");
            if (n3 < 0 || n4 < 0) {
                displayerrmsg(filename, threadid, n3, n4, "CAD_EC_RSS2");
                return false;
            }
            tem3 = (tem2.substring(n3, n4));
            //   tem3="<description>Following two months of little change, employment in July declined by 30,000, the result of losses in part-time work. The unemployment rate rose 0.1 percentage points to 7.3%.<";
            //   tem3.toLowerCase();
            jTextArea1.setText(tem3);

            if ((indicatorno == 0) && tem3.contains("gross domestic")) {
                return CAD_GDP_TEXT(tem3, filename, emchg, oneprevious, botype, bctype, boffset, wotype, wctype,
                                    woffset, fbt, fwt, sbt, swt, quantity, threadid);
            } else if ((indicatorno == 1) && tem3.contains("unemployment rate")) {
                return CAD_LABOR_TEXT(tem3, filename, betterword, emchg, oneprevious, uemrate, twoprevious, botype,
                                      bctype, boffset, wotype, wctype, woffset, fbt, fwt, sbt, swt, quantity, threadid);
            }


        }


    }

    private boolean CADGDP(String str, String filename, String keyword, double emchg, double oneprevious, int botype,
                           int bctype, double boffset, int wotype, int wctype, double woffset, double fbt, double fwt,
                           double sbt, double swt, int submit, int quantity, int threadid) {

        int n1 = str.indexOf(keyword);
        String no = str.substring(n1 - 1, n1);
        //  System.out.println(no);
        // n1=str.indexOf("t001stub3 hdt001r1c6 uomt001r2c2",n1+1);
        n1 = str.indexOf("t00" + no + "stub3 hdt00" + no + "r1c6 uomt00" + no + "r2c2", n1 + 1);
        n1 = str.indexOf(">", n1 + 1);

        int n2 = str.indexOf("</td", n1 + 1);
        if (n1 < 0 || n2 < 0) {
            displayerrmsg(filename, threadid, n1, n2, "CADGDP1");
            return false;
        }
        String tem1 = (str.substring(n1, n2));
        // System.out.println(str+",\n"+tem1);
        tem1 = getDigit(tem1);
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, -100, -100, "Emplty data1");
            return false;
        }

        double data19 = Double.parseDouble(tem1);


        n1 = str.indexOf("t00" + no + "stub3 hdt00" + no + "r1c7 uomt00" + no + "r2c2", n1 + 1);
        n1 = str.indexOf(">", n1 + 1); //Good!
        n2 = str.indexOf("</td", n1 + 1);

        if (n1 < 0 || n2 < 0) {
            displayerrmsg(filename, threadid, n1, n2, "CADGDP2");
            return false;
        }
        tem1 = getDigit(str.substring(n1, n2));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, -100, -100, "Emplty data2");
            return false;
        }

        double data1 = Double.parseDouble(tem1);

        return CAD_Submit("CADGDP", filename, 1, data1, data19, emchg, oneprevious, botype, bctype, boffset, wotype,
                          wctype, woffset, fbt, fwt, sbt, swt, quantity, threadid);

    }

    private boolean CAD_GDP_TEXT(String str, String filename, double emchg, double oneprevious, int botype, int bctype,
                                 double boffset, int wotype, int wctype, double woffset, double fbt, double fwt,
                                 double sbt, double swt, int quantity, int threadid) // for EC_RSS
        {
        //For Jun

        //     if(true)
        //         return true;
        String pair = "CADGDP";
        String ostr = str;
        str = str.replace("&#160;", "");
        str = str.replace(" ", "");
        str = str.replace("\n", "");
        int n0 = str.indexOf("injun"); //to be changed later!

        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, -100, "CAD_GDP_TEXT0");
            return false;
        }

        n0 = str.lastIndexOf("%", n0);
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, -100, "CAD_GDP_TEXT1");
            return false;
        }
        String tem = getDigit(str.substring(n0 - 8, n0));
        if (tem.length() <= 0) {
            displayerrmsg(filename, threadid, -100, -100, "CAD_GDP_TEXT2");
            return false;
        }
        int sign = getSign(str.substring(n0 - 25, n0));
        double data1 = Double.parseDouble(tem);
        if (sign < 0)
            data1 = 0 - data1;


        n0 = str.indexOf("inmay", n0); //to be changed later!

        double target = 0.3;

        if (n0 < 0) {

            if (Math.abs(data1 - emchg) >= target)
                return CAD_Submit(pair, filename, 0, data1, oneprevious, emchg, oneprevious, botype, bctype, boffset,
                                  wotype, wctype, woffset, fbt, fwt, sbt, swt, quantity, threadid);
            else {
                displayvfmsg(filename, "Previous data missing", threadid);
                return true;
            }
        }
        n0 = str.lastIndexOf("%", n0);
        if (n0 < 0) {
            if (Math.abs(data1 - emchg) >= target)
                return CAD_Submit(pair, filename, 0, data1, oneprevious, emchg, oneprevious, botype, bctype, boffset,
                                  wotype, wctype, woffset, fbt, fwt, sbt, swt, quantity, threadid);
            else {
                displayvfmsg(filename, "Previous data missing2", threadid);
                return true;
            }
        }
        tem = getDigit(str.substring(n0 - 8, n0));
        if (tem.length() <= 0) {
            if (Math.abs(data1 - emchg) >= target)
                return CAD_Submit(pair, filename, 0, data1, oneprevious, emchg, oneprevious, botype, bctype, boffset,
                                  wotype, wctype, woffset, fbt, fwt, sbt, swt, quantity, threadid);
            else {
                displayvfmsg(filename, "Previous data missing3", threadid);
                return true;
            }
        }
        sign = getSign(str.substring(n0 - 25, n0));
        double data19 = Double.parseDouble(tem);
        if (sign < 0)
            data1 = 0 - data19;
        // System.out.println(str);
        return CAD_Submit(pair, filename, 1, data1, data19, emchg, oneprevious, botype, bctype, boffset, wotype, wctype,
                          woffset, fbt, fwt, sbt, swt, quantity, threadid);

    }

    private boolean CAD_LABOR_TEXT(String str, String filename, String betterword, double emchg, double oneprevious,
                                   double uerate, double twoprevious, int botype, int bctype, double boffset,
                                   int wotype, int wctype, double woffset, double fbt, double fwt, double sbt,
                                   double swt, int quantity, int threadid) {
        str = str.replace(" ", "");
        String pair = "CAD_Labor_Rss";
        // System.out.println(n0+"\n"+str);
        int n0 = str.lastIndexOf("employmentin");
        int n1 = str.indexOf(",000", n0);
        if (n0 < 0 || n1 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "CAD_labor_rss");
            return false;
        }
        String tem = getDigit(str.substring(n0, n1 + 6));
        if (tem.length() <= 0) {
            displayerrmsg(filename, threadid, -100, -100, "CAD_labor_rss2");
            return false;
        }

        double data1 = (Double.parseDouble(tem) / 1000);
        int sign = getSign(str.substring(n0, n1));
        if (sign < 0)
            data1 = 0 - data1;


        n0 = str.indexOf("%", n1);
        n1 = str.lastIndexOf("to", n0);
        if (n0 < 0 || n1 < 0) {
            displayerrmsg(filename, threadid, n0, -100, "CAD_labor_rss3");
            return false;
        }
        tem = getDigit(str.substring(n1, n0));
        if (tem.length() <= 0) {
            displayerrmsg(filename, threadid, -100, -100, "CAD_labor_rss4");
            return false;
        }

        double data2 = Double.parseDouble(tem);


        // System.out.println(data1+"  "+data2);
        // return true;
        return CAD_SubmitSndSP(pair, filename, 0, data1, oneprevious, data2, twoprevious, emchg, oneprevious, uerate,
                               twoprevious, botype, bctype, boffset, wotype, wctype, woffset, fbt, fwt, sbt, swt,
                               quantity, threadid);

    }

    private boolean CAD_CPI_TEXT(String str, String filename, double emchg, double oneprevious, int botype, int bctype,
                                 double boffset, int wotype, int wctype, double woffset, double fbt, double fwt,
                                 double sbt, double swt, int quantity, int threadid) // for EC_RSS
        {

        String pair = "CADCPI";
        str = str.replace("&#160;", "");
        int n0 = str.indexOf("may"); //to be changed later!

        // System.out.println(n0+"\n"+str);
        n0 = str.lastIndexOf("%", n0);
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, -100, "CAD_GDP_TEXT1");
            return false;
        }
        String tem = getDigit(str.substring(n0 - 8, n0));
        if (tem.length() <= 0) {
            displayerrmsg(filename, threadid, -100, -100, "CAD_GDP_TEXT2");
            return false;
        }
        int sign = getSign(str.substring(n0 - 25, n0));
        double data1 = Double.parseDouble(tem);
        if (sign < 0)
            data1 = 0 - data1;

        n0 = str.indexOf("april", n0); //to be changed later!
        if (n0 < 0) {

            return CAD_Submit(pair, filename, 0, data1, oneprevious, emchg, oneprevious, botype, bctype, boffset,
                              wotype, wctype, woffset, fbt, fwt, sbt, swt, quantity, threadid);
        }
        n0 = str.lastIndexOf("%", n0);
        if (n0 < 0) {

            return CAD_Submit(pair, filename, 0, data1, oneprevious, emchg, oneprevious, botype, bctype, boffset,
                              wotype, wctype, woffset, fbt, fwt, sbt, swt, quantity, threadid);
        }
        tem = getDigit(str.substring(n0 - 8, n0));
        if (tem.length() <= 0) {
            displayerrmsg(filename, threadid, -100, -100, "CAD_GDP_TEXT3");
            return CAD_Submit(pair, filename, 0, data1, oneprevious, emchg, oneprevious, botype, bctype, boffset,
                              wotype, wctype, woffset, fbt, fwt, sbt, swt, quantity, threadid);
        }
        sign = getSign(str.substring(n0 - 25, n0));
        double data19 = Double.parseDouble(tem);
        if (sign < 0)
            data19 = 0 - data19;
        // System.out.println(str);
        return CAD_Submit(pair, filename, 1, data1, data19, emchg, oneprevious, botype, bctype, boffset, wotype, wctype,
                          woffset, fbt, fwt, sbt, swt, quantity, threadid);

    }

    private boolean USDPHomeSales(String str, String filename, double emchg, double oneprevious, int threadid) {
        //----------3 locations need to be modified------------
        int n0 = 0, n1 = 0;
        double base = 95.1; //to be modified
        double data = 0, data1_1, data1_2;
        String tem1 = "";


        n0 = str.indexOf("<div id='maincol'>");
        n0 = str.indexOf("/research/phsdata", n0);
        //n0=str.indexOf("</p",n0+1);
        n1 = str.indexOf("</p", n0 + 1);


        if (n1 < 0 || n0 < 0) //if target is not found return;
        {
            log(filename, n1 + " n1,n0 " + n0 + " USDPHomeSales data retrieving");
            return false;
        }
        tem1 = ((str.substring(n0, n1)).replace(" ", "")).toLowerCase();

        n1 = tem1.indexOf("infeb"); //to be modified
        if (n1 < 0) {
            value1R.setText(threadid + " First No Match" + (int) (Math.random() * 10));
            log(filename,
                threadid + " First No Match at " + (new Time(System.currentTimeMillis() + timeoffset)).toString());
            return false;
        }
        String tem2 = getDigit(tem1.substring(n1 - 8, n1));
        if (tem2.length() > 0)
            data1_1 = Double.parseDouble(tem2);
        else {
            value1.setText(threadid + "No Data");
            log(filename,
                threadid + " Emplty data at" + (new Time(System.currentTimeMillis() + timeoffset)).toString());

            return false;
        }

        n1 = tem1.indexOf("injan"); //to be modified
        if (n1 < 0) {
            value1R.setText(threadid + "Second No Match");
            log(filename,
                threadid + " SecondErr NO Match at " + (new Time(System.currentTimeMillis() + timeoffset)).toString());

            return false;
        }
        tem2 = getDigit(tem1.substring(n1 - 8, n1));
        if (tem2.length() > 0)
            data1_2 = Double.parseDouble(tem2);
        else {
            value1.setText(threadid + "No Data");
            log(filename,
                threadid + " Second Emplty data at" + (new Time(System.currentTimeMillis() + timeoffset)).toString());

            return false;
        }

        oneprevious = getSSWR1((oneprevious - base) * 100 / base);
        double data19 = getSSWR1((data1_2 - base) * 100 / base);
        double data1 = getSSWR1((data1_1 - data1_2) * 100 / data1_2);

        System.out.println(data1_1 + "," + data1_2);

        data = this.getSSWR1(data1 - emchg + (data19 - oneprevious) * 0.5);

        if (data > 15) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(25000, sf.eurusd - 0.0003, SELLLMT, EURUSD); //sell EURUSD
            System.out.println("Sell Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," + sf.eurusd);
            log(filename,
                "Sell Order Issuring Time=" + (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                sf.eurusd);

            value1.setText("+" + data + "(" + data1 + "," + emchg + ")" + getSSWR(data1 - emchg));
            value1.setForeground(new Color(0, 153, 0));
        } else if (data <= -15) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(25000, sf.eurusd + 0.0003, BUYLMT, EURUSD); //buy EURUSD
            log(filename,
                "Buy Order Issuring Time=" + (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                sf.eurusd);
            System.out.println("Buy Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," + sf.eurusd);

            value1.setText(data + "(" + data1 + "," + emchg + ")" + getSSWR(data1 - emchg));
            value1.setForeground(Color.red);
        } else {
            value1.setText((data > 0 ? "+" : "") + data + "(" + data1 + "," + emchg + ")" + getSSWR(data1 - emchg));
            value1.setForeground(new Color(0, 153, 0));
            System.out.println("PHS Finish Time=" + (new Time(System.currentTimeMillis() + timeoffset)).toString());
            log(filename, "PHS Finish Time=" + (new Time(System.currentTimeMillis() + timeoffset)).toString());

        }

        onepreviousF.setText(getSSWR1(data19 - oneprevious) + "(" + data19 + ".." + oneprevious + ")");
        onepreviousF.setForeground(data19 >= oneprevious ? new Color(0, 153, 0) : Color.red);

        return true;
    }

    private boolean USD_CB_C_Confidence(String str, String filename, String verifyword, int threadid) {

        if (str.contains(verifyword)) {
            displayvfmsg(filename, "No update-c.confidence", threadid);
            return false;
        }
        //  System.out.println(threadid+"_CB_Updated at "+(new Time(System.currentTimeMillis()+timeoffset)).toString());
        displayokmsg(filename, threadid,
                     "_CB_Updated at " + (new Time(System.currentTimeMillis() + timeoffset)).toString());

        return true;
    }

    private boolean USDEHomeSales(String str, double emchg, double oneprevious, String verifyword, int threadid) {
        int n0 = 0, n1 = 0;
        double data = 0;
        String tem1 = "", tem2 = "";

        n0 = str.indexOf("<div id='maincol'>");
        n0 = str.indexOf("/research/ehsdata", n0);
        //n0=str.indexOf("</p",n0+1);
        n1 = str.indexOf("</p", n0 + 1);


        if (n1 < 0 || n0 < 0) //if target is not found return;
        {
            System.out.println(n1 + " n1,n0 " + n0 + " USDEHomeSales data retrieving");
            return false;
        }
        tem1 = str.substring(n0, n1);
        n0 = tem1.indexOf("million");
        System.out.println(tem1);
        if (n0 < 0) //if target is not found return;
        {
            System.out.println("n0 " + n0 + " USDEHomeSales data1 retrieving");
            return false;
        }

        tem2 = tem1.substring(n0 - 8, n0);
        double data1 = Double.parseDouble(getDigit(tem2));

        n0 = tem1.indexOf("million", n0 + 2);
        if (n0 < 0) //if target is not found return;
        {
            System.out.println("n0 " + n0 + " USDEHomeSales data19 retrieving");
            return false;
        }

        tem2 = tem1.substring(n0 - 8, n0);
        double data19 = Double.parseDouble(getDigit(tem2));


        data = this.getSSWR(data1 - emchg + (data19 - oneprevious) * 0.5);

        if (((data) >= 0.4) && !jCheckBox3.isSelected()) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(30000, getSSWR(sf.eurusd + 0.0010), BUYLMT, EURUSD); //sell EURUSD
            System.out.println(threadid + " EURUSD Buy Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.eurusd));
            value1.setText("+" + data + "(" + data1 + "," + emchg + ")");
            value1.setForeground(new Color(0, 153, 0));
        } else if (((data) <= -0.4) && !jCheckBox3.isSelected()) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(30000, getSSWR(sf.eurusd - 0.0010), SELLLMT, EURUSD); //buy EURUSD
            System.out.println(threadid + " EURUSD Sell Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.eurusd));
            value1.setText(data + "(" + data1 + "," + emchg + ")");
            value1.setForeground(Color.red);
        } else if (data < 0.4 && data > -0.4) {
            value1.setText((data > 0 ? "+" : "") + data + "(" + data1 + "," + emchg + ")");
            value1.setForeground(Color.blue);
            System.out.println(threadid + " USDEHomeSales is here:" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString());
        }
        onepreviousF.setText(getSSWR(data19 - oneprevious) + "(" + data19 + ".." + oneprevious + ")");
        onepreviousF.setForeground(data19 >= oneprevious ? new Color(0, 153, 0) : Color.red);


        return true;
    }

    private int getSign(String str) {
        if (str.contains("decline") || str.contains("decrease") || str.contains("declining") ||
            str.contains("decreasing") || str.contains("fell") || str.contains("drop") || str.contains("fall") ||
            str.contains("contract") || str.contains(" down ") || str.contains("slip")) {
            return -1;
        } else if (str.contains("surge") || str.contains("surging") || str.contains("increasing") ||
                   str.contains("increase") || str.contains("climb") || str.contains("rosing") ||
                   str.contains("rose") || str.contains("rise") || str.contains("expand") || str.contains("grow") ||
                   str.contains("grew") || str.contains(" up ") || str.contains(" advance ")) {
            return 1;
        }
        return 0;
    }

    private int getMth(String fs, String ss, String ts, String str) {
        if (str.contains(fs))
            return 1;
        else if (str.contains(ss))
            return 2;
        else if (str.contains(ts))
            return 3;
        else
            return -1;
    }

    private boolean AUD_RETAIL_MEDIA(String str, String filename, String betterword, double emchg, int threadid) {
        int n0 = str.indexOf("</table>");
        int n1 = str.indexOf("Media note:", n0 + 1);
        str = str.substring(n0, n1).replace(" ", "");
        n0 = str.indexOf(betterword);
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, -999, "No betterword found");
            return false;
        }


        n0 = str.indexOf("percentin" + betterword);
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, -999, "percent retrieving");
            return false;
        }
        String tem1 = getDigit(str.substring(n0 - 6, n0));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, -999, "empty data");
            return false;
        }
        double data11 = Double.parseDouble(tem1);

        n0 = str.indexOf("00to", n1);
        if (n0 < 0)
            n0 = str.indexOf("00peopleto");
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, -999, "data retrieving");
        }

        tem1 = getDigit(str.substring(n0 - 10, n0 + 3));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, -999, "empty data2");
            return false;
        }
        double data21 = Double.parseDouble(tem1);

        tem1 = getDigit(str.substring(n0 + 3, n0 + 25));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, -999, "empty data2");
            return false;
        }
        double data29 = Double.parseDouble(tem1);
        displayokmsg(filename, threadid, data11 + " " + data21 + "  " + data29);
        return true;
    }

    private boolean AUD_LABOR_MEDIA(String str, String filename, String verifyword, double emchg, double uemrate,
                                    double oneprevious, double twoprevious, int threadid) {
        int n0 = str.indexOf("</table>");
        int n1 = str.indexOf("media note:", n0 + 1);
        str = str.substring(n0, n1).replace(" ", "");
        n0 = str.indexOf(verifyword);
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, -999, "No verifyword found");
            return false;
        }


        n0 = str.indexOf("percentin" + verifyword);
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, -999, "percent retrieving");
            return false;
        }
        String tem1 = getDigit(str.substring(n0 - 6, n0));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, -999, "empty data");
            return false;
        }
        double data11 = Double.parseDouble(tem1);

        n0 = str.indexOf("00in" + verifyword);
        n1 = str.lastIndexOf("to", n0);
        if (n0 < 0 || n1 < 0) {
            displayerrmsg(filename, threadid, n0, -999, "employment retrieving");
            return false;
        }
        tem1 = getDigit(str.substring(n1, n0 + 3));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, -999, "empty data2");
            return false;
        }
        int data22 = (int) Double.parseDouble(tem1);
        //*/
        n0 = str.indexOf("00to");
        if (n0 < 0)
            n0 = str.indexOf("00peopleto");
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, -999, "data retrieving");
        }

        tem1 = getDigit(str.substring(n0 - 10, n0 + 3));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, -999, "empty data2");
            return false;
        }
        double data21 = Double.parseDouble(tem1);

        tem1 = getDigit(str.substring(n0 + 3, n0 + 25));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, -999, "empty data2");
            return false;
        }
        System.out.println(tem1);
        int data29 = (int) Double.parseDouble(tem1);
        if (data29 == data22) {
            displayokmsg(filename, threadid,
                         data11 + " " + data21 + " " + (data22 - twoprevious - data21)); //revised number
        }
        return true;
    }

    private boolean AUD_CPI_MEDIA(String str, String filename, String betterword, double emchg, int threadid) {
        int n0 = str.indexOf("</table>");
        int n1 = str.indexOf("Media note:", n0 + 1);
        str = str.substring(n0, n1).replace(" ", "");
        n0 = str.indexOf(betterword);
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, -999, "No betterword found");
            return false;
        }


        n0 = str.indexOf("percentin" + betterword);
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, -999, "percent retrieving");
            return false;
        }
        String tem1 = getDigit(str.substring(n0 - 6, n0));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, -999, "empty data");
            return false;
        }
        double data11 = Double.parseDouble(tem1);

        n0 = str.indexOf("00to", n1);
        if (n0 < 0)
            n0 = str.indexOf("00peopleto");
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, -999, "data retrieving");
        }

        tem1 = getDigit(str.substring(n0 - 10, n0 + 3));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, -999, "empty data2");
            return false;
        }
        double data21 = Double.parseDouble(tem1);

        tem1 = getDigit(str.substring(n0 + 3, n0 + 25));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, -999, "empty data2");
            return false;
        }
        double data29 = Double.parseDouble(tem1);
        displayokmsg(filename, threadid, data11 + " " + data21 + "  " + data29);
        return true;
    }

    private boolean AUD_Retail_Media(String str, String filename, double emchg, double oneprevious, int threadid) {
        str = str.replace(" ", "");
        int n0 = str.indexOf("thelatest");
        int n1 = str.indexOf("jun", n0); //to be changed
        n0 = str.lastIndexOf("%", n1);
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, -100, "AUD_Retail data1 retrieving");
            return false;
        }
        String tem1 = getDigit(str.substring(n0 - 8, n0));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, -100, -100, "Empty data1");
            return false;
        }

        double data1 = Double.parseDouble(tem1);
        int sign = getSign(str.substring(n0 - 25, n0));
        if (sign < 0)
            data1 = 0 - data1;

        n1 = str.indexOf("may", n1); //to be changed
        n0 = str.lastIndexOf("%", n1);
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, -100, "AUD_Retail data2 retrieving");
            return false;
        }
        tem1 = getDigit(str.substring(n0 - 8, n0));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, -100, -100, "Empty data19");
            return false;
        }

        double data19 = Double.parseDouble(tem1);
        sign = getSign(str.substring(n0 - 25, n0));
        if (sign < 0)
            data19 = 0 - data19;

        double data = getSSWR(data1 - emchg + (data19 - oneprevious) * 0.5);
        // data1=getSSWR(data1-emchg);
        // data19=getSSWR(data19-uemrate);
        if (((data) >= 0.5)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(25000, getSSWR(sf.audusd + 0.0010), BUYLMT, AUDUSD); //sell EURUSD
            System.out.println("AUDUSD Buy Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.audusd));
            displayokmsg(filename, threadid, data1, data19,
                         "AUDUSD Buy Order Issuring Time=" +
                         (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                         (sf == null ? "" : sf.audusd));
            value1.setText("+" + data + "(" + data1 + "..." + emchg + ")" + getSSWR(data1 - emchg));
            value1.setForeground(new Color(0, 153, 0));

        } else if (((data) <= -0.5)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(25000, getSSWR(sf.audusd - 0.0010), SELLLMT, AUDUSD); //buy EURUSD
            System.out.println("AUDUSD Sell Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.audusd));
            displayokmsg(filename, threadid, data1, data19,
                         "AUDUSD Sell Order Issuring Time=" +
                         (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                         (sf == null ? "" : sf.audusd));
            value1.setText(data + "(" + data1 + "..." + emchg + ")" + getSSWR(data1 - emchg));
            value1.setForeground(Color.red);

        } else {
            value1.setText((data > 0 ? "+" : "") + data + "(" + data1 + "..." + emchg + ")" + getSSWR(data1 - emchg));
            System.out.println("AUDRetail Finish Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString());
            displayokmsg(filename, threadid, data1, data19,
                         "AUDRetail Finish Time=" + (new Time(System.currentTimeMillis() + timeoffset)).toString());
            value1.setForeground(Color.blue);

        }

        onepreviousF.setText(getSSWR1(data19 - oneprevious) + "(" + data19 + "  " + oneprevious + ")");
        onepreviousF.setForeground(data19 >= oneprevious ? new Color(0, 153, 0) : Color.red);


        return true;

    }

    private boolean AUDRetail(String str, String filename, double emchg, double oneprevious, int threadid) {

        int n0 = 0, n1 = 0, n2 = 0, sign1, mn1, sign2, mn2;
        String tem1 = "", tem2 = "", s1 = "feb", s2 = "jan", s3 =
            "dec"; //s1=orderquantity.getText().trim().toLowerCase(),s2=pricelimit.getText().trim().toLowerCase(),s3=jTextField7.getText().trim().toLowerCase();
        double data1 = 0, data19 = 0, data = 0;
        boolean d1 = false, d2 = false;

        n0 = str.indexOf("<ul>");
        n0 = str.indexOf("<li", n0);
        n0 = str.indexOf("<li", n0 + 1);
        n1 = str.indexOf("<li", n0 + 1);
        tem2 = str.substring(n0, n1);
        // System.out.println(tem2);

        n0 = tem2.indexOf("%");
        if (n0 < 0)
            n0 = tem2.indexOf("percent");
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, -100, "AUD Retail data1 retrieving");
            return false;
        }
        tem1 = getDigit(tem2.substring(n0 - 5, n0));
        if (tem1.length() < 1) {
            displayerrmsg(filename, threadid, -100, -100, "AUD Retail empty data");
            return false;
        }
        data1 = Double.parseDouble(tem1);
        sign1 = getSign(tem2.substring(n0 - 15, n0 + 15));
        mn1 = getMth(s1, s2, s3, tem2.substring(n0 - 15, n0 + 20));
        // System.out.println(sign1+","+mn1+","+data1+"\n"+tem2);
        if (mn1 == 1) {
            if (sign1 == 0)
                data1 = 0;
            else
                data1 = (sign1 == 1 ? data1 : (0 - data1));

        } else if (mn1 == 2) {
            if (sign1 == 0)
                data19 = 0;
            else
                data19 = (sign1 == 1 ? data1 : (0 - data1));

            d2 = true;
            data1 = 0;
        } else {
            data1 = 0;
            data19 = 0;
        }


        n0 = tem2.indexOf("%", n0 + 1);
        if (n0 < 0)
            n0 = tem2.indexOf("percent");
        if (n0 > 0 && !d2) {
            tem1 = getDigit(tem2.substring(n0 - 5, n0));
            data19 = Double.parseDouble(tem1);
            sign2 = getSign(tem2.substring(n0 - 15, n0 + 15));
            mn2 = getMth(s1, s2, s3, tem2.substring(n0 - 15, n0 + 20));
            if (mn2 == 2) {
                if (sign2 == 0)
                    data19 = 0;
                else
                    data19 = (sign2 == 1 ? data19 : (0 - data19));

            } else
                data19 = 0;
        }


        data = getSSWR(data1 - emchg + (data19 - oneprevious) * 0.5);
        if (true) {

            displayokmsg(filename, threadid, data1, data19, "AUDRetail_OLD");
            return true;
        }
        // data1=getSSWR(data1-emchg);
        // data19=getSSWR(data19-uemrate);
        if (((data) >= 0.5)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(25000, getSSWR(sf.audusd + 0.0010), BUYLMT, AUDUSD); //sell EURUSD
            System.out.println("AUDUSD Buy Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.audusd));
            displayokmsg(filename, threadid, data1, data19,
                         "AUDUSD Buy Order Issuring Time=" +
                         (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                         (sf == null ? "" : sf.audusd));
            value1.setText("+" + data + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(new Color(0, 153, 0));

        } else if (((data) <= -0.5)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(25000, getSSWR(sf.audusd - 0.0010), SELLLMT, AUDUSD); //buy EURUSD
            System.out.println("AUDUSD Sell Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.audusd));
            displayokmsg(filename, threadid, data1, data19,
                         "AUDUSD Sell Order Issuring Time=" +
                         (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                         (sf == null ? "" : sf.audusd));
            value1.setText(data + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(Color.red);

        } else if (data < 0.5 && data > -0.5) {
            value1.setText((data > 0 ? "+" : "") + data + "(" + data1 + "..." + emchg + ")");
            System.out.println("AUDRetail Finish Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString());
            displayokmsg(filename, threadid, data1, data19,
                         "AUDRetail Finish Time=" + (new Time(System.currentTimeMillis() + timeoffset)).toString());
            value1.setForeground(Color.blue);

        }

        onepreviousF.setText(data19 + "(" + oneprevious + ")");
        onepreviousF.setForeground(data19 >= oneprevious ? new Color(0, 153, 0) : Color.red);


        return true;

    }

    private boolean AUD_BDApproval(String str, String filename, double emchg, double oneprevious, String verifyword,
                                   int threadid) {

        if (true) {

            displayokmsg(filename, threadid, "AUD_BDApproval");
            return true;
        }

        int n0 = 0, n1 = 0, n2 = 0, sign1 = 0, mn1 = 0, sign2 = 0, mn2 = 0;
        String tem1 = "", tem2 = "", s1 = "jan", s2 = "dec", s3 =
            "nov"; //s1=orderquantity.getText().trim().toLowerCase(),s2=pricelimit.getText().trim().toLowerCase(),s3=jTextField7.getText().trim().toLowerCase();
        double data1 = 0, data2 = 0, data = 0;
        boolean d1 = false, d2 = false;

        n0 = str.indexOf("<ul>");
        n0 = str.indexOf("<li", n0);
        n0 = str.indexOf("<li", n0 + 1);
        n1 = str.indexOf("<li", n0 + 1);
        tem2 = str.substring(n0, n1);
        // System.out.println(tem2);

        n0 = tem2.indexOf("%");
        if (n0 < 0)
            n0 = tem2.indexOf("percent");
        if (n0 < 0)
            return false;
        tem1 = getDigit(tem2.substring(n0 - 5, n0));
        if (tem1.length() < 1)
            return false;

        data1 = Double.parseDouble(tem1);
        sign1 = getSign(tem2.substring(n0 - 15, n0 + 15));
        mn1 = getMth(s1, s2, s3, tem2.substring(n0 - 15, n0 + 20));
        // System.out.println(sign1+","+mn1+","+data1+"\n"+tem2);
        if (mn1 == 1) {
            if (sign1 == 0)
                data1 = 0;
            else
                data1 = (sign1 == 1 ? data1 : (0 - data1));

        } else if (mn1 == 2) {
            if (sign1 == 0)
                data2 = 0;
            else
                data2 = (sign1 == 1 ? data1 : (0 - data1));

            d2 = true;
            data1 = 0;
        } else {
            data1 = 0;
            data2 = 0;
        }


        n0 = tem2.indexOf("%", n0 + 1);
        if (n0 < 0)
            n0 = tem2.indexOf("percent");
        if (n0 > 0 && !d2) {
            tem1 = getDigit(tem2.substring(n0 - 5, n0));
            data2 = Double.parseDouble(tem1);
            sign2 = getSign(tem2.substring(n0 - 15, n0 + 15));
            mn2 = getMth(s1, s2, s3, tem2.substring(n0 - 15, n0 + 20));
            if (mn2 == 2) {
                if (sign2 == 0)
                    data2 = 0;
                else
                    data2 = (sign2 == 1 ? data2 : (0 - data2));

            } else
                data2 = 0;
        }

        if (true) //for test only,to be removed
        {
            System.out.println(data1 + " , " + data2 + "," +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString());
            return false;
        }

        data = getSSWR(data1 - emchg + (data2 - oneprevious) * 0.8);
        // data1=getSSWR(data1-emchg);
        // data2=getSSWR(data2-uemrate);
        if (((data) >= 0.5)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(25000, getSSWR(sf.audusd + 0.0010), BUYLMT, AUDUSD); //sell EURUSD
            System.out.println("AUDUSD Buy Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.audusd));
            value1.setText("+" + data + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(new Color(0, 153, 0));
            value2.setText(data2 + "(" + oneprevious + ")");
            value2.setForeground(data2 >= oneprevious ? new Color(0, 153, 0) : Color.red);
        } else if (((data) <= -0.5)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(25000, getSSWR(sf.audusd - 0.0010), SELLLMT, AUDUSD); //buy EURUSD
            System.out.println("AUDUSD Sell Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.audusd));
            value1.setText(data + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(Color.red);
            value2.setText(data2 + "(" + oneprevious + ")");
            value2.setForeground(data2 >= oneprevious ? new Color(0, 153, 0) : Color.red);
        } else if (data < 0.5 && data > -0.5) {
            value1.setText((data > 0 ? "+" : "") + data + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(Color.blue);
            value2.setText(data2 + "(" + oneprevious + ")");
            value2.setForeground(data2 >= oneprevious ? new Color(0, 153, 0) : Color.red);
        }


        System.out.println("AUDRetail Finish Time=" + (new Time(System.currentTimeMillis() + timeoffset)).toString());


        return true;

    }

    private boolean AUDHomeLoanR(String str, double emchg, String verifyword, int threadid) {
        int n0 = str.indexOf("<a");
        n0 = str.indexOf("/", n0 + 1);
        int n1 = str.indexOf(">", n0 + 1);
        if (n1 < 0 || n0 < 0) //if target is not found return;
        {
            System.out.println(n1 + " n1,n0 " + n0 + " AUDHomeLoanR data1 retrieving");
            return false;
        }
        String tem1 = str.substring(n0 + 1, n1 - 1);
        if (tem1.length() == 0) {
            System.out.println("Empty  AUDHomeLoanR data1 retrieving");
            return false;
        }
        n0 = tem1.indexOf("spreadsheet&");
        n1 = tem1.indexOf("&", n0 + 12);
        if (n1 < 0 || n0 < 0) //if target is not found return;
        {
            System.out.println(n1 + " n1,n0 " + n0 + " AUDHomeLoanR data1 retrieving");
            return false;
        }
        tem1 = tem1.substring(n0 + 12, n1);

        //System.out.println(tem1);
        switch (threadid) {
        case 0:
            Filetype = EXCEL;
            stages[0] = 1;
            links[0] = "http://www.ausstats.abs.gov.au/ausstats/meisubs.nsf/0/" + tem1 + "/$File/560902.xls";
            // newurl="http://www.ausstats.abs.gov.au/ausstats/meisubs.nsf/0/4A0D8C44A7FCC689CA2579A0000D47E9/$File/560902.xls";
            return false;
        case 1:
            break;

        }
        return true;
    }

    private boolean AUDHomeLoan(String str, String filename, String verifyword, double emchg, double oneprevious,
                                int botype, int bctype, double boffset, int wotype, int wctype, double woffset,
                                double fbt, double fwt, double sbt, double swt, int submit, int quantity,
                                int threadid) {

        int n0 = str.indexOf("talbe");
        n0 = str.indexOf("</tr", n0 + 1);
        n0 = str.indexOf("</tr", n0 + 1);
        n0 = str.indexOf("</tr", n0 + 1);
        n0 = str.indexOf("</tr", n0 + 1);
        n0 = str.indexOf("</tr", n0 + 1);
        n0 = str.indexOf("</tr", n0 + 1);
        n0 = str.indexOf("</tr", n0 + 1);
        n0 = str.indexOf("</tr", n0 + 1);
        n0 = str.indexOf("</tr", n0 + 1);
        n0 = str.indexOf("</tr", n0 + 1);
        n0 = str.indexOf("</tr", n0 + 1);
        n0 = str.indexOf("</tr", n0 + 1);

        int n1 = str.lastIndexOf("<td", n0);
        if (n1 < 0 || n0 < 0) //if target is not found return;
        {
            System.out.println("AUDHomeLoan data1 retrieving");
            return false;
        }
        String tem1 = getDigit(removetag(str.substring(n1, n0)));

        if (tem1.length() == 0) {
            System.out.println("Empty  AUDHomeLoan data1 retrieving");
            return false;
        }
        double data1 = Double.parseDouble(tem1);

        if (true)
            return submit(submit, "AUDHomeLoan", filename, 0, data1, oneprevious, emchg, oneprevious, botype, bctype,
                          boffset, wotype, wctype, woffset, fbt, fwt, sbt, swt, quantity, threadid);

        double data = getSSWR(data1 - emchg);

        if (((data) >= 0.5)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(25000, getSSWR(sf.audusd + 0.0010), BUYLMT, AUDUSD); //sell EURUSD
            System.out.println(threadid + "AUDUSD Buy Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.audusd));
            value1.setText("+" + data + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(new Color(0, 153, 0));

        } else if (((data) <= -0.5)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(25000, getSSWR(sf.audusd - 0.0010), SELLLMT, AUDUSD); //buy EURUSD
            System.out.println(threadid + "AUDUSD Sell Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.audusd));
            value1.setText(data + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(Color.red);

        } else if (data < 0.5 && data > -0.5) {
            value1.setText((data > 0 ? "+" : "") + data + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(Color.blue);
            System.out.println(threadid + "AUDHomeLoan is here Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString());

        }


        System.out.println(threadid + " AUDHomeLoan Finish Time=" +
                           (new Time(System.currentTimeMillis() + timeoffset)).toString());


        return true;

    }

    private boolean TESTAU(String str) {


        int n0 = 0, n1 = 0, n2 = 0, sign1, mn1, sign2, mn2;
        String tem1 = "", tem2 = "", tem3 = "", tem4 = ""; //
        double data1 = 0, data2 = 0, data = 0;
        boolean d1 = false, d2 = false;

        n1 = str.indexOf("<td", n1 + 1);


        n1 = str.indexOf(">", n1 + 1); //Good!
        n2 = str.indexOf("/td>", n1);
        if (n1 < 0 || n2 < 0) {
            System.out.println(n2 + " n2, n1" + n1 + "    CADGDP previous data retrieving");
            return false;
        } else {
            tem4 = str.substring(n1, n2);
            // tem4=getDigit(str.substring(n1,n2));
        }

        n1 = str.indexOf("<td", n1 + 1);
        n1 = str.indexOf("<td", n1 + 1);
        n1 = str.indexOf(">", n1 + 1); //Good!
        n2 = str.indexOf("/td>", n1);
        if (n1 < 0 || n2 < 0) {
            System.out.println(n2 + " n2, n1" + n1 + "    CADGDP previous data retrieving");
            return false;
        } else {
            tem3 = str.substring(n1, n2);
            //tem3=getDigit(str.substring(n1,n2));
        }

        n0 = str.indexOf("<ul>");
        n0 = str.indexOf("<li", n0);
        n0 = str.indexOf("<li", n0 + 1);
        n1 = str.indexOf("<li", n0 + 1);
        if (n1 < 0 || n0 < 0) {
            System.out.println(n0 + " n0, n1" + n1);
            return false;
        }
        tem2 = str.substring(n0, n1);
        // System.out.println(tem2);

        n0 = tem2.indexOf("%");


        System.out.println(data1 + "  " + "," + tem4 + "," + tem3 + " " +
                           (new Time(System.currentTimeMillis() + timeoffset)).toString());


        return false;

    }

    private void CHFCPI(String str, double emchg) {
        int n0 = 0, n1 = 0, n2 = 0;
        String tem1 = "";
        n0 = str.lastIndexOf("</table");
        n0 = str.lastIndexOf("<tr", n0);
        n0 = str.lastIndexOf("</td", n0);
        n1 = str.lastIndexOf(">", n0); //IMPORTANT!
        tem1 = getDigit(str.substring(n1, n0));
        value1.setText(tem1);

        System.out.println("CHFCPI");

    }

    private boolean AUDRate(String str, String filename, double emchg, String verifyword, int threadid) {
        int n0 = 0, n1 = 0;
        String tem1 = "", tem2 = "";
        n0 = str.indexOf("<tbody");
        n0 = str.indexOf("</td", n0);
        n1 = str.lastIndexOf(">", n0);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "Verifyword retrieving");
            return false;
        }
        tem2 = str.substring(n1 + 1, n0);

        if (tem2.contains(verifyword)) {
            displayvfmsg(filename, "No update-rate", threadid);
            //  log+="\n"+ "verifyword match "+(new Time(System.currentTimeMillis()+timeoffset).toString());
            return false;
        }

        n1 = str.indexOf("</td", n0 + 1);
        n1 = str.indexOf("</td", n1 + 1);
        n0 = str.lastIndexOf(">", n1); //IMPORTant!

        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "data retrieving");
            return false;
        }
        tem1 = getDigit(str.substring(n0, n1));
        if (tem1.length() == 0) {
            displayerrmsg(filename, threadid, n0, n1, "empty string");
            return false;
        }
        double data1 = Double.parseDouble(tem1);

        double data = getSSWR1(data1 - emchg);

        if (((data) >= 0.25)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(25000, getSSWR(sf.audusd + 0.0010), BUYLMT, AUDUSD); //sell EURUSD
            System.out.println("AUDUSD Buy Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.audusd));
            value1.setText("+" + data + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(new Color(0, 153, 0));
            return true;
        } else if (((data) <= -0.25)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(25000, getSSWR(sf.audusd - 0.0010), SELLLMT, AUDUSD); //buy EURUSD
            System.out.println("AUDUSD Sell Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.audusd));
            value1.setText(data + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(Color.red);
            return true;
        } else if (data < 0.25 && data > -0.25) {
            value1.setText((data > 0 ? "+" : "") + data + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(Color.blue);
            System.out.println("AUDRate Finish Time=" + (new Time(System.currentTimeMillis() + timeoffset)).toString());
            return true;
        }


        return true;

    }

    private boolean AUDRate2(String str, String filename, double emchg, int threadid) {
        int n0 = str.indexOf("</table");
        int n1 = str.indexOf("</p>", n0 + 1);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1,
                          "\n" + n0 + " n0, n1" + n1 + " AUDRate2 data retrieving at" +
                          (new Time(System.currentTimeMillis() + timeoffset).toString()));
            return false;
        }
        str = str.substring(n0, n1);
        str = str.replace(" ", "");
        str = str.replace("&nbsp;", "");
        //System.out.println(str);

        n0 = str.indexOf("percent");
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, -100,
                          "\n" + n0 + " n0 " + " AUDRate2 data retrieving at" +
                          (new Time(System.currentTimeMillis() + timeoffset).toString()));
            return false;
        }
        // System.out.println(str.substring(n0-16, n0));
        String tem1 = getDigit(str.substring(n0 - 16, n0));
        if (tem1.length() == 0) {
            displayerrmsg(filename, threadid, -100, -100,
                          "\n" + " data1 empty " + (new Time(System.currentTimeMillis() + timeoffset).toString()));
            return false;
        }
        double data1 = Double.parseDouble(tem1);

        double data = getSSWR(data1 - emchg);


        return true;
    }

    private boolean AUD_RATE_RSS(String str, String filename, String verifyword, int threadid) {
        int n0 = str.indexOf("</channel>");
        n0 = str.indexOf("<item", n0 + 1);
        n0 = str.indexOf("<description", n0 + 1);
        int n1 = str.indexOf("</description", n0 + 1);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "description retrieving");

        }
        String tem1 = str.substring(n0, n1);


        n0 = str.indexOf("<dc:date>", n1 + 1);
        n1 = str.indexOf("</dc:date>", n0 + 1);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "description retrieving");

        }
        String tem2 = str.substring(n0, n1);

        if (tem2.contains(verifyword)) {
            //System.out.println(filename+","+threadid);
            displayvfmsg(filename, "No Update", threadid);
            return false;
        } else {
            jTextArea1.append(tem1);
            displayokmsg(filename, threadid, "has a new Rss update\n" + tem1);
            return true;
        }


    }

    private boolean AUDRss(String str, String filename, String betterword, String verifyword, int indicatorno,
                           double emchg, int threadid) {
        // System.out.println("?????");
        int n0 = str.indexOf("<description>");
        int n1 = str.indexOf("</description", n0 + 1);
        String tem2 = "";
        if (n1 < 0 || n0 < 0) {
            n0 = str.indexOf("<title>");
            n1 = str.indexOf("</title", n0 + 1);
            if (n1 < 0 || n0 < 0) {
                displayerrmsg(filename, threadid, n0, n1, "verifyword retrieving");
                return false;
            }

        }
        tem2 = str.substring(n0, n1);
        if (tem2.contains(verifyword)) {
            displayvfmsg(filename, "No Update_ Media_Rss", threadid);
            return false;
        }


        int n3 = 0, n4 = 0;
        String titlestr = "", desstr = "";

        while (true) {

            n0 = str.indexOf("<item>", n1 + 1);
            n1 = str.indexOf("</item>", n0 + 1);
            //   System.out.println(n0+" "+n1);
            if (n0 < 0 || n1 < 0) {

                if (indicatorno == 100) {
                    jTextArea1.append(titlestr + "\n" + desstr);
                    displayokmsg(filename, threadid, " Has a new update\n" + titlestr + "\n" + desstr);
                    return true;
                }
                displayvfmsg(filename, "No more Found", threadid);
                return false;
            }
            tem2 = str.substring(n0, n1);


            n3 = 0;
            n3 = tem2.indexOf("<title>");
            n4 = tem2.indexOf("</title>", n3 + 1);
            if (n3 < 0 || n4 < 0) {
                displayerrmsg(filename, threadid, n3, n4, "title retrieving");
                return false;
            }
            titlestr = (tem2.substring(n3, n4)); //.replace(" ", "");

            if (titlestr.contains("upcoming abs releases")) { // endof list

                if (indicatorno == 100) {
                    displayokmsg(filename, threadid, " Has a new update");
                    return true;
                }
                displayvfmsg(filename, "No more Found2", threadid);
                return false;

            }

            //    System.out.println(titlestr);

            n3 = tem2.indexOf("<description>", n4 + 1);
            n4 = tem2.indexOf("</description>", n3 + 1);
            if (n3 < 0 || n4 < 0) {
                displayerrmsg(filename, threadid, n3, n4, "description2 retrieving");
                desstr = "E";
            } else
                desstr = (tem2.substring(n3, n4));

            //  titlestr="National Accounts: Economy decreased by 0.3% (seasonally adjusted) in the March quarter 2012 (released 6 June 2012)";
            //    titlestr=titlestr.toLowerCase();
            if ((indicatorno == 0) && titlestr.contains(betterword)) {
                return AUD_RSS_CAL(titlestr, desstr, filename, indicatorno, emchg, threadid);
            } else if ((indicatorno == 1) && titlestr.contains(betterword)) {
                return AUD_RSS_CAL(titlestr, desstr, filename, indicatorno, emchg, threadid);
            }


        }

    }

    private boolean Aleart(String str, String filename, String verifyword, String betterword, int threadid) {
        // System.out.println("?????");
        if (verifyword == null || betterword == null)
            return true;

        int n0 = str.indexOf(verifyword.trim());
        String tem = str.substring(0, n0);
        int n1 = tem.indexOf("$");
        n0 = tem.indexOf("<", n1);
        String tem2 = tem.substring(n1, n0);
        double price = Double.parseDouble(getDigit(tem2));
        // show.setText("p="+price);
        if (tem.contains(betterword.trim()) && price <= 1200) {
            makesound("J:\\home\\me\\workplace\\IBJts\\class\\alert2.wav");
            makesound("J:\\home\\me\\workplace\\IBJts\\class\\alert2.wav");
            makesound("J:\\home\\me\\workplace\\IBJts\\class\\alert2.wav");
            // System.out.println("WOK");
        } else {
            displayvfmsg(filename, "No News p=" + price, threadid);
        }

        return false;
    }

    public void makesound(String strFilename) {
        File soundFile = new File(strFilename);

        
        AudioInputStream audioInputStream = null;
        try {
            audioInputStream = AudioSystem.getAudioInputStream(soundFile);
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }

       
        AudioFormat audioFormat = audioInputStream.getFormat();

      
        SourceDataLine line = null;
        DataLine.Info info = new DataLine.Info(SourceDataLine.class, audioFormat);
        try {
            line = (SourceDataLine) AudioSystem.getLine(info);

            line.open(audioFormat);
        } catch (LineUnavailableException e) {
            e.printStackTrace();
            System.exit(1);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

        
        line.start();

        
        int nBytesRead = 0;
        byte[] abData = new byte[EXTERNAL_BUFFER_SIZE];
        while (nBytesRead != -1) {
            try {
                nBytesRead = audioInputStream.read(abData, 0, abData.length);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (nBytesRead >= 0) {
                int nBytesWritten = line.write(abData, 0, nBytesRead);
            }
        }

        
        line.drain();

       
        line.close();
    }

    private boolean AUD_RSS_CAL(String title, String desc, String filename, int indicatorno, double emchg,
                                int threadid) {

        // System.out.println(title+"\n"+desc);
        title = title.replace(" ", "");
        title = title.replace("&nbsp;", "");

        desc = desc.replace(" ", "");
        desc = desc.replace("&nbsp;", "");
        String tem1 = "", tem2 = "";
        int n0 = 0, n1 = 0;
        switch (indicatorno) {
        case 0: //GDP

            n0 = title.indexOf("%");
            if (n0 < 0) {
                n0 = desc.indexOf("%");
                if (n0 < 0) {
                    displayerrmsg(filename, threadid, n0, -100,
                                  "\n" + n0 + " n0 " + " GDP data retrieving at" +
                                  (new Time(System.currentTimeMillis() + timeoffset).toString()));
                    return false;
                }
                tem1 = getDigit(desc.substring((n0 - 16) < 0 ? 0 : (n0 - 16), n0));
            }

            tem1 = (title.substring((n0 - 35) < 0 ? 0 : (n0 - 16), n0));
            tem2 = getDigit(tem1);
            if (tem2.length() == 0) {
                displayerrmsg(filename, threadid, -100, -100,
                              "\n" + " data1 empty " + (new Time(System.currentTimeMillis() + timeoffset).toString()));
                return false;
            }

            double data1 = Double.parseDouble(tem2);

            n1 = getSign(tem1);
            if (n1 == -1)
                data1 = 0 - data1;
            else if (n1 == 0)
                data1 = emchg;

            return AUDSubmit(filename, data1 - emchg, data1, emchg, threadid);
        case 1:
            return true;

        }

        return false;
    }

    private boolean AUD_STS_Headline(String str, String filename, String betterword, int betterlength, double emchg,
                                     double oneprevious, String verifyword, int threadid) {
        int n0 = 0, n1 = 0, n3 = 0, n4 = 0;
        String tem2 = "", tem3 = "";
        n0 = str.indexOf("<item>");
        n3 = str.indexOf("<title>", n0 + 1);
        n4 = str.indexOf("</title>", n3 + 1);
        if (n3 < 0 || n4 < 0) {
            displayerrmsg(filename, threadid, n3, n4, "AUD_STS_Headline1");
            return false;
        }


        tem3 = (str.substring(n3, n4)).replace(" ", "");
        if (tem3.contains(verifyword)) {
            displayvfmsg(filename, "No update_Headline", threadid);
            return false;
        } else if (!tem3.contains(verifyword)) {
            displayokmsg(filename, threadid, "has a new Rss update");
            return true;
        }


        if (true)
            return false;

        tem3 = (str.substring(n3, n4)).replace(" ", "");
        if (!tem3.contains(verifyword)) {
            displayvfmsg(filename, "No update", threadid);
            return false;
        }

        while (true) {

            n0 = str.indexOf("<item>", n1);
            n1 = str.indexOf("</item>", n0 + 1);
            if (n0 < 0 || n1 < 0) {
                displayvfmsg(filename, "Not Found-HL", threadid);
                return false;
            }
            tem2 = str.substring(n0, n1);
            n3 = 0;
            n3 = tem2.indexOf("<title>");
            n4 = tem2.indexOf("</title>", n3 + 1);
            tem3 = (tem2.substring(n3, n4)).replace(" ", "");
            // System.out.println(tem3);
            if (tem3.contains(verifyword) && tem3.contains(betterword)) {


                switch (betterlength) {

                case 1: //labor
                    return AUD_LABOR_TEXT(str, filename, emchg, oneprevious, threadid);


                }

                displayvfmsg(filename, "shouldn't be here", threadid);
                return false;

            }


        }

    }

    private boolean AUD_STS_Home(String str, String filename, String betterword, int betterlength, double emchg,
                                 double oneprevious, String verifyword, int threadid) {
        // str=str.replace(" ", "");
        int n0 = str.indexOf("<!-- prrelease -->");
        int n1 = str.indexOf("<a", n0);
        if (n0 < 0 || n1 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "AUD_STS_Home1");
            return false;
        }
        String tem1 = str.substring(n0, n1);
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, -100, -100, "Emplty data1");
            return false;
        }

        n0 = tem1.indexOf(verifyword);

        if (n0 < 0) {
            displayokmsg(filename, threadid, "has a new update");
            return true;
        }

        n0 = str.indexOf("<!-- mrrelease -->");
        n1 = str.indexOf("<a", n0);
        if (n0 < 0 || n1 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "AUD_STS_Home2");
            return false;
        }

        String tem2 = str.substring(n0, n1);

        if (tem2.contains(betterword)) {
            displayvfmsg(filename, "No update", threadid);
            return false;
        } else {
            displayokmsg(filename, threadid, "has a new update");
            return true;
        }


    }

    private boolean AUD_LABOR_TEXT(String str, String filename, double emchg, double oneprevious, int threadid) {

        displayokmsg(filename, threadid, "AUD_Labor is here");
        return true;
    }

    private boolean CADRss(String str, String filename, String verifyword, int botype, int bctype, double boffset,
                           int wotype, int wctype, double woffset, int threadid) {
        int n0 = str.indexOf("<item>");
        n0 = str.indexOf("<description", n0 + 1);
        int n1 = str.indexOf("</description", n0 + 1);
        //  System.out.println("are you here?"+n0+" "+n1);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "CADRss retrievingat");
            return false;
        }
        String tem1 = str.substring(n0, n1);
        // System.out.println("are you here?");
        if (tem1.contains(verifyword)) {

            displayvfmsg(filename, "No update-CAD Rss", threadid);
            return false;
        } else {
            // System.out.println(threadid+" CADRss has  new RSS update at "+(new Time(System.currentTimeMillis()+timeoffset)).toString());
            displayokmsg(filename, threadid,
                         " CADRss has  new RSS update at " +
                         (new Time(System.currentTimeMillis() + timeoffset)).toString());
            return true;
        }

    }

    public void displayvfmsg(String filename, int threadid) {

        switch (threadid) {
        case 0:
            show.setText("0_verifyword match_" + (int) (Math.random() * 10));
            break;
        case 2:
            td2info.setText("2_verifyword match_" + (int) (Math.random() * 10));
            break;
        case 3:
            td3info.setText("3_verifyword match_" + (int) (Math.random() * 10));
            break;
        case 4:
            td4info.setText("4_verifyword match_" + (int) (Math.random() * 10));
            break;
        case 5:
            td5info.setText("5_verifyword match_" + (int) (Math.random() * 10));
            break;
        case 6:
            td6info.setText("6_verifyword match_" + (int) (Math.random() * 10));
            break;
        case 7:
            td7info.setText("7_verifyword match_" + (int) (Math.random() * 10));
            break;
        case 8:
            td8info.setText("8_verifyword match_" + (int) (Math.random() * 10));
            break;
        case 9:
            td9info.setText("9_verifyword match_" + (int) (Math.random() * 10));
            break;
        case 10:
            td10info.setText("10_verifyword match_" + (int) (Math.random() * 10));
            break;
        case 11:
            td11info.setText("11_verifyword match_" + (int) (Math.random() * 10));
            break;
        }
        log(filename,
            threadid + "_verifyword match at" + (new Time(System.currentTimeMillis() + timeoffset)).toString());
    }

    public void displayvfmsg(String filename, String msg, int threadid) {
        switch (threadid) {
        case 0:
            show.setText("0_" + msg + "_" + (int) (Math.random() * 10));
            break;
        case 2:
            td2info.setText("2_" + msg + "_" + (int) (Math.random() * 10));
            break;
        case 3:
            td3info.setText("3_" + msg + "_" + (int) (Math.random() * 10));
            break;
        case 4:
            td4info.setText("4_" + msg + "_" + (int) (Math.random() * 10));
            break;
        case 5:
            td5info.setText("5_" + msg + "_" + (int) (Math.random() * 10));
            break;
        case 6:
            td6info.setText("6_" + msg + "_" + (int) (Math.random() * 10));
            break;
        case 7:
            td7info.setText("7_" + msg + "_" + (int) (Math.random() * 10));
            break;
        case 8:
            td8info.setText("8_" + msg + "_" + (int) (Math.random() * 10));
            break;
        case 9:
            td9info.setText("9_" + msg + "_" + (int) (Math.random() * 10));
            break;
        case 10:
            td10info.setText("10_" + msg + "_" + (int) (Math.random() * 10));
            break;
        case 11:
            td11info.setText("11_" + msg + "_" + (int) (Math.random() * 10));
            break;
        }
        log(filename,
            threadid + "_" + msg + "_verifyword match at" +
            (new Time(System.currentTimeMillis() + timeoffset)).toString());
    }

    public void displayokmsg(String filename, int threadid, String msg) {
        switch (threadid) {
        case 0:
            show.setText("0_got data:" + " " + msg);
            break;
        case 2:
            td2info.setText("2_got data:" + " " + msg);
            break;
        case 3:
            td3info.setText("3_got data:" + " " + msg);
            break;
        case 4:
            td4info.setText("4_got data:" + " " + msg);
            break;
        case 5:
            td5info.setText("5_got data:" + " " + msg);
            break;
        case 6:
            td6info.setText("6_got data:" + " " + msg);
            break;
        case 7:
            td7info.setText("7_got data:" + " " + msg);
            break;
        case 8:
            td8info.setText("8_got data:" + " " + msg);
            break;
        case 9:
            td9info.setText("9_got data:" + " " + msg);
            break;
        case 10:
            td10info.setText("10_got data:" + " " + msg);
            break;
        case 11:
            td11info.setText("11_got data:" + " " + msg);
            break;
        }
        if (threadid != 0)
            jTextField7.insert(threadid + "_ " + msg + " at " +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "\n", 0);
        log(filename, threadid + "_ " + msg + " at " + (new Time(System.currentTimeMillis() + timeoffset)).toString());

    }

    public void displayokmsg(String filename, int threadid, double value1, String msg) {
        switch (threadid) {
        case 0:
            show.setText("0=" + value1 + " : " + msg);
            break;
        case 2:
            td2info.setText("2=" + value1);
            break;
        case 3:
            td3info.setText("3=" + value1);
            break;
        case 4:
            td4info.setText("4=" + value1);
            break;
        case 5:
            td5info.setText("5=" + value1);
            break;
        case 6:
            td6info.setText("6=" + value1);
            break;
        case 7:
            td7info.setText("7=" + value1);
            break;
        case 8:
            td8info.setText("8=" + value1);
            break;
        case 9:
            td9info.setText("9=" + value1);
            break;
        case 10:
            td10info.setText("10=" + value1);
            break;
        case 11:
            td11info.setText("11=" + value1);
            break;
        }
        if (threadid != 0)
            jTextField7.insert(threadid + "_ " + msg + " at " +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "\n", 0);
        log(filename,
            threadid + "_ " + value1 + " " + msg + " at " +
            (new Time(System.currentTimeMillis() + timeoffset)).toString());

    }

    public void displayokmsg(String filename, int threadid, double value1, double value2, String msg) {
        switch (threadid) {
        case 0:
            show.setText("0=" + value1 + "," + value2 + " :  " + msg);
            break;
        case 2:
            td2info.setText("2=" + value1 + "," + value2);
            break;
        case 3:
            td3info.setText("3=" + value1 + "," + value2);
            break;
        case 4:
            td4info.setText("4=" + value1 + "," + value2);
            break;
        case 5:
            td5info.setText("5=" + value1 + "," + value2);
            break;
        case 6:
            td6info.setText("6=" + value1 + "," + value2);
            break;
        case 7:
            td7info.setText("7=" + value1 + "," + value2);
            break;
        case 8:
            td8info.setText("8=" + value1 + "," + value2);
            break;
        case 9:
            td9info.setText("9=" + value1 + "," + value2);
            break;
        case 10:
            td10info.setText("10=" + value1 + "," + value2);
            break;
        case 11:
            td11info.setText("11=" + value1 + "," + value2);
            break;
        }
        if (threadid != 0)
            jTextField7.insert(threadid + "_ " + msg + " at " +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "\n", 0);
        log(filename,
            threadid + "_ " + value1 + "," + value2 + " " + msg + " at " +
            (new Time(System.currentTimeMillis() + timeoffset)).toString());

    }

    public void displayokmsg(String filename, int threadid, double value1, double value2, double value3, double value4,
                             String msg) {
        switch (threadid) {
        case 0:
            show.setText("0=" + value1 + "," + value2 + " " + value3 + "," + value4 + " :  " + msg);
            break;
        case 2:
            td2info.setText("2=" + value1 + "," + value2 + " " + value3 + "," + value4);
            break;
        case 3:
            td3info.setText("3=" + value1 + "," + value2 + " " + value3 + "," + value4);
            break;
        case 4:
            td4info.setText("4=" + value1 + "," + value2 + " " + value3 + "," + value4);
            break;
        case 5:
            td5info.setText("5=" + value1 + "," + value2 + " " + value3 + "," + value4);
            break;
        case 6:
            td6info.setText("6=" + value1 + "," + value2 + " " + value3 + "," + value4);
            break;
        case 7:
            td7info.setText("7=" + value1 + "," + value2 + " " + value3 + "," + value4);
            break;
        case 8:
            td8info.setText("8=" + value1 + "," + value2 + " " + value3 + "," + value4);
            break;
        case 9:
            td9info.setText("9=" + value1 + "," + value2 + " " + value3 + "," + value4);
            break;
        case 10:
            td10info.setText("10=" + value1 + "," + value2 + " " + value3 + "," + value4);
            break;
        case 11:
            td11info.setText("11=" + value1 + "," + value2 + " " + value3 + "," + value4);
            break;
        }
        if (threadid != 0)
            jTextField7.insert(threadid + "_ " + msg + " at " +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "\n", 0);
        log(filename,
            threadid + "_ " + value1 + "," + value2 + " " + value3 + "," + value4 + " " + msg + " at " +
            (new Time(System.currentTimeMillis() + timeoffset)).toString());

    }

    public void displayerrmsg(String filename, int threadid, int n0, int n1, String msg) {
        switch (threadid) {
        case 0:
            show.setText("0_err_" + (int) (Math.random() * 10) + " " + n0 + " n0n1 " + n1 + " " + msg);
            break;
        case 2:
            td2info.setText("2_err_" + (int) (Math.random() * 10));
            break;
        case 3:
            td3info.setText("3_err_" + (int) (Math.random() * 10));
            break;
        case 4:
            td4info.setText("4_err_" + (int) (Math.random() * 10));
            break;
        case 5:
            td5info.setText("5_err_" + (int) (Math.random() * 10));
            break;
        case 6:
            td6info.setText("6_err_" + (int) (Math.random() * 10));
            break;
        case 7:
            td7info.setText("7_err_" + (int) (Math.random() * 10));
            break;
        case 8:
            td8info.setText("8_err_" + (int) (Math.random() * 10));
            break;
        case 9:
            td9info.setText("9_err_" + (int) (Math.random() * 10));
            break;
        case 10:
            td10info.setText("10_err_" + (int) (Math.random() * 10));
            break;
        case 11:
            td11info.setText("11_err_" + (int) (Math.random() * 10));
            break;
        }
        log(filename,
            threadid + "_" + n0 + "=n0, n1=" + n1 + "__" + msg + "_at_" +
            (new Time(System.currentTimeMillis() + timeoffset)).toString());

    }

    public void displayerrmsg(String filename, int threadid, int n0, int n1, String msg, String longmsg) {
        switch (threadid) {
        case 0:
            show.setText("0_err_" + (int) (Math.random() * 10) + " " + n0 + " n0n1 " + n1 + " " + msg);
            break;
        case 2:
            td2info.setText("2_err_" + (int) (Math.random() * 10) + " " + n0 + " n0n1 " + n1 + " " + msg);
            break;
        case 3:
            td3info.setText("3_err_" + (int) (Math.random() * 10) + " " + n0 + " n0n1 " + n1 + " " + msg);
            break;
        case 4:
            td4info.setText("4_err_" + (int) (Math.random() * 10) + " " + n0 + " n0n1 " + n1 + " " + msg);
            break;
        case 5:
            td5info.setText("5_err_" + (int) (Math.random() * 10) + " " + n0 + " n0n1 " + n1 + " " + msg);
            break;
        case 6:
            td6info.setText("6_err_" + (int) (Math.random() * 10) + " " + n0 + " n0n1 " + n1 + " " + msg);
            break;
        case 7:
            td7info.setText("7_err_" + (int) (Math.random() * 10) + " " + n0 + " n0n1 " + n1 + " " + msg);
            break;
        case 8:
            td8info.setText("8_err_" + (int) (Math.random() * 10) + " " + n0 + " n0n1 " + n1 + " " + msg);
            break;
        case 9:
            td9info.setText("9_err_" + (int) (Math.random() * 10) + " " + n0 + " n0n1 " + n1 + " " + msg);
            break;
        case 10:
            td10info.setText("10_err_" + (int) (Math.random() * 10) + " " + n0 + " n0n1 " + n1 + " " + msg);
            break;
        case 11:
            td11info.setText("11_err_" + (int) (Math.random() * 10) + " " + n0 + " n0n1 " + n1 + " " + msg);
            break;
        }
        log(filename,
            threadid + "_" + n0 + "=n0, n1=" + n1 + "__" + msg + "_at_" +
            (new Time(System.currentTimeMillis() + timeoffset)).toString());
        jTextArea1.setText(longmsg);
    }

    private boolean USDCensusHome(String str, String filename, String verifyword_l, int threadid) {
        int n0 = str.indexOf("<tbody>");
        n0 = str.indexOf("<td", n0 + 1);
        n0 = str.indexOf("<td", n0 + 1);
        n0 = str.indexOf("<td", n0 + 1);
        n0 = str.indexOf("<td", n0 + 1);

        int n1 = str.indexOf("<td", n0 + 1);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "verifyword retrieving");
            return false;
        }
        String tem1 = str.substring(n0, n1);
        if (tem1.contains(verifyword_l)) {
            displayvfmsg(filename, "No update-Census dash", threadid);
            return false;
        }
        //----------Retrieve data1------------
        n0 = str.indexOf("<td", n1 + 1);
        n0 = str.indexOf("<td", n0 + 1);
        n0 = str.indexOf("<td", n0 + 1);
        n1 = str.indexOf("<td", n0 + 1);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "data1 retrieving");
            return false;
        }
        tem1 = str.substring(n0, n1);
        if (tem1.length() < 0) {
            displayerrmsg(filename, threadid, n0, n1, " empty data1");
            return false;

        }
        double data1 = Double.parseDouble(getDigit(tem1));

        //-----------retrieve sign--------------
        n0 = str.indexOf("<td", n1 + 1);
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "sign retrieving");
            return false;
        }
        tem1 = str.substring(n1, n0);

        if (tem1.length() < 0) {
            displayerrmsg(filename, threadid, n0, n1, " Sign word retriving");
            return false;

        }
        int sign = getSign(tem1);
        if (sign < 0)
            data1 = 0 - data1;

        displayokmsg(filename, threadid, data1, "Dash data");
        return true;

    }

    private boolean USD_Census_CGIBrief(String str, String filename, String verifyword_l, int threadid) {
        //keyword=http://www.census.gov/main/www/what_is_rss.html

        //----------retrieve veriyfyword, title------------
        int n0 = str.indexOf("</a>");
        int n1 = str.lastIndexOf("\">", n0);

        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "verifyword retrieving");
            return false;
        }

        String tem1 = str.substring(n1, n0);
        if (tem1.contains(verifyword_l)) {
            displayvfmsg(filename, "No update-Bfrs", threadid);
            return false;
        }

        if (true) {
            displayokmsg(filename, threadid, " CensusBrm");
            return true;
        }

        //----------Retrieve data1-----------
        n0 = str.indexOf("class=\"curr\"", n1);
        n1 = str.indexOf("%", n0 + 1);
        n0 = str.lastIndexOf("<p>", n1);
        if (n0 < 0 || n1 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "data1 retrieving");
            return false;
        }
        tem1 = str.substring(n0, n1);
        if (tem1.length() < 0) {
            displayerrmsg(filename, threadid, n0, n1, " empty data1");
            return false;

        }
        double data1 = Double.parseDouble(getDigit(tem1));


        //--------------Retrieve data19------------

        n1 = str.indexOf("%", n0 + 1);
        n0 = str.lastIndexOf("<p>", n1);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "data19 retrieving");
            return false;
        }
        tem1 = str.substring(n0, n1);
        if (tem1.length() < 0) {
            displayerrmsg(filename, threadid, n0, n1, " empty data19");
            return false;

        }
        double data19 = Double.parseDouble(getDigit(tem1));

        displayokmsg(filename, threadid, data1, data19, "CensusBrm");
        return true;


    }

    private boolean USDRss(String str, String filename, String verifyword, int indicatorno, int threadid) //labor statistics
        {
        //  str=str.replace(" ", "");
        //  str=str.replace("&nbsp;", "");
        //      str=str.replace("&amp;", "");
        // System.out.println(indicatorno+"\n"+verifyword);
        String key = "";
        if (indicatorno == 0)
            key = "payroll";
        else if (indicatorno == 1)
            key = "unemployment";
        else if (indicatorno == 2)
            key = "consumer";
        else if (indicatorno == 3)
            key = "ppi";
        else {
            key = "none";
        }

        int n0 = str.indexOf("<item>");
        n0 = str.indexOf("<pubdate>", n0 + 1);
        int n1 = str.indexOf("</pubdate>", n0 + 1);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "   verifyword retrieving");
            return false;
        }

        String tem1 = str.substring(n0, n1);
        if (tem1.length() < 0) {
            displayerrmsg(filename, threadid, n0, n1, " no verifyword retrieved");
            return false;

        }

        if (tem1.contains(verifyword)) {
            displayvfmsg(filename, "No update--" + key, threadid);
            return false;
        }

        if (true) {
            displayokmsg(filename, threadid, "Has a new update");
            return true;
        }

        n0 = str.indexOf("<item>");
        n0 = str.indexOf("<p>", n0 + 1);
        n1 = str.indexOf("<br>", n0 + 1);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "    USDRss retrieving");
            return false;
        }

        tem1 = str.substring(n0, n1);
        if (tem1.length() < 0) {
            displayerrmsg(filename, threadid, n0, n1, " No data retrieved");
            return false;

        }

        int m = 1;

        while (true) {
            if (tem1.contains(key))
                break;
            else {

                n0 = str.indexOf("<p>", n1 + 1);
                n1 = str.indexOf("<br>", n0 + 1);
                if (n1 < 0 || n0 < 0) {
                    displayerrmsg(filename, threadid, n0, n1, "    USDRss retrieving no=" + m);
                    continue;
                }
                tem1 = str.substring(n0, n1);
                if (tem1.length() < 0) {
                    displayerrmsg(filename, threadid, n0, n1, " No data retrieved,key=" + key + " no=" + m);
                    continue;
                }

            }


            if (m > 15) {
                displayerrmsg(filename, threadid, n0, n1, " No data retrieved no=" + m);
                return false;
            }
            m++;
        }

        n0 = str.indexOf("data\">", n1 + 1);
        n1 = str.indexOf("in", n0 + 1);

        if (n1 < 0 || n0 < 0 || (n1 - n0) < 6) {
            displayerrmsg(filename, threadid, n0, n1, "   data retrieving");
            return false;
        }

        tem1 = str.substring(n0 + 6, n1);
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, " No data retrieved outside while");
            return false;

        } else {

            if (tem1.contains("unchange"))
                tem1 = "0";
            else
                tem1 = this.getDigit(tem1);

            double value = Double.parseDouble(tem1);
            displayokmsg(filename, threadid, value, key);
            return true;
        }


    }

    private boolean USD_BLS_NEWSRLS(String str, String filename, String betterword, String verifyword, String keyword,
                                    int indicatorno, int threadid) //labor statistics
        {
        //  str=str.replace(" ", "");
        //  str=str.replace("&nbsp;", "");
        //      str=str.replace("&amp;", "");
        // System.out.println(indicatorno+"\n"+verifyword);
        String key = "";
        if (indicatorno == 0)
            key = "situation"; //labor
        else if (indicatorno == 1)
            key = "consumer";
        else if (indicatorno == 2)
            key = "import";
        else if (indicatorno == 3)
            key = "producer";
        else if (indicatorno == 4)
            key = "productivity";
        else if (indicatorno == 5)
            key = "real";
        else if (indicatorno == 6)
            key = "employment cost";
        else {
            key = "none";
        }

        int n0 = str.indexOf(keyword);
        //    System.out.println(n0+" "+keyword);
        n0 = str.indexOf("</a>", n0 + 1);
        int n1 = str.indexOf("</li>", n0 + 1);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "   verifyword retrieving at");
            return false;
        }

        String tem1 = str.substring(n0, n1);
        if (tem1.length() < 0) {
            displayerrmsg(filename, threadid, n0, n1, " no verifyword retrieved");
            return false;

        }
        //  System.out.println(tem1+" "+verifyword);

        if (tem1.contains(verifyword)) {
            displayvfmsg(filename, "No update-" + key, threadid);
            return false;
        }

        if (true) {

            //             displayokmsg(filename,threadid,"NEWS Release");
            //            return true;
        }
        // begin indicator:

        int n3 = 0, n4 = 0;
        String tem2 = "", tem3 = "", tem4 = "";

        while (true) {

            n0 = str.indexOf("<h4><a", n1 + 1);
            n1 = str.indexOf("(<a", n0 + 1);
            if (n0 < 0 || n1 < 0) {

                if (indicatorno == 100) {
                    displayokmsg(filename, threadid, " Has a new update");
                    return true;
                }
                displayvfmsg(filename, "No more Found", threadid);
                return false;
            }
            tem2 = str.substring(n0, n1);
            n3 = 0;

            n3 = tem2.indexOf("</a></h4>");
            tem3 = (tem2.substring(0, n3));

            if (!tem3.contains(key)) {
                continue;
            }


            n3 = tem2.indexOf("<em", n3); //date
            n4 = tem2.indexOf("</em>", n3 + 1);
            tem4 = (tem2.substring(n3, n4)); //.replace(" ", "");

            if (tem4.contains(betterword)) {
                displayvfmsg(filename, "No update found=" + key, threadid);
                return false;
            }


            tem3 = (tem2.substring(n4));
            //  System.out.println(tem3);

            displayokmsg(filename, threadid, key);
            return true;


        }


    }

    private boolean USD_BEA_RSS(String str, String filename, String verifyword, int indicatorno, double emchg,
                                double oneprevious, int threadid) //labor statistics
        {

        int n0 = str.indexOf("<item>");
        n0 = str.indexOf("<pubdate>", n0 + 1);
        int n1 = str.indexOf("</pubdate>", n0 + 1);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "   verifyword retrieving");
            return false;
        }

        String tem1 = str.substring(n0, n1);
        if (tem1.length() < 0) {
            displayerrmsg(filename, threadid, n0, n1, " no verifyword retrieved");
            return false;

        }

        if (tem1.contains(verifyword)) {
            displayvfmsg(filename, "No update-" + indicatorno, threadid);
            return false;
        }


        n0 = str.indexOf("<item>");
        n0 = str.indexOf("<description>", n0 + 1);
        n1 = str.indexOf("</description>", n0 + 1);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "    USD_Census_Rss retrieving");
            return false;
        }

        tem1 = str.substring(n0, n1);
        if (tem1.length() < 0) {
            displayerrmsg(filename, threadid, n0, n1, " No data retrieved");
            return false;

        }

        //   tem1=" Real gross domestic product -- the output of goods and services produced by labor and property located in the United States -- increased at an annual rate of 1.5 percent in the second quarter of 2012, (that is, from the first quarter to the second quarter), according to the \"advance\" estimate released by the Bureau of Economic Analysis.  In the first quarter, real GDP increased 2.0 percent.  &lt;!--Full Text Link--&gt;&lt;a href='http://www.bea.gov/newsreleases/national/gdp/2012/gdp2q12_adv.htm'&gt;Full Text&lt;/a&gt;&lt;!--Full Text Link--&gt;";//to be removed


        switch (indicatorno) {
        case 0:
            tem1 = tem1.replace(" ", "");
            tem1 = tem1.replace("\n", "");

            n0 = tem1.indexOf("percentinthesecondquarter"); //must changed to ("percent",n1+1) after return to normal
            if (n0 <= 0) {
                displayerrmsg(filename, threadid, n0, n1, " percent data retrieved");
                return false;

            }

            String tem2 = tem1.substring(n0 - 6, n0);
            if (tem2.length() < 0) {
                displayerrmsg(filename, threadid, n0, n1, "empty percent number retrieved");
                return false;

            }
            int sign = getSign(tem1.substring(n0 - 60, n0));
            double data1 = Double.parseDouble(getDigit(tem2));
            if (sign == 0)
                data1 = emchg;
            else if (sign == -1)
                data1 = 0 - data1;

            n0 = tem1.indexOf("percent", n0 + 1); //must changed to ("percent",n1+1) after return to normal
            if (n0 <= 0) {

                displayerrmsg(filename, threadid, n0, n1, "dat19 percent number retrieved");
                return USD_Submit("RSS", filename, data1, oneprevious, 0, emchg, oneprevious, 0.2, threadid);

            }

            tem2 = tem1.substring(n0 - 6, n0);
            if (tem2.length() < 0) {

                displayerrmsg(filename, threadid, n0, n1, "dat19 percent number retrieved");
                return USD_Submit("RSS", filename, data1, oneprevious, 0, emchg, oneprevious, 0.2, threadid);

            }
            sign = getSign(tem1.substring(n0 - 20, n0));
            double data19 = Double.parseDouble(getDigit(tem2));
            if (sign == 0)
                data19 = oneprevious;
            else if (sign == -1)
                data19 = 0 - data19;

            return USD_Submit("RSS", filename, data1, data19, 1, emchg, oneprevious, 0.2, threadid);


        case 1:
            return false;
        default:
            if (indicatorno == 100) {
                displayokmsg(filename, threadid, "has a new update-BEA Rss");
            } else
                displayerrmsg(filename, threadid, -1, -1, "No indicator selected");
            return false;
        }


    }

    private boolean USD_Census_RSS(String str, String filename, String verifyword, int indicatorno, double emchg,
                                   double oneprevious, int threadid) //labor statistics
        {

        int n0 = str.indexOf("<item>");
        n0 = str.indexOf("<pubdate>", n0 + 1);
        int n1 = str.indexOf("</pubdate>", n0 + 1);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "   verifyword retrieving");
            return false;
        }

        String tem1 = str.substring(n0, n1);
        if (tem1.length() < 0) {
            displayerrmsg(filename, threadid, n0, n1, " no verifyword retrieved");
            return false;

        }

        if (tem1.contains(verifyword)) {
            displayvfmsg(filename, "No update-" + indicatorno, threadid);
            return false;
        }


        n0 = str.indexOf("<item>");
        n0 = str.indexOf("<description>", n0 + 1);
        n1 = str.indexOf("</description>", n0 + 1);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "    USD_Census_Rss retrieving");
            return false;
        }

        tem1 = str.substring(n0, n1);
        if (tem1.length() < 0) {
            displayerrmsg(filename, threadid, n0, n1, " No data retrieved");
            return false;

        }

        // tem1="<![CDATA[<p> Sales of new single-family houses in June 2012 were at a seasonally adjusted annual rate of 350,000. This is 8.4 percent (+/- 12.4%)* below the revised May 2012 estimate of 382,000. </p> June 2012: -8.4 % change <br> May 2012: +6.7 % change ]]>";//to be removed
        if (!bdata1 && orderpermit.isSelected()) {

            displayvfmsg(filename, "Yield", threadid);
            log(filename, threadid + " is late at " + (new Time(System.currentTimeMillis() + timeoffset)).toString());
            return true;
        }
        bdata1 = false;

        switch (indicatorno) {
        case 0:
            n0 = tem1.indexOf(",000");
            if (n0 < 0) {
                displayerrmsg(filename, threadid, n0, n1, "data retrieving");
                return false;
            }
            String tem2 = getDigit(tem1.substring(n0 - 5, n0 + 4));
            if (tem2.length() < 0) {
                displayerrmsg(filename, threadid, n0, n1, "emplty data");
                return false;
            }

            double data = Integer.parseInt(tem2) / 1000;

            n0 = tem1.indexOf(",000", n0 + 2);
            if (n0 < 0) {
                displayerrmsg(filename, threadid, n0, n1, "data retrieving");
                return false;
            }
            tem2 = getDigit(tem1.substring(n0 - 5, n0 + 4));
            if (tem2.length() < 0) {
                displayerrmsg(filename, threadid, n0, n1, "emplty data");
                return false;
            }

            double datap = Integer.parseInt(tem2) / 1000;
            double dif = getSSWR2((data - emchg) + (datap - oneprevious) * 0.3);

            dif = getSSWR2((data - emchg) + (datap - oneprevious) * 0.3);
            if (dif >= 70) {
                if (sf != null && orderpermit.isSelected())
                    sf.attackOrder(25000, getSSWR(sf.eurusd - 0.0010), SELLLMT, EURUSD); //sell EURUSD
                System.out.println("EURUSD Sell Order Issuring Time=" +
                                   (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                                   (sf == null ? "" : sf.eurusd));
                displayokmsg(filename, threadid,
                             "EURUSD Sell Order Issuring Time=" +
                             (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                             (sf == null ? "" : sf.eurusd));
                value1.setText("+" + dif + "(" + data + "__" + emchg + ")");
                value1.setForeground(new Color(0, 153, 0));
            } else if (((dif) <= -70)) {
                if (sf != null && orderpermit.isSelected())
                    sf.attackOrder(25000, getSSWR(sf.eurusd + 0.0010), BUYLMT, EURUSD); //buy EURUSD
                displayokmsg(filename, threadid,
                             "EURUSD Buy Order Issuring Time=" +
                             (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                             (sf == null ? "" : sf.eurusd));
                System.out.println("EURUSD Buy Order Issuring Time=" +
                                   (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                                   (sf == null ? "" : sf.eurusd));
                value1.setText(dif + "(" + data + "__" + emchg + ")");
                value1.setForeground(Color.red);
            } else if (dif < 70 && dif > -70) {
                value1.setText((dif > 0 ? "+" : "") + dif + "(" + data + "__" + emchg + ")");
                value1.setForeground(Color.blue);
                System.out.println("E.Home Sales is here:" +
                                   (new Time(System.currentTimeMillis() + timeoffset)).toString());
                displayokmsg(filename, threadid,
                             "E. Home Sales is here:" + (new Time(System.currentTimeMillis() + timeoffset)).toString());
            }


            onepreviousF.setText(getSSWR2(datap - oneprevious) + "(" + datap + "__" + oneprevious + ")");
            onepreviousF.setForeground(datap >= oneprevious ? new Color(0, 153, 0) : Color.red);
            displayokmsg(filename, threadid, data, datap, "" + indicatorno);
            return true;
        case 1:
            return false;
        default:
            displayerrmsg(filename, threadid, -1, -1, "No indicator selected");
            return false;
        }


    }

    private boolean USD_HOMESALES_RSS(String str, String filename, String verifyword, int indicatorno, double emchg,
                                      double oneprevious, int threadid) //labor statistics
        {
        //  System.out.println(stages[0]);
        int n0 = 0, n1 = 0;
        double data = 0, datap = 0;
        if (stages[threadid] == -1) {
            n0 = str.indexOf("<pubdate>");
            n1 = str.indexOf("</pubdate>", n0 + 1);
            if (n1 < 0 || n0 < 0) {
                displayerrmsg(filename, threadid, n0, n1, "   verifyword retrieving");
                return false;
            }

            String tem1 = str.substring(n0, n1);
            if (tem1.length() <= 0) {
                displayerrmsg(filename, threadid, n0, n1, " no verifyword retrieved");
                return false;

            }

            if (tem1.contains(verifyword)) {
                displayvfmsg(filename, "No update-" + indicatorno, threadid);
                return false;
            }


            n0 = str.indexOf("<item>", n1 + 1);
            n0 = str.indexOf("<description>", n0 + 1);
            n1 = str.indexOf("</description>", n0 + 1);
            if (n1 < 0 || n0 < 0) {
                displayerrmsg(filename, threadid, n0, n1, "    Description retrieving");
                return false;
            }

            tem1 = str.substring(n0, n1);
            if (tem1.length() <= 0) {
                displayerrmsg(filename, threadid, n0, n1, " No data retrieved");
                return false;

            }

           
            n0 = tem1.lastIndexOf("img src=");
            n0 = tem1.lastIndexOf("http://www.realtor.org", n0 - 1);
            n1 = tem1.indexOf("\"", n0 + 1);
            if (n1 < 0 || n0 < 0) {
                displayerrmsg(filename, threadid, n0, n1, " link retrieving");
                return false;
            }
            String tem2 = tem1.substring(n0, n1);
            if (tem2.length() <= 0) {

                displayerrmsg(filename, threadid, n0, n1, " Empty link");
                return false;

            }
            links[threadid] = tem2;
            jTextField1.setText(links[threadid]);

            n0 = tem1.indexOf("existing-home");
            n0 = tem1.indexOf("million", n0 + 1);
            if (n0 <= 0) {
                log(filename, "First data retrive failed");
                return EHSC(threadid);

            }

            tem2 = tem1.substring(n0 - 6, n0);
            if (tem2.length() <= 0) {

                log(filename, "First data empty");
                return EHSC(threadid);

            }

            data = Double.parseDouble(getDigit(tem2));

            n0 = tem1.indexOf("million", n0 + 1);
            if (n0 <= 0) {

                log(filename, "Second data retrive failed");
                return EHSC(threadid);

            }

            tem2 = tem1.substring(n0 - 6, n0);
            if (tem2.length() <= 0) {
                log(filename, "Second data empty");
                return EHSC(threadid);
            }

            datap = Double.parseDouble(getDigit(tem2));


        } else if (stages[threadid] == 1) {
            // System.out.println(str);
            n0 = str.indexOf("million");
            if (n0 <= 0) {
                displayerrmsg(filename, threadid, n0, -999, "first data retrieving");
                return false;

            }

            String tem2 = str.substring(n0 - 6, n0);
            if (tem2.length() < 0) {
                displayerrmsg(filename, threadid, -999, -999, "first data empty");
                return false;

            }

            data = Double.parseDouble(getDigit(tem2));

            n0 = str.indexOf("million", n0 + 1);
            if (n0 <= 0) {
                displayerrmsg(filename, threadid, n0, -999, "second data retrieving");
                return false;

            }

            tem2 = str.substring(n0 - 6, n0);
            if (tem2.length() < 0) {
                displayerrmsg(filename, threadid, -999, -999, "second data empty");
                return false;
            }

            datap = Double.parseDouble(getDigit(tem2));

        }

        double dif = getSSWR2((data - emchg) + (datap - oneprevious) * 0.3);
        switch (indicatorno) {
        case 0:
            if (dif >= 0.4) {
                if (sf != null && orderpermit.isSelected())
                    sf.attackOrder(25000, getSSWR(sf.eurusd - 0.0010), SELLLMT, EURUSD); //sell EURUSD
                System.out.println("EURUSD Sell Order Issuring Time=" +
                                   (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                                   (sf == null ? "" : sf.eurusd));
                displayokmsg(filename, threadid,
                             "EURUSD Sell Order Issuring Time=" +
                             (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                             (sf == null ? "" : sf.eurusd));
                value1.setText("+" + dif + "(" + data + "__" + emchg + ")");
                value1.setForeground(new Color(0, 153, 0));
            } else if (((dif) <= -0.4)) {
                if (sf != null && orderpermit.isSelected())
                    sf.attackOrder(25000, getSSWR(sf.eurusd + 0.0010), BUYLMT, EURUSD); //buy EURUSD
                displayokmsg(filename, threadid,
                             "EURUSD Buy Order Issuring Time=" +
                             (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                             (sf == null ? "" : sf.eurusd));
                System.out.println("EURUSD Buy Order Issuring Time=" +
                                   (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                                   (sf == null ? "" : sf.eurusd));
                value1.setText(dif + "(" + data + "__" + emchg + ")");
                value1.setForeground(Color.red);
            } else if (dif < 0.4 && dif > -0.4) {
                value1.setText((dif > 0 ? "+" : "") + dif + "(" + data + "," + emchg + ")");
                value1.setForeground(Color.blue);
                System.out.println("E.Home Sales is here:" +
                                   (new Time(System.currentTimeMillis() + timeoffset)).toString());
                displayokmsg(filename, threadid,
                             "E. Home Sales is here:" + (new Time(System.currentTimeMillis() + timeoffset)).toString());
            }


            onepreviousF.setText(getSSWR2(datap - oneprevious) + "(" + datap + "__" + oneprevious + ")");
            onepreviousF.setForeground(datap >= oneprevious ? new Color(0, 153, 0) : Color.red);
            displayokmsg(filename, threadid, data, datap, "" + indicatorno);
            return true;
        case 1:
            return false;
        default:
            displayerrmsg(filename, threadid, -1, -1, "No indicator selected");
            return false;
        }


    }

    private boolean EHSC(int threadid) {
        stages[threadid] = 1;
        switch (threadid) {
        case 0:
            Keyword = "field field-name-body field-type-text-with-summary field-label-hidden";
            Updatetype = ADDITEM;
            Length = 1500;
            Skip = 39000;
            sleeptime = 0;
            break;
        case 2:
            std.keyword2 = "field field-name-body field-type-text-with-summary field-label-hidden";
            std.updatetype2 = ADDITEM;
            std.length2 = 1500;
            std.skip2 = 39000;
            std.sleeptime2 = 0;
            break;
        case 3:
            trd.keyword2 = "field field-name-body field-type-text-with-summary field-label-hidden";
            trd.updatetype2 = ADDITEM;
            trd.length2 = 1500;
            trd.skip2 = 39000;
            trd.sleeptime2 = 0;
            break;
        case 4:
            f4rd.keyword2 = "field field-name-body field-type-text-with-summary field-label-hidden";
            f4rd.updatetype2 = ADDITEM;
            f4rd.length2 = 1500;
            f4rd.skip2 = 39000;
            f4rd.sleeptime2 = 0;
            break;
        case 5:
            f5rd.keyword2 = "field field-name-body field-type-text-with-summary field-label-hidden";
            f5rd.updatetype2 = ADDITEM;
            f5rd.length2 = 1500;
            f5rd.skip2 = 39000;
            f5rd.sleeptime2 = 0;
            break;
        case 6:
            s6rd.keyword2 = "field field-name-body field-type-text-with-summary field-label-hidden";
            s6rd.updatetype2 = ADDITEM;
            s6rd.length2 = 1500;
            s6rd.skip2 = 39000;
            s6rd.sleeptime2 = 0;
            break;
        }
        return false;
    }

    private boolean CAD_Submit(String name, String filename, int power, double data1, double data19, double emchg,
                               double oneprevious, int botype, int bctype, double boffset, int wotype, int wctype,
                               double woffset, double fbt, double fwt, double sbt, double swt, int quantity,
                               int threadid) {
        //  double target=0.3;



        // System.out.println(data1+" "+data19+" "+emchg+" "+oneprevious);

        if (power == 0)
            data19 = oneprevious; //????? power==0 means uncertain about the data got
        double data =
            getSSWR2(data1 - emchg +
                     (data19 - oneprevious) * 0.2); //has previous data,more reliable,can make reliable decision
        if (Math.abs(data) < fbt && power == 0) {
            displayokmsg(filename, threadid, data1, data19,
                         name + "-Y-Vs=" + data1 + "  at " +
                         (new Time(System.currentTimeMillis() + timeoffset)).toString());
            return true;
        }

        if (!bdata1 && orderpermit.isSelected()) {
            displayokmsg(filename, threadid, "-L-d1=" + data1 + ",d19=" + (power == 1 ? data19 : "NA")); //late
            if (power == 1 && Math.abs(data) < fbt) {
                jTextField7.append(data1 + "   p=" + data19 + "  -------!!!!!");
                jTextField7.append(data1 + "   p=" + data19 + "  -------!!!!!");
                jTextField7.append(data1 + "   p=" + data19 + "  -------!!!!!");
            }

            return true;
        }
        bdata1 = false;


        if (((data) >= fbt)) {
            betterORworse(new Color(0, 153, 0), bpermit_cad, pricesurge_cadF, name, filename, power, data, data1,
                          data19, emchg, oneprevious, botype, bctype, boffset, quantity, threadid);


        } else if (((data) <= (0 - fwt))) {
            betterORworse(Color.red, wpermit_cad, pricesurge_cadF, name, filename, power, data, data1, data19, emchg,
                          oneprevious, wotype, wctype, woffset, quantity, threadid);


        } else // if(data<0.3 && data>-0.3)
        {

            displaymvalue((data > 0 ? "+" : "") + data + "(" + getSSWR2(data1) + "..." + emchg + ")" +
                          getSSWR2(data1 - emchg), Color.blue, threadid);


            // System.out.println(threadid+"_"+name+"-NA-T="+(new Time(System.currentTimeMillis()+timeoffset)).toString());
            if (power == 0)
                displayokmsg(filename, threadid, data1,
                             name + "-NA-T=" + (new Time(System.currentTimeMillis() + timeoffset)).toString());
            else
                displayokmsg(filename, threadid, data1, data19,
                             name + "-NA-T=" + (new Time(System.currentTimeMillis() + timeoffset)).toString());

        }

        //    onepreviousF.setText(getSSWR1(data19-oneprevious)+"("+data19+"  "+oneprevious+")");
        //    onepreviousF.setForeground(data19>=oneprevious? new Color(0,153,0):Color.red);
        displaycvalue(getSSWR1(data19 - oneprevious) + "(" + data19 + "  " + oneprevious + ")",
                      data19 >= oneprevious ? new Color(0, 153, 0) : Color.red, threadid);


        return true;

    }

    private boolean CAD_SubmitOneSP(String name, String filename, int power, double data1, double data19, double emchg,
                                    double oneprevious, int botype, int bctype, double boffset, int wotype, int wctype,
                                    double woffset, double fbt, double fwt, double sbt, double swt, int quantity,
                                    int threadid) {
        //  double target=0.3;



        // System.out.println(data1+" "+data19+" "+emchg+" "+oneprevious);

        if (power == 0)
            data19 = oneprevious; //????? power==0 means uncertain about the data got
        double data =
            getSSWR2(data1 - emchg +
                     (data19 - oneprevious) * 0.2); //has previous data,more reliable,can make reliable decision
        if (Math.abs(data) < fbt && power == 0) {
            displayokmsg(filename, threadid, data1, data19,
                         name + "-Y-Vs=" + data1 + "  at " +
                         (new Time(System.currentTimeMillis() + timeoffset)).toString());
            return true;
        }

        if (!bdata1 && orderpermit.isSelected()) {
            displayokmsg(filename, threadid, "-L-d1=" + data1 + ",d19=" + (power == 1 ? data19 : "NA")); //late
            if (power == 1 && Math.abs(data) < fbt) {
                jTextField7.append(data1 + "   p=" + data19 + "  -------!!!!!");
                jTextField7.append(data1 + "   p=" + data19 + "  -------!!!!!");
                jTextField7.append(data1 + "   p=" + data19 + "  -------!!!!!");
            }
            return true;
        }
        bdata1 = false;

        // word "better or worse" affect the display color only,no buy or sell decision affected,so "worse" can work with botype!

        if (((data) >= fbt)) {
            betterORworse(Color.red, bpermit_cad, pricesurge_cadF, name, filename, power, data, data1, data19, emchg,
                          oneprevious, botype, bctype, boffset, quantity, threadid);


        } else if (((data) <= (0 - fwt))) {
            betterORworse(new Color(0, 153, 0), wpermit_cad, pricesurge_cadF, name, filename, power, data, data1,
                          data19, emchg, oneprevious, wotype, wctype, woffset, quantity, threadid);


        } else // if(data<0.3 && data>-0.3)
        {

            displaymvalue((data > 0 ? "+" : "") + data + "(" + getSSWR2(data1) + "..." + emchg + ")" +
                          getSSWR2(data1 - emchg), Color.blue, threadid);


            //  System.out.println(threadid+"_"+name+"-NA-T="+(new Time(System.currentTimeMillis()+timeoffset)).toString());
            if (power == 0)
                displayokmsg(filename, threadid, data1,
                             name + "-NA-T=" + (new Time(System.currentTimeMillis() + timeoffset)).toString());
            else
                displayokmsg(filename, threadid, data1, data19,
                             name + "-NA-T=" + (new Time(System.currentTimeMillis() + timeoffset)).toString());

        }

        //    onepreviousF.setText(getSSWR1(data19-oneprevious)+"("+data19+"  "+oneprevious+")");
        //    onepreviousF.setForeground(data19<=oneprevious? new Color(0,153,0):Color.red);
        displaycvalue(getSSWR1(data19 - oneprevious) + "(" + data19 + "  " + oneprevious + ")",
                      data19 <= oneprevious ? new Color(0, 153, 0) : Color.red, threadid);


        return true;

    }

    private boolean CAD_Submit(String name, String filename, int power, double data1, double data19, double data2,
                               double data29, double emchg, double oneprevious, double uerate, double twoprevious,
                               int botype, int bctype, double boffset, int wotype, int wctype, double woffset,
                               double fbt, double fwt, double sbt, double swt, int quantity, int threadid) {
        //  double target=0.3;
        // System.out.println(data1+" "+data19+" "+emchg+" "+oneprevious);

        if (power == 0) {
            data19 = oneprevious;
            data29 = twoprevious;
        } //????? power==0 means uncertain about the data got
        double data =
            getSSWR2(data1 - emchg +
                     (data19 - oneprevious) * 0.2); //has previous data,more reliable,can make reliable decision
        double data_s =
            getSSWR2(data2 - uerate +
                     (data29 - twoprevious) * 0.2); //has previous data,more reliable,can make reliable decision
        if ((Math.abs(data) < fbt || Math.abs(data_s) < sbt) && power == 0) {
            displayokmsg(filename, threadid, data1, data19, data2, data29,
                         name + "-Y-Vs=" + data1 + "  " + data2 + "  at " +
                         (new Time(System.currentTimeMillis() + timeoffset)).toString());
            return true;
        }

        if (!bdata1 && orderpermit.isSelected()) {
            displayokmsg(filename, threadid,
                         "-L-d*" + data1 + " " + data2 + ",d*9=" + (power == 1 ? data19 + " " + data29 : "NA"));
            if (power == 1 && (Math.abs(data) < fbt || Math.abs(data_s) < sbt)) {

                jTextField7.append(data1 + "   p=" + data19 + "  -------!!!!!");
                jTextField7.append(data2 + "   p=" + data29 + "  -------!!!!!");

            }
            return true;
        }
        bdata1 = false;


        if (data >= fbt && data_s >= sbt) {

            betterORworse(new Color(0, 153, 0), bpermit_cad, pricesurge_cadF, name, filename, power, data, data_s,
                          data1, data19, data2, data29, emchg, oneprevious, uerate, twoprevious, botype, bctype,
                          boffset, quantity, threadid);


        } else if (data <= (0 - fwt) && data_s <= (0 - swt)) {
            betterORworse(Color.red, wpermit_cad, pricesurge_cadF, name, filename, power, data, data_s, data1, data19,
                          data2, data29, emchg, oneprevious, uerate, twoprevious, wotype, wctype, woffset, quantity,
                          threadid);


        } else // if(data<0.3 && data>-0.3)
        {

            if (threadid == 0) {
                value1.setText((data > 0 ? "+" : "") + data + "(" + getSSWR2(data1) + "..." + emchg + ")" +
                               getSSWR2(data1 - emchg));
                value2.setText((data_s > 0 ? "+" : "") + data_s + "(" + getSSWR2(data2) + "..." + uerate + ")" +
                               getSSWR2(data2 - uerate));
                value2.setForeground(data_s >= 0 ? new Color(0, 153, 0) : Color.red);
                value1.setForeground(data >= 0 ? new Color(0, 153, 0) : Color.red);
            } else {
                data3show.setText((data > 0 ? "+" : "") + data + "(" + getSSWR2(data1) + "..." + emchg + ")" +
                                  getSSWR2(data1 - emchg));
                data4show.setText((data_s > 0 ? "+" : "") + data_s + "(" + getSSWR2(data2) + "..." + uerate + ")" +
                                  getSSWR2(data2 - uerate));
                data4show.setForeground(data_s >= 0 ? new Color(0, 153, 0) : Color.red);
                data3show.setForeground(data >= 0 ? new Color(0, 153, 0) : Color.red);
            }


            if (power == 0)
                displayokmsg(filename, threadid, data1, data2,
                             name + "-NA-T=" + (new Time(System.currentTimeMillis() + timeoffset)).toString());
            else
                displayokmsg(filename, threadid, data1, data19, data2, data29,
                             name + "-NA-T=" + (new Time(System.currentTimeMillis() + timeoffset)).toString());

        }


        if (threadid == 0) {
            onepreviousF.setText(getSSWR2(data19 - oneprevious) + "(" + data19 + "__" + oneprevious + ")");
            onepreviousF.setForeground(data19 >= oneprevious ? new Color(0, 153, 0) : Color.red);
            twopreviousF.setText(getSSWR2(data29 - twoprevious) + "(" + data29 + "__" + twoprevious + ")");
            twopreviousF.setForeground(data29 >= twoprevious ? new Color(0, 153, 0) : Color.red);
        } else {
            data39show.setText(getSSWR2(data19 - oneprevious) + "(" + data19 + "__" + oneprevious + ")");
            data39show.setForeground(data19 >= oneprevious ? new Color(0, 153, 0) : Color.red);
            data49show.setText(getSSWR2(data29 - twoprevious) + "(" + data29 + "__" + twoprevious + ")");
            data49show.setForeground(data29 >= twoprevious ? new Color(0, 153, 0) : Color.red);
        }


        return true;

    }

    private boolean CAD_SubmitSndSP(String name, String filename, int power, double data1, double data19, double data2,
                                    double data29, double emchg, double oneprevious, double uerate, double twoprevious,
                                    int botype, int bctype, double boffset, int wotype, int wctype, double woffset,
                                    double fbt, double fwt, double sbt, double swt, int quantity, int threadid) {
        //  >= && <= for labor
        // System.out.println(""+botype+"  "+bctype+"  "+boffset+"  "+wotype+"  "+wctype+"  "+woffset+"  "+fbt+"  "+fwt+"  "+sbt+"  "+swt+"  "+quantity);

        if (power == 0) {
            data19 = oneprevious;
            data29 = twoprevious;
        } //????? power==0 means uncertain about the data got
        double data =
            getSSWR2(data1 - emchg +
                     (data19 - oneprevious) * 0.2); //has previous data,more reliable,can make reliable decision
        double data_s =
            getSSWR2(data2 - uerate +
                     (data29 - twoprevious) * 0.2); //has previous data,more reliable,can make reliable decision
        if ((Math.abs(data) < fbt || Math.abs(data_s) < sbt) && power == 0) {
            displayokmsg(filename, threadid, data1, data19, data2, data29,
                         name + "-Y-Vs=" + data1 + "  " + data2 + "  at " +
                         (new Time(System.currentTimeMillis() + timeoffset)).toString());
            return true;
        }

        if (!bdata1 && orderpermit.isSelected()) {
            displayokmsg(filename, threadid,
                         "-L-d*" + data1 + " " + data2 + ",d*9=" + (power == 1 ? data19 + " " + data29 : "NA"));
            if (power == 1 && (Math.abs(data) < fbt || Math.abs(data_s) < sbt)) {

                jTextField7.append(data1 + "   p=" + data19 + "  -------!!!!!");
                jTextField7.append(data2 + "   p=" + data29 + "  -------!!!!!");

            }
            return true;
        }
        bdata1 = false;


        if (data >= fbt && data_s <= (0 - sbt)) {


            betterORworse(new Color(0, 153, 0), bpermit_cad, pricesurge_cadF, name, filename, power, data, data_s,
                          data1, data19, data2, data29, emchg, oneprevious, uerate, twoprevious, botype, bctype,
                          boffset, quantity, threadid);


        } else if (data <= (0 - fwt) && data_s >= swt) {

            betterORworse(Color.red, wpermit_cad, pricesurge_cadF, name, filename, power, data, data_s, data1, data19,
                          data2, data29, emchg, oneprevious, uerate, twoprevious, wotype, wctype, woffset, quantity,
                          threadid);


        } else // if(data<0.3 && data>-0.3)
        {
            if (threadid == 0) {
                value1.setText((data > 0 ? "+" : "") + data + "(" + getSSWR2(data1) + "..." + emchg + ")" +
                               getSSWR2(data1 - emchg));
                value2.setText((data_s > 0 ? "+" : "") + data_s + "(" + getSSWR2(data2) + "..." + uerate + ")" +
                               getSSWR2(data2 - uerate));
                value2.setForeground(data_s <= 0 ? new Color(0, 153, 0) : Color.red);
                value1.setForeground(data >= 0 ? new Color(0, 153, 0) : Color.red);
            } else {
                data3show.setText((data > 0 ? "+" : "") + data + "(" + getSSWR2(data1) + "..." + emchg + ")" +
                                  getSSWR2(data1 - emchg));
                data4show.setText((data_s > 0 ? "+" : "") + data_s + "(" + getSSWR2(data2) + "..." + uerate + ")" +
                                  getSSWR2(data2 - uerate));
                data4show.setForeground(data_s <= 0 ? new Color(0, 153, 0) : Color.red);
                data3show.setForeground(data >= 0 ? new Color(0, 153, 0) : Color.red);
            }

            if (power == 0)
                displayokmsg(filename, threadid, data1, data2,
                             name + "-NA-T=" + (new Time(System.currentTimeMillis() + timeoffset)).toString());
            else
                displayokmsg(filename, threadid, data1, data19, data2, data29,
                             name + "-NA-T=" + (new Time(System.currentTimeMillis() + timeoffset)).toString());

        }


        if (threadid == 0) {
            onepreviousF.setText(getSSWR2(data19 - oneprevious) + "(" + data19 + "__" + oneprevious + ")");
            onepreviousF.setForeground(data19 >= oneprevious ? new Color(0, 153, 0) : Color.red);
            twopreviousF.setText(getSSWR2(data29 - twoprevious) + "(" + data29 + "__" + twoprevious + ")");
            twopreviousF.setForeground(data29 <= twoprevious ? new Color(0, 153, 0) : Color.red);
        } else {
            data39show.setText(getSSWR2(data19 - oneprevious) + "(" + data19 + "__" + oneprevious + ")");
            data39show.setForeground(data19 >= oneprevious ? new Color(0, 153, 0) : Color.red);
            data49show.setText(getSSWR2(data29 - twoprevious) + "(" + data29 + "__" + twoprevious + ")");
            data49show.setForeground(data29 <= twoprevious ? new Color(0, 153, 0) : Color.red);
        }

        return true;

    }

    private void betterORworse(Color color, JCheckBox permit, JTextField field, String name, String filename, int power,
                               double data_f, double data_s, double data1, double data19, double data2, double data29,
                               double emchg, double oneprevious, double uerate, double twoprevious, int otype,
                               int ctype, double offset, int quantity, int threadid) {
        double p = -1, i = 1;


        if (sf != null) {
            p = sf.getpairprice(ctype);
            if (p > 20)
                i = 100.0;
            else
                i = 10000.0;
        }
        if (sf != null && orderpermit.isSelected() && permit.isSelected() &&
            sf.timespan > (0 - Integer.parseInt(timespanF.getText())) &&
            ((otype == BUYMKT || otype == SELLMKT) ? true :
             (otype == BUYLMT ? ((p - getf5sprice(ctype)) <= (Double.parseDouble(field.getText()) / i)) :
              ((getf5sprice(ctype) - p) <= (Double.parseDouble(field.getText()) / i))))) {
            sf.attackOrder(quantity, otype == BUYLMT ? getSSWR(p + offset / i) : getSSWR(p - offset / i), otype, ctype);
            System.out.println(threadid + "_" + name + "_" + sf.getpair(ctype) + " " + getotype(otype) +
                               " Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               sf.getpairprice(ctype));
            if (power == 0)
                displayokmsg(filename, threadid, data1, data2,
                             name + "_" + sf.getpair(ctype) + " " + getotype(otype) + " Order Issuring Time=" +
                             (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                             sf.getpairprice(ctype));
            else
                displayokmsg(filename, threadid, data1, data19, data2, data29,
                             name + "_" + sf.getpair(ctype) + " " + getotype(otype) + " Order Issuring Time=" +
                             (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                             sf.getpairprice(ctype));
        } else if (sf != null && orderpermit.isSelected() && permit.isSelected() &&
                   (sf.timespan <= (0 - Integer.parseInt(timespanF.getText())) ||
                    (otype == BUYLMT ? ((p - getf5sprice(ctype)) > (Double.parseDouble(field.getText()) / i)) :
                     ((getf5sprice(ctype) - p) > (Double.parseDouble(field.getText()) / i))))) {

            if ((otype == BUYLMT ? ((p - getf5sprice(ctype)) > (Double.parseDouble(field.getText()) / i)) :
                 ((getf5sprice(ctype) - p) > (Double.parseDouble(field.getText()) / i)))) {
                displayvfmsg(filename,
                             name + "_" + (sf == null ? "pair=" + ctype : sf.getpair(ctype)) + " " + getotype(otype) +
                             " Order Not sent.SurgedLimit exceeded. Time=" +
                             (new Time(System.currentTimeMillis() + timeoffset)).toString() + ",", threadid);
            } else
                displayvfmsg(filename,
                             name + "_" + (sf == null ? "pair=" + ctype : sf.getpair(ctype)) + " " + getotype(otype) +
                             " Order Not sent.TimeSpan exceeded. Time=" +
                             (new Time(System.currentTimeMillis() + timeoffset)).toString() + ",", threadid);
        } else
            displayvfmsg(filename,
                         name + "_" + (sf == null ? "pair=" + ctype : sf.getpair(ctype)) + " " + getotype(otype) +
                         " Order Not sent.sf==null or permit is not selected. Time=" +
                         (new Time(System.currentTimeMillis() + timeoffset)).toString() + ",", threadid);

        if (threadid <= 1) {
            value1.setText((data_f > 0 ? "+" : "") + data_f + "(" + getSSWR2(data1) + "..." + emchg + ")" +
                           getSSWR2(data1 - emchg));
            value2.setText((data_s > 0 ? "+" : "") + data_s + "(" + getSSWR2(data2) + "..." + uerate + ")" +
                           getSSWR2(data2 - uerate));
            value2.setForeground(color);
            value1.setForeground(color);

        } else {
            data3show.setText((data_f > 0 ? "+" : "") + data_f + "(" + getSSWR2(data1) + "..." + emchg + ")" +
                              getSSWR2(data1 - emchg));
            data4show.setText((data_s > 0 ? "+" : "") + data_s + "(" + getSSWR2(data2) + "..." + uerate + ")" +
                              getSSWR2(data2 - uerate));
            data3show.setForeground(color);
            data4show.setForeground(color);
        }

    }

    private void betterORworse(Color color, JCheckBox permit, JTextField field, String name, String filename, int power,
                               double data_f, double data1, double data19, double emchg, double oneprevious, int otype,
                               int ctype, double offset, int quantity, int threadid) {
        double p = -1, i = 1;

        if (sf != null) {
            p = sf.getpairprice(ctype);
            if (p > 20)
                i = 100.0;
            else
                i = 10000.0;
        }
        if (sf != null && orderpermit.isSelected() && permit.isSelected() &&
            sf.timespan > (0 - Integer.parseInt(timespanF.getText())) &&
            ((otype == BUYMKT || otype == SELLMKT) ? true :
             (otype == BUYLMT ? ((p - getf5sprice(ctype)) <= (Double.parseDouble(field.getText()) / i)) :
              ((getf5sprice(ctype) - p) <= (Double.parseDouble(field.getText()) / i))))) {
            sf.attackOrder(quantity, otype == BUYLMT ? getSSWR(p + offset / i) : getSSWR(p - offset / i), otype, ctype);
            System.out.println(threadid + "_" + name + "_" + sf.getpair(ctype) + " " + getotype(otype) +
                               " Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               sf.getpairprice(ctype));
            if (power == 0)
                displayokmsg(filename, threadid, data1,
                             name + "_" + sf.getpair(ctype) + " " + getotype(otype) + " Order Issuring Time=" +
                             (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                             sf.getpairprice(ctype));
            else
                displayokmsg(filename, threadid, data1, data19,
                             name + "_" + sf.getpair(ctype) + " " + getotype(otype) + " Order Issuring Time=" +
                             (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                             sf.getpairprice(ctype));
        } else if (sf != null && orderpermit.isSelected() && permit.isSelected() &&
                   (sf.timespan <= (0 - Integer.parseInt(timespanF.getText())) ||
                    (otype == BUYLMT ? ((p - getf5sprice(ctype)) > (Double.parseDouble(field.getText()) / i)) :
                     ((getf5sprice(ctype) - p) > (Double.parseDouble(field.getText()) / i))))) {
            // System.out.println(p+"  "+getf5sprice(ctype));
            if ((otype == BUYLMT ? ((p - getf5sprice(ctype)) > (Double.parseDouble(field.getText()) / i)) :
                 ((getf5sprice(ctype) - p) > (Double.parseDouble(field.getText()) / i)))) {
                displayvfmsg(filename,
                             name + "_" + (sf == null ? "pair=" + ctype : sf.getpair(ctype)) + " " + getotype(otype) +
                             " Order Not sent.SurgedLimit exceeded. Time=" +
                             (new Time(System.currentTimeMillis() + timeoffset)).toString() + ",", threadid);
            } else
                displayvfmsg(filename,
                             name + "_" + (sf == null ? "pair=" + ctype : sf.getpair(ctype)) + " " + getotype(otype) +
                             " Order Not sent.TimeSpan exceeded. Time=" +
                             (new Time(System.currentTimeMillis() + timeoffset)).toString() + ",", threadid);
        } else
            displayvfmsg(filename,
                         name + "_" + (sf == null ? "pair=" + ctype : sf.getpair(ctype)) + " " + getotype(otype) +
                         " Order Not sent.sf==null or permit is not selected. Time=" +
                         (new Time(System.currentTimeMillis() + timeoffset)).toString() + ",", threadid);


        displaymvalue((data_f > 0 ? "+" : "") + data_f + "(" + getSSWR2(data1) + "..." + emchg + ")" +
                      getSSWR2(data1 - emchg), color, threadid);


    }

    private boolean submit(int submit, String name, String filename, int power, double data1, double data19,
                           double emchg, double oneprevious, int botype, int bctype, double boffset, int wotype,
                           int wctype, double woffset, double fbt, double fwt, double sbt, double swt, int quantity,
                           int threadid) {
        if (submit == 1)
            return CAD_Submit(name, filename, power, data1, data19, emchg, oneprevious, botype, bctype, boffset, wotype,
                              wctype, woffset, fbt, fwt, sbt, swt, quantity, threadid);
        else if (submit == 2)
            return submitOneSP(name, filename, power, data1, data19, emchg, oneprevious, botype, bctype, boffset,
                               wotype, wctype, woffset, fbt, fwt, sbt, swt, quantity, threadid);
        else if (submit == 4)
            return CAD_SubmitOneSP(name, filename, power, data1, data19, emchg, oneprevious, botype, bctype, boffset,
                                   wotype, wctype, woffset, fbt, fwt, sbt, swt, quantity, threadid);
        else if (submit == 6) {
            displayokmsg(filename, threadid, data1, data19, name + "-No order submit requested");
            return true;
        }
       
        double data =
            getSSWR2(data1 - emchg +
                     (data19 - oneprevious) * 0.2); //has previous data,more reliable,can make reliable decision
        if (Math.abs(data) < fbt && power == 0) {

            displayokmsg(filename, threadid, data1, data19,
                         name + "-Y-V=" + data1 + "  at " +
                         (new Time(System.currentTimeMillis() + timeoffset)).toString());
            return true;
        }

        if (!bdata && orderpermit.isSelected()) {
            displayokmsg(filename, threadid, "-L-d1" + data1 + ",d19=" + (power == 1 ? data19 : "NA"));
            if (power == 1 && Math.abs(data) < fbt) {

                jTextField7.append(data1 + "   p=" + data19 + "  -------!!!!!");
                jTextField7.append(data1 + "   p=" + data19 + "  -------!!!!!");
                jTextField7.append(data1 + "   p=" + data19 + "  -------!!!!!");
            }
            return true;
        }
        bdata = false;


        if (((data) >= fbt)) {
            betterORworse(new Color(0, 153, 0), bpermit, pricesurgeF, name, filename, power, data, data1, data19, emchg,
                          oneprevious, botype, bctype, boffset, quantity, threadid);


        } else if (((data) <= (0 - fwt))) {
            betterORworse(Color.red, wpermit, pricesurgeF, name, filename, power, data, data1, data19, emchg,
                          oneprevious, wotype, wctype, woffset, quantity, threadid);


        } else // if(data<0.3 && data>-0.3)
        {

            displaymvalue((data > 0 ? "+" : "") + data + "(" + getSSWR2(data1) + "..." + emchg + ")" +
                          getSSWR2(data1 - emchg), Color.blue, threadid);

            if (power == 0)
                displayokmsg(filename, threadid, data1,
                             name + "-NA-T=" + (new Time(System.currentTimeMillis() + timeoffset)).toString());
            else
                displayokmsg(filename, threadid, data1, data19,
                             name + "-NA-T=" + (new Time(System.currentTimeMillis() + timeoffset)).toString());

        }

        onepreviousF.setText(getSSWR1(data19 - oneprevious) + "(" + data19 + "  " + oneprevious + ")");
        onepreviousF.setForeground(data19 >= oneprevious ? new Color(0, 153, 0) : Color.red);
        displaycvalue(getSSWR1(data19 - oneprevious) + "(" + data19 + "  " + oneprevious + ")",
                      data19 >= oneprevious ? new Color(0, 153, 0) : Color.red, threadid);


        return true;

    }

    private void displaymvalue(String txt, Color color, int threadid) {
        if (threadid == 0) {
            value1.setText(txt);
            value1.setForeground(color);
        } else if (threadid == 11) {
            value2.setText(txt);
            value2.setForeground(color);

        } else if (threadid == 5) {
            data3show.setText(txt);
            data3show.setForeground(color);

        } else if (threadid == 6) {
            data4show.setText(txt);
            data4show.setForeground(color);

        } else if (threadid == 2) {
            td2info.setText(txt);
            td2info.setForeground(color);

        } else if (threadid == 3) {
            td3info.setText(txt);
            td3info.setForeground(color);

        } else if (threadid == 4) {
            td4info.setText(txt);
            td4info.setForeground(color);

        } else if (threadid == 7) {
            td7info.setText(txt);
            td7info.setForeground(color);

        } else if (threadid == 8) {
            td8info.setText(txt);
            td8info.setForeground(color);

        } else if (threadid == 9) {
            td9info.setText(txt);
            td9info.setForeground(color);

        } else if (threadid == 10) {
            td10info.setText(txt);
            td10info.setForeground(color);

        }
    }

    private void displaycvalue(String txt, Color color, int threadid) {
        if (threadid == 0) {
            onepreviousF.setText(txt);
            onepreviousF.setForeground(color);
        } else if (threadid == 11) {
            twopreviousF.setText(txt);
            twopreviousF.setForeground(color);

        } else if (threadid == 5) {
            data39show.setText(txt);
            data39show.setForeground(color);

        } else if (threadid == 6) {
            data49show.setText(txt);
            data49show.setForeground(color);

        } else if (threadid == 2) {
            td2info.setText(td2info.getText() + "(" + txt + ")");

        } else if (threadid == 3) {
            td3info.setText(td3info.getText() + "(" + txt + ")");

        } else if (threadid == 4) {
            td4info.setText(td4info.getText() + "(" + txt + ")");

        } else if (threadid == 7) {
            td7info.setText(td7info.getText() + "(" + txt + ")");
        } else if (threadid == 8) {
            td8info.setText(td8info.getText() + "(" + txt + ")");
        } else if (threadid == 9) {
            td9info.setText(td9info.getText() + "(" + txt + ")");

        } else if (threadid == 10) {
            td10info.setText(td10info.getText() + "(" + txt + ")");
        }
    }

    private boolean submitOneSP(String name, String filename, int power, double data1, double data19, double emchg,
                                double oneprevious, int botype, int bctype, double boffset, int wotype, int wctype,
                                double woffset, double fbt, double fwt, double sbt, double swt, int quantity,
                                int threadid) {

        double data =
            getSSWR2(data1 - emchg +
                     (data19 - oneprevious) * 0.2); //has previous data,more reliable,can make reliable decision
        if (Math.abs(data) < fbt && power == 0) {

            displayokmsg(filename, threadid, data1, data19,
                         name + "-Y-V=" + data1 + "  at " +
                         (new Time(System.currentTimeMillis() + timeoffset)).toString());
            return true;
        }

        if (!bdata && orderpermit.isSelected()) {
            displayokmsg(filename, threadid, "-L-d1" + data1 + ",d19=" + (power == 1 ? data19 : "NA"));
            if (power == 1 && Math.abs(data) < fbt) {

                jTextField7.append(data1 + "   p=" + data19 + "  -------!!!!!");
                jTextField7.append(data1 + "   p=" + data19 + "  -------!!!!!");
                jTextField7.append(data1 + "   p=" + data19 + "  -------!!!!!");
            }
            return true;
        }
        bdata = false;

        // word "better or worse" affect the display color only,no buy or sell decision affected,so "worse" can work with botype!

        if (((data) >= fbt)) {
            betterORworse(Color.red, bpermit, pricesurgeF, name, filename, power, data, data1, data19, emchg,
                          oneprevious, botype, bctype, boffset, quantity, threadid);


        } else if (((data) <= (0 - fwt))) {
            betterORworse(new Color(0, 153, 0), wpermit, pricesurgeF, name, filename, power, data, data1, data19, emchg,
                          oneprevious, wotype, wctype, woffset, quantity, threadid);


        } else // if(data<0.3 && data>-0.3)
        {

            displaymvalue((data > 0 ? "+" : "") + data + "(" + getSSWR2(data1) + "..." + emchg + ")" +
                          getSSWR2(data1 - emchg), Color.blue, threadid);

            if (power == 0)
                displayokmsg(filename, threadid, data1,
                             name + "-NA-T=" + (new Time(System.currentTimeMillis() + timeoffset)).toString());
            else
                displayokmsg(filename, threadid, data1, data19,
                             name + "-NA-T=" + (new Time(System.currentTimeMillis() + timeoffset)).toString());

        }

        //    onepreviousF.setText(getSSWR1(data19-oneprevious)+"("+data19+"  "+oneprevious+")");
        //    onepreviousF.setForeground(data19<=oneprevious? new Color(0,153,0):Color.red);
        displaycvalue(getSSWR1(data19 - oneprevious) + "(" + data19 + "  " + oneprevious + ")",
                      data19 <= oneprevious ? new Color(0, 153, 0) : Color.red, threadid);


        return true;

    }

    private boolean submit(int submit, String name, String filename, int power, double data1, double data19,
                           double data2, double data29, double emchg, double oneprevious, double uerate,
                           double twoprevious, int botype, int bctype, double boffset, int wotype, int wctype,
                           double woffset, double fbt, double fwt, double sbt, double swt, int quantity, int threadid) {
        if (submit == 1)
            return CAD_Submit(name, filename, power, data1, data19, data2, data29, emchg, oneprevious, uerate,
                              twoprevious, botype, bctype, boffset, wotype, wctype, woffset, fbt, fwt, sbt, swt,
                              quantity, threadid);
        else if (submit == 3)
            return submitSndSP(name, filename, power, data1, data19, data2, data29, emchg, oneprevious, uerate,
                               twoprevious, botype, bctype, boffset, wotype, wctype, woffset, fbt, fwt, sbt, swt,
                               quantity, threadid);
        else if (submit == 5)
            return CAD_SubmitSndSP(name, filename, power, data1, data19, data2, data29, emchg, oneprevious, uerate,
                                   twoprevious, botype, bctype, boffset, wotype, wctype, woffset, fbt, fwt, sbt, swt,
                                   quantity, threadid);
        else if (submit == 6) {
            displayokmsg(filename, threadid, data1, data19, data2, data29, name + "-No order submit requested");
            return true;
        }


        //  double target=0.3;
        // System.out.println(data1+" "+data19+" "+emchg+" "+oneprevious);


        double data =
            getSSWR2(data1 - emchg +
                     (data19 - oneprevious) * 0.2); //has previous data,more reliable,can make reliable decision
        double data_s =
            getSSWR2(data2 - uerate +
                     (data29 - twoprevious) * 0.2); //has previous data,more reliable,can make reliable decision
        if ((Math.abs(data) < fbt || Math.abs(data_s) < sbt) && power == 0) {
            displayokmsg(filename, threadid, data1, data19, data2, data29,
                         name + "-Y-Vs=" + data1 + "  " + data2 + " at " +
                         (new Time(System.currentTimeMillis() + timeoffset)).toString());
            return true;
        }

        if (!bdata && orderpermit.isSelected()) {
            displayokmsg(filename, threadid,
                         "-L-d*" + data1 + " " + data2 + ",d*9=" + (power == 1 ? data19 + " " + data29 : "NA"));
            if (power == 1 && (Math.abs(data) < fbt || Math.abs(data_s) < sbt)) {


                jTextField7.append(data1 + "   p=" + data19 + "  -------!!!!!");
                jTextField7.append(data2 + "   p=" + data29 + "  -------!!!!!");

            }
            return true;
        }
        bdata = false;


        if (data >= fbt && data_s >= sbt) {
            betterORworse(new Color(0, 153, 0), bpermit, pricesurgeF, name, filename, power, data, data_s, data1,
                          data19, data2, data29, emchg, oneprevious, uerate, twoprevious, botype, bctype, boffset,
                          quantity, threadid);

        } else if (data <= (0 - fwt) && data_s <= (0 - swt)) {
            betterORworse(Color.red, wpermit, pricesurgeF, name, filename, power, data, data_s, data1, data19, data2,
                          data29, emchg, oneprevious, uerate, twoprevious, wotype, wctype, woffset, quantity, threadid);


        } else // if(data<0.3 && data>-0.3)
        {


            if (threadid == 0) {
                value1.setText((data > 0 ? "+" : "") + data + "(" + getSSWR2(data1) + "..." + emchg + ")" +
                               getSSWR2(data1 - emchg));
                value2.setText((data_s > 0 ? "+" : "") + data_s + "(" + getSSWR2(data2) + "..." + uerate + ")" +
                               getSSWR2(data2 - uerate));
                value2.setForeground(data_s >= 0 ? new Color(0, 153, 0) : Color.red);
                value1.setForeground(data >= 0 ? new Color(0, 153, 0) : Color.red);
            } else {
                data3show.setText((data > 0 ? "+" : "") + data + "(" + getSSWR2(data1) + "..." + emchg + ")" +
                                  getSSWR2(data1 - emchg));
                data4show.setText((data_s > 0 ? "+" : "") + data_s + "(" + getSSWR2(data2) + "..." + uerate + ")" +
                                  getSSWR2(data2 - uerate));
                data4show.setForeground(data_s >= 0 ? new Color(0, 153, 0) : Color.red);
                data3show.setForeground(data >= 0 ? new Color(0, 153, 0) : Color.red);
            }


            if (power == 0)
                displayokmsg(filename, threadid, data1, data2,
                             name + "-NA-T=" + (new Time(System.currentTimeMillis() + timeoffset)).toString());
            else
                displayokmsg(filename, threadid, data1, data19, data2, data29,
                             name + "-NA-T=" + (new Time(System.currentTimeMillis() + timeoffset)).toString());

        }

        if (threadid == 0) {
            onepreviousF.setText(getSSWR2(data19 - oneprevious) + "(" + data19 + "__" + oneprevious + ")");
            onepreviousF.setForeground(data19 >= oneprevious ? new Color(0, 153, 0) : Color.red);
            twopreviousF.setText(getSSWR2(data29 - twoprevious) + "(" + data29 + "__" + twoprevious + ")");
            twopreviousF.setForeground(data29 >= twoprevious ? new Color(0, 153, 0) : Color.red);
        } else {
            data39show.setText(getSSWR2(data19 - oneprevious) + "(" + data19 + "__" + oneprevious + ")");
            data39show.setForeground(data19 >= oneprevious ? new Color(0, 153, 0) : Color.red);
            data49show.setText(getSSWR2(data29 - twoprevious) + "(" + data29 + "__" + twoprevious + ")");
            data49show.setForeground(data29 >= twoprevious ? new Color(0, 153, 0) : Color.red);
        }


        return true;

    }

    private boolean submitSndSP(String name, String filename, int power, double data1, double data19, double data2,
                                double data29, double emchg, double oneprevious, double uerate, double twoprevious,
                                int botype, int bctype, double boffset, int wotype, int wctype, double woffset,
                                double fbt, double fwt, double sbt, double swt, int quantity, int threadid) {
        //  >= && <= for labor
        double data = getSSWR2(data1 - emchg + (data19 - oneprevious) * 0.2); //has previous data,more reliable,can make reliable decision
        double data_s = getSSWR2(data2 - uerate + (data29 - twoprevious) * 0.2); //has previous data,more reliable,can make reliable decision
        if ((Math.abs(data) < fbt || Math.abs(data_s) < sbt) && power == 0) {

            displayokmsg(filename, threadid, data1, data19, data2, data29,
                         name + "-Y-Vs=" + data1 + "  " + data2 + " at " +
                         (new Time(System.currentTimeMillis() + timeoffset)).toString());
            return true;
        }

        if (!bdata && orderpermit.isSelected()) {
            displayokmsg(filename, threadid,
                         "-L-d*" + data1 + " " + data2 + ",d*9=" + (power == 1 ? data19 + " " + data29 : "NA"));
            if (power == 1 && (Math.abs(data) < fbt || Math.abs(data_s) < sbt)) {


                jTextField7.append(data1 + "   p=" + data19 + "  -------!!!!!");
                jTextField7.append(data2 + "   p=" + data29 + "  -------!!!!!");

            }
            return true;
        }
        bdata = false;


        if (data >= fbt && data_s <= (0 - sbt)) {
            betterORworse(new Color(0, 153, 0), bpermit, pricesurgeF, name, filename, power, data, data_s, data1,
                          data19, data2, data29, emchg, oneprevious, uerate, twoprevious, botype, bctype, boffset,
                          quantity, threadid);


        } else if (data <= (0 - fwt) && data_s >= swt) {
            betterORworse(Color.red, wpermit, pricesurgeF, name, filename, power, data, data_s, data1, data19, data2,
                          data29, emchg, oneprevious, uerate, twoprevious, wotype, wctype, woffset, quantity, threadid);


        } else // if(data<0.3 && data>-0.3)
        {


            if (threadid == 0) {
                value1.setText((data > 0 ? "+" : "") + data + "(" + getSSWR2(data1) + "..." + emchg + ")" +
                               getSSWR2(data1 - emchg));
                value2.setText((data_s > 0 ? "+" : "") + data_s + "(" + getSSWR2(data2) + "..." + uerate + ")" +
                               getSSWR2(data2 - uerate));
                value2.setForeground(data_s <= 0 ? new Color(0, 153, 0) : Color.red);
                value1.setForeground(data >= 0 ? new Color(0, 153, 0) : Color.red);
            } else {
                data3show.setText((data > 0 ? "+" : "") + data + "(" + getSSWR2(data1) + "..." + emchg + ")" +
                                  getSSWR2(data1 - emchg));
                data4show.setText((data_s > 0 ? "+" : "") + data_s + "(" + getSSWR2(data2) + "..." + uerate + ")" +
                                  getSSWR2(data2 - uerate));
                data4show.setForeground(data_s <= 0 ? new Color(0, 153, 0) : Color.red);
                data3show.setForeground(data >= 0 ? new Color(0, 153, 0) : Color.red);
            }


            if (power == 0)
                displayokmsg(filename, threadid, data1, data2,
                             name + "-NA-T=" + (new Time(System.currentTimeMillis() + timeoffset)).toString());
            else
                displayokmsg(filename, threadid, data1, data19, data2, data29,
                             name + "-NA-T=" + (new Time(System.currentTimeMillis() + timeoffset)).toString());

        }


        if (threadid == 0) {
            onepreviousF.setText(getSSWR2(data19 - oneprevious) + "(" + data19 + "__" + oneprevious + ")");
            onepreviousF.setForeground(data19 >= oneprevious ? new Color(0, 153, 0) : Color.red);
            twopreviousF.setText(getSSWR2(data29 - twoprevious) + "(" + data29 + "__" + twoprevious + ")");
            twopreviousF.setForeground(data29 <= twoprevious ? new Color(0, 153, 0) : Color.red);
        } else {
            data39show.setText(getSSWR2(data19 - oneprevious) + "(" + data19 + "__" + oneprevious + ")");
            data39show.setForeground(data19 >= oneprevious ? new Color(0, 153, 0) : Color.red);
            data49show.setText(getSSWR2(data29 - twoprevious) + "(" + data29 + "__" + twoprevious + ")");
            data49show.setForeground(data29 <= twoprevious ? new Color(0, 153, 0) : Color.red);
        }


        return true;

    }

    private boolean CAD_GDP_ORG(String str, String filename, String betterword, double emchg, double oneprevious,
                                int botype, int bctype, double boffset, int wotype, int wctype, double woffset,
                                double fbt, double fwt, double sbt, double swt, int quantity, int threadid) {

        int n = Integer.parseInt(betterword);

        int n0 = str.indexOf("year2012 month" + n); //to be modified
        //  System.out.println(n0);
        if (n0 < 0) {
            displayvfmsg(filename, "NO update-GDP_ORG", threadid);
            return false;
        }

        //////----------current month gdp-----------
        int n1 = str.indexOf("</td", n0);
        //  System.out.println(n1);
        n0 = str.lastIndexOf("\">", n1);
        //  System.out.println(n0);
        String tem1 = getDigit(str.substring(n0, n1));
        //  System.out.println(tem1);
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data3");
            return false;
        }
        //   tem1="0.7";
        double data1_1 = Double.parseDouble(tem1);

        //------------- 2 months ago gdp------------
        n0 = str.indexOf("year2012 month" + (n - 2)); //to be modified
        n1 = str.indexOf("</td", n0);
        n0 = str.lastIndexOf("\">", n1);
        tem1 = getDigit(str.substring(n0, n1));
        // System.out.println(tem1);
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1");
            return false;
        }
        // tem1="0.5";
        double data1_3 = Double.parseDouble(tem1);


        //------------previous month gdp-------------
        n0 = str.indexOf("year2012 month" + (n - 1), n1); //to be modified
        n1 = str.indexOf("</td", n0);
        n0 = str.lastIndexOf("\">", n1);

        tem1 = getDigit(str.substring(n0, n1));
        // System.out.println(tem1);
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data2");
            return false;
        }
        //  tem1="0.6";
        double data1_2 = Double.parseDouble(tem1);

        //   System.out.println(data1_1+" "+data1_2+" "+data1_3);

        double data1 = getSSWR2((data1_1 - data1_2) * 100.0 / data1_2);
        double data19 = getSSWR2((data1_2 - data1_3) * 100.0 / data1_3);

        return CAD_Submit("CADGDP", filename, 1, data1, data19, emchg, oneprevious, botype, bctype, boffset, wotype,
                          wctype, woffset, fbt, fwt, sbt, swt, quantity, threadid);
    }

    private boolean CAD_TRADEBAL_ORG(String str, String filename, String betterword, double emchg, double oneprevious,
                                     int botype, int bctype, double boffset, int wotype, int wctype, double woffset,
                                     double fbt, double fwt, double sbt, double swt, int submit, int quantity,
                                     int threadid) {

        int n = Integer.parseInt(betterword);


        int n0 = str.indexOf("imp1 year2012 month" + (n)); //to be modifi
        if (n0 < 0) {
            displayvfmsg(filename, "NO update-GDP_TRADE_ORG", threadid);
            return false;
        }
        int n1 = str.indexOf("</td", n0);
        n0 = str.lastIndexOf("\">", n1);
        String tem1 = getDigit(str.substring(n0, n1));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data3");
            return false;
        }
        double data1_1 = Double.parseDouble(tem1); //previous month import
        //---------
        n0 = str.lastIndexOf("imp1 year2012 month" + (n - 1), n1); //to be modified, lastIndex is special here!
        if (n0 < 0) {
            displayvfmsg(filename, "data19_1 retrieving err", threadid);
            return false;
        }
        n1 = str.indexOf("</td", n0);
        n0 = str.lastIndexOf("\">", n1);
        tem1 = getDigit(str.substring(n0, n1));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data3");
            return false;
        }
        double data19_1 = Double.parseDouble(tem1); //curent month import
        //------------------
        n0 = str.indexOf("imp75 year2012 month" + (n - 1), n1); //to be modifi
        if (n0 < 0) {
            displayvfmsg(filename, "data19_2 retrieving err", threadid);
            return false;
        }
        n1 = str.indexOf("</td", n0);
        n0 = str.lastIndexOf("\">", n1);
        tem1 = getDigit(str.substring(n0, n1));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data3");
            return false;
        }
        double data19_2 = Double.parseDouble(tem1); //prevois month export
        //----------------------
        n0 = str.indexOf("imp75 year2012 month" + n, n1); //to be modifi
        if (n0 < 0) {
            displayvfmsg(filename, "data1_2 retrieving err\"", threadid);
            return false;
        }
        n1 = str.indexOf("</td", n0);
        n0 = str.lastIndexOf("\">", n1);
        tem1 = getDigit(str.substring(n0, n1));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data3");
            return false;
        }
        double data1_2 = Double.parseDouble(tem1); //current month export


        double data1 = getSSWR2((data1_2 - data1_1) / 1000.0);
        double data19 = getSSWR2((data19_2 - data19_1) / 1000.0);

        return CAD_Submit("CAD_TRADE_ORG", filename, 1, data1, data19, emchg, oneprevious, botype, bctype, boffset,
                          wotype, wctype, woffset, fbt, fwt, sbt, swt, quantity, threadid);
    }

    private boolean CAD_CPI_ORG(String str, String filename, String betterword, double emchg, double oneprevious,
                                double uemrate, double twoprevious, int botype, int bctype, double boffset, int wotype,
                                int wctype, double woffset, double fbt, double fwt, double sbt, double swt, int submit,
                                int quantity, int threadid) {

        int n = Integer.parseInt(betterword);


        int n0 = str.indexOf("comm2 year2012 month" + (n)); //to be modifi
        if (n0 < 0) {
            displayvfmsg(filename, "NO update-GDP_CPI_ORG", threadid);
            return false;
        }

        //////////===============All Item CPI=================

        int n1 = str.indexOf("</td", n0);
        n0 = str.lastIndexOf("\">", n1);
        String tem1 = getDigit(str.substring(n0, n1));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data2_1");
            return false;
        }
        double data2_1 = Double.parseDouble(tem1); //current month cpi index

        //---------  2 month ago cpi index,for calcultion of previous CPI change:-------------------------
        n0 = str.lastIndexOf("comm2 year2012 month" + (n - 2), n1); //to be modified, lastIndex is special here!
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "data2_3 retrieving err");
            return false;
        }
        n1 = str.indexOf("</td", n0);
        n0 = str.lastIndexOf("\">", n1);
        tem1 = getDigit(str.substring(n0, n1));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data2_2");
            return false;
        }
        double data2_3 = Double.parseDouble(tem1); //2 month ago cpi index,for calcultion of previous CPI change

        //--------- previous month cpi index------------
        n0 = str.indexOf("comm2 year2012 month" + (n - 1), n1); //to be modified.
        if (n0 < 0) {
            displayvfmsg(filename, "data2_2 retrieving err", threadid);
            return false;
        }
        n1 = str.indexOf("</td", n0);
        n0 = str.lastIndexOf("\">", n1);
        tem1 = getDigit(str.substring(n0, n1));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data2_2");
            return false;
        }
        double data2_2 = Double.parseDouble(tem1); //previous month cpi index

        //=======================================Core CPI=======================
        //---------  2 month ago core cpi index,for calcultion of previous core CPI change:-------------------------
        n0 = str.indexOf("comm299 year2012 month" + (n - 2), n1); //to be modifi
        if (n0 < 0) {
            displayvfmsg(filename, "data1_3 retrieving err", threadid);
            return false;
        }
        n1 = str.indexOf("</td", n0);
        n0 = str.lastIndexOf("\">", n1);
        tem1 = getDigit(str.substring(n0, n1));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1_3");
            return false;
        }
        double data1_3 = Double.parseDouble(tem1); //prevois month core cpi index

        //------------------
        n0 = str.indexOf("comm299 year2012 month" + (n - 1), n1); //to be modifi
        if (n0 < 0) {
            displayvfmsg(filename, "data1_2 retrieving err", threadid);
            return false;
        }
        n1 = str.indexOf("</td", n0);
        n0 = str.lastIndexOf("\">", n1);
        tem1 = getDigit(str.substring(n0, n1));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1_2");
            return false;
        }
        double data1_2 = Double.parseDouble(tem1); //prevois month core cpi index
        //----------------------
        n0 = str.indexOf("comm299 year2012 month" + n, n1); //to be modifi
        if (n0 < 0) {
            displayvfmsg(filename, "data1_1 retrieving err\"", threadid);
            return false;
        }
        n1 = str.indexOf("</td", n0);
        n0 = str.lastIndexOf("\">", n1);
        tem1 = getDigit(str.substring(n0, n1));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1_1");
            return false;
        }
        double data1_1 = Double.parseDouble(tem1); //current month core cpi index


        double data1 = getSSWR2((data1_1 - data1_2) / data1_2 * 100.0);
        double data19 = getSSWR2((data1_2 - data1_3) / data1_3 * 100.0);
        double data2 = getSSWR2((data2_1 - data2_2) / data2_2 * 100.0);
        double data29 = getSSWR2((data2_2 - data2_3) / data2_3 * 100.0);

        return CAD_Submit("CAD_CPI_ORG", filename, 1, data1, data19, data2, data29, emchg, oneprevious, uemrate,
                          twoprevious, botype, bctype, boffset, wotype, wctype, woffset, fbt, fwt, sbt, swt, quantity,
                          threadid);
    }

    private boolean CAD_RETAIL_ORG(String str, String filename, String betterword, double emchg, double oneprevious,
                                   double uemrate, double twoprevious, int botype, int bctype, double boffset,
                                   int wotype, int wctype, double woffset, double fbt, double fwt, double sbt,
                                   double swt, int submit, int quantity, int threadid) {

        int n = Integer.parseInt(betterword);

        //----verify if data is available-----------

        int n0 = str.indexOf("naics1 year2012 month" + (n)); //to be modifi
        if (n0 < 0) {
            displayvfmsg(filename, "NO update-Retail_ORG", threadid);
            return false;
        }

        //----------------current month retail sales-----------
        int n1 = str.indexOf("</td", n0);
        n0 = str.lastIndexOf("\">", n1);
        String tem1 = getDigit(str.substring(n0, n1));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data2_1:" + tem1);
            return false;
        }
        double data2_1 = Double.parseDouble(tem1);


        //---------  2 months ago retail sales-------------
        n0 = str.lastIndexOf("naics1 year2012 month" + (n - 2), n1); //to be modified, lastIndex is special here!
        if (n0 < 0) {
            displayvfmsg(filename, "data2_3 retrieving err", threadid);
            return false;
        }
        n1 = str.indexOf("</td", n0);
        n0 = str.lastIndexOf("\">", n1);
        tem1 = getDigit(str.substring(n0, n1));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data2_3");
            return false;
        }
        double data2_3 = Double.parseDouble(tem1);

        //----------Previus month retail sales----------------------
        n0 = str.indexOf("naics1 year2012 month" + (n - 1), n1); //to be modifi
        if (n0 < 0) {
            displayvfmsg(filename, "data2_2 retrieving err", threadid);
            return false;
        }
        n1 = str.indexOf("</td", n0);
        n0 = str.lastIndexOf("\">", n1);
        tem1 = getDigit(str.substring(n0, n1));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data2_2");
            return false;
        }
        double data2_2 = Double.parseDouble(tem1); //prevois month export

        //================Motor and parts sales============,used to calculate core retail sales==
        // -----------2 months ago MP sales---------------------
        n0 = str.indexOf("naics2 year2012 month" + (n - 2), n1); //to be modifi
        if (n0 < 0) {
            displayvfmsg(filename, "data1_3 retrieving err", threadid);
            return false;
        }
        n1 = str.indexOf("</td", n0);
        n0 = str.lastIndexOf("\">", n1);
        tem1 = getDigit(str.substring(n0, n1));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1_3");
            return false;
        }
        double data1_3 = data2_3 - Double.parseDouble(tem1);

        // -----------previous months  MP sales---------------------
        n0 = str.indexOf("naics2 year2012 month" + (n - 1), n1); //to be modifi
        if (n0 < 0) {
            displayvfmsg(filename, "data1_2 retrieving err", threadid);
            return false;
        }
        n1 = str.indexOf("</td", n0);
        n0 = str.lastIndexOf("\">", n1);
        tem1 = getDigit(str.substring(n0, n1));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1_2");
            return false;
        }
        double data1_2 = data2_2 - Double.parseDouble(tem1);

        //------------------current mont MP sales-----------
        n0 = str.indexOf("naics2 year2012 month" + n, n1); //to be modifi
        if (n0 < 0) {
            displayvfmsg(filename, "data1_1 retrieving err\"", threadid);
            return false;
        }
        n1 = str.indexOf("</td", n0);
        n0 = str.lastIndexOf("\">", n1);
        tem1 = getDigit(str.substring(n0, n1));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1_1");
            return false;
        }
        double data1_1 = data2_1 - Double.parseDouble(tem1);


        double data1 = getSSWR2((data1_1 - data1_2) / data1_2 * 100.0);
        double data19 = getSSWR2((data1_2 - data1_3) / data1_3 * 100.0);
        double data2 = getSSWR2((data2_1 - data2_2) / data2_2 * 100.0);
        double data29 = getSSWR2((data2_2 - data2_3) / data2_3 * 100.0);

        return CAD_Submit("CAD_RETAIL_ORG", filename, 1, data1, data19, data2, data29, emchg, oneprevious, uemrate,
                          twoprevious, botype, bctype, boffset, wotype, wctype, woffset, fbt, fwt, sbt, swt, quantity,
                          threadid);
    }

    private boolean CAD_LABOR_ORG(String str, String filename, String betterword, int indno, double emchg,
                                  double oneprevious, double uemrate, double twoprevious, int botype, int bctype,
                                  double boffset, int wotype, int wctype, double woffset, double fbt, double fwt,
                                  double sbt, double swt, int quantity, int threadid) {

        String mm = indno + " month" + betterword.trim();
        //----------------- verify  if data available-------------------
        int nbase = str.indexOf(mm); //to be modified


        if (nbase < 0) {
            displayvfmsg(filename, "NO update-LABOR_ORG1", threadid);
            return false;
        }
        //-------------current month employment------------
        int n1 = str.indexOf("</td", nbase);
        int n0 = str.lastIndexOf("\">", n1);
        String tem1 = getDigit(str.substring(n0, n1));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1-1");
            return false;
        }
        double data1_1 = Double.parseDouble(tem1);

        //------------------previous months employment--------------
        n0 = str.lastIndexOf("month", nbase - 10);
        int tembase = n0;
        n1 = str.indexOf("</td", n0);
        n0 = str.lastIndexOf("\">", n1);

        tem1 = getDigit(str.substring(n0, n1));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1-2");
            return false;
        }
        double data1_2 = Double.parseDouble(tem1);

        //--------------2 months ago employment------------
        n0 = str.lastIndexOf("month", tembase - 10);
        n1 = str.indexOf("</td", n0);
        n0 = str.lastIndexOf("\">", n1);
        tem1 = getDigit(str.substring(n0, n1));
        // System.out.println(tem1);
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1-3");
            return false;
        }
        double data1_3 = Double.parseDouble(tem1);


        nbase = str.indexOf(mm, nbase + 10);

        //------------full time employment --------------------------

        //n0=str.indexOf("month"+n,nbase);
        n1 = str.indexOf("</td", nbase);
        n0 = str.lastIndexOf("\">", n1);

        tem1 = getDigit(str.substring(n0, n1));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1-2");
            return false;
        }
        double fullno = getSSWR2(Double.parseDouble(tem1));
        //jTextField1.setText("Full time employment ratio:"+ftRatio+"%");

        //------------------previous months full time employment--------------
        n0 = str.lastIndexOf("month", nbase - 10);
        tembase = n0;
        n1 = str.indexOf("</td", n0);
        n0 = str.lastIndexOf("\">", n1);

        tem1 = getDigit(str.substring(n0, n1));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1-2");
            return false;
        }
        double fullno_1 = Double.parseDouble(tem1);

        //--------------2 months ago full time employment------------
        n0 = str.lastIndexOf("month", tembase - 10);
        n1 = str.indexOf("</td", n0);
        n0 = str.lastIndexOf("\">", n1);
        tem1 = getDigit(str.substring(n0, n1));
        // System.out.println(tem1);
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1-3");
            return false;
        }
        double fullno_2 = Double.parseDouble(tem1);


        double data1 = getSSWR2((data1_1 - data1_2));
        double data19 = getSSWR2((data1_2 - data1_3));


        nbase = str.indexOf(mm, nbase + 10);
        //------------Part time employment --------------------------

        n0 = str.indexOf("</td", nbase);
        n1 = str.indexOf("</td", n0);
        n0 = str.lastIndexOf("\">", n1);

        tem1 = getDigit(str.substring(n0, n1));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1-2");
            return false;
        }
        double partno = getSSWR2(Double.parseDouble(tem1));
        // jTextField1.setText("Full time employment ratio:"+ftRatio+"%");

        //------------------previous months part time employment--------------
        n0 = str.lastIndexOf("month", nbase - 10);
        tembase = n0;
        n1 = str.indexOf("</td", n0);
        n0 = str.lastIndexOf("\">", n1);

        tem1 = getDigit(str.substring(n0, n1));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1-2");
            return false;
        }
        double partno_1 = Double.parseDouble(tem1);

        //--------------2 months ago part time employment------------
        n0 = str.lastIndexOf("month", tembase - 10);
        n1 = str.indexOf("</td", n0);
        n0 = str.lastIndexOf("\">", n1);
        tem1 = getDigit(str.substring(n0, n1));
        // System.out.println(tem1);
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1-3");
            return false;
        }
        double partno_2 = Double.parseDouble(tem1);


        //   double data1=getSSWR2((data1_1-data1_2));
        //   double data19=getSSWR2((data1_2-data1_3));

        nbase = str.indexOf(mm, nbase + 10);

        if (nbase < 0) {
            displayvfmsg(filename, "NO update-Labor_ORG-UErate2", threadid);
            return false;
        }

        //----------------------current month unemployment rate----------------


        n1 = str.indexOf("</td", nbase);
        n0 = str.lastIndexOf("\">", n1);
        tem1 = getDigit(str.substring(n0, n1));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data2");
            return false;
        }
        double data2 = Double.parseDouble(tem1);
        //=============================Previous month unemployment Rate=========================
        // n0=str.indexOf("characteristics7 year2013 month"+(n-1),n0); //to be modified
        //  System.out.println(n0);

        n0 = str.lastIndexOf("month", nbase - 10);
        n1 = str.indexOf("</td", nbase);
        n0 = str.lastIndexOf("\">", n1);
        tem1 = getDigit(str.substring(n0, n1));

        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data29");
            return false;
        }

        double data29 = Double.parseDouble(tem1);

        nbase = str.indexOf(mm, nbase + 10);
        //----------------------current month unemployment rate----------------


        if (nbase < 0) {
            displayvfmsg(filename, "NO update-Labor_ORG-UErate3", threadid);
            return false;
        }
        n1 = str.indexOf("</td", nbase);
        n0 = str.lastIndexOf("\">", n1);
        tem1 = getDigit(str.substring(n0, n1));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data2");
            return false;
        }
        double data3 = Double.parseDouble(tem1);

        //=============================Previous month participation Rate=========================
        n0 = str.lastIndexOf("month", nbase - 10);
        //  System.out.println(n0);
        if (n0 < 0) {
            displayvfmsg(filename, "NO update-Labor_ORG-UErate4", threadid);
            return false;
        }
        n1 = str.indexOf("</td", n0);
        n0 = str.lastIndexOf("\">", n1);
        tem1 = getDigit(str.substring(n0, n1));

        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data29");
            return false;
        }

        double data39 = Double.parseDouble(tem1);


        // System.out.println(data1+","+data19+"   "+data2+","+data29+"     "+data39+","+data3+"      "+(fullno_1-fullno)+","+(partno_1-partno));

        double td = getSSWR2(data1 - emchg);
        mp.alarmclock.optable.setValueAt("" + td, 0, 6);
        mp.alarmclock.optable.setValueAt("" + data1, 1, 6);
        if (td > 0) {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[17] = "1";
            ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[17] = "1";
        } else if (td < 0) {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[17] = "-1";
            ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[17] = "-1";
        } else {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[17] = "0";
            ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[17] = "0";
        }


        mp.alarmclock.optable.setValueAt("" + emchg + "(f)", 2, 6);

        td = getSSWR1(fullno - fullno_1);
        mp.alarmclock.optable.setValueAt("" + td, 0, 7);
        if (td > 0) {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[18] = "1";
        } else if (td < 0) {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[18] = "-1";
        } else {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[18] = "0";
        }

        td = getSSWR1(partno - partno_1);
        mp.alarmclock.optable.setValueAt("" + td, 0, 8);
        if (td > 0) {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[19] = "1";
        } else if (td < 0) {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[19] = "-1";
        } else {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[19] = "0";
        }


        td = getSSWR2(data3 - data39); //Participation Rate
        mp.alarmclock.optable.setValueAt("" + td, 0, 9);
        mp.alarmclock.optable.setValueAt("" + data3, 1, 9);
        mp.alarmclock.optable.setValueAt("" + data39, 2, 9);
        if (td > 0) {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[20] = "1";
            ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[20] = "1";
        } else if (td < 0) {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[20] = "-1";
            ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[20] = "-1";
        } else {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[20] = "0";
            ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[20] = "0";
        }

        td = getSSWR2(data2 - uemrate); //Unemployment Rate
        mp.alarmclock.optable.setValueAt("" + td, 0, 10);
        mp.alarmclock.optable.setValueAt("" + data2, 1, 10);
        mp.alarmclock.optable.setValueAt("" + uemrate, 2, 10);
        if (td < 0) {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[21] = "1";
            ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[21] = "1";
        } else if (td > 0) {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[21] = "-1";
            ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[21] = "-1";
        } else {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[21] = "0";
            ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[21] = "0";
        }


        return CAD_SubmitSndSP("CAD_Labor_Org", filename, 1, data1, data19, data2, data29, emchg, oneprevious, uemrate,
                               twoprevious, botype, bctype, boffset, wotype, wctype, woffset, fbt, fwt, sbt, swt,
                               quantity, threadid);
    }

    private boolean CADGen(String str, String filename, String betterword, int betterlength, double emchg,
                           double oneprevious, String verifyword, int botype, int bctype, double boffset, int wotype,
                           int wctype, double woffset, double fbt, double fwt, double sbt, double swt, int quantity,
                           int threadid) {

        int n0 = str.indexOf("<tbody");
        int n1 = 0, n = 0;
        String tem1 = "";
        while (n < 4) {
            n0 = str.indexOf("<a", n0 + 1);
            n0 = str.indexOf(">", n0 + 1);
            n1 = str.indexOf("</a", n0 + 1);
            if (n1 < 0 || n0 < 0) {
                displayerrmsg(filename, threadid, n0, n1, "CADGen " + (n + 1) + " try");
                return false;
            }
            tem1 = str.substring(n0, n1).replace(" ", "");
            //   System.out.println(tem1);
            if (tem1.contains(verifyword)) {
                n0 = str.indexOf("</th>", n1 + 1);
                tem1 = str.substring(n1, n0);
                if (tem1.contains(betterword.toLowerCase())) {
                    n1 = str.indexOf("</td>", n0 + 1);
                    String tem = getDigit(str.substring(n0, n1));
                    if (tem.length() <= 0) {
                        displayerrmsg(filename, threadid, n0, n1, "Empty data");
                    }
                    double data = Double.parseDouble(tem);
                    switch (betterlength) {

                    case 10: //GDP
                        return CAD_Submit("CADGDP", filename, 1, data, oneprevious, emchg, oneprevious, botype, bctype,
                                          boffset, wotype, wctype, woffset, fbt, fwt, sbt, swt, quantity, threadid);
                    case 12:
                        displayokmsg(filename, threadid, "Labor is here");
                        return true;


                    }

                    displayerrmsg(filename, threadid, -100, -100, " shouldn't come to this location!");
                    return false;
                }

            }
            n0 = str.indexOf("<tr", n0 + 1);
            n++;
        }
        displayvfmsg(filename, "No Update", threadid);

        return false;

    }

    private boolean AUDGDP(String str, String filename, double emchg, String verifyword, int threadid) {
        int n0 = 0, n1 = 0, n2 = 0;
        String tem1 = "";
        double data = 0, data1 = 0;
        n0 = str.indexOf("</table");
        n0 = str.indexOf("<tr", n0);
        n0 = str.indexOf("</td", n0 + 1);
        n0 = str.indexOf("</td", n0 + 1);
        n1 = str.indexOf("</td", n0 + 1);

        if (n1 < 0 || n0 < 0) {
            System.out.println(n0 + " n0, n1" + n1 + "    AUDGDP verifyword");
            return false;
        }
        tem1 = str.substring(n0, n1);
        //  System.out.println(tem1);

        if (tem1.contains(verifyword)) {
            value1R.setText("V-Word Match-" + ((int) (Math.random() * 10)));
            return false;
        }

        n0 = str.indexOf("<tr", n0 + 1);
        n0 = str.indexOf("<tr", n0 + 1);
        n0 = str.indexOf("<tr", n0 + 1);
        n0 = str.indexOf("<tr", n0 + 1);

        n0 = str.indexOf("</td", n0);
        n0 = str.indexOf("</td", n0 + 1);
        n0 = str.indexOf("</td", n0 + 1);

        n1 = str.lastIndexOf("</", n0 - 1);

        while ((n0 - n1) < 12) //travel to most left "</"
        {
            n0 = n1;
            n1 = str.lastIndexOf("</", n0 - 1);

        }
        n1 = str.lastIndexOf(">", n0 - 1);


        if (n1 < 0 || n0 < 0) {
            System.out.println(n0 + " n0, n1" + n1 + "    AUDGDP data retrieving");
            return false;
        }
        tem1 = getDigit(str.substring(n1, n0));
        if (tem1.length() == 0) {
            System.out.println("Empty  AUDGDP data1 retrieving");
            return false;
        }

        data1 = Double.parseDouble(tem1);
        // data1=Double.parseDouble(getDigit(str.substring(n1, n0)));
        data = getSSWR(data1 - emchg);

        return AUDSubmit(filename, data, data1, emchg, threadid);


    }

    private boolean AUDSubmit(String filename, double data, double data1, double emchg, int threadid) {

        if (!bdata1 && orderpermit.isSelected()) {
            displayokmsg(filename, threadid, " is late, data1=" + data1);
            return true;
        }
        bdata1 = false;

        if (((data) >= 0.6)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(30000, getSSWR(sf.audusd + 0.0010), BUYLMT, AUDUSD); //sell EURUSD
            System.out.println("AUDUSD Buy Order 80,000 Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.audusd));
            displayokmsg(filename, threadid,
                         "AUDUSD Buy Order 80,000 Issuring Time=" +
                         (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                         (sf == null ? "" : sf.audusd));
            value1.setText("+" + data + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(new Color(0, 180, 0));

        } else if (((data) <= -0.6)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(30000, getSSWR(sf.audusd - 0.0010), SELLLMT, AUDUSD); //buy EURUSD
            System.out.println("AUDUSD Sell Order 80,000 Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.audusd));
            displayokmsg(filename, threadid,
                         "AUDUSD Sell Order 80,000 Issuring Time=" +
                         (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                         (sf == null ? "" : sf.audusd));
            value1.setText(data + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(new Color(255, 0, 100));

        } else if (((data) >= 0.3)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(30000, getSSWR(sf.audusd + 0.0010), BUYLMT, AUDUSD); //sell EURUSD
            System.out.println("AUDUSD Buy Order 30,000 Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.audusd));
            displayokmsg(filename, threadid,
                         "AUDUSD Buy Order 30,000 Issuring Time=" +
                         (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                         (sf == null ? "" : sf.audusd));
            value1.setText("+" + data + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(new Color(0, 100, 0));

        } else if (((data) <= -0.3)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(30000, getSSWR(sf.audusd - 0.0010), SELLLMT, AUDUSD); //buy EURUSD
            System.out.println("AUDUSD Sell Order 30,000 Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.audusd));
            displayokmsg(filename, threadid,
                         "AUDUSD Sell Order 30,000 Issuring Time=" +
                         (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                         (sf == null ? "" : sf.audusd));
            value1.setText(data + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(new Color(255, 0, 0));

        } else if (data < 0.3 && data > -0.3) {
            value1.setText((data > 0 ? "+" : "") + data + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(Color.blue);
            System.out.println("AUDGDP Finish Time=" + (new Time(System.currentTimeMillis() + timeoffset)).toString());
            displayokmsg(filename, threadid,
                         "AUDGDP Finish Time=" + (new Time(System.currentTimeMillis() + timeoffset)).toString());
        }
        return true;
    }

    private boolean AUDGDP2(String str, double emchg, double oneprevious, int threadid) {
        int n0 = 0, n1 = 0, n2 = 0;
        String tem1 = "";
        double data = 0, data1 = 0;
        str = removetag(str);

        n0 = str.indexOf("latestabsfigure");
        if (n0 < 0)
            n0 = 0;

        n0 = str.indexOf("%", n0);
        if (n0 < 0)
            n0 = str.indexOf("percent");
        if (n0 < 8) {
            System.out.println("    AUDGDP data retrieving");
            return false;
        }
        tem1 = getDigit(str.substring(n0 - 6, n0));
        if (tem1.length() == 0) {
            System.out.println("\n" + " data1 empty " + (new Time(System.currentTimeMillis() + timeoffset).toString()));
            return false;
        }
        double data11 = Double.parseDouble(tem1);
        if (!(str.substring(n0, n0 + 25)).contains("dec")) //to be replaced
        {
            System.out.println("    AUDGDP data month retrieving");
            return false;
        }
        int sn1 = getSign(str.substring((n0 - 20) < 0 ? 0 : (n0 - 20), n0));


        if (sn1 < 0)
            data1 = 0 - data11;
        else if ((sn1 == 0) && Math.abs(data11) > 0.1) {
            System.out.println("AUDGDP data retrieving not match");
            return false;
        } else
            data1 = data11;

        // System.out.println("?"+sn1+","+data1);

        double data19 = oneprevious;
        double riskfactor = 1;
        n0 = str.indexOf("%", n0 + 1);
        if (n0 < 0)
            n0 = str.indexOf("percent");
        if (n0 < 8) {
            System.out.println("    AUDGDP data2 retrieving");
            riskfactor = 0.85;
        } else {
            tem1 = getDigit(str.substring(n0 - 6, n0));
            if (tem1.length() == 0) {
                System.out.println("\n" + " data1 empty " +
                                   (new Time(System.currentTimeMillis() + timeoffset).toString()));
                riskfactor = 0.85;
                data19 = oneprevious;
            } else
                data19 = Double.parseDouble(tem1); // if no length mean no reliable previous data

            if (!(str.substring(n0, n0 + 25)).contains("sep")) //to be replaced previous quater
            {
                riskfactor = 0.85;
                data19 = oneprevious;
                System.out.println("   no previous month");
            } else {
                int sn3 = getSign(str.substring((n0 - 20) < 0 ? 0 : (n0 - 20), n0));
                if (sn3 < 0)
                    data19 = 1 - data19;
                else if (sn3 == 0)
                    data19 = oneprevious;

            }


        }


        // data1=Double.parseDouble(getDigit(str.substring(n1, n0)));
        data = getSSWR((data1 - emchg + (data19 - oneprevious) * 0.33) * riskfactor);
        data19 = getSSWR(data19);
        // System.out.println("?"+data1+",");

        if (((data) >= 0.6)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(80000, getSSWR(sf.audusd + 0.0010), BUYLMT, AUDUSD); //sell EURUSD
            System.out.println("AUDUSD Buy Order 80,000 Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.audusd));
            value1.setText("+" + data + "(" + data1 + "..." + emchg + ")" + getSSWR(data1 - emchg));
            value1.setForeground(new Color(0, 180, 0));

        } else if (((data) <= -0.6)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(80000, getSSWR(sf.audusd - 0.0010), SELLLMT, AUDUSD); //buy EURUSD
            System.out.println("AUDUSD Sell Order 80,000 Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.audusd));
            value1.setText(data + "(" + data1 + "..." + emchg + ")" + getSSWR(data1 - emchg));
            value1.setForeground(new Color(255, 0, 100));

        } else if (((data) >= 0.3)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(30000, getSSWR(sf.audusd + 0.0010), BUYLMT, AUDUSD); //sell EURUSD
            System.out.println("AUDUSD Buy Order 30,000 Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.audusd));
            value1.setText("+" + data + "(" + data1 + "..." + emchg + ")" + getSSWR(data1 - emchg));
            value1.setForeground(new Color(0, 100, 0));

        } else if (((data) <= -0.3)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(30000, getSSWR(sf.audusd - 0.0010), SELLLMT, AUDUSD); //buy EURUSD
            System.out.println("AUDUSD Sell Order 30,000 Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.audusd));
            value1.setText(data + "(" + data1 + "..." + emchg + ")" + getSSWR(data1 - emchg));
            value1.setForeground(new Color(255, 0, 0));

        } else if (data < 0.3 && data > -0.3) {
            value1.setText((data > 0 ? "+" : "") + data + "(" + data1 + "..." + emchg + ")" + getSSWR(data1 - emchg));
            value1.setForeground(Color.blue);
            System.out.println("AUDGDP Finish Time=" + (new Time(System.currentTimeMillis() + timeoffset)).toString());

        }
        onepreviousF.setText(getSSWR(data19 - oneprevious) + "(" + data19 + "  " + oneprevious + ")");
        onepreviousF.setForeground(data19 >= oneprevious ? new Color(0, 153, 0) : Color.red);

        return true;

    }

    private boolean NZDRate(String str, String filename, String verifyword, double emchg, double oneprevious,
                            int botype, int bctype, double boffset, int wotype, int wctype, double woffset, double fbt,
                            double fwt, double sbt, double swt, int submit, int quantity, int threadid) {
        //System.out.println(str);
        int n0 = 0, n1 = 0;
        String tem2 = "";
        n0 = str.indexOf("<table");
        n0 = str.indexOf("</tr", n0);
        n0 = str.indexOf("</td", n0);
        n1 = str.lastIndexOf("<td", n0 - 1);
        if (n1 < 0 || n0 < 0) {
            System.out.println(n0 + " n0, n1" + n1 + "    NZDRate verifyword");
            return false;
        }
        tem2 = str.substring(n1 + 1, n0);
        if (tem2.contains(verifyword)) {
            value1R.setText("V-Word Match-" + ((int) (Math.random() * 10)));
            return false;
        }


        n0 = str.indexOf("</td", n0);
        n0 = str.indexOf("</td", n0 + 1);
        n0 = str.indexOf("</td", n0 + 1);

        n1 = str.lastIndexOf("/", n0 - 1);
        while ((n0 - n1) < 9) {
            n0 = n1;
            n1 = str.lastIndexOf("</", n0 - 1);

        }
        n1 = str.lastIndexOf(">", n0);
        if (n1 < 0 || n0 < 0) {
            System.out.println(n0 + " n0, n1" + n1 + "    NZDRate data retrieving");
            return false;
        }

        double data1 = Double.parseDouble(getDigit(str.substring(n1 + 1, n0)));

        if (true)
            return submit(submit, "NZDRate", filename, 0, data1, oneprevious, emchg, oneprevious, botype, bctype,
                          boffset, wotype, wctype, woffset, fbt, fwt, sbt, swt, quantity, threadid);


        double data = getSSWR(data1 - emchg);

        if (((data) >= 0.24)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(50000, getSSWR(sf.nzdusd + 0.0010), BUYLMT, NZDUSD); //sell EURUSD
            System.out.println("NZDUSD Buy Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.nzdusd));
            value1.setText("+" + data + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(new Color(0, 153, 0));
            return true;
        } else if (((data) <= -0.24)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(50000, getSSWR(sf.nzdusd - 0.0010), SELLLMT, NZDUSD); //buy EURUSD
            System.out.println("NZDUSD Sell Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.nzdusd));
            value1.setText(data + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(Color.red);
            return true;
        } else if (data < 0.25 && data > -0.25) {
            value1.setText((data > 0 ? "+" : "") + data + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(Color.blue);
            System.out.println("NZDRate Finish Time=" + (new Time(System.currentTimeMillis() + timeoffset)).toString());
            return true;
        }

        return false;

    }

    private boolean NZD_RATE_NEWS(String str, String filename, String verifyword, double emchg, int threadid) {
        int n0 = str.indexOf("</li");
        if (n0 < 0) {
            displayerrmsg(filename, threadid, 0, n0, "Verifyword retrieving");
            return false;
        }
        String tem1 = str.substring(0, n0);
        if (tem1.contains(verifyword)) {
            displayvfmsg(filename, "No update-news", threadid);
            return false;
        } else {
            displayokmsg(filename, threadid, "has a new update");
        }

        return false;
    }

    private boolean NZD_RATE_RSS(String str, String filename, String verifyword, double emchg, int threadid) {
        int n0 = str.indexOf("</dc:date>");
        int n1 = str.lastIndexOf("<dc:date>", n0);
        if (n0 < 0 || n1 < 0) {
            displayerrmsg(filename, threadid, n1, n0, "Verifyword retrieving");
            return false;
        }
        String tem1 = str.substring(n1, n0);
        if (tem1.contains(verifyword)) {
            displayvfmsg(filename, "No update-rss", threadid);
            return false;
        } else {
            displayokmsg(filename, threadid, "has a new update");
        }

        return false;
    }

    private boolean NZD_RATE_ASS(PDDocument pdDoc, String filename, String betterword, String verifyword, double emchg,
                                 int threadid) {
        String tem1 = "";
        try {
            PDFTextStripper pdfStripper = new PDFTextStripper();
            List<PDPage> list = pdDoc.getDocumentCatalog().getAllPages();
            pdfStripper.setStartPage(1);
            pdfStripper.setEndPage(list.size());
            tem1 = pdfStripper.getText(pdDoc).toLowerCase();
            pdDoc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //  System.out.println(tem1);

        if (tem1.contains(verifyword)) {
            displayvfmsg(filename, "No update-ass", threadid);
            return false;
        }

        if (!tem1.contains(betterword)) {
            displayvfmsg(filename, "No betterword found-ass", threadid);
            return false;
        }
        displayokmsg(filename, threadid, "has a new update");
        return true;
    }

    private boolean NZD_RATE_STATE(PDDocument pdDoc, String filename, String betterword, String verifyword,
                                   double emchg, int threadid) {
        String tem1 = "";
        try {
            PDFTextStripper pdfStripper = new PDFTextStripper();
            List<PDPage> list = pdDoc.getDocumentCatalog().getAllPages();
            pdfStripper.setStartPage(1);
            pdfStripper.setEndPage(list.size());
            tem1 = pdfStripper.getText(pdDoc).toLowerCase();
            pdDoc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        tem1 = tem1.substring(0, 3000);
        //System.out.println(tem1);

        if (tem1.contains(verifyword)) {
            displayvfmsg(filename, "No update-Statement", threadid);
            return false;
        }

        if (!tem1.contains(betterword)) {
            displayvfmsg(filename, "No betterword found-Statement", threadid);
            return false;
        }

        displayokmsg(filename, threadid, "has a new update");
        return true;
    }

    private boolean NZD_GDP_Media(String str, String filename, double emchg, double oneprevious, int botype, int bctype,
                                  double boffset, int wotype, int wctype, double woffset, double fbt, double fwt,
                                  double sbt, double swt, int submit, int quantity, int threadid) {
        //System.out.println(str);

        if (true)
            return NZD_GDP_TXT(str, "NZD_GDP_Media", filename, emchg, oneprevious, botype, bctype, boffset, wotype,
                               wctype, woffset, fbt, fwt, sbt, swt, submit, quantity, threadid);


        str = str.replace(" ", "");

        int n0 = str.indexOf("asmeasuredbygrossdomestic");

        int n1 = str.indexOf("monthsof2012");


        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "data string retrieving", str);
            return false;

        }

        String tem2 = str.substring(n0, n1);

        n0 = tem2.indexOf("percent");
        if (n0 < 0) {

            displayerrmsg(filename, threadid, n0, n1, "no percent found", tem2);
            n0 = tem2.indexOf("%");
        }
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "No % found", tem2);

            return false;
        }

        String tem1 = getDigit(tem2.substring(n0 - 5, n0));
        if (tem1.length() < 1) {
            displayerrmsg(filename, threadid, n0, n1, "empty data", tem1);

            return false;
        }

        double data1 = Double.parseDouble(tem1);
        int sign =
            getSign(tem2.substring((n0 - 15) >= 0 ? (n0 - 15) : 0,
                                   (n0 + 15) < (tem2.length() - 1) ? (n0 + 15) : (tem2.length() - 1)));
        if (sign < 0)
            data1 = 0 - data1;
        else if (sign == 0 && Math.abs(data1) > 0.15) // if data1>0, sign should ==1, otherwise some problem occurs
        {
            displayerrmsg(filename, threadid, n0, n1, "data sign retrieving ");
            return false;

        }


        return submit(submit, "NZD_GDP_Media", filename, 0, data1, oneprevious, emchg, oneprevious, botype, bctype,
                      boffset, wotype, wctype, woffset, fbt, fwt, sbt, swt, quantity, threadid);


    }

    private boolean NZDGDP(String str, String filename, double emchg, double oneprevious, int botype, int bctype,
                           double boffset, int wotype, int wctype, double woffset, double fbt, double fwt, double sbt,
                           double swt, int submit, int quantity, int threadid) {
        //System.out.println(str);



        int n0 = str.indexOf("<ul");
        n0 = str.indexOf("<li", n0 + 1);
        int n1 = str.indexOf("</li", n0 + 1);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "data string retrieving");
            return false;

        }

        String tem2 = str.substring(n0, n1);


        n0 = tem2.indexOf("percent");
        if (n0 < 0)
            n0 = tem2.indexOf("%");
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "not percent found", tem2);
            return false;
        }

        String tem1 = getDigit(tem2.substring(n0 - 5, n0));
        if (tem1.length() < 1) {
            displayerrmsg(filename, threadid, n0, n1, "empty data", tem1);
            return false;
        }

        double data1 = Double.parseDouble(tem1);
        int sign =
            getSign(tem2.substring((n0 - 15) >= 0 ? (n0 - 15) : 0,
                                   (n0 + 15) < (tem2.length() - 1) ? (n0 + 15) : (tem2.length() - 1)));
        if (sign < 0)
            data1 = 0 - data1;
        else if (sign == 0 && Math.abs(data1) > 0.15) // if data1>0, sign should ==1, otherwise some problem occurs
        {
            displayerrmsg(filename, threadid, n0, n1, "data sign retrieving ", tem2);
            return false;

        }


        return submit(submit, "NZD_GDP", filename, 0, data1, oneprevious, emchg, oneprevious, botype, bctype, boffset,
                      wotype, wctype, woffset, fbt, fwt, sbt, swt, quantity, threadid);


    }

    private boolean NZDE_IndicatorRSS(String str, String filename, String verifyword, int indicatorno, double emchg,
                                      double oneprevious, int botype, int bctype, double boffset, int wotype,
                                      int wctype, double woffset, double fbt, double fwt, double sbt, double swt,
                                      int submit, int quantity, int threadid) {


        int n0 = 0, n1 = 0, n3 = 0, n4 = 0, sign = 0;
        String tem2 = "", tem3 = "";
        n0 = str.indexOf("<item>");
        n3 = str.indexOf("<pubdate>", n0 + 1);
        n4 = str.indexOf("</pubdate>", n3 + 1);
        if (n3 < 0 || n4 < 0) {
            displayerrmsg(filename, threadid, n3, n4, "Verify date retrieving");
            return false;
        }


        tem3 = (str.substring(n3, n4)); //.replace(" ", "");
        if (tem3.contains(verifyword)) {
            displayvfmsg(filename, indicatorno == 100 ? "No update-All" : "No update-EC", threadid);
            return false;
        }

        n0 = str.indexOf("<item>");
        n0 = str.indexOf("<title", n0 + 1);
        n1 = str.indexOf("</title", n0 + 3);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, n0 + " n0, n1 " + n1 + " data retrieving1", str);
            return false;
        }
        String tem1 = str.substring(n0, n1).replace(" ", "");

        n0 = str.indexOf("<description", n1 + 1);
        n1 = str.indexOf("</description", n0 + 3);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, n0 + " n0, n1 " + n1 + " data retrieving2", str);
            return false;
        }
        String des = str.substring(n0, n1);

        double data1 = -1;

        switch (indicatorno) {
        case 0: //GDP,from econ.rss
            return NZD_GDP_TXT(des, "NZD_GDP_E_Indicator", filename, emchg, oneprevious, botype, bctype, boffset,
                               wotype, wctype, woffset, fbt, fwt, sbt, swt, submit, quantity, threadid);
        case 1: //Labor
            break;
        case 2: //CPI,from econ.rss, all item cpi or core cpi?
            n0 = tem1.indexOf("percent");
            if (n0 < 0) {
                displayerrmsg(filename, threadid, n0, -99, "Percent retrieving");
                return false;
            }
            tem2 = tem1.substring(0, n0);
            sign = getSign(tem2);
            tem2 = getDigit(tem2);
            if (tem2.length() <= 0) {
                displayerrmsg(filename, threadid, n0, -99, "Empty data1");
                return false;
            }
            data1 = Double.parseDouble(tem2);
            if (sign < 0)
                data1 = 0 - data1;
            return submit(submit, "NZD_CPI_E_RSS", filename, 0, data1, oneprevious, emchg, oneprevious, botype, bctype,
                          boffset, wotype, wctype, woffset, fbt, fwt, sbt, swt, quantity, threadid);

        case 3: //Retail
            break;
        case 4: // Trade Balance
            break;
        }

        return false;

    }

    private boolean NZD_GDP_TXT(String str, String name, String filename, double emchg, double oneprevious, int botype,
                                int bctype, double boffset, int wotype, int wctype, double woffset, double fbt,
                                double fwt, double sbt, double swt, int submit, int quantity, int threadid) {
        str = str.replace(" ", "");

        int n0 = str.indexOf("asmeasuredbygrossdomestic");

        int n1 = str.indexOf("monthsof2012");


        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "data string retrieving", str);
            return false;

        }

        String tem2 = str.substring(n0, n1);

        n0 = tem2.indexOf("percent");
        if (n0 < 0) {

            displayerrmsg(filename, threadid, n0, n1, "no percent found", tem2);
            n0 = tem2.indexOf("%");
        }
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "No % found", tem2);

            return false;
        }

        String tem1 = getDigit(tem2.substring(n0 - 5, n0));
        if (tem1.length() < 1) {
            displayerrmsg(filename, threadid, n0, n1, "empty data", tem1);

            return false;
        }

        double data1 = Double.parseDouble(tem1);
        int sign =
            getSign(tem2.substring((n0 - 15) >= 0 ? (n0 - 15) : 0,
                                   (n0 + 15) < (tem2.length() - 1) ? (n0 + 15) : (tem2.length() - 1)));
        if (sign < 0)
            data1 = 0 - data1;
        else if (sign == 0 && Math.abs(data1) > 0.15) // if data1>0, sign should ==1, otherwise some problem occurs
        {
            displayerrmsg(filename, threadid, n0, n1, "data sign retrieving ");
            return false;

        }


        return submit(submit, name, filename, 0, data1, oneprevious, emchg, oneprevious, botype, bctype, boffset,
                      wotype, wctype, woffset, fbt, fwt, sbt, swt, quantity, threadid);


    }

    private void factorysubmit(int id, double data) {

    }

    private boolean F1(String str, String filename, int threadid) {
        //  System.out.println(str);//.length()+" <1> "+threadid);
        if (str.trim().length() <= 50) {
            displayvfmsg(filename, "N.U-F", threadid);
            return false;
        }
        int n0 = str.indexOf(":");
        int n1 = str.indexOf("[^]");
        String tem1 = getDigit(str.substring(n0, n1));
        if (tem1 == null || tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1", str);
            return false;
        }
        double data1 = Double.parseDouble(tem1);
        FResult[1] = data1;

        n0 = str.indexOf("]]");
        tem1 = str.substring(n1, n0);
        if (tem1 == null || tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1", str);
            return false;
        }

        if (tem1.contains("better")) {
            actualStatus[1] = 1;
        } else if (tem1.contains("worse")) {
            actualStatus[1] = -1;
        } else {
            actualStatus[1] = 0;
        }

        fxalarmclocks[1] = true;
        System.out.println("1-" + data1);
        return true;
    }

    private boolean F2(String str, String filename, int threadid) {
        // System.out.println(str);//.length()+" <2> "+threadid);
        if (str.trim().length() <= 50) {
            displayvfmsg(filename, "N.U-F", threadid);
            return false;
        }
        int n0 = str.indexOf(":");
        int n1 = str.indexOf("[^]");
        String tem1 = getDigit(str.substring(n0, n1));
        if (tem1 == null || tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1", str);
            return false;
        }
        double data1 = Double.parseDouble(tem1);
        FResult[2] = data1;

        n0 = str.indexOf("]]");
        tem1 = str.substring(n1, n0);
        if (tem1 == null || tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1", str);
            return false;
        }

        if (tem1.contains("better")) {
            actualStatus[2] = 1;
        } else if (tem1.contains("worse")) {
            actualStatus[2] = -1;
        } else {
            actualStatus[2] = 0;
        }
        fxalarmclocks[2] = true;
        System.out.println("2-" + data1);
        return true;
    }

    private boolean F3(String str, String filename, int threadid) {
        // System.out.println(str.length()+" <3> "+threadid);
        if (str.trim().length() <= 50) {
            displayvfmsg(filename, "N.U-F", threadid);
            return false;
        }
        int n0 = str.indexOf(":");
        int n1 = str.indexOf("[^]");
        String tem1 = getDigit(str.substring(n0, n1));
        if (tem1 == null || tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1", str);
            return false;
        }
        double data1 = Double.parseDouble(tem1);
        FResult[3] = data1;

        n0 = str.indexOf("]]");
        tem1 = str.substring(n1, n0);
        if (tem1 == null || tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1", str);
            return false;
        }

        if (tem1.contains("better")) {
            actualStatus[3] = 1;
        } else if (tem1.contains("worse")) {
            actualStatus[3] = -1;
        } else {
            actualStatus[3] = 0;
        }
        fxalarmclocks[3] = true;
        System.out.println("3-" + data1);
        return true;
    }

    private boolean F4(String str, String filename, int threadid) {
        //  System.out.println(str.length()+" <4> "+threadid);
        if (str.trim().length() <= 50) {
            displayvfmsg(filename, "N.U-F", threadid);
            return false;
        }
        int n0 = str.indexOf(":");
        int n1 = str.indexOf("[^]");
        String tem1 = getDigit(str.substring(n0, n1));
        if (tem1 == null || tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1", str);
            return false;
        }
        double data1 = Double.parseDouble(tem1);
        FResult[4] = data1;

        n0 = str.indexOf("]]");
        tem1 = str.substring(n1, n0);
        if (tem1 == null || tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1", str);
            return false;
        }

        if (tem1.contains("better")) {
            actualStatus[4] = 1;
        } else if (tem1.contains("worse")) {
            actualStatus[4] = -1;
        } else {
            actualStatus[4] = 0;
        }
        fxalarmclocks[4] = true;
        //  System.out.println(data1);
        return true;
    }

    private boolean F5(String str, String filename, int threadid) {
        //   System.out.println(str.length()+" <5> "+threadid);
        if (str.trim().length() <= 50) {
            displayvfmsg(filename, "N.U-F", threadid);
            return false;
        }
        int n0 = str.indexOf(":");
        int n1 = str.indexOf("[^]");
        String tem1 = getDigit(str.substring(n0, n1));
        if (tem1 == null || tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1", str);
            return false;
        }
        double data1 = Double.parseDouble(tem1);
        FResult[5] = data1;

        n0 = str.indexOf("]]");
        tem1 = str.substring(n1, n0);
        if (tem1 == null || tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1", str);
            return false;
        }

        if (tem1.contains("better")) {
            actualStatus[5] = 1;
        } else if (tem1.contains("worse")) {
            actualStatus[5] = -1;
        } else {
            actualStatus[5] = 0;
        }
        fxalarmclocks[5] = true;
        //  System.out.println(data1);
        return true;
    }

    private boolean F6(String str, String filename, int threadid) {
        //   System.out.println(str.length()+" "+threadid);
        if (str.trim().length() <= 50) {
            displayvfmsg(filename, "N.U-F", threadid);
            return false;
        }
        int n0 = str.indexOf(":");
        int n1 = str.indexOf("[^]");
        String tem1 = getDigit(str.substring(n0, n1));
        if (tem1 == null || tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1", str);
            return false;
        }
        double data1 = Double.parseDouble(tem1);
        FResult[6] = data1;

        n0 = str.indexOf("]]");
        tem1 = str.substring(n1, n0);
        if (tem1 == null || tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1", str);
            return false;
        }

        if (tem1.contains("better")) {
            actualStatus[6] = 1;
        } else if (tem1.contains("worse")) {
            actualStatus[6] = -1;
        } else {
            actualStatus[6] = 0;
        }
        fxalarmclocks[6] = true;
        //  System.out.println(data1);
        return true;
    }

    private boolean F7(String str, String filename, int threadid) {
        //   System.out.println(str.length()+" "+threadid);
        if (str.trim().length() <= 50) {
            displayvfmsg(filename, "N.U-F", threadid);
            return false;
        }
        int n0 = str.indexOf(":");
        int n1 = str.indexOf("[^]");
        String tem1 = getDigit(str.substring(n0, n1));
        if (tem1 == null || tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1", str);
            return false;
        }
        double data1 = Double.parseDouble(tem1);
        FResult[7] = data1;

        n0 = str.indexOf("]]");
        tem1 = str.substring(n1, n0);
        if (tem1 == null || tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1", str);
            return false;
        }

        if (tem1.contains("better")) {
            actualStatus[7] = 1;
        } else if (tem1.contains("worse")) {
            actualStatus[7] = -1;
        } else {
            actualStatus[7] = 0;
        }
        fxalarmclocks[7] = true;
        //  System.out.println(data1);
        return true;
    }

    private boolean F8(String str, String filename, int threadid) {
        //   System.out.println(str.length()+" "+threadid);
        if (str.trim().length() <= 50) {
            displayvfmsg(filename, "N.U-F", threadid);
            return false;
        }
        int n0 = str.indexOf(":");
        int n1 = str.indexOf("[^]");
        String tem1 = getDigit(str.substring(n0, n1));
        if (tem1 == null || tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1", str);
            return false;
        }
        double data1 = Double.parseDouble(tem1);
        FResult[8] = data1;

        n0 = str.indexOf("]]");
        tem1 = str.substring(n1, n0);
        if (tem1 == null || tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1", str);
            return false;
        }

        if (tem1.contains("better")) {
            actualStatus[8] = 1;
        } else if (tem1.contains("worse")) {
            actualStatus[8] = -1;
        } else {
            actualStatus[8] = 0;
        }
        fxalarmclocks[8] = true;
        //  System.out.println(data1);
        return true;
    }

    private boolean F9(String str, String filename, int threadid) {
        //   System.out.println(str.length()+" "+threadid);
        if (str.trim().length() <= 50) {
            displayvfmsg(filename, "N.U-F", threadid);
            return false;
        }
        int n0 = str.indexOf(":");
        int n1 = str.indexOf("[^]");
        String tem1 = getDigit(str.substring(n0, n1));
        if (tem1 == null || tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1", str);
            return false;
        }
        double data1 = Double.parseDouble(tem1);
        FResult[9] = data1;

        n0 = str.indexOf("]]");
        tem1 = str.substring(n1, n0);
        if (tem1 == null || tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1", str);
            return false;
        }

        if (tem1.contains("better")) {
            actualStatus[9] = 1;
        } else if (tem1.contains("worse")) {
            actualStatus[9] = -1;
        } else {
            actualStatus[9] = 0;
        }
        fxalarmclocks[9] = true;
        //  System.out.println(data1);
        return true;
    }

    private boolean F10(String str, String filename, int threadid) {
        //  System.out.println(str.length()+" "+threadid);
        if (str.trim().length() <= 50) {
            displayvfmsg(filename, "N.U-F", threadid);
            return false;
        }
        int n0 = str.indexOf(":");
        int n1 = str.indexOf("[^]");
        String tem1 = getDigit(str.substring(n0, n1));
        if (tem1 == null || tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1", str);
            return false;
        }
        double data1 = Double.parseDouble(tem1);
        FResult[10] = data1;

        n0 = str.indexOf("]]");
        tem1 = str.substring(n1, n0);
        if (tem1 == null || tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1", str);
            return false;
        }

        if (tem1.contains("better")) {
            actualStatus[10] = 1;
        } else if (tem1.contains("worse")) {
            actualStatus[10] = -1;
        } else {
            actualStatus[10] = 0;
        }
        fxalarmclocks[10] = true;
        //  System.out.println(data1);
        return true;
    }

    private boolean F11(String str, String filename, int threadid) {
        // System.out.println(str.length()+" "+threadid);
        if (str.trim().length() <= 50) {
            displayvfmsg(filename, "N.U-F", threadid);
            return false;
        }
        int n0 = str.indexOf(":");
        int n1 = str.indexOf("[^]");
        String tem1 = getDigit(str.substring(n0, n1));
        if (tem1 == null || tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1", str);
            return false;
        }
        double data1 = Double.parseDouble(tem1);
        FResult[11] = data1;

        n0 = str.indexOf("]]");
        tem1 = str.substring(n1, n0);
        if (tem1 == null || tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1", str);
            return false;
        }

        if (tem1.contains("better")) {
            actualStatus[11] = 1;
        } else if (tem1.contains("worse")) {
            actualStatus[11] = -1;
        } else {
            actualStatus[11] = 0;
        }
        fxalarmclocks[11] = true;
        System.out.println(data1);
        return true;
    }

    private boolean US10YBOND(String str, String filename, int threadid) {
        // System.out.println(str);

        int n0 = str.indexOf("<last>");
        int n1 = str.indexOf("</last>", n0);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, n0 + " n0, n1 " + n1 + "    US10YBOND");
            return true;
        }
        String tem1 = getDigit(str.substring(n0, n1));
        if (tem1 == null || tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1", str);
            return true;
        }

        double y = Double.parseDouble(tem1);

        n0 = str.indexOf("<last_time>", n1 + 2);
        n1 = str.indexOf("</last_time>", n0 + 1);

        if (n0 < 0 || n1 < 0) {
            tem1 = "NA";
        } else if ((n0 + 19) <= (n1 - 9))
            tem1 = str.substring(n0 + 19, n1 - 9).replace("t", "-");

        n0 = str.indexOf("<change>", n1 + 2);
        n1 = str.indexOf("</change>", n0 + 1);
        String tem2 = getDigit(str.substring(n0, n1));

        //   System.out.println(y+","+tem1);
        if (mp != null && mp.alarmclock != null) {
            if (y > mp.alarmclock.preYield) {
                mp.alarmclock.result.setForeground(new Color(0, 153, 0));
            } else if (y < mp.alarmclock.preYield) {
                mp.alarmclock.result.setForeground(new Color(255, 0, 0));
            }
            mp.alarmclock.result.setText("" + getSSWR3(y));
            mp.alarmclock.preYield = y;
            mp.alarmclock.result.setToolTipText(tem2 + "--US10Y Bond at " + tem1 + "(" +
                                                (new Time(System.currentTimeMillis())).toString() + ")");
        }


        return true;
    }

    private boolean JP10YBOND(String str, String filename, int threadid) {
        // System.out.println(str);
        //
        int n0 = str.indexOf("<last>");
        int n1 = str.indexOf("</last>", n0);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, n0 + " n0, n1 " + n1 + "    JP10YBOND");
            return true;
        }
        String tem1 = getDigit(str.substring(n0, n1));
        if (tem1 == null || tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1", str);
            return true;
        }

        double y = Double.parseDouble(tem1);

        n0 = str.indexOf("<last_time>", n1 + 2);
        n1 = str.indexOf("</last_time>", n0 + 1);
        if (n0 < 0 || n1 < 0) {
            tem1 = "NA";
        } else if ((n0 + 19) <= (n1 - 9))
            tem1 = str.substring(n0 + 19, n1 - 9).replace("t", "-");

        n0 = str.indexOf("<change>", n1 + 2);
        n1 = str.indexOf("</change>", n0 + 1);
        String tem2 = getDigit(str.substring(n0, n1));
        //  System.out.println(y+","+tem1);

        if (mp != null && mp.alarmclock != null) {
            if (y > mp.alarmclock.prejpyY) {
                mp.alarmclock.jpyYield.setForeground(new Color(0, 153, 0));
            } else if (y < mp.alarmclock.prejpyY) {
                mp.alarmclock.jpyYield.setForeground(new Color(255, 0, 0));
            }
            mp.alarmclock.jpyYield.setText("" + getSSWR3(y));
            mp.alarmclock.prejpyY = y;
            mp.alarmclock.jpyYield.setToolTipText(tem2 + "(" + getSSWR1((mp.alarmclock.preYield - y) * 100) + ") at " +
                                                  tem1 + "(" + (new Time(System.currentTimeMillis())).toString() + ")");
        }


        return true;
    }

    private boolean CA10YBOND(String str, String filename, int threadid) {
        // System.out.println(str);

        int n0 = str.indexOf("<last>");
        int n1 = str.indexOf("</last>", n0);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, n0 + " n0, n1 " + n1 + "    CA10YBOND");
            return true;
        }
        String tem1 = getDigit(str.substring(n0, n1));
        if (tem1 == null || tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1", str);
            return true;
        }

        double y = Double.parseDouble(tem1);

        n0 = str.indexOf("<last_time>", n1 + 2);
        n1 = str.indexOf("</last_time>", n0 + 1);

        if (n0 < 0 || n1 < 0) {
            tem1 = "NA";
        } else if ((n0 + 19) <= (n1 - 9))
            tem1 = str.substring(n0 + 19, n1 - 9).replace("t", "-");

        n0 = str.indexOf("<change>", n1 + 2);
        n1 = str.indexOf("</change>", n0 + 1);
        String tem2 = getDigit(str.substring(n0, n1));


        // System.out.println(y+","+tem1);
        if (mp != null && mp.alarmclock != null) {
            if (y > mp.alarmclock.precadY) {
                mp.alarmclock.cadYield.setForeground(new Color(0, 153, 0));
            } else if (y < mp.alarmclock.precadY) {
                mp.alarmclock.cadYield.setForeground(new Color(255, 0, 0));
            }
            mp.alarmclock.cadYield.setText("" + getSSWR3(y));
            mp.alarmclock.precadY = y;
            mp.alarmclock.cadYield.setToolTipText(tem2 + "(" + getSSWR1((mp.alarmclock.preYield - y) * 100) + ") at " +
                                                  tem1 + "(" + (new Time(System.currentTimeMillis())).toString() + ")");
        }


        return true;
    }

    private boolean ALL10YBOND(String str, String filename, int threadid) {
        // System.out.println(str+"\n");

        //  if(true)
        //   return true;

        int n0 = str.indexOf("states</td>");
        int n1 = str.indexOf("<td", n0);
        n0 = str.indexOf("<td", n1 + 2);
        n1 = str.indexOf("%</td>", n0 + 1);

        //  System.out.println(n0+",  "+n1);

        String tem1 = getDigit(str.substring(n0, n1));
        if (tem1 == null || tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1", str);
            return false;
        }

        double y = Double.parseDouble(tem1);


        n0 = str.indexOf("time", n1 + 2);
        n1 = str.indexOf("</td>", n0 + 1);
        tem1 = str.substring(n0 + 6, n1);

        //   System.out.println(y+","+tem1);
        if (mp != null && mp.alarmclock != null) {
            if (y > mp.alarmclock.preYield) {
                mp.alarmclock.result.setForeground(new Color(0, 153, 0));
            } else if (y < mp.alarmclock.preYield) {
                mp.alarmclock.result.setForeground(new Color(255, 0, 0));
            }
            mp.alarmclock.result.setText("" + y);
            mp.alarmclock.preYield = y;
            mp.alarmclock.result.setToolTipText("US10YBond-Last updated at " + tem1);
        }


        n0 = str.indexOf("canada</td>", n1);
        n1 = str.indexOf("<td", n0);
        n0 = str.indexOf("<td", n1 + 2);
        n1 = str.indexOf("%</td>", n0 + 1);

        tem1 = getDigit(str.substring(n0, n1));
        if (tem1 == null || tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1", str);
            return false;
        }

        y = Double.parseDouble(tem1);


        n0 = str.indexOf("time", n1 + 2);
        n1 = str.indexOf("</td>", n0 + 1);
        tem1 = str.substring(n0 + 6, n1);

        if (mp != null && mp.alarmclock != null) {
            if (y > mp.alarmclock.precadY) {
                mp.alarmclock.cadYield.setForeground(new Color(0, 153, 0));
            } else if (y < mp.alarmclock.precadY) {
                mp.alarmclock.cadYield.setForeground(new Color(255, 0, 0));
            }
            mp.alarmclock.cadYield.setText("" + y);
            mp.alarmclock.precadY = y;
            mp.alarmclock.cadYield.setToolTipText("CA10YBond-Last updated at " + tem1);
        }


        n0 = str.indexOf("japan</td>", n1);
        n1 = str.indexOf("<td", n0);
        n0 = str.indexOf("<td", n1 + 2);
        n1 = str.indexOf("%</td>", n0 + 1);

        tem1 = getDigit(str.substring(n0, n1));
        if (tem1 == null || tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1", str);
            return false;
        }

        y = Double.parseDouble(tem1);


        n0 = str.indexOf("time", n1 + 2);
        n1 = str.indexOf("</td>", n0 + 1);
        tem1 = str.substring(n0 + 6, n1);

        if (mp != null && mp.alarmclock != null) {
            if (y > mp.alarmclock.prejpyY) {
                mp.alarmclock.jpyYield.setForeground(new Color(0, 153, 0));
            } else if (y < mp.alarmclock.prejpyY) {
                mp.alarmclock.jpyYield.setForeground(new Color(255, 0, 0));
            }
            mp.alarmclock.jpyYield.setText("" + y);
            mp.alarmclock.prejpyY = y;
            mp.alarmclock.jpyYield.setToolTipText("JPY10YBond-Last updated at " + tem1);
        }


        return false;
    }

    private boolean F1(String str, String filename, String verifyword, double emchg, double oneprevious, double emrate,
                       double twoprevious, int botype, int bctype, double boffset, int wotype, int wctype,
                       double woffset, double fbt, double fwt, double sbt, double swt, int submit, int quantity,
                       int[] gassign, int threadid) {
        if (str.trim().length() <= 19) {
            displayvfmsg(filename, "N.U-F", threadid);
            return false;
        }
        int n0 = str.indexOf(":");
        int n1 = str.indexOf("[^]");
        String tem1 = getDigit(str.substring(n0, n1));
        if (tem1 == null || tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1", str);
            return false;
        }
        double data1 = Double.parseDouble(tem1);

        tem1 = getDigit(str.substring(18, n0));
        int id = Math.abs(Integer.parseInt(tem1));

        if (g_a_status[0] && Math.abs(data1 - gdata[0]) > 0.001) { // data1 not match
            displayerrmsg(filename, threadid, -100, -100, data1 + ",data not match", str);
        } else {
            gdata[0] = data1;
            g_a_status[0] = true;

            if (g_a_status[3] && g_a_status[2] &&
                g_a_status[1]) { //data29,data19,data2 is also available
                return submit(submit, "Fid=" + id, filename, 1, gdata[0], gdata[1], gdata[2], gdata[3], emchg,
                              oneprevious, emrate, twoprevious, botype, bctype, boffset, wotype, wctype, woffset, fbt,
                              fwt, sbt, swt, quantity, threadid);
            } else if (g_a_status[1] &&
                       gassign[5] ==
      2) { // data
                return submit(submit, "Fid=" + id, filename, 1, gdata[0], gdata[1], emchg, oneprevious, botype, bctype,
                              boffset, wotype, wctype, woffset, fbt, fwt, sbt, swt, quantity, threadid);
            } else if (g_a_status[3] &&
                       g_a_status[2]) { //data29,data2 is also available
                return submit(submit, "Fid=" + id, filename, 0, gdata[0], oneprevious, gdata[2], gdata[3], emchg,
                              oneprevious, emrate, twoprevious, botype, bctype, boffset, wotype, wctype, woffset, fbt,
                              fwt, sbt, swt, quantity, threadid);
            } else if (g_a_status[1] &&
                       g_a_status[2]) { //data19,data2 is also available
                return submit(submit, "Fid=" + id, filename, 0, gdata[0], gdata[1], gdata[2], twoprevious, emchg,
                              oneprevious, emrate, twoprevious, botype, bctype, boffset, wotype, wctype, woffset, fbt,
                              fwt, sbt, swt, quantity, threadid);
            } else if (g_a_status[2]) { //data2 is also available
                return submit(submit, "Fid=" + id, filename, 0, gdata[0], oneprevious, gdata[2], twoprevious, emchg,
                              oneprevious, emrate, twoprevious, botype, bctype, boffset, wotype, wctype, woffset, fbt,
                              fwt, sbt, swt, quantity, threadid);
            } else if (gassign[5] == 2) {
                return submit(submit, "Fid=" + id, filename, 0, gdata[0], oneprevious, emchg, oneprevious, botype,
                              bctype, boffset, wotype, wctype, woffset, fbt, fwt, sbt, swt, quantity, threadid);
            } else if ((gdata[0] - emchg) >= (1.5 * fbt) ||
                       (gdata[0] - emchg) <=
                       (1.5 * (0 - fwt))) { // if first data exceed 1.5 time of target,submit it even if data2 is not available, only F1 has this power
                return submit(submit, "Fid=" + id, filename, 0, gdata[0], oneprevious, emchg, oneprevious, botype,
                              bctype, boffset, wotype, wctype, woffset, fbt, fwt, sbt, swt, quantity, threadid);
            } else {
                displayvfmsg(filename, data1 + "Y,N-E-D,id=" + id, threadid);
                return true;
            }
        }
        return false;
    }

    private boolean F19(String str, String filename, String verifyword, double emchg, double oneprevious, double emrate,
                        double twoprevious, int botype, int bctype, double boffset, int wotype, int wctype,
                        double woffset, double fbt, double fwt, double sbt, double swt, int submit, int quantity,
                        int[] gassign, int threadid) {
        if (str.trim().length() <= 19) {
            displayvfmsg(filename, "N.U-F19", threadid);
            return false;
        }
        int n0 = str.indexOf(":");
        int n1 = str.indexOf("[^]");
        String tem1 = getDigit(str.substring(n0, n1));
        if (tem1 == null || tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1", str);
            return false;
        }
        double data1 = Double.parseDouble(tem1);

        tem1 = getDigit(str.substring(18, n0));
        int id = Math.abs(Integer.parseInt(tem1));

        if (g_a_status[1] && Math.abs(data1 - gdata[1]) > 0.001) { // data1 not match
            displayerrmsg(filename, threadid, -100, -100, data1 + ",data not match", str);
        } else {
            gdata[1] = data1;
            g_a_status[1] = true;
            if (g_a_status[3] && g_a_status[2] &&
                g_a_status[0]) { //data29,data19,data2 is also available
                return submit(submit, "Factory id=" + id, filename, 1, gdata[0], gdata[1], gdata[2], gdata[3], emchg,
                              oneprevious, emrate, twoprevious, botype, bctype, boffset, wotype, wctype, woffset, fbt,
                              fwt, sbt, swt, quantity, threadid);
            } else if (g_a_status[0] && gassign[5] == 2) {
                return submit(submit, "Factory id=" + id, filename, 1, gdata[0], gdata[1], emchg, oneprevious, botype,
                              bctype, boffset, wotype, wctype, woffset, fbt, fwt, sbt, swt, quantity, threadid);
            } else if (g_a_status[0] &&
                       g_a_status[2]) { //data19,data2 is also available
                return submit(submit, "Factory id=" + id, filename, 0, gdata[0], gdata[1], gdata[2], twoprevious, emchg,
                              oneprevious, emrate, twoprevious, botype, bctype, boffset, wotype, wctype, woffset, fbt,
                              fwt, sbt, swt, quantity, threadid);
            } else {
                displayvfmsg(filename, data1 + "Y,N-E-D,id=" + id, threadid);
                return true;
            }
        }
        return false;

    }

    private boolean F2(String str, String filename, String verifyword, double emchg, double oneprevious, double emrate,
                       double twoprevious, int botype, int bctype, double boffset, int wotype, int wctype,
                       double woffset, double fbt, double fwt, double sbt, double swt, int submit, int quantity,
                       int threadid) {
        if (str.trim().length() <= 19) {
            displayvfmsg(filename, "N.U-F2", threadid);
            return false;
        }
        int n0 = str.indexOf(":");
        int n1 = str.indexOf("[^]");
        String tem1 = getDigit(str.substring(n0, n1));
        if (tem1 == null || tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1", str);
            return false;
        }
        double data1 = Double.parseDouble(tem1);

        tem1 = getDigit(str.substring(18, n0));
        int id = Math.abs(Integer.parseInt(tem1));

        if (g_a_status[2] && Math.abs(data1 - gdata[2]) > 0.001) { // data1 not match
            displayerrmsg(filename, threadid, -100, -100, data1 + ",data not match", str);
        } else {
            gdata[2] = data1;
            g_a_status[2] = true;
            if (g_a_status[3] && g_a_status[0] &&
                g_a_status[1]) { //data29,data19,data2 is also available
                return submit(submit, "Factory id=" + id, filename, 1, gdata[0], gdata[1], gdata[2], gdata[3], emchg,
                              oneprevious, emrate, twoprevious, botype, bctype, boffset, wotype, wctype, woffset, fbt,
                              fwt, sbt, swt, quantity, threadid);
            } else if (g_a_status[3] &&
                       g_a_status[0]) { //data29,data2 is also available
                return submit(submit, "Factory id=" + id, filename, 0, gdata[0], oneprevious, gdata[2], gdata[3], emchg,
                              oneprevious, emrate, twoprevious, botype, bctype, boffset, wotype, wctype, woffset, fbt,
                              fwt, sbt, swt, quantity, threadid);
            } else if (g_a_status[1] &&
                       g_a_status[0]) { //data19,data2 is also available
                return submit(submit, "Factory id=" + id, filename, 0, gdata[0], gdata[1], gdata[2], twoprevious, emchg,
                              oneprevious, emrate, twoprevious, botype, bctype, boffset, wotype, wctype, woffset, fbt,
                              fwt, sbt, swt, quantity, threadid);
            } else if (g_a_status[0]) { //data2 is also available
                return submit(submit, "Factory id=" + id, filename, 0, gdata[0], oneprevious, gdata[2], twoprevious,
                              emchg, oneprevious, emrate, twoprevious, botype, bctype, boffset, wotype, wctype, woffset,
                              fbt, fwt, sbt, swt, quantity, threadid);
            } else {
                displayvfmsg(filename, data1 + "Y,N-E-D,id==" + id, threadid);
                return true;
            }
        }
        return false;

    }

    private boolean F29(String str, String filename, String verifyword, double emchg, double oneprevious, double emrate,
                        double twoprevious, int botype, int bctype, double boffset, int wotype, int wctype,
                        double woffset, double fbt, double fwt, double sbt, double swt, int submit, int quantity,
                        int threadid) {
        if (str.trim().length() <= 19) {
            displayvfmsg(filename, "N.U-F29", threadid);
            return false;
        }
        int n0 = str.indexOf(":");
        int n1 = str.indexOf("[^]");
        String tem1 = getDigit(str.substring(n0, n1));
        if (tem1 == null || tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1", str);
            return false;
        }
        double data1 = Double.parseDouble(tem1);

        tem1 = getDigit(str.substring(18, n0));
        int id = Math.abs(Integer.parseInt(tem1));

        if (g_a_status[3] && Math.abs(data1 - gdata[3]) > 0.001) { // data1 not match
            displayerrmsg(filename, threadid, -100, -100, data1 + ",data not match", str);
        } else {
            gdata[3] = data1;
            g_a_status[3] = true;
            if (g_a_status[2] && g_a_status[0] &&
                g_a_status[1]) { //data29,data19,data2 is also available
                return submit(submit, "Factory id=" + id, filename, 1, gdata[0], gdata[1], gdata[2], gdata[3], emchg,
                              oneprevious, emrate, twoprevious, botype, bctype, boffset, wotype, wctype, woffset, fbt,
                              fwt, sbt, swt, quantity, threadid);
            } else if (g_a_status[2] &&
                       g_a_status[0]) { //data29,data2 is also available
                return submit(submit, "Factory id=" + id, filename, 0, gdata[0], oneprevious, gdata[2], twoprevious,
                              emchg, oneprevious, emrate, twoprevious, botype, bctype, boffset, wotype, wctype, woffset,
                              fbt, fwt, sbt, swt, quantity, threadid);
            } else {
                displayvfmsg(filename, data1 + "Y,N-E-D,id=" + id, threadid);
                return true;
            }
        }
        return false;
    }

    private boolean Factory(String str, String filename, String verifyword, int indicatorno, double emchg,
                            double oneprevious, int botype, int bctype, double boffset, int wotype, int wctype,
                            double woffset, double fbt, double fwt, double sbt, double swt, int submit, int quantity,
                            int[] gassign, int threadid) {
        System.out.println(str);
        if (str.trim().length() <= 19) {
            displayvfmsg(filename, "No update-factory", threadid);
            return false;
        }
        int n0 = str.indexOf(":");
        int n1 = str.indexOf("[^]");
        String tem1 = getDigit(str.substring(n0, n1));
        if (tem1 == null || tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1");
            return false;
        }
        double data1 = Double.parseDouble(tem1);

        if (g_a_status[0] && Math.abs(data1 - gdata[0]) > 0.001) { // data1 not match
            // some kind of warning



        } else {
            gdata[0] = data1;
            g_a_status[0] = true;
            if (g_a_status[3] && g_a_status[2] && g_a_status[1]) { //data29,data19,data2 is also available
                //go to sbumit



            } else if (g_a_status[3] && g_a_status[2]) { //data29,data2 is also available
                //when condition met go to sbumit



            } else if (g_a_status[1] && g_a_status[2]) { //data29,data2 is also available
                //when condition met go to sbumit



            } else if (g_a_status[2]) { //data2 is also available
                //when condition met go to sbumit
            } else {
                //when condition met go to submit
            }
        }

        tem1 = getDigit(str.substring(18, n0));
        int id = Math.abs(Integer.parseInt(tem1));

        value1.setText("" + data1);
        if (id >= 0) {
            return submit(submit, "FID=" + id, filename, 0, data1, oneprevious, emchg, oneprevious, botype, bctype,
                          boffset, wotype, wctype, woffset, fbt, fwt, sbt, swt, quantity, threadid);

        } else {
            displayokmsg(filename, threadid, data1, "No id submit selected=" + id);
            return false;
        }


    }

    private String getIndicatorName(int indicatorno) {
        switch (indicatorno) {
        case 0:
            return "GDP";
        case 1:
            return "LABOR";
        case 2:
            return "CPI";
        case 3:
            return "Retail";
        case 4:
            return "Trade Balance";
        }

        return "Unkonwn";
    }

    private boolean NZDP_IndicatorRSS(String str, String filename, String verifyword, int threadid) {
        int n0 = str.indexOf("<item>");

        n0 = str.indexOf("<title", n0 + 1);
        int n1 = str.indexOf("</title", n0 + 3);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, n0 + " n0, n1 " + n1 + "    NZDP_Rss retrieving");
            return false;
        }
        String tem1 = str.substring(n0, n1);
        //  System.out.println(tem1);
        if (tem1.contains(verifyword)) {
            displayvfmsg(filename, "No update P_Indicator", threadid);
            return false;
        } else {
            displayokmsg(filename, threadid,
                         " NZDP_Rss has  new RSS update at " +
                         (new Time(System.currentTimeMillis() + timeoffset)).toString());
            return true;
        }

    }

    private boolean NZD_STS_Home(String str, String filename, String betterword, String verifyword, int threadid) // check for stats in demand
        {
        int n0 = str.indexOf("</table");


        n0 = str.indexOf("<a", n0 + 1);
        n0 = str.indexOf(">", n0 + 1);
        int n1 = str.indexOf("</a", n0 + 1);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "NZD retrieving");
            return false;
        }
        String tem1 = str.substring(n0, n1);
        //  System.out.println(tem1);
        if (tem1.contains(betterword) && tem1.contains(verifyword)) {
            n1 = str.indexOf("</td", n1 + 1);
            n1 = str.indexOf("</td", n1 + 1);
            n0 = str.lastIndexOf(">", n1);
            if (n1 < 0 || n0 < 0) {
                displayerrmsg(filename, threadid, n0, n1, "NZD2 retrieving");
                return false;
            }
            tem1 = getDigit(str.substring(n0, n1));
            System.out.println(betterword + " is here=" + tem1);
            displayokmsg(filename, threadid, betterword + " is here");
            return true;
        }

        ////Second-------
        n0 = str.indexOf("<a", n1 + 1);
        n0 = str.indexOf(">", n0 + 1);
        n1 = str.indexOf("</a", n0 + 1);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "NZD3 retrieving");
            return false;
        }
        tem1 = str.substring(n0, n1);
        //  System.out.println(tem1+","+betterword+","+verifyword);
        if (tem1.contains(betterword) && tem1.contains(verifyword)) {
            n1 = str.indexOf("</td", n1 + 1);
            n1 = str.indexOf("</td", n1 + 1);
            n0 = str.lastIndexOf(">", n1);
            if (n1 < 0 || n0 < 0) {
                displayerrmsg(filename, threadid, n0, n1, "NZD4 retrieving");
                return false;
            }
            tem1 = getDigit(str.substring(n0, n1));
            System.out.println(betterword + " is here=" + tem1);
            displayokmsg(filename, threadid, betterword + " is here");
            return true;
        }

        ////third-------
        n0 = str.indexOf("<a", n1 + 1);
        n0 = str.indexOf(">", n0 + 1);
        n1 = str.indexOf("</a", n0 + 1);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "NZD5 retrieving");
            return false;
        }
        tem1 = str.substring(n0, n1);
        //  System.out.println(tem1);
        if (tem1.contains(betterword) && tem1.contains(verifyword)) {
            n1 = str.indexOf("</td", n1 + 1);
            n1 = str.indexOf("</td", n1 + 1);
            n0 = str.lastIndexOf(">", n1);
            if (n1 < 0 || n0 < 0) {
                displayerrmsg(filename, threadid, n0, n1, "NZD6 retrieving");
                return false;
            }
            tem1 = getDigit(str.substring(n0, n1));
            System.out.println(betterword + " is here=" + tem1);
            displayokmsg(filename, threadid, betterword + " is here");
            return true;
        }

        ////fourth-------
        n0 = str.indexOf("<a", n1 + 1);
        n0 = str.indexOf(">", n0 + 1);
        n1 = str.indexOf("</a", n0 + 1);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "NZD7 retrieving");
            return false;
        }
        tem1 = str.substring(n0, n1);
        //  System.out.println(tem1);
        if (tem1.contains(betterword) && tem1.contains(verifyword)) {
            n1 = str.indexOf("</td", n1 + 1);
            n1 = str.indexOf("</td", n1 + 1);
            n0 = str.lastIndexOf(">", n1);
            if (n1 < 0 || n0 < 0) {
                displayerrmsg(filename, threadid, n0, n1, "NZD8 retrieving");
                return false;
            }
            tem1 = getDigit(str.substring(n0, n1));
            System.out.println(betterword + " is here=" + tem1);
            displayokmsg(filename, threadid, betterword + " is here");
            return true;
        }

        displayvfmsg(filename, "No update", threadid);
        return false;

    }

    private boolean GBP_GDP_P1_2(String str, String filename, String betterword, String verifyword, double emchg,
                                 double oneprevious, int threadid) //for GBP_GDP_Scdp1 and _Scdp2
        {
        int n0 = str.indexOf(betterword);

        n0 = str.indexOf("</td>", n0 + 1);
        n0 = str.indexOf("</td>", n0 + 1);
        n0 = str.indexOf("</td>", n0 + 1);
        n0 = str.indexOf("</td>", n0 + 1);

        int n1 = str.lastIndexOf(">", n0);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "GBP_GDP retrieving");
            return false;
        }
        String tem1 = getDigit(str.substring(n1, n0));
        //  System.out.println(tem1);
        if (tem1.length() <= 0) {
            displayvfmsg(filename, threadid);
            return false;
        }

        double data19 = Double.parseDouble(tem1);

        n0 = str.indexOf(verifyword);


        n0 = str.indexOf("</td>", n0 + 1);
        n0 = str.indexOf("</td>", n0 + 1);
        n0 = str.indexOf("</td>", n0 + 1);
        n0 = str.indexOf("</td>", n0 + 1);

        n1 = str.lastIndexOf(">", n0);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "GBP_GDP retrieving");
            return false;
        }
        tem1 = getDigit(str.substring(n1, n0));

        if (tem1.length() <= 0) {
            displayvfmsg(filename, threadid);
            return false;
        }

        double data1 = Double.parseDouble(tem1);

        double data10 = getSSWR2((data1 - emchg) + (data19 - oneprevious) * 0.2);

        if (!bdata1 && orderpermit.isSelected()) {

            displayvfmsg(filename, data1 + "," + data19 + ",Yield,", threadid);
            log(filename,
                threadid + " data1=" + data1 + ", data19=" + data19 + ", is late at " +
                (new Time(System.currentTimeMillis() + timeoffset)).toString());
            return true;
        }
        bdata1 = false;

        if ((data10 >= 0.3)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(30000, getSSWR(sf.gbpusd + 0.0010), BUYLMT, GBPUSD); //sell GBPUSD
            System.out.println(threadid + " GBPUSD Buy Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.gbpusd));
            value1.setText("+" + data10 + "(" + data1 + "..." + emchg + ") ");
            value1.setForeground(new Color(0, 153, 0));
        } else if ((data10 <= -0.3)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(30000, getSSWR(sf.gbpusd - 0.0010), SELLLMT, GBPUSD); //buy GBPUSD
            System.out.println(threadid + " GBPUSD Sell Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.gbpusd));
            value1.setText(data10 + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(Color.red);
        } else // if(data<0.25 && data>-0.25)
        {
            value1.setText((data10 > 0 ? "+" : "") + data10 + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(Color.blue);
            System.out.println(threadid + " GBPRate is here:" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString());
        }

        onepreviousF.setText(getSSWR2(data19 - oneprevious) + "(" + data19 + "  " + oneprevious + ")");
        onepreviousF.setForeground(data19 >= oneprevious ? new Color(0, 153, 0) : Color.red);


        displayokmsg(filename, threadid, data1, data19, "GBP_GDP_P1_2");
        return true;


    }


    private boolean GBP_GDP_P3(String str, String filename, String betterword, String verifyword, double emchg,
                               double oneprevious, int threadid) //for GBP_GDP_ScdP3
        {
        int n0 = str.indexOf("<tbody>");


        n0 = str.indexOf(betterword, n0 + 1);
        n0 = str.indexOf(verifyword, n0 + 1);
        n0 = str.indexOf("</td>", n0 + 1);
        n0 = str.indexOf("</td>", n0 + 1);
        n0 = str.indexOf("</td>", n0 + 1);
        n0 = str.indexOf("</td>", n0 + 1);

        int n1 = str.lastIndexOf(">", n0);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "data19 retrieving");
            return false;
        }
        String tem1 = getDigit(str.substring(n1, n0));
        // System.out.println(str.substring(n1-300,n0+2)+" "+ tem1+" "+betterword);
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data19 data");
            return false;
        }

        double data19 = Double.parseDouble(tem1);


        n0 = str.indexOf("</tr>", n0 + 1);

        n0 = str.indexOf("<td", n0 + 1);
        n0 = str.indexOf("<td", n0 + 1);
        n0 = str.indexOf("<td", n0 + 1);
        n0 = str.indexOf("<td", n0 + 1);
        n0 = str.indexOf("<td", n0 + 1);
        n0 = str.indexOf("</td>", n0 + 1);
        n1 = str.lastIndexOf(">", n0);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "data1 retrieving");
            return false;
        }
        tem1 = getDigit(str.substring(n1, n0));
        //  System.out.println(str.substring(n1,n0+2)+" "+ data19);
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, n1, "Empty data1 data");
            return false;
        }

        double data1 = Double.parseDouble(tem1);

        if (!bdata1 && orderpermit.isSelected()) {

            displayvfmsg(filename, data1 + "," + data19 + ",Yield,", threadid);
            log(filename,
                threadid + " data1=" + data1 + ", data19=" + data19 + ", is late at " +
                (new Time(System.currentTimeMillis() + timeoffset)).toString());
            return true;
        }
        bdata1 = false;

        double data10 = getSSWR2((data1 - emchg) + (data19 - oneprevious) * 0.2);

        if ((data10 >= 0.3)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(30000, getSSWR(sf.gbpusd + 0.0010), BUYLMT, GBPUSD); //sell GBPUSD
            System.out.println(threadid + " GBPUSD Buy Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.gbpusd));
            value1.setText("+" + data10 + "(" + data1 + "..." + emchg + ") ");
            value1.setForeground(new Color(0, 153, 0));
        } else if ((data10 <= -0.3)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(30000, getSSWR(sf.gbpusd - 0.0010), SELLLMT, GBPUSD); //buy GBPUSD
            System.out.println(threadid + " GBPUSD Sell Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.gbpusd));
            value1.setText(data10 + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(Color.red);
        } else // if(data<0.25 && data>-0.25)
        {
            value1.setText((data10 > 0 ? "+" : "") + data10 + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(Color.blue);
            System.out.println(threadid + " GBPRate is here:" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString());
        }

        onepreviousF.setText(getSSWR2(data19 - oneprevious) + "(" + data19 + "  " + oneprevious + ")");
        onepreviousF.setForeground(data19 >= oneprevious ? new Color(0, 153, 0) : Color.red);

        displayokmsg(filename, threadid, data1, data19, "GBP_GDP_P3");
        return true;


    }


    private boolean NZD_STS_Home_L(String str, String filename, String verifyword, int threadid) //check for latest release
        {
        int n0 = str.indexOf("<!-- START main-content -->");


        n0 = str.indexOf("<li>", n0 + 1);
        int n1 = str.indexOf("</li>", n0 + 1);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "NZD retrieving");
            return false;
        }
        String tem1 = str.substring(n0, n1);
        //  System.out.println(tem1);
        if (tem1.contains(verifyword)) {
            displayvfmsg(filename, threadid);
            return false;
        } else {
            displayokmsg(filename, threadid,
                         " NZD_STS_Home_L has  new RSS update at " +
                         (new Time(System.currentTimeMillis() + timeoffset)).toString());
            return true;
        }


    }

    private boolean NZDTradeBalance(String str, String filename, double emchg, String verifyword, int threadid) {
        //System.out.println(str);

        if (true) {
            return true;
        }

        int n0 = str.indexOf("<ul");
        n0 = str.indexOf("<li", n0);
        int n1 = str.indexOf("</li", n0 + 1);
        if (n1 < 0 || n0 < 0) {
            value1R.setText(n0 + " n0, n1 " + n1 + " NZDGDP data retrieving");
            value1R.setForeground(Color.red);
            return false;
        }

        String tem2 = str.substring(n0, n1);

        // tem2=tem2.replace(" ", "");
        //  System.out.println(tem2);

        // if(true) return true;

        n0 = tem2.indexOf("percent");
        if (n0 < 0)
            n0 = tem2.indexOf("%");
        if (n0 < 0) {
            System.out.println("NZDGDP data retrieving at" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString());
            return false;
        }

        String tem1 = getDigit(tem2.substring(n0 - 5, n0));
        if (tem1.length() < 1) {
            System.out.println("Empty NZDGDP data retrieving at" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString());
            return false;
        }

        double data1 = Double.parseDouble(tem1);
        int sign =
            getSign(tem2.substring((n0 - 15) >= 0 ? (n0 - 15) : 0,
                                   (n0 + 15) < (tem2.length() - 1) ? (n0 + 15) : (tem2.length() - 1)));
        if (sign < 0)
            data1 = 0 - data1;
        else if (sign == 0 && Math.abs(data1) > 0.15) {
            System.out.println("NZDGDP data uncertain:data1=" + data1 + "?  at" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString());
            return false;

        }


        double data = getSSWR(data1 - emchg);

        if (((data) >= 0.3)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(30000, getSSWR(sf.nzdusd + 0.0005), BUYLMT, NZDUSD); //sell EURUSD
            System.out.println(threadid + " NZDUSD Buy Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.nzdusd));
            value1.setText("+" + data + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(new Color(0, 153, 0));
            return true;
        } else if (((data) <= -0.3)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(30000, getSSWR(sf.nzdusd - 0.0005), SELLLMT, NZDUSD); //buy EURUSD
            System.out.println(threadid + " NZDUSD Sell Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.nzdusd));
            value1.setText(data + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(Color.red);
            return true;
        } else if (data < 0.3 && data > -0.3) {
            value1.setText((data > 0 ? "+" : "") + data + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(Color.blue);
            System.out.println(threadid + " NZDGDP Finish Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString());
            return true;
        }

        return false;

    }

    private boolean NZDGDP_xls(HSSFWorkbook workbook, double emchg, double oneprevious, int threadid) {

        HSSFSheet sheet = workbook.getSheetAt(1);
        int rowno = 27; //need to change 3 location loc1
        HSSFRow row = sheet.getRow(rowno); // Sept=27
        HSSFCell cell = row.getCell(2);

        String tem1 = cell.getStringCellValue();

        if (tem1 == null || tem1.length() == 0)
            return false;
        else
            tem1 = tem1.toLowerCase();

        if (!tem1.contains("sep")) // to be modified very time loc2
        {
            System.out.println("Wrong happened" + (new Time(System.currentTimeMillis() + timeoffset)).toString());
            return false;
        }

        row = sheet.getRow((rowno + 1));
        cell = row.getCell(2);
        tem1 = cell.getStringCellValue();

        if (tem1 == null || !(tem1.toLowerCase()).contains("dec")) // loc3
        {
            System.out.println("Data not ready" + (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               tem1);
            return false;
        }

        cell = row.getCell(4);
        double data1 = cell.getNumericCellValue();

        row = sheet.getRow(rowno);
        cell = row.getCell(4);
        double data19 = cell.getNumericCellValue();


        double data = getSSWR(data1 - emchg + (data19 - oneprevious) * 0.39);

        if (((data) >= 0.3)) {
            //  if(sf!=null && orderpermit.isSelected())
            //  sf.attackOrder(25000, getSSWR(sf.nzdusd+0.0010), BUYLMT, NZDUSD);//sell EURUSD
            System.out.println(threadid + " NZDUSD Buy Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.nzdusd));
            value1.setText("+" + data + "(" + data1 + "..." + emchg + ")" + getSSWR(data1 - emchg));
            value1.setForeground(new Color(0, 153, 0));

        } else if (((data) <= -0.3)) {
            //  if(sf!=null && orderpermit.isSelected())
            //  sf.attackOrder(25000, getSSWR(sf.nzdusd-0.0010), SELLLMT, NZDUSD);//buy EURUSD
            System.out.println(threadid + " NZDUSD Sell Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.nzdusd));
            value1.setText(data + "(" + data1 + "..." + emchg + ")" + getSSWR(data1 - emchg));
            value1.setForeground(Color.red);

        } else if (data < 0.3 && data > -0.3) {
            value1.setText((data > 0 ? "+" : "") + data + "(" + data1 + "..." + emchg + ")" + getSSWR(data1 - emchg));
            value1.setForeground(Color.blue);
            System.out.println(threadid + " NZDGDP Finish Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString());

        }

        onepreviousF.setText(getSSWR(data19 - oneprevious) + "(" + data19 + "  " + oneprevious + ")");
        onepreviousF.setForeground(data19 >= oneprevious ? new Color(0, 153, 0) : Color.red);

        return true;

    }

    private boolean GBPRate(String str, double emchg, double uemrate) {
        int n0 = 0, n1 = 0;
        String tem1 = "";
        n0 = str.indexOf("<title");
        n1 = str.indexOf("</title", n0);
        if (n1 < 0 || n0 < 0) {
            value1R.setText(n0 + " n0, n1 " + n1 + " GBPRate title retrieving");
            value1R.setForeground(Color.red);
            return false;
        }


        tem1 = str.substring(n0, n1).replace(" ", "");
        n0 = tem1.indexOf("%");
        if (n0 < 0)
            n0 = tem1.indexOf("percent");
        if (n0 < 0) {
            value1R.setText(n0 + " n0, n1 " + n1 + " GBPRate rate retrieving");
            value1R.setForeground(Color.red);
            return false;
        }

        double data1 = Double.parseDouble(getDigit(tem1.substring(n0 - 6, n0)));

        double data2 = uemrate;

        n0 = tem1.lastIndexOf("billion");
        if (n0 < 0) {
            value1R.setText(n0 + " n0 " + " GBPRate Asset Purchase Size retrieving");
            value1R.setForeground(Color.red);
        } else
            data2 = Double.parseDouble(getDigit(tem1.substring(n0 - 6, n0)));

        double data11 = getSSWR(data1 - emchg);
        double data22 = getSSWR(data2 - uemrate);

        if (((data11 >= 0.24) && data22 <= 0) || ((data11 >= 0) && data22 <= -49)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(30000, getSSWR(sf.gbpusd + 0.0010), BUYLMT, GBPUSD); //sell GBPUSD
            System.out.println("GBPUSD Buy Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.gbpusd));
            value1.setText("+" + data11 + "(" + data1 + "..." + emchg + ") ");
            value1.setForeground(new Color(0, 153, 0));
        } else if (((data11 <= -0.24) && data22 >= 0) || ((data11 <= 0) && data22 >= 49)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(30000, getSSWR(sf.gbpusd - 0.0010), SELLLMT, GBPUSD); //buy GBPUSD
            System.out.println("GBPUSD Sell Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.gbpusd));
            value1.setText(data11 + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(Color.red);
        } else // if(data<0.25 && data>-0.25)
        {
            value1.setText((data11 > 0 ? "+" : "") + data11 + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(Color.blue);
            System.out.println("GBPRate is here:" + (new Time(System.currentTimeMillis() + timeoffset)).toString());
        }

        value2.setText((data22 > 0 ? "+" : "") + data22 + "(" + data2 + "..." + uemrate + ")");
        value2.setForeground(data22 < 0 ? new Color(0, 153, 0) : Color.red);


        return true;

    }

    private boolean GBP_RATE_Home(String str, String filename, double emchg, double uemrate, String verifyword,
                                  int threadid) {
        int n0 = str.indexOf("ctl00_ctl20_g_8d678178_d2b0_4556_a892_073855451d6d_ctl00_lstKeyFacts_ctrl0_Label4");
        n0 = str.indexOf(">", n0);
        int n1 = str.indexOf("</span>", n0 + 1);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, " GBPRate verifyword retrieving");

            return false;
        }
        String tem1 = str.substring(n0, n1);
        if (tem1.contains(verifyword)) {
            displayvfmsg(filename, threadid);
            return false;
        }

        n0 = str.indexOf(">");
        n1 = str.indexOf("<", n0 + 1);
        tem1 = getDigit(str.substring(n0, n1));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, -100, -100, "Empty data1");
            return false;
        }
        double data1 = Double.parseDouble(tem1);
        /*/
        n0=str.indexOf("ctl00_ctl20_g_8d678178_d2b0_4556_a892_073855451d6d_ctl00_lstKeyFacts_ctrl1_Label2",n1);
        if(n0<0)
        {
                displayerrmsg(filename,threadid,n0,n1," GBPRate size retrieving");

            return false;
        }
        n0=str.indexOf(">",n0+1);
        n1=str.indexOf("<",n0+1);
        tem1=getDigit(str.substring(n0,n1));
        if(tem1.length()<=0){
            displayerrmsg(filename,threadid,-100,-100,"Empty data1");
            return false;
        }
        double data2=Double.parseDouble(tem1);
        //*/
        displayokmsg(filename, threadid, data1, "Rate_Home");
        return true;
    }

    private boolean GBPRate(String str, String filename, double emchg, double uemrate, int threadid) {
        int n0 = 0, n1 = 0;
        String tem1 = "";
        n0 = str.indexOf("<title");
        n1 = str.indexOf("</title", n0);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, " GBPRate title retrieving");

            return false;
        }


        tem1 = str.substring(n0, n1).replace(" ", "");
        n0 = tem1.indexOf("%");
        if (n0 < 0)
            n0 = tem1.indexOf("percent");
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, " GBPRate rate retrieving");

            return false;
        }

        double data1 = Double.parseDouble(getDigit(tem1.substring(n0 - 6, n0)));

        double data2 = uemrate;

        n0 = tem1.lastIndexOf("billion");
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, " GBPRate Asset Purchase Size retrieving");
            return false;

        } else
            data2 = Double.parseDouble(getDigit(tem1.substring(n0 - 6, n0)));

        double data11 = getSSWR(data1 - emchg);
        double data22 = getSSWR(data2 - uemrate);

        if (!bdata1 && orderpermit.isSelected()) {

            displayokmsg(filename, threadid, data1, data2, " is late at ");
            return true;
        }
        bdata1 = false;

        if (((data11 >= 0.24) && data22 <= 0) || ((data11 >= 0) && data22 <= -49)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(30000, getSSWR(sf.gbpusd + 0.0010), BUYLMT, GBPUSD); //sell GBPUSD
            System.out.println(threadid + " GBPUSD Buy Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.gbpusd));
            value1.setText("+" + data11 + "(" + data1 + "..." + emchg + ") ");
            value1.setForeground(new Color(0, 153, 0));
        } else if (((data11 <= -0.24) && data22 >= 0) || ((data11 <= 0) && data22 >= 49)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(30000, getSSWR(sf.gbpusd - 0.0010), SELLLMT, GBPUSD); //buy GBPUSD
            System.out.println(threadid + " GBPUSD Sell Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.gbpusd));
            value1.setText(data11 + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(Color.red);
        } else // if(data<0.25 && data>-0.25)
        {
            value1.setText((data11 > 0 ? "+" : "") + data11 + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(Color.blue);
            System.out.println(threadid + " GBPRate is here:" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString());
        }

        value2.setText((data22 > 0 ? "+" : "") + data22 + "(" + data2 + "..." + uemrate + ")");
        value2.setForeground(data22 < 0 ? new Color(0, 153, 0) : Color.red);

        ordersubmit = false;

        return true;

    }

    private boolean GBP_RATE_RSS(String str, String filename, String verifyword, int threadid) {
        // System.out.println("are you here?");

        int n0 = str.indexOf("<item>");
        int n1 = str.indexOf("</item>", n0 + 1);
        if (n0 < 0 || n1 < 0) {
            displayerrmsg(filename, threadid, n0, n1, " str retrieving");

            return false;
        }
        String tem1 = str.substring(n0, n1);
        n0 = tem1.lastIndexOf("<pubdate>");
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, " verifyword retrieving");

            return false;
        }

        String tem2 = tem1.substring(n0, n1);
        if (tem2.contains(verifyword)) {
            displayvfmsg(filename, "No update-rss", threadid);
            return false;
        } else {
            displayokmsg(filename, threadid, "has a new update");
            return true;
        }


    }

    private boolean GBP_RATE_NEWS(String str, String filename, String verifyword, double emchg, double uemrate,
                                  int threadid) {
        int n0 = 0, n1 = 0;
        String tem1 = "";
        n0 = str.indexOf("</");
        // n1=str.indexOf("</title",n0);
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, " verifyword retrieving");

            return false;
        }


        tem1 = str.substring(0, n0);
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, -999, -999, "empty verifyword");
            return false;
        }

        if (tem1.contains(verifyword)) {
            displayvfmsg(filename, "No update-news", threadid);
            return false;
        } else {
            displayokmsg(filename, threadid, "has a new update");
            return true;
        }

    }

    private boolean EURRate(String str, double emchg, double oneprevious) {
        int n0 = str.indexOf("%");
        if (n0 < 0)
            n0 = str.indexOf("percent");
        if (n0 < 0) {
            value1R.setText(n0 + " n0 " + " EURRate data retrieving");
            value1R.setForeground(Color.red);
            return false;
        }
        double data1 = Double.parseDouble(getDigit(str.substring(n0 - 6, n0)));
        n0 = getSign(str.substring(n0 - 70, n0));
        double data = 0;

        if ((n0 == -1 && data1 < oneprevious) || (n0 == 1 && data1 > oneprevious) ||
            (n0 == 0 && Math.abs(data1 - oneprevious) < 0.001))
            data = getSSWR(data1 - emchg);
        else {
            value1R.setText("EURRate data not match");
            value1R.setForeground(Color.red);
            return false;
        }


        if (((data) >= 0.24)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(30000, getSSWR(sf.eurusd + 0.0010), BUYLMT, EURUSD); //sell EURUSD
            System.out.println("EURUSD Buy Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.eurusd));
            value1.setText("+" + data + "(" + data1 + "," + emchg + ")");
            value1.setForeground(new Color(0, 153, 0));
        } else if (((data) <= -0.24)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(30000, getSSWR(sf.eurusd - 0.0010), SELLLMT, EURUSD); //buy EURUSD
            System.out.println("EURUSD Sell Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.eurusd));
            value1.setText(data + "(" + data1 + "," + emchg + ")");
            value1.setForeground(Color.red);
        } else if (data < 0.24 && data > -0.24) {
            value1.setText((data > 0 ? "+" : "") + data + "(" + data1 + "," + emchg + ")");
            value1.setForeground(Color.blue);
            System.out.println("EURRate is here:" + (new Time(System.currentTimeMillis() + timeoffset)).toString());
        }

        return true;
    }

    private boolean EURRate(String str, String filename, double emchg, double oneprevious, int threadid) {


        int n0 = str.indexOf("%");
        if (n0 < 0)
            n0 = str.indexOf("percent");
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, -100, " EURRate data retrieving");
            return false;
        }
        String tem1 = getDigit(str.substring(n0 - 6, n0));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, n0, -100, " EURRate data empty");
            return false;
        }
        double data1 = Double.parseDouble(tem1);
        n0 = getSign(str.substring(n0 - 70, n0));
        double data = 0;
        // System.out.print(n0+","+data1);
        if ((n0 == -1 && data1 < oneprevious) || (n0 == 1 && data1 > oneprevious) ||
            (n0 == 0 && Math.abs(data1 - oneprevious) < 0.001)) { //Good
            if (n0 < 0)
                data1 = 0 - data1;
            data = getSSWR(data1 - emchg);
        } else {
            displayerrmsg(filename, threadid, -999, -999, "EURRate data not match");
            return false;
        }

        if (!bdata1 && orderpermit.isSelected()) {

            System.out.println(threadid + " is late at " +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString());
            return true;
        }
        bdata1 = false;

        if (((data) >= 0.24) && !jCheckBox3.isSelected()) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(30000, getSSWR(sf.eurusd + 0.0010), BUYLMT, EURUSD); //sell EURUSD
            System.out.println(threadid + " EURUSD Buy Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.eurusd));
            value1.setText("+" + data + "(" + data1 + "," + emchg + ")");
            value1.setForeground(new Color(0, 153, 0));
        } else if (((data) <= -0.24) && !jCheckBox3.isSelected()) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(30000, getSSWR(sf.eurusd - 0.0010), SELLLMT, EURUSD); //buy EURUSD
            System.out.println(threadid + " EURUSD Sell Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.eurusd));
            value1.setText(data + "(" + data1 + "," + emchg + ")");
            value1.setForeground(Color.red);
        } else if (data < 0.24 && data > -0.24) {
            value1.setText((data > 0 ? "+" : "") + data + "(" + data1 + "," + emchg + ")");
            value1.setForeground(Color.blue);
            System.out.println(threadid + " EURRate is here:" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString());
        }

        ordersubmit = false;
        return true;
    }

    private boolean CADRate(String str, double emchg) {
        int n0 = 0, n1 = 0;
        String tem1 = "";
        n0 = str.indexOf("<title");
        n1 = str.indexOf("</title", n0);

        tem1 = str.substring(n0, n1).replace(" ", "");
        n0 = tem1.indexOf("percent");
        // System.out.println(tem1);
        if (n0 < 0)
            n0 = tem1.indexOf("%");

        if (n1 < 0 || n0 < 0) {
            value1R.setText(n0 + " n0, n1 " + n1 + " USDLabor verifyword");
            value1R.setForeground(Color.red);
            return false;
        }


        double data1 = Double.parseDouble(getDigit(tem1.substring(n0 - 6, n0)));
        double data = getSSWR(data1 - emchg);
        if (data >= 0.24) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(50000, getSSWR(sf.usdcad - 0.0010), SELLLMT, USDCAD); //sell EURUSD
            System.out.println("USDCAD Sell Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.usdcad));
            value1.setText("+" + data + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(new Color(0, 153, 0));

        } else if (data <= -0.24) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(50000, getSSWR(sf.usdcad + 0.0010), BUYLMT, USDCAD); //buy EURUSD
            System.out.println("USDCAD Buy Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.usdcad));
            value1.setText(data + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(Color.red);

        } else // if(data<0.25 && data>-0.25)
        {
            value1.setText((data > 0 ? "+" : "") + data + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(Color.blue);
            System.out.println("CADRate is here Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString());
        }

        return true;
    }

    private boolean CADRate(String str, String filename, double emchg, double oneprevious, int botype, int bctype,
                            double boffset, int wotype, int wctype, double woffset, double fbt, double fwt, double sbt,
                            double swt, int quantity, int threadid) {
        int n0 = 0, n1 = 0, sign = 33;
        String tem1 = "", tem2 = "", tem3 = "", tem4 = "", tem5 = "";
        double datad = 0, dataf = 0;
        n0 = str.indexOf("<title");
        n1 = str.indexOf("</title", n0);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "Title not found");
            return false;
        }
        tem1 = str.substring(n0, n1).replace(" ", "");
        //   tem1="Bank of Canada lowers overnight rate target by 1/4 percentage point to 2 1/4 per cent";
        //    tem1=tem1.replace(" ", "").toLowerCase();
        if (tem1.contains("maintain") || tem1.contains("keep") || tem1.contains("leave")) { //
            sign = 0;
        } else if (tem1.contains("increase") || tem1.contains("increase")) {
            sign = 1;
        } else if (tem1.contains("lower") || tem1.contains("decrease")) {
            sign = -1;
        }

        if (sign == 33) {
            displayerrmsg(filename, threadid, n0, n1, "No sign word found");
            return false;
        } else if (sign != 0) {
            n0 = tem1.indexOf("percent");
            if (n0 < 0)
                n0 = tem1.indexOf("%");

            n1 = tem1.lastIndexOf("by", n0);
            n0 = tem1.indexOf("to", n0);

            if (n1 < 0 || n0 < 0) // to ensure that the data is valid
            {
                displayerrmsg(filename, threadid, n0, n1, "Percent not found");
                return false;
            }

            tem2 = tem1.substring(n1, n0);
            n1 = tem2.indexOf("/");
            if (n1 == -1) // no x/X data found
                datad = Double.parseDouble(getDigit(tem2));
            else { // x/X found
                tem3 = getDigit(tem2.substring(n1 + 1, n1 + 2));
                if (tem3.length() != 1) {
                    displayerrmsg(filename, threadid, -99, n1, "feng mu error");
                    return false;
                }
                int fm = Integer.parseInt(tem3); // =X

                tem4 = getDigit(tem2.substring(0, n1));
                int fenzi = 0, zensu = 0;
                if (tem4.length() == 1) // x/X form found
                    fenzi = Integer.parseInt(tem4);
                else if (tem4.length() == 2) { //  1 3/4 form found
                    tem5 = tem4.substring(1);
                    fenzi = Integer.parseInt(tem5);

                    tem5 = tem4.substring(0, 1);
                    zensu = Integer.parseInt(tem5);
                } else {
                    displayerrmsg(filename, threadid, -99, -99, "fenzi error");
                    return false;
                }

                datad = (zensu + fenzi * 1.0 / (fm * 1.0)) * sign;
            }

        } else {
            datad = 0;
            n0 = tem1.indexOf("getat");
        }

        double data1 = oneprevious + datad;

        n1 = tem1.indexOf("percent", n0 + 1); // to verify if same data from different location match,double check
        if (n1 < 0)
            n1 = tem1.indexOf("%", n0 + 1);
        //--------------------------
        tem2 = tem1.substring(n0, n1);
        n1 = tem2.indexOf("/");
        if (n1 == -1) // no x/X data found
            dataf = Double.parseDouble(getDigit(tem2));
        else { // x/X found
            tem3 = getDigit(tem2.substring(n1 + 1, n1 + 2));
            if (tem3.length() != 1) {
                displayerrmsg(filename, threadid, -99, n1, "feng mu error");
                return false;
            }
            int fm = Integer.parseInt(tem3); // =X

            tem4 = getDigit(tem2.substring(0, n1));
            int fenzi = 0, zensu = 0;
            if (tem4.length() == 1) // x/X form found
                fenzi = Integer.parseInt(tem4);
            else if (tem4.length() == 2) { //  1 3/4 form found
                tem5 = tem4.substring(1);
                fenzi = Integer.parseInt(tem5);

                tem5 = tem4.substring(0, 1);
                zensu = Integer.parseInt(tem5);
            } else {
                displayerrmsg(filename, threadid, -99, -99, "fenzi error");
                return false;
            }

            dataf = (zensu + fenzi * 1.0 / (fm * 1.0));
        }
        //------------------------------------------------------------
        if (Math.abs(data1 - dataf) > 0.001) {
            displayerrmsg(filename, threadid, -99, -99, data1 + "  " + dataf + ",double check failed");
            return false;
        }


        return CAD_Submit("CADRate", filename, 1, data1, oneprevious, emchg, oneprevious, botype, bctype, boffset,
                          wotype, wctype, woffset, fbt, fwt, sbt, swt, quantity, threadid);

    }

    private boolean CAD_RATE_RSS(String str, String filename, String verifyword, double emchg, double oneprevious,
                                 int botype, int bctype, double boffset, int wotype, int wctype, double woffset,
                                 double fbt, double fwt, double sbt, double swt, int quantity, int threadid) {
        int n0 = 0, n1 = 0, sign = 33;
        String tem1 = "", tem2 = "", tem3 = "", tem4 = "", tem5 = "";
        double datad = 0, dataf = 0, data1 = 0;
        n0 = str.indexOf("</");
        tem1 = str.substring(0, n0);
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, -999, "Verifyword retrieving");
            return false;
        }

        if (tem1.contains(verifyword)) {
            displayvfmsg(filename, "NO Update-CADRate", threadid);
            return false;
        }

        n0 = str.indexOf("<a href=", n0 + 1);
        n0 = str.indexOf("\">", n0 + 1);
        n1 = str.indexOf("</a", n0 + 1);
        tem1 = str.substring(n0, n1).replace(" ", "");

        // System.out.println(tem1);
        // tem1="Bank of Canada increases overnight rate target by 0.25 percentage point to  0.75 per cent";
        // tem1=tem1.replace(" ", "").toLowerCase();
        ///--
        if (tem1.contains("maintain") || tem1.contains("keep") || tem1.contains("leave")) { //
            sign = 0;
        } else if (tem1.contains("increase") || tem1.contains("increase")) {
            sign = 1;
        } else if (tem1.contains("lower") || tem1.contains("decrease")) {
            sign = -1;
        }

        if (sign == 33) {
            displayerrmsg(filename, threadid, n0, n1, "No sign word found");
            return false;
        } else if (sign != 0) {
            n0 = tem1.indexOf("percent");
            if (n0 < 0)
                n0 = tem1.indexOf("%");

            n1 = tem1.lastIndexOf("by", n0);
            n0 = tem1.indexOf("to", n0);

            if (n1 < 0 || n0 < 0) // to ensure that the data is valid
            {
                displayerrmsg(filename, threadid, n0, n1, "Percent not found");
                return false;
            }

            tem2 = tem1.substring(n1, n0);
            n1 = tem2.indexOf("/");
            if (n1 == -1) // no x/X data found
                datad = Double.parseDouble(getDigit(tem2));
            else { // x/X found
                tem3 = getDigit(tem2.substring(n1 + 1, n1 + 2));
                if (tem3.length() != 1) {
                    displayerrmsg(filename, threadid, -99, n1, "feng mu error");
                    return false;
                }
                int fm = Integer.parseInt(tem3); // =X

                tem4 = getDigit(tem2.substring(0, n1));
                int fenzi = 0, zensu = 0;
                if (tem4.length() == 1) // x/X form found
                    fenzi = Integer.parseInt(tem4);
                else if (tem4.length() == 2) { //  1 3/4 form found
                    tem5 = tem4.substring(1, 1);
                    fenzi = Integer.parseInt(tem5);

                    tem5 = tem4.substring(0, 1);
                    zensu = Integer.parseInt(tem5);
                } else {
                    displayerrmsg(filename, threadid, -99, -99, "fenzi error");
                    return false;
                }

                datad = (zensu + fenzi * 1.0 / (fm * 1.0)) * sign;
            }

        } else {
            datad = 0;
            n0 = tem1.indexOf("getat");
        }

        data1 = oneprevious + datad;

        n1 = tem1.indexOf("percent", n0 + 1); // to verify if same data from different location match,double check
        if (n1 < 0)
            n1 = tem1.indexOf("%", n0 + 1);
        //--------------------------
        tem2 = tem1.substring(n0, n1);
        n1 = tem2.indexOf("/");
        if (n1 == -1) // no x/X data found
            dataf = Double.parseDouble(getDigit(tem2));
        else { // x/X found
            tem3 = getDigit(tem2.substring(n1 + 1, n1 + 2));
            if (tem3.length() != 1) {
                displayerrmsg(filename, threadid, -99, n1, "feng mu error");
                return false;
            }
            int fm = Integer.parseInt(tem3); // =X

            tem4 = getDigit(tem2.substring(0, n1));
            int fenzi = 0, zensu = 0;
            if (tem4.length() == 1) // x/X form found
                fenzi = Integer.parseInt(tem4);
            else if (tem4.length() == 2) { //  1 3/4 form found
                tem5 = tem4.substring(1);
                fenzi = Integer.parseInt(tem5);

                tem5 = tem4.substring(0, 1);
                zensu = Integer.parseInt(tem5);
            } else {
                displayerrmsg(filename, threadid, -99, -99, "fenzi error");
                return false;
            }

            dataf = (zensu + fenzi * 1.0 / (fm * 1.0));
        }
        //------------------------------------------------------------
        if (Math.abs(data1 - dataf) > 0.001) {
            displayerrmsg(filename, threadid, -99, -99, data1 + "  " + dataf + ",double check failed");
            return false;
        }

        if (true)
            return CAD_Submit("CAD_Rate_Rss", filename, 1, data1, oneprevious, emchg, oneprevious, botype, bctype,
                              boffset, wotype, wctype, woffset, fbt, fwt, sbt, swt, quantity, threadid);

        //-
        n0 = tem1.indexOf("percent");
        if (n0 < 0)
            n0 = tem1.indexOf("%");
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "Percent not found");
            return false;
        }

        tem2 = getDigit(tem1.substring(n0 - 6, n0));
        if (tem2.length() == 0) {

            displayerrmsg(filename, threadid, n0, n1, "Emplty string");
            return false;
        }

        data1 = Double.parseDouble(tem2);
        double data = getSSWR(data1 - emchg);

        if (!bdata1 && orderpermit.isSelected()) {

            System.out.println(threadid + " is late at " +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString());
            return true;
        }
        bdata1 = false;

        if (data >= 0.24) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(50000, getSSWR(sf.usdcad - 0.0010), SELLLMT, USDCAD); //sell EURUSD
            System.out.println(threadid + " USDCAD Sell Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.usdcad));
            displayokmsg(filename, threadid, data,
                         "USDCAD Sell Order Issuring Time=" +
                         (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                         (sf == null ? "" : sf.usdcad));
            value1.setText("+" + data + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(new Color(0, 153, 0));

        } else if (data <= -0.24) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(50000, getSSWR(sf.usdcad + 0.0010), BUYLMT, USDCAD); //buy EURUSD
            System.out.println(threadid + " USDCAD Buy Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.usdcad));
            displayokmsg(filename, threadid, data,
                         "USDCAD Buy Order Issuring Time=" +
                         (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                         (sf == null ? "" : sf.usdcad));
            value1.setText(data + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(Color.red);

        } else // if(data<0.25 && data>-0.25)
        {
            value1.setText((data > 0 ? "+" : "") + data + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(Color.blue);
            System.out.println(threadid + " CADRate is here Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString());
            displayokmsg(filename, threadid, data,
                         "USDCAD is here. Time=" + (new Time(System.currentTimeMillis() + timeoffset)).toString() +
                         "," + (sf == null ? "" : sf.usdcad));
        }

        return true;
    }

    private boolean CAD_RATE_TOKEN(String str, String filename, String verifyword, double emchg, double oneprevious,
                                   int botype, int bctype, double boffset, int wotype, int wctype, double woffset,
                                   double fbt, double fwt, double sbt, double swt, int quantity, int threadid) {
        int n0 = 0, n1 = 0, sign = 33;
        String tem1 = "", tem2 = "", tem3 = "", tem4 = "", tem5 = "";
        double datad = 0, dataf = 0, data1 = 0;
        n0 = str.indexOf("title");
        n1 = str.indexOf(",");

        if (n0 < 0 || n1 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "Verifyword retrieving");
            return false;
        }

        if (str.contains(verifyword)) {
            displayvfmsg(filename, "NO Update-CADRateToken", threadid);
            return false;
        }

        tem1 = str.substring(n0, n1).replace(" ", "");

        if (tem1.contains("maintain") || tem1.contains("keep") || tem1.contains("leave")) { //
            sign = 0;
        } else if (tem1.contains("increase") || tem1.contains("increase")) {
            sign = 1;
        } else if (tem1.contains("lower") || tem1.contains("decrease")) {
            sign = -1;
        }

        if (sign == 33) {
            displayerrmsg(filename, threadid, n0, n1, "No sign word found");
            return false;
        } else if (sign != 0) {
            n0 = tem1.indexOf("percent");
            if (n0 < 0)
                n0 = tem1.indexOf("%");

            n1 = tem1.lastIndexOf("by", n0);
            n0 = tem1.indexOf("to", n0);

            if (n1 < 0 || n0 < 0) // to ensure that the data is valid
            {
                displayerrmsg(filename, threadid, n0, n1, "Percent not found");
                return false;
            }

            tem2 = tem1.substring(n1, n0);
            n1 = tem2.indexOf("/");
            if (n1 == -1) // no x/X data found
                datad = Double.parseDouble(getDigit(tem2));
            else { // x/X found
                tem3 = getDigit(tem2.substring(n1 + 1, n1 + 2));
                if (tem3.length() != 1) {
                    displayerrmsg(filename, threadid, -99, n1, "feng mu error");
                    return false;
                }
                int fm = Integer.parseInt(tem3); // =X

                tem4 = getDigit(tem2.substring(0, n1));
                int fenzi = 0, zensu = 0;
                if (tem4.length() == 1) // x/X form found
                    fenzi = Integer.parseInt(tem4);
                else if (tem4.length() == 2) { //  1 3/4 form found
                    tem5 = tem4.substring(1, 1);
                    fenzi = Integer.parseInt(tem5);

                    tem5 = tem4.substring(0, 1);
                    zensu = Integer.parseInt(tem5);
                } else {
                    displayerrmsg(filename, threadid, -99, -99, "fenzi error");
                    return false;
                }

                datad = (zensu + fenzi * 1.0 / (fm * 1.0)) * sign;
            }

        } else {
            datad = 0;
            n0 = tem1.indexOf("getat");
        }

        data1 = oneprevious + datad;

        n1 = tem1.indexOf("percent", n0 + 1); // to verify if same data from different location match,double check
        if (n1 < 0)
            n1 = tem1.indexOf("%", n0 + 1);
        //--------------------------
        if (n0 < 0 || n1 < 0) {
            // System.out.println(tem1+"3");
            displayerrmsg(filename, threadid, n0, n1, "double check retrieving");
            return false;
        }
        tem2 = tem1.substring(n0, n1);
        n1 = tem2.indexOf("/");
        if (n1 == -1) // no x/X data found
            dataf = Double.parseDouble(getDigit(tem2));
        else { // x/X found
            tem3 = getDigit(tem2.substring(n1 + 1, n1 + 2));
            if (tem3.length() != 1) {
                displayerrmsg(filename, threadid, -99, n1, "feng mu error");
                return false;
            }
            int fm = Integer.parseInt(tem3); // =X

            tem4 = getDigit(tem2.substring(0, n1));
            int fenzi = 0, zensu = 0;
            if (tem4.length() == 1) // x/X form found
                fenzi = Integer.parseInt(tem4);
            else if (tem4.length() == 2) { //  1 3/4 form found
                tem5 = tem4.substring(1);
                fenzi = Integer.parseInt(tem5);

                tem5 = tem4.substring(0, 1);
                zensu = Integer.parseInt(tem5);
            } else {
                displayerrmsg(filename, threadid, -99, -99, "fenzi error");
                return false;
            }

            dataf = (zensu + fenzi * 1.0 / (fm * 1.0));
        }
        //------------------------------------------------------------
        if (Math.abs(data1 - dataf) > 0.001) {
            displayerrmsg(filename, threadid, -99, -99, data1 + "  " + dataf + ",double check failed");
            return false;
        }


        return CAD_Submit("CAD_Rate_Token", filename, 1, data1, oneprevious, emchg, oneprevious, botype, bctype,
                          boffset, wotype, wctype, woffset, fbt, fwt, sbt, swt, quantity, threadid);


    }

    private boolean CADCPI(String str, String filename, String keyword, double emchg, double oneprevious,
                           double uemrate, double twoprevious, int botype, int bctype, double boffset, int wotype,
                           int wctype, double woffset, double fbt, double fwt, double sbt, double swt, int quantity,
                           int threadid) {

        int n0 = str.indexOf(keyword);
        String no = str.substring(n0 - 1, n0);
        //    System.out.println(no);


        //----------------------all-item cpi--------------------------
        n0 = str.indexOf("t00" + no + "stub3 hdt00" + no + "r1c6 uomt00" + no + "r2c6", n0 + 1);
        //   n0=str.indexOf("t001stub3 hdt001r1c6 uomt001r2c6",n1);
        int n1 = str.indexOf("</td", n0 + 1);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "D2_RT", str);
            return false;
        }
        String tem1 = str.substring(n0, n1);
        if (tem1.length() < 2) {
            displayerrmsg(filename, threadid, n0, n1, "D2_EPT", tem1);
            return false;
        }

        double data2 = Double.parseDouble(getDigit(tem1)); //2 month ago


        //------------------------core cpi----------------------------
        n0 = str.indexOf("t00" + no + "stub13 hdt00" + no + "r1c6 uomt00" + no + "r2c6", n1);
        // n0=str.indexOf("t001stub13 hdt001r1c6 uomt001r2c6",n1);
        n1 = str.indexOf("</td", n0 + 1);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "D1_RT", str);
            return false;
        }
        tem1 = str.substring(n0, n1);
        if (tem1.length() < 2) {
            displayerrmsg(filename, threadid, n0, n1, "D1_EPT", tem1);
            return false;
        }
        double data1 = Double.parseDouble(getDigit(tem1));

        return CAD_Submit("CAD_CPI", filename, 0, data1, oneprevious, data2, twoprevious, emchg, oneprevious, uemrate,
                          twoprevious, botype, bctype, boffset, wotype, wctype, woffset, fbt, fwt, sbt, swt, quantity,
                          threadid);

    }

    private boolean CADIveyPMI(String str, String filename, double emchg, String verifyword, int botype, int bctype,
                               double boffset, int wotype, int wctype, double woffset, int threadid) {
        int n0 = 0, n1 = 0;
        String tem1 = "";
        n0 = str.indexOf("<table");
        n0 = str.indexOf("</tr", n0 + 1);
        n0 = str.indexOf("<td", n0 + 1);
        n1 = str.indexOf("</td", n0 + 1);

        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "    CADIvey verifyword");
            return false;
        }
        tem1 = str.substring(n0, n1);
        //  System.out.println(tem1);
        if (tem1.contains(verifyword)) {
            displayvfmsg(filename, threadid);
            return false;
        }

        n0 = str.indexOf("<td", n0 + 1);
        n1 = str.indexOf("</td", n0 + 1);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "    CADIvey verifyword2");
            return false;
        }
        tem1 = getDigit(str.substring(n0, n1));
        if (tem1.length() == 0) {
            displayerrmsg(filename, threadid, -100, -100, "Empty data");
            return false;
        }

        double data1 = Double.parseDouble(tem1);
        double data = getSSWR(data1 - emchg);
        if (data >= 4) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(25000, getSSWR(sf.usdcad - 0.0010), SELLLMT, USDCAD); //sell EURUSD
            System.out.println("USDCAD Sell Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.usdcad));
            displayokmsg(filename, threadid, data1,
                         "USDCAD Sell Order Issuring Time=" +
                         (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                         (sf == null ? "" : sf.usdcad));
            value1.setText("+" + data + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(new Color(0, 153, 0));

        } else if (data <= -4) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(25000, getSSWR(sf.usdcad + 0.0010), BUYLMT, USDCAD); //buy EURUSD
            System.out.println("USDCAD Buy Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.usdcad));
            displayokmsg(filename, threadid, data1,
                         "USDCAD Buy Order Issuring Time=" +
                         (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                         (sf == null ? "" : sf.usdcad));
            value1.setText(data + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(Color.red);

        } else // if(data<0.25 && data>-0.25)
        {
            value1.setText((data > 0 ? "+" : "") + data + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(Color.blue);
            displayokmsg(filename, threadid, data1,
                         "CADIveyPMI is here Time=" + (new Time(System.currentTimeMillis() + timeoffset)).toString());
            System.out.println("CADIveyPMI is here Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString());
        }

        return true;
    }

    private boolean CAD$UERate(String str, String filename, String verifyword, double emchg, double uemrate, int botype,
                               int bctype, double boffset, int wotype, int wctype, double woffset, int threadid) {
        if (str.contains(verifyword)) {
            displayvfmsg(filename, "No update-wg", threadid);
            return false;
        }
        int n0 = str.indexOf("</th");
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, -999, "data retrieving");
            return false;
        }
        String tem1 = getDigit(str.substring(n0));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, -99, -999, "data retrieving2");
            return false;
        }
        double data = Double.parseDouble((tem1));
        displayokmsg(filename, threadid, data + "_U.E. Rate");
        return true;
    }

    private boolean CAD$CPI(String str, String filename, String verifyword, double emchg, double uemrate, int botype,
                            int bctype, double boffset, int wotype, int wctype, double woffset, int threadid) {
        if (str.contains(verifyword)) {
            displayvfmsg(filename, "No update-wg", threadid);
            return false;
        }
        int n0 = str.indexOf("</th");
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, -999, "data retrieving");
            return false;
        }
        String tem1 = getDigit(str.substring(n0));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, -99, -999, "data retrieving2");
            return false;
        }
        double data = Double.parseDouble((tem1));
        displayokmsg(filename, threadid, data + "wg_CPI");
        return true;
    }

    private boolean CAD$GDP(String str, String filename, String verifyword, double emchg, double uemrate, int botype,
                            int bctype, double boffset, int wotype, int wctype, double woffset, int threadid) {
        if (str.contains(verifyword)) {
            displayvfmsg(filename, "No update-wg", threadid);
            return false;
        }
        int n0 = str.indexOf("</th");
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, -999, "data retrieving");
            return false;
        }
        String tem1 = getDigit(str.substring(n0));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, -99, -999, "data retrieving2");
            return false;
        }
        double data = Double.parseDouble((tem1));
        displayokmsg(filename, threadid, data + "wg_GDP");
        return true;
    }

    private boolean CADLabor(String str, String filename, String verifyword, double emchg, double oneprevious,
                             double uemrate, double twoprevious, int botype, int bctype, double boffset, int wotype,
                             int wctype, double woffset, double fbt, double fwt, double sbt, double swt, int submit,
                             int quantity, int threadid) {
        int n0 = 0, n1 = 0;
        String tem1 = "";
        n0 = str.indexOf("<th");
        n0 = str.indexOf("<th", n0 + 1);
        n0 = str.indexOf("<th", n0 + 1);
        n0 = str.indexOf("<th", n0 + 1);
        n1 = str.indexOf("</th", n0 + 1);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "CADLabor verifyword");
            return false;
        }
        tem1 = str.substring(n0, n1);
        //  System.out.println(tem1);
        if (tem1.contains(verifyword)) {
            displayvfmsg(filename, threadid);
            return false;
        }

        n0 = str.indexOf("<tbody");
        n0 = str.indexOf("</tr", n0);
        n0 = str.indexOf("</tr", n0 + 1);
        n0 = str.indexOf("</tr", n0 + 1);
        n0 = str.indexOf("</tr", n0 + 1);

        n0 = str.indexOf("</td", n0 + 1);
        n0 = str.indexOf("</td", n0 + 1);
        n0 = str.indexOf("</td", n0 + 1);
        n0 = str.indexOf("</td", n0 + 1);

        n1 = str.lastIndexOf("</", n0 - 1);
        while ((n0 - n1) < 12) //travel to most left "</"
        {
            n0 = n1;
            n1 = str.lastIndexOf("</", n0 - 1);

        }

        n1 = str.lastIndexOf(">", n0);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "CADLabor verifyword2");
            return false;
        }

        double data1 = Double.parseDouble(getDigit(str.substring(n1 + 1, n0)));
        double data11 = getSSWR(data1 - emchg);

        n0 = str.indexOf("<tr", n0 + 1);
        n0 = str.indexOf("<tr", n0 + 1);
        n0 = str.indexOf("<tr", n0 + 1);
        n0 = str.indexOf("<tr", n0 + 1);
        n0 = str.indexOf("<tr", n0 + 1);

        n0 = str.indexOf("</td", n0 + 1);
        n0 = str.indexOf("</td", n0 + 1);
        n0 = str.indexOf("</td", n0 + 1);

        n1 = str.lastIndexOf("</", n0 - 1);
        while ((n0 - n1) < 12) //travel to most left "</"
        {
            n0 = n1;
            n1 = str.lastIndexOf("</", n0 - 1);

        }

        n1 = str.lastIndexOf(">", n0);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "CADLabor verifyword3");
            return false;
        }
        double data2 = Double.parseDouble(getDigit(str.substring(n1 + 1, n0)));
        double data22 = getSSWR(data2 - uemrate);

        return CAD_SubmitSndSP("CADLabor", filename, 0, data1, oneprevious, data2, twoprevious, emchg, oneprevious,
                               uemrate, twoprevious, botype, bctype, boffset, wotype, wctype, woffset, fbt, fwt, sbt,
                               swt, quantity, threadid);


    }

    public int getIndicatorID(Object o) {
        String str = ((String) o).trim();

        if (str.equalsIgnoreCase("cadlabor"))
            return 21;
        else if (str.equalsIgnoreCase("audlabor"))
            return 0;
        else if (str.equalsIgnoreCase("CADRetail"))
            return 4;
        else if (str.equalsIgnoreCase("usdgdp"))
            return 6;
        else if (str.equalsIgnoreCase("CADGDP"))
            return 7;
        else if (str.equalsIgnoreCase("audretail"))
            return 10;
        else if (str.equalsIgnoreCase("chfcpi"))
            return 13;
        else if (str.equalsIgnoreCase("audrate"))
            return 14;
        else if (str.equalsIgnoreCase("audgdp"))
            return 15;
        else if (str.equalsIgnoreCase("nzdrate"))
            return 17;
        else if (str.equalsIgnoreCase("gbprate"))
            return 18;
        else if (str.equalsIgnoreCase("cadrate"))
            return 20;
        else if (str.equalsIgnoreCase("USDInitialClaim"))
            return 1;
        else if (str.equalsIgnoreCase("usdechange"))
            return 22;
        else if (str.equalsIgnoreCase("usduerate"))
            return 23;
        else if (str.equalsIgnoreCase("usdadpemp"))
            return 24;
        else if (str.equalsIgnoreCase("USDPHomeSales"))
            return 11;
        else if (str.equalsIgnoreCase("usdphomesales_lf"))
            return 11;
        else if (str.equalsIgnoreCase("test1"))
            return 30;
        else if (str.equalsIgnoreCase("usdlabor"))
            return 2;
        else if (str.equalsIgnoreCase("pdftest"))
            return 26;
        else if (str.equalsIgnoreCase("test2"))
            return 28; //test2
        else if (str.equalsIgnoreCase("test3"))
            return 30;
        else if (str.equalsIgnoreCase("test4"))
            return 28;
        else if (str.equalsIgnoreCase("usdismmpmi"))
            return 27;
        else if (str.equalsIgnoreCase("testnzprice"))
            return 25;
        else if (str.equalsIgnoreCase("usdismnmpmi"))
            return 29;
        else if (str.equalsIgnoreCase("test5"))
            return 30;
        else if (str.equalsIgnoreCase("test6"))
            return 30;
        else if (str.equalsIgnoreCase("cnews"))
            return 25;
        else if (str.equalsIgnoreCase("usdtradBalance"))
            return 32;
        else if (str.equalsIgnoreCase("EURRate"))
            return 33;
        else if (str.equalsIgnoreCase("GBPRateAPSize"))
            return 18;
        else if (str.equalsIgnoreCase("CADIveyPMI"))
            return 34;
        else if (str.equalsIgnoreCase("AUDTradBalance"))
            return 35;
        else if (str.equalsIgnoreCase("CADTradBalance"))
            return 36;
        else if (str.equalsIgnoreCase("CADBDPermit"))
            return 37;
        else if (str.equalsIgnoreCase("audrate2"))
            return 38;
        else if (str.equalsIgnoreCase("AUDGDP2"))
            return 39;
        else if (str.equalsIgnoreCase("AUDRss"))
            return 40;
        else if (str.equalsIgnoreCase("CAD_LABOR_RSS"))
            return 64;
        else if (str.equalsIgnoreCase("CADGen"))
            return 42;
        else if (str.equalsIgnoreCase("USDRss"))
            return 43;
        else if (str.equalsIgnoreCase("USDCensus"))
            return 76;
        else if (str.equalsIgnoreCase("AUDPrdRss"))
            return 40;
        else if (str.equalsIgnoreCase("AUDHomeLoan"))
            return 45;
        else if (str.equalsIgnoreCase("AUDHomeLoanR"))
            return 46;
        else if (str.equalsIgnoreCase("USDRetail"))
            return 47;
        else if (str.equalsIgnoreCase("USDCPI"))
            return 48;
        else if (str.equalsIgnoreCase("NZDGDP"))
            return 49;
        else if (str.equalsIgnoreCase("USDEHomeSales"))
            return 50;
        else if (str.equalsIgnoreCase("NZDGDP_xls"))
            return 53;
        else if (str.equalsIgnoreCase("CADCPI"))
            return 52;
        else if (str.equalsIgnoreCase("CAD_Price_Rss"))
            return 41;
        else if (str.equalsIgnoreCase("USNewHomeSales"))
            return 51;
        else if (str.equalsIgnoreCase("USDHousingRSS"))
            return 79;
        else if (str.equalsIgnoreCase("NZDTradeBalance"))
            return 54;
        else if (str.equalsIgnoreCase("NZDE_IndicatorRSS"))
            return 55;
        else if (str.equalsIgnoreCase("NZDP_IndicatorRSS"))
            return 56;
        else if (str.equalsIgnoreCase("USD_CB_C_Confidence"))
            return 57;
        else if (str.equalsIgnoreCase("USDD-Goods_PDF"))
            return 58;
        else if (str.equalsIgnoreCase("USD_Goods_xls"))
            return 59;
        else if (str.equalsIgnoreCase("USDDOLRss"))
            return 75;
        else if (str.equalsIgnoreCase("USD_BEA_RSS"))
            return 80;
        else if (str.equalsIgnoreCase("USDCensusHome"))
            return 44;
        else if (str.equalsIgnoreCase("USD_Census_CGIBrief"))
            return 60;
        else if (str.equalsIgnoreCase("USD_DOL_Home"))
            return 61;
        else if (str.equalsIgnoreCase("USD_BEA_Home"))
            return 62;
        else if (str.equalsIgnoreCase("NZD_STS_Home"))
            return 63;
        else if (str.equalsIgnoreCase("CAD_EC_RSS"))
            return 64;
        else if (str.equalsIgnoreCase("CAD_GDP_ORG"))
            return 65;
        else if (str.equalsIgnoreCase("AUD_STS_Headline"))
            return 66;
        else if (str.equalsIgnoreCase("AUD_STS_Home"))
            return 67;
        else if (str.equalsIgnoreCase("AUD_BDApproval"))
            return 68;
        else if (str.equalsIgnoreCase("USD_ISM_RSS"))
            return 25;
        else if (str.equalsIgnoreCase("AUD_Retail_Media"))
            return 69;
        else if (str.equalsIgnoreCase("AUD_RATE_RSS"))
            return 70;
        else if (str.equalsIgnoreCase("USD_ADP_Press"))
            return 71;
        else if (str.equalsIgnoreCase("USD_ISM_Home"))
            return 72;
        else if (str.equalsIgnoreCase("GBP_RATE_Home"))
            return 73;
        else if (str.equalsIgnoreCase("NZD_STS_Home_L"))
            return 74;
        else if (str.equalsIgnoreCase("CAD_ALL_RSS"))
            return 64; //41
        else if (str.equalsIgnoreCase("CAD_Retail_RSS"))
            return 41;
        else if (str.equalsIgnoreCase("GBP_GDP_ScdP1"))
            return 77;
        else if (str.equalsIgnoreCase("GBP_GDP_ScdP2"))
            return 77;
        else if (str.equalsIgnoreCase("GBP_GDP_ScdP3"))
            return 78;
        else if (str.equalsIgnoreCase("USD_BLS_NEWSRLS"))
            return 81;
        else if (str.equalsIgnoreCase("USDGDPtxt"))
            return 82;
        else if (str.equalsIgnoreCase("CAD_RATE_RSS"))
            return 83;
        else if (str.equalsIgnoreCase("AUD_Bapproval_Media"))
            return 84;
        else if (str.equalsIgnoreCase("GBP_RATE_NEWS"))
            return 85;
        else if (str.equalsIgnoreCase("GBP_RATE_RSS"))
            return 86;
        else if (str.equalsIgnoreCase("NZD_RATE_NEWS"))
            return 87;
        else if (str.equalsIgnoreCase("NZD_RATE_RSS"))
            return 88;
        else if (str.equalsIgnoreCase("NZD_RATE_ASS"))
            return 89;
        else if (str.equalsIgnoreCase("NZD_RATE_STATE"))
            return 90;
        else if (str.equalsIgnoreCase("AUD_Labor_Media"))
            return 91;
        else if (str.equalsIgnoreCase("AUD_CPI_Media"))
            return 92;
        else if (str.equalsIgnoreCase("AUD_Retail_Media"))
            return 93;
        else if (str.equalsIgnoreCase("CAD_LABOR_ORG"))
            return 94;
        else if (str.equalsIgnoreCase("CAD_RATE_TOKEN"))
            return 95;
        else if (str.equalsIgnoreCase("CAD@UERate"))
            return 96;
        else if (str.equalsIgnoreCase("CAD_TRADEBAL_ORG"))
            return 97;
        else if (str.equalsIgnoreCase("CAD_Retail_ORG"))
            return 98;
        else if (str.equalsIgnoreCase("CAD_CPI_ORG"))
            return 99;
        else if (str.equalsIgnoreCase("USD_CPI_DAT"))
            return 100;
        else if (str.equalsIgnoreCase("USD_BLS_HOME"))
            return 101;
        else if (str.equalsIgnoreCase("Factory"))
            return 102;
        else if (str.equalsIgnoreCase("FactoryCalendar"))
            return 103;
        else if (str.equalsIgnoreCase("F1"))
            return 104;
        else if (str.equalsIgnoreCase("F19"))
            return 105;
        else if (str.equalsIgnoreCase("F2"))
            return 106;
        else if (str.equalsIgnoreCase("F29"))
            return 107;
        else if (str.equalsIgnoreCase("NZD_GDP_Media"))
            return 108;
        else if (str.equalsIgnoreCase("CAD@CPI"))
            return 109;
        else if (str.equalsIgnoreCase("CAD@GDP"))
            return 110;
        else if (str.equalsIgnoreCase("AUD_LABOR_D"))
            return 111;
        else if (str.equalsIgnoreCase("F3"))
            return 113;
        else if (str.equalsIgnoreCase("F4"))
            return 114;
        else if (str.equalsIgnoreCase("F5"))
            return 115;
        else if (str.equalsIgnoreCase("F6"))
            return 116;
        else if (str.equalsIgnoreCase("F7"))
            return 117;
        else if (str.equalsIgnoreCase("F8"))
            return 118;
        else if (str.equalsIgnoreCase("F9"))
            return 119;
        else if (str.equalsIgnoreCase("F10"))
            return 120;
        else if (str.equalsIgnoreCase("F11"))
            return 121;
        else if (str.equalsIgnoreCase("US10YBOND"))
            return 122;
        else if (str.equalsIgnoreCase("ALL10YBOND"))
            return 123;
        else if (str.equalsIgnoreCase("JP10YBOND"))
            return 124;
        else if (str.equalsIgnoreCase("CA10YBOND"))
            return 125;
        else if (str.equalsIgnoreCase("AUDLABOR_XLSADD"))
            return 126;
        else if (str.equalsIgnoreCase("Aleart"))
            return 127;


        return -1;

    }

    private boolean PDFTest(String str) {
        System.out.println("test1:" + str + "   " + (new Time(System.currentTimeMillis() + timeoffset)).toString());
        return true;
    }

    private boolean AUD_Bapproval_Media(String str, String filename, String verifyword, int threadid) {
        String tem1 = str.substring(0, 100);
        if (tem1.contains(verifyword)) {
            displayvfmsg(filename, "No update-media", threadid);
            return false;
        } else {
            displayokmsg(filename, threadid, " has a new update\n" + tem1);
            return true;
        }


    }

    private boolean USDLabor(String str, String filename, String verifyword, String betterword, double emchg,
                             double uemrate, double oneprevious, double twoprevious, int threadid) {
        int n0, n1;

        n0 = str.indexOf("<th");
        n0 = str.indexOf("<th", n0 + 1);
        n0 = str.indexOf("<th", n0 + 1);
        n0 = str.indexOf("<th", n0 + 1);
        n0 = str.indexOf("<th", n0 + 1);
        n0 = str.indexOf("<th", n0 + 1);
        n0 = str.indexOf(">", n0 + 1);
        n1 = str.indexOf("</th", n0 + 1);
        if (n1 < 0 || n0 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "verifyword retrieving");
            return false;
        }
        String tem1 = str.substring(n0, n1);
        //System.out.println(tem1);
        if (tem1.contains(verifyword)) {
            displayvfmsg(filename, "verifyword match", threadid);
            return false;
        }
        n0 = str.indexOf("cps_empsit_sum.r.2.1.1", n0 + 1); //row id

        n0 = str.indexOf("</td", n0 + 1);
        n0 = str.indexOf("</td", n0 + 1);
        n0 = str.indexOf("</td", n0 + 1);

        n1 = str.lastIndexOf("<td", n0);
        n1 = str.lastIndexOf(">", n1);

        if (n0 < 0 || n1 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "data39 retrieving");
            return false;
        }
        double data39 = Double.parseDouble(getDigit(str.substring(n1, n0))); //previous partipation rate


        n0 = str.indexOf("</td", n0 + 1);

        n1 = str.lastIndexOf("<td", n0);
        n1 = str.lastIndexOf(">", n1);

        if (n0 < 0 || n1 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "data3 retrieving");
            return false;
        }
        double data3 = Double.parseDouble(getDigit(str.substring(n1, n0))); //partipation rate


        n0 = str.indexOf("cps_empsit_sum.r.2.1.3.1", n0 + 1); //row id

        n0 = str.indexOf("</td", n0 + 1);
        n0 = str.indexOf("</td", n0 + 1);
        n0 = str.indexOf("</td", n0 + 1);

        n1 = str.lastIndexOf("<td", n0);
        n1 = str.lastIndexOf(">", n1);

        if (n0 < 0 || n1 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "data29 retrieving");
            return false;
        }
        double data29 = Double.parseDouble(getDigit(str.substring(n1, n0))); //previous un rate


        n0 = str.indexOf("</td", n0 + 1);

        n1 = str.lastIndexOf("<td", n0);
        n1 = str.lastIndexOf(">", n1);

        if (n0 < 0 || n1 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "data2 retrieving");
            return false;
        }
        double data2 = Double.parseDouble(getDigit(str.substring(n1, n0))); //Uemployment rate


        //   n0=str.indexOf("ces_table10",n0);
        //  n0=str.indexOf("<tbody",n0);
        n0 = str.indexOf("ces_table10.r.1.1", n0 + 1); //row id
        n0 = str.indexOf("</td", n0 + 1);
        n0 = str.indexOf("</td", n0 + 1);
        n1 = str.lastIndexOf("<td", n0);
        n1 = str.lastIndexOf(">", n1);
        if (n0 < 0 || n1 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "data19 retrieving");
            return false;
        }
        double data129 = getSSWR1(Double.parseDouble(getDigit(str.substring(n1, n0))));
        n0 = str.indexOf("</td", n0 + 1);
        n1 = str.lastIndexOf("<td", n0);
        n1 = str.lastIndexOf(">", n1);
        if (n0 < 0 || n1 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "data19 retrieving");
            return false;
        }
        double data19 = getSSWR1(Double.parseDouble(getDigit(str.substring(n1, n0)))); //previous employment change


        n0 = str.indexOf("</td", n0 + 1);
        n1 = str.lastIndexOf("<td", n0);
        n1 = str.lastIndexOf(">", n1);
        if (n0 < 0 || n1 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "data1 retrieving");
            return false;
        }
        double data1 = getSSWR1(Double.parseDouble(getDigit(str.substring(n1, n0)))); //employment change

        double data11 = getSSWR1(data1 - emchg + (data19 - oneprevious) * 0.5);
        double data22 = getSSWR1(data2 - uemrate + (data29 - twoprevious) * 0.5);

        // System.out.println(data1+","+data19+","+data129+"            "+data2+","+data29+"            "+data3+","+data39);
        mp.alarmclock.optable.setValueAt("" + data1, 0, 0);
        if ((data1 - emchg) > 0) {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[11] = "1";
        } else if ((data1 - emchg) < 0) {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[11] = "-1";
        } else {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[11] = "0";
        }


        mp.alarmclock.optable.setValueAt("" + data19, 1, 2);
        mp.alarmclock.optable.setValueAt("" + oneprevious, 2, 2);

        if ((data19 - oneprevious) > 0) {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[13] = "1";
            ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[13] = "1";
        } else if ((data19 - oneprevious) < 0) {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[13] = "-1";
            ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[13] = "-1";
        } else {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[13] = "0";
            ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[13] = "0";
        }
        mp.alarmclock.optable.setValueAt("" + getSSWR1(data19 - oneprevious), 0, 2);


        mp.alarmclock.optable.setValueAt("" + data129, 1, 3);
        mp.alarmclock.optable.setValueAt(betterword, 2, 3);
        if ((data129 - Double.parseDouble(betterword)) > 0) {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[14] = "1";
            ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[14] = "1";
        } else if ((data129 - Double.parseDouble(betterword)) < 0) {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[14] = "-1";
            ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[14] = "-1";
        } else {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[14] = "0";
            ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[14] = "0";
        }
        mp.alarmclock.optable.setValueAt("" + getSSWR1(data129 - Double.parseDouble(betterword)), 0, 3);


        mp.alarmclock.optable.setValueAt("" + data3, 1, 4);
        mp.alarmclock.optable.setValueAt("" + data39, 2, 4);
        if ((data3 - data39) > 0) {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[15] = "1";
            ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[15] = "1";
        } else if ((data3 - data39) < 0) {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[15] = "-1";
            ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[15] = "-1";
        } else {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[15] = "0";
            ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[15] = "0";
        }
        mp.alarmclock.optable.setValueAt("" + getSSWR1(data3 - data39), 0, 4);

        double t = data19 - oneprevious + data129 - Double.parseDouble(betterword);
        // System.out.println("t="+(data19-oneprevious));
        mp.alarmclock.optable.setValueAt("" + getSSWR1(t), 2, 1);
        if (t > 0) {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(2)))[12] = "1";
        } else if (t < 0) {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(2)))[12] = "-1";
        } else {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(2)))[12] = "0";
        }

        mp.alarmclock.optable.setValueAt("" + getSSWR1(data1 - emchg), 1, 1);
        if ((data1 - emchg) > 0) {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[12] = "1";
        } else if ((data1 - emchg) < 0) {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[12] = "-1";
        } else {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[12] = "0";
        }

        double tt = t + data1 - emchg;
        mp.alarmclock.optable.setValueAt("" + getSSWR2(tt), 0, 1);
        if (tt > 0) {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[12] = "1";
        } else if (tt < 0) {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[12] = "-1";
        } else {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[12] = "0";
        }

        double ur = getSSWR2(data2 - uemrate);
        mp.alarmclock.optable.setValueAt("" + ur, 0, 5);
        mp.alarmclock.optable.setValueAt("" + data2, 1, 5);
        mp.alarmclock.optable.setValueAt("" + uemrate + "(f)", 2, 5);
        if (ur < 0) {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[16] = "1";
            ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[16] = "1";
        } else if (ur > 0) {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[16] = "-1";
            ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[16] = "-1";
        } else {
            ((String[]) ((mp.alarmclock.opmode.getData()).get(1)))[16] = "0";
            ((String[]) ((mp.alarmclock.opmode.getData()).get(0)))[16] = "0";
        }


        if ((data11 >= 70) && data22 <= 0) {
            if (sf != null && orderpermit.isSelected())
                // sf.attackOrder(25000, getSSWR(sf.eurusd-0.0010), SELLLMT, EURUSD);//sell EURUSD
                System.out.println("EURUSD Sell Order Issuring Time=" +
                                   (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                                   (sf == null ? "" : sf.eurusd));
            value1.setText("+" + data11 + "(" + data1 + "..." + emchg + ") " + getSSWR(data1 - emchg));
            value1.setForeground(new Color(0, 153, 0));
        } else if ((data11 <= -70) && (data22 >= 0)) {
            if (sf != null && orderpermit.isSelected())
                // sf.attackOrder(25000, getSSWR(sf.eurusd+0.0010), BUYLMT, EURUSD);//buy EURUSD
                System.out.println("EURUSD Buy Order Issuring Time=" +
                                   (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                                   (sf == null ? "" : sf.eurusd));
            value1.setText(data11 + "(" + data1 + "..." + emchg + ")" + getSSWR(data1 - emchg));
            value1.setForeground(Color.red);
        } else // if(data<0.25 && data>-0.25)
        {
            value1.setText((data11 > 0 ? "+" : "") + data11 + "(" + data1 + "..." + emchg + ")" +
                           getSSWR(data1 - emchg));
            value1.setForeground(Color.blue);
            System.out.println("USDLabor is here:" + (new Time(System.currentTimeMillis() + timeoffset)).toString());
        }

        value2.setText(data22 + "(" + data2 + "..." + uemrate + ") " + getSSWR(data2 - uemrate));
        value2.setForeground(data22 < 0 ? new Color(0, 153, 0) : Color.red);
        onepreviousF.setText(getSSWR(data19 - oneprevious) + "(" + data19 + "  " + oneprevious + ")");
        onepreviousF.setForeground(data19 >= oneprevious ? new Color(0, 153, 0) : Color.red);
        twopreviousF.setText(getSSWR(data29 - twoprevious) + "(" + data29 + "  " + twoprevious + ")");
        twopreviousF.setForeground(data29 <= twoprevious ? new Color(0, 153, 0) : Color.red);

        return true;
    }

    private void USDEchange(String str, double emchg) {
        int n0 = 0, n1 = 0;
        String tem1 = "";
        n0 = str.indexOf("<tbody");
        n0 = str.indexOf("</tr", n0);
        n0 = str.indexOf("</td", n0 + 1);
        n0 = str.indexOf("</td", n0 + 1);
        n0 = str.indexOf("</td", n0 + 1);

        n1 = str.lastIndexOf(">", n0 + 1);
        if ((n0 - n1) == 1) {
            n1 = str.lastIndexOf(">", n1 - 1);
        }


        tem1 = getDigit(str.substring(n1 + 1, n0));
        value1.setText(tem1);

        n0 = str.indexOf("</td", n0 + 1);

        n1 = str.lastIndexOf(">", n0 + 1);
        if ((n0 - n1) == 1) {
            n1 = str.lastIndexOf(">", n1 - 1);
        }

        tem1 = getDigit(str.substring(n1 + 1, n0));
        value2.setText(tem1);

    }

    private void USDUErate(String str, double emchg) {
        int n0 = 0, n1 = 0;
        String tem1 = "";
        n0 = str.indexOf("<tbody");
        n0 = str.indexOf("</tr", n0 + 1);
        // System.out.println(n0);
        n0 = str.indexOf("</tr", n0 + 1);
        n0 = str.indexOf("</tr", n0 + 1);
        n0 = str.indexOf("</tr", n0 + 1);
        n0 = str.indexOf("</tr", n0 + 1);
        n0 = str.indexOf("</tr", n0 + 1);
        n0 = str.indexOf("</tr", n0 + 1);
        //  System.out.println(n0);


        n0 = str.indexOf("</td", n0 + 1);
        n0 = str.indexOf("</td", n0 + 1);
        n0 = str.indexOf("</td", n0 + 1);
        n0 = str.indexOf("</td", n0 + 1);

        n1 = str.lastIndexOf(">", n0 + 1);
        if ((n0 - n1) == 1) {
            n1 = str.lastIndexOf(">", n1 - 1);
        }


        tem1 = getDigit(str.substring(n1 + 1, n0));
        value1.setText(tem1);


    }

    private boolean USDADPEmp(String str, String filename, double emchg, double oneprevious, int threadid) {
        int n0 = 0, n1 = 0;
        String tem1 = "";
        n0 = str.indexOf("<!-- change Here -->");
        n0 = str.indexOf(",000");
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, n0, "First Error");
            return false;
        }
        tem1 = getDigit(str.substring(n0 - 3, n0 + 4));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, -100, -100, "Empty data");
            return false;
        }
        double data1 = getSSWR(Double.parseDouble(tem1) / 1000);
        n1 = getSign(str.substring(n0 - 20, n0));
        if (n1 == -1)
            data1 = 1 - data1;

        n0 = str.indexOf(",000", n0 + 2);
        if (n0 < 0) {
            displayerrmsg(filename, threadid, n0, n0, "Second Error");
            return false;
        }

        tem1 = getDigit(str.substring(n0 - 3, n0 + 4));
        if (tem1.length() <= 0) {
            displayerrmsg(filename, threadid, -100, -100, "Empty data");
            return false;
        }
        double data19 = getSSWR(Double.parseDouble(tem1) / 1000);
        n1 = getSign(str.substring(n0 - 20, n0));
        if (n1 == -1)
            data19 = 1 - data19;


        oneprevious = oneprevious / 1000;


        emchg = getSSWR(emchg / 1000);
        double data = getSSWR((data1 - emchg + (data19 - oneprevious) * 0.5));

        if (((data) >= 70)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(30000, getSSWR(sf.usdchf + 0.0010), BUYLMT, USDCHF); //sell USDCHF
            System.out.println("USDCHF Buy Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.usdchf));
            displayokmsg(filename, threadid, data1, data19,
                         "_USDCHF Buy Order Issuring Time=" +
                         (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                         (sf == null ? "" : sf.usdchf));
            value1.setText("+" + data + "(" + data1 + "..." + emchg + ")" + getSSWR(data1 - emchg));
            value1.setForeground(new Color(0, 153, 0));
        } else if (((data) <= -70)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(30000, getSSWR(sf.eurusd + 0.0010), BUYLMT, EURUSD); //buy EURUSD
            System.out.println("EURUSD Buy Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.eurusd));
            displayokmsg(filename, threadid, data1, data19,
                         "_EURUSD Buy Order Issuring Time=" +
                         (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                         (sf == null ? "" : sf.eurusd));
            value1.setText(data + "(" + data1 + "...." + emchg + ")" + getSSWR(data1 - emchg));
            value1.setForeground(Color.red);
        } else if (((data) >= 50)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(25000, getSSWR(sf.usdchf + 0.0010), BUYLMT, USDCHF); //sell USDCHF
            System.out.println("USDCHF Buy Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.usdchf));
            displayokmsg(filename, threadid, data1, data19,
                         "_USDCHF Buy Order Issuring Time=" +
                         (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                         (sf == null ? "" : sf.usdchf));
            value1.setText("+" + data + "(" + data1 + "..." + emchg + ")" + getSSWR(data1 - emchg));
            value1.setForeground(new Color(0, 153, 0));
        } else if (((data) <= -50)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(25000, getSSWR(sf.eurusd + 0.0010), BUYLMT, EURUSD); //buy EURUSD
            System.out.println("EURUSD Buy Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.eurusd));
            displayokmsg(filename, threadid, data1, data19,
                         "_EURUSD Buy Order Issuring Time=" +
                         (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                         (sf == null ? "" : sf.eurusd));
            value1.setText(data + "(" + data1 + "...." + emchg + ")" + getSSWR(data1 - emchg));
            value1.setForeground(Color.red);
        } else if (data < 50 && data > -50) {
            value1.setText((data > 0 ? "+" : "") + data + "(" + data1 + "..." + emchg + ")");
            value1.setForeground(Color.blue);
            System.out.println("USDADP is here:" + (new Time(System.currentTimeMillis() + timeoffset)).toString());
            displayokmsg(filename, threadid, data1, data19,
                         "_USDADP is here:" + (new Time(System.currentTimeMillis() + timeoffset)).toString());
        }
        data = getSSWR(data19 - oneprevious);
        onepreviousF.setText((data > 0 ? "+" : "") + data + "(" + data19 + ".." + oneprevious + ")");
        onepreviousF.setForeground(data19 >= oneprevious ? new Color(0, 153, 0) : Color.red);

        return true;

    }

    private boolean USD_ADP_Press(String str, String filename, String verifyword, int threadid) {
        //  System.out.println("???");
        int n0 = str.indexOf("table-cell");
        int n1 = str.indexOf("</p", n0 + 1);
        if (n0 < 0 || n1 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "First Error");
            return false;
        }
        String tem1 = str.substring(n0, n1);
        if (tem1.contains(verifyword)) {
            displayvfmsg(filename, "No Update", threadid);
            return false;
        } else {
            displayokmsg(filename, threadid, "USD_ADP_Press");
            log(filename, tem1);
            return true;
        }


    }

    private boolean USDISMMPMI(String str, String filename, String verifyword, double emchg, int threadid) {
        if (str.contains(verifyword)) {
            displayvfmsg(filename, "verifywd match", threadid);
            return false;
        }
        int n0 = str.indexOf("pmi at");
        int n1 = str.indexOf("%");
        if (n0 < 0 || n1 < 0 || n0 > n1) {
            displayerrmsg(filename, threadid, n0, n1, "USDISMSMPMI_1");
            return false;
        }
        String tem1 = getDigit(str.substring(n0, n1));
        if (tem1.length() == 0) {
            displayerrmsg(filename, threadid, -100, -100, "Empty data1");
            return false;
        }

        double data1 = Double.parseDouble(tem1);
        double data = getSSWR(data1 - emchg);

        if (((data) >= 2.5)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(25000, getSSWR(sf.eurusd - 0.0010), SELLLMT, EURUSD); //sell EURUSD
            System.out.println("EURUSD Sell Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.eurusd));
            displayokmsg(filename, threadid, data1,
                         "EURUSD Sell Order Issuring Time=" +
                         (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                         (sf == null ? "" : sf.eurusd));
            value1.setText("+" + data + "(" + data1 + "," + emchg + ")");
            value1.setForeground(new Color(0, 153, 0));
            return true;
        } else if (((data) <= -2.5)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(25000, getSSWR(sf.eurusd + 0.0010), BUYLMT, EURUSD); //buy EURUSD
            System.out.println("EURUSD Buy Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.eurusd));
            displayokmsg(filename, threadid, data1,
                         "EURUSD Buy Order Issuring Time=" +
                         (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                         (sf == null ? "" : sf.eurusd));
            value1.setText(data + "(" + data1 + "," + emchg + ")");
            value1.setForeground(Color.red);
            return true;
        } else if (data < 2.5 && data > -2.5) {
            value1.setText((data > 0 ? "+" : "") + data + "(" + data1 + "," + emchg + ")");
            value1.setForeground(Color.blue);
            System.out.println("EURUSD is here:" + (new Time(System.currentTimeMillis() + timeoffset)).toString());
            displayokmsg(filename, threadid, data1,
                         "EURUSD is here:" + (new Time(System.currentTimeMillis() + timeoffset)).toString());
            return true;
        }

        return false;
    }

    private boolean USD_ISM_Home(String str, String filename, String verifyword, int threadid) {
        int n0 = str.indexOf("li");
        int n1 = str.indexOf("<a", n0 + 1);
        if (n0 < 0 || n1 < 0) {
            displayerrmsg(filename, threadid, n0, n1, "First Error");
            return false;
        }
        String tem1 = str.substring(n0, n1);
        if (tem1.contains(verifyword)) {
            displayvfmsg(filename, "No Update", threadid);
            return false;
        } else {
            displayokmsg(filename, threadid, "USD_ISM_Home");
            log(filename, tem1);
            return true;
        }


    }

    private boolean USDISNMMPMI(String str, String filename, String verifyword, double emchg, int threadid) {
        if (str.contains(verifyword)) {
            displayvfmsg(filename, "verifywd match", threadid);
            return false;
        }

        int n0 = str.indexOf("nmi at");
        int n1 = str.indexOf("%");
        if (n0 < 0 || n1 < 0 || n0 > n1) {
            displayerrmsg(filename, threadid, n0, n1, "USDISM_NM_PMI_1");
            return false;
        }
        String tem1 = getDigit(str.substring(n0, n1));
        if (tem1.length() == 0) {
            displayerrmsg(filename, threadid, -100, -100, "Empty data1");
            return false;
        }


        double data1 = Double.parseDouble(tem1);
        double data = getSSWR(data1 - emchg);

        if (((data) >= 2)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(25000, getSSWR(sf.usdjpy + 0.0010), BUYLMT, USDJPY); //sell USDJPY
            System.out.println("USDJPY Buy Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.usdjpy));
            displayokmsg(filename, threadid, data1,
                         "USDJPY Buy Order Issuring Time=" +
                         (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                         (sf == null ? "" : sf.usdjpy));
            value1.setText("+" + data + "(" + data1 + "," + emchg + ")");
            value1.setForeground(new Color(0, 153, 0));

        } else if (((data) <= -2)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(25000, getSSWR(sf.eurusd + 0.0010), BUYLMT, EURUSD); //buy EURUSD
            System.out.println("EURUSD Buy Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.eurusd));
            displayokmsg(filename, threadid, data1,
                         "EURUSD Buy Order Issuring Time=" +
                         (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                         (sf == null ? "" : sf.eurusd));
            value1.setText(data + "(" + data1 + "," + emchg + ")");
            value1.setForeground(Color.red);

        } else {
            value1.setText((data > 0 ? "+" : "") + data + "(" + data1 + "," + emchg + ")");
            value1.setForeground(Color.blue);
            System.out.println("USD NMPMI is here:" + (new Time(System.currentTimeMillis() + timeoffset)).toString());
            displayokmsg(filename, threadid, data1,
                         "USD NMPMI is here:" + (new Time(System.currentTimeMillis() + timeoffset)).toString());

        }

        return true;
    }

    private boolean USDRetail(String str, String filename, double emchg, double uemrate, double oneprevious,
                              double twoprevious, String verifyword, int threadid) {
        // System.out.println("USD?");
        if (str.contains(verifyword)) {
            displayvfmsg(filename, "No update-census-cpi-text", threadid);
            return false;
        } else if (!str.contains(verifyword)) {
            displayokmsg(filename, threadid, "Has a new update");
            return true;
        }
        //----------Retail begin--------
        int n0 = str.indexOf("......");
        n0 = str.indexOf(",", n0 + 1);
        n0 = str.indexOf(" ", n0 + 1);
        int n1 = str.lastIndexOf(" ", n0 - 3);

        if (n0 < 0 || n1 < 0) {
            System.out.println(n1 + "n1,n0" + n0 + "Export data2 problem");
            return false;
        }
        String tem1 = getDigit(str.substring(n1, n0));
        if (tem1.length() == 0) {
            System.out.println(n1 + "n1,n0" + n0 + "Export data2 problem");
            return false;
        }
        double data2_1 = Double.parseDouble(tem1);

        //-----
        n1 = str.indexOf(" ", n0 + 3);
        if (n1 < 0) {
            System.out.println(n1 + "n1,n0" + n0 + " data3 problem");
            return false;
        }
        tem1 = getDigit(str.substring(n0, n1));
        if (tem1.length() == 0) {
            System.out.println(n1 + "n1,n0" + n0 + " data4 problem");
            return false;
        }

        double data2_2 = Double.parseDouble(tem1);

        //--------
        n0 = str.indexOf(" ", n1 + 3);
        if (n0 < 0) {
            System.out.println(n1 + "n1,n0" + n0 + " data5 problem");
            return false;
        }
        tem1 = getDigit(str.substring(n1, n0));
        if (tem1.length() == 0) {
            System.out.println(n1 + "n1,n0" + n0 + " data6 problem");
            return false;
        }

        double data2_3 = Double.parseDouble(tem1);

        double data22 = getSSWR1((data2_1 - data2_2) * 100 / data2_2);
        double data29 = getSSWR1((data2_2 - data2_3) * 100 / data2_3);
        double data2 = getSSWR(data22 - uemrate + (data29 - twoprevious) * 0.5);
        //=============Core Retail Begin==============
        n0 = str.indexOf("......", n0);
        n0 = str.indexOf(",", n0 + 1);
        n0 = str.indexOf(" ", n0 + 1);
        n1 = str.lastIndexOf(" ", n0 - 3);

        if (n0 < 0 || n1 < 0) {
            System.out.println(n1 + "n1,n0" + n0 + " data7 problem");
            return false;
        }
        tem1 = getDigit(str.substring(n1, n0));
        if (tem1.length() == 0) {
            System.out.println(n1 + "n1,n0" + n0 + " data8 problem");
            return false;
        }
        double data1_1 = Double.parseDouble(tem1);

        //-----
        n1 = str.indexOf(" ", n0 + 3);
        if (n1 < 0) {
            System.out.println(n1 + "n1,n0" + n0 + " data9 problem");
            return false;
        }
        tem1 = getDigit(str.substring(n0, n1));
        if (tem1.length() == 0) {
            System.out.println(n1 + "n1,n0" + n0 + " data10 problem");
            return false;
        }

        double data1_2 = Double.parseDouble(tem1);

        //--------
        n0 = str.indexOf(" ", n1 + 3);
        if (n0 < 0) {
            System.out.println(n1 + "n1,n0" + n0 + " data11 problem");
            return false;
        }
        tem1 = getDigit(str.substring(n1, n0));
        if (tem1.length() == 0) {
            System.out.println(n1 + "n1,n0" + n0 + " data12 problem");
            return false;
        }

        double data1_3 = Double.parseDouble(tem1);

        double data11 = getSSWR1((data1_1 - data1_2) * 100 / data1_2);
        double data19 = getSSWR1((data1_2 - data1_3) * 100 / data1_3);
        double data1 = getSSWR1(data11 - emchg + (data19 - oneprevious) * 0.5);
        //--------------Core Retail End---------


        return true;
    }

    private boolean USD_CPI_DAT(String str, String filename, String betterword, double emchg, double oneprevious,
                                double uemrate, double twoprevious, int botype, int bctype, double boffset, int wotype,
                                int wctype, double woffset, double fbt, double fwt, double sbt, double swt, int submit,
                                int quantity, int threadid) {

        int n = Integer.parseInt(betterword);

        if (n < 0) {
            displayvfmsg(filename, "NO N specified", threadid);
            return false;
        }

        int n0 = str.lastIndexOf("</tbody>");
        for (int i = 0; i < n; i++) {
            n0 = str.lastIndexOf("<td>", n0 - 1);
        }

        int n1 = str.indexOf("</td>", n0 + 1);
        if (n0 < 0) {
            displayvfmsg(filename, "NO update-GDP_CPI_ORG", threadid);
            return false;
        }
        String tem = str.substring(n0, n1);
        //System.out.println(tem);
        if (tem.contains("&nbsp")) {
            displayvfmsg(filename, "NO update-USD_CPI_DAT:" + tem, threadid);
            return false;
        } else {
            displayokmsg(filename, threadid, "OK=" + tem);
            return true;
        }
       
    }

    private boolean USDCPI(String str, String filename, double emchg, double uemrate, double oneprevious,
                           double twoprevious, String verifyword, int threadid) {
        //  System.out.println("USD?");
        //----------Retail begin--------
        int n0 = str.indexOf(verifyword);


        if (n0 >= 0) {
            displayvfmsg(filename, "No update-cpi", threadid);
            return false;
        } else if (n0 < 0) {
            displayokmsg(filename, threadid, (str == null ? "OK" : str.substring(0, 500)));
            return true;
        }

        int n1 = str.indexOf("item", n0);

        System.out.println("Time=" + (new Time(System.currentTimeMillis() + timeoffset)).toString());
        System.out.println(str.substring(n1 + 25, n1 + 60));

        if (true)
            return true;


        String tem1 = getDigit(str.substring(n1, n0));
        if (tem1.length() == 0) {
            System.out.println(n1 + "n1,n0" + n0 + "Export data2 problem");
            return false;
        }
        double data2_1 = Double.parseDouble(tem1);

        //-----
        n1 = str.indexOf(" ", n0 + 3);
        if (n1 < 0) {
            System.out.println(n1 + "n1,n0" + n0 + " data3 problem");
            return false;
        }
        tem1 = getDigit(str.substring(n0, n1));
        if (tem1.length() == 0) {
            System.out.println(n1 + "n1,n0" + n0 + " data4 problem");
            return false;
        }

        double data2_2 = Double.parseDouble(tem1);

        //--------
        n0 = str.indexOf(" ", n1 + 3);
        if (n0 < 0) {
            System.out.println(n1 + "n1,n0" + n0 + " data5 problem");
            return false;
        }
        tem1 = getDigit(str.substring(n1, n0));
        if (tem1.length() == 0) {
            System.out.println(n1 + "n1,n0" + n0 + " data6 problem");
            return false;
        }

        double data2_3 = Double.parseDouble(tem1);

        double data22 = getSSWR1((data2_1 - data2_2) * 100 / data2_2);
        double data29 = getSSWR1((data2_2 - data2_3) * 100 / data2_3);
        double data2 = getSSWR(data22 - uemrate + (data29 - twoprevious) * 0.5);
        //=============Core Retail Begin==============
        n0 = str.indexOf("......", n0);
        n0 = str.indexOf(",", n0 + 1);
        n0 = str.indexOf(" ", n0 + 1);
        n1 = str.lastIndexOf(" ", n0 - 3);

        if (n0 < 0 || n1 < 0) {
            System.out.println(n1 + "n1,n0" + n0 + " data7 problem");
            return false;
        }
        tem1 = getDigit(str.substring(n1, n0));
        if (tem1.length() == 0) {
            System.out.println(n1 + "n1,n0" + n0 + " data8 problem");
            return false;
        }
        double data1_1 = Double.parseDouble(tem1);

        //-----
        n1 = str.indexOf(" ", n0 + 3);
        if (n1 < 0) {
            System.out.println(n1 + "n1,n0" + n0 + " data9 problem");
            return false;
        }
        tem1 = getDigit(str.substring(n0, n1));
        if (tem1.length() == 0) {
            System.out.println(n1 + "n1,n0" + n0 + " data10 problem");
            return false;
        }

        double data1_2 = Double.parseDouble(tem1);

        //--------
        n0 = str.indexOf(" ", n1 + 3);
        if (n0 < 0) {
            System.out.println(n1 + "n1,n0" + n0 + " data11 problem");
            return false;
        }
        tem1 = getDigit(str.substring(n1, n0));
        if (tem1.length() == 0) {
            System.out.println(n1 + "n1,n0" + n0 + " data12 problem");
            return false;
        }

        double data1_3 = Double.parseDouble(tem1);

        double data11 = getSSWR1((data1_1 - data1_2) * 100 / data1_2);
        double data19 = getSSWR1((data1_2 - data1_3) * 100 / data1_3);
        double data1 = getSSWR1(data11 - emchg + (data19 - oneprevious) * 0.5);
        //--------------Core Retail End---------


        if ((data1 >= 70) && data2 >= 1) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(25000, getSSWR(sf.eurusd - 0.0010), SELLLMT, EURUSD); //sell EURUSD
            System.out.println("EURUSD Sell Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.eurusd));
            value1.setText("+" + data1 + "(" + data11 + "..." + emchg + ") " + getSSWR(data11 - emchg));
            value1.setForeground(new Color(0, 153, 0));
        } else if ((data1 <= -70) && (data2 <= 0)) {
            if (sf != null && orderpermit.isSelected())
                sf.attackOrder(25000, getSSWR(sf.eurusd + 0.0010), BUYLMT, EURUSD); //buy EURUSD
            System.out.println("EURUSD Buy Order Issuring Time=" +
                               (new Time(System.currentTimeMillis() + timeoffset)).toString() + "," +
                               (sf == null ? "" : sf.eurusd));
            value1.setText(data1 + "(" + data11 + "..." + emchg + ")" + getSSWR(data11 - emchg));
            value1.setForeground(Color.red);
        } else // if(data<0.25 && data>-0.25)
        {
            value1.setText((data1 > 0 ? "+" : "") + data1 + "(" + data11 + "..." + emchg + ")" +
                           getSSWR(data11 - emchg));
            value1.setForeground(Color.blue);
            System.out.println("USDRetail is here:" + (new Time(System.currentTimeMillis() + timeoffset)).toString());
        }

        value2.setText(data2 + "(" + data22 + "..." + uemrate + ") " + getSSWR(data22 - uemrate));
        value2.setForeground(data2 > 0 ? new Color(0, 153, 0) : Color.red);
        onepreviousF.setText(getSSWR1(data19 - oneprevious) + "(" + data19 + "  " + oneprevious + ")");
        onepreviousF.setForeground(data19 >= oneprevious ? new Color(0, 153, 0) : Color.red);
        twopreviousF.setText(getSSWR1(data29 - twoprevious) + "(" + data29 + "  " + twoprevious + ")");
        twopreviousF.setForeground(data29 >= twoprevious ? new Color(0, 153, 0) : Color.red);

        return true;
    }

    private boolean USDTradBalance(String str, double emchg) {
        int n0 = str.indexOf("export");
        int n1 = str.indexOf("billion", n0);
        if (n0 < 0 || n1 < 0) {
            value1R.setText(n1 + "n1,n0" + n0 + "Export data problem");
            return false;
        }
        double data1 = Double.parseDouble(getDigit(str.substring(n0, n1)));

        n0 = str.indexOf("import", n0 + 1);
        n1 = str.indexOf("billion", n0 + 1);
        if (n0 < 0 || n1 < 0) {
            value1R.setText(n1 + "n1,n0" + n0 + "import data problem");
            return false;
        }
        double data2 = Double.parseDouble(getDigit(str.substring(n0, n1)));


        n0 = str.indexOf("billion", n1 + 1);
        n1 = str.lastIndexOf("$", n0);
        double data3 = 98765432;
        if (n0 < 0 || n1 < 0) {
            value1R.setText(n1 + "n1,n0" + n0 + "d3 data problem");
            value1R.setForeground(Color.red);
        } else
            data3 = Double.parseDouble(getDigit(str.substring(n1, n0)));

        n0 = str.indexOf("billion", n0 + 1);
        n1 = str.lastIndexOf("$", n0);
        double data4 = 98765432;
        if (n0 < 0 || n1 < 0) {
            value1R.setText(n1 + "n1,n0" + n0 + "d4 data problem");
            value1R.setForeground(Color.red);
        } else
            data4 = Double.parseDouble(getDigit(str.substring(n1, n0)));
        //  System.out.println(data1+" "+data2+" "+data3+" "+data4);

        double data11 = data1 - data2;
        if (Math.abs(data3 - 98765432) < 0.00001 || (Math.abs(Math.abs(data11) - data3)) > 0.2) {

            return false;
        }


        n0 = str.indexOf("export", n0 + 1);
        n0 = str.indexOf("export", n0 + 1);
        n1 = str.indexOf("billion", n0 + 1);
        if (n0 < 0 || n1 < 0) {
            value1R.setText(n1 + "n1,n0" + n0 + "previous export data problem");
            return false;
        }
        double data5 = Double.parseDouble(getDigit(str.substring(n0, n1)));

        n0 = str.indexOf("import", n0 + 1);
        n0 = str.indexOf("import", n0 + 1);
        n1 = str.indexOf("billion", n0 + 1);
        if (n0 < 0 || n1 < 0) {
            value1R.setText(n1 + "n1,n0" + n0 + "previous import data problem");
            return false;
        }
        double data6 = Double.parseDouble(getDigit(str.substring(n0, n1)));
        double data22 = data5 - data6;
        // System.out.println(data1+", "+data2+", "+data3+", "+data4+","+data22);
        if (Math.abs(data4 - 98765432) < 0.00001 || (Math.abs(Math.abs(data22) - data4)) > 0.2) {
            System.out.println("previous data not match");
            return false;
        }

        System.out.println(data1 + " " + data2 + " " + data3 + " " + data4);

        return true;
    }

    private int lastDigit(String str) {
        int ind = -1;
        char[] chars = str.trim().toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            if (Character.isDigit(chars[i])) {
                ind = i;
                break;
            }
        }
        return ind;
    }

    void log(String filename, String str) {
        if (System.getProperty("os.name").equalsIgnoreCase("Linux")) {
            return;
        }

        try {
            File dir = null;
            File file = null;
            if (System.getProperty("os.name").equalsIgnoreCase("Linux")) {

                dir = new File("/home/me/workplace/AttackLog");

            } else {
                dir = new File("D:\\AttackLog");
            }


            if (!dir.exists())
                dir.mkdirs();

            if (System.getProperty("os.name").equalsIgnoreCase("Linux")) {

                file = new File("/home/me/workplace/AttackLog/" + filename);

            } else {
                file = new File("D:\\AttackLog\\" + filename);
            }


            // System.out.println(filename+",log_content=\n"+str);
            if (!file.exists())
                file.createNewFile();

            FileWriter fstream = new FileWriter(file, true);
            BufferedWriter out = new BufferedWriter(fstream);
            out.write("\n" + str);
            out.close();


            /*
          Path dir=Paths.get("/AttackLog");
          if(Files.notExists(dir))
           Files.createDirectories(dir);

          Path file=Paths.get("/AttackLog/"+filename);

          if(Files.notExists(file))
            Files.createFile(file);
          Files.write(file, str.getBytes(), StandardOpenOption.CREATE,StandardOpenOption.APPEND);
          //*/
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void jCheckBox3_actionPerformed(ActionEvent e) {


    }

    private void pricelimit_actionPerformed(ActionEvent e) {
    }

    private void secondtd_actionPerformed(ActionEvent e) {
        if (!secondtd.isSelected())
            return;

        try {
            if (ipstatus == 0) {
                u = new URL("Http", currentip.trim(), "/" + currentfile.trim());
                //System.out.println("ipstatuse=0");
            } else if (ipstatus == 1 && jCheckBox1.isSelected())
                u = new URL((jTextField6.getText()).trim());
            else if (ipstatus == 1) {
                String st = ((String) jComboBox1.getSelectedItem()).trim();
                if (st.startsWith("www.", 0))
                    st = "http://" + st;
                u = new URL(st);
            }
            Filename2 =
                (String) wsname.getSelectedItem() + "_" +
                (new Date(System.currentTimeMillis() + timeoffset)).toString() + "_" +
                (new Time(System.currentTimeMillis() + timeoffset)).toString() + ".txt";
            Filename2 = Filename2.replace(":", "_");
            Filename2 = Filename2.replace(" ", "");
            log(Filename2,
                Filename2 + "\nKeyword:" + Keyword + "\nVerify Word:" + Verifyword + "\nCurrent IP:" + currentip +
                "\nCurrent File:" + currentfile + "\nIP Status:" + ipstatus + "\nSkip:" + Skip + "\nSkip Length:" +
                Length + "\nFirst Estimate:" + emchg + "\nSecond Estimate:" + Uemrate + "\nBackward Length:" +
                Betterlength + "\nStage:" + stages[0] + "\nUpdatetype:" + Updatetype + "\nFiletype:" + Filetype);

            std =
                new SecondThread(this, u, Skip, Length, Keyword, Verifyword, Betterlength, Filetype, Updatetype,
                                 getIndicatorID(wsname.getSelectedItem()), emchg, Uemrate, Oneprevious, Twoprevious,
                                 Betterword, Filename2, indicatorno1, onepreviousbase1, twopreviousbase1, 2);
            show.setText((String) wsname.getSelectedItem());
            td2info.setText("2-" + (String) wsname.getSelectedItem());
            std.setpara(botype1, bctype1, wotype1, wctype1, boffset1, woffset1, fbt1, fwt1, sbt1, swt1, submit1,
                        quantity1, gassign1);
            activetdno++;
            secondtd.setEnabled(false);
        } catch (IOException ee) {
            ee.printStackTrace();
        }
    }

    private void trdthread_actionPerformed(ActionEvent e) {
        if (!trdthread.isSelected())
            return;

        try {
            if (ipstatus == 0) {
                u = new URL("Http", currentip.trim(), "/" + currentfile.trim());
                //System.out.println("ipstatuse=0");
            } else if (ipstatus == 1 && jCheckBox1.isSelected())
                u = new URL((jTextField6.getText()).trim());
            else if (ipstatus == 1) {
                String st = ((String) jComboBox1.getSelectedItem()).trim();
                if (st.startsWith("www.", 0))
                    st = "http://" + st;
                u = new URL(st);
            }
            Filename3 =
                (String) wsname.getSelectedItem() + "_" +
                (new Date(System.currentTimeMillis() + timeoffset)).toString() + "_" +
                (new Time(System.currentTimeMillis() + timeoffset)).toString() + ".txt";
            Filename3 = Filename3.replace(":", "_");
            Filename3 = Filename3.replace(" ", "");
            log(Filename3,
                Filename3 + "\nKeyword:" + Keyword + "\nVerify Word:" + Verifyword + "\nCurrent IP:" + currentip +
                "\nCurrent File:" + currentfile + "\nIP Status:" + ipstatus + "\nSkip:" + Skip + "\nSkip Length:" +
                Length + "\nFirst Estimate:" + emchg + "\nSecond Estimate:" + Uemrate + "\nBackward Length:" +
                Betterlength + "\nStage:" + stages[0] + "\nUpdatetype:" + Updatetype + "\nFiletype:" + Filetype);
            trd =
                new SecondThread(this, u, Skip, Length, Keyword, Verifyword, Betterlength, Filetype, Updatetype,
                                 getIndicatorID(wsname.getSelectedItem()), emchg, Uemrate, Oneprevious, Twoprevious,
                                 Betterword, Filename3, indicatorno1, onepreviousbase1, twopreviousbase1, 3);
            show.setText((String) wsname.getSelectedItem());
            td3info.setText("3-" + (String) wsname.getSelectedItem());
            trd.setpara(botype1, bctype1, wotype1, wctype1, boffset1, woffset1, fbt1, fwt1, sbt1, swt1, submit1,
                        quantity1, gassign1);
            activetdno++;
            trdthread.setEnabled(false);
        } catch (IOException ee) {
            ee.printStackTrace();
        }
    }

    private void fourththread_actionPerformed(ActionEvent e) {
        if (!fourththread.isSelected())
            return;

        try {
            if (ipstatus == 0) {
                u = new URL("Http", currentip.trim(), "/" + currentfile.trim());
                //System.out.println("ipstatuse=0");
            } else if (ipstatus == 1 && jCheckBox1.isSelected())
                u = new URL((jTextField6.getText()).trim());
            else if (ipstatus == 1) {
                String st = ((String) jComboBox1.getSelectedItem()).trim();
                if (st.startsWith("www.", 0))
                    st = "http://" + st;
                u = new URL(st);
            }
            Filename4 =
                (String) wsname.getSelectedItem() + "_" +
                (new Date(System.currentTimeMillis() + timeoffset)).toString() + "_" +
                (new Time(System.currentTimeMillis() + timeoffset)).toString() + ".txt";
            Filename4 = Filename4.replace(":", "_");
            Filename4 = Filename4.replace(" ", "");
            log(Filename4,
                Filename4 + "\nKeyword:" + Keyword + "\nVerify Word:" + Verifyword + "\nCurrent IP:" + currentip +
                "\nCurrent File:" + currentfile + "\nIP Status:" + ipstatus + "\nSkip:" + Skip + "\nSkip Length:" +
                Length + "\nFirst Estimate:" + emchg + "\nSecond Estimate:" + Uemrate + "\nBackward Length:" +
                Betterlength + "\nStage:" + stages[0] + "\nUpdatetype:" + Updatetype + "\nFiletype:" + Filetype);
            f4rd =
                new SecondThread(this, u, Skip, Length, Keyword, Verifyword, Betterlength, Filetype, Updatetype,
                                 getIndicatorID(wsname.getSelectedItem()), emchg, Uemrate, Oneprevious, Twoprevious,
                                 Betterword, Filename4, indicatorno1, onepreviousbase1, twopreviousbase1, 4);
            show.setText((String) wsname.getSelectedItem());
            td4info.setText("4-" + (String) wsname.getSelectedItem());
            f4rd.setpara(botype1, bctype1, wotype1, wctype1, boffset1, woffset1, fbt1, fwt1, sbt1, swt1, submit1,
                         quantity1, gassign1);
            activetdno++;
            fourththread.setEnabled(false);
        } catch (IOException ee) {
            ee.printStackTrace();
        }
    }

    private void fifththread_actionPerformed(ActionEvent e) {
        if (!fifththread.isSelected())
            return;

        try {
            if (ipstatus == 0) {
                u = new URL("Http", currentip.trim(), "/" + currentfile.trim());
                //System.out.println("ipstatuse=0");
            } else if (ipstatus == 1 && jCheckBox1.isSelected())
                u = new URL((jTextField6.getText()).trim());
            else if (ipstatus == 1) {
                String st = ((String) jComboBox1.getSelectedItem()).trim();
                if (st.startsWith("www.", 0))
                    st = "http://" + st;
                u = new URL(st);
            }
            Filename5 =
                (String) wsname.getSelectedItem() + "_" +
                (new Date(System.currentTimeMillis() + timeoffset)).toString() + "_" +
                (new Time(System.currentTimeMillis() + timeoffset)).toString() + ".txt";
            Filename5 = Filename5.replace(":", "_");
            Filename5 = Filename5.replace(" ", "");
            log(Filename5,
                Filename5 + "\nKeyword:" + Keyword + "\nVerify Word:" + Verifyword + "\nCurrent IP:" + currentip +
                "\nCurrent File:" + currentfile + "\nIP Status:" + ipstatus + "\nSkip:" + Skip + "\nSkip Length:" +
                Length + "\nFirst Estimate:" + emchg + "\nSecond Estimate:" + Uemrate + "\nBackward Length:" +
                Betterlength + "\nStage:" + stages[0] + "\nUpdatetype:" + Updatetype + "\nFiletype:" + Filetype);
            f5rd =
                new SecondThread(this, u, Skip, Length, Keyword, Verifyword, Betterlength, Filetype, Updatetype,
                                 getIndicatorID(wsname.getSelectedItem()), emchg, Uemrate, Oneprevious, Twoprevious,
                                 Betterword, Filename5, indicatorno1, onepreviousbase1, twopreviousbase1, 5);
            show.setText((String) wsname.getSelectedItem());
            td5info.setText("5-" + (String) wsname.getSelectedItem()); // for display
            f5rd.setpara(botype1, bctype1, wotype1, wctype1, boffset1, woffset1, fbt1, fwt1, sbt1, swt1, submit1,
                         quantity1, gassign1);
            activetdno++;
            fifththread.setEnabled(false);
        } catch (IOException ee) {
            ee.printStackTrace();
        }
    }

    private void sixththread_actionPerformed(ActionEvent e) {
        if (!sixththread.isSelected())
            return;

        try {
            if (ipstatus == 0) {
                u = new URL("Http", currentip.trim(), "/" + currentfile.trim());
                //System.out.println("ipstatuse=0");
            } else if (ipstatus == 1 && jCheckBox1.isSelected())
                u = new URL((jTextField6.getText()).trim());
            else if (ipstatus == 1) {
                String st = ((String) jComboBox1.getSelectedItem()).trim();
                if (st.startsWith("www.", 0))
                    st = "http://" + st;
                u = new URL(st);
            }
            Filename6 =
                (String) wsname.getSelectedItem() + "_" +
                (new Date(System.currentTimeMillis() + timeoffset)).toString() + "_" +
                (new Time(System.currentTimeMillis() + timeoffset)).toString() + ".txt";
            Filename6 = Filename6.replace(":", "_");
            Filename6 = Filename6.replace(" ", "");
            log(Filename6,
                Filename6 + "\nKeyword:" + Keyword + "\nVerify Word:" + Verifyword + "\nCurrent IP:" + currentip +
                "\nCurrent File:" + currentfile + "\nIP Status:" + ipstatus + "\nSkip:" + Skip + "\nSkip Length:" +
                Length + "\nFirst Estimate:" + emchg + "\nSecond Estimate:" + Uemrate + "\nBackward Length:" +
                Betterlength + "\nStage:" + stages[0] + "\nUpdatetype:" + Updatetype + "\nFiletype:" + Filetype);
            s6rd =
                new SecondThread(this, u, Skip, Length, Keyword, Verifyword, Betterlength, Filetype, Updatetype,
                                 getIndicatorID(wsname.getSelectedItem()), emchg, Uemrate, Oneprevious, Twoprevious,
                                 Betterword, Filename6, indicatorno1, onepreviousbase1, twopreviousbase1, 6);
            show.setText((String) wsname.getSelectedItem());
            td6info.setText("6-" + (String) wsname.getSelectedItem()); // for display
            s6rd.setpara(botype1, bctype1, wotype1, wctype1, boffset1, woffset1, fbt1, fwt1, sbt1, swt1, submit1,
                         quantity1, gassign1);
            activetdno++;
            sixththread.setEnabled(false);
        } catch (IOException ee) {
            ee.printStackTrace();
        }
    }

    private void orderpermit_actionPerformed(ActionEvent e) {
        if (orderpermit.isSelected()) {
            orderpermit.setText("GO");
            orderpermit.setForeground(new Color(0, 153, 0));
        } else {
            orderpermit.setText("Stop");
            orderpermit.setForeground(Color.red);
        }
    }

    public void fillPairs(JComboBox jbc) {
        jbc.addItem("USDJPY");
        jbc.addItem("EURUSD");
        jbc.addItem("USDCAD");
        jbc.addItem("EURCHF");
        jbc.addItem("AUDUSD");
        jbc.addItem("NZDUSD");
        jbc.addItem("GBPUSD");
        jbc.addItem("EURGBP");
        jbc.addItem("GBPJPY");
        jbc.addItem("EURCAD");
        jbc.addItem("CADJPY");
        jbc.addItem("EURJPY");
        jbc.addItem("EURAUD");
        jbc.addItem("AUDJPY");
        jbc.addItem("EURNZD");
        jbc.addItem("NZDJPY");
        jbc.addItem("USDCHF");
        jbc.addItem("CHFJPY");
        jbc.setSelectedIndex(2);
        jbc.addItem("AUDCAD");
        jbc.addItem("NZDCAD");
        jbc.addItem("GBPCAD");
        jbc.addItem("CADCHF");
        jbc.addItem("GBPAUD");
        jbc.addItem("GBPNZD");
        jbc.addItem("GBPCHF");
        jbc.addItem("AUDNZD");

    }

    private void value5_actionPerformed(ActionEvent e) {
        try {
            con = DriverManager.getConnection(source);
            String str =
                "update Websites set ipstatus=? where IPADD='" + ((String) (jComboBox1.getSelectedItem())).trim() + "'";
            //  String str="update Websites set ip=?, file=? where IPADD='"+((String)(jComboBox1.getSelectedItem())).trim()+"'";

            PreparedStatement pst = con.prepareStatement(str);


            pst.setInt(1, (ipstatus = Integer.parseInt(value5.getText().trim())));
            //ipstatus=1;

            temint = pst.executeUpdate();
            if (temint <= 0)
                System.out.println("Not updated");
            else
                System.out.println("IP Status=" + ipstatus);

            //        }
            pst.close();
            con.close();
        } catch (Exception sqle) {
            sqle.printStackTrace();
            //  targetModel.addElement("Option Update Error");
        }
    }

    private void jCheckBox2_actionPerformed(ActionEvent e) {
        activetdno++;
        jCheckBox2.setEnabled(false);
    }

    public double getf5sprice(int c) {

        for (int i = 0; i < f5sc.length; i++) {

            if (f5sc[i] == c) {

                if (Math.abs(f5sprice[i] + 1) < 0.0001)
                    return sf.getpairprice(c);
                else
                    return f5sprice[i];
            }
        }

        return sf.getpairprice(c);
    }

    private void botypeC_actionPerformed(ActionEvent e) {
        surgeop(botypeC.getSelectedIndex());
    }

    private void surgeop(int ind) {
        if (ind == 0 || ind == 1) {
            pricesurgeF.setEnabled(true);
            pricesurge_cadF.setEnabled(true);
        } else {
            pricesurgeF.setEnabled(false);
            pricesurge_cadF.setEnabled(false);
        }
    }

    private void wotypeC_actionPerformed(ActionEvent e) {
        surgeop(wotypeC.getSelectedIndex());
    }

    private void submitC_actionPerformed(ActionEvent e) {
        if (submitC.getSelectedIndex() == 0) {
            bpermit.setEnabled(true);
            wpermit.setEnabled(true);
            bpermit_cad.setEnabled(false);
            wpermit_cad.setEnabled(false);
            pricesurgeF.setEnabled(true);
            pricesurge_cadF.setEnabled(false);
        } else if (submitC.getSelectedIndex() == 1) {
            bpermit.setEnabled(false);
            wpermit.setEnabled(false);
            bpermit_cad.setEnabled(true);
            wpermit_cad.setEnabled(true);
            pricesurge_cadF.setEnabled(true);
            pricesurgeF.setEnabled(false);
        } else {
            bpermit.setEnabled(true);
            wpermit.setEnabled(true);
            bpermit_cad.setEnabled(true);
            wpermit_cad.setEnabled(true);
            pricesurge_cadF.setEnabled(true);
            pricesurgeF.setEnabled(true);
        }

    }

    private void s7thread_actionPerformed(ActionEvent e) {
        if (!s7thread.isSelected())
            return;

        try {
            if (ipstatus == 0) {
                u = new URL("Http", currentip.trim(), "/" + currentfile.trim());
                //System.out.println("ipstatuse=0");
            } else if (ipstatus == 1 && jCheckBox1.isSelected())
                u = new URL((jTextField6.getText()).trim());
            else if (ipstatus == 1) {
                String st = ((String) jComboBox1.getSelectedItem()).trim();
                if (st.startsWith("www.", 0))
                    st = "http://" + st;
                u = new URL(st);
            }
            Filename2 =
                (String) wsname.getSelectedItem() + "_" +
                (new Date(System.currentTimeMillis() + timeoffset)).toString() + "_" +
                (new Time(System.currentTimeMillis() + timeoffset)).toString() + ".txt";
            Filename2 = Filename2.replace(":", "_");
            Filename2 = Filename2.replace(" ", "");
            log(Filename2,
                Filename2 + "\nKeyword:" + Keyword + "\nVerify Word:" + Verifyword + "\nCurrent IP:" + currentip +
                "\nCurrent File:" + currentfile + "\nIP Status:" + ipstatus + "\nSkip:" + Skip + "\nSkip Length:" +
                Length + "\nFirst Estimate:" + emchg + "\nSecond Estimate:" + Uemrate + "\nBackward Length:" +
                Betterlength + "\nStage:" + stages[0] + "\nUpdatetype:" + Updatetype + "\nFiletype:" + Filetype);

            td7 =
                new SecondThread(this, u, Skip, Length, Keyword, Verifyword, Betterlength, Filetype, Updatetype,
                                 getIndicatorID(wsname.getSelectedItem()), emchg, Uemrate, Oneprevious, Twoprevious,
                                 Betterword, Filename2, indicatorno1, onepreviousbase1, twopreviousbase1, 7);
            show.setText((String) wsname.getSelectedItem());
            td7info.setText("7-" + (String) wsname.getSelectedItem());
            td7.setpara(botype1, bctype1, wotype1, wctype1, boffset1, woffset1, fbt1, fwt1, sbt1, swt1, submit1,
                        quantity1, gassign1);
            activetdno++;
            s7thread.setEnabled(false);
        } catch (IOException ee) {
            ee.printStackTrace();
        }
    }

    private void e8thread_actionPerformed(ActionEvent e) {
        if (!e8thread.isSelected())
            return;

        try {
            if (ipstatus == 0) {
                u = new URL("Http", currentip.trim(), "/" + currentfile.trim());
                //System.out.println("ipstatuse=0");
            } else if (ipstatus == 1 && jCheckBox1.isSelected())
                u = new URL((jTextField6.getText()).trim());
            else if (ipstatus == 1) {
                String st = ((String) jComboBox1.getSelectedItem()).trim();
                if (st.startsWith("www.", 0))
                    st = "http://" + st;
                u = new URL(st);
            }
            Filename2 =
                (String) wsname.getSelectedItem() + "_" +
                (new Date(System.currentTimeMillis() + timeoffset)).toString() + "_" +
                (new Time(System.currentTimeMillis() + timeoffset)).toString() + ".txt";
            Filename2 = Filename2.replace(":", "_");
            Filename2 = Filename2.replace(" ", "");
            log(Filename2,
                Filename2 + "\nKeyword:" + Keyword + "\nVerify Word:" + Verifyword + "\nCurrent IP:" + currentip +
                "\nCurrent File:" + currentfile + "\nIP Status:" + ipstatus + "\nSkip:" + Skip + "\nSkip Length:" +
                Length + "\nFirst Estimate:" + emchg + "\nSecond Estimate:" + Uemrate + "\nBackward Length:" +
                Betterlength + "\nStage:" + stages[0] + "\nUpdatetype:" + Updatetype + "\nFiletype:" + Filetype);

            td8 =
                new SecondThread(this, u, Skip, Length, Keyword, Verifyword, Betterlength, Filetype, Updatetype,
                                 getIndicatorID(wsname.getSelectedItem()), emchg, Uemrate, Oneprevious, Twoprevious,
                                 Betterword, Filename2, indicatorno1, onepreviousbase1, twopreviousbase1, 8);
            show.setText((String) wsname.getSelectedItem());
            td8info.setText("8-" + (String) wsname.getSelectedItem());
            td8.setpara(botype1, bctype1, wotype1, wctype1, boffset1, woffset1, fbt1, fwt1, sbt1, swt1, submit1,
                        quantity1, gassign1);
            activetdno++;
            e8thread.setEnabled(false);
        } catch (IOException ee) {
            ee.printStackTrace();
        }
    }

    private void n9thread_actionPerformed(ActionEvent e) {
        if (!n9thread.isSelected())
            return;

        try {
            if (ipstatus == 0) {
                u = new URL("Http", currentip.trim(), "/" + currentfile.trim());
                //System.out.println("ipstatuse=0");
            } else if (ipstatus == 1 && jCheckBox1.isSelected())
                u = new URL((jTextField6.getText()).trim());
            else if (ipstatus == 1) {
                String st = ((String) jComboBox1.getSelectedItem()).trim();
                if (st.startsWith("www.", 0))
                    st = "http://" + st;
                u = new URL(st);
            }
            Filename2 =
                (String) wsname.getSelectedItem() + "_" +
                (new Date(System.currentTimeMillis() + timeoffset)).toString() + "_" +
                (new Time(System.currentTimeMillis() + timeoffset)).toString() + ".txt";
            Filename2 = Filename2.replace(":", "_");
            Filename2 = Filename2.replace(" ", "");
            log(Filename2,
                Filename2 + "\nKeyword:" + Keyword + "\nVerify Word:" + Verifyword + "\nCurrent IP:" + currentip +
                "\nCurrent File:" + currentfile + "\nIP Status:" + ipstatus + "\nSkip:" + Skip + "\nSkip Length:" +
                Length + "\nFirst Estimate:" + emchg + "\nSecond Estimate:" + Uemrate + "\nBackward Length:" +
                Betterlength + "\nStage:" + stages[0] + "\nUpdatetype:" + Updatetype + "\nFiletype:" + Filetype);

            td9 =
                new SecondThread(this, u, Skip, Length, Keyword, Verifyword, Betterlength, Filetype, Updatetype,
                                 getIndicatorID(wsname.getSelectedItem()), emchg, Uemrate, Oneprevious, Twoprevious,
                                 Betterword, Filename2, indicatorno1, onepreviousbase1, twopreviousbase1, 9);
            show.setText((String) wsname.getSelectedItem());
            td9info.setText("9-" + (String) wsname.getSelectedItem());
            td9.setpara(botype1, bctype1, wotype1, wctype1, boffset1, woffset1, fbt1, fwt1, sbt1, swt1, submit1,
                        quantity1, gassign1);
            activetdno++;
            n9thread.setEnabled(false);
        } catch (IOException ee) {
            ee.printStackTrace();
        }
    }

    private void t10thread_actionPerformed(ActionEvent e) {
        if (!t10thread.isSelected())
            return;

        try {
            if (ipstatus == 0) {
                u = new URL("Http", currentip.trim(), "/" + currentfile.trim());
                //System.out.println("ipstatuse=0");
            } else if (ipstatus == 1 && jCheckBox1.isSelected())
                u = new URL((jTextField6.getText()).trim());
            else if (ipstatus == 1) {
                String st = ((String) jComboBox1.getSelectedItem()).trim();
                if (st.startsWith("www.", 0))
                    st = "http://" + st;
                u = new URL(st);
            }
            Filename2 =
                (String) wsname.getSelectedItem() + "_" +
                (new Date(System.currentTimeMillis() + timeoffset)).toString() + "_" +
                (new Time(System.currentTimeMillis() + timeoffset)).toString() + ".txt";
            Filename2 = Filename2.replace(":", "_");
            Filename2 = Filename2.replace(" ", "");
            log(Filename2,
                Filename2 + "\nKeyword:" + Keyword + "\nVerify Word:" + Verifyword + "\nCurrent IP:" + currentip +
                "\nCurrent File:" + currentfile + "\nIP Status:" + ipstatus + "\nSkip:" + Skip + "\nSkip Length:" +
                Length + "\nFirst Estimate:" + emchg + "\nSecond Estimate:" + Uemrate + "\nBackward Length:" +
                Betterlength + "\nStage:" + stages[0] + "\nUpdatetype:" + Updatetype + "\nFiletype:" + Filetype);

            td10 =
                new SecondThread(this, u, Skip, Length, Keyword, Verifyword, Betterlength, Filetype, Updatetype,
                                 getIndicatorID(wsname.getSelectedItem()), emchg, Uemrate, Oneprevious, Twoprevious,
                                 Betterword, Filename2, indicatorno1, onepreviousbase1, twopreviousbase1, 10);
            show.setText((String) wsname.getSelectedItem());
            td10info.setText("10-" + (String) wsname.getSelectedItem());
            td10.setpara(botype1, bctype1, wotype1, wctype1, boffset1, woffset1, fbt1, fwt1, sbt1, swt1, submit1,
                         quantity1, gassign1);
            activetdno++;
            t10thread.setEnabled(false);
        } catch (IOException ee) {
            ee.printStackTrace();
        }
    }

    private void t11thread_actionPerformed(ActionEvent e) {
        if (!t11thread.isSelected())
            return;

        try {
            if (ipstatus == 0) {
                u = new URL("Http", currentip.trim(), "/" + currentfile.trim());
                //System.out.println("ipstatuse=0");
            } else if (ipstatus == 1 && jCheckBox1.isSelected())
                u = new URL((jTextField6.getText()).trim());
            else if (ipstatus == 1) {
                String st = ((String) jComboBox1.getSelectedItem()).trim();
                if (st.startsWith("www.", 0))
                    st = "http://" + st;
                u = new URL(st);
            }
            Filename2 =
                (String) wsname.getSelectedItem() + "_" +
                (new Date(System.currentTimeMillis() + timeoffset)).toString() + "_" +
                (new Time(System.currentTimeMillis() + timeoffset)).toString() + ".txt";
            Filename2 = Filename2.replace(":", "_");
            Filename2 = Filename2.replace(" ", "");
            log(Filename2,
                Filename2 + "\nKeyword:" + Keyword + "\nVerify Word:" + Verifyword + "\nCurrent IP:" + currentip +
                "\nCurrent File:" + currentfile + "\nIP Status:" + ipstatus + "\nSkip:" + Skip + "\nSkip Length:" +
                Length + "\nFirst Estimate:" + emchg + "\nSecond Estimate:" + Uemrate + "\nBackward Length:" +
                Betterlength + "\nStage:" + stages[0] + "\nUpdatetype:" + Updatetype + "\nFiletype:" + Filetype);

            td11 =
                new SecondThread(this, u, Skip, Length, Keyword, Verifyword, Betterlength, Filetype, Updatetype,
                                 getIndicatorID(wsname.getSelectedItem()), emchg, Uemrate, Oneprevious, Twoprevious,
                                 Betterword, Filename2, indicatorno1, onepreviousbase1, twopreviousbase1, 11);
            show.setText((String) wsname.getSelectedItem());
            td11info.setText("11-" + (String) wsname.getSelectedItem());
            td11.setpara(botype1, bctype1, wotype1, wctype1, boffset1, woffset1, fbt1, fwt1, sbt1, swt1, submit1,
                         quantity1, gassign1);
            activetdno++;
            t11thread.setEnabled(false);
        } catch (IOException ee) {
            ee.printStackTrace();
        }
    }

    private void trdreset_actionPerformed(ActionEvent e) {

        this.secondtd.setSelected(false);


        this.trdthread.setSelected(false);


        this.fifththread.setSelected(false);
        this.fourththread.setSelected(false);
        this.sixththread.setSelected(false);
        s7thread.setSelected(false);
        e8thread.setSelected(false);
        n9thread.setSelected(false);
        t10thread.setSelected(false);
        t11thread.setSelected(false);
        jCheckBox2.setSelected(false);

        this.secondtd.setEnabled(true);
        this.trdthread.setEnabled(true);
        this.fifththread.setEnabled(true);
        this.fourththread.setEnabled(true);
        this.sixththread.setEnabled(true);
        s7thread.setEnabled(true);
        e8thread.setEnabled(true);
        n9thread.setEnabled(true);
        t10thread.setEnabled(true);
        t11thread.setEnabled(true);
        jCheckBox2.setEnabled(true);

        if (rd != null)
            rd.interrupt();
        if (rd2 != null)
            rd2.interrupt();
        if (rd3 != null)
            rd3.interrupt();

        if (rd4 != null)
            rd4.interrupt();
        if (rd5 != null)
            rd5.interrupt();
        if (rd6 != null)
            rd6.interrupt();
        if (rd7 != null)
            rd7.interrupt();
        if (rd8 != null)
            rd8.interrupt();
        if (rd9 != null)
            rd9.interrupt();
        if (rd10 != null)
            rd10.interrupt();
        if (rd11 != null)
            rd11.interrupt();

        activetdno = 0;
        for (int i = 0; i < f5sc.length; i++) {
            f5sc[i] = -1;
            f5sprice[i] = -1;
        }
        td2info.setText("2");
        td3info.setText("3");
        td4info.setText("4");
        td5info.setText("5");
        td6info.setText("6");
        td7info.setText("7");
        td8info.setText("8");
        td9info.setText("9");
        td10info.setText("10");
        td11info.setText("11");
        if (sf != null) {
            sf.attackerlock = true;
            sf.wakeuplocker = true;
        }


    }

    private boolean FactoryCalendar(String str, int indicatorno) {

        // System.out.println(str);
        Timestamp tsp = null;
        int n0 = 0, n1 = 0, n3 = 0, n4, n5, n6, id = 0, temn = 0;
        long date = 0;
        byte as = 0, impact = 0, ps = 0;
        String a = "", f = "", p = "", r = "";
        String tem1 = "", tem = "", unit = "", tem2 = "", time = "", cur = "", event = "";
        schedule.clear();
        para5.removeAllItems();
        boolean finish = false;

        n5 = str.indexOf("data-eventid=");
        if (n5 < 0) {
            displayvfmsg("Factory", "Finished", 0);
            // System.out.println("n5"+n5);
            return true;
        }

        while (!finish) {

            unit = "";
            as = 0;
            ps = 0;
            a = "";
            f = "";
            p = "";
            r = "";
            n6 = str.indexOf("data-eventid=", n5 + 10);
            if (n6 < 0) {

                n6 = str.indexOf("</table>", n5 + 10);
                if (n6 < 0) {
                    displayerrmsg("Factory", 0, n0, n1, "Finished");
                    //System.out.println("n6"+n6);

                    return true;
                }

            }
            tem = str.substring(n5, n6);
            //System.out.println("\n"+tem);

            //id
            n0 = tem.indexOf("data-eventid=");
            if (n0 < 0) {
                displayvfmsg("Factory", "Finished", 0);
                // return true;
            }
            n1 = tem.indexOf("<td", n0 + 1);
            if (n1 < 0) {
                displayerrmsg("Factory", 0, n0, n1, "Finished");
                // finish=true;
            }
            tem2 = (getDigit(tem.substring(n0, n1))).replace("-", "");
            if (tem2.isEmpty()) {
                n5 = n6;
                continue;
            }


            id = Integer.parseInt(tem2);
            //   System.out.print((id=Integer.parseInt(tem2))+"    ");

            //date

            n0 = n1;
            // System.out.println("hi="+n0);

            n1 = tem.indexOf("</td>", n0 + 1);
            if (n1 < 0) {
                displayerrmsg("Factory", 0, n0, n1, "Finished");
                // return false;
            }

            tem1 = tem.substring(n0, n1);
            n3 = tem1.indexOf("<span>");
            if (n3 >= 0) {
                n4 = tem1.indexOf("</span>", n3);
                String temdate = (new Date(System.currentTimeMillis())).toString();
                date = getDT(tem1.substring(n3 + 6, n4), temdate.substring(0, 4));
                // System.out.print((new Date(date)).toString()+"    ");
                // System.out.print(date+"    ");
            } else if (date != 0) {
                // System.out.print((new Date(date)).toString()+"    ");
                // System.out.print(date+"    ");



            }


            //time:
            n0 = tem.indexOf("<td", n1 + 1);
            // System.out.println("hi="+n0);
            if (n0 < 0) {
                displayvfmsg("Factory", "Finished", 0);
                // return false;
            }
            n1 = tem.indexOf("</td>", n0 + 1);
            if (n1 < 0) {
                displayerrmsg("Factory", 0, n0, n1, "Finished");
                //return false;
            }


            tem1 = tem.substring(n0, n1);
            if (tem1.contains("upnext")) {
                n3 = tem1.indexOf("\"upnext\">");
                n4 = tem1.indexOf("</span>", n3);
                tem2 = tem1.substring(n3 + 9, n4);
                if (!tem2.isEmpty()) {

                    time = tem2;

                }
            } else if (tem1.contains("time")) {
                tem2 = tem1.substring(17);
                if (!tem2.isEmpty()) {
                    time = tem2;
                }

            }


            //currency
            n0 = tem.indexOf("<td", n1 + 1);
            // System.out.println("hi="+n0);
            if (n0 < 0) {
                displayvfmsg("Factory", "Finished", 0);
                // return false;
            }
            n1 = tem.indexOf("</td>", n0 + 1);
            if (n1 < 0) {
                displayerrmsg("Factory", 0, n0, n1, "Finished");
                // return false;
            }

            cur = tem.substring(n0 + 21, n1);
            // System.out.print((cur=tem.substring(n0+21,n1))+"    ");


            //impact
            n0 = tem.indexOf("<td", n1 + 1);
            // System.out.println("hi="+n0);
            if (n0 < 0) {
                displayvfmsg("Factory", "Finished", 0);
                // return false;
            }
            n1 = tem.indexOf("</td>", n0 + 1);
            if (n1 < 0) {
                displayerrmsg("Factory", 0, n0, n1, "Finished");
                // return false;
            }


            tem1 = tem.substring(n0, n1);
            if (tem1.contains("medium impact expected")) {
                //  System.out.print("Medium"+"    ");
                impact = 2;
            } else if (tem1.contains("high impact expected")) {
                // System.out.print("High"+"    ");
                impact = 3;
            } else if (tem1.contains("low impact expected")) {
                //   System.out.print("Low"+"    ");
                impact = 1;
            }
            //event

            n0 = tem.indexOf("<td", n1 + 1);
            // System.out.println("hi="+n0);
            if (n0 < 0) {
                displayvfmsg("Factory", "Finished", 0);
                // return false;
            }
            n1 = tem.indexOf("</td>", n0 + 1);
            if (n1 < 0) {
                displayerrmsg("Factory", 0, n0, n1, "Finished");
                // return false;
            }
            tem1 = tem.substring(n0, n1);
            n3 = tem1.indexOf("<span>");
            n4 = tem1.indexOf("</span>", n3);

            event = tem1.substring(n3 + 6, n4);
            //System.out.print((event=tem1.substring(n3+6,n4))+"    ");


            String timestring = (new Date(date)).toString() + " " + getTimestamp(time);
            timestring = timestring.trim();
            // System.out.println(timestring.length()+"this="+timestring);
            if (timestring.length() >= 18) {
                tsp = Timestamp.valueOf(timestring);
                //  System.out.println(timestring+" "+tsp.getTime()+"  "+(new Date(date)).getTime());

                // if(tsp.getTime()>System.currentTimeMillis()){
                //     updateschedule(id,tsp.getTime(),cur,impact,event);
                //  }
            }


            //actuall

            n0 = tem.indexOf("actual", n1 + 1);
            // System.out.println("hi="+n0);
            if (n0 < 0) {
                displayvfmsg("Factory", "Finished", 0);
                // return false;
            }
            n1 = tem.indexOf("</td>", n0 + 1);
            if (n1 < 0) {
                displayerrmsg("Factory", 0, n0, n1, "Finished");
                //  return false;
            }

            tem1 = tem.substring(n0, n1);
            tem2 = getDigit(tem1);
            if (!tem2.isEmpty()) {
                //System.out.print(a=tem2);
                a = tem2;
                if (tem1.contains("better")) {
                    tem1 = tem1.substring(tem1.length() - 13);
                    as = 1;
                } else if (tem1.contains("worse")) {
                    tem1 = tem1.substring(tem1.length() - 13);
                    as = -1;
                } else {
                    tem1 = tem1.substring(tem1.length() - 3);
                    as = 0;
                }
                // a=Double.parseDouble(tem2);
                // System.out.print(a);
                //  tem1=tem1.substring(tem1.length()-10);
                // System.out.println(tem1);
                if (tem1.contains("%")) {
                    unit = "%";
                    //  System.out.print("%      ");
                } else if (tem1.contains("m")) {
                    unit = "M";
                    //    System.out.print("M      ");
                } else if (tem1.contains("k")) {
                    unit = "K";
                    //   System.out.print("K      ");
                } else if (tem1.contains("b")) {
                    unit = "B";
                    //   System.out.print("B      ");
                } else if (tem1.contains("t")) {
                    unit = "T";
                    //   System.out.print("T      ");
                }
                // System.out.print("<<"+tem1+">>");

            } else {
                //  n5=n6;
                //  System.out.println("");
                //  continue;
            }
            //forcset
            n0 = tem.indexOf("forecast", n1 + 1);
            // System.out.println("hi="+n0);
            if (n0 < 0) {
                displayvfmsg("Factory", "Finished", 0);
                //  return false;
            }
            n1 = tem.indexOf("</td>", n0 + 1);
            if (n1 < 0) {
                displayerrmsg("Factory", 0, n0, n1, "Finished");
                //  return false;
            }


            tem1 = tem.substring(n0, n1);
            if (!getDigit(tem1).isEmpty()) {
                f = getDigit(tem1);
                //System.out.print((f=getDigit(tem1)));

                // System.out.print(unit+"       ");
            }
            //prvious

            n0 = tem.indexOf("previous", n1 + 1);
            // System.out.println("hi="+n0);
            if (n0 < 0) {
                displayvfmsg("Factory", "Finished", 0);
                //  return false;
            }
            n1 = tem.indexOf("</td>", n0 + 1);
            if (n1 < 0) {
                displayerrmsg("Factory", 0, n0, n1, "Finished");
                //  return false;
            }

            tem1 = tem.substring(n0, n1);
            if (tem1.contains("revised")) {
                n3 = tem1.indexOf("revised");
                n4 = tem1.indexOf(">", n3);
                p = getDigit(tem1.substring(n4));
                r = getDigit(tem1.substring(n3, n4));
                // System.out.print(p=getDigit(tem1.substring(n4))+"     ");
                // System.out.print(r=getDigit(tem1.substring(n3,n4))+" ");
                tem1 = tem1.substring(n3, n4);
                if (tem1.contains("better"))
                    ps = 1;
                else if (tem1.contains("worse"))
                    ps = -1;
                else
                    ps = 0;
            } else {
                //System.out.print((p=getDigit(tem1))+"     ");
                p = getDigit(tem1);
                r = "";
            }
           
            if (!a.isEmpty())
                updatedata(id, date, time, cur, impact, event, as, a, f, p, r, ps, unit);


            if (tsp != null && tsp.getTime() > System.currentTimeMillis() &&
                ((tsp.getTime() - System.currentTimeMillis()) / 1000 / 60) < 60 * 24 * 180) {
                updateschedule(id, tsp.getTime(), cur, impact, event, a, f, p, r, as, ps);
                // System.out.println("ScheduleUpdated:  "+cur+"  "+time+",  "+((tsp.getTime()-System.currentTimeMillis())/1000/60));
            } else {

                /*
               if(tsp!=null)
                System.out.println("Schedule--Not--Updated:  "+cur+"  "+time+",  "+((tsp.getTime()-System.currentTimeMillis())/1000/60)+"         "+tsp.toString());
                 else
                System.out.println("Schedule--Not--Updated:  "+cur+"  "+time);
                //*/
            }

            n5 = n6;

        }


        return true;
    }

    private void updatedata(int id, long date, String time, String cur, byte impact, String event, byte as, String a,
                            String f, String p, String r, byte ps, String unit) {
        // String temsource="jdbc:derby:c:\\Users\\Zule\\DukaDatabase\\indexs;create=false";
        try {
            con = DriverManager.getConnection(secondSource);
            ste = con.createStatement();
            //con.getMetaData().
            rs = ste.executeQuery("select dataid from economicdata where dataid=" + id + " and date0=" + date);

            if (rs.next()) {
                // System.out.println("insert duplica");
                rs.close();
                String str =
                    "update economicdata set revised='" + r + "',previous='" + p + "',actual='" + a + "',actualcolor=" +
                    as + ",prviouscolor=" + ps + ",time0='" + time + "',date0=" + date + " where dataid=" + id +
                    " and date0=" + date;
                int in = ste.executeUpdate(str);

            
                ste.close();
                con.close();

            } else {


                rs.close();
                String str =
                    "insert into economicdata values (" + id + "," + date + ",'" + time + "','" + cur + "'," + impact +
                    ",'" + event + "'," + as + ",'" + a + "','" + f + "'," + ps + ",'" + p + "','" + r + "','" + unit +
                    "','')";
                
                int in = ste.executeUpdate(str);

                ste.close();
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            // System.exit(0);
        }
    }

    public void updateschedule(int id, long timestamp, String cur, byte impact, String event, String a, String f,
                               String p, String r, byte as, byte ps) {
        //String temsource="jdbc:derby:c:\\Users\\Zule\\DukaDatabase\\indexs;create=false";
        try {
            con = DriverManager.getConnection(secondSource);
            ste = con.createStatement();
            //con.getMetaData().
            rs = ste.executeQuery("select dataid from schedules where dataid=" + id + " and timestamp0=" + timestamp);

            if (rs.next()) {
                // System.out.println("insert duplica");
                rs.close();
                String str =
                    "update schedules set revised='" + r + "',previous='" + p + "',actual='" + a + "',forecast='" + f +
                    "',actualcolor=" + as + ",previouscolor=" + ps + ",timestamp0=" + timestamp + " where dataid=" +
                    id + " and timestamp0=" + timestamp;
                int in = ste.executeUpdate(str);

               
            } else {


                rs.close();
                String str =
                    "insert into schedules values (" + id + "," + timestamp + ",'" + cur + "'," + impact + ",'" +
                    event + "','','" + a + "','" + f + "','" + r + "','" + p + "'," + as + "," + ps + ")";
               
                int in = ste.executeUpdate(str);

                ste.close();
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            // System.exit(0);
        }
    }

    private String getTimestamp(String time) {

        if (time.contains("am")) {
            time = time.trim().replace("am", "");
            int n0 = time.indexOf(":");
            String tem1 = time.substring(0, n0);
            if (tem1.length() == 1) {
                time = "0" + time + ":00";
            } else if (tem1.length() == 2) {
                time = time + ":00";
                if (Integer.parseInt(tem1) == 12) {
                    time = "*" + time;
                    time = time.replace("*12:", "00:");
                }
            } else
                return "";

            return time.replace(" ", "");
        } else if (time.contains("pm")) {
            time = time.trim().replace("pm", "");
            int n0 = time.indexOf(":");
            String tem1 = time.substring(0, n0);
            if (tem1.length() <= 2) {
                int tem2 = Integer.parseInt(tem1);
                tem1 = time.substring(n0 + 1);
                time = (tem2 + 12) + ":" + tem1 + ":00";
            } else
                return "";

            return time.replace(" ", "");

        }

        return "";
    }

    private long getDT(String date, String year) {
        String number = getDigit(date);
        if (date.contains("nov"))
            return Date.valueOf(year + "-" + "11-" + number).getTime();
        else if (date.contains("dec"))
            return Date.valueOf(year + "-" + "12-" + number).getTime();
        else if (date.contains("oct"))
            return Date.valueOf(year + "-" + "10-" + number).getTime();
        else if (date.contains("sep"))
            return Date.valueOf(year + "-" + "09-" + number).getTime();

        else if (date.contains("aug"))
            return Date.valueOf(year + "-" + "08-" + number).getTime();

        else if (date.contains("jul"))
            return Date.valueOf(year + "-" + "07-" + number).getTime();
        else if (date.contains("jan"))
            return Date.valueOf(year + "-" + "01-" + number).getTime();

        else if (date.contains("jun"))
            return Date.valueOf(year + "-" + "06-" + number).getTime();
        else if (date.contains("may"))
            return Date.valueOf(year + "-" + "05-" + number).getTime();
        else if (date.contains("apr"))
            return Date.valueOf(year + "-" + "04-" + number).getTime();
        else if (date.contains("mar"))
            return Date.valueOf(year + "-" + "03-" + number).getTime();
        else if (date.contains("feb"))
            return Date.valueOf(year + "-" + "02-" + number).getTime();
        else

            return 0;
    }

    private boolean FactoryCalendarbackup(String str, int indicatorno) {

        // System.out.println(str);

        int n0 = 0, n1 = 0, count = 0;
        String tem1 = "", cur = "", title = "", id = "-1", time = "";
        schedule.clear();
        para5.removeAllItems();
        boolean finish = false;

        while (!finish) {
            n0 = str.indexOf("data-eventid=", n0);
            // System.out.println("hi="+n0);
            if (n0 < 0) {
                displayvfmsg("Factory", "Finished", 0);
                return true;
            }
            n1 = str.indexOf(">", n0 + 1);
            if (n1 < 0) {
                displayerrmsg("Factory", 0, n0, n1, "Finished");
                return false;
            }

            id = (getDigit(str.substring(n0, n1))).replace("-", "");

            n1 = str.indexOf("</td>", n1 + 1);
            n0 = str.lastIndexOf("\">", n1);

            if (n1 < 0 || n0 < 0) {
                displayerrmsg("Factory", 0, n0, n1, "half way00");
                return false;
            }

            tem1 = str.substring(n0 + 1, n1);
            if (tem1.length() >= 11) {
                tem1 = str.substring(n0 + 2, n1 - 6);
                jTextField7.append("\n\n----------------------" + tem1 + "----------------------------\n");
            }


            n1 = str.indexOf("</td>", n1 + 1);

            n0 = str.lastIndexOf(">", n1);

            if (n1 < 0 || n0 < 0) {
                displayerrmsg("Factory", 0, n0, n1, "half way0");
                return false;
            }

            time = str.substring(n0 + 1, n1);


            n1 = str.indexOf("</td>", n1 + 1);
            n0 = str.lastIndexOf(">", n1);

            if (n1 < 0 || n0 < 0) {
                displayerrmsg("Factory", 0, n0, n1, "half way");
                return false;
            }

            cur = str.substring(n0 + 1, n1);

            n0 = str.indexOf("</td>", n1 + 1);
            if (n1 < 0 || n0 < 0) {
                displayerrmsg("Factory", 0, n0, n1, "half way2");
                return false;
            }
            tem1 = str.substring(n1, n0);
            if ((tem1.contains(" low ") || tem1.contains("holiday") || tem1.contains("low")) && indicatorno == 0) {
                n0 = str.indexOf("<tr", n0 + 1);
                continue;
            }

            n0 = str.indexOf("</div>", n0 + 1);
            n1 = str.lastIndexOf("<div>", n0);

            if (n1 < 0 || n0 < 0) {
                displayerrmsg("Factory", 0, n0, n1, "half way3");
                return false;
            }
            title = str.substring(n1 + 5, n0);

            jTextField7.append("\n" + count + "  " + id + "  " + time + "  " + cur + "   " + title);
            String[] tem = new String[] { id, time, cur, title };
            schedule.addElement(tem);
            para5.addItem(count);
            count++;

            n0 = str.indexOf("<tr", n0 + 1);
            if (n0 < 0) {
                displayvfmsg("Factory", "Finishedm", 0);
                return true;
            }
            continue;

        }

        return true;
    }

    private void para5_actionPerformed(ActionEvent e) {

        if (schedule.size() <= 0)
            return;

        String[] tem = (String[]) schedule.get(para5.getSelectedIndex());
        indicatornoF.setText(tem[0]);
        betterwordF.setText(tem[1]);
        jTextField6.setText(tem[2] + "-" + tem[3]);
    }
}
