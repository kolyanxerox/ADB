package o00O0OO0;

/* loaded from: classes3.dex */
public abstract class OooOOO0 extends OooO00o {
    public OooOOO0(o00O0O0O.OooO0OO oooO0OO) {
        super(oooO0OO);
        if (oooO0OO != null && oooO0OO.getContext() != o00O0O0O.OooOOO.f31358OooOo0O) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // o00O0O0O.OooO0OO
    public o00O0O0O.OooOOO0 getContext() {
        return o00O0O0O.OooOOO.f31358OooOo0O;
    }
}
