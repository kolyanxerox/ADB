package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.yn */
/* loaded from: classes2.dex */
public final class C2276yn {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final gn0 f25946OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f25947OooO0O0 = new ArrayList();

    /* renamed from: OooO0OO, reason: collision with root package name */
    public ByteBuffer[] f25948OooO0OO = new ByteBuffer[0];

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f25949OooO0Oo;

    public C2276yn(gn0 gn0Var) {
        this.f25946OooO00o = gn0Var;
        C1759ko c1759ko = C1759ko.f20636OooO0o0;
        this.f25949OooO0Oo = false;
    }

    public final C1759ko OooO00o(C1759ko c1759ko) throws C2277yo {
        if (c1759ko.equals(C1759ko.f20636OooO0o0)) {
            throw new C2277yo(c1759ko);
        }
        int i = 0;
        while (true) {
            gn0 gn0Var = this.f25946OooO00o;
            if (i >= gn0Var.f19390OooOoO0) {
                return c1759ko;
            }
            InterfaceC1723jp interfaceC1723jp = (InterfaceC1723jp) gn0Var.get(i);
            C1759ko c1759koOooO0O0 = interfaceC1723jp.OooO0O0(c1759ko);
            if (interfaceC1723jp.zzg()) {
                af0.OooooO0(!c1759koOooO0O0.equals(C1759ko.f20636OooO0o0));
                c1759ko = c1759koOooO0O0;
            }
            i++;
        }
    }

    public final void OooO0O0() {
        ArrayList arrayList = this.f25947OooO0O0;
        arrayList.clear();
        this.f25949OooO0Oo = false;
        int i = 0;
        while (true) {
            gn0 gn0Var = this.f25946OooO00o;
            if (i >= gn0Var.f19390OooOoO0) {
                break;
            }
            InterfaceC1723jp interfaceC1723jp = (InterfaceC1723jp) gn0Var.get(i);
            interfaceC1723jp.zzc();
            if (interfaceC1723jp.zzg()) {
                arrayList.add(interfaceC1723jp);
            }
            i++;
        }
        this.f25948OooO0OO = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= OooO0o0(); i2++) {
            this.f25948OooO0OO[i2] = ((InterfaceC1723jp) arrayList.get(i2)).zzb();
        }
    }

    public final boolean OooO0OO() {
        return this.f25949OooO0Oo && ((InterfaceC1723jp) this.f25947OooO0O0.get(OooO0o0())).zzh() && !this.f25948OooO0OO[OooO0o0()].hasRemaining();
    }

    public final boolean OooO0Oo() {
        return !this.f25947OooO0O0.isEmpty();
    }

    public final void OooO0o(ByteBuffer byteBuffer) {
        boolean z;
        do {
            int i = 0;
            z = false;
            while (i <= OooO0o0()) {
                if (!this.f25948OooO0OO[i].hasRemaining()) {
                    ArrayList arrayList = this.f25947OooO0O0;
                    InterfaceC1723jp interfaceC1723jp = (InterfaceC1723jp) arrayList.get(i);
                    if (!interfaceC1723jp.zzh()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.f25948OooO0OO[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : InterfaceC1723jp.f20345OooO00o;
                        long jRemaining = byteBuffer2.remaining();
                        interfaceC1723jp.OooO00o(byteBuffer2);
                        this.f25948OooO0OO[i] = interfaceC1723jp.zzb();
                        boolean z2 = true;
                        if (jRemaining - byteBuffer2.remaining() <= 0 && !this.f25948OooO0OO[i].hasRemaining()) {
                            z2 = false;
                        }
                        z |= z2;
                    } else if (!this.f25948OooO0OO[i].hasRemaining() && i < OooO0o0()) {
                        ((InterfaceC1723jp) arrayList.get(i + 1)).zzd();
                    }
                }
                i++;
            }
        } while (z);
    }

    public final int OooO0o0() {
        return this.f25948OooO0OO.length - 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2276yn) {
            C2276yn c2276yn = (C2276yn) obj;
            gn0 gn0Var = this.f25946OooO00o;
            if (gn0Var.f19390OooOoO0 == c2276yn.f25946OooO00o.f19390OooOoO0) {
                for (int i = 0; i < gn0Var.f19390OooOoO0; i++) {
                    if (gn0Var.get(i) == c2276yn.f25946OooO00o.get(i)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f25946OooO00o.hashCode();
    }
}
