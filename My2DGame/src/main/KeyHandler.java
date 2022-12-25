package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    public boolean upPressed, downPressed, leftPressed, rightPressed;
    @Override
    public void keyTyped(KeyEvent e) {

    }
    // DEBUGGING
    boolean checkDrawTime = false;

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        // up
        if (code == KeyEvent.VK_W) {
            upPressed = true;
        }
        // down
        if (code == KeyEvent.VK_S) {
            downPressed = true;
        }
        // left
        if (code == KeyEvent.VK_A) {
            leftPressed = true;
        }
        // right
        if (code == KeyEvent.VK_D) {
            rightPressed = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        // up
        if (code == KeyEvent.VK_W) {
            upPressed = false;
        }
        // down
        if (code == KeyEvent.VK_S) {
            downPressed = false;
        }
        // left
        if (code == KeyEvent.VK_A) {
            leftPressed = false;
        }
        // right
        if (code == KeyEvent.VK_D) {
            rightPressed = false;
        }
        // DEBUGGING
        if(code == KeyEvent.VK_T) {
            if(checkDrawTime == true) {
                checkDrawTime = false;
            } else if(checkDrawTime == false) {
                checkDrawTime = true;
            }
        }
    }
}
