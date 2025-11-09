package com.applovin.impl;

import android.os.Handler;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.applovin.impl.a1 */
/* loaded from: classes.dex */
public final class C0954a1 {

    /* renamed from: a */
    private final C1240o f170a;

    /* renamed from: b */
    private final Handler f171b;

    /* renamed from: c */
    private final Set f172c = new HashSet();

    /* renamed from: d */
    private final AtomicInteger f173d = new AtomicInteger();

    /* renamed from: com.applovin.impl.a1$b */
    public interface b {
        /* renamed from: a */
        void mo83a();

        /* renamed from: b */
        boolean mo84b();
    }

    /* renamed from: com.applovin.impl.a1$c */
    public static class c {

        /* renamed from: a */
        private final String f174a;

        /* renamed from: b */
        private final b f175b;

        /* renamed from: c */
        private final long f176c;

        public /* synthetic */ c(String str, long j, b bVar, a aVar) {
            this(str, j, bVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            String str = this.f174a;
            String str2 = ((c) obj).f174a;
            return str != null ? str.equalsIgnoreCase(str2) : str2 == null;
        }

        public int hashCode() {
            String str = this.f174a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "CountdownProxy{identifier='" + this.f174a + "', countdownStepMillis=" + this.f176c + '}';
        }

        private c(String str, long j, b bVar) {
            this.f174a = str;
            this.f176c = j;
            this.f175b = bVar;
        }

        /* renamed from: a */
        public b m85a() {
            return this.f175b;
        }

        /* renamed from: b */
        public long m87b() {
            return this.f176c;
        }

        /* renamed from: c */
        public String m90c() {
            return this.f174a;
        }
    }

    public C0954a1(Handler handler, C1220k c1220k) {
        if (handler == null) {
            throw new IllegalArgumentException("No handler specified.");
        }
        if (c1220k == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f171b = handler;
        this.f170a = c1220k.m2847O();
    }

    /* renamed from: a */
    public void m79a() {
        if (C1240o.m3200a()) {
            this.f170a.m3211a("CountdownManager", "Removing all countdowns...");
        }
        m82c();
        this.f172c.clear();
    }

    /* renamed from: b */
    public void m81b() {
        HashSet hashSet = new HashSet(this.f172c);
        if (C1240o.m3200a()) {
            this.f170a.m3211a("CountdownManager", "Starting " + hashSet.size() + " countdowns...");
        }
        int iIncrementAndGet = this.f173d.incrementAndGet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (C1240o.m3200a()) {
                this.f170a.m3211a("CountdownManager", "Starting countdown: " + cVar.m90c() + " for generation " + iIncrementAndGet + "...");
            }
            m77a(cVar, iIncrementAndGet);
        }
    }

    /* renamed from: c */
    public void m82c() {
        if (C1240o.m3200a()) {
            this.f170a.m3211a("CountdownManager", "Stopping countdowns...");
        }
        this.f173d.incrementAndGet();
        this.f171b.removeCallbacksAndMessages(null);
    }

    /* renamed from: a */
    public void m80a(String str, long j, b bVar) {
        if (j > 0) {
            if (this.f171b != null) {
                if (C1240o.m3200a()) {
                    androidx.datastore.preferences.protobuf.OooO00o.OooOoO0("Adding countdown: ", str, this.f170a, "CountdownManager");
                }
                this.f172c.add(new c(str, j, bVar));
                return;
            }
            throw new IllegalArgumentException("No handler specified.");
        }
        throw new IllegalArgumentException("Invalid step specified.");
    }

    /* renamed from: b */
    public /* synthetic */ void m78b(c cVar, int i) {
        b bVarM85a = cVar.m85a();
        if (bVarM85a.mo84b()) {
            if (this.f173d.get() == i) {
                try {
                    bVarM85a.mo83a();
                    m77a(cVar, i);
                    return;
                } catch (Throwable th) {
                    if (C1240o.m3200a()) {
                        this.f170a.m3212a("CountdownManager", "Encountered error on countdown step for: " + cVar.m90c(), th);
                    }
                    m79a();
                    return;
                }
            }
            if (C1240o.m3200a()) {
                this.f170a.m3218k("CountdownManager", "Killing duplicate countdown from previous generation: " + cVar.m90c());
                return;
            }
            return;
        }
        if (C1240o.m3200a()) {
            androidx.datastore.preferences.protobuf.OooO00o.OooOoo(new StringBuilder("Ending countdown for "), cVar.m90c(), this.f170a, "CountdownManager");
        }
    }

    /* renamed from: a */
    private void m77a(c cVar, int i) {
        this.f171b.postDelayed(new OooO00o(i, this, 0, cVar), cVar.m87b());
    }
}
