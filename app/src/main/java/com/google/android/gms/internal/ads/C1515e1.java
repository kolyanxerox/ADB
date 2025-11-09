package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;

/* renamed from: com.google.android.gms.internal.ads.e1 */
/* loaded from: classes2.dex */
public final class C1515e1 {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final ConditionVariable f18445OooO0OO = new ConditionVariable();

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static volatile ij0 f18446OooO0Oo = null;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static volatile Random f18447OooO0o0 = null;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final C2143v1 f18448OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public volatile Boolean f18449OooO0O0;

    public C1515e1(C2143v1 c2143v1) {
        this.f18448OooO00o = c2143v1;
        c2143v1.f24815OooO0O0.execute(new RunnableC1442c1(this, 1));
    }

    public final void OooO00o(int i, int i2, long j, String str, Exception exc) {
        try {
            f18445OooO0OO.block();
            if (!this.f18449OooO0O0.booleanValue() || f18446OooO0Oo == null) {
                return;
            }
            C1808m c1808mOooOo0o = C1956q.OooOo0o();
            String packageName = this.f18448OooO00o.f24814OooO00o.getPackageName();
            c1808mOooOo0o.OooO0Oo();
            C1956q.OooOo((C1956q) c1808mOooOo0o.f25822OooOo0o, packageName);
            c1808mOooOo0o.OooO0Oo();
            C1956q.OooOoo0((C1956q) c1808mOooOo0o.f25822OooOo0o, j);
            if (str != null) {
                c1808mOooOo0o.OooO0Oo();
                C1956q.OooOoO0((C1956q) c1808mOooOo0o.f25822OooOo0o, str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                String string = stringWriter.toString();
                c1808mOooOo0o.OooO0Oo();
                C1956q.OooOoo((C1956q) c1808mOooOo0o.f25822OooOo0o, string);
                String name = exc.getClass().getName();
                c1808mOooOo0o.OooO0Oo();
                C1956q.OooOoOO((C1956q) c1808mOooOo0o.f25822OooOo0o, name);
            }
            ij0 ij0Var = f18446OooO0Oo;
            byte[] bArrOooO0Oo = ((C1956q) c1808mOooOo0o.OooO0O0()).OooO0Oo();
            ij0Var.getClass();
            o0O0OOO0 o0o0ooo0 = new o0O0OOO0(ij0Var, bArrOooO0Oo);
            o0o0ooo0.f21962OooO0O0 = i;
            if (i2 != -1) {
                o0o0ooo0.f21961OooO00o = i2;
            }
            o0o0ooo0.OooO0Oo();
        } catch (Exception unused) {
        }
    }
}
