PImage face;
void setup() {
face=loadImage("face.jpeg");
size(500,500);
face.resize(500,500);
}
void draw() {
  println(mouseX+" "+mouseY);
  image(face,0,0);//214,249 298,243
  fill(mouseX,mouseY,0);
  ellipse(214,249, 35,35);
  ellipse(298,243, 30,30);
  fill(#020303);
  ellipse(214,249, 10,10);
  ellipse(298,243, 10,10);

}
