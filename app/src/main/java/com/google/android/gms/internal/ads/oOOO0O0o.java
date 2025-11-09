package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class oOOO0O0o {

    /* renamed from: OooO */
    public final ArrayList f22838OooO;

    /* renamed from: OooO00o */
    public final AtomicInteger f22839OooO00o;

    /* renamed from: OooO0O0 */
    public final HashSet f22840OooO0O0;

    /* renamed from: OooO0OO */
    public final PriorityBlockingQueue f22841OooO0OO;

    /* renamed from: OooO0Oo */
    public final PriorityBlockingQueue f22842OooO0Oo;

    /* renamed from: OooO0o */
    public final C2249xx f22843OooO0o;

    /* renamed from: OooO0o0 */
    public final O0O0 f22844OooO0o0;

    /* renamed from: OooO0oO */
    public final oOO[] f22845OooO0oO;

    /* renamed from: OooO0oo */
    public oOO0OO0O f22846OooO0oo;

    /* renamed from: OooOO0 */
    public final ArrayList f22847OooOO0;

    /* renamed from: OooOO0O */
    public final C1847n1 f22848OooOO0O;

    public oOOO0O0o(O0O0 o0o0, C2249xx c2249xx) {
        C1847n1 c1847n1 = new C1847n1(new Handler(Looper.getMainLooper()));
        this.f22839OooO00o = new AtomicInteger();
        this.f22840OooO0O0 = new HashSet();
        this.f22841OooO0OO = new PriorityBlockingQueue();
        this.f22842OooO0Oo = new PriorityBlockingQueue();
        this.f22838OooO = new ArrayList();
        this.f22847OooOO0 = new ArrayList();
        this.f22844OooO0o0 = o0o0;
        this.f22843OooO0o = c2249xx;
        this.f22845OooO0oO = new oOO[4];
        this.f22848OooOO0O = c1847n1;
    }

    public final void OooO00o(oOOO00o0 oooo00o0) {
        oooo00o0.zzf(this);
        synchronized (this.f22840OooO0O0) {
            this.f22840OooO0O0.add(oooo00o0);
        }
        oooo00o0.zzg(this.f22839OooO00o.incrementAndGet());
        oooo00o0.zzm("add-to-queue");
        OooO0O0();
        this.f22841OooO0OO.add(oooo00o0);
    }

    public final void OooO0O0() {
        synchronized (this.f22847OooOO0) {
            try {
                Iterator it = this.f22847OooOO0.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0OO() {
        oOO0OO0O ooo0oo0o = this.f22846OooO0oo;
        if (ooo0oo0o != null) {
            ooo0oo0o.f22813OooOoO0 = true;
            ooo0oo0o.interrupt();
        }
        oOO[] oooArr = this.f22845OooO0oO;
        for (int i = 0; i < 4; i++) {
            oOO ooo = oooArr[i];
            if (ooo != null) {
                ooo.f22752OooOoO0 = true;
                ooo.interrupt();
            }
        }
        oOO0OO0O ooo0oo0o2 = new oOO0OO0O(this.f22841OooO0OO, this.f22842OooO0Oo, this.f22844OooO0o0, this.f22848OooOO0O);
        this.f22846OooO0oo = ooo0oo0o2;
        ooo0oo0o2.start();
        for (int i2 = 0; i2 < 4; i2++) {
            oOO ooo2 = new oOO(this.f22842OooO0Oo, this.f22843OooO0o, this.f22844OooO0o0, this.f22848OooOO0O);
            this.f22845OooO0oO[i2] = ooo2;
            ooo2.start();
        }
    }
}
