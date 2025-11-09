package o00OO0oo;

import o00OO0OO.OooO00o;
import o00OO0o.OooO0OO;
import oo0O.OooO0O0;

/* loaded from: classes3.dex */
public final class OooOO0 implements OooO00o {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final OooOO0 f32054OooO00o = new OooOO0();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final o00O0O f32055OooO0O0 = new o00O0O("kotlin.Double", OooO0OO.f32041OooOoO);

    @Override // o00OO0OO.OooO00o
    public final void OooO00o(o00OO.OooOo00 oooOo00, Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        boolean z = oooOo00.f31876OooO0o;
        OooO0oO.Oooo000 oooo000 = oooOo00.f31872OooO00o;
        if (z) {
            oooOo00.OooOO0(String.valueOf(dDoubleValue));
        } else {
            ((OooO0oO.Oooo0) oooo000.f13287OooOo0o).OooO0oo(String.valueOf(dDoubleValue));
        }
        oooOo00.f31877OooO0o0.getClass();
        if (Double.isInfinite(dDoubleValue) || Double.isNaN(dDoubleValue)) {
            throw new o00OO.OooO0o("Unexpected special floating-point value " + Double.valueOf(dDoubleValue) + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) o00OO.OooOOO.OooO0o0(((OooO0oO.Oooo0) oooo000.f13287OooOo0o).toString(), -1)));
        }
    }

    @Override // o00OO0OO.OooO00o
    public final Object OooO0OO(com.google.android.material.datepicker.OooO0o oooO0o) throws NumberFormatException {
        o00OO.OooOo oooOo = (o00OO.OooOo) oooO0o.f27532OooO0Oo;
        String strOooO0oo = oooOo.OooO0oo();
        try {
            double d = Double.parseDouble(strOooO0oo);
            ((OooO0O0) oooO0o.f27530OooO0O0).f33202OooO00o.getClass();
            if (!Double.isInfinite(d) && !Double.isNaN(d)) {
                return Double.valueOf(d);
            }
            o00OO.OooOo.OooOO0O(oooOo, "Unexpected special floating-point value " + Double.valueOf(d) + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            o00OO.OooOo.OooOO0O(oooOo, androidx.datastore.preferences.protobuf.OooO00o.OooO0o('\'', "Failed to parse type 'double' for input '", strOooO0oo), 0, 6);
            throw null;
        }
    }

    @Override // o00OO0OO.OooO00o
    public final o00OO0o.OooO OooO0Oo() {
        return f32055OooO0O0;
    }
}
