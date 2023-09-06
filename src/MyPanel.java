package graphicsSeminar;

import java.awt.*;

import javax.swing.*;

public class MyPanel extends JPanel {

	final int PANEL_WIDTH = 1920;
	final int PANEL_HEIGHT = 1080;

	MyPanel() {

		this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
		this.setBackground(Color.cyan);

	}

	@Override
	public void paint(Graphics g) {

		super.paint(g); // paint background

		Graphics2D draw = (Graphics2D) g;

		int w = 1920;
		int h = 1080;

		int w1 = w / 2; // w1 = 960
		int h1 = h / 2; // h1 = 540
		Thread t = new Thread();
		t.start();

//////////////////////////////////////////////////Ground Level//////////////////////////////////////////////////
		draw.drawLine(0, h1 + 100, w, h1 + 100);

//////////////////////////////////////////////////Sun//////////////////////////////////////////////////

		draw.setStroke(new BasicStroke(2));
		draw.setColor(Color.yellow);
		draw.fillOval(200, 70, 140, 140);
		draw.setColor(Color.orange.darker());
		draw.drawOval(200, 70, 140, 140);

//////////////////////////////////////////////////Mountain//////////////////////////////////////////////////
		draw.setColor(Color.white);
		;
		draw.fillOval(880, 240, 2000, 2000);

//////////////////////////////////////////////////Trees//////////////////////////////////////////////////

		draw.setStroke(new BasicStroke(5));

		draw.setColor(Color.green.darker());

		draw.drawLine(30, h1 + 20, 30, h1 + 100);

		draw.drawLine(90, h1 + 20, 90, h1 + 100);

		draw.drawLine(1300, h1 + 20, 1300, h1 + 100);

		draw.drawLine(1360, h1 + 20, 1360, h1 + 100);

		draw.drawLine(1420, h1 + 20, 1420, h1 + 100);

		draw.drawLine(1480, h1 + 20, 1480, h1 + 100);

		draw.setColor(Color.green.brighter());

		draw.fillArc(15, h1, 30, 150, 0, 180);

		draw.fillArc(75, h1, 30, 150, 0, 180);

		draw.fillArc(1285, h1, 30, 150, 0, 180);

		draw.fillArc(1345, h1, 30, 150, 0, 180);

		draw.fillArc(1405, h1, 30, 150, 0, 180);

		draw.fillArc(1465, h1, 30, 150, 0, 180);

//////////////////////////////////////////////////House Roof//////////////////////////////////////////////////
		draw.setStroke(new BasicStroke(2));
		draw.setColor(Color.darkGray);
		int j = 1;
		for (int i = 0; i < 55; i++) {
			draw.drawLine(w1 - 250, h - 800, w1 - 520 + j, h1 - 150);
			j = j + 10;
		}
		draw.setColor(Color.black);
		draw.setStroke(new BasicStroke(3));
		draw.drawLine(w1 - 250, h - 800, w1 - 530, h1 - 147);
		draw.drawLine(w1 - 250, h - 800, w1 - 523 + j, h1 - 147);

//////////////////////////////////////////////////Fence//////////////////////////////////////////////////
		draw.setColor(Color.black.brighter());
		draw.setStroke(new BasicStroke(2));
		for (int i = -3; i < 1000; i = i + 1) {
			draw.drawArc(0 + i * 2, h1 + 80, 10, 20, 270, 90);
		}
//////////////////////////////////////////////////Main Road//////////////////////////////////////////////////
		draw.setColor(Color.white);
		draw.fillRect(0, h1 + 100, w, h + 210);

		// drawing middle road
		draw.setColor(Color.gray.darker());
		draw.setStroke(new BasicStroke(200));
		draw.drawLine(w1 - 250, h1 + 100, w1 - 400, h1 + 400);
		draw.drawLine(w1 - 250, h1 + 100, w1 - 100, h1 + 400);

		// middle vertical lines
		draw.setStroke(new BasicStroke(4));
		draw.setColor(Color.yellow);
		draw.drawLine(w1 - 360, h1 + 100, w1 - 620, h1 + 600);
		draw.drawLine(w1 - 140, h1 + 100, w1 + 120, h1 + 600);

		// middle horizontal lines
		draw.setColor(Color.gray.brighter());
		j = 20;
		for (int i = 0; i < 250; i = i + 10) {
			draw.drawLine(w1 - 150 + i, h1 + 90 + j, w1 - 350 - i, h1 + 90 + j);
			j = j + 20;
		}
//////////////////////////////House//////////////////////////////////////////

		// main house block
		draw.setColor(Color.DARK_GRAY);
		draw.fillRect(w1 - 520, h1 - 150, w1 - 420, h1 - 290);

		// left house //
		// roof
		draw.setStroke(new BasicStroke(3));
		for (int i = 10; i < 280; i = i + 20) {

			draw.setColor(Color.DARK_GRAY);
			draw.fillArc(143 + i, 450, 30, 30, 45, 90);

			draw.setColor(Color.black);
			draw.drawArc(143 + i, 450, 30, 30, 45, 90);
		}

		// left house black cloud
		draw.setColor(Color.DARK_GRAY);
		draw.fillRect(250, 420, 50, 70);
		draw.setColor(Color.black);
		draw.drawRect(250, 420, 50, 40);

		// first cloud
		draw.setColor(Color.gray);
		draw.fillOval(240, 380, 30, 30);
		draw.fillOval(250, 380, 20, 30);
		draw.fillOval(260, 380, 20, 30);
		draw.fillOval(270, 380, 20, 30);

		draw.fillOval(240, 386, 20, 30);
		draw.fillOval(250, 386, 20, 30);
		draw.fillOval(260, 386, 20, 30);
		draw.fillOval(270, 386, 20, 30);

		// second cloud

		draw.fillOval(260, 340, 20, 30);
		draw.fillOval(270, 340, 20, 30);
		draw.fillOval(280, 340, 20, 30);
		draw.fillOval(290, 340, 20, 30);

		// third cloud
		draw.fillOval(200, 300, 20, 25);
		draw.fillOval(210, 300, 20, 25);
		draw.fillOval(220, 300, 20, 25);
		draw.fillOval(230, 300, 20, 25);

		// block
		draw.setColor(Color.DARK_GRAY);
		draw.fillRect(157, 455, 283, 180);
		// border
		draw.setColor(Color.black);
		draw.drawLine(157, 455, 157, 634);

		// right house //
		// roof
		for (int i = 10; i < 280; i = i + 20) {

			draw.setColor(Color.DARK_GRAY);
			draw.fillArc(965 + i, 450, 30, 30, 45, 90);

			draw.setColor(Color.black);
			draw.drawArc(965 + i, 450, 30, 30, 45, 90);
		}
		// block
		draw.setColor(Color.DARK_GRAY);
		draw.fillRect(980, 455, 280, 180);

		// border
		draw.setColor(Color.black);
		draw.drawLine(1262, 455, 1262, 635);

		// main house
		// right border
		draw.drawLine(977, 393, 977, 633);

		// left border
		draw.drawLine(439, 392, 439, 633);

//////////////////////////////////////////////////Garden//////////////////////////////////////////////////

////////////////////////////////////////////////Upper Right/////////////////////////////////////////////

		// middle river
		draw.setColor(Color.blue.brighter());
		draw.setStroke(new BasicStroke(20));
		draw.drawLine(w1 - 50, h1 + 150, w - 400, h1 + 150);
		// grass
		draw.setColor(Color.green.darker());
		draw.setStroke(new BasicStroke(10));
		draw.drawLine(w1 - 50, h1 + 150, w - 400, h1 + 150);
		// plants
		draw.setColor(Color.green.brighter());
		draw.setStroke(new BasicStroke(3));
		for (int i = -3; i < 600; i = i + 20) {
			draw.drawArc(w1 - 40 + i, h1 + 115, 3, 50, 100, 100);

		}
		// plants roots
		draw.setColor(Color.green.brighter());
		draw.setStroke(new BasicStroke(1));
		for (int i = -3; i < 600; i = i + 20) {

			draw.drawArc(w1 - 45 + i, h1 + 140, 30, 80, 45, 90);

		}
		// plants leaf
		draw.setStroke(new BasicStroke(2));
		for (int i = -3; i < 600; i = i + 20) {
			draw.drawArc(w1 - 43 + i, h1 + 130, 30, 50, 90, 45);
		}

		// flowers
		draw.setColor(Color.yellow);
		for (int i = -3; i < 600; i = i + 20) {
			draw.fillOval(w1 - 48 + i, h1 + 110, 14, 14);
		}
		draw.setColor(Color.red);
		for (int i = -3; i < 600; i = i + 20) {
			draw.fillOval(w1 - 45 + i, h1 + 113, 7, 7);

		}

////////////////////////////////////////////////Lower Right/////////////////////////////////////////////
		// middle river
		draw.setColor(Color.blue.brighter());
		draw.setStroke(new BasicStroke(20));
		draw.drawLine(w1 - 15, h1 + 210, w - 430, h1 + 210);

		// grass in river
		draw.setColor(Color.green.darker());
		draw.setStroke(new BasicStroke(10));
		draw.drawLine(w1 - 15, h1 + 210, w - 430, h1 + 210);

		// plants
		draw.setColor(Color.green.brighter());
		draw.setStroke(new BasicStroke(3));
		for (int i = -3; i < 550; i = i + 20) {
			draw.drawArc(w1 - 15 + i, h1 + 175, 3, 50, 100, 100);
		}
		// plants root
		draw.setColor(Color.green.brighter());
		draw.setStroke(new BasicStroke(1));
		for (int i = -3; i < 530; i = i + 20) {

			draw.drawArc(w1 - 16 + i, h1 + 200, 30, 80, 45, 90);

		}
		// plants leaf
		draw.setStroke(new BasicStroke(2));
		for (int i = -3; i < 530; i = i + 20) {
			draw.drawArc(w1 - 20 + i, h1 + 187, 30, 50, 90, 45);
		}

		// flowers
		draw.setColor(Color.orange);
		for (int i = -3; i < 550; i = i + 20) {
			draw.fillOval(w1 - 20 + i, h1 + 170, 14, 14);
		}
		draw.setColor(Color.red);
		for (int i = -3; i < 550; i = i + 20) {
			draw.fillOval(w1 - 17 + i, h1 + 174, 7, 7);

		}

////////////////////////////////////////////////Upper Left/////////////////////////////////////////////
		// middle river
		draw.setColor(Color.blue.brighter());
		draw.setStroke(new BasicStroke(20));
		draw.drawLine(0, h1 + 150, w1 - 420, h1 + 150);

		// grass in river
		draw.setColor(Color.green.darker());
		draw.setStroke(new BasicStroke(10));
		draw.drawLine(0, h1 + 150, w1 - 420, h1 + 150);

		// plants
		draw.setColor(Color.green.brighter());
		draw.setStroke(new BasicStroke(3));
		for (int i = -3; i < 530; i = i + 20) {
			draw.drawArc(0 + i, h1 + 115, 3, 50, 100, 100);

		}
		// plants roots
		draw.setColor(Color.green.brighter());
		draw.setStroke(new BasicStroke(1));
		for (int i = -3; i < 530; i = i + 20) {

			draw.drawArc(0 + i, h1 + 140, 30, 80, 45, 90);

		}
		// plants leaf
		draw.setStroke(new BasicStroke(2));
		for (int i = -3; i < 530; i = i + 20) {
			draw.drawArc(-4 + i, h1 + 130, 30, 50, 90, 45);
		}
		// flowers
		draw.setColor(Color.yellow);
		for (int i = -3; i < 530; i = i + 20) {
			draw.fillOval(-7 + i, h1 + 110, 14, 14);
		}
		draw.setColor(Color.red);
		for (int i = -3; i < 530; i = i + 20) {
			draw.fillOval(-4 + i, h1 + 113, 7, 7);

		}

////////////////////////////////////////////////Lower Left/////////////////////////////////////////////

		// middle river
		draw.setColor(Color.blue.brighter());
		draw.setStroke(new BasicStroke(20));
		draw.drawLine(35, h1 + 210, w1 - 460, h1 + 210);

		// grass in river
		draw.setColor(Color.green.darker());
		draw.setStroke(new BasicStroke(10));
		draw.drawLine(35, h1 + 210, w1 - 460, h1 + 210);

		// plants
		draw.setColor(Color.green.brighter());
		draw.setStroke(new BasicStroke(3));
		for (int i = -3; i < 460; i = i + 20) {
			draw.drawArc(35 + i, h1 + 175, 3, 50, 100, 100);
		}
		// plants roots
		draw.setColor(Color.green.brighter());
		draw.setStroke(new BasicStroke(1));
		for (int i = -3; i < 450; i = i + 20) {

			draw.drawArc(30 + i, h1 + 200, 30, 80, 45, 90);

		}
		// plants leaf
		draw.setStroke(new BasicStroke(2));
		for (int i = -3; i < 460; i = i + 20) {
			draw.drawArc(32 + i, h1 + 185, 30, 50, 90, 45);
		}

		// flowers
		draw.setColor(Color.orange);
		for (int i = -3; i < 460; i = i + 20) {
			draw.fillOval(30 + i, h1 + 170, 14, 14);
		}
		draw.setColor(Color.red);
		for (int i = -3; i < 460; i = i + 20) {
			draw.fillOval(33 + i, h1 + 174, 7, 7);

		}

//////////////////////////////////////////////////Lower Grass//////////////////////////////////////////////////
		draw.setColor(Color.green.brighter());
		draw.setStroke(new BasicStroke(1));
		for (int i = -3; i < 600; i = i + 1) {
			draw.drawArc(0 + i * 3, h1 + 240, 30, 200, 100, 100);
			draw.drawArc(0 + i * 4, h1 + 245, 20, 30, 100, 110);
			draw.drawArc(0 + i * 3, h1 + 250, 30, 200, 100, 100);
		}

//////////////////////////////////////////////////door//////////////////////////////////////////////////

		// drawing door
		draw.setColor(Color.black);
		draw.fillRect(w1 - 280, h1 + 20, w1 - 900, h1 - 461);

		// door decoration
		draw.setColor(Color.gray.darker());
		draw.setStroke(new BasicStroke(1));

		for (int i = 2; i < 70; i = i + 10) {
			draw.drawArc(w1 - 251, h1 + 22 + i, 30, 80, 45, 90);
			draw.drawArc(w1 - 261, h1 + 22 + i, 30, 80, 45, 90);
			draw.drawArc(w1 - 271, h1 + 22 + i, 30, 80, 45, 90);
			draw.drawArc(w1 - 281, h1 + 22 + i, 30, 80, 45, 90);
		}

		// door side lines
		draw.setColor(Color.gray.darker());
		draw.setStroke(new BasicStroke(2));
		draw.drawLine(w1 - 225, h1 + 20, w1 - 224, h1 + 99);
		draw.drawLine(w1 - 276, h1 + 20, w1 - 276, h1 + 99);

		// door middle line
		draw.drawLine(w1 - 250, h1 + 20, w1 - 250, h1 + 99);
		draw.drawRect(w1 - 280, h1 + 20, w1 - 900, h1 - 461);

////////////////////////////////////////////////windows//////////////////////////////////////////////////

		// drawing upper windows
		draw.setStroke(new BasicStroke(2));
		for (int i = 0; i < 500; i = i + 100) {

			draw.setColor(Color.orange.brighter());
			draw.fillRect(w1 - 460 + i, h1 - 100, 30, 30);

			draw.fillArc(w1 - 460 + i, h1 - 120, 30, 50, 0, 180);

			draw.setColor(Color.gray.brighter());
			draw.drawLine(w1 - 445 + i, h1 - 117, w1 - 445 + i, h1 - 72);
		}

		// upper windows base
		draw.setStroke(new BasicStroke(7));
		draw.setColor(Color.gray);
		for (int i = 0; i < 500; i = i + 100) {
			draw.drawArc(w1 - 460 + i, h1 - 120, 30, 90, 0, 180);
			draw.drawLine(w1 - 460 + i, h1 - 70, w1 - 430 + i, h1 - 70);
		}

		// left windows
		for (int i = 0; i < 250; i = i + 100) {
			draw.setColor(Color.gray);
			draw.drawRect(200 + i, 500, 10, 30);
			draw.setColor(Color.yellow);
			draw.fillRect(200 + i, 500, 10, 30);
		}
		// right windows
		for (int i = 0; i < 250; i = i + 100) {
			draw.setColor(Color.gray);
			draw.drawRect(1000 + i, 500, 10, 30);
			draw.setColor(Color.yellow);
			draw.fillRect(1000 + i, 500, 10, 30);
		}

		// middle window
		draw.setColor(Color.orange.brighter());
		draw.fillOval(w1 - 300, h1 - 125, 100, 70);
		// middle window lines
		// vertical lines
		draw.setStroke(new BasicStroke(2));
		draw.setColor(Color.gray);
		draw.drawLine(w1 - 250, h1 - 123, w1 - 250, h1 - 55);
		draw.drawLine(w1 - 235, h1 - 121, w1 - 235, h1 - 60);
		draw.drawLine(w1 - 220, h1 - 115, w1 - 220, h1 - 60);
		draw.drawLine(w1 - 265, h1 - 121, w1 - 265, h1 - 60);
		draw.drawLine(w1 - 280, h1 - 115, w1 - 280, h1 - 60);
		// horizontal lines
		draw.drawLine(w1 - 290, h1 - 105, w1 - 205, h1 - 105);
		draw.drawLine(w1 - 300, h1 - 90, w1 - 200, h1 - 90);
		draw.drawLine(w1 - 290, h1 - 75, w1 - 205, h1 - 75);
		// middle window frame
		draw.setStroke(new BasicStroke(8));
		draw.setColor(Color.gray);
		draw.drawOval(w1 - 300, h1 - 125, 100, 70);

////////////////////////////////////////////right lower window/////////////////////////////////////////////

		// window
		draw.setColor(Color.yellow);
		draw.fillRect(800, 540, 80, 50);

		// middle window line
		draw.setStroke(new BasicStroke(2));
		draw.setColor(Color.gray);
		draw.drawLine(840, 540, 840, 590);

		// right curtain
		draw.setColor(Color.cyan.brighter());
		draw.fillArc(855, 495, 50, 90, 180, 90);
		// left curtain
		draw.setColor(Color.cyan.brighter());
		draw.fillArc(775, 495, 50, 90, 270, 90);

		// curtain border
		draw.setStroke(new BasicStroke(1));
		draw.setColor(Color.gray);

		// right
		draw.drawArc(855, 495, 50, 90, 180, 90);
		// left
		draw.drawArc(775, 495, 50, 90, 270, 90);

		// window border
		draw.setStroke(new BasicStroke(3));
		draw.drawRect(800, 539, 80, 50);

//////////////////////////////////////////////left lower window/////////////////////////////////////////////

		// window
		draw.setColor(Color.yellow);
		draw.fillRect(550, 540, 80, 50);

		// right curtain
		draw.setColor(Color.cyan.brighter());
		draw.fillArc(605, 495, 50, 90, 180, 90);
		// left curtain
		draw.setColor(Color.cyan.brighter());
		draw.fillArc(525, 495, 50, 90, 270, 90);

		// curtain border
		draw.setStroke(new BasicStroke(1));
		draw.setColor(Color.gray);

		// right
		draw.drawArc(605, 495, 50, 90, 180, 90);
		// left
		draw.drawArc(525, 495, 50, 90, 270, 90);

		// window border
		draw.setStroke(new BasicStroke(3));
		draw.drawRect(550, 539, 80, 50);

		// middle window line
		draw.setStroke(new BasicStroke(2));
		draw.setColor(Color.gray);
		draw.drawLine(590, 540, 590, 590);

////////////////////////////////////////////////Balloon/////////////////////////////////////////////

		// Balloon

		draw.setStroke(new BasicStroke(2));
		draw.setColor(Color.blue.darker());
		draw.fillOval(1000, 100, 160, 200);
		draw.setColor(Color.black);
		draw.drawOval(1000, 100, 160, 200);

//		 balloon style
		draw.setColor(Color.red);
		draw.fillOval(1030, 120, 30, 30);
		draw.setColor(Color.yellow);
		draw.fillOval(1070, 165, 40, 40);
		draw.setColor(Color.pink.brighter());
		draw.fillOval(1090, 120, 25, 25);
		draw.setColor(Color.cyan);
		draw.fillOval(1020, 180, 25, 25);
		draw.setColor(Color.PINK);
		draw.fillOval(1020, 230, 35, 35);
		draw.setColor(Color.green);
		draw.fillOval(1100, 220, 30, 30);
		draw.setColor(Color.magenta);
		draw.fillOval(1075, 260, 40, 40);

		// delete circles
		draw.setColor(Color.blue.darker());
		draw.fillOval(1030, 120, 29, 29);
		draw.fillOval(1070, 165, 40, 38);
		draw.fillOval(1090, 123, 25, 25);
		draw.fillOval(1020, 180, 22, 22);
		draw.fillOval(1023, 230, 35, 35);
		draw.fillOval(1094, 220, 30, 30);
		draw.fillOval(1070, 263, 40, 40);

		// carriage
		draw.setColor(Color.blue.brighter());
		draw.fillRect(1055, 320, 50, 40);

		// carriage style
		draw.setStroke(new BasicStroke(6));
		draw.setColor(Color.black);
		draw.drawLine(1055, 320, 1105, 320);

		draw.setColor(Color.green.brighter());
		draw.setStroke(new BasicStroke(4));
		draw.drawLine(1056, 330, 1103, 330);
		draw.drawLine(1056, 340, 1103, 340);
		draw.drawLine(1056, 350, 1103, 350);

		draw.setStroke(new BasicStroke(2));
		draw.setColor(Color.black);
		draw.drawRect(1055, 320, 50, 40);

		// robes
		draw.setStroke(new BasicStroke(1));
		draw.setColor(Color.red);
		draw.drawLine(1060, 300, 1060, 320);
		draw.drawLine(1070, 300, 1070, 320);
		draw.drawLine(1080, 300, 1080, 320);
		draw.drawLine(1090, 300, 1090, 320);
		draw.drawLine(1100, 300, 1100, 320);

		// base
		draw.setColor(Color.black.darker());
		draw.fillOval(1050, 285, 60, 15);

		// fire
		draw.setColor(Color.yellow);
		draw.fillOval(1075, 290, 10, 15);

		// more robes
		draw.setColor(Color.red);

		draw.drawLine(1062, 288, 1062, 320);
		draw.drawLine(1072, 288, 1072, 320);
		draw.drawLine(1082, 288, 1082, 320);
		draw.drawLine(1092, 288, 1092, 320);
		draw.drawLine(1102, 288, 1102, 320);

////////////////////////////////////////////////the three houses base lines//////////////////////////////////////////////////		

		draw.setStroke(new BasicStroke(5));

		draw.setColor(Color.gray);

		// left
		draw.drawLine(155, 637, 437, 637);

		// right
		draw.drawLine(980, 637, 1264, 637);

		// middle
		draw.setColor(Color.gray.brighter());
		draw.drawLine(442, 640, 600, 640);

		draw.drawLine(821, 640, 976, 640);

////////////////////////////////////////////////writing//////////////////////////////////////////////////

		draw.setColor(Color.gray.darker());
		draw.fillRect(10, 10, 205, 80);
		draw.setFont(new Font("Ahmad Naji", Font.ITALIC | Font.BOLD, 13));
		draw.setColor(Color.white);
		draw.drawString("//Ahmad Mohamad Naji\\\\", 13, 25);
		draw.drawString("//Computer Science Department\\\\", 13, 45);
		draw.drawString("//2nd Class\\\\", 13, 65);
		draw.drawString("//Computer Graphics Project\\\\", 13, 85);



	}
}
