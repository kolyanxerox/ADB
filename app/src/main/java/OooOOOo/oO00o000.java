package OoooOOO;

import Oooo00O.o000000O;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.o000O00;
import com.ironsource.C3007ch;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class oO00o000 extends o0O000Oo {

    /* renamed from: OooOo, reason: collision with root package name */
    public volatile oO00OOo0 f14683OooOo;

    /* renamed from: OooOoO, reason: collision with root package name */
    public oO00OOo0 f14684OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public volatile oO00OOo0 f14685OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final ConcurrentHashMap f14686OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public volatile boolean f14687OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public o000O00 f14688OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public volatile oO00OOo0 f14689OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public oO00OOo0 f14690OooOooo;

    /* renamed from: Oooo000, reason: collision with root package name */
    public boolean f14691Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public final Object f14692Oooo00O;

    public oO00o000(o0OO0oO0 o0oo0oo0) {
        super(o0oo0oo0);
        this.f14692Oooo00O = new Object();
        this.f14686OooOoOO = new ConcurrentHashMap();
    }

    @Override // OoooOOO.o0O000Oo
    public final boolean OooOOO() {
        return false;
    }

    public final void OooOOOO(oO00OOo0 oo00ooo0, boolean z, long j) {
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        o0oOOo o0oooo = o0oo0oo0.f14526Oooo0;
        o0OO0oO0.OooOO0(o0oooo);
        o0oo0oo0.f14527Oooo000.getClass();
        o0oooo.OooOOO(SystemClock.elapsedRealtime());
        boolean z2 = oo00ooo0 != null && oo00ooo0.f14661OooO0Oo;
        oO0O0O00 oo0o0o00 = o0oo0oo0.f14521OooOoo;
        o0OO0oO0.OooOO0o(oo0o0o00);
        if (!oo0o0o00.f14721OooOoOO.OooO00o(z2, j, z) || oo00ooo0 == null) {
            return;
        }
        oo00ooo0.f14661OooO0Oo = false;
    }

    public final oO00OOo0 OooOOOo(o000O00 o000o002) {
        o000000O.OooO0oo(o000o002);
        Integer numValueOf = Integer.valueOf(o000o002.zza);
        ConcurrentHashMap concurrentHashMap = this.f14686OooOoOO;
        oO00OOo0 oo00ooo0 = (oO00OOo0) concurrentHashMap.get(numValueOf);
        if (oo00ooo0 == null) {
            String strOooOOo = OooOOo(o000o002.zzb);
            oOO00OO ooo00oo = ((o0OO0oO0) this.f14574OooOo0O).f14523OooOooO;
            o0OO0oO0.OooOO0O(ooo00oo);
            oO00OOo0 oo00ooo02 = new oO00OOo0(ooo00oo.OooooOo(), null, strOooOOo);
            concurrentHashMap.put(numValueOf, oo00ooo02);
            oo00ooo0 = oo00ooo02;
        }
        return this.f14689OooOooO != null ? this.f14689OooOooO : oo00ooo0;
    }

    public final String OooOOo(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : "";
        int length2 = str2.length();
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        o0oo0oo0.f14519OooOoO0.getClass();
        if (length2 <= 500) {
            return str2;
        }
        o0oo0oo0.f14519OooOoO0.getClass();
        return str2.substring(0, UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
    }

    public final oO00OOo0 OooOOo0(boolean z) {
        OooOO0o();
        OooOO0O();
        if (!z) {
            return this.f14684OooOoO;
        }
        oO00OOo0 oo00ooo0 = this.f14684OooOoO;
        return oo00ooo0 != null ? oo00ooo0 : this.f14690OooOooo;
    }

    public final void OooOOoo(o000O00 o000o002, Bundle bundle) {
        Bundle bundle2;
        if (!((o0OO0oO0) this.f14574OooOo0O).f14519OooOoO0.OooOoO0() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f14686OooOoOO.put(Integer.valueOf(o000o002.zza), new oO00OOo0(bundle2.getLong(C3007ch.f7763x), bundle2.getString("name"), bundle2.getString("referrer_name")));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOo0(OoooOOO.oO00OOo0 r18, OoooOOO.oO00OOo0 r19, long r20, boolean r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.oO00o000.OooOo0(OoooOOO.oO00OOo0, OoooOOO.oO00OOo0, long, boolean, android.os.Bundle):void");
    }

    public final void OooOo00(String str, oO00OOo0 oo00ooo0, boolean z) {
        oO00OOo0 oo00ooo02;
        oO00OOo0 oo00ooo03 = this.f14683OooOo == null ? this.f14685OooOoO0 : this.f14683OooOo;
        if (oo00ooo0.f14659OooO0O0 == null) {
            oo00ooo02 = new oO00OOo0(oo00ooo0.f14658OooO00o, str != null ? OooOOo(str) : null, oo00ooo0.f14660OooO0OO, oo00ooo0.f14663OooO0o0, oo00ooo0.f14662OooO0o);
        } else {
            oo00ooo02 = oo00ooo0;
        }
        this.f14685OooOoO0 = this.f14683OooOo;
        this.f14683OooOo = oo00ooo02;
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        o0oo0oo0.f14527Oooo000.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        o0OO0o00 o0oo0o00 = o0oo0oo0.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o00);
        o0oo0o00.OooOo00(new oO00Oo00(this, oo00ooo02, oo00ooo03, jElapsedRealtime, z));
    }
}
