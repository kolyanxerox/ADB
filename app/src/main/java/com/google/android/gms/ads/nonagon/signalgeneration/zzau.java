package com.google.android.gms.ads.nonagon.signalgeneration;

import Oooo0o.OooO0O0;
import Oooo0o.OooO0OO;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.datastore.preferences.protobuf.OooO00o;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.internal.ads.AbstractBinderC1462cl;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.AbstractC1449c8;
import com.google.android.gms.internal.ads.AbstractC1817m8;
import com.google.android.gms.internal.ads.AbstractC2200wl;
import com.google.android.gms.internal.ads.C1532ei;
import com.google.android.gms.internal.ads.C1646hl;
import com.google.android.gms.internal.ads.C1663i1;
import com.google.android.gms.internal.ads.C1699j1;
import com.google.android.gms.internal.ads.C1964q7;
import com.google.android.gms.internal.ads.C2001r7;
import com.google.android.gms.internal.ads.C2130up;
import com.google.android.gms.internal.ads.C2148v6;
import com.google.android.gms.internal.ads.C2163vl;
import com.google.android.gms.internal.ads.InterfaceC1552f1;
import com.google.android.gms.internal.ads.InterfaceC2270yh;
import com.google.android.gms.internal.ads.dp0;
import com.google.android.gms.internal.ads.fe0;
import com.google.android.gms.internal.ads.hg0;
import com.google.android.gms.internal.ads.ii0;
import com.google.android.gms.internal.ads.k20;
import com.google.android.gms.internal.ads.kp0;
import com.google.android.gms.internal.ads.lp0;
import com.google.android.gms.internal.ads.mf0;
import com.google.android.gms.internal.ads.mp0;
import com.google.android.gms.internal.ads.nf0;
import com.google.android.gms.internal.ads.rm0;
import com.google.android.gms.internal.ads.tp0;
import com.google.android.gms.internal.ads.wk0;
import com.google.android.gms.internal.ads.wp0;
import com.google.android.gms.internal.ads.xd0;
import com.google.android.gms.internal.ads.xh0;
import com.google.android.gms.internal.ads.yp0;
import com.google.android.gms.internal.ads.z00;
import com.ironsource.C3034d9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o00000oO.OooOOO;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzau extends AbstractBinderC1462cl {

    /* renamed from: Ooooo00 */
    public static final ArrayList f16497Ooooo00 = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));

    /* renamed from: Ooooo0o */
    public static final ArrayList f16498Ooooo0o = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));

    /* renamed from: OooooO0 */
    public static final ArrayList f16499OooooO0 = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));

    /* renamed from: OooooOO */
    public static final ArrayList f16500OooooOO = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;

    /* renamed from: OooOo */
    public final C1663i1 f16501OooOo;

    /* renamed from: OooOo0O */
    public final C2130up f16502OooOo0O;

    /* renamed from: OooOo0o */
    public Context f16503OooOo0o;

    /* renamed from: OooOoO */
    public final fe0 f16504OooOoO;

    /* renamed from: OooOoO0 */
    public final xd0 f16505OooOoO0;

    /* renamed from: OooOoOO */
    public final C2163vl f16506OooOoOO;

    /* renamed from: OooOoo */
    public C1532ei f16507OooOoo;

    /* renamed from: OooOoo0 */
    public final ScheduledExecutorService f16508OooOoo0;

    /* renamed from: OooOooO */
    public Point f16509OooOooO;

    /* renamed from: OooOooo */
    public Point f16510OooOooo;

    /* renamed from: Oooo */
    public String f16511Oooo;

    /* renamed from: Oooo0 */
    public final boolean f16512Oooo0;

    /* renamed from: Oooo000 */
    public final k20 f16513Oooo000;

    /* renamed from: Oooo00O */
    public final hg0 f16514Oooo00O;

    /* renamed from: Oooo00o */
    public final boolean f16515Oooo00o;

    /* renamed from: Oooo0O0 */
    public final boolean f16516Oooo0O0;

    /* renamed from: Oooo0OO */
    public final boolean f16517Oooo0OO;

    /* renamed from: Oooo0o */
    public final String f16518Oooo0o;

    /* renamed from: Oooo0o0 */
    public final String f16519Oooo0o0;

    /* renamed from: Oooo0oO */
    public final AtomicInteger f16520Oooo0oO;

    /* renamed from: Oooo0oo */
    public final VersionInfoParcel f16521Oooo0oo;

    /* renamed from: OoooO */
    public final ArrayList f16522OoooO;

    /* renamed from: OoooO0 */
    public final ArrayList f16523OoooO0;

    /* renamed from: OoooO00 */
    public final String f16524OoooO00;

    /* renamed from: OoooO0O */
    public final ArrayList f16525OoooO0O;

    /* renamed from: OoooOO0 */
    public final ArrayList f16526OoooOO0;

    /* renamed from: OoooOOO */
    public final AtomicBoolean f16527OoooOOO;

    /* renamed from: OoooOOo */
    public final AtomicInteger f16528OoooOOo;

    /* renamed from: OoooOo0 */
    public final C2001r7 f16529OoooOo0;

    /* renamed from: OoooOoO */
    public final zzo f16530OoooOoO;

    /* renamed from: OoooOoo */
    public final zzf f16531OoooOoo;
    public final AtomicBoolean o000oOoO;

    public zzau(C2130up c2130up, Context context, C1663i1 c1663i1, fe0 fe0Var, C2163vl c2163vl, ScheduledExecutorService scheduledExecutorService, k20 k20Var, hg0 hg0Var, VersionInfoParcel versionInfoParcel, C2001r7 c2001r7, xd0 xd0Var, zzo zzoVar, zzf zzfVar) {
        ArrayList arrayListO000OOO;
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        this.f16509OooOooO = new Point();
        this.f16510OooOooo = new Point();
        this.f16520Oooo0oO = new AtomicInteger(0);
        this.o000oOoO = new AtomicBoolean(false);
        this.f16527OoooOOO = new AtomicBoolean(false);
        this.f16528OoooOOo = new AtomicInteger(0);
        this.f16502OooOo0O = c2130up;
        this.f16503OooOo0o = context;
        this.f16501OooOo = c1663i1;
        this.f16505OooOoO0 = xd0Var;
        this.f16504OooOoO = fe0Var;
        this.f16506OooOoOO = c2163vl;
        this.f16508OooOoo0 = scheduledExecutorService;
        this.f16513Oooo000 = k20Var;
        this.f16514Oooo00O = hg0Var;
        this.f16521Oooo0oo = versionInfoParcel;
        this.f16529OoooOo0 = c2001r7;
        this.f16515Oooo00o = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0O0OO0O)).booleanValue();
        this.f16512Oooo0 = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0O0OO0)).booleanValue();
        this.f16516Oooo0O0 = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0O0OOO0)).booleanValue();
        this.f16517Oooo0OO = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0O0OOOo)).booleanValue();
        this.f16519Oooo0o0 = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0O0OOO);
        this.f16518Oooo0o = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0O0OOo);
        this.f16524OoooO00 = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0O0OOoO);
        this.f16530OoooOoO = zzoVar;
        this.f16531OoooOoo = zzfVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0O0OOoo)).booleanValue()) {
            this.f16523OoooO0 = o000OOO((String) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0OooO0));
            this.f16525OoooO0O = o000OOO((String) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0O0Oo0));
            this.f16522OoooO = o000OOO((String) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0O0Oo0O));
            arrayListO000OOO = o000OOO((String) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0O0Oo0o));
        } else {
            this.f16523OoooO0 = f16497Ooooo00;
            this.f16525OoooO0O = f16498Ooooo0o;
            this.f16522OoooO = f16499OooooO0;
            arrayListO000OOO = f16500OooooOO;
        }
        this.f16526OoooOO0 = arrayListO000OOO;
    }

    public static final Uri o000OO0o(Uri uri, String str, String str2) {
        String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl=");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl=");
        }
        if (iIndexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = iIndexOf + 1;
        StringBuilder sb = new StringBuilder(string.substring(0, i));
        OooO00o.OooOooO(sb, str, C3034d9.i.f8173b, str2, C3034d9.i.f8175c);
        sb.append(string.substring(i));
        return Uri.parse(sb.toString());
    }

    public static final ArrayList o000OOO(String str) {
        String[] strArrSplit = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!xh0.OooOo(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static /* bridge */ /* synthetic */ mf0 o000OOo0(OooOOO oooOOO, C1646hl c1646hl) {
        if (!nf0.OooO00o() || !((Boolean) AbstractC1449c8.f17952OooO0o0.OooOOO()).booleanValue()) {
            return null;
        }
        try {
            mf0 mf0VarZza = ((zzac) ii0.o00Ooo(oooOOO)).zza();
            mf0VarZza.OooO0Oo(new ArrayList(Collections.singletonList(c1646hl.zzb)));
            com.google.android.gms.ads.internal.client.zzm zzmVar = c1646hl.zzd;
            mf0VarZza.OooO0O0(zzmVar == null ? "" : zzmVar.zzp);
            mf0VarZza.OooO0o(c1646hl.zzd.zzm);
            return mf0VarZza;
        } catch (ExecutionException e) {
            com.google.android.gms.ads.internal.zzv.zzp().OooO0oo("SignalGeneratorImpl.getConfiguredCriticalUserJourney", e);
            return null;
        }
    }

    public static boolean o0OoO0o(Uri uri, ArrayList arrayList, ArrayList arrayList2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (path.contains((String) obj)) {
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayList2.get(i2);
                        i2++;
                        if (host.endsWith((String) obj2)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void o000O(List list, final OooO0O0 oooO0O0, InterfaceC2270yh interfaceC2270yh, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        OooOOO oooOOOOoOO;
        Map map;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0O0o00O)).booleanValue()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("The updating URL feature is not enabled.");
            try {
                interfaceC2270yh.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
                return;
            }
        }
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = this.f16525OoooO0O;
            arrayList2 = this.f16523OoooO0;
            if (!zHasNext) {
                break;
            } else if (o0OoO0o((Uri) it.next(), arrayList2, arrayList)) {
                i++;
            }
        }
        if (i > 1) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Multiple google urls found: ".concat(String.valueOf(list)));
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (o0OoO0o(uri, arrayList2, arrayList)) {
                Callable callable = new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzah
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws Exception {
                        xd0 xd0Var;
                        zzau zzauVar = this.zza;
                        Uri uriOooO00o = uri;
                        OooO0O0 oooO0O02 = oooO0O0;
                        zzauVar.getClass();
                        try {
                            uriOooO00o = (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0o000oO)).booleanValue() || (xd0Var = zzauVar.f16505OooOoO0) == null) ? zzauVar.f16501OooOo.OooO00o(uriOooO00o, zzauVar.f16503OooOo0o, (View) OooO0OO.o000O0oO(oooO0O02), null) : xd0Var.OooO00o(uriOooO00o, zzauVar.f16503OooOo0o, (View) OooO0OO.o000O0oO(oooO0O02), null);
                        } catch (C1699j1 e2) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzk("", e2);
                        }
                        if (uriOooO00o.getQueryParameter("ms") != null) {
                            return uriOooO00o;
                        }
                        throw new Exception("Failed to append spam signals to click url.");
                    }
                };
                C2163vl c2163vl = this.f16506OooOoOO;
                OooOOO oooOOOOooO0O0 = c2163vl.OooO0O0(callable);
                C1532ei c1532ei = this.f16507OooOoo;
                if (c1532ei == null || (map = c1532ei.zzb) == null || map.isEmpty()) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Asset view map is empty.");
                    oooOOOOoOO = oooOOOOooO0O0;
                } else {
                    oooOOOOoOO = ii0.ooOO(oooOOOOooO0O0, new lp0() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzai
                        @Override // com.google.android.gms.internal.ads.lp0
                        public final OooOOO zza(Object obj) {
                            zzau zzauVar = this.zza;
                            return ii0.Ooooooo(zzauVar.o000O0o0("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new wk0(zzauVar, (Uri) obj) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaj
                                public final /* synthetic */ Uri zza;

                                {
                                    this.zza = uri;
                                }

                                @Override // com.google.android.gms.internal.ads.wk0
                                public final Object apply(Object obj2) {
                                    Uri uri2 = this.zza;
                                    String str = (String) obj2;
                                    ArrayList arrayList4 = zzau.f16497Ooooo00;
                                    return !TextUtils.isEmpty(str) ? zzau.o000OO0o(uri2, "nas", str) : uri2;
                                }
                            }, zzauVar.f16506OooOoOO);
                        }
                    }, c2163vl);
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                oooOOOOoOO = ii0.OooooOO(uri);
            }
            arrayList3.add(oooOOOOoOO);
        }
        mp0 mp0Var = new mp0(rm0.OooOOOO(arrayList3), true);
        mp0Var.addListener(new wp0(0, mp0Var, new zzas(this, interfaceC2270yh, z)), this.f16502OooOo0O.OooO00o());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.C1614gq o000O0O0(android.content.Context r11, java.lang.String r12, java.lang.String r13, com.google.android.gms.ads.internal.client.zzs r14, com.google.android.gms.ads.internal.client.zzm r15, int r16, java.lang.String r17, android.os.Bundle r18, com.google.android.gms.internal.ads.C1646hl r19) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzau.o000O0O0(android.content.Context, java.lang.String, java.lang.String, com.google.android.gms.ads.internal.client.zzs, com.google.android.gms.ads.internal.client.zzm, int, java.lang.String, android.os.Bundle, com.google.android.gms.internal.ads.hl):com.google.android.gms.internal.ads.gq");
    }

    public final tp0 o000O0o0(final String str) {
        final z00[] z00VarArr = new z00[1];
        OooOOO oooOOOOooO00o = this.f16504OooOoO.OooO00o();
        lp0 lp0Var = new lp0() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaf
            @Override // com.google.android.gms.internal.ads.lp0
            public final OooOOO zza(Object obj) throws JSONException {
                zzau zzauVar = this.zza;
                z00[] z00VarArr2 = z00VarArr;
                String str2 = str;
                z00 z00Var = (z00) obj;
                zzauVar.getClass();
                z00VarArr2[0] = z00Var;
                Context context = zzauVar.f16503OooOo0o;
                C1532ei c1532ei = zzauVar.f16507OooOoo;
                Map map = c1532ei.zzb;
                JSONObject jSONObjectZzd = zzbv.zzd(context, map, map, c1532ei.zza, null);
                JSONObject jSONObjectZzg = zzbv.zzg(zzauVar.f16503OooOo0o, zzauVar.f16507OooOoo.zza);
                JSONObject jSONObjectZzf = zzbv.zzf(zzauVar.f16507OooOoo.zza);
                JSONObject jSONObjectZze = zzbv.zze(zzauVar.f16503OooOo0o, zzauVar.f16507OooOoo.zza);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("asset_view_signal", jSONObjectZzd);
                jSONObject.put("ad_view_signal", jSONObjectZzg);
                jSONObject.put("scroll_view_signal", jSONObjectZzf);
                jSONObject.put("lock_screen_signal", jSONObjectZze);
                if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str2)) {
                    jSONObject.put("click_signal", zzbv.zzc(null, zzauVar.f16503OooOo0o, zzauVar.f16510OooOooo, zzauVar.f16509OooOooO));
                }
                return z00Var.OooO00o(str2, jSONObject);
            }
        };
        C2163vl c2163vl = this.f16506OooOoOO;
        dp0 dp0VarOoOO = ii0.ooOO(oooOOOOooO00o, lp0Var, c2163vl);
        dp0VarOoOO.addListener(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzag
            @Override // java.lang.Runnable
            public final void run() {
                zzau zzauVar = this.zza;
                z00[] z00VarArr2 = z00VarArr;
                zzauVar.getClass();
                z00 z00Var = z00VarArr2[0];
                if (z00Var != null) {
                    yp0 yp0VarOooooOO = ii0.OooooOO(z00Var);
                    fe0 fe0Var = zzauVar.f16504OooOoO;
                    synchronized (fe0Var) {
                        fe0Var.f18935OooO00o.addFirst(yp0VarOooooOO);
                    }
                }
            }
        }, c2163vl);
        return ii0.OoooOOO(ii0.Ooooooo((tp0) ii0.o00Oo0(tp0.OooOOo(dp0VarOoOO), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0O0o00o)).intValue(), TimeUnit.MILLISECONDS, this.f16508OooOoo0), new wk0() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzam
            @Override // com.google.android.gms.internal.ads.wk0
            public final Object apply(Object obj) {
                ArrayList arrayList = zzau.f16497Ooooo00;
                return ((JSONObject) obj).optString("nas");
            }
        }, c2163vl), Exception.class, new wk0() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzan
            @Override // com.google.android.gms.internal.ads.wk0
            public final Object apply(Object obj) {
                ArrayList arrayList = zzau.f16497Ooooo00;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", (Exception) obj);
                return null;
            }
        }, c2163vl);
    }

    public final void o000O0oO() {
        zzau zzauVar;
        OooOOO oooOOOZzb;
        if (((Boolean) AbstractC1817m8.f21131OooO0OO.OooOOO()).booleanValue()) {
            this.f16530OoooOoO.zzb();
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0OoOOOo)).booleanValue()) {
            oooOOOZzb = ii0.Oooooo(new kp0() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzad
                @Override // com.google.android.gms.internal.ads.kp0
                /* renamed from: zza */
                public final OooOOO mo13700zza() {
                    zzau zzauVar2 = this.zza;
                    return zzauVar2.o000O0O0(zzauVar2.f16503OooOo0o, null, AdFormat.BANNER.name(), null, null, 0, null, new Bundle(), null).zzb();
                }
            }, AbstractC2200wl.f25321OooO00o);
            zzauVar = this;
        } else {
            zzauVar = this;
            oooOOOZzb = zzauVar.o000O0O0(this.f16503OooOo0o, null, AdFormat.BANNER.name(), null, null, 0, null, new Bundle(), null).zzb();
        }
        zzat zzatVar = new zzat(this);
        oooOOOZzb.addListener(new wp0(0, oooOOOZzb, zzatVar), zzauVar.f16502OooOo0O.OooO00o());
    }

    public final void o000O0oo() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0OOo00o)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0OOo0O)).booleanValue()) {
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0OOo0o)).booleanValue() && this.o000oOoO.getAndSet(true)) {
                return;
            }
            o000O0oO();
        }
    }

    public final void o000OO00(final List list, final OooO0O0 oooO0O0, InterfaceC2270yh interfaceC2270yh, boolean z) {
        Map map;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0O0o00O)).booleanValue()) {
            try {
                interfaceC2270yh.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
                return;
            }
        }
        Callable callable = new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzao
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                zzau zzauVar = this.zza;
                List<Uri> list2 = list;
                OooO0O0 oooO0O02 = oooO0O0;
                InterfaceC1552f1 interfaceC1552f1 = zzauVar.f16501OooOo.f19893OooO0O0;
                String strZzh = interfaceC1552f1 != null ? interfaceC1552f1.zzh(zzauVar.f16503OooOo0o, (View) OooO0OO.o000O0oO(oooO0O02), null) : "";
                if (TextUtils.isEmpty(strZzh)) {
                    throw new Exception("Failed to get view signals.");
                }
                ArrayList arrayList = new ArrayList();
                for (Uri uri : list2) {
                    if (zzau.o0OoO0o(uri, zzauVar.f16522OoooO, zzauVar.f16526OoooOO0)) {
                        arrayList.add(zzau.o000OO0o(uri, "ms", strZzh));
                    } else {
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                        arrayList.add(uri);
                    }
                }
                if (arrayList.isEmpty()) {
                    throw new Exception("Empty impression URLs result.");
                }
                return arrayList;
            }
        };
        C2163vl c2163vl = this.f16506OooOoOO;
        OooOOO oooOOOOooO0O0 = c2163vl.OooO0O0(callable);
        C1532ei c1532ei = this.f16507OooOoo;
        if (c1532ei == null || (map = c1532ei.zzb) == null || map.isEmpty()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Asset view map is empty.");
        } else {
            oooOOOOooO0O0 = ii0.ooOO(oooOOOOooO0O0, new lp0() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzap
                @Override // com.google.android.gms.internal.ads.lp0
                public final OooOOO zza(Object obj) {
                    final zzau zzauVar = this.zza;
                    final ArrayList arrayList = (ArrayList) obj;
                    return ii0.Ooooooo(zzauVar.o000O0o0("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new wk0() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzae
                        @Override // com.google.android.gms.internal.ads.wk0
                        public final Object apply(Object obj2) {
                            zzau zzauVar2 = zzauVar;
                            List<Uri> list2 = arrayList;
                            String str = (String) obj2;
                            zzauVar2.getClass();
                            ArrayList arrayList2 = new ArrayList();
                            for (Uri uri : list2) {
                                if (!zzau.o0OoO0o(uri, zzauVar2.f16522OoooO, zzauVar2.f16526OoooOO0) || TextUtils.isEmpty(str)) {
                                    arrayList2.add(uri);
                                } else {
                                    arrayList2.add(zzau.o000OO0o(uri, "nas", str));
                                }
                            }
                            return arrayList2;
                        }
                    }, zzauVar.f16506OooOoOO);
                }
            }, c2163vl);
        }
        oooOOOOooO0O0.addListener(new wp0(0, oooOOOOooO0O0, new zzar(this, interfaceC2270yh, z)), this.f16502OooOo0O.OooO00o());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1499dl
    public final OooO0O0 zze(OooO0O0 oooO0O0, OooO0O0 oooO0O02, String str, OooO0O0 oooO0O03) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0OOoO0o)).booleanValue()) {
            return new OooO0OO(null);
        }
        Context context = (Context) OooO0OO.o000O0oO(oooO0O0);
        CustomTabsClient customTabsClient = (CustomTabsClient) OooO0OO.o000O0oO(oooO0O02);
        CustomTabsCallback customTabsCallback = (CustomTabsCallback) OooO0OO.o000O0oO(oooO0O03);
        C2001r7 c2001r7 = this.f16529OoooOo0;
        c2001r7.getClass();
        if (context == null) {
            throw new IllegalArgumentException("App Context parameter is null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Origin parameter is empty or null");
        }
        if (customTabsClient == null) {
            throw new IllegalArgumentException("CustomTabsClient parameter is null");
        }
        c2001r7.OooOO0o = context;
        c2001r7.f23792OooO0oo = str;
        k20 k20Var = c2001r7.f23788OooO0Oo;
        C1964q7 c1964q7 = new C1964q7(c2001r7, customTabsCallback, k20Var);
        c2001r7.f23789OooO0o = c1964q7;
        CustomTabsSession customTabsSessionNewSession = customTabsClient.newSession(c1964q7);
        c2001r7.f23791OooO0oO = customTabsSessionNewSession;
        if (customTabsSessionNewSession == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("CustomTabsClient failed to create new session.");
        }
        zzaa.zzd(k20Var, null, "pact_action", new Pair("pe", "pact_init"));
        if (((Boolean) AbstractC1817m8.f21131OooO0OO.OooOOO()).booleanValue()) {
            this.f16530OoooOoO.zzb();
        }
        if (((Boolean) AbstractC1817m8.f21129OooO00o.OooOOO()).booleanValue()) {
            this.f16531OoooOoo.zzb();
        }
        return new OooO0OO(c2001r7.f23791OooO0oO);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00cd  */
    @Override // com.google.android.gms.internal.ads.InterfaceC1499dl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(Oooo0o.OooO0O0 r11, final com.google.android.gms.internal.ads.C1646hl r12, @androidx.annotation.Nullable com.google.android.gms.internal.ads.InterfaceC1389al r13) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzau.zzf(Oooo0o.OooO0O0, com.google.android.gms.internal.ads.hl, com.google.android.gms.internal.ads.al):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1499dl
    public final void zzg(C1532ei c1532ei) {
        this.f16507OooOoo = c1532ei;
        this.f16504OooOoO.OooO0O0(1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1499dl
    public final void zzh(List list, OooO0O0 oooO0O0, InterfaceC2270yh interfaceC2270yh) {
        o000O(list, oooO0O0, interfaceC2270yh, true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1499dl
    public final void zzi(List list, OooO0O0 oooO0O0, InterfaceC2270yh interfaceC2270yh) {
        o000OO00(list, oooO0O0, interfaceC2270yh, true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1499dl
    @SuppressLint({"AddJavascriptInterface"})
    public final void zzj(OooO0O0 oooO0O0) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0OOo00O)).booleanValue()) {
            C2148v6 c2148v6 = AbstractC1448c7.o0O0OoO0;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(c2148v6)).booleanValue()) {
                o000O0oo();
            }
            WebView webView = (WebView) OooO0OO.o000O0oO(oooO0O0);
            if (webView == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("The webView cannot be null.");
                return;
            }
            C2163vl c2163vl = AbstractC2200wl.f25325OooO0o;
            zzf zzfVar = this.f16531OoooOoo;
            final zzj zzjVar = new zzj(webView, zzfVar, c2163vl);
            webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView, this.f16501OooOo, this.f16513Oooo000, this.f16514Oooo00O, this.f16505OooOoO0, this.f16530OoooOoO, this.f16531OoooOoo, zzjVar), "gmaSdk");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0OOo0oo)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzp().f23637OooOO0O.incrementAndGet();
            }
            if (((Boolean) AbstractC1817m8.f21129OooO00o.OooOOO()).booleanValue()) {
                zzfVar.zzb();
                if (((Boolean) AbstractC1817m8.f21130OooO0O0.OooOOO()).booleanValue()) {
                    AbstractC2200wl.f25324OooO0Oo.scheduleWithFixedDelay(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzjVar.zzb();
                        }
                    }, 0L, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0OOoO00)).intValue(), TimeUnit.MILLISECONDS);
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(c2148v6)).booleanValue()) {
                o000O0oo();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1499dl
    public final void zzk(OooO0O0 oooO0O0) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0O0o00O)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) OooO0OO.o000O0oO(oooO0O0);
            C1532ei c1532ei = this.f16507OooOoo;
            this.f16509OooOooO = zzbv.zza(motionEvent, c1532ei == null ? null : c1532ei.zza);
            if (motionEvent.getAction() == 0) {
                this.f16510OooOooo = this.f16509OooOooO;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            Point point = this.f16509OooOooO;
            motionEventObtain.setLocation(point.x, point.y);
            this.f16501OooOo.f19893OooO0O0.zzk(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1499dl
    public final void zzl(List list, OooO0O0 oooO0O0, InterfaceC2270yh interfaceC2270yh) {
        o000O(list, oooO0O0, interfaceC2270yh, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1499dl
    public final void zzm(List list, OooO0O0 oooO0O0, InterfaceC2270yh interfaceC2270yh) {
        o000OO00(list, oooO0O0, interfaceC2270yh, false);
    }
}
