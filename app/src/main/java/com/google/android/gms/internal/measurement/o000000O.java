package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.C1386ai;
import com.google.android.gms.internal.ads.C2051sk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class o000000O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final C1386ai f26473OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public C2051sk f26474OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Oooo.OooOo00 f26475OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final oo000o f26476OooO0Oo;

    public o000000O() {
        C1386ai c1386ai = new C1386ai(19);
        this.f26473OooO00o = c1386ai;
        this.f26474OooO0O0 = ((C2051sk) c1386ai.f17042OooOo).OooOOOo();
        this.f26475OooO0OO = new Oooo.OooOo00();
        this.f26476OooO0Oo = new oo000o(3);
        final int i = 1;
        Callable callable = new Callable(this) { // from class: com.google.android.gms.internal.measurement.OooO00o

            /* renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ o000000O f26414OooOo0o;

            {
                this.f26414OooOo0o = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i) {
                    case 0:
                        return new o0OOO0OO(this.f26414OooOo0o.f26475OooO0OO);
                    default:
                        return new o0OOO0OO(this.f26414OooOo0o.f26476OooO0Oo);
                }
            }
        };
        oO00Oo0 oo00oo0 = (oO00Oo0) c1386ai.f17045OooOoO;
        ((HashMap) oo00oo0.f26700OooOo0O).put("internal.registerCallback", callable);
        final int i2 = 0;
        ((HashMap) oo00oo0.f26700OooOo0O).put("internal.eventLogger", new Callable(this) { // from class: com.google.android.gms.internal.measurement.OooO00o

            /* renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ o000000O f26414OooOo0o;

            {
                this.f26414OooOo0o = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i2) {
                    case 0:
                        return new o0OOO0OO(this.f26414OooOo0o.f26475OooO0OO);
                    default:
                        return new o0OOO0OO(this.f26414OooOo0o.f26476OooO0Oo);
                }
            }
        });
    }

    public final boolean OooO00o(OooO0O0 oooO0O0) throws o0000O {
        Oooo.OooOo00 oooOo00 = this.f26475OooO0OO;
        try {
            oooOo00.f13712OooOo0o = oooO0O0;
            oooOo00.f13710OooOo = oooO0O0.clone();
            ((ArrayList) oooOo00.f13713OooOoO0).clear();
            ((C2051sk) this.f26473OooO00o.f17046OooOoO0).OooOoO("runtime.counter", new OooOO0O(Double.valueOf(0.0d)));
            this.f26476OooO0Oo.OooO0Oo(this.f26474OooO0O0.OooOOOo(), oooOo00);
            if (((OooO0O0) oooOo00.f13710OooOo).equals((OooO0O0) oooOo00.f13712OooOo0o)) {
                return !((ArrayList) oooOo00.f13713OooOoO0).isEmpty();
            }
            return true;
        } catch (Throwable th) {
            throw new o0000O(th);
        }
    }

    public final void OooO0O0(o0OO000 o0oo000) {
        OooOOO0 oooOOO0;
        try {
            C1386ai c1386ai = this.f26473OooO00o;
            this.f26474OooO0O0 = ((C2051sk) c1386ai.f17042OooOo).OooOOOo();
            if (c1386ai.OooOOOo(this.f26474OooO0O0, (o0OO000o[]) o0oo000.OooOOOo().toArray(new o0OO000o[0])) instanceof OooOO0) {
                throw new IllegalStateException("Program loading failed");
            }
            for (o0O o0o : o0oo000.OooOOo0().OooOOOo()) {
                List listOooOOo0 = o0o.OooOOo0();
                String strOooOOOo = o0o.OooOOOo();
                Iterator it = listOooOOo0.iterator();
                while (it.hasNext()) {
                    Oooo0 oooo0OooOOOo = c1386ai.OooOOOo(this.f26474OooO0O0, (o0OO000o) it.next());
                    if (!(oooo0OooOOOo instanceof OooOo00)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    C2051sk c2051sk = this.f26474OooO0O0;
                    if (c2051sk.OooOo0o(strOooOOOo)) {
                        Oooo0 oooo0OooOoo = c2051sk.OooOoo(strOooOOOo);
                        if (!(oooo0OooOoo instanceof OooOOO0)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strOooOOOo)));
                        }
                        oooOOO0 = (OooOOO0) oooo0OooOoo;
                    } else {
                        oooOOO0 = null;
                    }
                    if (oooOOO0 == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strOooOOOo)));
                    }
                    oooOOO0.OooO00o(this.f26474OooO0O0, Collections.singletonList(oooo0OooOOOo));
                }
            }
        } catch (Throwable th) {
            throw new o0000O(th);
        }
    }
}
