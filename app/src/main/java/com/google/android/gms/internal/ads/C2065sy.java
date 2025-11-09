package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzez;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.ironsource.C3034d9;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.sy */
/* loaded from: classes2.dex */
public final class C2065sy {

    /* renamed from: OooO, reason: collision with root package name */
    public InterfaceC1722jo f24178OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public int f24179OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public zzea f24180OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public InterfaceC1523e9 f24181OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public View f24182OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public List f24184OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public zzez f24185OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public Bundle f24186OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public InterfaceC1722jo f24187OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public InterfaceC1722jo f24188OooOO0O;
    public f60 OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public C2274yl f24189OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public o00000oO.OooOOO f24190OooOOO0;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public View f24191OooOOOO;

    /* renamed from: OooOOOo, reason: collision with root package name */
    public View f24192OooOOOo;

    /* renamed from: OooOOo, reason: collision with root package name */
    public double f24193OooOOo;

    /* renamed from: OooOOo0, reason: collision with root package name */
    public Oooo0o.OooO0O0 f24194OooOOo0;

    /* renamed from: OooOOoo, reason: collision with root package name */
    public InterfaceC1707j9 f24195OooOOoo;

    /* renamed from: OooOo, reason: collision with root package name */
    public float f24196OooOo;
    public String OooOo0;

    /* renamed from: OooOo00, reason: collision with root package name */
    public InterfaceC1707j9 f24197OooOo00;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public String f24200OooOoO0;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final SimpleArrayMap f24198OooOo0O = new SimpleArrayMap();

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final SimpleArrayMap f24199OooOo0o = new SimpleArrayMap();

    /* renamed from: OooO0o, reason: collision with root package name */
    public List f24183OooO0o = Collections.EMPTY_LIST;

    public static Object OooO0o(Oooo0o.OooO0O0 oooO0O0) {
        if (oooO0O0 == null) {
            return null;
        }
        return Oooo0o.OooO0OO.o000O0oO(oooO0O0);
    }

    public static C2065sy OooO0o0(BinderC2028ry binderC2028ry, InterfaceC1523e9 interfaceC1523e9, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, Oooo0o.OooO0O0 oooO0O0, String str4, String str5, double d, InterfaceC1707j9 interfaceC1707j9, String str6, float f) {
        C2065sy c2065sy = new C2065sy();
        c2065sy.f24179OooO00o = 6;
        c2065sy.f24180OooO0O0 = binderC2028ry;
        c2065sy.f24181OooO0OO = interfaceC1523e9;
        c2065sy.f24182OooO0Oo = view;
        c2065sy.OooO0Oo("headline", str);
        c2065sy.f24184OooO0o0 = list;
        c2065sy.OooO0Oo(C3034d9.h.f8065E0, str2);
        c2065sy.f24186OooO0oo = bundle;
        c2065sy.OooO0Oo("call_to_action", str3);
        c2065sy.f24191OooOOOO = view2;
        c2065sy.f24194OooOOo0 = oooO0O0;
        c2065sy.OooO0Oo(C3034d9.h.f8088U, str4);
        c2065sy.OooO0Oo("price", str5);
        c2065sy.f24193OooOOo = d;
        c2065sy.f24195OooOOoo = interfaceC1707j9;
        c2065sy.OooO0Oo(C3034d9.h.f8067F0, str6);
        synchronized (c2065sy) {
            c2065sy.f24196OooOo = f;
        }
        return c2065sy;
    }

    public static C2065sy OooOOO(InterfaceC1640hf interfaceC1640hf) {
        BinderC2028ry binderC2028ry;
        InterfaceC1640hf interfaceC1640hf2;
        try {
            zzeb zzebVarZzj = interfaceC1640hf.zzj();
            if (zzebVarZzj == null) {
                interfaceC1640hf2 = interfaceC1640hf;
                binderC2028ry = null;
            } else {
                interfaceC1640hf2 = interfaceC1640hf;
                binderC2028ry = new BinderC2028ry(zzebVarZzj, interfaceC1640hf2);
            }
            return OooO0o0(binderC2028ry, interfaceC1640hf2.zzk(), (View) OooO0o(interfaceC1640hf2.zzm()), interfaceC1640hf2.zzs(), interfaceC1640hf2.zzv(), interfaceC1640hf2.zzq(), interfaceC1640hf2.zzi(), interfaceC1640hf2.zzr(), (View) OooO0o(interfaceC1640hf2.zzn()), interfaceC1640hf2.zzo(), interfaceC1640hf2.zzu(), interfaceC1640hf2.zzt(), interfaceC1640hf2.zze(), interfaceC1640hf2.zzl(), interfaceC1640hf2.zzp(), interfaceC1640hf2.zzf());
        } catch (RemoteException e) {
            zzo.zzk("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public final synchronized zzeb OooO() {
        return this.f24180OooO0O0;
    }

    public final synchronized String OooO00o() {
        return this.OooOo0;
    }

    public final synchronized String OooO0O0() {
        return OooO0OO("headline");
    }

    public final synchronized String OooO0OO(String str) {
        return (String) this.f24199OooOo0o.get(str);
    }

    public final synchronized void OooO0Oo(String str, String str2) {
        if (str2 == null) {
            this.f24199OooOo0o.remove(str);
        } else {
            this.f24199OooOo0o.put(str, str2);
        }
    }

    public final synchronized int OooO0oO() {
        return this.f24179OooO00o;
    }

    public final synchronized Bundle OooO0oo() {
        try {
            if (this.f24186OooO0oo == null) {
                this.f24186OooO0oo = new Bundle();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f24186OooO0oo;
    }

    public final synchronized InterfaceC1523e9 OooOO0() {
        return this.f24181OooO0OO;
    }

    public final InterfaceC1707j9 OooOO0O() {
        List list = this.f24184OooO0o0;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.f24184OooO0o0.get(0);
        if (obj instanceof IBinder) {
            return BinderC2298z8.o000O0O0((IBinder) obj);
        }
        return null;
    }

    public final synchronized InterfaceC1722jo OooOO0o() {
        return this.f24188OooOO0O;
    }

    public final synchronized InterfaceC1722jo OooOOO0() {
        return this.f24178OooO;
    }

    public final synchronized f60 OooOOOO() {
        return this.OooOO0o;
    }

    public final synchronized String OooOOOo() {
        return OooO0OO(C3034d9.h.f8067F0);
    }

    public final synchronized String OooOOo() {
        return OooO0OO("call_to_action");
    }

    public final synchronized String OooOOo0() {
        return OooO0OO(C3034d9.h.f8065E0);
    }
}
