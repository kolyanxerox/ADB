package com.ironsource;

import com.ironsource.InterfaceC3188hi;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ironsource.vt */
/* loaded from: classes2.dex */
public final class C3781vt implements InterfaceC3188hi, InterfaceC3188hi.a {

    /* renamed from: a */
    private final Map<String, Integer> f12420a = new HashMap();

    /* renamed from: b */
    private final Map<String, Integer> f12421b = new HashMap();

    @Override // com.ironsource.InterfaceC3188hi.a
    /* renamed from: a */
    public void mo9126a(InterfaceC3188hi.b smash) {
        kotlin.jvm.internal.OooOo.OooO0o0(smash, "smash");
        synchronized (this) {
            String strMo9129c = smash.mo9129c();
            if (this.f12420a.containsKey(strMo9129c)) {
                Map<String, Integer> map = this.f12420a;
                Integer num = map.get(strMo9129c);
                kotlin.jvm.internal.OooOo.OooO0O0(num);
                map.put(strMo9129c, Integer.valueOf(num.intValue() + 1));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    @Override // com.ironsource.InterfaceC3188hi
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo9125b(com.ironsource.InterfaceC3188hi.b r3) {
        /*
            r2 = this;
            java.lang.String r0 = "smash"
            kotlin.jvm.internal.OooOo.OooO0o0(r3, r0)
            monitor-enter(r2)
            java.lang.String r0 = r3.mo9129c()     // Catch: java.lang.Throwable -> L29
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r2.f12420a     // Catch: java.lang.Throwable -> L29
            boolean r1 = r1.containsKey(r0)     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L2b
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r2.f12420a     // Catch: java.lang.Throwable -> L29
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L29
            kotlin.jvm.internal.OooOo.OooO0O0(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L29
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L29
            int r3 = r3.mo9128b()     // Catch: java.lang.Throwable -> L29
            if (r0 < r3) goto L2b
            r3 = 1
            goto L2c
        L29:
            r3 = move-exception
            goto L2e
        L2b:
            r3 = 0
        L2c:
            monitor-exit(r2)
            return r3
        L2e:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C3781vt.mo9125b(com.ironsource.hi$b):boolean");
    }

    @Override // com.ironsource.InterfaceC3188hi.a
    /* renamed from: a */
    public void mo9127a(List<? extends InterfaceC3188hi.b> smashes) {
        kotlin.jvm.internal.OooOo.OooO0o0(smashes, "smashes");
        for (InterfaceC3188hi.b bVar : smashes) {
            this.f12420a.put(bVar.mo9129c(), 0);
            this.f12421b.put(bVar.mo9129c(), Integer.valueOf(bVar.mo9128b()));
        }
    }

    @Override // com.ironsource.InterfaceC3188hi
    /* renamed from: a */
    public boolean mo9124a() {
        for (String str : this.f12421b.keySet()) {
            Integer num = this.f12420a.get(str);
            kotlin.jvm.internal.OooOo.OooO0O0(num);
            int iIntValue = num.intValue();
            Integer num2 = this.f12421b.get(str);
            kotlin.jvm.internal.OooOo.OooO0O0(num2);
            if (iIntValue < num2.intValue()) {
                return false;
            }
        }
        return true;
    }
}
