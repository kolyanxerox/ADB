package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class o00O0O00 implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final oo0o0O0 f27058OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final OooO0oO.OooOOO f27059OooOo0o;

    public o00O0O00(oo0o0O0 oo0o0o0, OooO0oO.OooOOO oooOOO) {
        this.f27058OooOo0O = oo0o0o0;
        this.f27059OooOo0o = oooOOO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r5 = this;
            com.google.android.gms.internal.play_billing.oo0o0O0 r0 = r5.f27058OooOo0O
            boolean r1 = r0 instanceof com.google.android.gms.internal.play_billing.o00OOO00
            OooO0oO.OooOOO r2 = r5.f27059OooOo0o
            if (r1 == 0) goto L24
            r1 = r0
            com.google.android.gms.internal.play_billing.o00OOO00 r1 = (com.google.android.gms.internal.play_billing.o00OOO00) r1
            com.google.android.gms.internal.play_billing.o00O00O r1 = (com.google.android.gms.internal.play_billing.o00O00O) r1
            boolean r3 = r1 instanceof com.google.android.gms.internal.play_billing.o00oOoo
            if (r3 == 0) goto L1c
            java.lang.Object r1 = r1.f27054OooOo0O
            boolean r3 = r1 instanceof com.google.android.gms.internal.play_billing.o000OO00
            if (r3 == 0) goto L1c
            com.google.android.gms.internal.play_billing.o000OO00 r1 = (com.google.android.gms.internal.play_billing.o000OO00) r1
            java.lang.Throwable r1 = r1.f27024OooO00o
            goto L1d
        L1c:
            r1 = 0
        L1d:
            if (r1 != 0) goto L20
            goto L24
        L20:
            r2.OooO00o(r1)
            return
        L24:
            boolean r1 = r0.isDone()     // Catch: java.lang.Throwable -> L3b java.util.concurrent.ExecutionException -> L3d
            java.lang.String r3 = "Future was expected to be done: %s"
            if (r1 == 0) goto L7d
            r1 = 0
        L2d:
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L6f java.lang.InterruptedException -> L7b
            if (r1 == 0) goto L3f
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L3b java.util.concurrent.ExecutionException -> L3d
            r1.interrupt()     // Catch: java.lang.Throwable -> L3b java.util.concurrent.ExecutionException -> L3d
            goto L3f
        L3b:
            r0 = move-exception
            goto L8b
        L3d:
            r0 = move-exception
            goto L8f
        L3f:
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r1 = r0.intValue()
            if (r1 <= 0) goto L67
            int r0 = r0.intValue()
            java.lang.Object r1 = r2.f13277OooOoO0
            com.android.billingclient.api.OooOOOO r1 = (com.android.billingclient.api.OooOOOO) r1
            int r3 = r2.f13275OooOo0O
            r1.getClass()
            java.lang.String r4 = "Billing override value was set by a license tester."
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.OooOo00.OooO00o(r0, r4)
            r4 = 105(0x69, float:1.47E-43)
            r1.Oooo0o(r4, r3, r0)
            java.lang.Object r1 = r2.f13276OooOo0o
            java.util.function.Consumer r1 = (java.util.function.Consumer) r1
            r1.accept(r0)
            goto L6e
        L67:
            java.lang.Object r0 = r2.f13274OooOo
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
        L6e:
            return
        L6f:
            r0 = move-exception
            if (r1 != 0) goto L73
            goto L7a
        L73:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L3b java.util.concurrent.ExecutionException -> L3d
            r1.interrupt()     // Catch: java.lang.Throwable -> L3b java.util.concurrent.ExecutionException -> L3d
        L7a:
            throw r0     // Catch: java.lang.Throwable -> L3b java.util.concurrent.ExecutionException -> L3d
        L7b:
            r1 = 1
            goto L2d
        L7d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3b java.util.concurrent.ExecutionException -> L3d
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L3b java.util.concurrent.ExecutionException -> L3d
            java.lang.String r0 = com.google.android.gms.internal.play_billing.o0O000Oo.OooO0o(r3, r0)     // Catch: java.lang.Throwable -> L3b java.util.concurrent.ExecutionException -> L3d
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L3b java.util.concurrent.ExecutionException -> L3d
            throw r1     // Catch: java.lang.Throwable -> L3b java.util.concurrent.ExecutionException -> L3d
        L8b:
            r2.OooO00o(r0)
            return
        L8f:
            java.lang.Throwable r0 = r0.getCause()
            r2.OooO00o(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.o00O0O00.run():void");
    }

    public final String toString() {
        Oooo.OooOo00 oooOo00 = new Oooo.OooOo00(o00O0O00.class.getSimpleName(), 16);
        OooOOOO oooOOOO = new OooOOOO();
        ((OooOOOO) oooOo00.f13713OooOoO0).f26958OooO0O0 = oooOOOO;
        oooOo00.f13713OooOoO0 = oooOOOO;
        oooOOOO.f26957OooO00o = this.f27059OooOo0o;
        return oooOo00.toString();
    }
}
