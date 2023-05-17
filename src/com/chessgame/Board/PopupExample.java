package com.chessgame.Board;
import Login_Form.Music;
import com.chessgame.Pieces.Piece;
import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class PopupExample {
    static int  wkills = 0;
    static int  bkills = 0;

    /*
    the first constructor is used for sound effect and popup messages , it takes a piece object to find its character
    and a frame object to fit the messages inside the frame.
    */
    public  PopupExample(Piece p ) throws LineUnavailableException,
    IOException, UnsupportedAudioFileException {

        Music music = new Music();                                     // object of class music.
        String soundEffect = "nowhere.wav";                            // sound effect path.
        music.PlaySoundEffect(soundEffect);

        int seconds = 3;                                               // The number of seconds to display the popup message
        String[]message = {   " انه السد العالى يا غالى " , " و مش بأيدى يابا ", " باتمان احمد باتمان  ",
        " خالتى بتسلم عليك ","فيل ارسنال يضرب ولا يبالى ", " هتدفع يعنى هتدفع "};

    int index = switch (p.getClass().getName().split("Pieces.")[1]) {
        //to get the name of the piece and give it a specified number for a message from the array.
        case "Pawn" -> 3;
        case "Knight" -> 2;
        case "Bishop" -> 4;
        case "King" -> 1;
        case "Queen" -> 5;
        default -> 0;
    };
        JDialog dialog = new JDialog();                               // frame to view text only.
        JLabel label = new JLabel(message[index]);
        dialog.setUndecorated(true);                                  // to remove bounds of the dialog frame.
        dialog.add(label);


        Dimension size = label.getPreferredSize();
        dialog.setSize(size.width+20,size.height+20);   //make dialog size bigger than label by 20.
        dialog.setLocationRelativeTo(null);                         //to make the frame as a reference to fit the messages in.
        if(p.isWhite) {
            dialog.setLocation(600, 50);
            wkills ++;
            //to put the message beside the white player
        }else
        {
            dialog.setLocation(880,50);
            bkills++;
            //to put the message beside the black player
        }
        dialog.pack();                                              // fit the dialog with the label
        dialog.setVisible(true);

        // Create a timer to close the dialog after the specified number of seconds
        ActionListener taskPerformer = e -> dialog.dispose();
        new Timer(seconds * 1000, taskPerformer).start();

    }
  // a counter for ( عادل شكل ) image ( poly bug fixing ).
   static public int  counter =0 ; //constructor for adel image
    public PopupExample( ) {

        if (counter == 0) {
            ImageIcon icon =new ImageIcon ("adel_sh.jpg");
            JFrame frame = new JFrame();
            frame.setSize(icon.getIconWidth(), icon.getIconHeight()); // fit frame with image size
            frame.setLocationRelativeTo(null);                        //put the frame in the center.

            JLabel label = new JLabel ();
            label.setIcon (icon);
            frame.add (label);
            frame.setUndecorated(true);
            frame.setVisible(true);
            counter++;
            // timer for the image of 2 seconds.
            ActionListener taskPerformer = e -> frame.dispose();
            new Timer(2 * 1000, taskPerformer).start();
        }
    }
}
