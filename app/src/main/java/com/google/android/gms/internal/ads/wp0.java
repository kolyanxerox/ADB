package com.google.android.gms.internal.ads;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.browser.customtabs.CustomTabsClient;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.zzby;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzv;
import com.ironsource.C3007ch;
import com.ironsource.C3353m5;
import com.ironsource.C3451ne;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.tika.utils.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class wp0 implements Runnable {

    /* renamed from: OooOo */
    public final Object f25358OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f25359OooOo0O;

    /* renamed from: OooOo0o */
    public final Object f25360OooOo0o;

    public /* synthetic */ wp0(int i, Object obj, Object obj2) {
        this.f25359OooOo0O = i;
        this.f25360OooOo0o = obj;
        this.f25358OooOo = obj2;
    }

    private final void OooO00o() {
        wj0 wj0Var = new wj0((C2129uo) this.f25360OooOo0o, 12);
        e60 e60Var = (e60) this.f25358OooOo;
        synchronized (e60Var) {
            dh0 dh0Var = e60Var.f18505OooO0o;
            if (dh0Var == null || e60Var.f18504OooO0Oo == null) {
                return;
            }
            ((C1658hx) zzv.zzB()).getClass();
            C1658hx.OooOOOo(new c60(0, dh0Var, wj0Var));
            e60Var.f18505OooO0o = null;
            e60Var.f18504OooO0Oo.Oooo0(null);
        }
    }

    private final void OooO0O0() {
        View view;
        C1439bz c1439bz = (C1439bz) this.f25360OooOo0o;
        C2065sy c2065sy = c1439bz.f17621OooO0Oo;
        synchronized (c2065sy) {
            view = c2065sy.f24191OooOOOO;
        }
        if (view != null) {
            boolean z = ((ViewGroup) this.f25358OooOo) != null;
            int iOooO0oO = c2065sy.OooO0oO();
            vd0 vd0Var = c1439bz.f17619OooO0O0;
            zzj zzjVar = c1439bz.f17618OooO00o;
            if (iOooO0oO == 2 || c2065sy.OooO0oO() == 1) {
                zzjVar.zzF(vd0Var.f24955OooO0o, String.valueOf(c2065sy.OooO0oO()), z);
            } else if (c2065sy.OooO0oO() == 6) {
                zzjVar.zzF(vd0Var.f24955OooO0o, CommonGetHeaderBiddingToken.HB_TOKEN_VERSION, z);
                zzjVar.zzF(vd0Var.f24955OooO0o, "1", z);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:298:0x0288  */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.android.gms.internal.ads.nz, com.google.android.gms.internal.ads.w2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void OooO0OO() {
        /*
            Method dump skipped, instructions count: 678
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wp0.OooO0OO():void");
    }

    private final void OooO0Oo() throws JSONException {
        final d30 d30Var = (d30) ((wj0) this.f25360OooOo0o).f25318OooOo0o;
        String str = (String) this.f25358OooOo;
        int i = 5;
        jf0 jf0VarOooO0oO = ze0.OooO0oO(d30Var.f18144OooO0o, 5);
        jf0VarOooO0oO.zzi();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                final String next = itKeys.next();
                final jf0 jf0VarOooO0oO2 = ze0.OooO0oO(d30Var.f18144OooO0o, i);
                jf0VarOooO0oO2.zzi();
                jf0VarOooO0oO2.OooO0o(next);
                final Object obj = new Object();
                final C2274yl c2274yl = new C2274yl();
                o00000oO.OooOOO oooOOOO00Oo0 = ii0.o00Oo0(c2274yl, ((Long) zzbe.zzc().OooO00o(AbstractC1448c7.f17837o000o00O)).longValue(), TimeUnit.SECONDS, d30Var.f18149OooOO0O);
                d30Var.OooOO0o.OooO0O0(next);
                d30Var.f18152OooOOOO.OooO0o0(next);
                ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                oooOOOO00Oo0.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.a30
                    @Override // java.lang.Runnable
                    public final void run() {
                        d30 d30Var2 = d30Var;
                        Object obj2 = obj;
                        C2274yl c2274yl2 = c2274yl;
                        String str2 = next;
                        long j = jElapsedRealtime;
                        jf0 jf0Var = jf0VarOooO0oO2;
                        d30Var2.getClass();
                        synchronized (obj2) {
                            try {
                                if (!c2274yl2.isDone()) {
                                    ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                                    d30Var2.OooO0Oo(str2, (int) (SystemClock.elapsedRealtime() - j), "Timeout.", false);
                                    d30Var2.OooOO0o.OooO00o(str2, "timeout");
                                    d30Var2.f18152OooOOOO.OooO00o(str2, "timeout");
                                    nf0 nf0Var = d30Var2.f18153OooOOOo;
                                    jf0Var.OooO0o0(AndroidInitializeBoldSDK.MSG_TIMEOUT);
                                    jf0Var.OooOO0(false);
                                    nf0Var.OooO0O0(jf0Var.zzm());
                                    c2274yl2.zzc(Boolean.FALSE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }, d30Var.f18139OooO);
                arrayList.add(oooOOOO00Oo0);
                c30 c30Var = new c30(jElapsedRealtime, c2274yl, d30Var, jf0VarOooO0oO2, obj, next);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                ArrayList arrayList2 = new ArrayList();
                if (jSONObjectOptJSONObject != null) {
                    try {
                        JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray("data");
                        int i2 = 0;
                        while (i2 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            String strOptString = jSONObject2.optString("format", "");
                            JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (jSONObjectOptJSONObject2 != null) {
                                Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    bundle.putString(next2, jSONObjectOptJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new C1381ad(bundle, strOptString));
                            i2++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                d30Var.OooO0Oo(next, 0, "", false);
                try {
                    ee0 ee0VarOooO0O0 = d30Var.f18147OooO0oo.OooO0O0(next, new JSONObject());
                    Executor executor = d30Var.f18148OooOO0;
                    try {
                        d30 d30Var2 = d30Var;
                        try {
                            d30Var = d30Var2;
                            executor.execute(new OoooO0O.o00O0O0(d30Var2, next, c30Var, ee0VarOooO0O0, arrayList2, 6));
                        } catch (yd0 e) {
                            e = e;
                            d30Var = d30Var2;
                            c30Var = c30Var;
                            try {
                                String str2 = "Failed to create Adapter.";
                                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0o0OOO)).booleanValue()) {
                                    str2 = "Failed to create Adapter." + StringUtils.SPACE + e.getMessage();
                                }
                                c30Var.zze(str2);
                            } catch (RemoteException e2) {
                                zzo.zzh("", e2);
                            }
                            i = 5;
                        } catch (JSONException e3) {
                            e = e3;
                            d30Var = d30Var2;
                            zze.zzb("Malformed CLD response", e);
                            d30Var.f18152OooOOOO.zza("MalformedJson");
                            m20 m20Var = d30Var.OooOO0o;
                            synchronized (m20Var) {
                                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17845o000oOoo)).booleanValue()) {
                                    HashMap mapOooO0o0 = m20Var.OooO0o0();
                                    mapOooO0o0.put("action", "aaia");
                                    mapOooO0o0.put("aair", "MalformedJson");
                                    m20Var.f21033OooO0O0.add(mapOooO0o0);
                                }
                            }
                            d30Var.f18145OooO0o0.zzd(e);
                            zzv.zzp().OooO0oo("AdapterInitializer.updateAdapterStatus", e);
                            nf0 nf0Var = d30Var.f18153OooOOOo;
                            jf0VarOooO0oO.OooO0Oo(e);
                            jf0VarOooO0oO.OooOO0(false);
                            nf0Var.OooO0O0(jf0VarOooO0oO.zzm());
                            return;
                        }
                    } catch (yd0 e4) {
                        e = e4;
                    }
                } catch (yd0 e5) {
                    e = e5;
                }
                i = 5;
            }
            rm0 rm0VarOooOOOO = rm0.OooOOOO(arrayList);
            CallableC2031s0 callableC2031s0 = new CallableC2031s0(4, d30Var, jf0VarOooO0oO);
            cq0 cq0Var = d30Var.f18139OooO;
            pp0 pp0Var = new pp0(rm0VarOooOOOO, false, false);
            pp0Var.f23398Oooo0OO = new op0(pp0Var, callableC2031s0, cq0Var);
            pp0Var.OooOo0o();
        } catch (JSONException e6) {
            e = e6;
        }
    }

    private final void OooO0o0() throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        q30 q30Var = (q30) this.f25360OooOo0o;
        String str = (String) this.f25358OooOo;
        p30 p30Var = q30Var.f23498OooOo;
        synchronized (p30Var) {
            try {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put(C3451ne.f10417G, "ANDROID");
                    if (!TextUtils.isEmpty(p30Var.f23199OooOO0O)) {
                        jSONObject.put("sdkVersion", "afma-sdk-a-v" + p30Var.f23199OooOO0O);
                    }
                    jSONObject.put("internalSdkVersion", p30Var.f23189OooO);
                    jSONObject.put("osVersion", Build.VERSION.RELEASE);
                    jSONObject.put("adapters", p30Var.f23193OooO0Oo.OooO00o());
                    if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOoo0)).booleanValue()) {
                        String str2 = zzv.zzp().f23634OooO0oO;
                        if (!TextUtils.isEmpty(str2)) {
                            jSONObject.put(C3451ne.f10425K, str2);
                        }
                    }
                    long j = p30Var.f23205OooOOo0;
                    ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                    if (j < System.currentTimeMillis() / 1000) {
                        p30Var.f23202OooOOOO = JsonUtils.EMPTY_JSON;
                    }
                    jSONObject.put("networkExtras", p30Var.f23202OooOOOO);
                    jSONObject.put("adSlots", p30Var.OooO0oO());
                    jSONObject.put("appInfo", p30Var.f23195OooO0o0.OooO00o());
                    String str3 = zzv.zzp().OooO0Oo().zzg().f21508OooO0o0;
                    if (!TextUtils.isEmpty(str3)) {
                        jSONObject.put("cld", new JSONObject(str3));
                    }
                    if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOOo)).booleanValue() && (jSONObject2 = p30Var.f23203OooOOOo) != null) {
                        zzo.zze("Server data: " + jSONObject2.toString());
                        jSONObject.put(C3353m5.f9469s, p30Var.f23203OooOOOo);
                    }
                    if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOOOo)).booleanValue()) {
                        jSONObject.put("openAction", p30Var.f23209OooOo0O);
                        jSONObject.put("gesture", p30Var.f23204OooOOo);
                    }
                    jSONObject.put("isGamRegisteredTestDevice", zzv.zzt().zzl());
                    zzv.zzq();
                    zzbc.zzb();
                    jSONObject.put("isSimulator", zzf.zzr());
                    if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOooO)).booleanValue()) {
                        jSONObject.put("uiStorage", new JSONObject(p30Var.f23207OooOo));
                    }
                    if (!TextUtils.isEmpty((CharSequence) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOo000))) {
                        jSONObject.put("gmaDisk", (JSONObject) p30Var.f23197OooO0oo.f25640OooO0O0);
                    }
                    if (!TextUtils.isEmpty((CharSequence) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOooo))) {
                        jSONObject.put("userDisk", (JSONObject) p30Var.f23196OooO0oO.f25640OooO0O0);
                    }
                } catch (JSONException e) {
                    zzv.zzp().OooO0oO("Inspector.toJson", e);
                    zzo.zzk("Ad inspector encountered an error", e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject.put("redirectUrl", str);
            } catch (JSONException unused) {
            }
        }
        q30Var.f23502OooOoO0.OooO00o("window.inspectorInfo", jSONObject.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Throwable thOooO0O0;
        C2129uo c2129uo;
        MediaPlayer mediaPlayer;
        MediaFormat format;
        Runnable runnable;
        String packageName;
        Application application = null;
        dataOutputStream = null;
        DataOutputStream dataOutputStream = null;
        switch (this.f25359OooOo0O) {
            case 0:
                o00000oO.OooOOO oooOOO = (o00000oO.OooOOO) this.f25360OooOo0o;
                boolean z = oooOOO instanceof oq0;
                vp0 vp0Var = (vp0) this.f25358OooOo;
                if (z && (thOooO0O0 = ((oq0) oooOOO).OooO0O0()) != null) {
                    vp0Var.zza(thOooO0O0);
                    return;
                }
                try {
                    vp0Var.mo13705zzb(ii0.o00Ooo(oooOOO));
                    return;
                } catch (ExecutionException e) {
                    vp0Var.zza(e.getCause());
                    return;
                } catch (Throwable th) {
                    vp0Var.zza(th);
                    return;
                }
            case 1:
                o00O0O o00o0o = (o00O0O) this.f25360OooOo0o;
                o00o0o.getClass();
                int i = i80.f19994OooO00o;
                t00 t00Var = o00o0o.f21768OooO0O0.f24239OooOo0O.f25195Oooo00O;
                t00Var.OooO0OO(25, new s41((C1721jn) this.f25358OooOo));
                t00Var.OooO0O0();
                return;
            case 2:
                o00O0O o00o0o2 = (o00O0O) this.f25360OooOo0o;
                g41 g41Var = (g41) this.f25358OooOo;
                o00o0o2.getClass();
                synchronized (g41Var) {
                }
                int i2 = i80.f19994OooO00o;
                h61 h61Var = o00o0o2.f21768OooO0O0.f24239OooOo0O.f25200Oooo0o0;
                d61 d61VarOooOO0 = h61Var.OooOO0((h91) h61Var.f19577OooO0Oo.f23978OooOoO);
                h61Var.OooO(d61VarOooOO0, 1020, new ni0(d61VarOooOO0, g41Var));
                return;
            case 3:
                try {
                    ((oOO0OO0O) this.f25358OooOo).f22811OooOo0o.put((oOOO00o0) this.f25360OooOo0o);
                    return;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            case 4:
                C1849n3 c1849n3 = (C1849n3) this.f25358OooOo;
                View view = (View) this.f25360OooOo0o;
                try {
                    C1665i3 c1665i3 = new C1665i3(c1849n3.f21398OooOoOO, c1849n3.f21400OooOoo0, c1849n3.f21399OooOoo, c1849n3.f21401OooOooO, c1849n3.f21402OooOooo, c1849n3.f21404Oooo000, c1849n3.f21405Oooo00O, c1849n3.f21407Oooo0O0);
                    C1775l3 c1775l3Zzb = zzv.zzb();
                    synchronized (c1775l3Zzb.f20780OooO00o) {
                        C1701j3 c1701j3 = c1775l3Zzb.f20781OooO0O0;
                        if (c1701j3 != null) {
                            application = c1701j3.f20163OooOo0o;
                        }
                    }
                    if (application != null && !TextUtils.isEmpty(c1849n3.f21406Oooo00o)) {
                        String str = (String) view.getTag(application.getResources().getIdentifier((String) zzbe.zzc().OooO00o(AbstractC1448c7.f17764Oooooo), C3007ch.f7763x, application.getPackageName()));
                        if (str != null && str.equals(c1849n3.f21406Oooo00o)) {
                            return;
                        }
                    }
                    o0O0ooO o0o0oooOooO00o = c1849n3.OooO00o(view, c1665i3);
                    c1665i3.OooO0O0();
                    if (o0o0oooOooO00o.f22022OooO00o == 0 && o0o0oooOooO00o.f22023OooO0O0 == 0) {
                        return;
                    }
                    int i3 = o0o0oooOooO00o.f22023OooO0O0;
                    if (i3 != 0) {
                        if (i3 == 0) {
                        }
                        c1849n3.f21397OooOoO0.OooO0OO(c1665i3);
                        return;
                    } else if (c1665i3.f19911OooOO0O == 0) {
                        return;
                    }
                    oOo0o00 ooo0o00 = c1849n3.f21397OooOoO0;
                    synchronized (ooo0o00.f22919OooOo) {
                        try {
                            if (((LinkedList) ooo0o00.f22922OooOoO0).contains(c1665i3)) {
                                return;
                            }
                            c1849n3.f21397OooOoO0.OooO0OO(c1665i3);
                            return;
                        } finally {
                        }
                    }
                } catch (Exception e2) {
                    zzo.zzh("Exception in fetchContentOnUIThread", e2);
                    zzv.zzp().OooO0oo("ContentFetchTask.fetchContent", e2);
                    return;
                }
            case 5:
                if (((C1776l4) this.f25358OooOo).isCancelled()) {
                    ((o00000oO.OooOOO) this.f25360OooOo0o).cancel(true);
                    return;
                }
                return;
            case 6:
                boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o0o0o)).booleanValue();
                com.google.android.gms.internal.measurement.o0OOO00 o0ooo00 = (com.google.android.gms.internal.measurement.o0OOO00) this.f25360OooOo0o;
                Context context = (Context) this.f25358OooOo;
                if (zBooleanValue) {
                    try {
                        o0ooo00.f26564OooOo0o = (InterfaceC1371a3) zzs.zzb(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new o0O(25));
                        ((C2255y2) ((InterfaceC1371a3) o0ooo00.f26564OooOo0o)).o000O0o0(new Oooo0o.OooO0OO(context));
                        o0ooo00.f26563OooOo0O = true;
                        return;
                    } catch (RemoteException | zzr | NullPointerException unused2) {
                        zzo.zze("Cannot dynamite load clearcut");
                        return;
                    }
                }
                return;
            case 7:
                C2192wd c2192wd = (C2192wd) this.f25358OooOo;
                C2229xd c2229xd = (C2229xd) this.f25360OooOo0o;
                c2229xd.getClass();
                ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                try {
                    zze.zza("loadJavascriptEngine > Before createJavascriptEngine");
                    C1822md c1822md = new C1822md((Context) c2229xd.f25609OooO0o0, (VersionInfoParcel) c2229xd.f25608OooO0o);
                    zze.zza("loadJavascriptEngine > After createJavascriptEngine");
                    zze.zza("loadJavascriptEngine > Before setting new engine loaded listener");
                    c1822md.f21202OooOo0O.zzN().f21532OooOoo = new p80(new OoooOOO.o0oOo0O0(c2229xd, arrayList, jCurrentTimeMillis, c2192wd, c1822md), 7);
                    zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
                    c1822md.OooO0oo("/jsLoaded", new C2044sd(c2229xd, jCurrentTimeMillis, c2192wd, c1822md));
                    zzby zzbyVar = new zzby();
                    C2081td c2081td = new C2081td(c2229xd, c1822md, zzbyVar);
                    zzbyVar.zzb(c2081td);
                    zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
                    c1822md.OooO0oo("/requestReload", c2081td);
                    String str2 = c2229xd.f25605OooO0O0;
                    zze.zza("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(str2)));
                    if (str2.endsWith(".js")) {
                        zze.zza("loadJavascriptEngine > Before newEngine.loadJavascript");
                        zze.zza("loadJavascript on adWebView from path: ".concat(str2));
                        C1822md.Oooo000(new RunnableC1748kd(c1822md, "<!DOCTYPE html><html><head><script src=\"" + str2 + "\"></script></head><body></body></html>", 3));
                        zze.zza("loadJavascriptEngine > After newEngine.loadJavascript");
                    } else if (str2.startsWith("<html>")) {
                        zze.zza("loadJavascriptEngine > Before newEngine.loadHtml");
                        zze.zza("loadHtml on adWebView from html");
                        C1822md.Oooo000(new RunnableC1748kd(c1822md, str2, 2));
                        zze.zza("loadJavascriptEngine > After newEngine.loadHtml");
                    } else {
                        zze.zza("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                        zze.zza("loadHtmlWrapper on adWebView from path: ".concat(str2));
                        C1822md.Oooo000(new RunnableC1748kd(c1822md, str2, 0));
                        zze.zza("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
                    }
                    zze.zza("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
                    com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new RunnableC1933pd(c2229xd, c2192wd, c1822md, arrayList, jCurrentTimeMillis, 1), ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.f17712OooO0OO)).intValue());
                    return;
                } catch (Throwable th2) {
                    zzo.zzh("Error creating webview.", th2);
                    if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O0o0OO)).booleanValue()) {
                        c2192wd.OooOO0("SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine", th2);
                        return;
                    } else if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O0o0o0)).booleanValue()) {
                        zzv.zzp().OooO0oO("SdkJavascriptFactory.loadJavascriptEngine", th2);
                        c2192wd.OooO();
                        return;
                    } else {
                        zzv.zzp().OooO0oo("SdkJavascriptFactory.loadJavascriptEngine", th2);
                        c2192wd.OooO();
                        return;
                    }
                }
            case 8:
                zzv.zzj();
                zzn.zza(((zzbrw) this.f25358OooOo).f26399OooO00o, (AdOverlayInfoParcel) this.f25360OooOo0o, true, null);
                return;
            case 9:
                ((zzu) this.f25360OooOo0o).zza((String) this.f25358OooOo);
                return;
            case 10:
                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = (ParcelFileDescriptor.AutoCloseOutputStream) this.f25360OooOo0o;
                byte[] bArr = (byte[]) this.f25358OooOo;
                try {
                    try {
                        DataOutputStream dataOutputStream2 = new DataOutputStream(autoCloseOutputStream);
                        try {
                            dataOutputStream2.writeInt(bArr.length);
                            dataOutputStream2.write(bArr);
                            Oooo0OO.o00oO0o.OooO0Oo(dataOutputStream2);
                            return;
                        } catch (IOException e3) {
                            e = e3;
                            dataOutputStream = dataOutputStream2;
                            zzo.zzh("Error transporting the ad response", e);
                            zzv.zzp().OooO0oo("LargeParcelTeleporter.pipeData.1", e);
                            if (dataOutputStream == null) {
                                Oooo0OO.o00oO0o.OooO0Oo(autoCloseOutputStream);
                                return;
                            } else {
                                Oooo0OO.o00oO0o.OooO0Oo(dataOutputStream);
                                return;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            dataOutputStream = dataOutputStream2;
                            if (dataOutputStream == null) {
                                Oooo0OO.o00oO0o.OooO0Oo(autoCloseOutputStream);
                            } else {
                                Oooo0OO.o00oO0o.OooO0Oo(dataOutputStream);
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (IOException e4) {
                    e = e4;
                }
            case 11:
                C1718jk c1718jk = (C1718jk) this.f25360OooOo0o;
                Bitmap bitmap = (Bitmap) this.f25358OooOo;
                c1718jk.getClass();
                hz0 hz0Var = jz0.f20406OooOo0o;
                iz0 iz0Var = new iz0();
                bitmap.compress(Bitmap.CompressFormat.PNG, 0, iz0Var);
                synchronized (c1718jk.f20325OooO0oo) {
                    z11 z11Var = c1718jk.f20318OooO00o;
                    s21 s21VarOooOo0o = t21.OooOo0o();
                    jz0 jz0VarOooO00o = iz0Var.OooO00o();
                    s21VarOooOo0o.OooO0Oo();
                    t21.OooOo((t21) s21VarOooOo0o.f25822OooOo0o, jz0VarOooO00o);
                    s21VarOooOo0o.OooO0Oo();
                    t21.OooOoO0((t21) s21VarOooOo0o.f25822OooOo0o);
                    s21VarOooOo0o.OooO0Oo();
                    t21.OooOoO((t21) s21VarOooOo0o.f25822OooOo0o);
                    t21 t21Var = (t21) s21VarOooOo0o.OooO0O0();
                    z11Var.OooO0Oo();
                    a31.Oooo0((a31) z11Var.f25822OooOo0o, t21Var);
                }
                return;
            case 12:
                boolean zBooleanValue2 = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17942oooo00o)).booleanValue();
                TextureViewSurfaceTextureListenerC1647hm textureViewSurfaceTextureListenerC1647hm = (TextureViewSurfaceTextureListenerC1647hm) this.f25358OooOo;
                if (zBooleanValue2 && (c2129uo = textureViewSurfaceTextureListenerC1647hm.f19811OooOo) != null && (mediaPlayer = (MediaPlayer) this.f25360OooOo0o) != null) {
                    try {
                        MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
                        if (trackInfo != null) {
                            HashMap map = new HashMap();
                            while (i < trackInfo.length) {
                                MediaPlayer.TrackInfo trackInfo2 = trackInfo[i];
                                if (trackInfo2 != null) {
                                    int trackType = trackInfo2.getTrackType();
                                    if (trackType == 1) {
                                        MediaFormat format2 = trackInfo2.getFormat();
                                        if (format2 != null) {
                                            if (format2.containsKey("frame-rate")) {
                                                try {
                                                    map.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                                } catch (ClassCastException unused3) {
                                                    map.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                                }
                                            }
                                            if (format2.containsKey("bitrate")) {
                                                Integer numValueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                                textureViewSurfaceTextureListenerC1647hm.f19825Oooo0o = numValueOf;
                                                map.put("bitRate", String.valueOf(numValueOf));
                                            }
                                            if (format2.containsKey("width") && format2.containsKey("height")) {
                                                map.put("resolution", format2.getInteger("width") + "x" + format2.getInteger("height"));
                                            }
                                            if (format2.containsKey("mime")) {
                                                map.put("videoMime", format2.getString("mime"));
                                            }
                                            if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                                map.put("videoCodec", format2.getString("codecs-string"));
                                            }
                                        }
                                    } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                                        if (format.containsKey("mime")) {
                                            map.put("audioMime", format.getString("mime"));
                                        }
                                        if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                            map.put("audioCodec", format.getString("codecs-string"));
                                        }
                                    }
                                }
                                i++;
                            }
                            if (!map.isEmpty()) {
                                c2129uo.OooO0o("onMetadataEvent", map);
                            }
                        }
                    } catch (RuntimeException e5) {
                        zzv.zzp().OooO0oo("AdMediaPlayerView.reportMetadata", e5);
                    }
                }
                C1831mm c1831mm = textureViewSurfaceTextureListenerC1647hm.f19824Oooo0OO;
                if (c1831mm != null) {
                    c1831mm.OooO0oO();
                    return;
                }
                return;
            case 13:
                AtomicInteger atomicInteger = C2313zn.f26210Oooo;
                ((InterfaceC1722jo) this.f25360OooOo0o).OooO0o("onGcacheInfoEvent", (HashMap) this.f25358OooOo);
                return;
            case 14:
                OooO00o();
                return;
            case 15:
                ((ViewTreeObserverOnGlobalLayoutListenerC2166vo) this.f25360OooOo0o).OoooO0O((String) this.f25358OooOo);
                return;
            case 16:
                ((BinderC2240xo) this.f25360OooOo0o).f25656OooOo0O.OooO0o("pubVideoCmd", (HashMap) this.f25358OooOo);
                return;
            case 17:
                C2314zo c2314zo = (C2314zo) this.f25360OooOo0o;
                Uri uri = Uri.parse((String) this.f25358OooOo);
                AbstractC1870no abstractC1870no = ((ViewTreeObserverOnGlobalLayoutListenerC2166vo) c2314zo.f26233OooO0O0.f21381OooOo0o).f25037Oooo0;
                if (abstractC1870no == null) {
                    zzo.zzg("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                    return;
                } else {
                    abstractC1870no.o00o0O(uri);
                    return;
                }
            case 18:
                ((C2058sr) this.f25360OooOo0o).f24143OooOo0O.OooOOO("AFMA_updateActiveView", (JSONObject) this.f25358OooOo);
                return;
            case 19:
                RunnableC1442c1 runnableC1442c1 = (RunnableC1442c1) this.f25358OooOo;
                AtomicReference atomicReference = (AtomicReference) runnableC1442c1.f17645OooOo0o;
                C2022rs c2022rs = (C2022rs) this.f25360OooOo0o;
                c2022rs.getClass();
                try {
                    InterfaceC2152va interfaceC2152va = c2022rs.f23935OooOO0;
                    Oooo0o.OooO0OO oooO0OO = new Oooo0o.OooO0OO(runnableC1442c1);
                    C2078ta c2078ta = (C2078ta) interfaceC2152va;
                    Parcel parcelOooO = c2078ta.OooO();
                    AbstractC2218x2.OooO0o0(parcelOooO, oooO0OO);
                    Parcel parcelOooOOO = c2078ta.OooOOO(parcelOooO, 2);
                    i = parcelOooOOO.readInt() != 0 ? 1 : 0;
                    parcelOooOOO.recycle();
                    if (i != 0 || (runnable = (Runnable) atomicReference.getAndSet(null)) == null) {
                        return;
                    }
                    runnable.run();
                    return;
                } catch (RemoteException unused4) {
                    Runnable runnable2 = (Runnable) atomicReference.getAndSet(null);
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    return;
                }
            case 20:
                try {
                    ((InterfaceC1730jw) this.f25360OooOo0o).mo13701zza(this.f25358OooOo);
                    return;
                } catch (Throwable th5) {
                    zzv.zzp().OooO0oO("EventEmitter.notify", th5);
                    zze.zzb("Event emitter exception.", th5);
                    return;
                }
            case 21:
                OooO0O0();
                return;
            case 22:
                OooO0OO();
                return;
            case 23:
                gb1.OooO0O0(((fb1) this.f25358OooOo).f18912OooO00o, ((b40) this.f25360OooOo0o).OooO0O0());
                return;
            case 24:
                d30 d30Var = (d30) this.f25360OooOo0o;
                d30Var.getClass();
                d30Var.f18139OooO.execute(new b30((C2274yl) this.f25358OooOo, 0));
                return;
            case 25:
                try {
                    ((InterfaceC2265yc) this.f25358OooOo).zzb(((d30) this.f25360OooOo0o).OooO00o());
                    return;
                } catch (RemoteException e6) {
                    zzo.zzh("", e6);
                    return;
                }
            case 26:
                OooO0Oo();
                return;
            case 27:
                OooO0o0();
                return;
            case 28:
                h20 h20Var = ((c40) this.f25360OooOo0o).f17677OooOo0o;
                C1853n7 c1853n7Zzf = zzv.zzf();
                Context context2 = (Context) this.f25358OooOo;
                if (c1853n7Zzf.f21424OooOo0O.getAndSet(true)) {
                    return;
                }
                c1853n7Zzf.f21425OooOo0o = context2;
                c1853n7Zzf.f21423OooOo = h20Var;
                if (c1853n7Zzf.f21426OooOoO != null || (packageName = CustomTabsClient.getPackageName(context2, null)) == null) {
                    return;
                }
                CustomTabsClient.bindCustomTabsService(context2, packageName, c1853n7Zzf);
                return;
            default:
                ah0 ah0Var = ah0.f17039OooOo0O;
                dh0 dh0Var = (dh0) this.f25360OooOo0o;
                Iterator it = dh0Var.f18255OooO0Oo.values().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    View view2 = (View) this.f25358OooOo;
                    if (!zHasNext) {
                        dh0Var.f18256OooO0o0.OooO00o(view2, ah0Var);
                        return;
                    } else {
                        yg0 yg0Var = (yg0) it.next();
                        if (!yg0Var.f25910OooO0o) {
                            yg0Var.f25907OooO0O0.OooO00o(view2, ah0Var);
                        }
                    }
                }
        }
    }

    public String toString() {
        switch (this.f25359OooOo0O) {
            case 0:
                bi0 bi0Var = new bi0(wp0.class.getSimpleName());
                C1548ey c1548ey = new C1548ey(27);
                ((C1548ey) bi0Var.f17510OooOoO0).f18706OooOo = c1548ey;
                bi0Var.f17510OooOoO0 = c1548ey;
                c1548ey.f18708OooOo0o = (vp0) this.f25358OooOo;
                return bi0Var.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ wp0(C1439bz c1439bz, InterfaceViewOnClickListenerC1881nz interfaceViewOnClickListenerC1881nz) {
        this.f25359OooOo0O = 22;
        this.f25360OooOo0o = c1439bz;
        this.f25358OooOo = (AbstractBinderC2181w2) interfaceViewOnClickListenerC1881nz;
    }

    public /* synthetic */ wp0(Object obj, boolean z, Object obj2, int i) {
        this.f25359OooOo0O = i;
        this.f25360OooOo0o = obj2;
        this.f25358OooOo = obj;
    }
}
