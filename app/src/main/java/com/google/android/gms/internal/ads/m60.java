package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class m60 {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final ArrayList f21094OooO0O0 = new ArrayList(50);

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Handler f21095OooO00o;

    public m60(Handler handler) {
        this.f21095OooO00o = handler;
    }

    public static /* bridge */ /* synthetic */ void OooO0Oo(q50 q50Var) {
        ArrayList arrayList = f21094OooO0O0;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(q50Var);
            }
        }
    }

    public static q50 OooO0o0() {
        q50 q50Var;
        ArrayList arrayList = f21094OooO0O0;
        synchronized (arrayList) {
            try {
                q50Var = arrayList.isEmpty() ? new q50() : (q50) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return q50Var;
    }

    public final q50 OooO00o(int i, Object obj) {
        q50 q50VarOooO0o0 = OooO0o0();
        q50VarOooO0o0.f23511OooO00o = this.f21095OooO00o.obtainMessage(i, obj);
        return q50VarOooO0o0;
    }

    public final boolean OooO0O0(Runnable runnable) {
        return this.f21095OooO00o.post(runnable);
    }

    public final boolean OooO0OO(int i) {
        return this.f21095OooO00o.sendEmptyMessage(i);
    }
}
