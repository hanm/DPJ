/**
 * Spawn
 * 
 * @author Rob Bocchino
 */

class C {
    int m1(int x) { return x; }
    void m2() { spawn m1(0); }
    void m3() { 
	spawn {
	    int y = m1(0); 
	}
    }
}
