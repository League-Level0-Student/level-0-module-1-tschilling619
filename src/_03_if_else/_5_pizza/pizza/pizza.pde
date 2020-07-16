PImage pepperoni;
PImage olive;
void setup() {
  pepperoni=loadImage("pepperoni.png");
  olive=loadImage("olive.png");
    size(500,500);
    fill(#E8AF9F);
    pepperoni.resize(50,50);
    olive.resize (35,35);
ellipse(250,250, 300,300);
fill(#AA0600);
ellipse(250,250, 280,280);
fill(#FFBD05);
ellipse(250,250, 270,270);
}
void draw() {
 if (mousePressed && mouseButton==LEFT) { image(pepperoni, mouseX,mouseY);
 }
 if(mousePressed && mouseButton==RIGHT) {image(olive, mouseX,mouseY);
 }
    
}
