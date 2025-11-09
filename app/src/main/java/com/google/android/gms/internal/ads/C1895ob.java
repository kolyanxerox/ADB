package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.ob */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1895ob implements InterfaceC2042sb {

    /* renamed from: OooOo, reason: collision with root package name */
    public final Object f22950OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f22951OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final Object f22952OooOo0o;

    public /* synthetic */ C1895ob(int i, Object obj, Object obj2) {
        this.f22951OooOo0O = i;
        this.f22952OooOo0o = obj;
        this.f22950OooOo = obj2;
    }

    public void OooO00o(String str, InterfaceC1380ac interfaceC1380ac) {
        synchronized (this.f22952OooOo0o) {
            ((HashMap) this.f22950OooOo).put(str, interfaceC1380ac);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0258  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2042sb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0o0(java.lang.Object r9, java.util.Map r10) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1895ob.OooO0o0(java.lang.Object, java.util.Map):void");
    }

    public C1895ob() {
        this.f22951OooOo0O = 2;
        this.f22952OooOo0o = new Object();
        this.f22950OooOo = new HashMap();
    }

    public /* synthetic */ C1895ob(C1475cy c1475cy, View view) {
        this.f22951OooOo0O = 3;
        this.f22952OooOo0o = new WeakReference(c1475cy);
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0o0OO0)).booleanValue()) {
            this.f22950OooOo = new WeakReference(view);
        } else {
            this.f22950OooOo = new WeakReference(null);
        }
    }
}
