package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.ads.p008h5.OnH5AdsEventListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class p80 implements O0000000, OnH5AdsEventListener, InterfaceC1502dp, InterfaceC1427bm, MediationBannerAdCallback, MediationInterstitialAdCallback, MediationRewardedAdCallback, MediationNativeAdCallback, MediationAppOpenAdCallback, vp0, InterfaceC1730jw, InterfaceC1466cp, InterfaceC1377a9, InterfaceC1961q4, x40, bf0, InterfaceC2064sx, kp0, h90 {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f23241OooOo0O;

    /* renamed from: OooOo0o */
    public Object f23242OooOo0o;

    public /* synthetic */ p80(Object obj, int i) {
        this.f23241OooOo0O = i;
        this.f23242OooOo0o = obj;
    }

    public JSONObject OooO0O0(View view) {
        if (view == null) {
            return wh0.OooO00o(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        int[] iArr = (int[]) this.f23242OooOo0o;
        view.getLocationOnScreen(iArr);
        return wh0.OooO00o(iArr[0], iArr[1], width, height);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1961q4
    public void OooO0Oo(C1889o6 c1889o6) {
        C2072t4 c2072t4 = (C2072t4) ((C1926p6) c1889o6.f25822OooOo0o).OooOooo().OooOO0o();
        C1594g6 c1594g6 = (C1594g6) ((C1926p6) c1889o6.f25822OooOo0o).OooOooo().OooOoO0().OooOO0o();
        String str = ((md0) ((rd0) this.f23242OooOo0o).f23849OooO0O0.f24096OooOo).f21205OooO0O0;
        c1594g6.OooO0Oo();
        C1631h6.OooOo0o((C1631h6) c1594g6.f25822OooOo0o, str);
        c2072t4.OooO0Oo();
        C2109u4.OooOo((C2109u4) c2072t4.f25822OooOo0o, (C1631h6) c1594g6.OooO0O0());
        c1889o6.OooO0Oo();
        C1926p6.OooOoO0((C1926p6) c1889o6.f25822OooOo0o, (C2109u4) c2072t4.OooO0O0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2064sx
    public void OooO0o(boolean z, Context context, C2246xu c2246xu) throws C2027rx, yd0 {
        Object obj = ((l60) this.f23242OooOo0o).f20809OooO0O0;
        try {
            ((ee0) obj).OooO0O0(z);
            try {
                ((ee0) obj).f18580OooO00o.Oooo(new Oooo0o.OooO0OO(context));
            } catch (Throwable th) {
                throw new yd0(th);
            }
        } catch (yd0 e) {
            throw new C2027rx(e.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.h90
    public void OooO0o0(AbstractC1397at abstractC1397at) {
        f10 f10Var = (f10) abstractC1397at;
        synchronized (((id0) this.f23242OooOo0o)) {
            try {
                ((id0) this.f23242OooOo0o).f20026OooOoO0 = f10Var;
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17903o00OOOOo)).booleanValue()) {
                    f10Var.f18754OooOOoo.f24300OooO00o = ((id0) this.f23242OooOo0o).f20022OooOo;
                }
                ((id0) this.f23242OooOo0o).f20026OooOoO0.OooO00o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6 */
    public List OooO0oO(oOo0o00 ooo0o00) {
        String str;
        int i;
        List listSingletonList;
        r40 r40Var = new r40((byte[]) ooo0o00.f22922OooOoO0);
        ArrayList arrayList = (gn0) this.f23242OooOo0o;
        while (r40Var.OooOOOO() > 0) {
            int iOooOo0O = r40Var.OooOo0O();
            int iOooOo0O2 = r40Var.f23746OooO0O0 + r40Var.OooOo0O();
            if (iOooOo0O == 134) {
                arrayList = new ArrayList();
                int iOooOo0O3 = r40Var.OooOo0O() & 31;
                for (int i2 = 0; i2 < iOooOo0O3; i2++) {
                    String strOooO0O0 = r40Var.OooO0O0(3, StandardCharsets.UTF_8);
                    int iOooOo0O4 = r40Var.OooOo0O();
                    boolean z = (iOooOo0O4 & 128) != 0;
                    if (z) {
                        i = iOooOo0O4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bOooOo0O = (byte) r40Var.OooOo0O();
                    r40Var.OooOO0O(1);
                    if (z) {
                        int i3 = bOooOo0O & 64;
                        byte[] bArr = AbstractC1914ov.f23130OooO00o;
                        listSingletonList = Collections.singletonList(i3 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    jb1 jb1Var = new jb1();
                    jb1Var.OooO0OO(str);
                    jb1Var.f20244OooO0Oo = strOooO0O0;
                    jb1Var.f20269Oooo000 = i;
                    jb1Var.f20253OooOOOO = listSingletonList;
                    arrayList.add(new o0OoOo0(jb1Var));
                }
            }
            r40Var.OooOO0(iOooOo0O2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.x40
    public o00000oO.OooOOO Oooo000(C2197wi c2197wi) {
        q40 q40Var = (q40) this.f23242OooOo0o;
        synchronized (q40Var.f22330OooOo0o) {
            try {
                int i = q40Var.f23507OooOoo;
                if (i != 1 && i != 2) {
                    return ii0.Ooooo00(new v40(2));
                }
                if (q40Var.f22328OooOo) {
                    return q40Var.f22329OooOo0O;
                }
                q40Var.f23507OooOoo = 2;
                q40Var.f22328OooOo = true;
                q40Var.f22331OooOoO = c2197wi;
                q40Var.f22333OooOoOO.checkAvailabilityAndConnect();
                q40Var.f22329OooOo0O.addListener(new p40(q40Var, 0), AbstractC2200wl.f25327OooO0oO);
                return q40Var.f22329OooOo0O;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public void onAdClosed() {
        try {
            ((InterfaceC1383af) this.f23242OooOo0o).zzf();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationRewardedAdCallback, com.google.android.gms.ads.mediation.MediationAppOpenAdCallback
    public void onAdFailedToShow(AdError adError) {
        try {
            zzo.zzj("Mediated ad failed to show: Error Code = " + adError.getCode() + ". Error Message = " + adError.getMessage() + " Error Domain = " + adError.getDomain());
            ((InterfaceC1383af) this.f23242OooOo0o).OoooOOo(adError.zza());
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdCallback, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public void onAdLeftApplication() {
        try {
            ((InterfaceC1383af) this.f23242OooOo0o).zzn();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public void onAdOpened() {
        try {
            ((InterfaceC1383af) this.f23242OooOo0o).zzp();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.p008h5.OnH5AdsEventListener
    public void onH5AdsEvent(String str) {
        int i = C1821mc.f21195OooO0Oo;
        ((WebView) this.f23242OooOo0o).evaluateJavascript(str, null);
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public void onUserEarnedReward(RewardItem rewardItem) {
        try {
            ((InterfaceC1383af) this.f23242OooOo0o).o0000oo(new BinderC1608gk(rewardItem));
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback, com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public void onVideoComplete() {
        try {
            ((InterfaceC1383af) this.f23242OooOo0o).zzv();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public void onVideoPause() {
        try {
            ((InterfaceC1383af) this.f23242OooOo0o).OooO0O0();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public void onVideoPlay() {
        try {
            ((InterfaceC1383af) this.f23242OooOo0o).zzx();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public void onVideoStart() {
        try {
            ((InterfaceC1383af) this.f23242OooOo0o).OooOoO0();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public void reportAdClicked() {
        try {
            ((InterfaceC1383af) this.f23242OooOo0o).zze();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public void reportAdImpression() {
        try {
            ((InterfaceC1383af) this.f23242OooOo0o).zzm();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.O0000000
    public File zza() {
        return (File) this.f23242OooOo0o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1377a9
    public JSONObject zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1377a9
    public void zzc() {
        C1917oy c1917oy = ((q00) this.f23242OooOo0o).f23472OooOoO0;
        if (c1917oy != null) {
            synchronized (c1917oy) {
                c1917oy.OooOO0o.OooO(NativeCustomFormatAd.ASSET_NAME_VIDEO);
            }
        }
    }

    public p80(int i) {
        this.f23241OooOo0O = i;
        switch (i) {
            case 29:
                this.f23242OooOo0o = new int[2];
                break;
            default:
                this.f23242OooOo0o = Collections.EMPTY_LIST;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1377a9
    /* renamed from: zza */
    public JSONObject mo13702zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.vp0
    /* renamed from: zzb */
    public void mo13705zzb(Object obj) {
        switch (this.f23241OooOo0O) {
            case 11:
                ((C1875nt) this.f23242OooOo0o).f21590OooO0o.OoooOo0(true);
                break;
            case 21:
                ((AbstractC1433bs) obj).OooO00o();
                break;
            default:
                ((jf0) this.f23242OooOo0o).zzi();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1427bm
    /* renamed from: zza */
    public void mo13708zza(Object obj) {
        switch (this.f23241OooOo0O) {
            case 8:
                C1822md c1822md = (C1822md) obj;
                zze.zza("Getting a new session for JS Engine.");
                c1822md.getClass();
                ((C2274yl) ((C2155vd) this.f23242OooOo0o).f13856OooO00o).zzc(new C2303zd(c1822md));
                break;
            case 9:
            case 10:
            case 11:
            default:
                df0 df0Var = (df0) this.f23242OooOo0o;
                ((hf0) obj).OooO0o((ef0) df0Var.f18245OooOo0O, df0Var.f18246OooOo0o);
                break;
            case 12:
                ((InterfaceC2172vu) obj).OooO0oo((com.google.android.gms.ads.internal.client.zze) this.f23242OooOo0o);
                break;
            case 13:
                ((InterfaceC1988qv) obj).OooO00o((zzu) this.f23242OooOo0o);
                break;
            case 14:
                ((InterfaceC1620gw) obj).OooOO0((C2184w5) this.f23242OooOo0o);
                break;
        }
    }

    public /* synthetic */ p80(C2130up c2130up, Context context, String str, zzs zzsVar) {
        this.f23241OooOo0O = 10;
        r31 r31VarOooO00o = r31.OooO00o(context);
        r31 r31VarOooO00o2 = r31.OooO00o(zzsVar);
        r31 r31VarOooO00o3 = r31.OooO00o(str);
        p31 p31VarOooO0O0 = p31.OooO0O0(new o20(c2130up.f24692OooOo, 11));
        p31 p31VarOooO0O02 = p31.OooO0O0(new o20(c2130up.f24736o000000o, 18));
        this.f23242OooOo0o = p31.OooO0O0(new C2171vt(r31VarOooO00o, r31VarOooO00o2, r31VarOooO00o3, p31.OooO0O0(new C1984qr(r31VarOooO00o, c2130up.f24677OooO0OO, c2130up.f24698OooOoOO, p31VarOooO0O0, p31VarOooO0O02, 18)), p31VarOooO0O0, p31VarOooO0O02, c2130up.f24683OooOO0, c2130up.f24699OooOoo, c2130up.f24692OooOo));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public void onAdFailedToShow(String str) {
        try {
            zzo.zzj("Mediated ad failed to show: " + str);
            ((InterfaceC1383af) this.f23242OooOo0o).zzl(str);
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.vp0
    public void zza(Throwable th) {
        switch (this.f23241OooOo0O) {
            case 11:
                ((C1875nt) this.f23242OooOo0o).f21590OooO0o.OoooOo0(false);
                break;
            case 21:
                d70 d70Var = (d70) this.f23242OooOo0o;
                com.google.android.gms.ads.internal.client.zze zzeVarOooOo00 = af0.OooOo00(th, ((C1875nt) ((C2315zp) d70Var.f18187OooO00o).f26303o00000O0.zzb()).OooOO0o);
                d70Var.f18190OooO0Oo.o0OOO0o(zzeVarOooOo00);
                ze0.OooOoo0(zzeVarOooOo00.zza, "DelayedBannerAd.onFailure", th);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.bf0
    public Object zza(Object obj) {
        s50.OooO0OO((SQLiteDatabase) obj, (com.google.android.gms.ads.internal.util.client.zzu) this.f23242OooOo0o);
        return null;
    }

    @Override // com.google.android.gms.internal.ads.kp0
    /* renamed from: zza */
    public o00000oO.OooOOO mo13700zza() {
        String lowerCase;
        Bundle bundle;
        HashMap map;
        Bundle bundle2;
        mn0 mn0VarOooO00o;
        eb0 eb0Var = (eb0) this.f23242OooOo0o;
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OoO0oo)).booleanValue()) {
            lowerCase = eb0Var.f18553OooO0o0.f24955OooO0o.toLowerCase(Locale.ROOT);
        } else {
            lowerCase = eb0Var.f18553OooO0o0.f24955OooO0o;
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17826o000Oo00)).booleanValue()) {
            e30 e30Var = eb0Var.f18555OooO0oo;
            synchronized (e30Var) {
                bundle = new Bundle(e30Var.f18478OooOo0O);
            }
        } else {
            bundle = new Bundle();
        }
        Bundle bundle3 = bundle;
        ArrayList arrayList = new ArrayList();
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17836o000o000)).booleanValue()) {
            Iterator it = ((jn0) eb0Var.f18550OooO0OO.OooO00o(eb0Var.f18556OooOO0, lowerCase).entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                Bundle bundle4 = eb0Var.f18553OooO0o0.f24954OooO0Oo.zzm;
                arrayList.add(eb0Var.OooO00o(str, list, bundle4 != null ? bundle4.getBundle(str) : null, true, true));
            }
            u80 u80Var = eb0Var.f18550OooO0OO;
            synchronized (u80Var) {
                mn0VarOooO00o = TextUtils.isEmpty(zzv.zzp().OooO0Oo().zzg().f21508OooO0o0) ? mn0.f21307OooOoo0 : mn0.OooO00o(u80Var.f24594OooO0O0);
            }
            eb0Var.OooO0O0(arrayList, mn0VarOooO00o);
        } else {
            u80 u80Var2 = eb0Var.f18550OooO0OO;
            String str2 = eb0Var.f18556OooOO0;
            synchronized (u80Var2) {
                try {
                    mn0 mn0VarOooO00o2 = u80Var2.OooO00o(str2, lowerCase);
                    mn0 mn0VarOooO0OO = u80Var2.OooO0OO(lowerCase);
                    map = new HashMap();
                    Iterator it2 = ((jn0) mn0VarOooO00o2.entrySet()).iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it2.next();
                        String str3 = (String) entry2.getKey();
                        if (mn0VarOooO0OO.containsKey(str3)) {
                            x80 x80Var = (x80) mn0VarOooO0OO.get(str3);
                            List list2 = (List) entry2.getValue();
                            boolean z = x80Var.f25561OooO0O0;
                            boolean z2 = x80Var.f25562OooO0OO;
                            boolean z3 = x80Var.f25563OooO0Oo;
                            if (list2 != null && !list2.isEmpty()) {
                                bundle2 = (Bundle) list2.get(0);
                            } else {
                                bundle2 = new Bundle();
                            }
                            map.put(str3, new x80(str3, z, z2, z3, bundle2));
                        }
                    }
                    vn0 vn0VarOooOO0 = mn0VarOooO0OO.entrySet().OooOO0();
                    while (vn0VarOooOO0.hasNext()) {
                        Map.Entry entry3 = (Map.Entry) vn0VarOooOO0.next();
                        String str4 = (String) entry3.getKey();
                        if (!map.containsKey(str4) && ((x80) entry3.getValue()).f25563OooO0Oo) {
                            map.put(str4, (x80) entry3.getValue());
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            eb0Var.OooO0O0(arrayList, map);
        }
        rm0 rm0VarOooOOOO = rm0.OooOOOO(arrayList);
        CallableC2031s0 callableC2031s0 = new CallableC2031s0(9, arrayList, bundle3);
        C2163vl c2163vl = eb0Var.f18548OooO00o;
        pp0 pp0Var = new pp0(rm0VarOooOOOO, true, false);
        pp0Var.f23398Oooo0OO = new op0(pp0Var, callableC2031s0, c2163vl);
        pp0Var.OooOo0o();
        return pp0Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public void onVideoMute() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public void onVideoUnmute() {
    }

    private final void OooO0OO(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1377a9
    public void OooO00o(MotionEvent motionEvent) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1502dp, com.google.android.gms.internal.ads.h90
    /* renamed from: zza */
    public void mo13707zza() {
        switch (this.f23241OooOo0O) {
            case 7:
                ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                OoooOOO.o0oOo0O0 o0ooo0o0 = (OoooOOO.o0oOo0O0) this.f23242OooOo0o;
                long j = o0ooo0o0.f14592OooO00o;
                Long lValueOf = Long.valueOf(jCurrentTimeMillis - j);
                ArrayList arrayList = (ArrayList) o0ooo0o0.f14594OooO0OO;
                arrayList.add(lValueOf);
                zze.zza("LoadNewJavascriptEngine(onEngLoaded) latency is " + String.valueOf(arrayList.get(0)) + " ms.");
                com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new RunnableC1933pd((C2229xd) o0ooo0o0.f14593OooO0O0, (C2192wd) o0ooo0o0.f14595OooO0Oo, (C1822md) o0ooo0o0.f14596OooO0o0, arrayList, j, 0), (long) ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.f17711OooO0O0)).intValue());
                return;
            case 22:
                ((InterfaceC1722jo) this.f23242OooOo0o).zzaa();
                return;
            default:
                synchronized (((id0) this.f23242OooOo0o)) {
                    ((id0) this.f23242OooOo0o).f20026OooOoO0 = null;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1466cp
    public void zza(boolean z, int i, String str, String str2) {
        ((C1776l4) this.f23242OooOo0o).OooO0O0();
    }
}
