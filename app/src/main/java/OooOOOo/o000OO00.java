package OooOooo;

import Oooo00O.o000000O;
import Oooo0OO.oo000o;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.AbstractC1497dj;
import com.google.android.gms.internal.ads.AbstractC2200wl;
import com.google.android.gms.internal.ads.C1666i4;
import com.google.android.gms.internal.ads.C1896oc;
import com.google.android.gms.internal.ads.C1932pc;
import com.google.android.gms.internal.ads.C2043sc;
import com.google.android.gms.internal.ads.C2160vi;
import com.google.android.gms.internal.ads.C2163vl;
import com.google.android.gms.internal.ads.C2249xx;
import com.google.android.gms.internal.ads.C2274yl;
import com.google.android.gms.internal.ads.RunnableC1442c1;
import com.google.android.gms.internal.ads.ii0;
import com.google.android.gms.internal.ads.oOOO00;
import com.google.android.gms.internal.ads.oOOO00o0;
import com.google.android.gms.internal.ads.oOOOoo00;
import com.google.android.gms.internal.ads.ooooO0O0;
import com.google.android.gms.internal.ads.sj0;
import com.ironsource.C3126fq;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import o00000oO.OooOOO;

/* loaded from: classes2.dex */
public final class o000OO00 implements ooooO0O0 {

    /* renamed from: OooOo */
    public static o000OO00 f13674OooOo;

    /* renamed from: OooOo0O */
    public final Context f13675OooOo0O;

    /* renamed from: OooOo0o */
    public volatile Object f13676OooOo0o;

    public o000OO00(Context context, int i) {
        switch (i) {
            case 1:
                this.f13675OooOo0O = context;
                break;
            default:
                this.f13675OooOo0O = context.getApplicationContext();
                break;
        }
    }

    public static o000OO00 OooO00o(Context context) {
        o000000O.OooO0oo(context);
        synchronized (o000OO00.class) {
            if (f13674OooOo == null) {
                o0O0ooO o0o0ooo = o00O00.f13681OooO00o;
                synchronized (o00O00.class) {
                    if (o00O00.f13687OooO0oO == null) {
                        o00O00.f13687OooO0oO = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                f13674OooOo = new o000OO00(context, 0);
            }
        }
        return f13674OooOo;
    }

    public static final o00oOoo OooO0OO(PackageInfo packageInfo, o00oOoo... o00ooooArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            o00O000 o00o000 = new o00O000(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < o00ooooArr.length; i++) {
                if (o00ooooArr[i].equals(o00o000)) {
                    return o00ooooArr[i];
                }
            }
        }
        return null;
    }

    public static final boolean OooO0Oo(PackageInfo packageInfo, boolean z) {
        PackageInfo packageInfo2;
        if (!z) {
            packageInfo2 = packageInfo;
        } else if (packageInfo != null) {
            if (C3126fq.f8595b.equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            if ((z ? OooO0OO(packageInfo2, o00O000o.f13692OooO00o) : OooO0OO(packageInfo2, o00O000o.f13692OooO00o[0])) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:207:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x019b A[LOOP:0: B:134:0x001a->B:223:0x019b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x01a9 A[EDGE_INSN: B:251:0x01a9->B:226:0x01a9 BREAK  A[LOOP:0: B:134:0x001a->B:223:0x019b], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean OooO0O0(int r20) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OooOooo.o000OO00.OooO0O0(int):boolean");
    }

    @Override // com.google.android.gms.internal.ads.ooooO0O0
    public oOOO00 zza(oOOO00o0 oooo00o0) throws oOOOoo00 {
        Map mapZzl = oooo00o0.zzl();
        int size = mapZzl.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : mapZzl.entrySet()) {
            strArr[i2] = (String) entry.getKey();
            strArr2[i2] = (String) entry.getValue();
            i2++;
        }
        C1896oc c1896oc = new C1896oc(oooo00o0.zzk(), strArr, strArr2);
        ((oo000o) zzv.zzC()).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            C2274yl c2274yl = new C2274yl();
            C2249xx c2249xx = new C2249xx(this, false, c2274yl, 14);
            sj0 sj0Var = new sj0(c2274yl, 6);
            Context context = this.f13675OooOo0O;
            Looper looperZzb = zzv.zzu().zzb();
            int i3 = AbstractC1497dj.f18262OooO00o;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            this.f13676OooOo0o = new C1666i4(166, c2249xx, sj0Var, applicationContext, looperZzb);
            ((C1666i4) this.f13676OooOo0o).checkAvailabilityAndConnect();
            C2043sc c2043sc = new C2043sc(c1896oc, 0);
            C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
            OooOOO oooOOOO00Oo0 = ii0.o00Oo0(ii0.ooOO(c2274yl, c2043sc, c2163vl), ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o00o000O)).intValue(), TimeUnit.MILLISECONDS, AbstractC2200wl.f25324OooO0Oo);
            oooOOOO00Oo0.addListener(new RunnableC1442c1(this, 11), c2163vl);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) oooOOOO00Oo0.get();
            ((oo000o) zzv.zzC()).getClass();
            zze.zza("Http assets remote cache took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + "ms");
            C1932pc c1932pc = (C1932pc) new C2160vi(parcelFileDescriptor).OooO0o0(C1932pc.CREATOR);
            if (c1932pc != null) {
                if (c1932pc.zza) {
                    throw new oOOOoo00(c1932pc.zzb);
                }
                if (c1932pc.zze.length == c1932pc.zzf.length) {
                    HashMap map = new HashMap();
                    while (true) {
                        String[] strArr3 = c1932pc.zze;
                        if (i >= strArr3.length) {
                            return new oOOO00(c1932pc.zzc, c1932pc.zzd, map, oOOO00.OooO00o(map), c1932pc.zzg);
                        }
                        map.put(strArr3[i], c1932pc.zzf[i]);
                        i++;
                    }
                }
            }
            return null;
        } catch (InterruptedException | ExecutionException unused) {
            ((oo000o) zzv.zzC()).getClass();
            zze.zza("Http assets remote cache took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + "ms");
            return null;
        } catch (Throwable th) {
            ((oo000o) zzv.zzC()).getClass();
            zze.zza("Http assets remote cache took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + "ms");
            throw th;
        }
    }
}
