package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class oOOo0000 {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final boolean f22852OooO0OO = oOOo0O00.f22855OooO00o;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f22853OooO00o = new ArrayList();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public boolean f22854OooO0O0 = false;

    public final synchronized void OooO00o(long j, String str) {
        if (this.f22854OooO0O0) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f22853OooO00o.add(new oOOOOo0O(str, j, SystemClock.elapsedRealtime()));
    }

    public final synchronized void OooO0O0(String str) {
        long j;
        this.f22854OooO0O0 = true;
        int i = 0;
        if (this.f22853OooO00o.size() == 0) {
            j = 0;
        } else {
            j = ((oOOOOo0O) this.f22853OooO00o.get(r0.size() - 1)).f22851OooO0OO - ((oOOOOo0O) this.f22853OooO00o.get(0)).f22851OooO0OO;
        }
        if (j > 0) {
            long j2 = ((oOOOOo0O) this.f22853OooO00o.get(0)).f22851OooO0OO;
            oOOo0O00.OooO00o("(%-4d ms) %s", Long.valueOf(j), str);
            ArrayList arrayList = this.f22853OooO00o;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                oOOOOo0O oooooo0o = (oOOOOo0O) obj;
                long j3 = oooooo0o.f22851OooO0OO;
                oOOo0O00.OooO00o("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(oooooo0o.f22850OooO0O0), oooooo0o.f22849OooO00o);
                j2 = j3;
            }
        }
    }

    public final void finalize() {
        if (this.f22854OooO0O0) {
            return;
        }
        OooO0O0("Request on the loose");
        oOOo0O00.OooO0O0("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
