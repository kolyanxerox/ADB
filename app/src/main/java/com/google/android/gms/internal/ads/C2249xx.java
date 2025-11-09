package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.xx */
/* loaded from: classes2.dex */
public class C2249xx implements ooo0Oo0, oo0o0Oo, oO0OO0O, ooooO0O0, O0000000, Oooo00O.OooO0o, Oooo00O.OooO0OO, InterfaceC1390am, vp0, im0 {

    /* renamed from: OooOo */
    public Object f25813OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f25814OooOo0O;

    /* renamed from: OooOo0o */
    public Object f25815OooOo0o;

    public /* synthetic */ C2249xx(int i, Object obj, Object obj2) {
        this.f25814OooOo0O = i;
        this.f25815OooOo0o = obj;
        this.f25813OooOo = obj2;
    }

    @Override // Oooo00O.OooO0o
    public void OooO(OooOooo.o000Oo0 o000oo02) {
        synchronized (((com.google.android.gms.internal.measurement.o0OOO00) this.f25813OooOo).f26562OooOo) {
            ((C1776l4) this.f25815OooOo0o).zzd(new RuntimeException("Connection failed."));
        }
    }

    @Override // com.google.android.gms.internal.ads.oO0OO0O
    public void OooO0O0(r40 r40Var) {
        if (r40Var.OooOo0O() != 0 || (r40Var.OooOo0O() & 128) == 0) {
            return;
        }
        r40Var.OooOO0O(6);
        int iOooOOOO = r40Var.OooOOOO() / 4;
        int i = 0;
        while (true) {
            oO0o0000 oo0o0000 = (oO0o0000) this.f25813OooOo;
            if (i >= iOooOOOO) {
                oo0o0000.f22732OooO0o.remove(0);
                return;
            }
            o000OOo0 o000ooo02 = (o000OOo0) this.f25815OooOo0o;
            r40Var.OooO0o(o000ooo02.f21725OooO0O0, 0, 4);
            o000ooo02.OooOOoo(0);
            int iOooO0o = o000ooo02.OooO0o(16);
            o000ooo02.OooOo0(3);
            if (iOooO0o == 0) {
                o000ooo02.OooOo0(13);
            } else {
                int iOooO0o2 = o000ooo02.OooO0o(13);
                if (oo0o0000.f22732OooO0o.get(iOooO0o2) == null) {
                    oo0o0000.f22732OooO0o.put(iOooO0o2, new oO0Oo0o0(new ab1(oo0o0000, iOooO0o2)));
                }
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:481:0x03aa, code lost:
    
        r0.addAll(r12);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:315:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x01e0 A[PHI: r3
  0x01e0: PHI (r3v6 int) = (r3v5 int), (r3v5 int), (r3v5 int), (r3v28 int) binds: [B:369:0x01ce, B:371:0x01de, B:375:0x01ee, B:404:0x025c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x03f9  */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // com.google.android.gms.internal.ads.ooo0Oo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void OooO0OO(int r20, int r21, OooOOOO.OooO0O0 r22, byte[] r23) throws com.google.android.gms.internal.ads.C2185w6 {
        /*
            Method dump skipped, instructions count: 1069
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2249xx.OooO0OO(int, int, OooOOOO.OooO0O0, byte[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0117 A[EDGE_INSN: B:138:0x0117->B:123:0x0117 BREAK  A[LOOP:1: B:111:0x00e0->B:122:0x0106], SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.oo0o0Oo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.o0OO00O OooO0Oo(com.google.android.gms.internal.ads.o000000 r17, long r18) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2249xx.OooO0Oo(com.google.android.gms.internal.ads.o000000, long):com.google.android.gms.internal.ads.o0OO00O");
    }

    public o00000O OooO0o(Object... objArr) {
        Constructor constructorZza;
        synchronized (((AtomicBoolean) this.f25813OooOo)) {
            if (!((AtomicBoolean) this.f25813OooOo).get()) {
                try {
                    constructorZza = ((o000000O) this.f25815OooOo0o).zza();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f25813OooOo).set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            constructorZza = null;
        }
        if (constructorZza == null) {
            return null;
        }
        try {
            return (o00000O) constructorZza.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }

    public void OooO0oO(long j, r40 r40Var) {
        if (r40Var.OooOOOO() < 9) {
            return;
        }
        int iOooOOo0 = r40Var.OooOOo0();
        int iOooOOo02 = r40Var.OooOOo0();
        int iOooOo0O = r40Var.OooOo0O();
        if (iOooOOo0 == 434 && iOooOOo02 == 1195456820 && iOooOo0O == 3) {
            af0.OooOo0(j, r40Var, (o000O[]) this.f25813OooOo);
        }
    }

    public void OooO0oo(o0000Ooo o0000ooo, oOo00o00 ooo00o00) {
        int i = 0;
        while (true) {
            o000O[] o000oArr = (o000O[]) this.f25813OooOo;
            if (i >= o000oArr.length) {
                return;
            }
            ooo00o00.OooO00o();
            ooo00o00.OooO0O0();
            o000O o000oOooO0oO = o0000ooo.OooO0oO(ooo00o00.f22886OooO0Oo, 3);
            o0OoOo0 o0oooo0 = (o0OoOo0) ((List) this.f25815OooOo0o).get(i);
            String str = o0oooo0.f22222OooOOO0;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            af0.OoooOOo("Invalid closed caption MIME type provided: ".concat(String.valueOf(str)), z);
            jb1 jb1Var = new jb1();
            ooo00o00.OooO0O0();
            jb1Var.f20241OooO00o = ooo00o00.f22887OooO0o0;
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

    @Override // Oooo00O.OooO0OO
    public void OooOO0(Bundle bundle) {
        try {
            ((C2274yl) this.f25815OooOo0o).zzc((C1969qc) ((C1666i4) ((OooOooo.o000OO00) this.f25813OooOo).f13676OooOo0o).getService());
        } catch (DeadObjectException e) {
            ((C2274yl) this.f25815OooOo0o).zzd(e);
        }
    }

    public Set OooOO0O(C1435bu c1435bu) {
        return Collections.singleton(new C2248xw(c1435bu, AbstractC2200wl.f25327OooO0oO));
    }

    public Set OooOO0o(C1435bu c1435bu) {
        return Collections.singleton(new C2248xw(c1435bu, AbstractC2200wl.f25327OooO0oO));
    }

    @Override // Oooo00O.OooO0OO
    public void OooOOO(int i) {
        ((C2274yl) this.f25815OooOo0o).zzd(new RuntimeException(OooO0oO.OooOo.OooO0o(i, "onConnectionSuspended: ")));
    }

    public void OooOOO0(String str) throws JSONException {
        try {
            JSONObject jSONObjectPut = new JSONObject().put(Constants.MESSAGE, str).put("action", (String) this.f25813OooOo);
            InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) this.f25815OooOo0o;
            if (interfaceC1722jo != null) {
                interfaceC1722jo.OooO0o0("onError", jSONObjectPut);
            }
        } catch (JSONException e) {
            zzo.zzh("Error occurred while dispatching error event.", e);
        }
    }

    public void OooOOOO(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            ((InterfaceC1722jo) this.f25815OooOo0o).OooO0o0("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", f).put("rotation", i5));
        } catch (JSONException e) {
            zzo.zzh("Error occurred while obtaining screen information.", e);
        }
    }

    public void OooOOOo(int i, int i2, int i3, int i4) throws JSONException {
        try {
            ((InterfaceC1722jo) this.f25815OooOo0o).OooO0o0("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            zzo.zzh("Error occurred while dispatching size change.", e);
        }
    }

    public void OooOOo0(String str) throws JSONException {
        try {
            ((InterfaceC1722jo) this.f25815OooOo0o).OooO0o0("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            zzo.zzh("Error occurred while dispatching state change.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.vp0
    public void zza(Throwable th) {
        switch (this.f25814OooOo0O) {
            case 21:
                ((InterfaceC1390am) this.f25813OooOo).mo13707zza();
                break;
            default:
                C1689ir c1689ir = (C1689ir) this.f25813OooOo;
                zd0 zd0Var = c1689ir.f20098OooOoo;
                List listOooO00o = c1689ir.OooO00o();
                zd0Var.OooO00o(c1689ir.f20099OooOoo0.OooO0O0(c1689ir.f20095OooOoO, c1689ir.f20097OooOoOO, false, (String) this.f25815OooOo0o, null, listOooO00o));
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.oo0o0Oo
    public void zzb() {
        byte[] bArr = i80.f19998OooO0o;
        int length = bArr.length;
        ((r40) this.f25813OooOo).OooO0oo(0, bArr);
    }

    public /* synthetic */ C2249xx(int i, boolean z) {
        this.f25814OooOo0O = i;
    }

    public C2249xx(Context context) {
        this.f25814OooOo0O = 11;
        this.f25813OooOo = context;
        this.f25815OooOo0o = null;
    }

    @Override // com.google.android.gms.internal.ads.vp0
    /* renamed from: zzb */
    public void mo13705zzb(Object obj) {
        switch (this.f25814OooOo0O) {
            case 21:
                ((InterfaceC1427bm) this.f25815OooOo0o).mo13708zza(obj);
                break;
            default:
                String str = (String) obj;
                C1689ir c1689ir = (C1689ir) this.f25813OooOo;
                zd0 zd0Var = c1689ir.f20098OooOoo;
                List listOooO00o = c1689ir.OooO00o();
                zd0Var.OooO00o(c1689ir.f20099OooOoo0.OooO0O0(c1689ir.f20095OooOoO, c1689ir.f20097OooOoOO, false, (String) this.f25815OooOo0o, str, listOooO00o));
                break;
        }
    }

    public C2249xx(oO0o0000 oo0o0000) {
        this.f25814OooOo0O = 7;
        this.f25813OooOo = oo0o0000;
        this.f25815OooOo0o = new o000OOo0(new byte[4], 4);
    }

    public /* synthetic */ C2249xx(Object obj, boolean z, Object obj2, int i) {
        this.f25814OooOo0O = i;
        this.f25815OooOo0o = obj2;
        this.f25813OooOo = obj;
    }

    public C2249xx(int i) {
        this.f25814OooOo0O = i;
        switch (i) {
            case 5:
                this.f25815OooOo0o = new r40();
                this.f25813OooOo = new oO00OOO();
                break;
            case 17:
                this.f25813OooOo = new HashMap();
                break;
            default:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f25815OooOo0o = byteArrayOutputStream;
                this.f25813OooOo = new DataOutputStream(byteArrayOutputStream);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:288:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0286 A[LOOP:0: B:186:0x000e->B:325:0x0286, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x02a4 A[EDGE_INSN: B:352:0x02a4->B:326:0x02a4 BREAK  A[LOOP:0: B:186:0x000e->B:325:0x0286], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.oOOO00 zza(com.google.android.gms.internal.ads.oOOO00o0 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 731
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2249xx.zza(com.google.android.gms.internal.ads.oOOO00o0):com.google.android.gms.internal.ads.oOOO00");
    }

    public C2249xx(o000000O o000000o2) {
        this.f25814OooOo0O = 1;
        this.f25815OooOo0o = o000000o2;
        this.f25813OooOo = new AtomicBoolean(false);
    }

    public C2249xx(o0O o0o) {
        this.f25814OooOo0O = 9;
        oOo0o00 ooo0o00 = new oOo0o00(0, (byte) 0);
        this.f25815OooOo0o = o0o;
        this.f25813OooOo = ooo0o00;
    }

    public C2249xx(C1669i7 c1669i7) {
        this.f25814OooOo0O = 13;
        this.f25813OooOo = c1669i7;
        this.f25815OooOo0o = new HashMap();
    }

    public /* synthetic */ C2249xx(C2130up c2130up, Context context, String str) {
        this.f25814OooOo0O = 24;
        r31 r31VarOooO00o = r31.OooO00o(context);
        p31 p31Var = c2130up.f24736o000000o;
        y60 y60Var = new y60(r31VarOooO00o, p31Var, c2130up.f24733o00000, 5);
        p31 p31VarOooO0O0 = p31.OooO0O0(new o20(p31Var, 18));
        p31 p31VarOooO0O02 = p31.OooO0O0(wz0.f25477Oooo0oO);
        p31 p31VarOooO0O03 = p31.OooO0O0(new C1504dr(r31VarOooO00o, c2130up.f24677OooO0OO, c2130up.f24698OooOoOO, y60Var, p31VarOooO0O0, p31VarOooO0O02));
        this.f25815OooOo0o = p31.OooO0O0(new d20(p31VarOooO0O03, p31VarOooO0O0, p31VarOooO0O02, 4));
        this.f25813OooOo = p31.OooO0O0(new C1476cz(r31.OooO0O0(str), p31VarOooO0O03, r31VarOooO00o, p31VarOooO0O0, p31VarOooO0O02, c2130up.f24683OooOO0, c2130up.f24699OooOoo, c2130up.f24692OooOo));
    }

    public C2249xx(C2249xx c2249xx) {
        this.f25814OooOo0O = 18;
        View view = (View) c2249xx.f25815OooOo0o;
        this.f25815OooOo0o = view;
        HashMap map = (HashMap) c2249xx.f25813OooOo;
        InterfaceC1499dl interfaceC1499dlOooOOOO = C1386ai.OooOOOO(view.getContext());
        this.f25813OooOo = interfaceC1499dlOooOOOO;
        if (interfaceC1499dlOooOOOO == null || map.isEmpty()) {
            return;
        }
        try {
            interfaceC1499dlOooOOOO.zzg(new C1532ei(new Oooo0o.OooO0OO(view), new Oooo0o.OooO0OO(map)));
        } catch (RemoteException unused) {
            zzo.zzg("Failed to call remote method.");
        }
    }

    public /* synthetic */ C2249xx(h70 h70Var) {
        this.f25814OooOo0O = 6;
        this.f25815OooOo0o = h70Var;
        this.f25813OooOo = new r40();
    }

    public C2249xx(List list) {
        this.f25814OooOo0O = 8;
        this.f25815OooOo0o = list;
        this.f25813OooOo = new o000O[list.size()];
    }

    @Override // com.google.android.gms.internal.ads.im0
    /* renamed from: zza */
    public zm0 mo13706zza() {
        switch (this.f25814OooOo0O) {
            case 22:
                C2313zn c2313zn = (C2313zn) this.f25815OooOo0o;
                c2313zn.getClass();
                zm0 zm0VarMo13706zza = ((im0) this.f25813OooOo).mo13706zza();
                wj0 wj0Var = new wj0(c2313zn, 11);
                return new C2165vn(c2313zn.f26213OooOo0O, zm0VarMo13706zza, c2313zn.f26222Oooo0, c2313zn.f26226Oooo0O0, c2313zn, wj0Var);
            default:
                AtomicInteger atomicInteger = C2313zn.f26210Oooo;
                zm0 zm0VarMo13706zza2 = ((im0) this.f25815OooOo0o).mo13706zza();
                byte[] bArr = (byte[]) this.f25813OooOo;
                return new C2202wn(new mk0(bArr), bArr.length, zm0VarMo13706zza2);
        }
    }

    @Override // com.google.android.gms.internal.ads.O0000000
    public File zza() {
        if (((File) this.f25815OooOo0o) == null) {
            this.f25815OooOo0o = new File(((Context) this.f25813OooOo).getCacheDir(), "volley");
        }
        return (File) this.f25815OooOo0o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1390am, com.google.android.gms.internal.ads.InterfaceC1502dp, com.google.android.gms.internal.ads.h90
    /* renamed from: zza */
    public void mo13707zza() {
        zze.zza("callJs > getEngine: Promise rejected");
        ((C2274yl) this.f25815OooOo0o).zzd(new C1382ae("Unable to obtain a JavascriptEngine."));
        ((C2155vd) this.f25813OooOo).OooOO0o();
    }

    @Override // com.google.android.gms.internal.ads.oO0OO0O
    public void OooO00o(h70 h70Var, o0000Ooo o0000ooo, oOo00o00 ooo00o00) {
    }
}
