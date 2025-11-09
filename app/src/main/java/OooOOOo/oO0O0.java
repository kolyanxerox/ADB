package OoooOOO;

import android.os.Bundle;
import com.google.android.gms.internal.ads.C2249xx;
import com.google.android.gms.internal.ads.af0;
import com.google.android.gms.internal.ads.bb1;
import com.google.android.gms.internal.ads.i80;
import com.google.android.gms.internal.ads.o000000;
import com.google.android.gms.internal.ads.o0000O0;
import com.google.android.gms.internal.ads.o0000oo;
import com.google.android.gms.internal.ads.o000O00;

/* loaded from: classes2.dex */
public final class oO0O0 implements com.google.android.gms.internal.ads.o0OOO0 {

    /* renamed from: OooOo */
    public Object f14695OooOo;

    /* renamed from: OooOo0O */
    public long f14696OooOo0O;

    /* renamed from: OooOo0o */
    public long f14697OooOo0o;

    /* renamed from: OooOoO0 */
    public Object f14698OooOoO0;

    public oO0O0(String str, byte[] bArr, long j, long j2) {
        this.f14695OooOo = str;
        this.f14698OooOoO0 = bArr;
        this.f14696OooOo0O = j;
        this.f14697OooOo0o = j2;
    }

    public boolean OooO00o(boolean z, long j, boolean z2) {
        oO0O0O00 oo0o0o00 = (oO0O0O00) this.f14698OooOoO0;
        oo0o0o00.OooOO0O();
        oo0o0o00.OooOO0o();
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) oo0o0o00.f14574OooOo0O;
        if (o0oo0oo0.OooO0o()) {
            o0O o0o = o0oo0oo0.f14518OooOoO;
            o0OO0oO0.OooOO0O(o0o);
            o0oo0oo0.f14527Oooo000.getClass();
            o0o.f14197Oooo0OO.OooO0O0(System.currentTimeMillis());
        }
        long j2 = j - this.f14696OooOo0O;
        o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
        if (!z && j2 < 1000) {
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14398Oooo0.OooO0OO(Long.valueOf(j2), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z2) {
            j2 = j - this.f14697OooOo0o;
            this.f14697OooOo0o = j;
        }
        o0OO0oO0.OooOOO0(o0o0o0o0);
        o0o0o0o0.f14398Oooo0.OooO0OO(Long.valueOf(j2), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        boolean z3 = !o0oo0oo0.f14519OooOoO0.OooOoO0();
        oO00o000 oo00o000 = o0oo0oo0.f14528Oooo00O;
        o0OO0oO0.OooOO0o(oo00o000);
        oOO00OO.OoooOoo(oo00o000.OooOOo0(z3), bundle, true);
        if (!z2) {
            oO0O0OoO oo0o0ooo = o0oo0oo0.f14529Oooo00o;
            o0OO0oO0.OooOO0o(oo0o0ooo);
            oo0o0ooo.OooOOo("auto", bundle, "_e");
        }
        this.f14696OooOo0O = j;
        oO0O00oO oo0o00oo = (oO0O00oO) this.f14695OooOo;
        oo0o00oo.OooO0OO();
        oo0o00oo.OooO0O0(((Long) o0O000O.f14324o00ooo.OooO00o(null)).longValue());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.o0OOO0
    public void OooO0Oo(long j) {
        long[] jArr = (long[]) ((C2249xx) this.f14698OooOoO0).f25815OooOo0o;
        this.f14697OooOo0o = jArr[i80.OooOO0(jArr, j, true)];
    }

    @Override // com.google.android.gms.internal.ads.o0OOO0
    public long OooOO0O(o000000 o000000Var) {
        long j = this.f14697OooOo0o;
        if (j < 0) {
            return -1L;
        }
        this.f14697OooOo0o = -1L;
        return -(j + 2);
    }

    @Override // com.google.android.gms.internal.ads.o0OOO0
    public o000O00 zze() {
        af0.OooooO0(this.f14696OooOo0O != -1);
        return new o0000oo((o0000O0) this.f14695OooOo, 0, this.f14696OooOo0O);
    }

    public oO0O0(long j) {
        af0.OooooO0(((bb1) this.f14695OooOo) == null);
        this.f14696OooOo0O = j;
        this.f14697OooOo0o = j + 65536;
    }
}
