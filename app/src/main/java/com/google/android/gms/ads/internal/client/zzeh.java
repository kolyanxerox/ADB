package com.google.android.gms.ads.internal.client;

import Oooo00O.o000000O;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.mediation.NetworkExtras;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzeh {

    /* renamed from: OooO, reason: collision with root package name */
    public String f16025OooO;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public String f16032OooO0oO;

    /* renamed from: OooOO0, reason: collision with root package name */
    public String f16034OooOO0;
    public boolean OooOO0o;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public String f16037OooOOO0;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final HashSet f16026OooO00o = new HashSet();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Bundle f16027OooO0O0 = new Bundle();

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap f16028OooO0OO = new HashMap();

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final HashSet f16029OooO0Oo = new HashSet();

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final Bundle f16031OooO0o0 = new Bundle();

    /* renamed from: OooO0o, reason: collision with root package name */
    public final HashSet f16030OooO0o = new HashSet();

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final ArrayList f16033OooO0oo = new ArrayList();

    /* renamed from: OooOO0O, reason: collision with root package name */
    public int f16035OooOO0O = -1;

    /* renamed from: OooOOO, reason: collision with root package name */
    public int f16036OooOOO = 60000;

    public final void zzA(Bundle bundle) {
        this.f16027OooO0O0.putAll(bundle);
    }

    public final void zzB(String str) {
        this.f16025OooO = str;
    }

    public final void zzC(String str) {
        this.f16034OooOO0 = str;
    }

    @Deprecated
    public final void zzD(boolean z) {
        this.f16035OooOO0O = z ? 1 : 0;
    }

    public final void zzn(String str) {
        this.f16030OooO0o.add(str);
    }

    public final void zzo(Class cls, Bundle bundle) {
        Bundle bundle2 = this.f16027OooO0O0;
        if (bundle2.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            bundle2.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        Bundle bundle3 = bundle2.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        o000000O.OooO0oo(bundle3);
        bundle3.putBundle(cls.getName(), bundle);
    }

    public final void zzp(String str, String str2) {
        this.f16031OooO0o0.putString(str, str2);
    }

    public final void zzq(String str) {
        this.f16026OooO00o.add(str);
    }

    public final void zzr(Class cls, @Nullable Bundle bundle) {
        this.f16027OooO0O0.putBundle(cls.getName(), bundle);
    }

    @Deprecated
    public final void zzs(NetworkExtras networkExtras) {
        this.f16028OooO0OO.put(networkExtras.getClass(), networkExtras);
    }

    public final void zzt(String str) {
        this.f16029OooO0Oo.add(str);
    }

    public final void zzu(String str) {
        this.f16029OooO0Oo.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    public final void zzv(String str) {
        this.f16037OooOOO0 = str;
    }

    public final void zzw(String str) {
        this.f16032OooO0oO = str;
    }

    public final void zzx(int i) {
        this.f16036OooOOO = i;
    }

    @Deprecated
    public final void zzy(boolean z) {
        this.OooOO0o = z;
    }

    public final void zzz(List list) {
        ArrayList arrayList = this.f16033OooO0oo;
        arrayList.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (TextUtils.isEmpty(str)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("neighboring content URL should not be null or empty");
            } else {
                arrayList.add(str);
            }
        }
    }
}
