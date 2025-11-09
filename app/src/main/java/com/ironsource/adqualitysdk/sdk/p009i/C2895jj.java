package com.ironsource.adqualitysdk.sdk.p009i;

import android.view.View;
import androidx.annotation.MainThread;
import com.ironsource.adqualitysdk.sdk.p009i.C2888jc.AnonymousClass3;
import com.ironsource.adqualitysdk.sdk.p009i.C2888jc.AnonymousClass4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.jj */
/* loaded from: classes2.dex */
public final class C2895jj {

    /* renamed from: ｋ */
    private static C2895jj f7078;

    /* renamed from: ﾒ */
    private List<View> f7082 = new ArrayList();

    /* renamed from: ﾇ */
    private List<InterfaceC2899jn> f7081 = new ArrayList();

    /* renamed from: ﻐ */
    private List<View> f7079 = new ArrayList();

    /* renamed from: ﻛ */
    private InterfaceC2870il f7080 = new InterfaceC2870il() { // from class: com.ironsource.adqualitysdk.sdk.i.jj.5
        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2870il
        /* renamed from: ｋ */
        public final void mo6454() {
            List<View> listM7356 = C2909jx.m7356();
            C2895jj.this.f7079.clear();
            C2895jj.this.f7079.addAll(C2895jj.this.f7082);
            for (int i = 0; i < listM7356.size(); i++) {
                View view = listM7356.get(i);
                C2895jj.this.f7079.remove(view);
                if (!C2895jj.this.f7082.contains(view)) {
                    C2895jj.this.f7082.add(view);
                    C2895jj.this.m7286(view);
                }
            }
            for (int i2 = 0; i2 < C2895jj.this.f7079.size(); i2++) {
                View view2 = (View) C2895jj.this.f7079.get(i2);
                C2895jj.this.f7082.remove(view2);
                C2895jj.this.m7283(view2);
            }
            C2895jj.this.f7079.clear();
        }
    };

    private C2895jj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    /* renamed from: ﾒ */
    public synchronized void m7286(View view) {
        Iterator<InterfaceC2899jn> it = this.f7081.iterator();
        while (it.hasNext()) {
            it.next().mo4905(view);
        }
    }

    /* renamed from: ﻛ */
    public static synchronized C2895jj m7281() {
        try {
            if (f7078 == null) {
                f7078 = new C2895jj();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f7078;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    /* renamed from: ｋ */
    public synchronized void m7283(View view) {
        Iterator<InterfaceC2899jn> it = this.f7081.iterator();
        while (it.hasNext()) {
            it.next().mo4903(view);
        }
    }

    /* renamed from: ﾇ */
    public final void m7288(InterfaceC2899jn interfaceC2899jn) {
        synchronized (this) {
            try {
                this.f7081.remove(interfaceC2899jn);
                if (this.f7081.size() == 0) {
                    C2926s.m7591(C2888jc.m7212().new AnonymousClass3(this.f7080));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ﻛ */
    public final void m7287(final InterfaceC2899jn interfaceC2899jn) {
        synchronized (this) {
            this.f7081.add(interfaceC2899jn);
        }
        C2926s.m7591(C2888jc.m7212().new AnonymousClass4(this.f7080));
        C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.jj.4
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                Iterator it = C2895jj.this.f7082.iterator();
                while (it.hasNext()) {
                    interfaceC2899jn.mo4905((View) it.next());
                }
            }
        });
    }
}
