package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.zzv;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.nn */
/* loaded from: classes2.dex */
public abstract class AbstractC1869nn {

    /* renamed from: OooOo */
    public final WeakReference f21515OooOo;

    /* renamed from: OooOo0O */
    public final Context f21516OooOo0O;

    /* renamed from: OooOo0o */
    public final String f21517OooOo0o;

    public AbstractC1869nn(InterfaceC1722jo interfaceC1722jo) {
        Context context = interfaceC1722jo.getContext();
        this.f21516OooOo0O = context;
        this.f21517OooOo0o = zzv.zzq().zzc(context, interfaceC1722jo.zzn().afmaVersion);
        this.f21515OooOo = new WeakReference(interfaceC1722jo);
    }

    public static /* bridge */ /* synthetic */ void OooO0oo(AbstractC1869nn abstractC1869nn, HashMap map) {
        InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) abstractC1869nn.f21515OooOo.get();
        if (interfaceC1722jo != null) {
            interfaceC1722jo.OooO0o("onPrecacheEvent", map);
        }
    }

    public void OooO0oO() {
    }

    public abstract void OooOO0();

    public final void OooOO0O(String str, String str2, String str3, String str4) {
        zzf.zza.post(new OoooO0O.o00O0O0((Object) this, (Serializable) str, str2, (Object) str3, (Object) str4, 4));
    }

    public void OooOOO(int i) {
    }

    public void OooOOO0(int i) {
    }

    public void OooOOOO(int i) {
    }

    public void OooOOOo(int i) {
    }

    public boolean OooOOo(String str, String[] strArr) {
        return OooOOo0(str);
    }

    public abstract boolean OooOOo0(String str);

    public boolean OooOOoo(String str, String[] strArr, C1574fn c1574fn) {
        return OooOOo0(str);
    }
}
