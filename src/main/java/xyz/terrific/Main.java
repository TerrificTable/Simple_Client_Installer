package xyz.terrific;


import xyz.terrific.gui.InstallerFrame;
import xyz.terrific.theme.FrameTheme;

import javax.swing.*;

/**
 * @author TerrificTable55
 * @version 1.0
 */
public class Main {

    public static String resources = "src/main/resources/";
    public static String json_url = "https://anonfiles.com/167bOdl7y9/test_json";
    public static String jar_url = "https://anonfiles.com/N37eO1l1y0/test_jar";

    public static InstallerFrame frame;

    /**
     * Creates a new InstallerFrame, and sets some stuff like icon and title, and does some other stuff
     * @param args never used
     * @throws UnsupportedLookAndFeelException in case `LookAndFeel` aka Theme can't be loaded / installed
     */
    public static void main(String[] args) throws UnsupportedLookAndFeelException {

        frame = new InstallerFrame();
        frame.setIconImage(new ImageIcon(resources + "images/icon.png").getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.btn_refresh.setVisible(false);
        frame.setTitle("Client Installer");

        // Theme Based on XCode-Dark
        UIManager.setLookAndFeel(new FrameTheme());
        SwingUtilities.updateComponentTreeUI(frame);

        frame.btn_uninstall.setEnabled(false);
        frame.btn_install.setEnabled(false);

        frame.installed_table.setDefaultEditor(Object.class, null);
        frame.progress_bar.setVisible(false);
        frame.setVisible(true);

    }

}