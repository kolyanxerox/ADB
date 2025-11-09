package OoooOOO;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class oO0Oo0oo implements Runnable {

    /* renamed from: OooOo */
    public final /* synthetic */ oO0O0OoO f14753OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f14754OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ AtomicReference f14755OooOo0o;

    public /* synthetic */ oO0Oo0oo(oO0O0OoO oo0o0ooo, AtomicReference atomicReference, int i, boolean z) {
        this.f14754OooOo0O = i;
        this.f14753OooOo = oo0o0ooo;
        this.f14755OooOo0o = atomicReference;
    }

    private final void OooO00o() {
        AtomicReference atomicReference = this.f14755OooOo0o;
        synchronized (atomicReference) {
            try {
                try {
                    o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14753OooOo.f14574OooOo0O;
                    atomicReference.set(Double.valueOf(o0oo0oo0.f14519OooOoO0.OooOo00(o0oo0oo0.OooOOo().OooOOo0(), o0O000O.f14277OooooOO)));
                } finally {
                    this.f14755OooOo0o.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.f14754OooOo0O) {
            case 0:
                AtomicReference atomicReference = this.f14755OooOo0o;
                synchronized (atomicReference) {
                    try {
                        try {
                            o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14753OooOo.f14574OooOo0O;
                            atomicReference.set(Boolean.valueOf(o0oo0oo0.f14519OooOoO0.OooOo0(o0oo0oo0.OooOOo().OooOOo0(), o0O000O.f14273OoooOoo)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference2 = this.f14755OooOo0o;
                synchronized (atomicReference2) {
                    try {
                        try {
                            o0OO0oO0 o0oo0oo02 = (o0OO0oO0) this.f14753OooOo.f14574OooOo0O;
                            atomicReference2.set(o0oo0oo02.f14519OooOoO0.OooOOo0(o0oo0oo02.OooOOo().OooOOo0(), o0O000O.f14274Ooooo00));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 2:
                AtomicReference atomicReference3 = this.f14755OooOo0o;
                synchronized (atomicReference3) {
                    try {
                        try {
                            o0OO0oO0 o0oo0oo03 = (o0OO0oO0) this.f14753OooOo.f14574OooOo0O;
                            atomicReference3.set(Long.valueOf(o0oo0oo03.f14519OooOoO0.OooOOo(o0oo0oo03.OooOOo().OooOOo0(), o0O000O.f14275Ooooo0o)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 3:
                AtomicReference atomicReference4 = this.f14755OooOo0o;
                synchronized (atomicReference4) {
                    try {
                        try {
                            o0OO0oO0 o0oo0oo04 = (o0OO0oO0) this.f14753OooOo.f14574OooOo0O;
                            atomicReference4.set(Integer.valueOf(o0oo0oo04.f14519OooOoO0.OooOOoo(o0oo0oo04.OooOOo().OooOOo0(), o0O000O.f14276OooooO0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 4:
                OooO00o();
                return;
            case 5:
                oO0O0OoO oo0o0ooo = this.f14753OooOo;
                o0O o0o = ((o0OO0oO0) oo0o0ooo.f14574OooOo0O).f14518OooOoO;
                o0OO0oO0.OooOO0O(o0o);
                Bundle bundleOooO0o0 = o0o.f14192Oooo0.OooO0o0();
                oOo000o0 ooo000o0OooOOOo = ((o0OO0oO0) oo0o0ooo.f14574OooOo0O).OooOOOo();
                ooo000o0OooOOOo.OooOO0O();
                ooo000o0OooOOOo.OooOO0o();
                ooo000o0OooOOOo.OooOoO0(new o0OOOO0o(ooo000o0OooOOOo, this.f14755OooOo0o, ooo000o0OooOOOo.OooOoOO(false), bundleOooO0o0, 6));
                return;
            default:
                oOo000o0 ooo000o0OooOOOo2 = ((o0OO0oO0) this.f14753OooOo.f14574OooOo0O).OooOOOo();
                oO0OO00 oo0oo00OooO0o0 = oO0OO00.OooO0o0(oO00OOOo.SGTM_CLIENT);
                ooo000o0OooOOOo2.OooOO0O();
                ooo000o0OooOOOo2.OooOO0o();
                ooo000o0OooOOOo2.OooOoO0(new o0OOOO0o(ooo000o0OooOOOo2, this.f14755OooOo0o, ooo000o0OooOOOo2.OooOoOO(false), oo0oo00OooO0o0));
                return;
        }
    }

    public oO0Oo0oo(oO0O0OoO oo0o0ooo, AtomicReference atomicReference, int i) {
        this.f14754OooOo0O = i;
        switch (i) {
            case 1:
                this.f14755OooOo0o = atomicReference;
                Objects.requireNonNull(oo0o0ooo);
                this.f14753OooOo = oo0o0ooo;
                break;
            case 2:
                this.f14755OooOo0o = atomicReference;
                Objects.requireNonNull(oo0o0ooo);
                this.f14753OooOo = oo0o0ooo;
                break;
            case 3:
                this.f14755OooOo0o = atomicReference;
                Objects.requireNonNull(oo0o0ooo);
                this.f14753OooOo = oo0o0ooo;
                break;
            case 4:
                this.f14755OooOo0o = atomicReference;
                Objects.requireNonNull(oo0o0ooo);
                this.f14753OooOo = oo0o0ooo;
                break;
            default:
                this.f14755OooOo0o = atomicReference;
                Objects.requireNonNull(oo0o0ooo);
                this.f14753OooOo = oo0o0ooo;
                break;
        }
    }
}
