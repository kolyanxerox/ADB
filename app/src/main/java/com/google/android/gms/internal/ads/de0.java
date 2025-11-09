package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.SparseArray;
import androidx.core.location.LocationRequestCompat;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzcv;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzt;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.p008h5.OnH5AdsEventListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class de0 implements o0000Ooo, o0o0000, oO0OO0O, Oooo00O.OooO0OO, MediationAdLoadCallback, MediationBannerListener, MediationInterstitialListener, MediationNativeListener, InterfaceC1730jw, NativeAd.OnNativeAdLoadedListener, bf0, tc0, vp0 {

    /* renamed from: OooOoO */
    public static de0 f18237OooOoO;

    /* renamed from: OooOoOO */
    public static final oOO00O0 f18238OooOoOO = new oOO00O0(2, -9223372036854775807L);

    /* renamed from: OooOoo0 */
    public static final oOO00O0 f18239OooOoo0 = new oOO00O0(3, -9223372036854775807L);

    /* renamed from: OooOo */
    public Object f18240OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f18241OooOo0O;

    /* renamed from: OooOo0o */
    public Object f18242OooOo0o;

    /* renamed from: OooOoO0 */
    public Object f18243OooOoO0;

    public /* synthetic */ de0(int i, Object obj, Object obj2) {
        this.f18241OooOo0O = i;
        this.f18242OooOo0o = obj;
        this.f18240OooOo = obj2;
    }

    public static String OooOOO0(Context context) throws IOException {
        File file = new File(context.getPackageResourcePath());
        if (!file.exists() || !file.canRead()) {
            return "";
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[16384];
                MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
                for (int i = fileInputStream.read(bArr); i != -1; i = fileInputStream.read(bArr)) {
                    messageDigest.update(bArr, 0, i);
                }
                ao0 ao0VarOooO0Oo = ao0.f17069OooO0Oo.OooO0Oo();
                byte[] bArrDigest = messageDigest.digest();
                String strOooO0oO = ao0VarOooO0Oo.OooO0oO(bArrDigest.length, bArrDigest);
                fileInputStream.close();
                return strOooO0oO;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | UnsupportedOperationException | NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static final boolean OooOOOO(String str) {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOoo0)).booleanValue()) {
            Oooo00O.o000000O.OooO0oo(str);
            if (str.length() > ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOoo0o)).intValue()) {
                zzo.zze("H5 GMSG exceeds max length");
                return false;
            }
            Uri uri = Uri.parse(str);
            if ("gmsg".equals(uri.getScheme()) && "mobileads.google.com".equals(uri.getHost()) && "/h5ads".equals(uri.getPath())) {
                return true;
            }
        }
        return false;
    }

    public static de0 OooOOOo(Context context) {
        synchronized (de0.class) {
            try {
                de0 de0Var = f18237OooOoO;
                if (de0Var != null) {
                    return de0Var;
                }
                Context applicationContext = context.getApplicationContext();
                long jLongValue = ((Long) AbstractC1670i8.f19991OooO0O0.OooOOO()).longValue();
                zzcw zzcwVarAsInterface = null;
                if (jLongValue > 0 && jLongValue <= 244410203) {
                    try {
                        zzcwVarAsInterface = zzcv.asInterface((IBinder) applicationContext.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(applicationContext));
                    } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                        zzo.zzh("Failed to retrieve lite SDK info.", e);
                    }
                }
                de0 de0Var2 = new de0(applicationContext, zzcwVarAsInterface);
                f18237OooOoO = de0Var2;
                return de0Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.o0000Ooo
    public void OooO(o000O00 o000o002) {
        ((o0000Ooo) this.f18242OooOo0o).OooO(o000o002);
    }

    @Override // com.google.android.gms.internal.ads.oO0OO0O
    public void OooO00o(h70 h70Var, o0000Ooo o0000ooo, oOo00o00 ooo00o00) {
        this.f18240OooOo = h70Var;
        ooo00o00.OooO00o();
        ooo00o00.OooO0O0();
        o000O o000oOooO0oO = o0000ooo.OooO0oO(ooo00o00.f22886OooO0Oo, 5);
        this.f18243OooOoO0 = o000oOooO0oO;
        o000oOooO0oO.OooO0o0((o0OoOo0) this.f18242OooOo0o);
    }

    @Override // com.google.android.gms.internal.ads.oO0OO0O
    public void OooO0O0(r40 r40Var) {
        long jOooO0Oo;
        long j;
        af0.OooOo0O((h70) this.f18240OooOo);
        int i = i80.f19994OooO00o;
        h70 h70Var = (h70) this.f18240OooOo;
        synchronized (h70Var) {
            try {
                long j2 = h70Var.f19586OooO0OO;
                jOooO0Oo = j2 != -9223372036854775807L ? j2 + h70Var.f19585OooO0O0 : h70Var.OooO0Oo();
            } finally {
            }
        }
        h70 h70Var2 = (h70) this.f18240OooOo;
        synchronized (h70Var2) {
            j = h70Var2.f19585OooO0O0;
        }
        if (jOooO0Oo == -9223372036854775807L || j == -9223372036854775807L) {
            return;
        }
        o0OoOo0 o0oooo0 = (o0OoOo0) this.f18242OooOo0o;
        if (j != o0oooo0.f22225OooOOo) {
            jb1 jb1Var = new jb1(o0oooo0);
            jb1Var.f20256OooOOo0 = j;
            o0OoOo0 o0oooo02 = new o0OoOo0(jb1Var);
            this.f18242OooOo0o = o0oooo02;
            ((o000O) this.f18243OooOoO0).OooO0o0(o0oooo02);
        }
        int iOooOOOO = r40Var.OooOOOO();
        ((o000O) this.f18243OooOoO0).OooO0Oo(iOooOOOO, r40Var);
        ((o000O) this.f18243OooOoO0).OooO00o(jOooO0Oo, 1, iOooOOOO, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.o0000Ooo
    public void OooO0OO() {
        ((o0000Ooo) this.f18242OooOo0o).OooO0OO();
    }

    @Override // com.google.android.gms.internal.ads.o0o0000
    public ArrayList OooO0Oo(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = (List) this.f18242OooOo0o;
            if (i >= list.size()) {
                break;
            }
            int i2 = i + i;
            long[] jArr = (long[]) this.f18240OooOo;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                oO00OOo0 oo00ooo0 = (oO00OOo0) list.get(i);
                C2206wr c2206wr = oo00ooo0.f22503OooO00o;
                if (c2206wr.f25385OooO0o0 == -3.4028235E38f) {
                    arrayList2.add(oo00ooo0);
                } else {
                    arrayList.add(c2206wr);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, new oO00Oo00(1));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            C2206wr c2206wr2 = ((oO00OOo0) arrayList2.get(i3)).f22503OooO00o;
            arrayList.add(new C2206wr(c2206wr2.f25380OooO00o, c2206wr2.f25381OooO0O0, c2206wr2.f25382OooO0OO, c2206wr2.f25383OooO0Oo, (-1) - i3, 1, c2206wr2.f25386OooO0oO, c2206wr2.f25387OooO0oo, c2206wr2.f25379OooO, c2206wr2.OooOO0o, c2206wr2.f25391OooOOO0, c2206wr2.f25388OooOO0, c2206wr2.f25389OooOO0O, c2206wr2.f25390OooOOO, c2206wr2.f25392OooOOOO));
        }
        return arrayList;
    }

    public md0 OooO0o() {
        return (md0) ((rd0) this.f18242OooOo0o).f23849OooO0O0.f24096OooOo;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void OooO0o0(com.google.android.gms.internal.ads.md0 r3, com.google.android.gms.internal.ads.kd0 r4, int r5, com.google.android.gms.internal.ads.n60 r6, long r7) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f18243OooOoO0
            com.google.android.gms.internal.ads.h20 r0 = (com.google.android.gms.internal.ads.h20) r0
            com.google.android.gms.internal.ads.ey r0 = r0.OooO00o()
            java.lang.String r1 = "gqi"
            java.lang.String r3 = r3.f21205OooO0O0
            r0.OooO0oO(r1, r3)
            r0.OooOO0(r4)
            java.lang.String r3 = "action"
            java.lang.String r1 = "adapter_status"
            r0.OooO0oO(r3, r1)
            java.lang.String r3 = "adapter_l"
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r0.OooO0oO(r3, r7)
            java.lang.String r3 = "sc"
            java.lang.String r5 = java.lang.Integer.toString(r5)
            r0.OooO0oO(r3, r5)
            r3 = 0
            if (r6 == 0) goto L61
            com.google.android.gms.ads.internal.client.zze r5 = r6.f21420OooOo0o
            int r5 = r5.zza
            java.lang.String r5 = java.lang.Integer.toString(r5)
            java.lang.String r7 = "arec"
            r0.OooO0oO(r7, r5)
            java.lang.String r5 = r6.getMessage()
            java.lang.Object r6 = r2.f18242OooOo0o
            com.google.android.gms.internal.ads.ce0 r6 = (com.google.android.gms.internal.ads.ce0) r6
            java.util.regex.Pattern r6 = r6.f17994OooO00o
            if (r6 == 0) goto L59
            if (r5 != 0) goto L4a
            goto L59
        L4a:
            java.util.regex.Matcher r5 = r6.matcher(r5)
            boolean r6 = r5.find()
            if (r6 == 0) goto L59
            java.lang.String r5 = r5.group()
            goto L5a
        L59:
            r5 = r3
        L5a:
            if (r5 == 0) goto L61
            java.lang.String r6 = "areec"
            r0.OooO0oO(r6, r5)
        L61:
            java.util.List r4 = r4.f20505OooOo00
            java.util.Iterator r4 = r4.iterator()
        L67:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L7e
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r2.f18240OooOo
            com.google.android.gms.internal.ads.s10 r6 = (com.google.android.gms.internal.ads.s10) r6
            com.google.android.gms.internal.ads.r10 r5 = r6.OooO00o(r5)
            if (r5 == 0) goto L67
            r3 = r5
        L7e:
            if (r3 == 0) goto La1
            java.lang.String r4 = "ancn"
            java.lang.String r5 = r3.f23726OooO00o
            r0.OooO0oO(r4, r5)
            com.google.android.gms.internal.ads.lg r4 = r3.f23727OooO0O0
            if (r4 == 0) goto L94
            java.lang.String r5 = "adapter_v"
            java.lang.String r4 = r4.toString()
            r0.OooO0oO(r5, r4)
        L94:
            com.google.android.gms.internal.ads.lg r3 = r3.f23728OooO0OO
            if (r3 == 0) goto La1
            java.lang.String r4 = "adapter_sv"
            java.lang.String r3 = r3.toString()
            r0.OooO0oO(r4, r3)
        La1:
            r0.OooOOO0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.de0.OooO0o0(com.google.android.gms.internal.ads.md0, com.google.android.gms.internal.ads.kd0, int, com.google.android.gms.internal.ads.n60, long):void");
    }

    @Override // com.google.android.gms.internal.ads.o0000Ooo
    public o000O OooO0oO(int i, int i2) {
        o0000Ooo o0000ooo = (o0000Ooo) this.f18242OooOo0o;
        if (i2 != 3) {
            return o0000ooo.OooO0oO(i, i2);
        }
        SparseArray sparseArray = (SparseArray) this.f18243OooOoO0;
        C1882o c1882o = (C1882o) sparseArray.get(i);
        if (c1882o != null) {
            return c1882o;
        }
        C1882o c1882o2 = new C1882o(o0000ooo.OooO0oO(i, 3), (o0oo0000) this.f18240OooOo);
        sparseArray.put(i, c1882o2);
        return c1882o2;
    }

    @Override // com.google.android.gms.internal.ads.tc0
    public /* bridge */ /* synthetic */ o00000oO.OooOOO OooO0oo(C1548ey c1548ey, sc0 sc0Var) {
        return OooOO0O(c1548ey, sc0Var, null);
    }

    @Override // Oooo00O.OooO0OO
    public void OooOO0(Bundle bundle) throws Throwable {
        synchronized (((com.google.android.gms.internal.measurement.o0OOO00) this.f18243OooOoO0).f26562OooOo) {
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                com.google.android.gms.internal.measurement.o0OOO00 o0ooo00 = (com.google.android.gms.internal.measurement.o0OOO00) this.f18243OooOoO0;
                if (o0ooo00.f26563OooOo0O) {
                    return;
                }
                o0ooo00.f26563OooOo0O = true;
                C1666i4 c1666i4 = (C1666i4) o0ooo00.f26564OooOo0o;
                if (c1666i4 == null) {
                    return;
                }
                o00000oO.OooOOO oooOOOOooO00o = AbstractC2200wl.f25321OooO00o.OooO00o(new OoooOOO.o0OOOO0o(this, c1666i4, (C1702j4) this.f18242OooOo0o, (C1776l4) this.f18240OooOo, 9));
                C1776l4 c1776l4 = (C1776l4) this.f18240OooOo;
                c1776l4.addListener(new wp0(c1776l4, false, oooOOOOooO00o, 5), AbstractC2200wl.f25327OooO0oO);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public o00000oO.OooOOO OooOO0O(C1548ey c1548ey, sc0 sc0Var, InterfaceC1691iu interfaceC1691iu) {
        o00000oO.OooOOO oooOOOOooooOO;
        o00000oO.OooOOO oooOOOOoooOOO;
        de0 de0Var = (de0) this.f18242OooOo0o;
        cq0 cq0Var = (cq0) this.f18240OooOo;
        de0 de0Var2 = new de0(de0Var, interfaceC1691iu, cq0Var);
        oc0 oc0Var = (oc0) de0Var2.f18243OooOoO0;
        if (oc0Var == null) {
            if (((Boolean) AbstractC1891o8.f22356OooO00o.OooOOO()).booleanValue()) {
                C1875nt c1875ntZzb = interfaceC1691iu.zzb();
                df0 df0VarOooO00o = c1875ntZzb.f21588OooO0OO.OooO00o(ef0.GET_CACHE_KEY, c1875ntZzb.f21585OooO.OooO0O0()).OooOO0(new C1786le(3, c1875ntZzb, (ne0) de0Var.f18240OooOo)).OooO00o();
                df0VarOooO00o.addListener(new wp0(0, df0VarOooO00o, new p80(c1875ntZzb, 11)), c1875ntZzb.f21594OooOO0);
                oooOOOOoooOOO = ii0.OoooOOO(ii0.Ooooooo(tp0.OooOOo(df0VarOooO00o), new nc0(de0Var2, 1), cq0Var), v40.class, new nc0(de0Var2, 0), cq0Var);
            } else {
                oc0 oc0Var2 = new oc0(null, de0Var2.OooOo00());
                de0Var2.f18243OooOoO0 = oc0Var2;
                oooOOOOoooOOO = ii0.OooooOO(oc0Var2);
            }
            oooOOOOooooOO = ii0.Ooooooo(oooOOOOoooOOO, new o0O0o00O(16), cq0Var);
        } else {
            oooOOOOooooOO = ii0.OooooOO(oc0Var);
        }
        return ii0.OoooOOO(ii0.ooOO(tp0.OooOOo(oooOOOOooooOO), new C1786le(12, this, interfaceC1691iu), cq0Var), Exception.class, new o0O0o00O(15), cq0Var);
    }

    public void OooOO0o(o0000Ooo o0000ooo, oOo00o00 ooo00o00) {
        int i = 0;
        while (true) {
            o000O[] o000oArr = (o000O[]) this.f18240OooOo;
            if (i >= o000oArr.length) {
                return;
            }
            ooo00o00.OooO00o();
            ooo00o00.OooO0O0();
            o000O o000oOooO0oO = o0000ooo.OooO0oO(ooo00o00.f22886OooO0Oo, 3);
            o0OoOo0 o0oooo0 = (o0OoOo0) ((List) this.f18242OooOo0o).get(i);
            String str = o0oooo0.f22222OooOOO0;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            af0.OoooOOo("Invalid closed caption MIME type provided: ".concat(String.valueOf(str)), z);
            String str2 = o0oooo0.f22211OooO00o;
            if (str2 == null) {
                ooo00o00.OooO0O0();
                str2 = ooo00o00.f22887OooO0o0;
            }
            jb1 jb1Var = new jb1();
            jb1Var.f20241OooO00o = str2;
            jb1Var.OooO0OO(str);
            jb1Var.f20246OooO0o0 = o0oooo0.f22216OooO0o0;
            jb1Var.f20244OooO0Oo = o0oooo0.f22214OooO0Oo;
            jb1Var.f20269Oooo000 = o0oooo0.f22241Oooo00O;
            jb1Var.f20253OooOOOO = o0oooo0.f22224OooOOOo;
            o000oOooO0oO.OooO0o0(new o0OoOo0(jb1Var));
            o000oArr[i] = o000oOooO0oO;
            i++;
        }
    }

    public synchronized void OooOOo(zzm zzmVar, int i) {
        this.f18243OooOoO0 = null;
        i90 i90Var = new i90(i);
        C1847n1 c1847n1 = new C1847n1(this, 25);
        ((s20) this.f18242OooOo0o).OooO0Oo(zzmVar, (String) this.f18240OooOo, i90Var, c1847n1);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String OooOOo0(android.content.Context r13) {
        /*
            r12 = this;
            r0 = 31
            java.lang.Object r1 = r12.f18243OooOoO0
            com.google.android.gms.internal.ads.r r1 = (com.google.android.gms.internal.ads.C1993r) r1
            java.lang.Object r2 = r12.f18240OooOo
            com.google.android.gms.internal.ads.n1 r2 = (com.google.android.gms.internal.ads.C1847n1) r2
            java.lang.String r3 = "E"
            if (r2 == 0) goto L3e
            boolean r4 = r1.OooOoO()
            if (r4 != 0) goto L3e
            java.lang.Object r2 = r2.f21381OooOo0o
            com.google.android.gms.internal.ads.nq0 r2 = (com.google.android.gms.internal.ads.nq0) r2
            if (r2 == 0) goto L3e
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r0) goto L24
            boolean r4 = r2.isDone()
            if (r4 == 0) goto L3e
        L24:
            int r4 = r1.OooOo0o()     // Catch: java.lang.Throwable -> L3e
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L3e
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r2 = r2.get(r4, r6)     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.e0 r2 = (com.google.android.gms.internal.ads.C1514e0) r2     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L3e
            boolean r4 = r2.Oooooo0()     // Catch: java.lang.Throwable -> L3e
            if (r4 == 0) goto L3e
            java.lang.String r2 = r2.o0ooOO0()     // Catch: java.lang.Throwable -> L3e
            goto L3f
        L3e:
            r2 = r3
        L3f:
            boolean r4 = r2.equals(r3)
            if (r4 == 0) goto Lbf
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 >= r0) goto L4b
            goto Lbf
        L4b:
            java.lang.String r5 = ""
            if (r4 >= r0) goto L54
            com.google.android.gms.internal.ads.yp0 r0 = com.google.android.gms.internal.ads.ii0.OooooOO(r5)     // Catch: java.lang.Throwable -> Lbf
            goto Lb1
        L54:
            java.lang.String r7 = r13.getPackageName()     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = "X.509"
            java.security.cert.CertificateFactory r0 = java.security.cert.CertificateFactory.getInstance(r0)     // Catch: java.lang.Throwable -> Lad
            com.google.android.gms.internal.ads.xn0 r4 = com.google.android.gms.internal.ads.ao0.f17069OooO0Oo     // Catch: java.lang.Throwable -> Lad
            com.google.android.gms.internal.ads.ao0 r6 = r4.OooO0Oo()     // Catch: java.lang.Throwable -> Lad
            java.lang.String r8 = "308204433082032ba003020102020900c2e08746644a308d300d06092a864886f70d01010405003074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964301e170d3038303832313233313333345a170d3336303130373233313333345a3074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f696430820120300d06092a864886f70d01010105000382010d00308201080282010100ab562e00d83ba208ae0a966f124e29da11f2ab56d08f58e2cca91303e9b754d372f640a71b1dcb130967624e4656a7776a92193db2e5bfb724a91e77188b0e6a47a43b33d9609b77183145ccdf7b2e586674c9e1565b1f4c6a5955bff251a63dabf9c55c27222252e875e4f8154a645f897168c0b1bfc612eabf785769bb34aa7984dc7e2ea2764cae8307d8c17154d7ee5f64a51a44a602c249054157dc02cd5f5c0e55fbef8519fbe327f0b1511692c5a06f19d18385f5c4dbc2d6b93f68cc2979c70e18ab93866b3bd5db8999552a0e3b4c99df58fb918bedc182ba35e003c1b4b10dd244a8ee24fffd333872ab5221985edab0fc0d0b145b6aa192858e79020103a381d93081d6301d0603551d0e04160414c77d8cc2211756259a7fd382df6be398e4d786a53081a60603551d2304819e30819b8014c77d8cc2211756259a7fd382df6be398e4d786a5a178a4763074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964820900c2e08746644a308d300c0603551d13040530030101ff300d06092a864886f70d010104050003820101006dd252ceef85302c360aaace939bcff2cca904bb5d7a1661f8ae46b2994204d0ff4a68c7ed1a531ec4595a623ce60763b167297a7ae35712c407f208f0cb109429124d7b106219c084ca3eb3f9ad5fb871ef92269a8be28bf16d44c8d9a08e6cb2f005bb3fe2cb96447e868e731076ad45b33f6009ea19c161e62641aa99271dfd5228c5c587875ddb7f452758d661f6cc0cccb7352e424cc4365c523532f7325137593c4ae341f4db41edda0d0b1071a7c440f0fe9ea01cb627ca674369d084bd2fd911ff06cdbf2cfa10dc0f893ae35762919048c7efc64c7144178342f70581c9de573af55b390dd7fdb9418631895d5f759f30112687ff621410c069308a"
            byte[] r6 = r6.OooO0oo(r8)     // Catch: java.lang.Throwable -> Lad
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lad
            r10.<init>()     // Catch: java.lang.Throwable -> Lad
            java.io.ByteArrayInputStream r8 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> Lad
            r8.<init>(r6)     // Catch: java.lang.Throwable -> Lad
            java.security.cert.Certificate r6 = r0.generateCertificate(r8)     // Catch: java.lang.Throwable -> Lad
            r10.add(r6)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r6 = android.os.Build.TYPE     // Catch: java.lang.Throwable -> Lad
            java.lang.String r8 = "user"
            boolean r6 = r6.equals(r8)     // Catch: java.lang.Throwable -> Lad
            if (r6 != 0) goto L9b
            com.google.android.gms.internal.ads.ao0 r4 = r4.OooO0Oo()     // Catch: java.lang.Throwable -> Lad
            java.lang.String r6 = "308204a830820390a003020102020900d585b86c7dd34ef5300d06092a864886f70d0101040500308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d301e170d3038303431353233333635365a170d3335303930313233333635365a308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d30820120300d06092a864886f70d01010105000382010d00308201080282010100d6ce2e080abfe2314dd18db3cfd3185cb43d33fa0c74e1bdb6d1db8913f62c5c39df56f846813d65bec0f3ca426b07c5a8ed5a3990c167e76bc999b927894b8f0b22001994a92915e572c56d2a301ba36fc5fc113ad6cb9e7435a16d23ab7dfaeee165e4df1f0a8dbda70a869d516c4e9d051196ca7c0c557f175bc375f948c56aae86089ba44f8aa6a4dd9a7dbf2c0a352282ad06b8cc185eb15579eef86d080b1d6189c0f9af98b1c2ebd107ea45abdb68a3c7838a5e5488c76c53d40b121de7bbd30e620c188ae1aa61dbbc87dd3c645f2f55f3d4c375ec4070a93f7151d83670c16a971abe5ef2d11890e1b8aef3298cf066bf9e6ce144ac9ae86d1c1b0f020103a381fc3081f9301d0603551d0e041604148d1cc5be954c433c61863a15b04cbc03f24fe0b23081c90603551d230481c13081be80148d1cc5be954c433c61863a15b04cbc03f24fe0b2a1819aa48197308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d820900d585b86c7dd34ef5300c0603551d13040530030101ff300d06092a864886f70d0101040500038201010019d30cf105fb78923f4c0d7dd223233d40967acfce00081d5bd7c6e9d6ed206b0e11209506416ca244939913d26b4aa0e0f524cad2bb5c6e4ca1016a15916ea1ec5dc95a5e3a010036f49248d5109bbf2e1e618186673a3be56daf0b77b1c229e3c255e3e84c905d2387efba09cbf13b202b4e5a22c93263484a23d2fc29fa9f1939759733afd8aa160f4296c2d0163e8182859c6643e9c1962fa0c18333335bc090ff9a6b22ded1ad444229a539a94eefadabd065ced24b3e51e5dd7b66787bef12fe97fba484c423fb4ff8cc494c02f0f5051612ff6529393e8e46eac5bb21f277c151aa5f2aa627d1e89da70ab6033569de3b9897bfff7ca9da3e1243f60b"
            byte[] r4 = r4.OooO0oo(r6)     // Catch: java.lang.Throwable -> Lad
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> Lad
            r6.<init>(r4)     // Catch: java.lang.Throwable -> Lad
            java.security.cert.Certificate r0 = r0.generateCertificate(r6)     // Catch: java.lang.Throwable -> Lad
            r10.add(r0)     // Catch: java.lang.Throwable -> Lad
        L9b:
            com.google.android.gms.internal.ads.t0 r11 = new com.google.android.gms.internal.ads.t0     // Catch: java.lang.Throwable -> Lad
            r11.<init>()     // Catch: java.lang.Throwable -> Lad
            android.content.pm.PackageManager r6 = r13.getPackageManager()     // Catch: java.lang.Throwable -> Lad
            r8 = 0
            r9 = 8
            r6.requestChecksums(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lad
            com.google.android.gms.internal.ads.jq0 r0 = r11.f24213OooO0O0     // Catch: java.lang.Throwable -> Lad
            goto Lb1
        Lad:
            com.google.android.gms.internal.ads.yp0 r0 = com.google.android.gms.internal.ads.ii0.OooooOO(r5)     // Catch: java.lang.Throwable -> Lbf java.lang.Throwable -> Lbf
        Lb1:
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Lbf java.lang.Throwable -> Lbf
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> Lbf java.lang.Throwable -> Lbf
            boolean r4 = com.google.android.gms.internal.ads.xh0.OooOo(r0)     // Catch: java.lang.Throwable -> Lbf java.lang.Throwable -> Lbf
            r5 = 1
            if (r5 == r4) goto Lbf
            r2 = r0
        Lbf:
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto Lcf
            boolean r0 = r1.OooOoO0()
            if (r0 != 0) goto Lcf
            java.lang.String r2 = OooOOO0(r13)     // Catch: java.lang.ClassCastException -> Lcf
        Lcf:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.de0.OooOOo0(android.content.Context):java.lang.String");
    }

    public synchronized void OooOOoo(pe0 pe0Var, oe0 oe0Var) {
        try {
            ie0 ie0Var = (ie0) ((ConcurrentHashMap) this.f18242OooOo0o).get(pe0Var);
            ((Oooo0OO.oo000o) zzv.zzC()).getClass();
            oe0Var.f22982OooO0Oo = System.currentTimeMillis();
            if (ie0Var == null) {
                ne0 ne0Var = (ne0) this.f18240OooOo;
                ie0 ie0Var2 = new ie0(ne0Var.zzd, ne0Var.zze * 1000);
                if (((ConcurrentHashMap) this.f18242OooOo0o).size() == ((ne0) this.f18240OooOo).zzc) {
                    int i = ((ne0) this.f18240OooOo).zzg;
                    int i2 = i - 1;
                    pe0 pe0Var2 = null;
                    if (i == 0) {
                        throw null;
                    }
                    long j = LocationRequestCompat.PASSIVE_INTERVAL;
                    if (i2 == 0) {
                        for (Map.Entry entry : ((ConcurrentHashMap) this.f18242OooOo0o).entrySet()) {
                            if (((ie0) entry.getValue()).f20035OooO0Oo.f25298OooO00o < j) {
                                j = ((ie0) entry.getValue()).f20035OooO0Oo.f25298OooO00o;
                                pe0Var2 = (pe0) entry.getKey();
                            }
                        }
                        if (pe0Var2 != null) {
                            ((ConcurrentHashMap) this.f18242OooOo0o).remove(pe0Var2);
                        }
                    } else if (i2 == 1) {
                        for (Map.Entry entry2 : ((ConcurrentHashMap) this.f18242OooOo0o).entrySet()) {
                            if (((ie0) entry2.getValue()).f20035OooO0Oo.f25300OooO0OO < j) {
                                j = ((ie0) entry2.getValue()).f20035OooO0Oo.f25300OooO0OO;
                                pe0Var2 = (pe0) entry2.getKey();
                            }
                        }
                        if (pe0Var2 != null) {
                            ((ConcurrentHashMap) this.f18242OooOo0o).remove(pe0Var2);
                        }
                    } else if (i2 == 2) {
                        int i3 = Integer.MAX_VALUE;
                        for (Map.Entry entry3 : ((ConcurrentHashMap) this.f18242OooOo0o).entrySet()) {
                            if (((ie0) entry3.getValue()).f20035OooO0Oo.f25301OooO0Oo < i3) {
                                i3 = ((ie0) entry3.getValue()).f20035OooO0Oo.f25301OooO0Oo;
                                pe0Var2 = (pe0) entry3.getKey();
                            }
                        }
                        if (pe0Var2 != null) {
                            ((ConcurrentHashMap) this.f18242OooOo0o).remove(pe0Var2);
                        }
                    }
                    ke0 ke0Var = (ke0) this.f18243OooOoO0;
                    ke0Var.f20561OooO0OO++;
                    ke0Var.f20559OooO00o.f20295OooOo0o = true;
                }
                ((ConcurrentHashMap) this.f18242OooOo0o).put(pe0Var, ie0Var2);
                ke0 ke0Var2 = (ke0) this.f18243OooOoO0;
                ke0Var2.f20560OooO0O0++;
                ke0Var2.f20559OooO00o.f20294OooOo0O = true;
                ie0Var = ie0Var2;
            }
            we0 we0Var = ie0Var.f20035OooO0Oo;
            we0Var.getClass();
            ((Oooo0OO.oo000o) zzv.zzC()).getClass();
            we0Var.f25300OooO0OO = System.currentTimeMillis();
            we0Var.f25301OooO0Oo++;
            ie0Var.OooO00o();
            LinkedList linkedList = ie0Var.f20032OooO00o;
            if (linkedList.size() != ie0Var.f20033OooO0O0) {
                linkedList.add(oe0Var);
            }
            ke0 ke0Var3 = (ke0) this.f18243OooOoO0;
            ke0Var3.f20563OooO0o++;
            je0 je0Var = ke0Var3.f20559OooO00o;
            je0 je0VarClone = je0Var.clone();
            je0Var.f20294OooOo0O = false;
            je0Var.f20295OooOo0o = false;
            ve0 ve0Var = ie0Var.f20035OooO0Oo.f25299OooO0O0;
            ve0 ve0VarClone = ve0Var.clone();
            ve0Var.f24969OooOo0O = false;
            ve0Var.f24970OooOo0o = 0;
            C1999r5 c1999r5OooOo0o = C2184w5.OooOo0o();
            C1925p5 c1925p5OooOoO = C1962q5.OooOoO();
            c1925p5OooOoO.OooO0Oo();
            C1962q5.OooOo0o((C1962q5) c1925p5OooOoO.f25822OooOo0o);
            C2110u5 c2110u5OooOoO = C2147v5.OooOoO();
            boolean z = je0VarClone.f20294OooOo0O;
            c2110u5OooOoO.OooO0Oo();
            C2147v5.OooOo0o((C2147v5) c2110u5OooOoO.f25822OooOo0o, z);
            boolean z2 = je0VarClone.f20295OooOo0o;
            c2110u5OooOoO.OooO0Oo();
            C2147v5.OooOo((C2147v5) c2110u5OooOoO.f25822OooOo0o, z2);
            int i4 = ve0VarClone.f24970OooOo0o;
            c2110u5OooOoO.OooO0Oo();
            C2147v5.OooOoO0((C2147v5) c2110u5OooOoO.f25822OooOo0o, i4);
            c1925p5OooOoO.OooO0Oo();
            C1962q5.OooOoO0((C1962q5) c1925p5OooOoO.f25822OooOo0o, (C2147v5) c2110u5OooOoO.OooO0O0());
            c1999r5OooOo0o.OooO0Oo();
            C2184w5.OooOo((C2184w5) c1999r5OooOo0o.f25822OooOo0o, (C1962q5) c1925p5OooOoO.OooO0O0());
            oe0Var.f22979OooO00o.zzb().f21590OooO0o.OooOOO((C2184w5) c1999r5OooOo0o.OooO0O0());
            OooOo0();
        } catch (Throwable th) {
            throw th;
        }
    }

    public void OooOo0() {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00oooOO)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            ne0 ne0Var = (ne0) this.f18240OooOo;
            sb.append(ne0Var.zzb);
            sb.append(" PoolCollection");
            StringBuilder sb2 = new StringBuilder("\n\tPool does not exist: ");
            ke0 ke0Var = (ke0) this.f18243OooOoO0;
            sb2.append(ke0Var.f20562OooO0Oo);
            sb2.append("\n\tNew pools created: ");
            sb2.append(ke0Var.f20560OooO0O0);
            sb2.append("\n\tPools removed: ");
            sb2.append(ke0Var.f20561OooO0OO);
            sb2.append("\n\tEntries added: ");
            sb2.append(ke0Var.f20563OooO0o);
            sb2.append("\n\tNo entries retrieved: ");
            sb2.append(ke0Var.f20564OooO0o0);
            sb2.append("\n");
            sb.append(sb2.toString());
            int i = 0;
            for (Map.Entry entry : ((ConcurrentHashMap) this.f18242OooOo0o).entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((pe0) entry.getKey()).hashCode());
                sb.append("    ");
                int i2 = 0;
                while (true) {
                    ie0 ie0Var = (ie0) entry.getValue();
                    ie0Var.OooO00o();
                    if (i2 >= ie0Var.f20032OooO00o.size()) {
                        break;
                    }
                    sb.append("[O]");
                    i2++;
                }
                ie0 ie0Var2 = (ie0) entry.getValue();
                ie0Var2.OooO00o();
                for (int size = ie0Var2.f20032OooO00o.size(); size < ne0Var.zzd; size++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                ie0 ie0Var3 = (ie0) entry.getValue();
                StringBuilder sb3 = new StringBuilder("Created: ");
                we0 we0Var = ie0Var3.f20035OooO0Oo;
                sb3.append(we0Var.f25298OooO00o);
                sb3.append(" Last accessed: ");
                sb3.append(we0Var.f25300OooO0OO);
                sb3.append(" Accesses: ");
                sb3.append(we0Var.f25301OooO0Oo);
                sb3.append("\nEntries retrieved: Valid: ");
                sb3.append(we0Var.f25303OooO0o0);
                sb3.append(" Stale: ");
                sb3.append(we0Var.f25302OooO0o);
                sb.append(sb3.toString());
                sb.append("\n");
            }
            while (i < ne0Var.zzc) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            zzo.zze(sb.toString());
        }
    }

    public qe0 OooOo00() {
        vd0 vd0VarZzg = ((InterfaceC1691iu) this.f18240OooOo).zzg();
        ne0 ne0Var = (ne0) ((de0) this.f18242OooOo0o).f18240OooOo;
        C2308zi c2308ziOooO00o = new C2271yi(ne0Var.zza).OooO00o();
        String str = ne0Var.zzf;
        return new qe0(vd0VarZzg.f24954OooO0Oo, vd0VarZzg.f24955OooO0o, c2308ziOooO00o.f26189OooOO0, str, vd0VarZzg.f24959OooOO0);
    }

    public void OooOo0O(InterfaceC2156ve interfaceC2156ve) {
        InterfaceC2156ve adapterCreator;
        boolean zBooleanValue = ((Boolean) AbstractC1670i8.f19990OooO00o.OooOOO()).booleanValue();
        AtomicReference atomicReference = (AtomicReference) this.f18243OooOoO0;
        if (!zBooleanValue) {
            while (!atomicReference.compareAndSet(null, interfaceC2156ve)) {
                if (atomicReference.get() != null && atomicReference.get() != null) {
                    return;
                }
            }
            return;
        }
        zzcw zzcwVar = (zzcw) this.f18240OooOo;
        if (zzcwVar == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = zzcwVar.getAdapterCreator();
            } catch (RemoteException unused) {
            }
        }
        if (adapterCreator == null) {
            adapterCreator = interfaceC2156ve;
        }
        while (!atomicReference.compareAndSet(null, adapterCreator)) {
            if (atomicReference.get() != null && atomicReference.get() != null) {
                return;
            }
        }
    }

    public tp0 OooOo0o(C2197wi c2197wi, x40 x40Var, x40 x40Var2, lp0 lp0Var) {
        String str = c2197wi.zzd;
        zzv.zzq();
        boolean zZzD = zzs.zzD(str);
        C2163vl c2163vl = (C2163vl) this.f18242OooOo0o;
        return ii0.OoooOoO(ii0.ooOO(ii0.ooOO(tp0.OooOOo(zZzD ? ii0.Ooooo00(new v40(1)) : ii0.OoooOoO(x40Var.Oooo000(c2197wi), ExecutionException.class, new C2094tq(7), c2163vl)), new C2094tq(6), c2163vl), lp0Var, c2163vl), v40.class, new C1676ie(this, x40Var2, c2197wi, lp0Var, 2), c2163vl);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public void onAdClicked(MediationBannerAdapter mediationBannerAdapter) {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdClicked.");
        try {
            ((InterfaceC1383af) this.f18242OooOo0o).zze();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public void onAdClosed(MediationBannerAdapter mediationBannerAdapter) {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdClosed.");
        try {
            ((InterfaceC1383af) this.f18242OooOo0o).zzf();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i) {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdFailedToLoad with error. " + i);
        try {
            ((InterfaceC1383af) this.f18242OooOo0o).OooO00o(i);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public void onAdImpression(MediationNativeAdapter mediationNativeAdapter) {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        UnifiedNativeAdMapper unifiedNativeAdMapper = (UnifiedNativeAdMapper) this.f18240OooOo;
        if (((C1451ca) this.f18243OooOoO0) == null) {
            if (unifiedNativeAdMapper == null) {
                zzo.zzl("#007 Could not call remote method.", null);
                return;
            } else if (!unifiedNativeAdMapper.getOverrideImpressionRecording()) {
                zzo.zze("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        zzo.zze("Adapter called onAdImpression.");
        try {
            ((InterfaceC1383af) this.f18242OooOo0o).zzm();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter) {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdLeftApplication.");
        try {
            ((InterfaceC1383af) this.f18242OooOo0o).zzn();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public void onAdLoaded(MediationBannerAdapter mediationBannerAdapter) {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdLoaded.");
        try {
            ((InterfaceC1383af) this.f18242OooOo0o).zzo();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public void onAdOpened(MediationBannerAdapter mediationBannerAdapter) {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdOpened.");
        try {
            ((InterfaceC1383af) this.f18242OooOo0o).zzp();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public void onFailure(AdError adError) {
        switch (this.f18241OooOo0O) {
            case 10:
                InterfaceC1383af interfaceC1383af = (InterfaceC1383af) this.f18242OooOo0o;
                try {
                    zzo.zze(((Adapter) this.f18240OooOo).getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + adError.getCode() + ". ErrorMessage = " + adError.getMessage() + ". ErrorDomain = " + adError.getDomain());
                    interfaceC1383af.OooOoo0(adError.zza());
                    interfaceC1383af.OooOoO(adError.getCode(), adError.getMessage());
                    interfaceC1383af.OooO00o(adError.getCode());
                    break;
                } catch (RemoteException e) {
                    zzo.zzh("", e);
                }
            case 11:
            default:
                try {
                    ((InterfaceC1457cg) this.f18242OooOo0o).zzf(adError.zza());
                    break;
                } catch (RemoteException e2) {
                    zzo.zzh("", e2);
                    return;
                }
            case 12:
                try {
                    ((InterfaceC2231xf) this.f18242OooOo0o).zzf(adError.zza());
                    break;
                } catch (RemoteException e3) {
                    zzo.zzh("", e3);
                    return;
                }
            case 13:
                try {
                    ((InterfaceC2083tf) this.f18242OooOo0o).zzf(adError.zza());
                    break;
                } catch (RemoteException e4) {
                    zzo.zzh("", e4);
                    return;
                }
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    public void onNativeAdLoaded(NativeAd nativeAd) {
        ((x30) this.f18242OooOo0o).o000O0O0((String) this.f18240OooOo, nativeAd, (String) this.f18243OooOoO0);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        switch (this.f18241OooOo0O) {
            case 10:
                InterfaceC1383af interfaceC1383af = (InterfaceC1383af) this.f18242OooOo0o;
                try {
                    ((BinderC1824mf) this.f18243OooOoO0).f21237OooOooo = (MediationInterscrollerAd) obj;
                    interfaceC1383af.zzo();
                } catch (RemoteException e) {
                    zzo.zzh("", e);
                }
                break;
            case 11:
            default:
                MediationRewardedAd mediationRewardedAd = (MediationRewardedAd) obj;
                InterfaceC1457cg interfaceC1457cg = (InterfaceC1457cg) this.f18242OooOo0o;
                if (mediationRewardedAd != null) {
                    try {
                        ((BinderC1751kg) this.f18243OooOoO0).f20586OooOo = mediationRewardedAd;
                        interfaceC1457cg.zzg();
                    } catch (RemoteException e2) {
                        zzo.zzh("", e2);
                    }
                    break;
                } else {
                    zzo.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
                    try {
                        interfaceC1457cg.zze("Adapter returned null.");
                        break;
                    } catch (RemoteException e3) {
                        zzo.zzh("", e3);
                        return null;
                    }
                }
            case 12:
                MediationInterstitialAd mediationInterstitialAd = (MediationInterstitialAd) obj;
                InterfaceC2231xf interfaceC2231xf = (InterfaceC2231xf) this.f18242OooOo0o;
                if (mediationInterstitialAd != null) {
                    try {
                        ((BinderC1751kg) this.f18243OooOoO0).f20588OooOo0o = mediationInterstitialAd;
                        interfaceC2231xf.zzg();
                    } catch (RemoteException e4) {
                        zzo.zzh("", e4);
                    }
                    break;
                } else {
                    zzo.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
                    try {
                        interfaceC2231xf.zze("Adapter returned null.");
                        break;
                    } catch (RemoteException e5) {
                        zzo.zzh("", e5);
                        return null;
                    }
                }
            case 13:
                MediationAppOpenAd mediationAppOpenAd = (MediationAppOpenAd) obj;
                InterfaceC2083tf interfaceC2083tf = (InterfaceC2083tf) this.f18242OooOo0o;
                if (mediationAppOpenAd != null) {
                    try {
                        ((BinderC1751kg) this.f18243OooOoO0).f20590OooOoO0 = mediationAppOpenAd;
                        interfaceC2083tf.zzg();
                    } catch (RemoteException e6) {
                        zzo.zzh("", e6);
                    }
                    break;
                } else {
                    zzo.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
                    try {
                        interfaceC2083tf.zze("Adapter returned null.");
                        break;
                    } catch (RemoteException e7) {
                        zzo.zzh("", e7);
                        return null;
                    }
                }
        }
        return new p80((InterfaceC1383af) this.f18240OooOo, 9);
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public void onVideoEnd(MediationNativeAdapter mediationNativeAdapter) {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onVideoEnd.");
        try {
            ((InterfaceC1383af) this.f18242OooOo0o).zzv();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.o0o0000
    public int zza() {
        return ((long[]) this.f18243OooOoO0).length;
    }

    @Override // com.google.android.gms.internal.ads.o0o0000
    public long zzb(int i) {
        af0.OoooO0(i >= 0);
        long[] jArr = (long[]) this.f18243OooOoO0;
        af0.OoooO0(i < jArr.length);
        return jArr[i];
    }

    @Override // com.google.android.gms.internal.ads.tc0
    public /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public void zze(MediationNativeAdapter mediationNativeAdapter, C1451ca c1451ca, String str) {
        try {
            ((InterfaceC1383af) this.f18242OooOo0o).o000(c1451ca.f17977OooO00o, str);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public de0(Context context, VersionInfoParcel versionInfoParcel, C1998r4 c1998r4, C1548ey c1548ey) {
        this.f18241OooOo0O = 21;
        this.f18242OooOo0o = context;
        this.f18243OooOoO0 = versionInfoParcel;
        this.f18240OooOo = c1998r4;
    }

    @Override // com.google.android.gms.internal.ads.bf0
    public Object zza(Object obj) {
        s50 s50Var = (s50) this.f18242OooOo0o;
        s50Var.getClass();
        s50Var.f24005OooO0O0.execute(new o000oOoO((SQLiteDatabase) obj, (String) this.f18243OooOoO0, (zzu) this.f18240OooOo, 6));
        return null;
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public void zzd(MediationNativeAdapter mediationNativeAdapter, C1451ca c1451ca) {
        String strZzi;
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        c1451ca.getClass();
        try {
            strZzi = c1451ca.f17977OooO00o.zzi();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            strZzi = null;
        }
        zzo.zze("Adapter called onAdLoaded with template id ".concat(String.valueOf(strZzi)));
        this.f18243OooOoO0 = c1451ca;
        try {
            ((InterfaceC1383af) this.f18242OooOo0o).zzo();
        } catch (RemoteException e2) {
            zzo.zzl("#007 Could not call remote method.", e2);
        }
    }

    public de0(InterfaceC1383af interfaceC1383af) {
        this.f18241OooOo0O = 11;
        this.f18242OooOo0o = interfaceC1383af;
    }

    public de0(rd0 rd0Var, kd0 kd0Var, String str) {
        this.f18241OooOo0O = 15;
        this.f18242OooOo0o = rd0Var;
        this.f18240OooOo = kd0Var;
        this.f18243OooOoO0 = str == null ? "com.google.ads.mediation.admob.AdMobAdapter" : str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1730jw, com.google.android.gms.internal.ads.InterfaceC1770kz
    /* renamed from: zza */
    public void mo13701zza(Object obj) {
        ((InterfaceC2024ru) obj).OooO0oo((BinderC1460cj) this.f18242OooOo0o, (String) this.f18240OooOo, (String) this.f18243OooOoO0);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public void zzb(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAppEvent.");
        try {
            ((InterfaceC1383af) this.f18242OooOo0o).OooOOOO(str, str2);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public de0(de0 de0Var, InterfaceC1691iu interfaceC1691iu, cq0 cq0Var) {
        this.f18241OooOo0O = 27;
        this.f18242OooOo0o = de0Var;
        this.f18240OooOo = interfaceC1691iu;
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdClicked.");
        try {
            ((InterfaceC1383af) this.f18242OooOo0o).zze();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdClosed.");
        try {
            ((InterfaceC1383af) this.f18242OooOo0o).zzf();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, AdError adError) {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdFailedToLoad with error. ErrorCode: " + adError.getCode() + ". ErrorMessage: " + adError.getMessage() + ". ErrorDomain: " + adError.getDomain());
        try {
            ((InterfaceC1383af) this.f18242OooOo0o).OooOoo0(adError.zza());
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdLeftApplication.");
        try {
            ((InterfaceC1383af) this.f18242OooOo0o).zzn();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdLoaded.");
        try {
            ((InterfaceC1383af) this.f18242OooOo0o).zzo();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdOpened.");
        try {
            ((InterfaceC1383af) this.f18242OooOo0o).zzp();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.vp0
    public void zza(Throwable th) {
        jf0 jf0Var = (jf0) this.f18242OooOo0o;
        jf0Var.OooOO0(false);
        mf0 mf0Var = (mf0) this.f18240OooOo;
        if (mf0Var == null) {
            ((hg0) this.f18243OooOoO0).f19777OooO0o.OooO0O0(jf0Var.zzm());
        } else {
            mf0Var.OooO00o(jf0Var);
            mf0Var.OooO0oo();
        }
    }

    public de0(de0 de0Var, cq0 cq0Var) {
        this.f18241OooOo0O = 26;
        this.f18243OooOoO0 = new C1658hx(20, (byte) 0);
        this.f18242OooOo0o = de0Var;
        this.f18240OooOo = cq0Var;
    }

    @Override // com.google.android.gms.internal.ads.vp0
    /* renamed from: zzb */
    public /* bridge */ /* synthetic */ void mo13705zzb(Object obj) {
        boolean z = ((zzt) obj) == zzt.zza;
        jf0 jf0Var = (jf0) this.f18242OooOo0o;
        jf0Var.OooOO0(z);
        mf0 mf0Var = (mf0) this.f18240OooOo;
        if (mf0Var == null) {
            ((hg0) this.f18243OooOoO0).f19777OooO0o.OooO0O0(jf0Var.zzm());
        } else {
            mf0Var.OooO00o(jf0Var);
            mf0Var.OooO0oo();
        }
    }

    public /* synthetic */ de0(Object obj, Object obj2, Object obj3, int i) {
        this.f18241OooOo0O = i;
        this.f18242OooOo0o = obj2;
        this.f18240OooOo = obj3;
        this.f18243OooOoO0 = obj;
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public void onAdClicked(MediationNativeAdapter mediationNativeAdapter) {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        UnifiedNativeAdMapper unifiedNativeAdMapper = (UnifiedNativeAdMapper) this.f18240OooOo;
        if (((C1451ca) this.f18243OooOoO0) == null) {
            if (unifiedNativeAdMapper == null) {
                zzo.zzl("#007 Could not call remote method.", null);
                return;
            } else if (!unifiedNativeAdMapper.getOverrideClickHandling()) {
                zzo.zze("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        zzo.zze("Adapter called onAdClicked.");
        try {
            ((InterfaceC1383af) this.f18242OooOo0o).zze();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public void onAdClosed(MediationNativeAdapter mediationNativeAdapter) {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdClosed.");
        try {
            ((InterfaceC1383af) this.f18242OooOo0o).zzf();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter) {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdLeftApplication.");
        try {
            ((InterfaceC1383af) this.f18242OooOo0o).zzn();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, UnifiedNativeAdMapper unifiedNativeAdMapper) {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdLoaded.");
        this.f18240OooOo = unifiedNativeAdMapper;
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            VideoController videoController = new VideoController();
            videoController.zzb(new BinderC1677if());
            if (unifiedNativeAdMapper != null && unifiedNativeAdMapper.hasVideoContent()) {
                unifiedNativeAdMapper.zze(videoController);
            }
        }
        try {
            ((InterfaceC1383af) this.f18242OooOo0o).zzo();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public void onAdOpened(MediationNativeAdapter mediationNativeAdapter) {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdOpened.");
        try {
            ((InterfaceC1383af) this.f18242OooOo0o).zzp();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public /* synthetic */ de0(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.f18241OooOo0O = i;
        this.f18242OooOo0o = obj;
        this.f18240OooOo = obj2;
        this.f18243OooOoO0 = obj3;
    }

    public de0() {
        this.f18241OooOo0O = 1;
        this.f18242OooOo0o = new ExecutorC2126ul(Executors.newSingleThreadExecutor(new p70(0)), new g61(9));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdFailedToLoad with error " + i + ".");
        try {
            ((InterfaceC1383af) this.f18242OooOo0o).OooO00o(i);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, AdError adError) {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdFailedToLoad with error. ErrorCode: " + adError.getCode() + ". ErrorMessage: " + adError.getMessage() + ". ErrorDomain: " + adError.getDomain());
        try {
            ((InterfaceC1383af) this.f18242OooOo0o).OooOoo0(adError.zza());
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public void onFailure(String str) {
        switch (this.f18241OooOo0O) {
            case 10:
                onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
            case 11:
            default:
                onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
            case 12:
                onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
            case 13:
                onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
        }
    }

    public de0(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        this.f18241OooOo0O = 9;
        Oooo00O.o000000O.OooO0oo(context);
        Oooo00O.o000000O.OooO0oo(onH5AdsEventListener);
        this.f18242OooOo0o = context;
        this.f18240OooOo = onH5AdsEventListener;
        AbstractC1448c7.OooO00o(context);
    }

    public de0(Context context, zzcw zzcwVar) {
        this.f18241OooOo0O = 0;
        this.f18243OooOoO0 = new AtomicReference();
        this.f18242OooOo0o = context;
        this.f18240OooOo = zzcwVar;
    }

    public de0(Context context, Executor executor, C1993r c1993r, C1847n1 c1847n1) {
        this.f18241OooOo0O = 6;
        this.f18240OooOo = c1847n1;
        this.f18243OooOoO0 = c1993r;
        nq0 nq0Var = new nq0(new CallableC2031s0(0, this, context));
        executor.execute(nq0Var);
        this.f18242OooOo0o = nq0Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, int i) {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdFailedToLoad with error " + i + ".");
        try {
            ((InterfaceC1383af) this.f18242OooOo0o).OooO00o(i);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public de0(o0000Ooo o0000ooo, o0oo0000 o0oo0000Var) {
        this.f18241OooOo0O = 2;
        this.f18242OooOo0o = o0000ooo;
        this.f18240OooOo = o0oo0000Var;
        this.f18243OooOoO0 = new SparseArray();
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, AdError adError) {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdFailedToLoad with error. ErrorCode: " + adError.getCode() + ". ErrorMessage: " + adError.getMessage() + ". ErrorDomain: " + adError.getDomain());
        try {
            ((InterfaceC1383af) this.f18242OooOo0o).OooOoo0(adError.zza());
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public de0(C2213wy c2213wy, h20 h20Var) {
        this.f18241OooOo0O = 25;
        this.f18242OooOo0o = c2213wy;
        c90 c90Var = new c90(h20Var);
        this.f18240OooOo = c90Var;
        this.f18243OooOoO0 = new g90(c90Var, c2213wy.f25426OooO0o0);
    }

    public de0(ne0 ne0Var) {
        this.f18241OooOo0O = 28;
        this.f18242OooOo0o = new ConcurrentHashMap(ne0Var.zzd);
        this.f18240OooOo = ne0Var;
        this.f18243OooOoO0 = new ke0();
    }

    public de0(String str) {
        this.f18241OooOo0O = 4;
        jb1 jb1Var = new jb1();
        jb1Var.OooO0OO(str);
        this.f18242OooOo0o = new o0OoOo0(jb1Var);
    }

    public de0(ArrayList arrayList) {
        this.f18241OooOo0O = 3;
        this.f18242OooOo0o = Collections.unmodifiableList(new ArrayList(arrayList));
        int size = arrayList.size();
        this.f18240OooOo = new long[size + size];
        for (int i = 0; i < arrayList.size(); i++) {
            oO00OOo0 oo00ooo0 = (oO00OOo0) arrayList.get(i);
            long[] jArr = (long[]) this.f18240OooOo;
            int i2 = i + i;
            jArr[i2] = oo00ooo0.f22504OooO0O0;
            jArr[i2 + 1] = oo00ooo0.f22505OooO0OO;
        }
        long[] jArr2 = (long[]) this.f18240OooOo;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f18243OooOoO0 = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // Oooo00O.OooO0OO
    public void OooOOO(int i) {
    }

    public de0(List list) {
        this.f18241OooOo0O = 5;
        this.f18242OooOo0o = list;
        this.f18240OooOo = new o000O[list.size()];
        this.f18243OooOoO0 = new qi0(new sj0(this, 4));
    }
}
