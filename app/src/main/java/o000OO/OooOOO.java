package o000OO;

import com.google.android.gms.internal.ads.C1386ai;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import o0000OOo.o00O000o;
import o0000OoO.o00OOO0O;

/* loaded from: classes2.dex */
public final class OooOOO {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final OooOOO f30166OooO0O0 = new OooOOO();

    /* renamed from: OooO00o, reason: collision with root package name */
    public final AtomicReference f30167OooO00o = new AtomicReference(new oo000o(new C1386ai(22)));

    public final o00000oo.OooOo00 OooO00o(o0OoOo0 o0oooo0) {
        AtomicReference atomicReference = this.f30167OooO00o;
        oo000o oo000oVar = (oo000o) atomicReference.get();
        oo000oVar.getClass();
        o00OOO0O o00ooo0o = (o00OOO0O) o0oooo0.f30188OooOoO0;
        if (!oo000oVar.f30192OooO0O0.containsKey(new o00Oo0(o0OoOo0.class, o00ooo0o))) {
            try {
                o0000O0.OooO00o oooO00o = new o0000O0.OooO00o();
                ((o00O000o) o0oooo0.f30189OooOoOO).ordinal();
                return oooO00o;
            } catch (GeneralSecurityException e) {
                throw new OooOOO0.OooO00o("Creating a LegacyProtoKey failed", e);
            }
        }
        oo000o oo000oVar2 = (oo000o) atomicReference.get();
        oo000oVar2.getClass();
        o00Oo0 o00oo0 = new o00Oo0(o0OoOo0.class, o00ooo0o);
        HashMap map = oo000oVar2.f30192OooO0O0;
        if (map.containsKey(o00oo0)) {
            return ((OooO00o) map.get(o00oo0)).f30159OooO0O0.OooO0Oo(o0oooo0);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + o00oo0 + " available");
    }

    public final synchronized void OooO0O0(OooO00o oooO00o) {
        C1386ai c1386ai = new C1386ai((oo000o) this.f30167OooO00o.get());
        c1386ai.OooOO0O(oooO00o);
        this.f30167OooO00o.set(new oo000o(c1386ai));
    }

    public final synchronized void OooO0OO(OooO0OO oooO0OO) {
        C1386ai c1386ai = new C1386ai((oo000o) this.f30167OooO00o.get());
        c1386ai.OooOO0o(oooO0OO);
        this.f30167OooO00o.set(new oo000o(c1386ai));
    }

    public final synchronized void OooO0Oo(OooOOOO oooOOOO) {
        C1386ai c1386ai = new C1386ai((oo000o) this.f30167OooO00o.get());
        c1386ai.OooOOO0(oooOOOO);
        this.f30167OooO00o.set(new oo000o(c1386ai));
    }

    public final synchronized void OooO0o0(OooOo00 oooOo00) {
        C1386ai c1386ai = new C1386ai((oo000o) this.f30167OooO00o.get());
        c1386ai.OooOOO(oooOo00);
        this.f30167OooO00o.set(new oo000o(c1386ai));
    }
}
