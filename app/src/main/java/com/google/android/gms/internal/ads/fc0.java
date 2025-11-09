package com.google.android.gms.internal.ads;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class fc0 {

    /* renamed from: OooO, reason: collision with root package name */
    public final ud0 f18913OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f18914OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Executor f18915OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final C2130up f18916OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final ec0 f18917OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final VersionInfoParcel f18918OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final tc0 f18919OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final FrameLayout f18920OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final nf0 f18921OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public o00000oO.OooOOO f18922OooOO0;

    public fc0(Context context, Executor executor, C2130up c2130up, tc0 tc0Var, ec0 ec0Var, ud0 ud0Var, VersionInfoParcel versionInfoParcel) {
        this.f18914OooO00o = context;
        this.f18915OooO0O0 = executor;
        this.f18916OooO0OO = c2130up;
        this.f18919OooO0o0 = tc0Var;
        this.f18917OooO0Oo = ec0Var;
        this.f18913OooO = ud0Var;
        this.f18918OooO0o = versionInfoParcel;
        this.f18920OooO0oO = new FrameLayout(context);
        this.f18921OooO0oo = c2130up.OooOoo();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean OooO00o(com.google.android.gms.ads.internal.client.zzm r10, java.lang.String r11, com.google.android.gms.internal.ads.ze0 r12, com.google.android.gms.internal.ads.h90 r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fc0.OooO00o(com.google.android.gms.ads.internal.client.zzm, java.lang.String, com.google.android.gms.internal.ads.ze0, com.google.android.gms.internal.ads.h90):boolean");
    }

    public final synchronized C2204wp OooO0O0(rc0 rc0Var) {
        cc0 cc0Var = (cc0) rc0Var;
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O0ooOO)).booleanValue()) {
            C1765ku c1765ku = new C1765ku();
            c1765ku.f20683OooO0O0 = this.f18914OooO00o;
            c1765ku.f20684OooO0OO = cc0Var.f17993OooO00o;
            C1802lu c1802lu = new C1802lu(c1765ku);
            C1767kw c1767kw = new C1767kw();
            c1767kw.OooOO0o.add(new C2248xw(this.f18917OooO0Oo, this.f18915OooO0O0));
            c1767kw.OooO0Oo(this.f18917OooO0Oo, this.f18915OooO0O0);
            C1804lw c1804lw = new C1804lw(c1767kw);
            C2204wp c2204wp = new C2204wp(this.f18916OooO0OO.f24676OooO0O0, 0);
            c2204wp.f25356OooO0o = c1802lu;
            c2204wp.f25357OooO0o0 = c1804lw;
            return c2204wp;
        }
        ec0 ec0Var = this.f18917OooO0Oo;
        ec0 ec0Var2 = new ec0(ec0Var.f18562OooOo0O);
        ec0Var2.f18567OooOoo = ec0Var;
        C1767kw c1767kw2 = new C1767kw();
        c1767kw2.OooO00o(ec0Var2, this.f18915OooO0O0);
        c1767kw2.f20697OooO0oO.add(new C2248xw(ec0Var2, this.f18915OooO0O0));
        c1767kw2.f20701OooOOO.add(new C2248xw(ec0Var2, this.f18915OooO0O0));
        c1767kw2.f20702OooOOO0.add(new C2248xw(ec0Var2, this.f18915OooO0O0));
        c1767kw2.OooOO0o.add(new C2248xw(ec0Var2, this.f18915OooO0O0));
        c1767kw2.OooO0Oo(ec0Var2, this.f18915OooO0O0);
        c1767kw2.f20703OooOOOO = ec0Var2;
        C1765ku c1765ku2 = new C1765ku();
        c1765ku2.f20683OooO0O0 = this.f18914OooO00o;
        c1765ku2.f20684OooO0OO = cc0Var.f17993OooO00o;
        C1802lu c1802lu2 = new C1802lu(c1765ku2);
        C1804lw c1804lw2 = new C1804lw(c1767kw2);
        C2204wp c2204wp2 = new C2204wp(this.f18916OooO0OO.f24676OooO0O0, 0);
        c2204wp2.f25356OooO0o = c1802lu2;
        c2204wp2.f25357OooO0o0 = c1804lw2;
        return c2204wp2;
    }
}
