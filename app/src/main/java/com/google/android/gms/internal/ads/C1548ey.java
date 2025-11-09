package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.ironsource.C3007ch;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ey */
/* loaded from: classes2.dex */
public final class C1548ey implements vp0, InterfaceC1377a9, InterfaceC1466cp, bf0, InterfaceC2064sx, cf0, tc0, InterfaceC1730jw, im0 {

    /* renamed from: OooOoO0 */
    public static C1548ey f18705OooOoO0;

    /* renamed from: OooOo */
    public Object f18706OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f18707OooOo0O;

    /* renamed from: OooOo0o */
    public Object f18708OooOo0o;

    public C1548ey(int i) {
        this.f18707OooOo0O = i;
        switch (i) {
            case 27:
                break;
            case 28:
            default:
                p80 p80Var = new p80(29);
                this.f18708OooOo0o = p80Var;
                this.f18706OooOo = new rh0(p80Var);
                break;
            case 29:
                this.f18708OooOo0o = new HashMap();
                this.f18706OooOo = new HashMap();
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View$OnTouchListener, com.google.android.gms.internal.ads.w2] */
    @Override // com.google.android.gms.internal.ads.InterfaceC1377a9
    public void OooO00o(MotionEvent motionEvent) {
        ((AbstractBinderC2181w2) this.f18708OooOo0o).onTouch(null, motionEvent);
    }

    public void OooO0O0(bf0 bf0Var) {
        CallableC1736k1 callableC1736k1 = new CallableC1736k1((i50) this.f18708OooOo0o, 5);
        cq0 cq0Var = (cq0) this.f18706OooOo;
        o00000oO.OooOOO oooOOOOooO0O0 = ((C2163vl) cq0Var).OooO0O0(callableC1736k1);
        oooOOOOooO0O0.addListener(new wp0(0, oooOOOOooO0O0, new C1847n1(bf0Var, 22)), cq0Var);
    }

    public void OooO0OO(lu0 lu0Var) throws GeneralSecurityException {
        if (lu0Var == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        nu0 nu0Var = new nu0(lu0Var.f20960OooO00o, lu0Var.f20961OooO0O0);
        HashMap map = (HashMap) this.f18708OooOo0o;
        if (!map.containsKey(nu0Var)) {
            map.put(nu0Var, lu0Var);
            return;
        }
        lu0 lu0Var2 = (lu0) map.get(nu0Var);
        if (!lu0Var2.equals(lu0Var) || !lu0Var.equals(lu0Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(nu0Var.toString()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:225:0x0240, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Received error HTTP response code: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0266, code lost:
    
        throw new com.google.android.gms.internal.ads.a40(1, "Received error HTTP response code: " + r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.f50 OooO0Oo(com.google.android.gms.internal.ads.e50 r22) throws com.google.android.gms.internal.ads.a40 {
        /*
            Method dump skipped, instructions count: 685
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1548ey.OooO0Oo(com.google.android.gms.internal.ads.e50):com.google.android.gms.internal.ads.f50");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2064sx
    public void OooO0o(boolean z, Context context, C2246xu c2246xu) throws C2027rx {
        yd0 yd0Var;
        switch (this.f18707OooOo0O) {
            case 13:
                C2274yl c2274yl = (C2274yl) this.f18706OooOo;
                c70 c70Var = (c70) this.f18708OooOo0o;
                c70Var.getClass();
                try {
                    zzv.zzj();
                    zzn.zza(context, (AdOverlayInfoParcel) c2274yl.get(), true, c70Var.f17947OooO0o0);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                l60 l60Var = (l60) this.f18706OooOo;
                a70 a70Var = (a70) this.f18708OooOo0o;
                a70Var.getClass();
                Object obj = l60Var.f20809OooO0O0;
                try {
                    ((ee0) obj).OooO0O0(z);
                    if (((VersionInfoParcel) a70Var.f16933OooO0Oo).clientJarVersion < ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.f17798o0000oO)).intValue()) {
                        try {
                            ((ee0) obj).f18580OooO00o.OooO0Oo();
                            return;
                        } finally {
                        }
                    } else {
                        try {
                            ((ee0) obj).f18580OooO00o.Ooooo0o(new Oooo0o.OooO0OO(context));
                            return;
                        } finally {
                        }
                    }
                } catch (yd0 e) {
                    zzo.zzi("Cannot show interstitial.");
                    throw new C2027rx(e.getCause());
                }
                zzo.zzi("Cannot show interstitial.");
                throw new C2027rx(e.getCause());
        }
    }

    public synchronized o00000oO.OooOOO OooO0o0(C1548ey c1548ey, sc0 sc0Var, InterfaceC1691iu interfaceC1691iu) {
        C2197wi c2197wi;
        this.f18706OooOo = interfaceC1691iu;
        if (interfaceC1691iu == null || (c2197wi = (C2197wi) c1548ey.f18708OooOo0o) == null) {
            return ((sj0) this.f18708OooOo0o).OooOOO0(c1548ey, sc0Var, interfaceC1691iu);
        }
        C1875nt c1875ntZzb = interfaceC1691iu.zzb();
        return c1875ntZzb.OooO00o(c1875ntZzb.OooO0OO(ii0.OooooOO(c2197wi)));
    }

    public void OooO0oO(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        ((ConcurrentHashMap) this.f18708OooOo0o).put(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.tc0
    public /* bridge */ /* synthetic */ o00000oO.OooOOO OooO0oo(C1548ey c1548ey, sc0 sc0Var) {
        return OooO0o0(c1548ey, sc0Var, null);
    }

    public void OooOO0(kd0 kd0Var) {
        OooO0oO("aai", kd0Var.f20507OooOo0o);
        OooO0oO("request_id", kd0Var.f20546o00Oo0);
        OooO0oO("ad_format", kd0.OooO00o(kd0Var.f20488OooO0O0));
    }

    public void OooOO0O(Object obj, String str) throws IOException {
        boolean zCommit;
        boolean z = obj instanceof String;
        String str2 = (String) this.f18708OooOo0o;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f18706OooOo;
        if (z) {
            zCommit = sharedPreferences.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            zCommit = sharedPreferences.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else if (obj instanceof Boolean) {
            zCommit = sharedPreferences.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        } else {
            if (!(obj instanceof Integer)) {
                Log.e("GpidLifecycleSPHandler", "Unexpected object class " + String.valueOf(obj.getClass()) + " for app " + str2);
                throw new IOException(androidx.datastore.preferences.protobuf.OooO00o.OooOO0o("Failed to store ", str, " for app ", str2));
            }
            zCommit = sharedPreferences.edit().putInt(str, ((Integer) obj).intValue()).commit();
        }
        if (zCommit) {
            return;
        }
        throw new IOException(androidx.datastore.preferences.protobuf.OooO00o.OooOO0o("Failed to store ", str, " for app ", str2));
    }

    public void OooOO0o(String str) throws IOException {
        if (((SharedPreferences) this.f18706OooOo).edit().remove(str).commit()) {
            return;
        }
        StringBuilder sbOooOoO0 = OooO0oO.OooOo.OooOoO0("Failed to remove ", str, " for app ");
        sbOooOoO0.append((String) this.f18708OooOo0o);
        throw new IOException(sbOooOoO0.toString());
    }

    public void OooOOO0() {
        ((h20) this.f18706OooOo).f19526OooO0O0.execute(new g20(this, 0));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1730jw, com.google.android.gms.internal.ads.InterfaceC1770kz
    /* renamed from: zza */
    public void mo13701zza(Object obj) {
        df0 df0Var = (df0) this.f18708OooOo0o;
        ((hf0) obj).OooO00o((ef0) df0Var.f18245OooOo0O, df0Var.f18246OooOo0o, (Throwable) this.f18706OooOo);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.nz, com.google.android.gms.internal.ads.w2] */
    @Override // com.google.android.gms.internal.ads.InterfaceC1377a9
    public JSONObject zzb() {
        return ((AbstractBinderC2181w2) this.f18708OooOo0o).zzp();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View$OnClickListener, com.google.android.gms.internal.ads.nz, com.google.android.gms.internal.ads.w2] */
    @Override // com.google.android.gms.internal.ads.InterfaceC1377a9
    public void zzc() {
        gn0 gn0Var = ViewTreeObserverOnGlobalLayoutListenerC1403az.f17125Oooo0O0;
        ?? r1 = (AbstractBinderC2181w2) this.f18708OooOo0o;
        Map mapZzm = r1.zzm();
        if (mapZzm == null) {
            return;
        }
        int i = gn0Var.f19390OooOoO0;
        int i2 = 0;
        while (i2 < i) {
            Object obj = mapZzm.get((String) gn0Var.get(i2));
            i2++;
            if (obj != null) {
                r1.onClick((ViewGroup) this.f18706OooOo);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.tc0
    public Object zzd() {
        InterfaceC1691iu interfaceC1691iu;
        synchronized (this) {
            interfaceC1691iu = (InterfaceC1691iu) this.f18706OooOo;
        }
        return interfaceC1691iu;
    }

    @Override // com.google.android.gms.internal.ads.vp0
    /* renamed from: zzb */
    public void mo13705zzb(Object obj) {
        Bundle bundle;
        switch (this.f18707OooOo0O) {
            case 1:
                ((C1917oy) this.f18706OooOo).OooOOO0((View) this.f18708OooOo0o, (f60) obj);
                return;
            case 8:
                String str = (String) obj;
                try {
                    C2086ti c2086ti = (C2086ti) this.f18706OooOo;
                    C1827mi c1827mi = (C1827mi) this.f18708OooOo0o;
                    Parcel parcelOooO = c2086ti.OooO();
                    parcelOooO.writeString(str);
                    AbstractC2218x2.OooO0OO(parcelOooO, c1827mi);
                    c2086ti.o000OO0O(parcelOooO, 1);
                    return;
                } catch (RemoteException e) {
                    zze.zzb("Service can't call client", e);
                    return;
                }
            case 9:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                try {
                    boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17849o000oo0O)).booleanValue();
                    InterfaceC2049si interfaceC2049si = (InterfaceC2049si) this.f18706OooOo;
                    if (!zBooleanValue) {
                        interfaceC2049si.o0000Oo0(parcelFileDescriptor);
                        return;
                    }
                    boolean zBooleanValue2 = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o000oo0o)).booleanValue();
                    C2197wi c2197wi = (C2197wi) this.f18708OooOo0o;
                    if (zBooleanValue2 && (bundle = c2197wi.zzm) != null) {
                        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                        bundle.putLong("binder-call-start", System.currentTimeMillis());
                    }
                    interfaceC2049si.o0Oo0oo(parcelFileDescriptor, c2197wi);
                    return;
                } catch (RemoteException e2) {
                    zze.zzb("Service can't call client", e2);
                    return;
                }
            case 15:
                y70 y70Var = (y70) obj;
                synchronized (((OooOOOo.o0ooOOo) this.f18706OooOo)) {
                    ((q70) ((OooOOOo.o0ooOOo) this.f18706OooOo).f13437OooO0oo).OooO0OO(y70Var, (kd0) this.f18708OooOo0o);
                    kd0 kd0VarOooO00o = ((q70) ((OooOOOo.o0ooOOo) this.f18706OooOo).f13437OooO0oo).OooO00o();
                    if (kd0VarOooO00o != null) {
                        ((OooOOOo.o0ooOOo) this.f18706OooOo).OooO0o0(kd0VarOooO00o);
                    }
                }
                return;
            case 20:
                synchronized (((ab1) this.f18706OooOo)) {
                    ab1 ab1Var = (ab1) this.f18706OooOo;
                    ab1Var.f17023OooOoO = null;
                    ((ArrayDeque) ab1Var.f17024OooOoO0).addFirst((kc0) this.f18708OooOo0o);
                    ab1 ab1Var2 = (ab1) this.f18706OooOo;
                    if (ab1Var2.f17021OooOo0O == 1) {
                        ab1Var2.OooO0o0();
                    }
                }
                return;
            case 21:
                ((gf0) ((s20) this.f18706OooOo).f23980OooOoOO).f19334OooO0OO.o0000Ooo(new p80((df0) this.f18708OooOo0o, 27));
                return;
            default:
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.im0
    /* renamed from: zza */
    public zm0 mo13706zza() {
        o0O00O o0o00o = (o0O00O) this.f18706OooOo;
        return new jr0((Context) this.f18708OooOo0o, new nt0(null, o0o00o.f21879OooOo0O, o0o00o.f21880OooOo0o, false, (dx0) o0o00o.f21878OooOo));
    }

    public /* synthetic */ C1548ey(int i, Object obj, Object obj2) {
        this.f18707OooOo0O = i;
        this.f18708OooOo0o = obj;
        this.f18706OooOo = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1548ey(InterfaceViewOnClickListenerC1881nz interfaceViewOnClickListenerC1881nz, ViewGroup viewGroup) {
        this.f18707OooOo0O = 2;
        this.f18708OooOo0o = (AbstractBinderC2181w2) interfaceViewOnClickListenerC1881nz;
        this.f18706OooOo = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.bf0
    public Object zza(Object obj) {
        switch (this.f18707OooOo0O) {
            case 10:
                return OooO0Oo((e50) obj);
            default:
                s50 s50Var = (s50) this.f18708OooOo0o;
                s50Var.getClass();
                ContentValues contentValues = new ContentValues();
                O0O0 o0o0 = (O0O0) this.f18706OooOo;
                contentValues.put("timestamp", Long.valueOf(o0o0.f16768OooO00o));
                contentValues.put("gws_query_id", (String) o0o0.f16770OooO0OO);
                contentValues.put("url", (String) o0o0.f16771OooO0Oo);
                contentValues.put("event_state", Integer.valueOf(o0o0.f16769OooO0O0 - 1));
                ((SQLiteDatabase) obj).insert("offline_buffered_pings", null, contentValues);
                zzv.zzq();
                Context context = s50Var.f24004OooO00o;
                zzbr zzbrVarZzA = zzs.zzA(context);
                if (zzbrVarZzA != null) {
                    try {
                        zzbrVarZzA.zze(new Oooo0o.OooO0OO(context));
                    } catch (RemoteException e) {
                        zze.zzb("Failed to schedule offline ping sender.", e);
                    }
                }
                return null;
        }
    }

    public C1548ey(bi0 bi0Var) {
        this.f18707OooOo0O = 25;
        this.f18706OooOo = bi0Var;
    }

    public C1548ey(sj0 sj0Var) {
        this.f18707OooOo0O = 18;
        this.f18708OooOo0o = sj0Var;
    }

    public /* synthetic */ C1548ey(Object obj, boolean z, Object obj2, int i) {
        this.f18707OooOo0O = i;
        this.f18708OooOo0o = obj2;
        this.f18706OooOo = obj;
    }

    public C1548ey(Context context, int i) {
        this.f18707OooOo0O = i;
        switch (i) {
            case 28:
                o0O00O o0o00o = new o0O00O(5);
                this.f18708OooOo0o = context.getApplicationContext();
                this.f18706OooOo = o0o00o;
                break;
            default:
                this.f18708OooOo0o = context.getPackageName();
                this.f18706OooOo = context.getSharedPreferences("paid_storage_sp", 0);
                break;
        }
    }

    public C1548ey(h20 h20Var) {
        this.f18707OooOo0O = 7;
        this.f18706OooOo = h20Var;
        this.f18708OooOo0o = new ConcurrentHashMap();
    }

    public /* synthetic */ C1548ey(pu0 pu0Var) {
        this.f18707OooOo0O = 29;
        this.f18708OooOo0o = new HashMap(pu0Var.f23428OooO00o);
        this.f18706OooOo = new HashMap(pu0Var.f23429OooO0O0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.nz, com.google.android.gms.internal.ads.w2] */
    @Override // com.google.android.gms.internal.ads.InterfaceC1377a9
    /* renamed from: zza */
    public JSONObject mo13702zza() {
        return ((AbstractBinderC2181w2) this.f18708OooOo0o).zzo();
    }

    @Override // com.google.android.gms.internal.ads.cf0
    /* renamed from: zza */
    public void mo13703zza() {
        switch (this.f18707OooOo0O) {
            case 16:
                C1742k7 c1742k7 = (C1742k7) ((o80) this.f18708OooOo0o).f22360OooO0OO;
                BinderC1705j7 binderC1705j7 = (BinderC1705j7) this.f18706OooOo;
                Parcel parcelOooO = c1742k7.OooO();
                AbstractC2218x2.OooO0o0(parcelOooO, binderC1705j7);
                c1742k7.o000OO0O(parcelOooO, 1);
                break;
            default:
                C1742k7 c1742k72 = (C1742k7) ((InterfaceC1779l7) ((l80) this.f18708OooOo0o).f20827OooO0Oo);
                BinderC1705j7 binderC1705j72 = (BinderC1705j7) this.f18706OooOo;
                Parcel parcelOooO2 = c1742k72.OooO();
                AbstractC2218x2.OooO0o0(parcelOooO2, binderC1705j72);
                c1742k72.o000OO0O(parcelOooO2, 1);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.vp0
    public void zza(Throwable th) {
        switch (this.f18707OooOo0O) {
            case 1:
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00oO0O0)).booleanValue()) {
                    zzv.zzp().OooO0oO("omid native display exp", th);
                    return;
                }
                return;
            case 8:
                try {
                    C2086ti c2086ti = (C2086ti) this.f18706OooOo;
                    zzbb zzbbVarZzb = zzbb.zzb(th);
                    Parcel parcelOooO = c2086ti.OooO();
                    AbstractC2218x2.OooO0OO(parcelOooO, zzbbVarZzb);
                    c2086ti.o000OO0O(parcelOooO, 2);
                    return;
                } catch (RemoteException e) {
                    zze.zzb("Service can't call client", e);
                    return;
                }
            case 9:
                try {
                    ((InterfaceC2049si) this.f18706OooOo).o0000O00(zzbb.zzb(th));
                    return;
                } catch (RemoteException e2) {
                    zze.zzb("Service can't call client", e2);
                    return;
                }
            case 15:
                synchronized (((OooOOOo.o0ooOOo) this.f18706OooOo)) {
                    try {
                        ((q70) ((OooOOOo.o0ooOOo) this.f18706OooOo).f13437OooO0oo).OooO0O0((kd0) this.f18708OooOo0o);
                        kd0 kd0VarOooO00o = ((q70) ((OooOOOo.o0ooOOo) this.f18706OooOo).f13437OooO0oo).OooO00o();
                        if (((kd0) this.f18708OooOo0o).o0ooOOo) {
                            while (kd0VarOooO00o != null) {
                                ((OooOOOo.o0ooOOo) this.f18706OooOo).OooO0o0(kd0VarOooO00o);
                                kd0VarOooO00o = ((q70) ((OooOOOo.o0ooOOo) this.f18706OooOo).f13437OooO0oo).OooO00o();
                            }
                        } else if (kd0VarOooO00o != null) {
                            ((OooOOOo.o0ooOOo) this.f18706OooOo).OooO0o0(kd0VarOooO00o);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 20:
                synchronized (((ab1) this.f18706OooOo)) {
                    ((ab1) this.f18706OooOo).f17023OooOoO = null;
                }
                return;
            case 21:
                ((gf0) ((s20) this.f18706OooOo).f23980OooOoOO).f19334OooO0OO.o0000Ooo(new C1548ey(22, (df0) this.f18708OooOo0o, th));
                return;
            default:
                jf0 jf0Var = (jf0) this.f18706OooOo;
                jf0Var.OooO0Oo(th);
                jf0Var.OooOO0(false);
                ((mf0) this.f18708OooOo0o).OooO00o(jf0Var);
                return;
        }
    }

    private final void OooO(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1466cp
    public void zza(boolean z, int i, String str, String str2) {
        switch (this.f18707OooOo0O) {
            case 3:
                C1696iz c1696iz = (C1696iz) this.f18708OooOo0o;
                c1696iz.getClass();
                HashMap map = new HashMap();
                map.put("messageType", "htmlLoaded");
                map.put(C3007ch.f7763x, (String) ((Map) this.f18706OooOo).get(C3007ch.f7763x));
                c1696iz.f20129OooO0O0.OooO0O0(map);
                break;
            case 4:
                C1844mz c1844mz = (C1844mz) this.f18708OooOo0o;
                c1844mz.getClass();
                HashMap map2 = new HashMap();
                map2.put("messageType", "validatorHtmlLoaded");
                map2.put(C3007ch.f7763x, (String) ((Map) this.f18706OooOo).get(C3007ch.f7763x));
                c1844mz.f21366OooO0O0.OooO0O0(map2);
                break;
            default:
                C2274yl c2274yl = (C2274yl) this.f18706OooOo;
                if (z) {
                    if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17846o000oo)).booleanValue()) {
                        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                        ((Bundle) this.f18708OooOo0o).putLong("rendering-webview-load-html-end", System.currentTimeMillis());
                    }
                    c2274yl.zzc(null);
                    break;
                } else {
                    c2274yl.zzd(new Exception("Ad Web View failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
                    break;
                }
        }
    }
}
