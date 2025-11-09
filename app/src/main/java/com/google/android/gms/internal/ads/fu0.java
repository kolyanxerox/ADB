package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class fu0 {

    /* renamed from: OooO0O0 */
    public static final fu0 f19127OooO0O0;

    /* renamed from: OooO00o */
    public final AtomicReference f19128OooO00o = new AtomicReference(new yu0(new C2051sk(17)));

    static {
        try {
            fu0 fu0Var = new fu0();
            fu0Var.OooO0o(new qt0(ut0.class, new xs0(18)));
            f19127OooO0O0 = fu0Var;
        } catch (Exception e) {
            throw new OooOOO0.OooO00o(e);
        }
    }

    public final ii0 OooO00o(su0 su0Var) throws GeneralSecurityException {
        yu0 yu0Var = (yu0) this.f19128OooO00o.get();
        yu0Var.getClass();
        wu0 wu0Var = new wu0(su0.class, su0Var.f24164OooO0O0);
        HashMap map = yu0Var.f26028OooO0O0;
        if (map.containsKey(wu0Var)) {
            return ((ot0) map.get(wu0Var)).f23116OooO0O0.OooO0o0(su0Var);
        }
        throw new GeneralSecurityException(OooO0oO.OooOo.OooOO0O("No Key Parser for requested key type ", wu0Var.toString(), " available"));
    }

    public final yq0 OooO0O0(tu0 tu0Var) throws GeneralSecurityException {
        yu0 yu0Var = (yu0) this.f19128OooO00o.get();
        yu0Var.getClass();
        wu0 wu0Var = new wu0(tu0.class, tu0Var.f24509OooO00o);
        HashMap map = yu0Var.f26030OooO0Oo;
        if (map.containsKey(wu0Var)) {
            return ((hu0) map.get(wu0Var)).f19867OooO0O0.OooO00o(tu0Var);
        }
        throw new GeneralSecurityException(OooO0oO.OooOo.OooOO0O("No Parameters Parser for requested key type ", wu0Var.toString(), " available"));
    }

    public final vu0 OooO0OO(ii0 ii0Var) throws GeneralSecurityException {
        yu0 yu0Var = (yu0) this.f19128OooO00o.get();
        yu0Var.getClass();
        xu0 xu0Var = new xu0(ii0Var.getClass(), su0.class);
        HashMap map = yu0Var.f26027OooO00o;
        if (map.containsKey(xu0Var)) {
            return ((qt0) map.get(xu0Var)).f23699OooO0O0.OooO0OO(ii0Var);
        }
        throw new GeneralSecurityException(OooO0oO.OooOo.OooOO0O("No Key serializer for ", xu0Var.toString(), " available"));
    }

    public final vu0 OooO0Oo(yq0 yq0Var) throws GeneralSecurityException {
        yu0 yu0Var = (yu0) this.f19128OooO00o.get();
        yu0Var.getClass();
        xu0 xu0Var = new xu0(yq0Var.getClass(), tu0.class);
        HashMap map = yu0Var.f26029OooO0OO;
        if (map.containsKey(xu0Var)) {
            return ((ju0) map.get(xu0Var)).f20394OooO0O0.OooO0O0(yq0Var);
        }
        throw new GeneralSecurityException(OooO0oO.OooOo.OooOO0O("No Key Format serializer for ", xu0Var.toString(), " available"));
    }

    public final synchronized void OooO0o(qt0 qt0Var) {
        C2051sk c2051sk = new C2051sk((yu0) this.f19128OooO00o.get());
        c2051sk.OooOOOO(qt0Var);
        this.f19128OooO00o.set(new yu0(c2051sk));
    }

    public final synchronized void OooO0o0(ot0 ot0Var) {
        C2051sk c2051sk = new C2051sk((yu0) this.f19128OooO00o.get());
        c2051sk.OooOO0(ot0Var);
        this.f19128OooO00o.set(new yu0(c2051sk));
    }

    public final synchronized void OooO0oO(hu0 hu0Var) {
        C2051sk c2051sk = new C2051sk((yu0) this.f19128OooO00o.get());
        c2051sk.OooOOo(hu0Var);
        this.f19128OooO00o.set(new yu0(c2051sk));
    }

    public final synchronized void OooO0oo(ju0 ju0Var) {
        C2051sk c2051sk = new C2051sk((yu0) this.f19128OooO00o.get());
        c2051sk.OooOo0O(ju0Var);
        this.f19128OooO00o.set(new yu0(c2051sk));
    }
}
