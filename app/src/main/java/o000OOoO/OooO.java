package o000OOoO;

import OooOOoo.o0000O;
import OooOoO.o000oOoO;
import Oooo0oO.o000OOo;
import OoooO0O.o00Oo0;
import OoooO0O.o00oOoo;
import OoooOOO.o00Oo00;
import OoooOOO.o0O000O;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.provider.Settings;
import androidx.work.WorkRequest;
import com.google.android.gms.internal.measurement.C2328b;
import com.google.android.gms.internal.measurement.C2342k;
import com.google.android.gms.internal.measurement.C2348oO;
import com.google.android.gms.internal.measurement.Oo0000;
import com.google.android.gms.internal.measurement.oOO0000;
import com.google.android.gms.internal.measurement.oOO0O0O;
import com.google.android.gms.internal.measurement.oOOO0O0o;
import com.google.android.gms.internal.measurement.ooooO000;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class OooO implements o0000O, o000oOoO, o000OOo, o00oOoo, o00Oo00 {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f30286OooOo0O;

    /* renamed from: OooOo0o */
    public static final /* synthetic */ OooO f30268OooOo0o = new OooO(11);

    /* renamed from: OooOo */
    public static final /* synthetic */ OooO f30267OooOo = new OooO(12);

    /* renamed from: OooOoO0 */
    public static final /* synthetic */ OooO f30270OooOoO0 = new OooO(13);

    /* renamed from: OooOoO */
    public static final /* synthetic */ OooO f30269OooOoO = new OooO(14);

    /* renamed from: OooOoOO */
    public static final /* synthetic */ OooO f30271OooOoOO = new OooO(15);

    /* renamed from: OooOoo0 */
    public static final /* synthetic */ OooO f30273OooOoo0 = new OooO(16);

    /* renamed from: OooOoo */
    public static final /* synthetic */ OooO f30272OooOoo = new OooO(17);

    /* renamed from: OooOooO */
    public static final /* synthetic */ OooO f30274OooOooO = new OooO(18);

    /* renamed from: OooOooo */
    public static final /* synthetic */ OooO f30275OooOooo = new OooO(19);

    /* renamed from: Oooo000 */
    public static final /* synthetic */ OooO f30277Oooo000 = new OooO(20);

    /* renamed from: Oooo00O */
    public static final /* synthetic */ OooO f30278Oooo00O = new OooO(21);

    /* renamed from: Oooo00o */
    public static final /* synthetic */ OooO f30279Oooo00o = new OooO(22);

    /* renamed from: Oooo0 */
    public static final /* synthetic */ OooO f30276Oooo0 = new OooO(23);

    /* renamed from: Oooo0O0 */
    public static final /* synthetic */ OooO f30280Oooo0O0 = new OooO(24);

    /* renamed from: Oooo0OO */
    public static final /* synthetic */ OooO f30281Oooo0OO = new OooO(25);

    /* renamed from: Oooo0o0 */
    public static final /* synthetic */ OooO f30283Oooo0o0 = new OooO(26);

    /* renamed from: Oooo0o */
    public static final /* synthetic */ OooO f30282Oooo0o = new OooO(27);

    /* renamed from: Oooo0oO */
    public static final /* synthetic */ OooO f30284Oooo0oO = new OooO(28);

    /* renamed from: Oooo0oo */
    public static final /* synthetic */ OooO f30285Oooo0oo = new OooO(29);

    public /* synthetic */ OooO(int i) {
        this.f30286OooOo0O = i;
    }

    public static List OooO0OO(PackageManager packageManager) {
        Intent intent = new Intent("android.intent.action.CALL");
        intent.setData(Uri.parse("tel:123123"));
        return Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.queryIntentActivities(intent, 0);
    }

    public static boolean OooO0Oo(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            LocationManager locationManager = (LocationManager) context.getSystemService(LocationManager.class);
            if (locationManager == null) {
                return false;
            }
            return locationManager.isLocationEnabled();
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "location_mode") != 0;
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static final boolean OooO0o0() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    @Override // OooOoO.o000oOoO
    public long OooO00o() {
        return System.currentTimeMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0020 A[PHI: r5
  0x0020: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:25:0x0019, B:27:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // Oooo0oO.o000OOo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Oooo0oO.o0O0O00 OooO0O0(android.content.Context r4, java.lang.String r5, Oooo0oO.oo0o0Oo r6) {
        /*
            r3 = this;
            int r0 = r3.f30286OooOo0O
            switch(r0) {
                case 6: goto L26;
                default: goto L5;
            }
        L5:
            Oooo0oO.o0O0O00 r0 = new Oooo0oO.o0O0O00
            r0.<init>()
            int r1 = r6.OooO0Oo(r4, r5)
            r0.f13885OooO00o = r1
            r1 = 1
            int r4 = r6.OooO0OO(r4, r5, r1)
            r0.f13886OooO0O0 = r4
            int r5 = r0.f13885OooO00o
            if (r5 != 0) goto L20
            r5 = 0
            if (r4 != 0) goto L20
            r1 = r5
            goto L23
        L20:
            if (r5 < r4) goto L23
            r1 = -1
        L23:
            r0.f13887OooO0OO = r1
            return r0
        L26:
            Oooo0oO.o0O0O00 r0 = new Oooo0oO.o0O0O00
            r0.<init>()
            r1 = 1
            int r2 = r6.OooO0OO(r4, r5, r1)
            r0.f13886OooO0O0 = r2
            if (r2 == 0) goto L37
            r0.f13887OooO0OO = r1
            goto L42
        L37:
            int r4 = r6.OooO0Oo(r4, r5)
            r0.f13885OooO00o = r4
            if (r4 == 0) goto L42
            r4 = -1
            r0.f13887OooO0OO = r4
        L42:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o000OOoO.OooO.OooO0O0(android.content.Context, java.lang.String, Oooo0oO.oo0o0Oo):Oooo0oO.o0O0O00");
    }

    @Override // o00O00oO.o0000O0
    public Object get() {
        OooO oooO = new OooO(4);
        HashMap map = new HashMap();
        OooOOO.OooO0OO oooO0OO = OooOOO.OooO0OO.f13317OooOo0O;
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(oooO0OO, new OooOo0o.OooOO0O(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, 86400000L, set));
        OooOOO.OooO0OO oooO0OO2 = OooOOO.OooO0OO.f13316OooOo;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(oooO0OO2, new OooOo0o.OooOO0O(1000L, 86400000L, set));
        OooOOO.OooO0OO oooO0OO3 = OooOOO.OooO0OO.f13318OooOo0o;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(OooOo0o.OooOOO.f13614OooOo0o)));
        if (setUnmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(oooO0OO3, new OooOo0o.OooOO0O(86400000L, 86400000L, setUnmodifiableSet));
        if (map.keySet().size() < OooOOO.OooO0OO.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new OooOo0o.OooOO0(oooO, map);
    }

    @Override // OoooO0O.o00O000
    public Object zza() {
        switch (this.f30286OooOo0O) {
            case 8:
                return new o00Oo0();
            case 9:
            case 10:
            default:
                List list = o0O000O.f14225OooO00o;
                C2348oO.f26661OooOo0o.get();
                Long l = (Long) oOO0000.f26833Oooooo.OooO0O0();
                l.getClass();
                return l;
            case 11:
                return new Boolean(((Boolean) ooooO000.f26936OooO00o.OooO0O0()).booleanValue());
            case 12:
                return new Boolean(((Boolean) oOO0O0O.f26855OooO00o.OooO0O0()).booleanValue());
            case 13:
                return new Boolean(((Boolean) oOOO0O0o.f26865OooO00o.OooO0O0()).booleanValue());
            case 14:
                List list2 = o0O000O.f14225OooO00o;
                Oo0000.f26410OooOo0o.get();
                Boolean bool = (Boolean) C2328b.f26443OooO0OO.OooO0O0();
                bool.getClass();
                return bool;
            case 15:
                List list3 = o0O000O.f14225OooO00o;
                Boolean bool2 = (Boolean) C2342k.f26465OooO00o.OooO0O0();
                bool2.getClass();
                return bool2;
            case 16:
                List list4 = o0O000O.f14225OooO00o;
                C2348oO.f26661OooOo0o.get();
                return (String) oOO0000.OooOO0o.OooO0O0();
            case 17:
                List list5 = o0O000O.f14225OooO00o;
                C2348oO.f26661OooOo0o.get();
                return Integer.valueOf((int) ((Long) oOO0000.f26847ooOO.OooO0O0()).longValue());
            case 18:
                List list6 = o0O000O.f14225OooO00o;
                C2348oO.f26661OooOo0o.get();
                return Integer.valueOf((int) ((Long) oOO0000.f26844o0OoOo0.OooO0O0()).longValue());
            case 19:
                List list7 = o0O000O.f14225OooO00o;
                C2348oO.f26661OooOo0o.get();
                return Integer.valueOf((int) ((Long) oOO0000.f26793OooOOo.OooO0O0()).longValue());
            case 20:
                List list8 = o0O000O.f14225OooO00o;
                C2348oO.f26661OooOo0o.get();
                return (String) oOO0000.f26789OooOOO.OooO0O0();
            case 21:
                List list9 = o0O000O.f14225OooO00o;
                C2348oO.f26661OooOo0o.get();
                return (String) oOO0000.f26816Oooo0oO.OooO0O0();
            case 22:
                List list10 = o0O000O.f14225OooO00o;
                C2348oO.f26661OooOo0o.get();
                Long l2 = (Long) oOO0000.f26802OooOoOO.OooO0O0();
                l2.getClass();
                return l2;
            case 23:
                List list11 = o0O000O.f14225OooO00o;
                C2348oO.f26661OooOo0o.get();
                Long l3 = (Long) oOO0000.f26812Oooo0O0.OooO0O0();
                l3.getClass();
                return l3;
            case 24:
                List list12 = o0O000O.f14225OooO00o;
                C2348oO.f26661OooOo0o.get();
                return Integer.valueOf((int) ((Long) oOO0000.f26813Oooo0OO.OooO0O0()).longValue());
            case 25:
                List list13 = o0O000O.f14225OooO00o;
                C2348oO.f26661OooOo0o.get();
                return Integer.valueOf((int) ((Long) oOO0000.f26817Oooo0oo.OooO0O0()).longValue());
            case 26:
                List list14 = o0O000O.f14225OooO00o;
                C2348oO.f26661OooOo0o.get();
                Long l4 = (Long) oOO0000.f26819OoooO0.OooO0O0();
                l4.getClass();
                return l4;
            case 27:
                List list15 = o0O000O.f14225OooO00o;
                C2348oO.f26661OooOo0o.get();
                Long l5 = (Long) oOO0000.f26808Oooo0.OooO0O0();
                l5.getClass();
                return l5;
            case 28:
                List list16 = o0O000O.f14225OooO00o;
                C2348oO.f26661OooOo0o.get();
                Long l6 = (Long) oOO0000.f26832OooooOo.OooO0O0();
                l6.getClass();
                return l6;
        }
    }
}
