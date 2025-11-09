package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.pz0;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class oO0o0o {

    /* renamed from: OooO0OO */
    public static final /* synthetic */ int f26768OooO0OO = 0;

    /* renamed from: OooO00o */
    public final oO0O000o f26769OooO00o = new oO0O000o();

    /* renamed from: OooO0O0 */
    public boolean f26770OooO0O0;

    static {
        new oO0o0o(0);
    }

    public oO0o0o() {
    }

    public static void OooO0O0(oO000O0 oo000o0, ooOOO00O ooooo00o, int i, Object obj) throws pz0 {
        if (ooooo00o == ooOOO00O.f26915OooOoO0) {
            Charset charset = oO00O0o.f26684OooO00o;
            oo000o0.OooOO0o(i, 3);
            ((ooOOOOoo) ((AbstractC2346o) obj)).OooO0Oo(oo000o0);
            oo000o0.OooOO0o(i, 4);
            return;
        }
        oo000o0.OooOO0o(i, ooooo00o.f26917OooOo0o);
        ooo0o ooo0oVar = ooo0o.f26927OooOo0O;
        switch (ooooo00o.ordinal()) {
            case 0:
                oo000o0.OooOo(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                oo000o0.OooOo0O(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                oo000o0.OooOo0o(((Long) obj).longValue());
                break;
            case 3:
                oo000o0.OooOo0o(((Long) obj).longValue());
                break;
            case 4:
                oo000o0.OooOo00(((Integer) obj).intValue());
                break;
            case 5:
                oo000o0.OooOo(((Long) obj).longValue());
                break;
            case 6:
                oo000o0.OooOo0O(((Integer) obj).intValue());
                break;
            case 7:
                oo000o0.OooOOoo(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof oO000)) {
                    oo000o0.OooOoO((String) obj);
                    break;
                } else {
                    oo000o0.OooOOo((oO000) obj);
                    break;
                }
            case 9:
                ((ooOOOOoo) ((AbstractC2346o) obj)).OooO0Oo(oo000o0);
                break;
            case 10:
                oo000o0.getClass();
                ooOOOOoo oooooooo = (ooOOOOoo) ((AbstractC2346o) obj);
                oo000o0.OooOo0(oooooooo.OooOO0O());
                oooooooo.OooO0Oo(oo000o0);
                break;
            case 11:
                if (!(obj instanceof oO000)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    oo000o0.OooOo0(length);
                    oo000o0.OooOoO0(length, bArr);
                    break;
                } else {
                    oo000o0.OooOOo((oO000) obj);
                    break;
                }
            case 12:
                oo000o0.OooOo0(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof oO000Oo0)) {
                    oo000o0.OooOo00(((Integer) obj).intValue());
                    break;
                } else {
                    oo000o0.OooOo00(((oO000Oo0) obj).zza());
                    break;
                }
            case 14:
                oo000o0.OooOo0O(((Integer) obj).intValue());
                break;
            case 15:
                oo000o0.OooOo(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                oo000o0.OooOo0((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                oo000o0.OooOo0o((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public final void OooO00o() {
        if (this.f26770OooO0O0) {
            return;
        }
        oO0O000o oo0o000o = this.f26769OooO00o;
        int i = oo0o000o.f26726OooOo0o;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = oo0o000o.OooO00o(i2).f26722OooOo0o;
            if (obj instanceof ooOOOOoo) {
                ((ooOOOOoo) obj).OooO0oO();
            }
        }
        Iterator it = oo0o000o.OooO0O0().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof ooOOOOoo) {
                ((ooOOOOoo) value).OooO0oO();
            }
        }
        if (!oo0o000o.f26728OooOoO0) {
            if (oo0o000o.f26726OooOo0o > 0) {
                oo0o000o.OooO00o(0).f26721OooOo0O.getClass();
                throw new ClassCastException();
            }
            Iterator it2 = oo0o000o.OooO0O0().iterator();
            if (it2.hasNext()) {
                ((Map.Entry) it2.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!oo0o000o.f26728OooOoO0) {
            oo0o000o.f26724OooOo = oo0o000o.f26724OooOo.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(oo0o000o.f26724OooOo);
            oo0o000o.f26729OooOoOO = oo0o000o.f26729OooOoOO.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(oo0o000o.f26729OooOoOO);
            oo0o000o.f26728OooOoO0 = true;
        }
        this.f26770OooO0O0 = true;
    }

    public final Object clone() {
        oO0o0o oo0o0o = new oO0o0o();
        oO0O000o oo0o000o = this.f26769OooO00o;
        if (oo0o000o.f26726OooOo0o > 0) {
            oO0O00 oo0o00OooO00o = oo0o000o.OooO00o(0);
            if (oo0o00OooO00o.f26721OooOo0O != null) {
                throw new ClassCastException();
            }
            Object obj = oo0o00OooO00o.f26722OooOo0o;
            throw null;
        }
        Iterator it = oo0o000o.OooO0O0().iterator();
        if (!it.hasNext()) {
            return oo0o0o;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oO0o0o) {
            return this.f26769OooO00o.equals(((oO0o0o) obj).f26769OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26769OooO00o.hashCode();
    }

    public oO0o0o(int i) {
        OooO00o();
        OooO00o();
    }
}
