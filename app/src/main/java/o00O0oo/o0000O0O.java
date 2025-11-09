package o00O0oo;

import Oooo0o0.OooO;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.OooOo;
import o000O0O0.OooO0O0;
import o00O0.o000OOo;
import o00O0O0o.OooOo00;
import o00O0oOo.o0oOOo;
import o00O0oOo.oo0o0Oo;
import o00O0ooo.o0O000o0;
import o00OO000.o00Ooo;
import o00OO000.oo000o;

/* loaded from: classes3.dex */
public final class o0000O0O implements o0oOOo {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o000O000 f31595OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public Object f31596OooOo0O = o000Oo0.f31644OooOOOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public oo0o0Oo f31597OooOo0o;

    public o0000O0O(o000O000 o000o0002) {
        this.f31595OooOo = o000o0002;
    }

    public final Object OooO00o(o0O000o0 o0o000o0) throws Throwable {
        o000O0O0 o000o0o0OooOOo0;
        Boolean bool;
        Object obj = this.f31596OooOo0O;
        boolean z = true;
        if (obj == o000Oo0.f31644OooOOOo || obj == o000Oo0.OooOO0o) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o000O000.f31618OooOoo0;
            o000O000 o000o0002 = this.f31595OooOo;
            o000O0O0 o000o0o02 = (o000O0O0) atomicReferenceFieldUpdater.get(o000o0002);
            while (true) {
                if (o000o0002.OooOo()) {
                    this.f31596OooOo0O = o000Oo0.OooOO0o;
                    Throwable thOooOOo = o000o0002.OooOOo();
                    if (thOooOOo != null) {
                        int i = oo000o.f31971OooO00o;
                        throw thOooOOo;
                    }
                    z = false;
                } else {
                    long andIncrement = o000O000.f31612OooOo.getAndIncrement(o000o0002);
                    long j = o000Oo0.f31632OooO0O0;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (o000o0o02.f31964OooOo != j2) {
                        o000o0o0OooOOo0 = o000o0002.OooOOo0(j2, o000o0o02);
                        if (o000o0o0OooOOo0 == null) {
                            continue;
                        }
                    } else {
                        o000o0o0OooOOo0 = o000o0o02;
                    }
                    Object objOooo0 = o000o0002.Oooo0(o000o0o0OooOOo0, i2, andIncrement, null);
                    OooO0O0 oooO0O0 = o000Oo0.f31642OooOOO0;
                    if (objOooo0 == oooO0O0) {
                        throw new IllegalStateException("unreachable");
                    }
                    OooO0O0 oooO0O02 = o000Oo0.f31643OooOOOO;
                    if (objOooo0 == oooO0O02) {
                        if (andIncrement < o000o0002.OooOo0()) {
                            o000o0o0OooOOo0.OooO0O0();
                        }
                        o000o0o02 = o000o0o0OooOOo0;
                    } else {
                        if (objOooo0 == o000Oo0.f31641OooOOO) {
                            o000O000 o000o0003 = this.f31595OooOo;
                            oo0o0Oo oo0o0ooOooOOo0 = o00O0oOo.o0000OO0.OooOOo0(OooO.OooOOOO(o0o000o0));
                            try {
                                this.f31597OooOo0o = oo0o0ooOooOOo0;
                                Object objOooo02 = o000o0003.Oooo0(o000o0o0OooOOo0, i2, andIncrement, this);
                                if (objOooo02 == oooO0O0) {
                                    OooO0O0(o000o0o0OooOOo0, i2);
                                } else {
                                    if (objOooo02 == oooO0O02) {
                                        if (andIncrement < o000o0003.OooOo0()) {
                                            o000o0o0OooOOo0.OooO0O0();
                                        }
                                        o000O0O0 o000o0o03 = (o000O0O0) o000O000.f31618OooOoo0.get(o000o0003);
                                        while (true) {
                                            if (o000o0003.OooOo()) {
                                                oo0o0Oo oo0o0oo = this.f31597OooOo0o;
                                                OooOo.OooO0O0(oo0o0oo);
                                                this.f31597OooOo0o = null;
                                                this.f31596OooOo0O = o000Oo0.OooOO0o;
                                                Throwable thOooOOo2 = o000o0002.OooOOo();
                                                if (thOooOOo2 == null) {
                                                    oo0o0oo.resumeWith(Boolean.FALSE);
                                                } else {
                                                    oo0o0oo.resumeWith(o000OOo.OooO0O0(thOooOOo2));
                                                }
                                            } else {
                                                long andIncrement2 = o000O000.f31612OooOo.getAndIncrement(o000o0003);
                                                long j3 = o000Oo0.f31632OooO0O0;
                                                long j4 = andIncrement2 / j3;
                                                int i3 = (int) (andIncrement2 % j3);
                                                if (o000o0o03.f31964OooOo != j4) {
                                                    o000O0O0 o000o0o0OooOOo02 = o000o0003.OooOOo0(j4, o000o0o03);
                                                    if (o000o0o0OooOOo02 != null) {
                                                        o000o0o03 = o000o0o0OooOOo02;
                                                    }
                                                }
                                                Object objOooo03 = o000o0003.Oooo0(o000o0o03, i3, andIncrement2, this);
                                                if (objOooo03 == o000Oo0.f31642OooOOO0) {
                                                    OooO0O0(o000o0o03, i3);
                                                    break;
                                                }
                                                if (objOooo03 == o000Oo0.f31643OooOOOO) {
                                                    if (andIncrement2 < o000o0003.OooOo0()) {
                                                        o000o0o03.OooO0O0();
                                                    }
                                                } else {
                                                    if (objOooo03 == o000Oo0.f31641OooOOO) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    o000o0o03.OooO0O0();
                                                    this.f31596OooOo0O = objOooo03;
                                                    this.f31597OooOo0o = null;
                                                    bool = Boolean.TRUE;
                                                }
                                            }
                                        }
                                    } else {
                                        o000o0o0OooOOo0.OooO0O0();
                                        this.f31596OooOo0O = objOooo02;
                                        this.f31597OooOo0o = null;
                                        bool = Boolean.TRUE;
                                    }
                                    oo0o0ooOooOOo0.OooOoO(bool, null);
                                }
                                Object objOooOOOo = oo0o0ooOooOOo0.OooOOOo();
                                OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
                                return objOooOOOo;
                            } catch (Throwable th) {
                                oo0o0ooOooOOo0.OooOoO0();
                                throw th;
                            }
                        }
                        o000o0o0OooOOo0.OooO0O0();
                        this.f31596OooOo0O = objOooo0;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // o00O0oOo.o0oOOo
    public final void OooO0O0(o00Ooo o00ooo2, int i) {
        oo0o0Oo oo0o0oo = this.f31597OooOo0o;
        if (oo0o0oo != null) {
            oo0o0oo.OooO0O0(o00ooo2, i);
        }
    }
}
