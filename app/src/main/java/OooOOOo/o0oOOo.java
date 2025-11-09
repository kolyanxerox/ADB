package OoooOOO;

import android.os.Bundle;
import androidx.collection.ArrayMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class o0oOOo extends o0O0o {

    /* renamed from: OooOo */
    public final ArrayMap f14589OooOo;

    /* renamed from: OooOo0o */
    public final ArrayMap f14590OooOo0o;

    /* renamed from: OooOoO0 */
    public long f14591OooOoO0;

    public o0oOOo(o0OO0oO0 o0oo0oo0) {
        super(o0oo0oo0);
        this.f14589OooOo = new ArrayMap();
        this.f14590OooOo0o = new ArrayMap();
    }

    public final void OooOO0o(long j, String str) {
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        if (str == null || str.length() == 0) {
            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14393OooOoOO.OooO0O0("Ad unit id must be a non-empty string");
        } else {
            o0OO0o00 o0oo0o00 = o0oo0oo0.f14522OooOoo0;
            o0OO0oO0.OooOOO0(o0oo0o00);
            o0oo0o00.OooOo00(new o00O0(this, str, j, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOOO(long j) {
        oO00o000 oo00o000 = ((o0OO0oO0) this.f14574OooOo0O).f14528Oooo00O;
        o0OO0oO0.OooOO0o(oo00o000);
        oO00OOo0 oo00ooo0OooOOo0 = oo00o000.OooOOo0(false);
        ArrayMap arrayMap = this.f14590OooOo0o;
        for (K k : arrayMap.keySet()) {
            OooOOOo(k, j - ((Long) arrayMap.get(k)).longValue(), oo00ooo0OooOOo0);
        }
        if (!arrayMap.isEmpty()) {
            OooOOOO(j - this.f14591OooOoO0, oo00ooo0OooOOo0);
        }
        OooOOo0(j);
    }

    public final void OooOOO0(long j, String str) {
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        if (str == null || str.length() == 0) {
            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14393OooOoOO.OooO0O0("Ad unit id must be a non-empty string");
        } else {
            o0OO0o00 o0oo0o00 = o0oo0oo0.f14522OooOoo0;
            o0OO0oO0.OooOOO0(o0oo0o00);
            o0oo0o00.OooOo00(new o00O0(this, str, j, 1));
        }
    }

    public final void OooOOOO(long j, oO00OOo0 oo00ooo0) {
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        if (oo00ooo0 == null) {
            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14398Oooo0.OooO0O0("Not logging ad exposure. No active activity");
        } else {
            if (j < 1000) {
                o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o02);
                o0o0o0o02.f14398Oooo0.OooO0OO(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            oOO00OO.OoooOoo(oo00ooo0, bundle, true);
            oO0O0OoO oo0o0ooo = o0oo0oo0.f14529Oooo00o;
            o0OO0oO0.OooOO0o(oo0o0ooo);
            oo0o0ooo.OooOOo("am", bundle, "_xa");
        }
    }

    public final void OooOOOo(String str, long j, oO00OOo0 oo00ooo0) {
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        if (oo00ooo0 == null) {
            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14398Oooo0.OooO0O0("Not logging ad unit exposure. No active activity");
        } else {
            if (j < 1000) {
                o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o02);
                o0o0o0o02.f14398Oooo0.OooO0OO(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            oOO00OO.OoooOoo(oo00ooo0, bundle, true);
            oO0O0OoO oo0o0ooo = o0oo0oo0.f14529Oooo00o;
            o0OO0oO0.OooOO0o(oo0o0ooo);
            oo0o0ooo.OooOOo("am", bundle, "_xu");
        }
    }

    public final void OooOOo0(long j) {
        ArrayMap arrayMap = this.f14590OooOo0o;
        Iterator it = arrayMap.keySet().iterator();
        while (it.hasNext()) {
            arrayMap.put((String) it.next(), Long.valueOf(j));
        }
        if (arrayMap.isEmpty()) {
            return;
        }
        this.f14591OooOoO0 = j;
    }
}
