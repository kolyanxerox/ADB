package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class o0000O00 {

    /* renamed from: OooO00o */
    public long f21668OooO00o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.google.android.gms.internal.ads.l31] */
    /* JADX WARN: Type inference failed for: r9v7, types: [com.google.android.gms.internal.ads.l31] */
    public long OooO00o(ByteBuffer byteBuffer) {
        C1624h c1624h;
        C1587g c1587g;
        long j = this.f21668OooO00o;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            C1477d c1477d = new C1477d(new C1428bn(byteBufferDuplicate), C1501dn.f18273OooO0OO);
            C1428bn c1428bn = c1477d.f19935OooOo0o;
            ArrayList l31Var = c1477d.f19938OooOoOO;
            if (c1428bn != null && c1477d.f19933OooOo != i31.f19932OooOoo0) {
                l31Var = new l31(l31Var, c1477d);
            }
            Iterator it = l31Var.iterator();
            while (true) {
                c1624h = null;
                if (!it.hasNext()) {
                    c1587g = null;
                    break;
                }
                InterfaceC1513e interfaceC1513e = (InterfaceC1513e) it.next();
                if (interfaceC1513e instanceof C1587g) {
                    c1587g = (C1587g) interfaceC1513e;
                    break;
                }
            }
            C1428bn c1428bn2 = c1587g.f19935OooOo0o;
            ArrayList l31Var2 = c1587g.f19938OooOoOO;
            if (c1428bn2 != null && c1587g.f19933OooOo != i31.f19932OooOoo0) {
                l31Var2 = new l31(l31Var2, c1587g);
            }
            Iterator it2 = l31Var2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                InterfaceC1513e interfaceC1513e2 = (InterfaceC1513e) it2.next();
                if (interfaceC1513e2 instanceof C1624h) {
                    c1624h = (C1624h) interfaceC1513e2;
                    break;
                }
            }
            long j2 = (c1624h.f19492Oooo00o * 1000) / c1624h.f19491Oooo00O;
            this.f21668OooO00o = j2;
            return j2;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
