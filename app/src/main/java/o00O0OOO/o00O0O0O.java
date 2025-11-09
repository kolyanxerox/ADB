package o00O0oOo;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public class o00O0O0O extends o00O implements o00000O {

    /* renamed from: OooOo, reason: collision with root package name */
    public final boolean f31539OooOo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O0O(o00O0O00 o00o0o00) {
        super(true);
        boolean z = true;
        Oooo0O0(o00o0o00);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o00O.f31522OooOo0o;
        o000000 o000000Var = (o000000) atomicReferenceFieldUpdater.get(this);
        o000000O o000000o2 = o000000Var instanceof o000000O ? (o000000O) o000000Var : null;
        if (o000000o2 == null) {
            z = false;
            break;
        }
        o00O o00oOooO0oo = o000000o2.OooO0oo();
        while (!o00oOooO0oo.OooOooo()) {
            o000000 o000000Var2 = (o000000) atomicReferenceFieldUpdater.get(o00oOooO0oo);
            o000000O o000000o3 = o000000Var2 instanceof o000000O ? (o000000O) o000000Var2 : null;
            if (o000000o3 == null) {
                z = false;
                break;
            }
            o00oOooO0oo = o000000o3.OooO0oo();
        }
        this.f31539OooOo = z;
    }

    @Override // o00O0oOo.o00O
    public final boolean OooOooo() {
        return this.f31539OooOo;
    }

    @Override // o00O0oOo.o00O
    public final boolean Oooo000() {
        return true;
    }
}
