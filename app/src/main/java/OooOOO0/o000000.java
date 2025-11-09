package OoooOO0;

import OoooOOO.o0O0O0o0;
import OoooOOO.o0OO0o00;
import OoooOOO.o0OO0oO0;
import OoooOOO.o0OOOO0o;
import OoooOOO.o0oOOo;
import OoooOOO.oO00OOo0;
import OoooOOO.oO00o000;
import OoooOOO.oO0O0OoO;
import OoooOOO.oO0Ooooo;
import OoooOOO.oOO000o;
import OoooOOO.oOO00OO;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import o000OOoO.OooO;

/* loaded from: classes2.dex */
public final class o000000 extends o00000 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o0OO0oO0 f14076OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final oO0O0OoO f14077OooO0O0;

    public o000000(o0OO0oO0 o0oo0oo0) {
        Oooo00O.o000000O.OooO0oo(o0oo0oo0);
        this.f14076OooO00o = o0oo0oo0;
        oO0O0OoO oo0o0ooo = o0oo0oo0.f14529Oooo00o;
        o0OO0oO0.OooOO0o(oo0o0ooo);
        this.f14077OooO0O0 = oo0o0ooo;
    }

    @Override // OoooOOO.oO00O0o0
    public final void OooO(String str) {
        o0OO0oO0 o0oo0oo0 = this.f14076OooO00o;
        o0oOOo o0oooo = o0oo0oo0.f14526Oooo0;
        o0OO0oO0.OooOO0(o0oooo);
        o0oo0oo0.f14527Oooo000.getClass();
        o0oooo.OooOO0o(SystemClock.elapsedRealtime(), str);
    }

    @Override // OoooOOO.oO00O0o0
    public final void OooO0oo(String str) {
        o0OO0oO0 o0oo0oo0 = this.f14076OooO00o;
        o0oOOo o0oooo = o0oo0oo0.f14526Oooo0;
        o0OO0oO0.OooOO0(o0oooo);
        o0oo0oo0.f14527Oooo000.getClass();
        o0oooo.OooOOO0(SystemClock.elapsedRealtime(), str);
    }

    @Override // OoooOOO.oO00O0o0
    public final void OooOO0(String str, Bundle bundle, String str2) {
        oO0O0OoO oo0o0ooo = this.f14077OooO0O0;
        ((o0OO0oO0) oo0o0ooo.f14574OooOo0O).f14527Oooo000.getClass();
        oo0o0ooo.OooOOOo(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // OoooOOO.oO00O0o0
    public final List OooOOOO(String str, String str2) {
        oO0O0OoO oo0o0ooo = this.f14077OooO0O0;
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) oo0o0ooo.f14574OooOo0O;
        o0OO0o00 o0oo0o00 = o0oo0oo0.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o00);
        boolean zOooOOo0 = o0oo0o00.OooOOo0();
        o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
        if (zOooOOo0) {
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14393OooOoOO.OooO0O0("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (OooO.OooO0o0()) {
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14393OooOoOO.OooO0O0("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        o0OO0o00 o0oo0o002 = o0oo0oo0.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o002);
        o0oo0o002.OooOo0(atomicReference, 5000L, "get conditional user properties", new o0OOOO0o(oo0o0ooo, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return oOO00OO.OoooOo0(list);
        }
        o0OO0oO0.OooOOO0(o0o0o0o0);
        o0o0o0o0.f14393OooOoOO.OooO0OO(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // OoooOOO.oO00O0o0
    public final void OooOOOo(Bundle bundle) {
        oO0O0OoO oo0o0ooo = this.f14077OooO0O0;
        ((o0OO0oO0) oo0o0ooo.f14574OooOo0O).f14527Oooo000.getClass();
        oo0o0ooo.OooOo(bundle, System.currentTimeMillis());
    }

    @Override // OoooOOO.oO00O0o0
    public final void OooOOo(String str, Bundle bundle, String str2) {
        oO0O0OoO oo0o0ooo = this.f14076OooO00o.f14529Oooo00o;
        o0OO0oO0.OooOO0o(oo0o0ooo);
        oo0o0ooo.OooOoO0(str, bundle, str2);
    }

    @Override // OoooOOO.oO00O0o0
    public final Map OooOOo0(String str, String str2, boolean z) {
        oO0O0OoO oo0o0ooo = this.f14077OooO0O0;
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) oo0o0ooo.f14574OooOo0O;
        o0OO0o00 o0oo0o00 = o0oo0oo0.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o00);
        boolean zOooOOo0 = o0oo0o00.OooOOo0();
        o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
        if (zOooOOo0) {
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14393OooOoOO.OooO0O0("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (OooO.OooO0o0()) {
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14393OooOoOO.OooO0O0("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        o0OO0o00 o0oo0o002 = o0oo0oo0.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o002);
        o0oo0o002.OooOo0(atomicReference, 5000L, "get user properties", new oO0Ooooo(oo0o0ooo, atomicReference, str, str2, z));
        List<oOO000o> list = (List) atomicReference.get();
        if (list == null) {
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14393OooOoOO.OooO0OO(Boolean.valueOf(z), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        ArrayMap arrayMap = new ArrayMap(list.size());
        for (oOO000o ooo000o : list) {
            Object objOooO0o0 = ooo000o.OooO0o0();
            if (objOooO0o0 != null) {
                arrayMap.put(ooo000o.zzb, objOooO0o0);
            }
        }
        return arrayMap;
    }

    @Override // OoooOOO.oO00O0o0
    public final String zzh() {
        oO00o000 oo00o000 = ((o0OO0oO0) this.f14077OooO0O0.f14574OooOo0O).f14528Oooo00O;
        o0OO0oO0.OooOO0o(oo00o000);
        oO00OOo0 oo00ooo0 = oo00o000.f14683OooOo;
        if (oo00ooo0 != null) {
            return oo00ooo0.f14658OooO00o;
        }
        return null;
    }

    @Override // OoooOOO.oO00O0o0
    public final String zzi() {
        oO00o000 oo00o000 = ((o0OO0oO0) this.f14077OooO0O0.f14574OooOo0O).f14528Oooo00O;
        o0OO0oO0.OooOO0o(oo00o000);
        oO00OOo0 oo00ooo0 = oo00o000.f14683OooOo;
        if (oo00ooo0 != null) {
            return oo00ooo0.f14659OooO0O0;
        }
        return null;
    }

    @Override // OoooOOO.oO00O0o0
    public final String zzj() {
        return (String) this.f14077OooO0O0.f14730OooOoo0.get();
    }

    @Override // OoooOOO.oO00O0o0
    public final String zzk() {
        return this.f14077OooO0O0.OooOoO();
    }

    @Override // OoooOOO.oO00O0o0
    public final long zzl() {
        oOO00OO ooo00oo = this.f14076OooO00o.f14523OooOooO;
        o0OO0oO0.OooOO0O(ooo00oo);
        return ooo00oo.OooooOo();
    }

    @Override // OoooOOO.oO00O0o0
    public final int zzr(String str) {
        oO0O0OoO oo0o0ooo = this.f14077OooO0O0;
        oo0o0ooo.getClass();
        Oooo00O.o000000O.OooO0o0(str);
        ((o0OO0oO0) oo0o0ooo.f14574OooOo0O).getClass();
        return 25;
    }
}
