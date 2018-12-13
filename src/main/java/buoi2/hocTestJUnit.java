package buoi2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

//import static org.junit.Assert.assertArrayEquals;
//import static org.junit.Assert.assertEquals;
//import org.junit.Test;
/**
* Unit test for simple App.
*/
public class hocTestJUnit {
@Test
public void testApp() {
int a = 1;
int b = 2;
int c = 0;
c = a + b;
assertEquals(3, c);
}
@Test
public void test1() {
assertEquals(1, 1);
}
@Test
public void testPT1() {
assertEquals(GiaiPT(0,0,1), "Phương trình vô nghiệm!");
System.out.print("Phương trình vô nghiệm!");
}

@Test
public void testPT2() {
assertEquals(GiaiPT(0,0,1), "Phương trình vô một nghiệm");
}

public String GiaiPT(float a, float b, float c) {
String kq="";
if (a == 0) {
if (b == 0) {
kq="Phương trình vô nghiệm!";
} else {
kq= "Phương trình có một nghiệm: " + "x = " + (-c / b);
}
return kq;
}

float delta = b * b - 4 * a * c;
float x1;
float x2;
if (delta > 0) {
x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
kq= "Phương trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 = " + x2;
} else if (delta == 0) {
x1 = (-b / (2 * a));
kq= "Phương trình có nghiệm kép: " + "x1 = x2 = " + x1;
} else {
kq= "Phương trình vô nghiệm!";
}
return kq;
}
}
