/**
 * Cobegin
 * 
 * @author Rob Bocchino
 */

class C {
    region r1, r2;
    int f1 in r1;
    int f2 in r2;
    void m1(int x) writes r1 { f1 = x; }
    void m2(int x) writes r2 { f2 = x; }
    int m3() {
	cobegin {
	    m1(1);
	    m2(2);
	}
	return f1+f2;
    }
}
