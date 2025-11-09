package o00OO0oo;

import o00OO0OO.OooO00o;
import o00OO0o.OooO0OO;

/* loaded from: classes3.dex */
public final class OooO0o implements OooO00o {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0o f32052OooO00o = new OooO0o();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final o00O0O f32053OooO0O0 = new o00O0O("kotlin.Boolean", OooO0OO.f32042OooOoO0);

    @Override // o00OO0OO.OooO00o
    public final void OooO00o(o00OO.OooOo00 oooOo00, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (oooOo00.f31876OooO0o) {
            oooOo00.OooOO0(String.valueOf(zBooleanValue));
        } else {
            ((OooO0oO.Oooo0) oooOo00.f31872OooO00o.f13287OooOo0o).OooO0oo(String.valueOf(zBooleanValue));
        }
    }

    @Override // o00OO0OO.OooO00o
    public final Object OooO0OO(com.google.android.material.datepicker.OooO0o oooO0o) {
        boolean z;
        boolean z2;
        o00OO.OooOo oooOo = (o00OO.OooOo) oooO0o.f27532OooO0Oo;
        int iOooOOOO = oooOo.OooOOOO();
        String str = oooOo.f31871OooO0o0;
        if (iOooOOOO == str.length()) {
            o00OO.OooOo.OooOO0O(oooOo, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(iOooOOOO) == '\"') {
            iOooOOOO++;
            z = true;
        } else {
            z = false;
        }
        int iOooOOO = oooOo.OooOOO(iOooOOOO);
        if (iOooOOO >= str.length() || iOooOOO == -1) {
            o00OO.OooOo.OooOO0O(oooOo, "EOF", 0, 6);
            throw null;
        }
        int i = iOooOOO + 1;
        int iCharAt = str.charAt(iOooOOO) | ' ';
        if (iCharAt == 102) {
            oooOo.OooO0OO(i, "alse");
            z2 = false;
        } else {
            if (iCharAt != 116) {
                o00OO.OooOo.OooOO0O(oooOo, "Expected valid boolean literal prefix, but had '" + oooOo.OooO0oo() + '\'', 0, 6);
                throw null;
            }
            oooOo.OooO0OO(i, "rue");
            z2 = true;
        }
        if (z) {
            if (oooOo.f31867OooO00o == str.length()) {
                o00OO.OooOo.OooOO0O(oooOo, "EOF", 0, 6);
                throw null;
            }
            if (str.charAt(oooOo.f31867OooO00o) != '\"') {
                o00OO.OooOo.OooOO0O(oooOo, "Expected closing quotation mark", 0, 6);
                throw null;
            }
            oooOo.f31867OooO00o++;
        }
        return Boolean.valueOf(z2);
    }

    @Override // o00OO0OO.OooO00o
    public final o00OO0o.OooO OooO0Oo() {
        return f32053OooO0O0;
    }
}
