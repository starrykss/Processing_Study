/* autogenerated by Processing revision 1292 on 2023-04-19 */
import processing.core.*;
import processing.data.*;
import processing.event.*;
import processing.opengl.*;

import java.util.HashMap;
import java.util.ArrayList;
import java.io.File;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class Codes extends PApplet {

  public void setup() {

/* size commented out by preprocessor */;

arc(30, 80, 80, 80, 0, QUARTER_PI);
arc(90, 80, 80, 80, 0, HALF_PI);
arc(190, 80, 80, 80, 0, PI);
arc(290, 80, 80, 80, 0, TWO_PI);
/* size commented out by preprocessor */;

noStroke();
fill(125);
rect(40, 40, 160, 160);    // 외곽선이 없는 회색 사각형

fill(255, 0, 0);
rect(20, 20, 140, 140);    // 빨간색 사각형

fill(255,214, 3);
rect(60, 60, 120, 120);    // 노란색 사각형

stroke(93, 196, 109);
strokeWeight(5);
noFill();
rect(40, 40, 100, 100);    // 녹색 외곽선의 사각형
/* size commented out by preprocessor */;
background(0);

noStroke(0;
fill(219, 53, 153, 200);     // alpha 값이 작을 수록 더 투명하다.
ellipse(100, 150, 150, 150);    // 자주색 원

fill(174, 221, 60, 160);
ellipse(170, 150, 150, 150);    // 연두색 원

fill(116, 193, 206, 140);
ellipse(230, 150, 150, 150);    // 파란색 원
/* size commented out by preprocessor */;

fill(0xFFCB29C9);
rect(50, 50, 100, 100);    // left rect

fill(203, 41, 201);
rect(200, 50, 100, 100);    // right rect
/* size commented out by preprocessor */;

noStroke();
colorMode(HSB);    // 색상 모델 설정

for (int i = 0; i < 100; i++) {
	stroke(352, 98, i * 2.5f);
	line(i, 0, i, 100);
}
/* size commented out by preprocessor */;
fill(200);

ellipseMode(CENTER);        // 원의 중심을 기준으로
ellipse(100, 100, 150, 150);    // 회색 원

fill(255);
ellipseMode(CORNER);    // 원의 왼쪽 상단점을 기준으로
ellipse(100, 100, 150, 150);    //회색 원
/* size commented out by preprocessor */;
fill(220);

rectMode(CORNER);    // 사각형의 왼쪽 상단점을 기준으로
rect(100, 100, 170, 170);    // 회색 사각형

fill(255);
rectMode(CENTER);    // 사각형의 중심을 기준으로
Rect(100, 100, 170, 170);    // 흰색 사각형
/* size commented out by preprocessor */;

ellipse(60, 100, 100, 100);
ellipse(120, 100, 40, 40);
ellipse(200, 100, 50, 80);
/* size commented out by preprocessor */;

line(50, 20, 50, 180);
line(20, 120, 110, 120);
line(180, 30, 190, 140);
/* size commented out by preprocessor */;

quad(40, 40, 90, 60, 90, 120, 40, 140);
quad(120, 60, 220, 60, 180, 120, 120, 120);
/* size commented out by preprocessor */;

rect(30, 50, 100, 100);
rect(120, 80, 40, 40);
rect(170, 60, 50, 80);
/* size commented out by preprocessor */;

ellipse(100, 150, 100, 100);
rect(200, 100, 100, 100);
triangle(400, 100, 350, 200, 450, 200);
line(500, 150, 600, 150);
arc(700, 150, 100, 100, 0, PI + HALF_PI);
/* size commented out by preprocessor */;
ellipse(70, 100, 80, 80);    // 왼쪽 원(기본값)

noStroke();    // 외곽선 없음
ellipse(160, 100, 80, 80);     // 가운데 원

stroke(0);    // 외곽선 검은색(0)
strokeWeight(5);    // 외곽선 두께 5픽셀
ellipse(255, 100, 80, 80);    // 오른쪽 원
/* size commented out by preprocessor */;
ellipse(70, 100, 80, 80);   

fill(0);    // 검정색(0)으로 색상 설정
noStroke();    // 외곽선 없음
ellipse(160, 100, 80, 80);     // 가운데 원

stroke(0);    // 외곽선 검은색
strokeWeight(5);    // 외곽선 두께 5픽셀
noFill();    // 색상을 채우지 않음
ellipse(255, 100, 80, 80);    // 오른쪽 원
/* size commented out by preprocessor */;

triangle(60, 50, 10, 140, 110, 140);
triangle(110, 140, 145, 110, 160, 140);
triangle(140, 70, 180, 140, 230, 140);
/* size commented out by preprocessor */;

beginShape();
vertex(75, 50);
vertex(50, 100);
vertex(75, 150);
vertex(125, 150);
vertex(150, 100);
vertex(125, 50);
// endShape();
endShape(CLOSE);    // 외곽선을 끝까지 연결해서 닫는다.

    noLoop();
  }

  public void settings() { size(200, 250); }

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Codes" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
