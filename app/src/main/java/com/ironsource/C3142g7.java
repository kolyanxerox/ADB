package com.ironsource;

import com.ironsource.C3350m2;
import com.ironsource.mediationsdk.logger.IronLog;

/* renamed from: com.ironsource.g7 */
/* loaded from: classes2.dex */
class C3142g7 extends C3474o2 {
    public C3142g7(C3350m2 c3350m2, InterfaceC3193hn interfaceC3193hn) {
        super(c3350m2, interfaceC3193hn);
    }

    /* renamed from: n */
    private boolean m8911n() {
        return m11076b().m9975b() > 0;
    }

    /* renamed from: p */
    private boolean m8912p() {
        return m11076b().m9977d() >= 0;
    }

    /* renamed from: l */
    public void m8913l() {
        if (m8915o()) {
            IronLog.INTERNAL.verbose();
            m11082i();
        }
    }

    /* renamed from: m */
    public void m8914m() {
        if (m8915o()) {
            IronLog.INTERNAL.verbose();
            m11082i();
        }
    }

    /* renamed from: o */
    public boolean m8915o() {
        return m11076b().m9974a() == C3350m2.a.MANUAL_WITH_LOAD_ON_SHOW;
    }

    /* renamed from: q */
    public void m8916q() {
        if (m8915o() && m11077d()) {
            IronLog.INTERNAL.verbose();
            m11075a(m11076b().m9976c());
        }
    }

    /* renamed from: r */
    public void m8917r() {
        if (!m8911n()) {
            IronLog.INTERNAL.verbose("banner reload interval is disabled");
        } else if (m8915o() && m8912p()) {
            IronLog.INTERNAL.verbose();
            m11075a(m11076b().m9977d());
        }
    }
}
