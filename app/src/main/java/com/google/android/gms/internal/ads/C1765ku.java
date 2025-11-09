package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.LinkedHashSet;

/* renamed from: com.google.android.gms.internal.ads.ku */
/* loaded from: classes2.dex */
public final class C1765ku {

    /* renamed from: OooO00o */
    public int f20682OooO00o = 0;

    /* renamed from: OooO0O0 */
    public Object f20683OooO0O0;

    /* renamed from: OooO0OO */
    public Object f20684OooO0OO;

    /* renamed from: OooO0Oo */
    public Object f20685OooO0Oo;

    /* renamed from: OooO0o */
    public Object f20686OooO0o;

    /* renamed from: OooO0o0 */
    public Object f20687OooO0o0;

    /* renamed from: OooO0oO */
    public Object f20688OooO0oO;

    public void OooO00o(o00OOO0.o00000O0 o00000o02, IOException iOException) {
        o00OOO0.OooO00o oooO00o;
        ProxySelector proxySelector;
        if (o00000o02.f32230OooO0O0.type() != Proxy.Type.DIRECT && (proxySelector = (oooO00o = (o00OOO0.OooO00o) this.f20683OooO0O0).f32130OooO0oO) != null) {
            proxySelector.connectFailed(oooO00o.f32124OooO00o.OooOO0O(), o00000o02.f32230OooO0O0.address(), iOException);
        }
        o000Ooo.o00oO0o o00oo0o = (o000Ooo.o00oO0o) this.f20684OooO0OO;
        synchronized (o00oo0o) {
            ((LinkedHashSet) o00oo0o.f30487OooOo0o).add(o00000o02);
        }
    }
}
